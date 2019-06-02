SELECT
  CarNumber,
  driver,
  netearnvehicle,
  netearndriver,
  TotalTripDistance,
  TotalDriverEarnings,
  EarningsPerKm
FROM
  (
    SELECT
      *
    FROM
      (
        SELECT
          'TopVehicle',
          `Car number` AS CarNumber ,
          100 temp_id,
          /*`Driver Name`                        AS driver ,*/
          MONTH(str_to_date(DATE,'%m-%d-%Y')) AS mont,
          SUM(`Operator Bill`)                AS netearnvehicle
        FROM
          dev_01_magizhunthu.`Account Summary - OLA`
        WHERE
          MONTH(str_to_date( DATE,'%m-%d-%Y')) = reportMonth
        AND YEAR(str_to_date(DATE,'%m-%d-%Y')) = reportYear
        GROUP BY
          `Car number`,
          /*`Driver Name`,*/
          mont
      )
      T
    ORDER BY
      netearnvehicle DESC LIMIT 1
  )
  A,
  /*UNION ALL*/
  (
    SELECT
      *
    FROM
      (
        SELECT
          /*`Car number`                        AS CarNumber ,*/
          'TopDriver',
          `Driver Name` AS driver ,
          100 temp_id,
          MONTH(str_to_date(DATE,'%m-%d-%Y')) AS mont,
          SUM(`Operator Bill`)                AS netearndriver
        FROM
          dev_01_magizhunthu.`Account Summary - OLA`
        WHERE
          MONTH(str_to_date( DATE,'%m-%d-%Y')) = reportMonth
        AND YEAR(str_to_date(DATE,'%m-%d-%Y')) = reportYear
        GROUP BY
          /*`Car number`,*/
          `Driver Name`,
          mont
      )
      T
    ORDER BY
      netearndriver DESC LIMIT 1
  )
  B,
  (
    SELECT
      /*`Car number`                        AS CarNumber ,
      MONTH(str_to_date(DATE,'%m-%d-%Y')) AS mont,*/
      SUM(`Total Trip KMs`)                                         AS `TotalTripDistance`,
      SUM((`Operator Bill`  + `Incentives`))                        AS `TotalDriverEarnings`,
      (SUM((`Operator Bill` + `Incentives`))/SUM(`Total Trip KMs`)) AS
      `EarningsPerKm`,
      100 temp_id
      /*SUM(`Driver Earnings`)               AS netearn*/
    FROM
      dev_01_magizhunthu.`Account Summary - OLA`
    WHERE
      MONTH(str_to_date( DATE,'%m-%d-%Y')) = reportMonth
    AND YEAR(str_to_date(DATE,'%m-%d-%Y')) = reportYear
  )
  C
WHERE
  A.temp_id  =B.temp_id
AND B.temp_id=C.temp_id
