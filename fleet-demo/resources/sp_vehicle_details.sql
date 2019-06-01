SELECT
  *
FROM
  (
    SELECT
      `Car number` AS CarNumber ,
      `Driver name` ,
      MONTH(str_to_date(DATE,'%m-%d-%Y')) AS mont,
      SUM(`Net Earnings`)                 AS netearn
    FROM
      dev_01_magizhunthu.`Account Summary - OLA`
    WHERE
      MONTH(str_to_date( DATE,'%m-%d-%Y')) = 3
    AND YEAR(str_to_date(DATE,'%m-%d-%Y')) = 2019
    GROUP BY
      `Car number`,
      `Driver name`,
      mont
  )
  T
ORDER BY
  netearn DESC
