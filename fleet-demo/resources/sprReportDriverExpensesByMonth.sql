DELIMITER $$
CREATE DEFINER=`root`@`%` PROCEDURE `sprReportDriverExpensesByMonth`(IN `DriverName` VARCHAR(100))
BEGIN
	DECLARE mont  INT;

    SELECT MONTH(str_to_date(Date,'%m-%d-%Y')) INTO mont FROM dev_01_magizhunthu.`Account Summary - OLA`
    WHERE
		`Driver name` = DriverName
        AND YEAR(str_to_date(Date,'%m-%d-%Y')) = 2019
	GROUP BY
		MONTH(str_to_date(Date,'%m-%d-%Y'))
	ORDER BY
		COUNT(1) DESC LIMIT 1;

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
			AND Month(`Date`) = mont
			AND YEAR(`Date`) = 2019
		UNION ALL
		SELECT
			`Date`
			, MONTHNAME(`Date`) `Month`
			,`PaidByOlaMoney` CollectionAmount
			,'PaidByOlaMoney' as AmountType
		FROM
			(
			SELECT
				`Driver name`
				,str_to_date(Date,'%m-%d-%Y') `Date`
				,`Car number` CarNumber
				,`Bookings Completed`
				,`Cash collected by driver`
				,`PaidByOlaMoney`
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
			AND Month(`Date`) = mont
			AND YEAR(`Date`) = 2019
		UNION ALL
		SELECT
			`Date`
			, MONTHNAME(`Date`) `Month`
			,(`Cash collected by driver` + `PaidByOlaMoney` - `OperatorBill` - `TollParking`) CollectionAmount
			,'OLAFees' as AmountType
		FROM
			(
			SELECT
				`Driver name`
				,str_to_date(Date,'%m-%d-%Y') `Date`
				,`Car number` CarNumber
				,`Bookings Completed`
				,`Cash collected by driver`
				,ROUND((`Operator Bill` + `Incentives`) * 0.30) AS `DriverEarnings`
				,coalesce(nullif(`PaidByOlaMoney`,''), 0) AS PaidByOlaMoney
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
			AND Month(`Date`) = mont
			AND YEAR(`Date`) = 2019
		UNION ALL
		SELECT
			`Date`
			, MONTHNAME(`Date`) `Month`
			,`TollParking`
			,'TollParking' as AmountType
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
			AND Month(`Date`) = mont
			AND YEAR(`Date`) = 2019
		UNION ALL
		SELECT
			`Date`
			, MONTHNAME(`Date`) `Month`
			,`OperatorBill` AS CollectionAmount
			,'OperatorBill' as AmountType
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
			AND Month(`Date`) = mont
			AND YEAR(`Date`) = 2019
		UNION ALL
		SELECT
			`Date`
			, MONTHNAME(`Date`) `Month`
			,`Cash collected by driver` CashCollection
			,'CashCollection' as AmountType
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
			AND Month(`Date`) =mont
			AND YEAR(`Date`) = 2019
		UNION ALL
		SELECT
			`Date`
			, MONTHNAME(`Date`) `Month`
			,`Penalty` Penalty
			,'Penalty' as AmountType
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
			AND Month(`Date`) =mont
			AND YEAR(`Date`) = 2019
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
			AND Month(`Date`) = mont
			AND YEAR(`Date`) = 2019
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
			AND Month(`Date`) = mont
			AND YEAR(`Date`) = 2019
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
			AND Month(`Date`) = mont
			AND YEAR(`Date`) = 2019
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
			AND Month(`Date`) = mont
			AND YEAR(`Date`) = 2019
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
			AND Month(`Date`) = mont
			AND YEAR(`Date`) = 2019
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
			AND Month(`Date`) = mont
			AND YEAR(`Date`) = 2019
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
			AND Month(`Date`) = mont
			AND YEAR(`Date`) = 2019
	) PP
    GROUP BY
		`Month`
        ,AmountType;
END$$
DELIMITER ;
