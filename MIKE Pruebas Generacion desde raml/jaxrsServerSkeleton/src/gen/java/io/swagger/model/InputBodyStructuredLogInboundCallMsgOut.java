package io.swagger.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class InputBodyStructuredLogInboundCallMsgOut  {
  
  private String body = null;
  private String header = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("header")
  public String getHeader() {
    return header;
  }
  public void setHeader(String header) {
    this.header = header;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputBodyStructuredLogInboundCallMsgOut {\n");
    
    sb.append("  body: ").append(body).append("\n");
    sb.append("  header: ").append(header).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
