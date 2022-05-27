
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ForbidSendMsgRequest
 */
@JsonPropertyOrder({
  ForbidSendMsgRequest.JSON_PROPERTY_GROUP_ID,
  ForbidSendMsgRequest.JSON_PROPERTY_MEMBERS_ACCOUNT,
  ForbidSendMsgRequest.JSON_PROPERTY_SHUT_UP_TIME
})

public class ForbidSendMsgRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_MEMBERS_ACCOUNT = "Members_Account";
  private List<String> membersAccount = new ArrayList<>();

  public static final String JSON_PROPERTY_SHUT_UP_TIME = "ShutUpTime";
  private Integer shutUpTime;

  public ForbidSendMsgRequest() { 
  }

  public ForbidSendMsgRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 需要查询的群组 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要查询的群组 ID")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ForbidSendMsgRequest membersAccount(List<String> membersAccount) {
    
    this.membersAccount = membersAccount;
    return this;
  }

  public ForbidSendMsgRequest addMembersAccountItem(String membersAccountItem) {
    this.membersAccount.add(membersAccountItem);
    return this;
  }

   /**
   * 需要禁言的用户帐号，最多支持500个帐号
   * @return membersAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
 @Size(max=500)  @ApiModelProperty(required = true, value = "需要禁言的用户帐号，最多支持500个帐号")
  @JsonProperty(JSON_PROPERTY_MEMBERS_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getMembersAccount() {
    return membersAccount;
  }


  @JsonProperty(JSON_PROPERTY_MEMBERS_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMembersAccount(List<String> membersAccount) {
    this.membersAccount = membersAccount;
  }


  public ForbidSendMsgRequest shutUpTime(Integer shutUpTime) {
    
    this.shutUpTime = shutUpTime;
    return this;
  }

   /**
   * 无符号类型。需禁言时间，单位为秒，为0时表示取消禁言，4294967295为永久禁言。
   * @return shutUpTime
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "无符号类型。需禁言时间，单位为秒，为0时表示取消禁言，4294967295为永久禁言。")
  @JsonProperty(JSON_PROPERTY_SHUT_UP_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getShutUpTime() {
    return shutUpTime;
  }


  @JsonProperty(JSON_PROPERTY_SHUT_UP_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShutUpTime(Integer shutUpTime) {
    this.shutUpTime = shutUpTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForbidSendMsgRequest forbidSendMsgRequest = (ForbidSendMsgRequest) o;
    return Objects.equals(this.groupId, forbidSendMsgRequest.groupId) &&
        Objects.equals(this.membersAccount, forbidSendMsgRequest.membersAccount) &&
        Objects.equals(this.shutUpTime, forbidSendMsgRequest.shutUpTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, membersAccount, shutUpTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForbidSendMsgRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    membersAccount: ").append(toIndentedString(membersAccount)).append("\n");
    sb.append("    shutUpTime: ").append(toIndentedString(shutUpTime)).append("\n");
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

