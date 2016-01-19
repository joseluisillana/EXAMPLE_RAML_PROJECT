package io.swagger.model;

import java.util.*;
import io.swagger.model.ResponseGetStructuredLogResponseStatus;
import io.swagger.model.ResponseGetStructuredLogResponseBody;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class ResponseGetStructuredLog  {
  
  private List<ResponseGetStructuredLogResponseBody> responseBody = new ArrayList<ResponseGetStructuredLogResponseBody>();
  private ResponseGetStructuredLogResponseStatus responseStatus = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("response_body")
  public List<ResponseGetStructuredLogResponseBody> getResponseBody() {
    return responseBody;
  }
  public void setResponseBody(List<ResponseGetStructuredLogResponseBody> responseBody) {
    this.responseBody = responseBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("response_status")
  public ResponseGetStructuredLogResponseStatus getResponseStatus() {
    return responseStatus;
  }
  public void setResponseStatus(ResponseGetStructuredLogResponseStatus responseStatus) {
    this.responseStatus = responseStatus;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseGetStructuredLog {\n");
    
    sb.append("  responseBody: ").append(responseBody).append("\n");
    sb.append("  responseStatus: ").append(responseStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
