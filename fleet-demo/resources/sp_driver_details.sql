SELECT
  `Driver name`,
  `Date`,
  MONTHNAME(`Date`) AS MONTH,
  MONTH(`Date`)     AS MO,
  YEAR(`Date`),
  CollectionAmount
FROM
  (
    SELECT
      `Driver name` ,
      `Date` ,
      CarNumber ,
      ( (`Cash collected BY driver` + Penalty) - (`DriverEarnings` +
      `FuelExpense`) ) AS CollectionAmount ,
      ( (`Cash collected BY driver` + Penalty) - (`DriverEarnings` +
      `FuelExpense`)                - AdvanceCollected - SetteledAmount ) AS
      PendingSettlement ,
      DriverEarnings ,
      FuelExpense ,
      Penalty ,
      SetteledAmount ,
      AdvanceCollected ,
      TotalTripKMs ,
      OperatorBill ,
      TollParking ,
      Incentives ,
      NetEarnings
    FROM
      (
        SELECT
          `Driver name` ,
          str_to_date(DATE,'%m-%d-%Y') `Date` ,
          `Car number` CarNumber ,
          `Bookings Completed` ,
          `Cash collected BY driver` ,
          ROUND((`Operator Bill` + `Incentives`) * 0.30) AS `DriverEarnings` ,
          COALESCE(NULLIF(`Penalty`,''), 0)              AS Penalty ,
          COALESCE(NULLIF(`Fuel Expense`,''), 0)         AS FuelExpense ,
          COALESCE(NULLIF(`Advance Collection`,''), 0)   AS AdvanceCollected ,
          COALESCE(NULLIF(`Setteled amount`,''), 0)      AS SetteledAmount ,
          COALESCE(NULLIF(`Total Trip KMs`,''), 0)       AS TotalTripKMs ,
          COALESCE(NULLIF(`Operator Bill`,''), 0)        AS OperatorBill ,
          COALESCE(NULLIF(`Toll/ Parking`,''), 0)        AS TollParking ,
          COALESCE(NULLIF(`Incentives`,''), 0)           AS Incentives ,
          COALESCE(NULLIF(`Net Earnings`,''), 0)         AS NetEarnings
        FROM
          dev_01_magizhunthu.`Account Summary - OLA`
      )
      T
  )
  P
WHERE
`Driver name` = 'VASU A'
AND MONTH(DATE) =4
AND YEAR( DATE) =2018
