package io.swagger.model;

import io.swagger.model.InputBodyStructuredLogInboundCallLocationBranchBranchAddress;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-19T08:49:02.602Z")
public class InputBodyStructuredLogInboundCallLocationBranch  {
  
  private String bank = null;
  private InputBodyStructuredLogInboundCallLocationBranchBranchAddress branchAddress = null;
  private String branchCode = null;
  private String branchId = null;
  private String headBranch = null;
  private String operativeBank = null;
  private String operativeBranch = null;
  private String region = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bank")
  public String getBank() {
    return bank;
  }
  public void setBank(String bank) {
    this.bank = bank;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("branch_address")
  public InputBodyStructuredLogInboundCallLocationBranchBranchAddress getBranchAddress() {
    return branchAddress;
  }
  public void setBranchAddress(InputBodyStructuredLogInboundCallLocationBranchBranchAddress branchAddress) {
    this.branchAddress = branchAddress;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("branch_code")
  public String getBranchCode() {
    return branchCode;
  }
  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("branch_id")
  public String getBranchId() {
    return branchId;
  }
  public void setBranchId(String branchId) {
    this.branchId = branchId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("head_branch")
  public String getHeadBranch() {
    return headBranch;
  }
  public void setHeadBranch(String headBranch) {
    this.headBranch = headBranch;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("operative_bank")
  public String getOperativeBank() {
    return operativeBank;
  }
  public void setOperativeBank(String operativeBank) {
    this.operativeBank = operativeBank;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("operative_branch")
  public String getOperativeBranch() {
    return operativeBranch;
  }
  public void setOperativeBranch(String operativeBranch) {
    this.operativeBranch = operativeBranch;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputBodyStructuredLogInboundCallLocationBranch {\n");
    
    sb.append("  bank: ").append(bank).append("\n");
    sb.append("  branchAddress: ").append(branchAddress).append("\n");
    sb.append("  branchCode: ").append(branchCode).append("\n");
    sb.append("  branchId: ").append(branchId).append("\n");
    sb.append("  headBranch: ").append(headBranch).append("\n");
    sb.append("  operativeBank: ").append(operativeBank).append("\n");
    sb.append("  operativeBranch: ").append(operativeBranch).append("\n");
    sb.append("  region: ").append(region).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
