
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
 * DeleteGroupMsgBySenderRequest
 */
@JsonPropertyOrder({
  DeleteGroupMsgBySenderRequest.JSON_PROPERTY_GROUP_ID,
  DeleteGroupMsgBySenderRequest.JSON_PROPERTY_SENDER_ACCOUNT
})

public class DeleteGroupMsgBySenderRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_SENDER_ACCOUNT = "Sender_Account";
  private String senderAccount;

  public DeleteGroupMsgBySenderRequest() { 
  }

  public DeleteGroupMsgBySenderRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 要撤回消息的群 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "要撤回消息的群 ID")
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


  public DeleteGroupMsgBySenderRequest senderAccount(String senderAccount) {
    
    this.senderAccount = senderAccount;
    return this;
  }

   /**
   * 被撤回消息的发送者 ID
   * @return senderAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "被撤回消息的发送者 ID")
  @JsonProperty(JSON_PROPERTY_SENDER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSenderAccount() {
    return senderAccount;
  }


  @JsonProperty(JSON_PROPERTY_SENDER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSenderAccount(String senderAccount) {
    this.senderAccount = senderAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderRequest = (DeleteGroupMsgBySenderRequest) o;
    return Objects.equals(this.groupId, deleteGroupMsgBySenderRequest.groupId) &&
        Objects.equals(this.senderAccount, deleteGroupMsgBySenderRequest.senderAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, senderAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteGroupMsgBySenderRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    senderAccount: ").append(toIndentedString(senderAccount)).append("\n");
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

