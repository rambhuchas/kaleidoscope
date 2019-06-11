var routes = require('../routes');

var express = require('express');
var router = express.Router();
var path = require('path');

module.exports = function(app){

	app.get('/header', function(req,res) {
		res.sendFile(path.resolve(__dirname + '/../header.html'));
	});

	app.get('/menu', function(req,res) {
		res.sendFile(path.resolve(__dirname + '/../menu.html'));
	});

	app.get('/footer', function(req,res) {
		res.sendFile(path.resolve(__dirname + '/../footer-dist.html'));
	});

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

	app.get('/forecast', function(req,res) {
		res.sendFile(path.resolve(__dirname + '/../forecast.html'));
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
	/*************** Forecast */
	app.get('/getHolidays', routes.fleetReportService.getHolidays);

}