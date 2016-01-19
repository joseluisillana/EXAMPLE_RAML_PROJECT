package io.swagger.model;

import io.swagger.model.InputBodyStructuredLogInboundCallLocationGeolocation;
import io.swagger.model.InputBodyStructuredLogInboundCallLocationBranch;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class InputBodyStructuredLogInboundCallLocation  {
  
  private InputBodyStructuredLogInboundCallLocationBranch branch = null;
  private InputBodyStructuredLogInboundCallLocationGeolocation geolocation = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("branch")
  public InputBodyStructuredLogInboundCallLocationBranch getBranch() {
    return branch;
  }
  public void setBranch(InputBodyStructuredLogInboundCallLocationBranch branch) {
    this.branch = branch;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("geolocation")
  public InputBodyStructuredLogInboundCallLocationGeolocation getGeolocation() {
    return geolocation;
  }
  public void setGeolocation(InputBodyStructuredLogInboundCallLocationGeolocation geolocation) {
    this.geolocation = geolocation;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputBodyStructuredLogInboundCallLocation {\n");
    
    sb.append("  branch: ").append(branch).append("\n");
    sb.append("  geolocation: ").append(geolocation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
