
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
 * ImportGroupMemberRequestMemberListInner
 */
@JsonPropertyOrder({
  ImportGroupMemberRequestMemberListInner.JSON_PROPERTY_MEMBER_ACCOUNT,
  ImportGroupMemberRequestMemberListInner.JSON_PROPERTY_ROLE,
  ImportGroupMemberRequestMemberListInner.JSON_PROPERTY_JOIN_TIME,
  ImportGroupMemberRequestMemberListInner.JSON_PROPERTY_UNREAD_MSG_NUM
})
@JsonTypeName("ImportGroupMemberRequest_MemberList_inner")

public class ImportGroupMemberRequestMemberListInner {
  public static final String JSON_PROPERTY_MEMBER_ACCOUNT = "Member_Account";
  private String memberAccount;

  public static final String JSON_PROPERTY_ROLE = "Role";
  private String role;

  public static final String JSON_PROPERTY_JOIN_TIME = "JoinTime";
  private Integer joinTime;

  public static final String JSON_PROPERTY_UNREAD_MSG_NUM = "UnreadMsgNum";
  private Integer unreadMsgNum;

  public ImportGroupMemberRequestMemberListInner() { 
  }

  public ImportGroupMemberRequestMemberListInner memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * 待导入的群成员帐号
   * @return memberAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "待导入的群成员帐号")
  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMemberAccount() {
    return memberAccount;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  public ImportGroupMemberRequestMemberListInner role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * 待导入群成员角色；目前只支持填 Admin，不填则为普通成员 Member
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "待导入群成员角色；目前只支持填 Admin，不填则为普通成员 Member")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(String role) {
    this.role = role;
  }


  public ImportGroupMemberRequestMemberListInner joinTime(Integer joinTime) {
    
    this.joinTime = joinTime;
    return this;
  }

   /**
   * 待导入群成员的入群时间
   * @return joinTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "待导入群成员的入群时间")
  @JsonProperty(JSON_PROPERTY_JOIN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getJoinTime() {
    return joinTime;
  }


  @JsonProperty(JSON_PROPERTY_JOIN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJoinTime(Integer joinTime) {
    this.joinTime = joinTime;
  }


  public ImportGroupMemberRequestMemberListInner unreadMsgNum(Integer unreadMsgNum) {
    
    this.unreadMsgNum = unreadMsgNum;
    return this;
  }

   /**
   * 待导入群成员的未读消息计数
   * @return unreadMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "待导入群成员的未读消息计数")
  @JsonProperty(JSON_PROPERTY_UNREAD_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnreadMsgNum() {
    return unreadMsgNum;
  }


  @JsonProperty(JSON_PROPERTY_UNREAD_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnreadMsgNum(Integer unreadMsgNum) {
    this.unreadMsgNum = unreadMsgNum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupMemberRequestMemberListInner importGroupMemberRequestMemberListInner = (ImportGroupMemberRequestMemberListInner) o;
    return Objects.equals(this.memberAccount, importGroupMemberRequestMemberListInner.memberAccount) &&
        Objects.equals(this.role, importGroupMemberRequestMemberListInner.role) &&
        Objects.equals(this.joinTime, importGroupMemberRequestMemberListInner.joinTime) &&
        Objects.equals(this.unreadMsgNum, importGroupMemberRequestMemberListInner.unreadMsgNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAccount, role, joinTime, unreadMsgNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMemberRequestMemberListInner {\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
    sb.append("    unreadMsgNum: ").append(toIndentedString(unreadMsgNum)).append("\n");
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

