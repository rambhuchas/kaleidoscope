/******************************************************************************************/
// Filename: pdfGenerator.js
// Created By: Team@EDC
// Description: Entry point for PDF Generation
/*******************************************************************************************/

// npm modules
require('dotenv').config();

var express = require('express'),
    path = require('path'),
    http = require('http'),
    config = require('./config')
    ;

console.log("Port=" + config.PORT);

var routes = require('../routes');
var app = express();

var allowCrossDomain = function(req, res, next) {
    res.header('Access-Control-Allow-Origin', '*');
    res.header('Access-Control-Allow-Methods', 'GET,PUT,POST,DELETE');
    res.header('Access-Control-Allow-Headers', '*');

    if ('OPTIONS' == req.method) {
        res.send(200);
    } else {
        next();
    }
}

app.use(express.static(path.join(__dirname, '../public')));
// Worker process 
runWorkerProcesses();

function runWorkerProcesses() {
    app.enable('trust proxy');
    
    app.use(allowCrossDomain);

    // Routes
    require('../routes/routeMapper')(app);

    var port = process.env.PORT;
    var server = http.createServer(app);
    server.listen(port);
    server.on('error', onError);
    
    console.log(process.env.APPLICATION_NAME + " is running on port: " + port);
    //log.info(process.env.APPLICATION_NAME + " is running on port: " + port);

    process.on('uncaughtException', function(err) {
        console.log(err, "worker process crash due to error. " + err.stack);
        //Send some notification about the error  
        process.exit(1);
    });
}

/**
 * Event listener for HTTP server "error" event.
 */

function onError(error) {
    if (error.syscall !== 'listen') {
        throw error;
    }

    var bind = typeof port === 'string' ? 'Pipe ' + port : 'Port ' + port

    // handle specific listen errors with friendly messages
    switch (error.code) {
        case 'EACCES':
            console.error(bind + ' requires elevated privileges');
            process.exit(1);
            break;
        case 'EADDRINUSE':
            console.error(bind + ' is already in use');
            process.exit(1);
            break;
        default:
            throw error;
    }
}

module.exports = app;