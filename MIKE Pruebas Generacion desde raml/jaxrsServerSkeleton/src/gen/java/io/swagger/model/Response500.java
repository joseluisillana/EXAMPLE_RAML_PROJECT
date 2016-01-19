package io.swagger.model;

import io.swagger.model.Response500ResponseStatus;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class Response500  {
  
  private Response500ResponseStatus responseStatus = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("response_status")
  public Response500ResponseStatus getResponseStatus() {
    return responseStatus;
  }
  public void setResponseStatus(Response500ResponseStatus responseStatus) {
    this.responseStatus = responseStatus;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response500 {\n");
    
    sb.append("  responseStatus: ").append(responseStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
