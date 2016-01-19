package io.swagger.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class ResponseStructuredDefaultResponseStatus  {
  
  private Long statusCode = null;
  private String statusMessage = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status_code")
  public Long getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(Long statusCode) {
    this.statusCode = statusCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status_message")
  public String getStatusMessage() {
    return statusMessage;
  }
  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseStructuredDefaultResponseStatus {\n");
    
    sb.append("  statusCode: ").append(statusCode).append("\n");
    sb.append("  statusMessage: ").append(statusMessage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
