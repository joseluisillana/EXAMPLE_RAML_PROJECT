package io.swagger.model;

import io.swagger.model.ResponseGetUnstructuredLogResponseStatus;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class ResponseGetUnstructuredLog  {
  
  private List<String> responseBody = new ArrayList<String>();
  private ResponseGetUnstructuredLogResponseStatus responseStatus = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
  public ResponseGetUnstructuredLogResponseStatus getResponseStatus() {
    return responseStatus;
  }
  public void setResponseStatus(ResponseGetUnstructuredLogResponseStatus responseStatus) {
    this.responseStatus = responseStatus;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseGetUnstructuredLog {\n");
    
    sb.append("  responseBody: ").append(responseBody).append("\n");
    sb.append("  responseStatus: ").append(responseStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
