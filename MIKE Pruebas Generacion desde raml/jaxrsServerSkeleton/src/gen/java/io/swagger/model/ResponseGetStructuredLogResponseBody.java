package io.swagger.model;

import io.swagger.model.ResponseGetStructuredLogResponseBodyInboundCall;
import io.swagger.model.ResponseGetStructuredLogResponseBodyOutboundCalls;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class ResponseGetStructuredLogResponseBody  {
  
  private ResponseGetStructuredLogResponseBodyInboundCall inboundCall = null;
  private List<ResponseGetStructuredLogResponseBodyOutboundCalls> outboundCalls = new ArrayList<ResponseGetStructuredLogResponseBodyOutboundCalls>();
  private String srvHref = null;
  private String srvId = null;
  private String srvType = null;
  private String uuaa = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("inbound_call")
  public ResponseGetStructuredLogResponseBodyInboundCall getInboundCall() {
    return inboundCall;
  }
  public void setInboundCall(ResponseGetStructuredLogResponseBodyInboundCall inboundCall) {
    this.inboundCall = inboundCall;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("outbound_calls")
  public List<ResponseGetStructuredLogResponseBodyOutboundCalls> getOutboundCalls() {
    return outboundCalls;
  }
  public void setOutboundCalls(List<ResponseGetStructuredLogResponseBodyOutboundCalls> outboundCalls) {
    this.outboundCalls = outboundCalls;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("srv_href")
  public String getSrvHref() {
    return srvHref;
  }
  public void setSrvHref(String srvHref) {
    this.srvHref = srvHref;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("srv_id")
  public String getSrvId() {
    return srvId;
  }
  public void setSrvId(String srvId) {
    this.srvId = srvId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("srv_type")
  public String getSrvType() {
    return srvType;
  }
  public void setSrvType(String srvType) {
    this.srvType = srvType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("uuaa")
  public String getUuaa() {
    return uuaa;
  }
  public void setUuaa(String uuaa) {
    this.uuaa = uuaa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseGetStructuredLogResponseBody {\n");
    
    sb.append("  inboundCall: ").append(inboundCall).append("\n");
    sb.append("  outboundCalls: ").append(outboundCalls).append("\n");
    sb.append("  srvHref: ").append(srvHref).append("\n");
    sb.append("  srvId: ").append(srvId).append("\n");
    sb.append("  srvType: ").append(srvType).append("\n");
    sb.append("  uuaa: ").append(uuaa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
