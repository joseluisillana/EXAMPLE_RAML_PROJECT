package io.swagger.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class InputBodyStructuredLogInboundCallLocationGeolocation  {
  
  private String lat = null;
  private String lon = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lat")
  public String getLat() {
    return lat;
  }
  public void setLat(String lat) {
    this.lat = lat;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lon")
  public String getLon() {
    return lon;
  }
  public void setLon(String lon) {
    this.lon = lon;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputBodyStructuredLogInboundCallLocationGeolocation {\n");
    
    sb.append("  lat: ").append(lat).append("\n");
    sb.append("  lon: ").append(lon).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
