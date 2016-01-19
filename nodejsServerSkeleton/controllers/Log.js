'use strict';

var url = require('url');


var Log = require('./LogService');


module.exports.getLogStructured = function getLogStructured (req, res, next) {
  

  var result = Log.getLogStructured();

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

module.exports.postLogStructured = function postLogStructured (req, res, next) {
  var body = req.swagger.params['body'].value;
  

  var result = Log.postLogStructured(body);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

module.exports.getLogUnstructured = function getLogUnstructured (req, res, next) {
  var dateFrom = req.swagger.params['dateFrom'].value;
  var filters = req.swagger.params['filters'].value;
  var fields = req.swagger.params['fields'].value;
  var orderBy = req.swagger.params['orderBy'].value;
  var dateTo = req.swagger.params['dateTo'].value;
  

  var result = Log.getLogUnstructured(dateFrom, filters, fields, orderBy, dateTo);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

module.exports.postLogUnstructured = function postLogUnstructured (req, res, next) {
  var body = req.swagger.params['body'].value;
  

  var result = Log.postLogUnstructured(body);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};
