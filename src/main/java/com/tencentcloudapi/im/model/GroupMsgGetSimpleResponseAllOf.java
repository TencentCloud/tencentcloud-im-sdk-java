
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.GroupMsgGetSimpleResponseAllOfRspMsgList;
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
 * GroupMsgGetSimpleResponseAllOf
 */
@JsonPropertyOrder({
  GroupMsgGetSimpleResponseAllOf.JSON_PROPERTY_GROUP_ID,
  GroupMsgGetSimpleResponseAllOf.JSON_PROPERTY_IS_FINISHED,
  GroupMsgGetSimpleResponseAllOf.JSON_PROPERTY_RSP_MSG_LIST
})
@JsonTypeName("GroupMsgGetSimpleResponse_allOf")

public class GroupMsgGetSimpleResponseAllOf {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_IS_FINISHED = "IsFinished";
  private Integer isFinished;

  public static final String JSON_PROPERTY_RSP_MSG_LIST = "RspMsgList";
  private List<GroupMsgGetSimpleResponseAllOfRspMsgList> rspMsgList = null;

  public GroupMsgGetSimpleResponseAllOf() { 
  }

  public GroupMsgGetSimpleResponseAllOf groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 请求中的群组 ID
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求中的群组 ID")
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


  public GroupMsgGetSimpleResponseAllOf isFinished(Integer isFinished) {
    
    this.isFinished = isFinished;
    return this;
  }

   /**
   * 是否返回了请求区间的全部消息 当成功返回了请求区间的全部消息时，值为1;当消息长度太长或者区间太大（超过20）导致无法返回全部消息时，值为0;当消息长度太长或者区间太大（超过20）且所有消息都过期时，值为2
   * @return isFinished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否返回了请求区间的全部消息 当成功返回了请求区间的全部消息时，值为1;当消息长度太长或者区间太大（超过20）导致无法返回全部消息时，值为0;当消息长度太长或者区间太大（超过20）且所有消息都过期时，值为2")
  @JsonProperty(JSON_PROPERTY_IS_FINISHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIsFinished() {
    return isFinished;
  }


  @JsonProperty(JSON_PROPERTY_IS_FINISHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsFinished(Integer isFinished) {
    this.isFinished = isFinished;
  }


  public GroupMsgGetSimpleResponseAllOf rspMsgList(List<GroupMsgGetSimpleResponseAllOfRspMsgList> rspMsgList) {
    
    this.rspMsgList = rspMsgList;
    return this;
  }

  public GroupMsgGetSimpleResponseAllOf addRspMsgListItem(GroupMsgGetSimpleResponseAllOfRspMsgList rspMsgListItem) {
    if (this.rspMsgList == null) {
      this.rspMsgList = new ArrayList<>();
    }
    this.rspMsgList.add(rspMsgListItem);
    return this;
  }

   /**
   * 返回的消息列表
   * @return rspMsgList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "返回的消息列表")
  @JsonProperty(JSON_PROPERTY_RSP_MSG_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GroupMsgGetSimpleResponseAllOfRspMsgList> getRspMsgList() {
    return rspMsgList;
  }


  @JsonProperty(JSON_PROPERTY_RSP_MSG_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRspMsgList(List<GroupMsgGetSimpleResponseAllOfRspMsgList> rspMsgList) {
    this.rspMsgList = rspMsgList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMsgGetSimpleResponseAllOf groupMsgGetSimpleResponseAllOf = (GroupMsgGetSimpleResponseAllOf) o;
    return Objects.equals(this.groupId, groupMsgGetSimpleResponseAllOf.groupId) &&
        Objects.equals(this.isFinished, groupMsgGetSimpleResponseAllOf.isFinished) &&
        Objects.equals(this.rspMsgList, groupMsgGetSimpleResponseAllOf.rspMsgList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, isFinished, rspMsgList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgGetSimpleResponseAllOf {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    isFinished: ").append(toIndentedString(isFinished)).append("\n");
    sb.append("    rspMsgList: ").append(toIndentedString(rspMsgList)).append("\n");
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

