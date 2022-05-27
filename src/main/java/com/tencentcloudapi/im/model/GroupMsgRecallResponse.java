
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.GroupMsgRecallResponseAllOf;
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
 * GroupMsgRecallResponse
 */
@JsonPropertyOrder({
  GroupMsgRecallResponse.JSON_PROPERTY_ACTION_STATUS,
  GroupMsgRecallResponse.JSON_PROPERTY_ERROR_INFO,
  GroupMsgRecallResponse.JSON_PROPERTY_ERROR_CODE,
  GroupMsgRecallResponse.JSON_PROPERTY_RECALL_RET_LIST,
  GroupMsgRecallResponse.JSON_PROPERTY_MSG_SEQ,
  GroupMsgRecallResponse.JSON_PROPERTY_RET_CODE
})

public class GroupMsgRecallResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_RECALL_RET_LIST = "RecallRetList";
  private List<GroupMsgRecallResponseAllOfRecallRetList> recallRetList = null;

  public static final String JSON_PROPERTY_MSG_SEQ = "MsgSeq";
  private Integer msgSeq;

  public static final String JSON_PROPERTY_RET_CODE = "RetCode";
  private Integer retCode;

  public GroupMsgRecallResponse() { 
  }

  public GroupMsgRecallResponse actionStatus(String actionStatus) {
    
    this.actionStatus = actionStatus;
    return this;
  }

   /**
   * 请求处理的结果，OK 表示处理成功，FAIL 表示失败
   * @return actionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求处理的结果，OK 表示处理成功，FAIL 表示失败")
  @JsonProperty(JSON_PROPERTY_ACTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActionStatus() {
    return actionStatus;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }


  public GroupMsgRecallResponse errorInfo(String errorInfo) {
    
    this.errorInfo = errorInfo;
    return this;
  }

   /**
   * 错误信息
   * @return errorInfo
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "错误信息")
  @JsonProperty(JSON_PROPERTY_ERROR_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getErrorInfo() {
    return errorInfo;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
  }


  public GroupMsgRecallResponse errorCode(Integer errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 错误码，0表示成功，非0表示失败
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "错误码，0表示成功，非0表示失败")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  public GroupMsgRecallResponse recallRetList(List<GroupMsgRecallResponseAllOfRecallRetList> recallRetList) {
    
    this.recallRetList = recallRetList;
    return this;
  }

  public GroupMsgRecallResponse addRecallRetListItem(GroupMsgRecallResponseAllOfRecallRetList recallRetListItem) {
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


  public GroupMsgRecallResponse msgSeq(Integer msgSeq) {
    
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


  public GroupMsgRecallResponse retCode(Integer retCode) {
    
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
    GroupMsgRecallResponse groupMsgRecallResponse = (GroupMsgRecallResponse) o;
    return Objects.equals(this.actionStatus, groupMsgRecallResponse.actionStatus) &&
        Objects.equals(this.errorInfo, groupMsgRecallResponse.errorInfo) &&
        Objects.equals(this.errorCode, groupMsgRecallResponse.errorCode) &&
        Objects.equals(this.recallRetList, groupMsgRecallResponse.recallRetList) &&
        Objects.equals(this.msgSeq, groupMsgRecallResponse.msgSeq) &&
        Objects.equals(this.retCode, groupMsgRecallResponse.retCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, recallRetList, msgSeq, retCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgRecallResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

