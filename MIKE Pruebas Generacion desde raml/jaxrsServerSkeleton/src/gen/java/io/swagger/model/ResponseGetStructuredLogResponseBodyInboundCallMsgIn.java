package io.swagger.model;

import io.swagger.model.ResponseGetStructuredLogResponseBodyInboundCallMsgInBody;
import io.swagger.model.ResponseGetStructuredLogResponseBodyInboundCallMsgInHeader;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class ResponseGetStructuredLogResponseBodyInboundCallMsgIn  {
  
  private ResponseGetStructuredLogResponseBodyInboundCallMsgInBody body = null;
  private ResponseGetStructuredLogResponseBodyInboundCallMsgInHeader header = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("body")
  public ResponseGetStructuredLogResponseBodyInboundCallMsgInBody getBody() {
    return body;
  }
  public void setBody(ResponseGetStructuredLogResponseBodyInboundCallMsgInBody body) {
    this.body = body;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("header")
  public ResponseGetStructuredLogResponseBodyInboundCallMsgInHeader getHeader() {
    return header;
  }
  public void setHeader(ResponseGetStructuredLogResponseBodyInboundCallMsgInHeader header) {
    this.header = header;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseGetStructuredLogResponseBodyInboundCallMsgIn {\n");
    
    sb.append("  body: ").append(body).append("\n");
    sb.append("  header: ").append(header).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
