package io.swagger.model;

import io.swagger.model.Response201ResponseStatus;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class Response201  {
  
  private Response201ResponseStatus responseStatus = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("response_status")
  public Response201ResponseStatus getResponseStatus() {
    return responseStatus;
  }
  public void setResponseStatus(Response201ResponseStatus responseStatus) {
    this.responseStatus = responseStatus;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response201 {\n");
    
    sb.append("  responseStatus: ").append(responseStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
