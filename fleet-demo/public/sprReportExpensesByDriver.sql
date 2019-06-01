CREATE DEFINER=`root`@`%` PROCEDURE `sprReportExpensesByDriver`(In DriverName VARCHAR(100), In ReportFor VARCHAR(20))
BEGIN
	DECLARE PivotQuery VARCHAR(10000);
    
    DECLARE mont  INT;
    
    SELECT MONTH(str_to_date(Date,'%m-%d-%Y')) INTO mont FROM dev_01_magizhunthu.`Account Summary - OLA`
    WHERE 
		`Driver name` = DriverName
        AND YEAR(str_to_date(Date,'%m-%d-%Y')) = 2018
	GROUP BY
		MONTH(str_to_date(Date,'%m-%d-%Y'))
	ORDER BY
		COUNT(1) DESC LIMIT 1;
    
    SELECT
	  CONCAT('SELECT
			`Driver name`,`Date`,MONTHNAME(`Date`) `Month`,',  ReportFor) INTO @PivotQuery;
            
    SET @PivotQuery =
	CONCAT(@PivotQuery, ' FROM ','
		(
		SELECT
			`Driver name`
			,`Date`
			,CarNumber
			,(`Cash collected by driver` +  Penalty) - (`DriverEarnings` + `FuelExpense`) CollectionAmount
			, ( (`Cash collected by driver` +  Penalty) - (`DriverEarnings` + `FuelExpense`) ) -  AdvanceCollected - SetteledAmount AS PendingSettlement
            ,DriverEarnings
            ,FuelExpense
            ,Penalty
            ,SetteledAmount
            ,AdvanceCollected
			,TotalTripKMs
			,OperatorBill
			,TollParking
			,Incentives
			,NetEarnings    
		FROM
			(
			SELECT 
				`Driver name`
				,str_to_date(Date,''%m-%d-%Y'') `Date`
				,`Car number` CarNumber
				,`Bookings Completed`
				,`Cash collected by driver`
				,ROUND((`Operator Bill` + `Incentives`) * 0.30) AS `DriverEarnings`
				,coalesce(nullif(`Penalty`,''''), 0) AS Penalty
				,coalesce(nullif(`Fuel Expense`,''''), 0)  AS FuelExpense
				,coalesce(nullif(`Advance Collection`,''''), 0) AS AdvanceCollected
				,coalesce(nullif(`Setteled amount`,''''), 0) AS SetteledAmount
                ,coalesce(nullif(`Total Trip KMs`,''''), 0) AS TotalTripKMs
                ,coalesce(nullif(`Operator Bill`,''''), 0) AS OperatorBill
				,coalesce(nullif(`Toll/ Parking`,''''), 0) AS TollParking
				,coalesce(nullif(`Incentives`,''''), 0) AS Incentives
				,coalesce(nullif(`Net Earnings`,''''), 0) AS NetEarnings    
			FROM 
				dev_01_magizhunthu.`Account Summary - OLA`
			)T
		)P
	WHERE
		`Driver name` = ''', DriverName ,'''
        AND Month(`Date`) = ', mont , '
        AND YEAR(`Date`) = 2018');
	
   # SELECT @PivotQuery;
    
    PREPARE statement FROM @PivotQuery;
	EXECUTE statement;
	DEALLOCATE PREPARE statement;
END