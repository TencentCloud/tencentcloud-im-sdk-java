
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.ImportGroupMsgRequestMsgListInner;
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
 * ImportGroupMsgRequest
 */
@JsonPropertyOrder({
  ImportGroupMsgRequest.JSON_PROPERTY_GROUP_ID,
  ImportGroupMsgRequest.JSON_PROPERTY_RECENT_CONTACT_FLAG,
  ImportGroupMsgRequest.JSON_PROPERTY_MSG_LIST
})

public class ImportGroupMsgRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_RECENT_CONTACT_FLAG = "RecentContactFlag";
  private Integer recentContactFlag;

  public static final String JSON_PROPERTY_MSG_LIST = "MsgList";
  private List<ImportGroupMsgRequestMsgListInner> msgList = new ArrayList<>();

  public ImportGroupMsgRequest() { 
  }

  public ImportGroupMsgRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 要导入消息的群 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "要导入消息的群 ID")
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


  public ImportGroupMsgRequest recentContactFlag(Integer recentContactFlag) {
    
    this.recentContactFlag = recentContactFlag;
    return this;
  }

   /**
   * 会话更新识别，为1的时候标识触发会话更新，默认不触发（avchatroom 群不支持）。
   * @return recentContactFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会话更新识别，为1的时候标识触发会话更新，默认不触发（avchatroom 群不支持）。")
  @JsonProperty(JSON_PROPERTY_RECENT_CONTACT_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRecentContactFlag() {
    return recentContactFlag;
  }


  @JsonProperty(JSON_PROPERTY_RECENT_CONTACT_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecentContactFlag(Integer recentContactFlag) {
    this.recentContactFlag = recentContactFlag;
  }


  public ImportGroupMsgRequest msgList(List<ImportGroupMsgRequestMsgListInner> msgList) {
    
    this.msgList = msgList;
    return this;
  }

  public ImportGroupMsgRequest addMsgListItem(ImportGroupMsgRequestMsgListInner msgListItem) {
    this.msgList.add(msgListItem);
    return this;
  }

   /**
   * 导入的消息列表
   * @return msgList
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "导入的消息列表")
  @JsonProperty(JSON_PROPERTY_MSG_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ImportGroupMsgRequestMsgListInner> getMsgList() {
    return msgList;
  }


  @JsonProperty(JSON_PROPERTY_MSG_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsgList(List<ImportGroupMsgRequestMsgListInner> msgList) {
    this.msgList = msgList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupMsgRequest importGroupMsgRequest = (ImportGroupMsgRequest) o;
    return Objects.equals(this.groupId, importGroupMsgRequest.groupId) &&
        Objects.equals(this.recentContactFlag, importGroupMsgRequest.recentContactFlag) &&
        Objects.equals(this.msgList, importGroupMsgRequest.msgList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, recentContactFlag, msgList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMsgRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    recentContactFlag: ").append(toIndentedString(recentContactFlag)).append("\n");
    sb.append("    msgList: ").append(toIndentedString(msgList)).append("\n");
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

