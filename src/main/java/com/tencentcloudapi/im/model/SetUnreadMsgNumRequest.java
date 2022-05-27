
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
 * SetUnreadMsgNumRequest
 */
@JsonPropertyOrder({
  SetUnreadMsgNumRequest.JSON_PROPERTY_GROUP_ID,
  SetUnreadMsgNumRequest.JSON_PROPERTY_MEMBER_ACCOUNT,
  SetUnreadMsgNumRequest.JSON_PROPERTY_UNREAD_MSG_NUM
})

public class SetUnreadMsgNumRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_MEMBER_ACCOUNT = "Member_Account";
  private String memberAccount;

  public static final String JSON_PROPERTY_UNREAD_MSG_NUM = "UnreadMsgNum";
  private Integer unreadMsgNum;

  public SetUnreadMsgNumRequest() { 
  }

  public SetUnreadMsgNumRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 操作的群 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "操作的群 ID")
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


  public SetUnreadMsgNumRequest memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * 要操作的群成员
   * @return memberAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "要操作的群成员")
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


  public SetUnreadMsgNumRequest unreadMsgNum(Integer unreadMsgNum) {
    
    this.unreadMsgNum = unreadMsgNum;
    return this;
  }

   /**
   * 成员未读消息数
   * @return unreadMsgNum
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "成员未读消息数")
  @JsonProperty(JSON_PROPERTY_UNREAD_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUnreadMsgNum() {
    return unreadMsgNum;
  }


  @JsonProperty(JSON_PROPERTY_UNREAD_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    SetUnreadMsgNumRequest setUnreadMsgNumRequest = (SetUnreadMsgNumRequest) o;
    return Objects.equals(this.groupId, setUnreadMsgNumRequest.groupId) &&
        Objects.equals(this.memberAccount, setUnreadMsgNumRequest.memberAccount) &&
        Objects.equals(this.unreadMsgNum, setUnreadMsgNumRequest.unreadMsgNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, memberAccount, unreadMsgNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetUnreadMsgNumRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
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

