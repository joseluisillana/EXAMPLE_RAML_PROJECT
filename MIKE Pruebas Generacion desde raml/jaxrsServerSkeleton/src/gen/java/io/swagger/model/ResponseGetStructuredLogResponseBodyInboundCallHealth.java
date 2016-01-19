package io.swagger.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class ResponseGetStructuredLogResponseBodyInboundCallHealth  {
  
  private Long httpStatusCode = null;
  private String responseCode = null;
  private String responseStatus = null;
  private Long responseTime = null;
  private Long timestamp = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("http_status_code")
  public Long getHttpStatusCode() {
    return httpStatusCode;
  }
  public void setHttpStatusCode(Long httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("response_code")
  public String getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("response_status")
  public String getResponseStatus() {
    return responseStatus;
  }
  public void setResponseStatus(String responseStatus) {
    this.responseStatus = responseStatus;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("response_time")
  public Long getResponseTime() {
    return responseTime;
  }
  public void setResponseTime(Long responseTime) {
    this.responseTime = responseTime;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")
  public Long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseGetStructuredLogResponseBodyInboundCallHealth {\n");
    
    sb.append("  httpStatusCode: ").append(httpStatusCode).append("\n");
    sb.append("  responseCode: ").append(responseCode).append("\n");
    sb.append("  responseStatus: ").append(responseStatus).append("\n");
    sb.append("  responseTime: ").append(responseTime).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
