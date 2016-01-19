'use strict';

exports.getLogStructured = function() {

  var examples = {};
  
  examples['application/json'] = "{\n  \"response_status\": {\n    \"status_code\": 200,\n    \"status_message\": \"M.I.K.E - OK.\"\n  },\n  \"response_body\": [{}]\n}\n";
  

  
  if(Object.keys(examples).length > 0)
    return examples[Object.keys(examples)[0]];
  
}
exports.postLogStructured = function(body) {

  var examples = {};
  
  examples['application/json'] = "{\n  \"response_status\": {\n    \"status_code\": 201,\n    \"status_message\": \"M.I.K.E - Created OK.\"\n  },\n  \"response_body\": [{}]\n}\n";
  

  
  if(Object.keys(examples).length > 0)
    return examples[Object.keys(examples)[0]];
  
}
exports.getLogUnstructured = function(dateFrom, filters, fields, orderBy, dateTo) {

  var examples = {};
  
  examples['application/json'] = "{\n  \"response_status\": {\n    \"status_code\": 200,\n    \"status_message\": \"M.I.K.E - OK.\"\n  },\n  \"response_body\": [\"aaaa\",\"dddd\"]\n}\n";
  

  
  if(Object.keys(examples).length > 0)
    return examples[Object.keys(examples)[0]];
  
}
exports.postLogUnstructured = function(body) {

  var examples = {};
  
  examples['application/json'] = "{\n  \"response_status\": {\n    \"status_code\": 201,\n    \"status_message\": \"M.I.K.E - Created OK.\"\n  },\n  \"response_body\": [{}]\n}\n";
  

  
  if(Object.keys(examples).length > 0)
    return examples[Object.keys(examples)[0]];
  
}
