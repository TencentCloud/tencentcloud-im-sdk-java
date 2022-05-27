
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.GroupMsgRecallResponseAllOfRecallRetList;
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
 * GroupMsgRecallResponseAllOf
 */
@JsonPropertyOrder({
  GroupMsgRecallResponseAllOf.JSON_PROPERTY_RECALL_RET_LIST,
  GroupMsgRecallResponseAllOf.JSON_PROPERTY_MSG_SEQ,
  GroupMsgRecallResponseAllOf.JSON_PROPERTY_RET_CODE
})
@JsonTypeName("GroupMsgRecallResponse_allOf")

public class GroupMsgRecallResponseAllOf {
  public static final String JSON_PROPERTY_RECALL_RET_LIST = "RecallRetList";
  private List<GroupMsgRecallResponseAllOfRecallRetList> recallRetList = null;

  public static final String JSON_PROPERTY_MSG_SEQ = "MsgSeq";
  private Integer msgSeq;

  public static final String JSON_PROPERTY_RET_CODE = "RetCode";
  private Integer retCode;

  public GroupMsgRecallResponseAllOf() { 
  }

  public GroupMsgRecallResponseAllOf recallRetList(List<GroupMsgRecallResponseAllOfRecallRetList> recallRetList) {
    
    this.recallRetList = recallRetList;
    return this;
  }

  public GroupMsgRecallResponseAllOf addRecallRetListItem(GroupMsgRecallResponseAllOfRecallRetList recallRetListItem) {
    if (this.recallRetList == null) {
      this.recallRetList = new ArrayList<>();
    }
    this.recallRetList.add(recallRetListItem);
    return this;
  }

   /**
   * 消息撤回请求的详细结果
   * @return recallRetList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "消息撤回请求的详细结果")
  @JsonProperty(JSON_PROPERTY_RECALL_RET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GroupMsgRecallResponseAllOfRecallRetList> getRecallRetList() {
    return recallRetList;
  }


  @JsonProperty(JSON_PROPERTY_RECALL_RET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecallRetList(List<GroupMsgRecallResponseAllOfRecallRetList> recallRetList) {
    this.recallRetList = recallRetList;
  }


  public GroupMsgRecallResponseAllOf msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * 单个被撤回消息的 seq
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单个被撤回消息的 seq")
  @JsonProperty(JSON_PROPERTY_MSG_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMsgSeq() {
    return msgSeq;
  }


  @JsonProperty(JSON_PROPERTY_MSG_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgSeq(Integer msgSeq) {
    this.msgSeq = msgSeq;
  }


  public GroupMsgRecallResponseAllOf retCode(Integer retCode) {
    
    this.retCode = retCode;
    return this;
  }

   /**
   * 单个消息的被撤回结果：0表示成功；其它表示失败，参考下文错误码说明
   * @return retCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单个消息的被撤回结果：0表示成功；其它表示失败，参考下文错误码说明")
  @JsonProperty(JSON_PROPERTY_RET_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRetCode() {
    return retCode;
  }


  @JsonProperty(JSON_PROPERTY_RET_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetCode(Integer retCode) {
    this.retCode = retCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMsgRecallResponseAllOf groupMsgRecallResponseAllOf = (GroupMsgRecallResponseAllOf) o;
    return Objects.equals(this.recallRetList, groupMsgRecallResponseAllOf.recallRetList) &&
        Objects.equals(this.msgSeq, groupMsgRecallResponseAllOf.msgSeq) &&
        Objects.equals(this.retCode, groupMsgRecallResponseAllOf.retCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recallRetList, msgSeq, retCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgRecallResponseAllOf {\n");
    sb.append("    recallRetList: ").append(toIndentedString(recallRetList)).append("\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
    sb.append("    retCode: ").append(toIndentedString(retCode)).append("\n");
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

