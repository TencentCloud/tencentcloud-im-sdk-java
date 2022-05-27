
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetGroupShuttedUinResponseAllOfShuttedUinList
 */
@JsonPropertyOrder({
  GetGroupShuttedUinResponseAllOfShuttedUinList.JSON_PROPERTY_MEMBER_ACCOUNT,
  GetGroupShuttedUinResponseAllOfShuttedUinList.JSON_PROPERTY_SHUTTED_UNTIL
})
@JsonTypeName("GetGroupShuttedUinResponse_allOf_ShuttedUinList")

public class GetGroupShuttedUinResponseAllOfShuttedUinList {
  public static final String JSON_PROPERTY_MEMBER_ACCOUNT = "Member_Account";
  private String memberAccount;

  public static final String JSON_PROPERTY_SHUTTED_UNTIL = "ShuttedUntil";
  private Integer shuttedUntil;

  public GetGroupShuttedUinResponseAllOfShuttedUinList() { 
  }

  public GetGroupShuttedUinResponseAllOfShuttedUinList memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * 用户 ID
   * @return memberAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户 ID")
  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemberAccount() {
    return memberAccount;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  public GetGroupShuttedUinResponseAllOfShuttedUinList shuttedUntil(Integer shuttedUntil) {
    
    this.shuttedUntil = shuttedUntil;
    return this;
  }

   /**
   * 禁言到的时间（使用 UTC 时间，即世界协调时间）
   * @return shuttedUntil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "禁言到的时间（使用 UTC 时间，即世界协调时间）")
  @JsonProperty(JSON_PROPERTY_SHUTTED_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getShuttedUntil() {
    return shuttedUntil;
  }


  @JsonProperty(JSON_PROPERTY_SHUTTED_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShuttedUntil(Integer shuttedUntil) {
    this.shuttedUntil = shuttedUntil;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupShuttedUinResponseAllOfShuttedUinList getGroupShuttedUinResponseAllOfShuttedUinList = (GetGroupShuttedUinResponseAllOfShuttedUinList) o;
    return Objects.equals(this.memberAccount, getGroupShuttedUinResponseAllOfShuttedUinList.memberAccount) &&
        Objects.equals(this.shuttedUntil, getGroupShuttedUinResponseAllOfShuttedUinList.shuttedUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAccount, shuttedUntil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupShuttedUinResponseAllOfShuttedUinList {\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    shuttedUntil: ").append(toIndentedString(shuttedUntil)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

