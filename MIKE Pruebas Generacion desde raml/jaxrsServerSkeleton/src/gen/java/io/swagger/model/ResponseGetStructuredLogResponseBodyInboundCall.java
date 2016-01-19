package io.swagger.model;

import io.swagger.model.ResponseGetStructuredLogResponseBodyInboundCallHealth;
import io.swagger.model.ResponseGetStructuredLogResponseBodyInboundCallCms;
import io.swagger.model.ResponseGetStructuredLogResponseBodyInboundCallMsgOut;
import io.swagger.model.ResponseGetStructuredLogResponseBodyInboundCallMsgIn;
import io.swagger.model.ResponseGetStructuredLogResponseBodyInboundCallLocation;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class ResponseGetStructuredLogResponseBodyInboundCall  {
  
  private String aap = null;
  private String additionalData = null;
  private String callId = null;
  private String callerIp = null;
  private ResponseGetStructuredLogResponseBodyInboundCallCms cms = null;
  private String custormerId = null;
  private ResponseGetStructuredLogResponseBodyInboundCallHealth health = null;
  private String hostname = null;
  private String instanceName = null;
  private String journal = null;
  private ResponseGetStructuredLogResponseBodyInboundCallLocation location = null;
  private ResponseGetStructuredLogResponseBodyInboundCallMsgIn msgIn = null;
  private ResponseGetStructuredLogResponseBodyInboundCallMsgOut msgOut = null;
  private String processId = null;
  private String processType = null;
  private String sessionId = null;
  private String userActionId = null;
  private String userAgent = null;
  private String userId = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("aap")
  public String getAap() {
    return aap;
  }
  public void setAap(String aap) {
    this.aap = aap;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("additional_data")
  public String getAdditionalData() {
    return additionalData;
  }
  public void setAdditionalData(String additionalData) {
    this.additionalData = additionalData;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("call_id")
  public String getCallId() {
    return callId;
  }
  public void setCallId(String callId) {
    this.callId = callId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("caller_ip")
  public String getCallerIp() {
    return callerIp;
  }
  public void setCallerIp(String callerIp) {
    this.callerIp = callerIp;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("cms")
  public ResponseGetStructuredLogResponseBodyInboundCallCms getCms() {
    return cms;
  }
  public void setCms(ResponseGetStructuredLogResponseBodyInboundCallCms cms) {
    this.cms = cms;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("custormer_id")
  public String getCustormerId() {
    return custormerId;
  }
  public void setCustormerId(String custormerId) {
    this.custormerId = custormerId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("health")
  public ResponseGetStructuredLogResponseBodyInboundCallHealth getHealth() {
    return health;
  }
  public void setHealth(ResponseGetStructuredLogResponseBodyInboundCallHealth health) {
    this.health = health;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("instance_name")
  public String getInstanceName() {
    return instanceName;
  }
  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("journal")
  public String getJournal() {
    return journal;
  }
  public void setJournal(String journal) {
    this.journal = journal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("location")
  public ResponseGetStructuredLogResponseBodyInboundCallLocation getLocation() {
    return location;
  }
  public void setLocation(ResponseGetStructuredLogResponseBodyInboundCallLocation location) {
    this.location = location;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("msg_in")
  public ResponseGetStructuredLogResponseBodyInboundCallMsgIn getMsgIn() {
    return msgIn;
  }
  public void setMsgIn(ResponseGetStructuredLogResponseBodyInboundCallMsgIn msgIn) {
    this.msgIn = msgIn;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("msg_out")
  public ResponseGetStructuredLogResponseBodyInboundCallMsgOut getMsgOut() {
    return msgOut;
  }
  public void setMsgOut(ResponseGetStructuredLogResponseBodyInboundCallMsgOut msgOut) {
    this.msgOut = msgOut;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("process_id")
  public String getProcessId() {
    return processId;
  }
  public void setProcessId(String processId) {
    this.processId = processId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("process_type")
  public String getProcessType() {
    return processType;
  }
  public void setProcessType(String processType) {
    this.processType = processType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("session_id")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("user_action_id")
  public String getUserActionId() {
    return userActionId;
  }
  public void setUserActionId(String userActionId) {
    this.userActionId = userActionId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("user_agent")
  public String getUserAgent() {
    return userAgent;
  }
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseGetStructuredLogResponseBodyInboundCall {\n");
    
    sb.append("  aap: ").append(aap).append("\n");
    sb.append("  additionalData: ").append(additionalData).append("\n");
    sb.append("  callId: ").append(callId).append("\n");
    sb.append("  callerIp: ").append(callerIp).append("\n");
    sb.append("  cms: ").append(cms).append("\n");
    sb.append("  custormerId: ").append(custormerId).append("\n");
    sb.append("  health: ").append(health).append("\n");
    sb.append("  hostname: ").append(hostname).append("\n");
    sb.append("  instanceName: ").append(instanceName).append("\n");
    sb.append("  journal: ").append(journal).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  msgIn: ").append(msgIn).append("\n");
    sb.append("  msgOut: ").append(msgOut).append("\n");
    sb.append("  processId: ").append(processId).append("\n");
    sb.append("  processType: ").append(processType).append("\n");
    sb.append("  sessionId: ").append(sessionId).append("\n");
    sb.append("  userActionId: ").append(userActionId).append("\n");
    sb.append("  userAgent: ").append(userAgent).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
