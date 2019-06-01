/***************************************************************************/
// Filename: homeService.js
// Created By: Team@EDC
/***************************************************************************/

exports.home = function(req, res){
  res.render('index', { title: 'Express' });
};

exports.testApp = function(req, res){
	res.end(JSON.stringify({ "title": "testing", "test":"info" }));
};