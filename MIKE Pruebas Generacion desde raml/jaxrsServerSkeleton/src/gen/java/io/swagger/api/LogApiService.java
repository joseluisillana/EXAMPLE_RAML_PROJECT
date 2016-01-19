package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public abstract class LogApiService {
  
      public abstract Response getLogStructured()
      throws NotFoundException;
  
      public abstract Response postLogStructured(InputBodyStructuredLog body)
      throws NotFoundException;
  
      public abstract Response getLogUnstructured(String dateFrom,String filters,String fields,String orderBy,String dateTo)
      throws NotFoundException;
  
      public abstract Response postLogUnstructured(InputBodyUnstructuredLog body)
      throws NotFoundException;
  
}
