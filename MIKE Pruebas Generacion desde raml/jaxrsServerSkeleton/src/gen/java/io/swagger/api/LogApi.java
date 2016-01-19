package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.LogApiService;
import io.swagger.api.factories.LogApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.ResponseGetStructuredLog;
import io.swagger.model.Response404;
import io.swagger.model.Response500;
import io.swagger.model.Response201;
import io.swagger.model.InputBodyStructuredLog;
import io.swagger.model.ResponseGetUnstructuredLog;
import io.swagger.model.InputBodyUnstructuredLog;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/log")


@io.swagger.annotations.Api(value = "/log", description = "the log API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class LogApi  {

   private final LogApiService delegate = LogApiServiceFactory.getLogApi();

    @GET
    @Path("/structured")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a list of logs which are structured following the canonical model.", notes = "Get a list of logs which are structured following the canonical model.", response = ResponseGetStructuredLog.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "-- M.I.K.E API--\nmethod: Get\npath: /log/structured\ndescription: This method is to get a list of logs which are structured following the canonical model. It should be queried filtering by the one or more fields follow:\n\n- filters.- The filters to use in the query. per example; \"filters=field1:value1,field2:value2,etc...\"\n- fields.- The fields to expose in the results. per example; \"fields=field1,field2,field3,etc ...\"\n- orderBy.- The sorting options to return the results ordered by a field or dimension. per example; \"orderBy=field1:asc|desc,field2:asc|desc,field3:asc|desc,etc ...\"\n- dateFrom.- The starter date in timestamp format to filter the results in the query. per example; \"dateFrom=1444389041012\"\n- dateTo.- The top date in timestamp format to filter the results in the query. per example; \"dateTo=1444389041012\"\n\nmessage: M.I.K.E - OK.", response = ResponseGetStructuredLog.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "-- M.I.K.E API-- \nmethod: Get\npath: /log/structured\ndescription: This method is to get a list of logs which are structured following the canonical model. It should be queried filtering by the one or more fields follow:\n\n- filters.- The filters to use in the query. per example; \"filters=field1:value1,field2:value2,etc...\"\n- fields.- The fields to expose in the results. per example; \"fields=field1,field2,field3,etc ...\"\n- orderBy.- The sorting options to return the results ordered by a field or dimension. per example; \"orderBy=field1:asc|desc,field2:asc|desc,field3:asc|desc,etc ...\"\n- dateFrom.- The starter date in timestamp format to filter the results in the query. per example; \"dateFrom=1444389041012\"\n- dateTo.- The top date in timestamp format to filter the results in the query. per example; \"dateTo=1444389041012\"\nmessage: M.I.K.E - The server has not found anything matching the Request-URI. No indication is given of whether the condition is temporary or permanent.", response = ResponseGetStructuredLog.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "M.I.K.E - The server encountered an unexpected condition which prevented it from fulfilling the request.", response = ResponseGetStructuredLog.class) })

    public Response getLogStructured()
    throws NotFoundException {
        return delegate.getLogStructured();
    }
    @POST
    @Path("/structured")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Put a new trace on the system", notes = "Put a new trace on the system", response = Response201.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "-- M.I.K.E API-- \nmethod: Post\npath: /log/structured\ndescription: This method is to send a new log to the box which is structured following the canonical model. \nmessage: M.I.K.E - Created OK.", response = Response201.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "-- M.I.K.E API-- \nmethod: Get\npath: /log/structured\ndescription: This method is to get a list of logs which are structured following the canonical model. It should be queried filtering by the one or more fields follow:\n\n- filters.- The filters to use in the query. per example; \"filters=field1:value1,field2:value2,etc...\"\n- fields.- The fields to expose in the results. per example; \"fields=field1,field2,field3,etc ...\"\n- orderBy.- The sorting options to return the results ordered by a field or dimension. per example; \"orderBy=field1:asc|desc,field2:asc|desc,field3:asc|desc,etc ...\"\n- dateFrom.- The starter date in timestamp format to filter the results in the query. per example; \"dateFrom=1444389041012\"\n- dateTo.- The top date in timestamp format to filter the results in the query. per example; \"dateTo=1444389041012\"\nmessage: M.I.K.E - The server has not found anything matching the Request-URI. No indication is given of whether the condition is temporary or permanent.", response = Response201.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "M.I.K.E - The server encountered an unexpected condition which prevented it from fulfilling the request.", response = Response201.class) })

    public Response postLogStructured(@ApiParam(value = ""  ) InputBodyStructuredLog body)
    throws NotFoundException {
        return delegate.postLogStructured(body);
    }
    @GET
    @Path("/unstructured")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all logs.", notes = "Get all logs.", response = ResponseGetUnstructuredLog.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "-- M.I.K.E API--\nmethod: Get\npath: /log/unstructured\ndescription: This method is to get a list of logs with no structure. It should be queried filtering by the one or more fields follow:\n\n- filters.- The filters to use in the query. per example; \"filters=field1:value1,field2:value2,etc...\"\n- fields.- The fields to expose in the results. per example; \"fields=field1,field2,field3,etc ...\"\n- orderBy.- The sorting options to return the results ordered by a field or dimension. per example; \"orderBy=field1:asc|desc,field2:asc|desc,field3:asc|desc,etc ...\"\n- dateFrom.- The starter date in timestamp format to filter the results in the query. per example; \"dateFrom=1444389041012\"\n- dateTo.- The top date in timestamp format to filter the results in the query. per example; \"dateTo=1444389041012\"\n\nmessage: M.I.K.E - OK.", response = ResponseGetUnstructuredLog.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "-- M.I.K.E API-- \nmethod: Get\npath: /log/structured\ndescription: This method is to get a list of logs which are structured following the canonical model. It should be queried filtering by the one or more fields follow:\n\n- filters.- The filters to use in the query. per example; \"filters=field1:value1,field2:value2,etc...\"\n- fields.- The fields to expose in the results. per example; \"fields=field1,field2,field3,etc ...\"\n- orderBy.- The sorting options to return the results ordered by a field or dimension. per example; \"orderBy=field1:asc|desc,field2:asc|desc,field3:asc|desc,etc ...\"\n- dateFrom.- The starter date in timestamp format to filter the results in the query. per example; \"dateFrom=1444389041012\"\n- dateTo.- The top date in timestamp format to filter the results in the query. per example; \"dateTo=1444389041012\"\nmessage: M.I.K.E - The server has not found anything matching the Request-URI. No indication is given of whether the condition is temporary or permanent.", response = ResponseGetUnstructuredLog.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "M.I.K.E - The server encountered an unexpected condition which prevented it from fulfilling the request.", response = ResponseGetUnstructuredLog.class) })

    public Response getLogUnstructured(@ApiParam(value = "The starter date in timestamp format to filter the results in the query.",required=true) @QueryParam("dateFrom") String dateFrom,
    @ApiParam(value = "The filters to use in the query.") @QueryParam("filters") String filters,
    @ApiParam(value = "The fields to expose in the results.") @QueryParam("fields") String fields,
    @ApiParam(value = "The sorting options to return the results ordered by a field or dimension.") @QueryParam("orderBy") String orderBy,
    @ApiParam(value = "The top date in timestamp format to filter the results in the query.") @QueryParam("dateTo") String dateTo)
    throws NotFoundException {
        return delegate.getLogUnstructured(dateFrom,filters,fields,orderBy,dateTo);
    }
    @POST
    @Path("/unstructured")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Put a new trace on the system", notes = "Put a new trace on the system", response = Response201.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "-- M.I.K.E API-- \nmethod: Post\npath: /log/structured\ndescription: This method is to send a new log to the box which is structured following the canonical model. \nmessage: M.I.K.E - Created OK.", response = Response201.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "-- M.I.K.E API-- \nmethod: Get\npath: /log/structured\ndescription: This method is to get a list of logs which are structured following the canonical model. It should be queried filtering by the one or more fields follow:\n\n- filters.- The filters to use in the query. per example; \"filters=field1:value1,field2:value2,etc...\"\n- fields.- The fields to expose in the results. per example; \"fields=field1,field2,field3,etc ...\"\n- orderBy.- The sorting options to return the results ordered by a field or dimension. per example; \"orderBy=field1:asc|desc,field2:asc|desc,field3:asc|desc,etc ...\"\n- dateFrom.- The starter date in timestamp format to filter the results in the query. per example; \"dateFrom=1444389041012\"\n- dateTo.- The top date in timestamp format to filter the results in the query. per example; \"dateTo=1444389041012\"\nmessage: M.I.K.E - The server has not found anything matching the Request-URI. No indication is given of whether the condition is temporary or permanent.", response = Response201.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "M.I.K.E - The server encountered an unexpected condition which prevented it from fulfilling the request.", response = Response201.class) })

    public Response postLogUnstructured(@ApiParam(value = ""  ) InputBodyUnstructuredLog body)
    throws NotFoundException {
        return delegate.postLogUnstructured(body);
    }
}

