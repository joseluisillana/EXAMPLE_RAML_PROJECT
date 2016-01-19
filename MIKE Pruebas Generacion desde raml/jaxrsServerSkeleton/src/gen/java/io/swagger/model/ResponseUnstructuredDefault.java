package io.swagger.model;

import io.swagger.model.ResponseUnstructuredDefaultResponseStatus;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class ResponseUnstructuredDefault  {
  
  private List<String> responseBody = new ArrayList<String>();
  private ResponseUnstructuredDefaultResponseStatus responseStatus = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("response_body")
  public List<String> getResponseBody() {
    return responseBody;
  }
  public void setResponseBody(List<String> responseBody) {
    this.responseBody = responseBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("response_status")
  public ResponseUnstructuredDefaultResponseStatus getResponseStatus() {
    return responseStatus;
  }
  public void setResponseStatus(ResponseUnstructuredDefaultResponseStatus responseStatus) {
    this.responseStatus = responseStatus;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseUnstructuredDefault {\n");
    
    sb.append("  responseBody: ").append(responseBody).append("\n");
    sb.append("  responseStatus: ").append(responseStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
