package io.swagger.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class ResponseGetStructuredLogResponseBodyInboundCallCms  {
  
  private Long channel = null;
  private Long medium = null;
  private Long service = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("channel")
  public Long getChannel() {
    return channel;
  }
  public void setChannel(Long channel) {
    this.channel = channel;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("medium")
  public Long getMedium() {
    return medium;
  }
  public void setMedium(Long medium) {
    this.medium = medium;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("service")
  public Long getService() {
    return service;
  }
  public void setService(Long service) {
    this.service = service;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseGetStructuredLogResponseBodyInboundCallCms {\n");
    
    sb.append("  channel: ").append(channel).append("\n");
    sb.append("  medium: ").append(medium).append("\n");
    sb.append("  service: ").append(service).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
