package io.swagger.model;

import io.swagger.model.InputBodyStructuredLogInboundCallMsgInBody;
import io.swagger.model.InputBodyStructuredLogInboundCallMsgInHeader;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class InputBodyStructuredLogInboundCallMsgIn  {
  
  private InputBodyStructuredLogInboundCallMsgInBody body = null;
  private InputBodyStructuredLogInboundCallMsgInHeader header = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("body")
  public InputBodyStructuredLogInboundCallMsgInBody getBody() {
    return body;
  }
  public void setBody(InputBodyStructuredLogInboundCallMsgInBody body) {
    this.body = body;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("header")
  public InputBodyStructuredLogInboundCallMsgInHeader getHeader() {
    return header;
  }
  public void setHeader(InputBodyStructuredLogInboundCallMsgInHeader header) {
    this.header = header;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputBodyStructuredLogInboundCallMsgIn {\n");
    
    sb.append("  body: ").append(body).append("\n");
    sb.append("  header: ").append(header).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
