package io.swagger.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class InputBodyStructuredLogInboundCallLocationBranchBranchAddress  {
  
  private String country = null;
  private Long postCode = null;
  private Long province = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("post_code")
  public Long getPostCode() {
    return postCode;
  }
  public void setPostCode(Long postCode) {
    this.postCode = postCode;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("province")
  public Long getProvince() {
    return province;
  }
  public void setProvince(Long province) {
    this.province = province;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputBodyStructuredLogInboundCallLocationBranchBranchAddress {\n");
    
    sb.append("  country: ").append(country).append("\n");
    sb.append("  postCode: ").append(postCode).append("\n");
    sb.append("  province: ").append(province).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
