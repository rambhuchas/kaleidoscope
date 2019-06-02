var mysql      = require('mysql');
var url = require('url');

let sql = `CALL sprReportExpensesByDriver(?,?)`;

exports.getreportdata = function(req, res){
    console.log("GET");

    var url_parts = url.parse(req.url, true);
    var query = url_parts.query;
    console.log(query);
    var connection = mysql.createConnection({
      host     : 'rambhuchas-dev.conmgyficnit.ap-south-1.rds.amazonaws.com',
      user     : 'root',
      password : 'root1234',
      database : 'dev_01_magizhunthu'
    });
    connection.connect();

    connection.query(sql,[query.name,query.reportfor], function (error, results, fields) {
     if (error) throw error;
     res.setHeader('Content-Type', 'application/json');
     res.end(JSON.stringify(results[0]));
    });
    connection.end()
};


exports.getDriverNames = function(req, res){
  console.log("GET");

  var url_parts = url.parse(req.url, true);
  var query = url_parts.query;
  console.log(query);
  var connection = mysql.createConnection({
    host     : 'rambhuchas-dev.conmgyficnit.ap-south-1.rds.amazonaws.com',
    user     : 'root',
    password : 'root1234',
    database : 'dev_01_magizhunthu'
  });
  connection.connect();

  connection.query("select distinct `Driver name` from `Account Summary - OLA`",[], function (error, results, fields) {
   if (error) throw error;
   res.setHeader('Content-Type', 'application/json');
   res.end(JSON.stringify(results));
  });
  connection.end()
};

exports.getReportParams = function(req, res){
  console.log("GET");

  var url_parts = url.parse(req.url, true);
  var query = url_parts.query;
  console.log(query);
  var connection = mysql.createConnection({
    host     : 'rambhuchas-dev.conmgyficnit.ap-south-1.rds.amazonaws.com',
    user     : 'root',
    password : 'root1234',
    database : 'dev_01_magizhunthu'
  });
  connection.connect();

  connection.query("SELECT 'DriverEarnings' AS 'ReportFor' UNION \
  SELECT 'FuelExpense' UNION \
  SELECT 'Penalty' UNION \
  SELECT 'SetteledAmount' UNION \
  SELECT 'AdvanceCollected' UNION \
  SELECT 'TotalTripKMs' UNION \
  SELECT 'OperatorBill' UNION \
  SELECT 'TollParking' UNION \
  SELECT 'Incentives' UNION \
  SELECT 'NetEarnings' UNION \
  SELECT 'CollectionAmount' UNION \
  SELECT 'PendingSettlement' ",[], function (error, results, fields) {
   if (error) throw error;
   res.setHeader('Content-Type', 'application/json');
   res.end(JSON.stringify(results));
  });
  connection.end()
};



exports.getconsolidateddate = function(req, res){
  console.log("GET");

  var url_parts = url.parse(req.url, true);
  var query = url_parts.query;
  console.log(query);
  var connection = mysql.createConnection({
    host     : 'rambhuchas-dev.conmgyficnit.ap-south-1.rds.amazonaws.com',
    user     : 'root',
    password : 'root1234',
    database : 'dev_01_magizhunthu'
  });
  connection.connect();
  var sqll = `CALL sprReportDriverExpensesByMonth(?)`; + query.name + "'"
  connection.query(sqll,[query.name], function (error, results, fields) {
          if (error) throw error;
          res.setHeader('Content-Type', 'application/json');
          res.end(JSON.stringify(results[0]));
         });
         connection.end()
       };
/******************** vehicle *******************/

exports.getVehicleNames = function(req, res){
  console.log("GET");

  var url_parts = url.parse(req.url, true);
  var query = url_parts.query;
  console.log(query);
  var connection = mysql.createConnection({
    host     : 'rambhuchas-dev.conmgyficnit.ap-south-1.rds.amazonaws.com',
    user     : 'root',
    password : 'root1234',
    database : 'dev_01_magizhunthu'
  });
  connection.connect();

  connection.query("select distinct `Car number` from `Account Summary - OLA`",[], function (error, results, fields) {
   if (error) throw error;
   res.setHeader('Content-Type', 'application/json');
   res.end(JSON.stringify(results));
  });
  connection.end()
};


exports.getVehiclePerf = function(req, res){
  console.log("GET");

  var url_parts = url.parse(req.url, true);
  var query = url_parts.query;
  console.log(query);
  var connection = mysql.createConnection({
    host     : 'rambhuchas-dev.conmgyficnit.ap-south-1.rds.amazonaws.com',
    user     : 'root',
    password : 'root1234',
    database : 'dev_01_magizhunthu'
  });
  connection.connect();

  connection.query("SELECT * FROM ( SELECT `Car number` AS CarNumber ,  MONTH(str_to_date(DATE,'%m-%d-%Y')) AS mont, SUM(`Total Trip KMs`) AS netearn FROM dev_01_magizhunthu.`Account Summary - OLA` WHERE MONTH(str_to_date( DATE,'%m-%d-%Y')) = " + query.month +" AND YEAR(str_to_date(DATE,'%m-%d-%Y')) = " + query.year + " GROUP BY `Car number`, mont ) T ORDER BY netearn DESC LIMIT 10",[], function (error, results, fields) {
   if (error) throw error;
   res.setHeader('Content-Type', 'application/json');
   res.end(JSON.stringify(results));
  });
  connection.end()
};



let sqlVehicleAll = `CALL sprReportExpensesByVehicle(?,?)`;
exports.getreportdataVehicle = function(req, res){
    console.log("GET");

    var url_parts = url.parse(req.url, true);
    var query = url_parts.query;
    console.log(query);
    var connection = mysql.createConnection({
      host     : 'rambhuchas-dev.conmgyficnit.ap-south-1.rds.amazonaws.com',
      user     : 'root',
      password : 'root1234',
      database : 'dev_01_magizhunthu'
    });
    connection.connect();

    connection.query(sqlVehicleAll,[query.name,query.reportfor], function (error, results, fields) {
     if (error) throw error;
     res.setHeader('Content-Type', 'application/json');
     res.end(JSON.stringify(results[0]));
    });
    connection.end()
};

exports.getconsolidateddateVehicle = function(req, res){
  console.log("GET");

  var url_parts = url.parse(req.url, true);
  var query = url_parts.query;
  console.log(query);
  var connection = mysql.createConnection({
    host     : 'rambhuchas-dev.conmgyficnit.ap-south-1.rds.amazonaws.com',
    user     : 'root',
    password : 'root1234',
    database : 'dev_01_magizhunthu'
  });
  connection.connect();
  var sqlConsolidatedVehicle = `CALL sprReportVehicleExpensesByMonth(?)`; + query.name + "'"
  connection.query(sqlConsolidatedVehicle,[query.name], function (error, results, fields) {
          if (error) throw error;
          res.setHeader('Content-Type', 'application/json');
          res.end(JSON.stringify(results[0]));
         });
         connection.end()
       };
