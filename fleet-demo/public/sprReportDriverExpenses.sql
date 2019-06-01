CREATE DEFINER=`root`@`%` PROCEDURE `sprReportDriverExpenses`(In DriverName VARCHAR(100), In ReportFor VARCHAR(20))
BEGIN
	DECLARE PivotQuery VARCHAR(10000);
    
    SELECT
	  CONCAT('SELECT
			`Driver name`
			,MonthOfYear ,',
	  GROUP_CONCAT(
		CONCAT(
		  'coalesce(SUM(IF(DayOfMonth = ', id ,',', ReportFor ,' , NULL)), 0) AS ' , ReportFor ,'Day', id
		)
	  ) ) INTO @PivotQuery
	FROM
		NoOfDays t WHERE id < 11;
        
	SELECT
	  CONCAT(@PivotQuery, ',',
	  GROUP_CONCAT(
		CONCAT(
		  'coalesce(SUM(IF(DayOfMonth = ', id ,',', ReportFor ,' , NULL)), 0) AS ' , ReportFor ,'Day', id
		)
	  ) ) INTO @PivotQuery
	FROM
		NoOfDays t WHERE id >= 11 && id <= 20;
        
	SELECT
	  CONCAT(@PivotQuery, ',',
	  GROUP_CONCAT(
		CONCAT(
		  'coalesce(SUM(IF(DayOfMonth = ', id ,',', ReportFor ,' , NULL)), 0) AS ' , ReportFor ,'Day', id
		)
	  ) ) INTO @PivotQuery
	FROM
		NoOfDays t WHERE id > 20;

	#SELECT @PivotQuery;

    SET @PivotQuery =
	CONCAT(@PivotQuery, ' FROM ','
		(
		SELECT
			`Driver name`
			,dayofmonth(`Date`) DayOfMonth
			,concat(monthname(`Date`) , ''-'' , year(Date)) MonthOfYear
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
	GROUP BY
		MonthOfYear');
	
    #SELECT @PivotQuery;
    
    PREPARE statement FROM @PivotQuery;
	EXECUTE statement;
	DEALLOCATE PREPARE statement;
END