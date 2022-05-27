
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
 * GetRecentContactListGroupGetResponseAllOfSessionItem
 */
@JsonPropertyOrder({
  GetRecentContactListGroupGetResponseAllOfSessionItem.JSON_PROPERTY_TYPE,
  GetRecentContactListGroupGetResponseAllOfSessionItem.JSON_PROPERTY_TO_ACCOUNT,
  GetRecentContactListGroupGetResponseAllOfSessionItem.JSON_PROPERTY_GROUP_ID,
  GetRecentContactListGroupGetResponseAllOfSessionItem.JSON_PROPERTY_MSG_TIME,
  GetRecentContactListGroupGetResponseAllOfSessionItem.JSON_PROPERTY_TOP_FLAG
})
@JsonTypeName("GetRecentContactListGroupGetResponse_allOf_SessionItem")

public class GetRecentContactListGroupGetResponseAllOfSessionItem {
  public static final String JSON_PROPERTY_TYPE = "Type";
  private Integer type;

  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_MSG_TIME = "MsgTime";
  private Integer msgTime;

  public static final String JSON_PROPERTY_TOP_FLAG = "TopFlag";
  private Integer topFlag;

  public GetRecentContactListGroupGetResponseAllOfSessionItem() { 
  }

  public GetRecentContactListGroupGetResponseAllOfSessionItem type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * 会话类型：1 表示 C2C 会话；2 表示 G2C 会话
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会话类型：1 表示 C2C 会话；2 表示 G2C 会话")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(Integer type) {
    this.type = type;
  }


  public GetRecentContactListGroupGetResponseAllOfSessionItem toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * C2C 会话才会返回，返回会话方的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "C2C 会话才会返回，返回会话方的 UserID")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public GetRecentContactListGroupGetResponseAllOfSessionItem groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * G2C 会话才会返回，返回群 ID
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "G2C 会话才会返回，返回群 ID")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public GetRecentContactListGroupGetResponseAllOfSessionItem msgTime(Integer msgTime) {
    
    this.msgTime = msgTime;
    return this;
  }

   /**
   * 会话时间
   * @return msgTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会话时间")
  @JsonProperty(JSON_PROPERTY_MSG_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMsgTime() {
    return msgTime;
  }


  @JsonProperty(JSON_PROPERTY_MSG_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgTime(Integer msgTime) {
    this.msgTime = msgTime;
  }


  public GetRecentContactListGroupGetResponseAllOfSessionItem topFlag(Integer topFlag) {
    
    this.topFlag = topFlag;
    return this;
  }

   /**
   * 置顶标记：0 标识普通会话；1 标识置顶会话
   * @return topFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "置顶标记：0 标识普通会话；1 标识置顶会话")
  @JsonProperty(JSON_PROPERTY_TOP_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTopFlag() {
    return topFlag;
  }


  @JsonProperty(JSON_PROPERTY_TOP_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopFlag(Integer topFlag) {
    this.topFlag = topFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecentContactListGroupGetResponseAllOfSessionItem getRecentContactListGroupGetResponseAllOfSessionItem = (GetRecentContactListGroupGetResponseAllOfSessionItem) o;
    return Objects.equals(this.type, getRecentContactListGroupGetResponseAllOfSessionItem.type) &&
        Objects.equals(this.toAccount, getRecentContactListGroupGetResponseAllOfSessionItem.toAccount) &&
        Objects.equals(this.groupId, getRecentContactListGroupGetResponseAllOfSessionItem.groupId) &&
        Objects.equals(this.msgTime, getRecentContactListGroupGetResponseAllOfSessionItem.msgTime) &&
        Objects.equals(this.topFlag, getRecentContactListGroupGetResponseAllOfSessionItem.topFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, toAccount, groupId, msgTime, topFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecentContactListGroupGetResponseAllOfSessionItem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    msgTime: ").append(toIndentedString(msgTime)).append("\n");
    sb.append("    topFlag: ").append(toIndentedString(topFlag)).append("\n");
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

