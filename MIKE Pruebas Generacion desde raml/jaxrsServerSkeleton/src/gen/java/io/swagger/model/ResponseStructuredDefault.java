package io.swagger.model;

import io.swagger.model.ResponseStructuredDefaultResponseStatus;
import io.swagger.model.ResponseStructuredDefaultResponseBody;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class ResponseStructuredDefault  {
  
  private List<ResponseStructuredDefaultResponseBody> responseBody = new ArrayList<ResponseStructuredDefaultResponseBody>();
  private ResponseStructuredDefaultResponseStatus responseStatus = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("response_body")
  public List<ResponseStructuredDefaultResponseBody> getResponseBody() {
    return responseBody;
  }
  public void setResponseBody(List<ResponseStructuredDefaultResponseBody> responseBody) {
    this.responseBody = responseBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("response_status")
  public ResponseStructuredDefaultResponseStatus getResponseStatus() {
    return responseStatus;
  }
  public void setResponseStatus(ResponseStructuredDefaultResponseStatus responseStatus) {
    this.responseStatus = responseStatus;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseStructuredDefault {\n");
    
    sb.append("  responseBody: ").append(responseBody).append("\n");
    sb.append("  responseStatus: ").append(responseStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
