
package tencentcloud.im.model;

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
import tencentcloud.im.model.CommonResponse;
import tencentcloud.im.model.GroupMsgGetSimpleResponseAllOf;
import tencentcloud.im.model.GroupMsgGetSimpleResponseAllOfRspMsgList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GroupMsgGetSimpleResponse
 */
@JsonPropertyOrder({
  GroupMsgGetSimpleResponse.JSON_PROPERTY_ACTION_STATUS,
  GroupMsgGetSimpleResponse.JSON_PROPERTY_ERROR_INFO,
  GroupMsgGetSimpleResponse.JSON_PROPERTY_ERROR_CODE,
  GroupMsgGetSimpleResponse.JSON_PROPERTY_GROUP_ID,
  GroupMsgGetSimpleResponse.JSON_PROPERTY_IS_FINISHED,
  GroupMsgGetSimpleResponse.JSON_PROPERTY_RSP_MSG_LIST
})

public class GroupMsgGetSimpleResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_IS_FINISHED = "IsFinished";
  private Integer isFinished;

  public static final String JSON_PROPERTY_RSP_MSG_LIST = "RspMsgList";
  private List<GroupMsgGetSimpleResponseAllOfRspMsgList> rspMsgList = null;

  public GroupMsgGetSimpleResponse() { 
  }

  public GroupMsgGetSimpleResponse actionStatus(String actionStatus) {
    
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


  public GroupMsgGetSimpleResponse errorInfo(String errorInfo) {
    
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


  public GroupMsgGetSimpleResponse errorCode(Integer errorCode) {
    
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


  public GroupMsgGetSimpleResponse groupId(String groupId) {
    
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


  public GroupMsgGetSimpleResponse isFinished(Integer isFinished) {
    
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


  public GroupMsgGetSimpleResponse rspMsgList(List<GroupMsgGetSimpleResponseAllOfRspMsgList> rspMsgList) {
    
    this.rspMsgList = rspMsgList;
    return this;
  }

  public GroupMsgGetSimpleResponse addRspMsgListItem(GroupMsgGetSimpleResponseAllOfRspMsgList rspMsgListItem) {
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
    GroupMsgGetSimpleResponse groupMsgGetSimpleResponse = (GroupMsgGetSimpleResponse) o;
    return Objects.equals(this.actionStatus, groupMsgGetSimpleResponse.actionStatus) &&
        Objects.equals(this.errorInfo, groupMsgGetSimpleResponse.errorInfo) &&
        Objects.equals(this.errorCode, groupMsgGetSimpleResponse.errorCode) &&
        Objects.equals(this.groupId, groupMsgGetSimpleResponse.groupId) &&
        Objects.equals(this.isFinished, groupMsgGetSimpleResponse.isFinished) &&
        Objects.equals(this.rspMsgList, groupMsgGetSimpleResponse.rspMsgList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, groupId, isFinished, rspMsgList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgGetSimpleResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

