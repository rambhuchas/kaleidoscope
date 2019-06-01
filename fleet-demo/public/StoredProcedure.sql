

SELECT
	`Driver name`
    ,MonthOfYear
	,coalesce(SUM(IF(DayOfMonth = 1, CollectionAmount , NULL)), 0) AS CollectedAmountDay1
	,coalesce(SUM(IF(DayOfMonth = 2, CollectionAmount , NULL)), 0) AS CollectedAmountDay2
	,coalesce(SUM(IF(DayOfMonth = 3, CollectionAmount , NULL)), 0) AS CollectedAmountDay3
	,coalesce(SUM(IF(DayOfMonth = 4, CollectionAmount , NULL)), 0) AS CollectedAmountDay4
	,coalesce(SUM(IF(DayOfMonth = 5, CollectionAmount , NULL)), 0) AS CollectedAmountDay5
	,coalesce(SUM(IF(DayOfMonth = 6, CollectionAmount , NULL)), 0) AS CollectedAmountDay6
	,coalesce(SUM(IF(DayOfMonth = 7, CollectionAmount , NULL)), 0) AS CollectedAmountDay7
	,coalesce(SUM(IF(DayOfMonth = 8, CollectionAmount , NULL)), 0) AS CollectedAmountDay8
	,coalesce(SUM(IF(DayOfMonth = 9, CollectionAmount , NULL)), 0) AS CollectedAmountDay9
	,coalesce(SUM(IF(DayOfMonth = 10, CollectionAmount , NULL)), 0) AS CollectedAmountDay10
	,coalesce(SUM(IF(DayOfMonth = 11, CollectionAmount , NULL)), 0) AS CollectedAmountDay11
	,coalesce(SUM(IF(DayOfMonth = 12, CollectionAmount , NULL)), 0) AS CollectedAmountDay12
	,coalesce(SUM(IF(DayOfMonth = 13, CollectionAmount , NULL)), 0) AS CollectedAmountDay13
	,coalesce(SUM(IF(DayOfMonth = 14, CollectionAmount , NULL)), 0) AS CollectedAmountDay14
	,coalesce(SUM(IF(DayOfMonth = 15, CollectionAmount , NULL)), 0) AS CollectedAmountDay15
	,coalesce(SUM(IF(DayOfMonth = 16, CollectionAmount , NULL)), 0) AS CollectedAmountDay16
	,coalesce(SUM(IF(DayOfMonth = 17, CollectionAmount , NULL)), 0) AS CollectedAmountDay17
	,coalesce(SUM(IF(DayOfMonth = 18, CollectionAmount , NULL)), 0) AS CollectedAmountDay18
	,coalesce(SUM(IF(DayOfMonth = 19, CollectionAmount , NULL)), 0) AS CollectedAmountDay19
	,coalesce(SUM(IF(DayOfMonth = 20, CollectionAmount , NULL)), 0) AS CollectedAmountDay20
	,coalesce(SUM(IF(DayOfMonth = 21, CollectionAmount , NULL)), 0) AS CollectedAmountDay21
	,coalesce(SUM(IF(DayOfMonth = 22, CollectionAmount , NULL)), 0) AS CollectedAmountDay22
	,coalesce(SUM(IF(DayOfMonth = 23, CollectionAmount , NULL)), 0) AS CollectedAmountDay23
	,coalesce(SUM(IF(DayOfMonth = 24, CollectionAmount , NULL)), 0) AS CollectedAmountDay24
	,coalesce(SUM(IF(DayOfMonth = 25, CollectionAmount , NULL)), 0) AS CollectedAmountDay25
	,coalesce(SUM(IF(DayOfMonth = 26, CollectionAmount , NULL)), 0) AS CollectedAmountDay26
	,coalesce(SUM(IF(DayOfMonth = 27, CollectionAmount , NULL)), 0) AS CollectedAmountDay27
	,coalesce(SUM(IF(DayOfMonth = 28, CollectionAmount , NULL)), 0) AS CollectedAmountDay28
	,coalesce(SUM(IF(DayOfMonth = 29, CollectionAmount , NULL)), 0) AS CollectedAmountDay29
	,coalesce(SUM(IF(DayOfMonth = 30, CollectionAmount , NULL)), 0) AS CollectedAmountDay30
	,coalesce(SUM(IF(DayOfMonth = 31, CollectionAmount , NULL)), 0) AS CollectedAmountDay31

FROM
	(
	SELECT
		`Driver name`
		,dayofmonth(`Date`) DayOfMonth
		,concat(monthname(`Date`) , '-' , year(Date)) MonthOfYear
		,CarNumber
		,(`Cash collected by driver` +  Penalty) - (`DriverEarnings` + `FuelExpense`) CollectionAmount
		, ( (`Cash collected by driver` +  Penalty) - (`DriverEarnings` + `FuelExpense`) ) -  AdvanceCollected - SetteledAmount AS PendingSettlement
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
		FROM 
			dev_01_magizhunthu.`Account Summary - OLA`
		)T
	)P
GROUP BY
	`Driver name`
    ,MonthOfYear