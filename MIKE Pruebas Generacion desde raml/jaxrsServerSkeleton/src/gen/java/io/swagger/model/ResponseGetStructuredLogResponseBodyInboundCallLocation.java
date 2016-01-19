package io.swagger.model;

import io.swagger.model.ResponseGetStructuredLogResponseBodyInboundCallLocationBranch;
import io.swagger.model.ResponseGetStructuredLogResponseBodyInboundCallLocationGeolocation;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class ResponseGetStructuredLogResponseBodyInboundCallLocation  {
  
  private ResponseGetStructuredLogResponseBodyInboundCallLocationBranch branch = null;
  private ResponseGetStructuredLogResponseBodyInboundCallLocationGeolocation geolocation = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("branch")
  public ResponseGetStructuredLogResponseBodyInboundCallLocationBranch getBranch() {
    return branch;
  }
  public void setBranch(ResponseGetStructuredLogResponseBodyInboundCallLocationBranch branch) {
    this.branch = branch;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("geolocation")
  public ResponseGetStructuredLogResponseBodyInboundCallLocationGeolocation getGeolocation() {
    return geolocation;
  }
  public void setGeolocation(ResponseGetStructuredLogResponseBodyInboundCallLocationGeolocation geolocation) {
    this.geolocation = geolocation;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseGetStructuredLogResponseBodyInboundCallLocation {\n");
    
    sb.append("  branch: ").append(branch).append("\n");
    sb.append("  geolocation: ").append(geolocation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
