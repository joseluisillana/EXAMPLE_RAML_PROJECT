-- M.I.K.E API--
method: Get
path: /log/structured
description: This method is to get a list of logs which are structured following the canonical model. It should be queried filtering by the one or more fields follow:

- filters.- The filters to use in the query. per example; "filters=field1:value1,field2:value2,etc..."
- fields.- The fields to expose in the results. per example; "fields=field1,field2,field3,etc ..."
- orderBy.- The sorting options to return the results ordered by a field or dimension. per example; "orderBy=field1:asc|desc,field2:asc|desc,field3:asc|desc,etc ..."
- dateFrom.- The starter date in timestamp format to filter the results in the query. per example; "dateFrom=1444389041012"
- dateTo.- The top date in timestamp format to filter the results in the query. per example; "dateTo=1444389041012"

message: M.I.K.E - OK.
