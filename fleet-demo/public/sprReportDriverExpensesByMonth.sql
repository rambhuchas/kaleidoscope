CREATE DEFINER=`root`@`%` PROCEDURE `sprReportDriverExpensesByMonth`(In DriverName VARCHAR(100))
BEGIN
	DECLARE PivotQuery VARCHAR(10000);
    
    SELECT
		`Month`
        ,AmountType
        ,SUM(CollectionAmount) Amount
	FROM
    (
		SELECT
			`Date`
			, MONTHNAME(`Date`) `Month`
			,(`Cash collected by driver` +  Penalty) - (`DriverEarnings` + `FuelExpense`) CollectionAmount
			,'CollectionAmount' as AmountType
		FROM
			(
			SELECT 
				`Driver name`
				,str_to_date(Date,'%m-%d-%Y') `Date`
				,`Car number` CarNumber
				,`Bookings Completed`
				,`Cash collected by driver`
				,ROUND((`Operator Bill` + `Incentives`) * 0.30) AS `DriverEarnings`
				,coalesce(nullif(`Penalty`,''), 0) AS Penalty
				,coalesce(nullif(`Fuel Expense`,''), 0)  AS FuelExpense
				,coalesce(nullif(`Advance Collection`,''), 0) AS AdvanceCollected
				,coalesce(nullif(`Setteled amount`,''), 0) AS SetteledAmount
				,coalesce(nullif(`Total Trip KMs`,''), 0) AS TotalTripKMs
				,coalesce(nullif(`Operator Bill`,''), 0) AS OperatorBill
				,coalesce(nullif(`Toll/ Parking`,''), 0) AS TollParking
				,coalesce(nullif(`Incentives`,''), 0) AS Incentives
				,coalesce(nullif(`Net Earnings`,''), 0) AS NetEarnings    
			FROM 
				dev_01_magizhunthu.`Account Summary - OLA`
			)T
		WHERE
			`Driver name` = DriverName
			AND Month(`Date`) = 4
			AND YEAR(`Date`) = 2018
		UNION ALL
		SELECT
			`Date`
			, MONTHNAME(`Date`) `Month`
			, ( (`Cash collected by driver` +  Penalty) - (`DriverEarnings` + `FuelExpense`) ) -  AdvanceCollected - SetteledAmount AS PendingSettlement
			 ,'PendingSettlement' as Amount
		FROM
			(
			SELECT 
				`Driver name`
				,str_to_date(Date,'%m-%d-%Y') `Date`
				,`Car number` CarNumber
				,`Bookings Completed`
				,`Cash collected by driver`
				,ROUND((`Operator Bill` + `Incentives`) * 0.30) AS `DriverEarnings`
				,coalesce(nullif(`Penalty`,''), 0) AS Penalty
				,coalesce(nullif(`Fuel Expense`,''), 0)  AS FuelExpense
				,coalesce(nullif(`Advance Collection`,''), 0) AS AdvanceCollected
				,coalesce(nullif(`Setteled amount`,''), 0) AS SetteledAmount
				,coalesce(nullif(`Total Trip KMs`,''), 0) AS TotalTripKMs
				,coalesce(nullif(`Operator Bill`,''), 0) AS OperatorBill
				,coalesce(nullif(`Toll/ Parking`,''), 0) AS TollParking
				,coalesce(nullif(`Incentives`,''), 0) AS Incentives
				,coalesce(nullif(`Net Earnings`,''), 0) AS NetEarnings    
			FROM 
				dev_01_magizhunthu.`Account Summary - OLA`
			)T
		WHERE
			`Driver name` = DriverName
			AND Month(`Date`) = 4
			AND YEAR(`Date`) = 2018		
		UNION ALL
		SELECT
			`Date`
			, MONTHNAME(`Date`) `Month`
			,DriverEarnings
			 ,'DriverEarnings' as Amount
		FROM
			(
			SELECT 
				`Driver name`
				,str_to_date(Date,'%m-%d-%Y') `Date`
				,`Car number` CarNumber
				,`Bookings Completed`
				,`Cash collected by driver`
				,ROUND((`Operator Bill` + `Incentives`) * 0.30) AS `DriverEarnings`
				,coalesce(nullif(`Penalty`,''), 0) AS Penalty
				,coalesce(nullif(`Fuel Expense`,''), 0)  AS FuelExpense
				,coalesce(nullif(`Advance Collection`,''), 0) AS AdvanceCollected
				,coalesce(nullif(`Setteled amount`,''), 0) AS SetteledAmount
				,coalesce(nullif(`Total Trip KMs`,''), 0) AS TotalTripKMs
				,coalesce(nullif(`Operator Bill`,''), 0) AS OperatorBill
				,coalesce(nullif(`Toll/ Parking`,''), 0) AS TollParking
				,coalesce(nullif(`Incentives`,''), 0) AS Incentives
				,coalesce(nullif(`Net Earnings`,''), 0) AS NetEarnings    
			FROM 
				dev_01_magizhunthu.`Account Summary - OLA`
			)T
		WHERE
			`Driver name` = DriverName
			AND Month(`Date`) = 4
			AND YEAR(`Date`) = 2018
		UNION ALL
		SELECT
			`Date`
			, MONTHNAME(`Date`) `Month`
			,FuelExpense
			 ,'FuelExpense' as Amount
		FROM
			(
			SELECT 
				`Driver name`
				,str_to_date(Date,'%m-%d-%Y') `Date`
				,`Car number` CarNumber
				,`Bookings Completed`
				,`Cash collected by driver`
				,ROUND((`Operator Bill` + `Incentives`) * 0.30) AS `DriverEarnings`
				,coalesce(nullif(`Penalty`,''), 0) AS Penalty
				,coalesce(nullif(`Fuel Expense`,''), 0)  AS FuelExpense
				,coalesce(nullif(`Advance Collection`,''), 0) AS AdvanceCollected
				,coalesce(nullif(`Setteled amount`,''), 0) AS SetteledAmount
				,coalesce(nullif(`Total Trip KMs`,''), 0) AS TotalTripKMs
				,coalesce(nullif(`Operator Bill`,''), 0) AS OperatorBill
				,coalesce(nullif(`Toll/ Parking`,''), 0) AS TollParking
				,coalesce(nullif(`Incentives`,''), 0) AS Incentives
				,coalesce(nullif(`Net Earnings`,''), 0) AS NetEarnings    
			FROM 
				dev_01_magizhunthu.`Account Summary - OLA`
			)T
		WHERE
			`Driver name` = DriverName
			AND Month(`Date`) = 4
			AND YEAR(`Date`) = 2018    
		UNION ALL
		SELECT
			`Date`
			, MONTHNAME(`Date`) `Month`
			,SetteledAmount
			 ,'SetteledAmount' as Amount
		FROM
			(
			SELECT 
				`Driver name`
				,str_to_date(Date,'%m-%d-%Y') `Date`
				,`Car number` CarNumber
				,`Bookings Completed`
				,`Cash collected by driver`
				,ROUND((`Operator Bill` + `Incentives`) * 0.30) AS `DriverEarnings`
				,coalesce(nullif(`Penalty`,''), 0) AS Penalty
				,coalesce(nullif(`Fuel Expense`,''), 0)  AS FuelExpense
				,coalesce(nullif(`Advance Collection`,''), 0) AS AdvanceCollected
				,coalesce(nullif(`Setteled amount`,''), 0) AS SetteledAmount
				,coalesce(nullif(`Total Trip KMs`,''), 0) AS TotalTripKMs
				,coalesce(nullif(`Operator Bill`,''), 0) AS OperatorBill
				,coalesce(nullif(`Toll/ Parking`,''), 0) AS TollParking
				,coalesce(nullif(`Incentives`,''), 0) AS Incentives
				,coalesce(nullif(`Net Earnings`,''), 0) AS NetEarnings    
			FROM 
				dev_01_magizhunthu.`Account Summary - OLA`
			)T
		WHERE
			`Driver name` = DriverName
			AND Month(`Date`) = 4
			AND YEAR(`Date`) = 2018       
		UNION ALL
		SELECT
			`Date`
			, MONTHNAME(`Date`) `Month`
			,AdvanceCollected
			 ,'AdvanceCollected' as Amount
		FROM
			(
			SELECT 
				`Driver name`
				,str_to_date(Date,'%m-%d-%Y') `Date`
				,`Car number` CarNumber
				,`Bookings Completed`
				,`Cash collected by driver`
				,ROUND((`Operator Bill` + `Incentives`) * 0.30) AS `DriverEarnings`
				,coalesce(nullif(`Penalty`,''), 0) AS Penalty
				,coalesce(nullif(`Fuel Expense`,''), 0)  AS FuelExpense
				,coalesce(nullif(`Advance Collection`,''), 0) AS AdvanceCollected
				,coalesce(nullif(`Setteled amount`,''), 0) AS SetteledAmount
				,coalesce(nullif(`Total Trip KMs`,''), 0) AS TotalTripKMs
				,coalesce(nullif(`Operator Bill`,''), 0) AS OperatorBill
				,coalesce(nullif(`Toll/ Parking`,''), 0) AS TollParking
				,coalesce(nullif(`Incentives`,''), 0) AS Incentives
				,coalesce(nullif(`Net Earnings`,''), 0) AS NetEarnings    
			FROM 
				dev_01_magizhunthu.`Account Summary - OLA`
			)T
		WHERE
			`Driver name` = DriverName
			AND Month(`Date`) = 4
			AND YEAR(`Date`) = 2018       
		UNION ALL
		SELECT
			`Date`
			, MONTHNAME(`Date`) `Month`
			,Incentives
			 ,'Incentives' as Amount
		FROM
			(
			SELECT 
				`Driver name`
				,str_to_date(Date,'%m-%d-%Y') `Date`
				,`Car number` CarNumber
				,`Bookings Completed`
				,`Cash collected by driver`
				,ROUND((`Operator Bill` + `Incentives`) * 0.30) AS `DriverEarnings`
				,coalesce(nullif(`Penalty`,''), 0) AS Penalty
				,coalesce(nullif(`Fuel Expense`,''), 0)  AS FuelExpense
				,coalesce(nullif(`Advance Collection`,''), 0) AS AdvanceCollected
				,coalesce(nullif(`Setteled amount`,''), 0) AS SetteledAmount
				,coalesce(nullif(`Total Trip KMs`,''), 0) AS TotalTripKMs
				,coalesce(nullif(`Operator Bill`,''), 0) AS OperatorBill
				,coalesce(nullif(`Toll/ Parking`,''), 0) AS TollParking
				,coalesce(nullif(`Incentives`,''), 0) AS Incentives
				,coalesce(nullif(`Net Earnings`,''), 0) AS NetEarnings    
			FROM 
				dev_01_magizhunthu.`Account Summary - OLA`
			)T
		WHERE
			`Driver name` = DriverName
			AND Month(`Date`) = 4
			AND YEAR(`Date`) = 2018       
		UNION ALL
		SELECT
			`Date`
			, MONTHNAME(`Date`) `Month`
			,NetEarnings    
			 ,'NetEarnings' as Amount
		FROM
			(
			SELECT 
				`Driver name`
				,str_to_date(Date,'%m-%d-%Y') `Date`
				,`Car number` CarNumber
				,`Bookings Completed`
				,`Cash collected by driver`
				,ROUND((`Operator Bill` + `Incentives`) * 0.30) AS `DriverEarnings`
				,coalesce(nullif(`Penalty`,''), 0) AS Penalty
				,coalesce(nullif(`Fuel Expense`,''), 0)  AS FuelExpense
				,coalesce(nullif(`Advance Collection`,''), 0) AS AdvanceCollected
				,coalesce(nullif(`Setteled amount`,''), 0) AS SetteledAmount
				,coalesce(nullif(`Total Trip KMs`,''), 0) AS TotalTripKMs
				,coalesce(nullif(`Operator Bill`,''), 0) AS OperatorBill
				,coalesce(nullif(`Toll/ Parking`,''), 0) AS TollParking
				,coalesce(nullif(`Incentives`,''), 0) AS Incentives
				,coalesce(nullif(`Net Earnings`,''), 0) AS NetEarnings    
			FROM 
				dev_01_magizhunthu.`Account Summary - OLA`
			)T        
		WHERE
			`Driver name` = DriverName
			AND Month(`Date`) = 4
			AND YEAR(`Date`) = 2018
	) PP
    GROUP BY
		`Month`
        ,Amount;
END