var routes = require('../routes');

var express = require('express');
var router = express.Router();
var path = require('path');

module.exports = function(app){
	app.get('/', function(req,res) {
		res.sendFile(path.resolve(__dirname + '/../login.html'));
	});

	app.get('/home', function(req,res) {
		res.sendFile(path.resolve(__dirname + '/../index1.html'));
	});

	app.get('/driver', function(req,res) {
		res.sendFile(path.resolve(__dirname + '/../driver.html'));
	});
	app.get('/vehicle', function(req,res) {
		res.sendFile(path.resolve(__dirname + '/../vehicle.html'));
	});

	app.get('/vehicleperf', function(req,res) {
		res.sendFile(path.resolve(__dirname + '/../vehicleperformance.html'));
	});
	app.get('/menu', function(req,res) {
		res.sendFile(path.resolve(__dirname + '/../menu.html'));
	});

	app.get('/getfleetreport', routes.fleetReportService.getreportdata);
	app.get('/getDrivers', routes.fleetReportService.getDriverNames);
	app.get('/getreportparams', routes.fleetReportService.getReportParams);
	app.get('/getconsolidateddate', routes.fleetReportService.getconsolidateddate);
	/**** Vehicle***/
	app.get('/getVehicles', routes.fleetReportService.getVehicleNames);
	app.get('/getVehiclePerf', routes.fleetReportService.getVehiclePerf);
	app.get('/getfleetreportVehicle', routes.fleetReportService.getreportdataVehicle);
	app.get('/getconsolidateddateVehicle', routes.fleetReportService.getconsolidateddateVehicle);
	/****************  Home page ************* */
	app.get('/getPerformanceKeyTerms', routes.fleetReportService.getPerformanceKeyTerms);

}
