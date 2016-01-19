package io.swagger.model;

import io.swagger.model.InputBodyStructuredLogInboundCall;
import io.swagger.model.InputBodyStructuredLogOutboundCalls;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class InputBodyStructuredLog  {
  
  private InputBodyStructuredLogInboundCall inboundCall = null;
  private List<InputBodyStructuredLogOutboundCalls> outboundCalls = new ArrayList<InputBodyStructuredLogOutboundCalls>();
  private String schemaVersion = null;
  private String srvHref = null;
  private String srvId = null;
  private String srvType = null;
  private String uuaa = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("inbound_call")
  public InputBodyStructuredLogInboundCall getInboundCall() {
    return inboundCall;
  }
  public void setInboundCall(InputBodyStructuredLogInboundCall inboundCall) {
    this.inboundCall = inboundCall;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("outbound_calls")
  public List<InputBodyStructuredLogOutboundCalls> getOutboundCalls() {
    return outboundCalls;
  }
  public void setOutboundCalls(List<InputBodyStructuredLogOutboundCalls> outboundCalls) {
    this.outboundCalls = outboundCalls;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("schema_version")
  public String getSchemaVersion() {
    return schemaVersion;
  }
  public void setSchemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("srv_href")
  public String getSrvHref() {
    return srvHref;
  }
  public void setSrvHref(String srvHref) {
    this.srvHref = srvHref;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("srv_id")
  public String getSrvId() {
    return srvId;
  }
  public void setSrvId(String srvId) {
    this.srvId = srvId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("srv_type")
  public String getSrvType() {
    return srvType;
  }
  public void setSrvType(String srvType) {
    this.srvType = srvType;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    sb.append("class InputBodyStructuredLog {\n");
    
    sb.append("  inboundCall: ").append(inboundCall).append("\n");
    sb.append("  outboundCalls: ").append(outboundCalls).append("\n");
    sb.append("  schemaVersion: ").append(schemaVersion).append("\n");
    sb.append("  srvHref: ").append(srvHref).append("\n");
    sb.append("  srvId: ").append(srvId).append("\n");
    sb.append("  srvType: ").append(srvType).append("\n");
    sb.append("  uuaa: ").append(uuaa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
