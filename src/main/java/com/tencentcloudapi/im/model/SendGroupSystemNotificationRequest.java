
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
 * SendGroupSystemNotificationRequest
 */
@JsonPropertyOrder({
  SendGroupSystemNotificationRequest.JSON_PROPERTY_GROUP_ID,
  SendGroupSystemNotificationRequest.JSON_PROPERTY_TO_MEMBERS_ACCOUNT,
  SendGroupSystemNotificationRequest.JSON_PROPERTY_CONTENT
})

public class SendGroupSystemNotificationRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_TO_MEMBERS_ACCOUNT = "ToMembers_Account";
  private List<String> toMembersAccount = null;

  public static final String JSON_PROPERTY_CONTENT = "Content";
  private String content;

  public SendGroupSystemNotificationRequest() { 
  }

  public SendGroupSystemNotificationRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 向哪个群组发送系统通知
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "向哪个群组发送系统通知")
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


  public SendGroupSystemNotificationRequest toMembersAccount(List<String> toMembersAccount) {
    
    this.toMembersAccount = toMembersAccount;
    return this;
  }

  public SendGroupSystemNotificationRequest addToMembersAccountItem(String toMembersAccountItem) {
    if (this.toMembersAccount == null) {
      this.toMembersAccount = new ArrayList<>();
    }
    this.toMembersAccount.add(toMembersAccountItem);
    return this;
  }

   /**
   * 接收者群成员列表，请填写接收者 UserID，最多填写500个，不填或为空表示全员下发
   * @return toMembersAccount
  **/
  @javax.annotation.Nullable
 @Size(max=500)  @ApiModelProperty(value = "接收者群成员列表，请填写接收者 UserID，最多填写500个，不填或为空表示全员下发")
  @JsonProperty(JSON_PROPERTY_TO_MEMBERS_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getToMembersAccount() {
    return toMembersAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_MEMBERS_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToMembersAccount(List<String> toMembersAccount) {
    this.toMembersAccount = toMembersAccount;
  }


  public SendGroupSystemNotificationRequest content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 系统通知的内容
   * @return content
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "系统通知的内容")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendGroupSystemNotificationRequest sendGroupSystemNotificationRequest = (SendGroupSystemNotificationRequest) o;
    return Objects.equals(this.groupId, sendGroupSystemNotificationRequest.groupId) &&
        Objects.equals(this.toMembersAccount, sendGroupSystemNotificationRequest.toMembersAccount) &&
        Objects.equals(this.content, sendGroupSystemNotificationRequest.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, toMembersAccount, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendGroupSystemNotificationRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    toMembersAccount: ").append(toIndentedString(toMembersAccount)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

