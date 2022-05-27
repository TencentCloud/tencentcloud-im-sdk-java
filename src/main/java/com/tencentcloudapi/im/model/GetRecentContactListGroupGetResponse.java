
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.GetRecentContactListGroupGetResponseAllOf;
import com.tencentcloudapi.im.model.GetRecentContactListGroupGetResponseAllOfSessionItem;
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
 * GetRecentContactListGroupGetResponse
 */
@JsonPropertyOrder({
  GetRecentContactListGroupGetResponse.JSON_PROPERTY_ACTION_STATUS,
  GetRecentContactListGroupGetResponse.JSON_PROPERTY_ERROR_INFO,
  GetRecentContactListGroupGetResponse.JSON_PROPERTY_ERROR_CODE,
  GetRecentContactListGroupGetResponse.JSON_PROPERTY_SESSION_ITEM,
  GetRecentContactListGroupGetResponse.JSON_PROPERTY_COMPLETE_FLAG,
  GetRecentContactListGroupGetResponse.JSON_PROPERTY_TIME_STAMP,
  GetRecentContactListGroupGetResponse.JSON_PROPERTY_START_INDEX,
  GetRecentContactListGroupGetResponse.JSON_PROPERTY_TOP_TIME_STAMP,
  GetRecentContactListGroupGetResponse.JSON_PROPERTY_TOP_START_INDEX,
  GetRecentContactListGroupGetResponse.JSON_PROPERTY_ERROR_DISPLAY
})

public class GetRecentContactListGroupGetResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_SESSION_ITEM = "SessionItem";
  private List<GetRecentContactListGroupGetResponseAllOfSessionItem> sessionItem = null;

  public static final String JSON_PROPERTY_COMPLETE_FLAG = "CompleteFlag";
  private Integer completeFlag;

  public static final String JSON_PROPERTY_TIME_STAMP = "TimeStamp";
  private Integer timeStamp;

  public static final String JSON_PROPERTY_START_INDEX = "StartIndex";
  private Integer startIndex;

  public static final String JSON_PROPERTY_TOP_TIME_STAMP = "TopTimeStamp";
  private Integer topTimeStamp;

  public static final String JSON_PROPERTY_TOP_START_INDEX = "TopStartIndex";
  private Integer topStartIndex;

  public static final String JSON_PROPERTY_ERROR_DISPLAY = "ErrorDisplay";
  private String errorDisplay;

  public GetRecentContactListGroupGetResponse() { 
  }

  public GetRecentContactListGroupGetResponse actionStatus(String actionStatus) {
    
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


  public GetRecentContactListGroupGetResponse errorInfo(String errorInfo) {
    
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


  public GetRecentContactListGroupGetResponse errorCode(Integer errorCode) {
    
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


  public GetRecentContactListGroupGetResponse sessionItem(List<GetRecentContactListGroupGetResponseAllOfSessionItem> sessionItem) {
    
    this.sessionItem = sessionItem;
    return this;
  }

  public GetRecentContactListGroupGetResponse addSessionItemItem(GetRecentContactListGroupGetResponseAllOfSessionItem sessionItemItem) {
    if (this.sessionItem == null) {
      this.sessionItem = new ArrayList<>();
    }
    this.sessionItem.add(sessionItemItem);
    return this;
  }

   /**
   * 会话对象数组
   * @return sessionItem
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "会话对象数组")
  @JsonProperty(JSON_PROPERTY_SESSION_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetRecentContactListGroupGetResponseAllOfSessionItem> getSessionItem() {
    return sessionItem;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionItem(List<GetRecentContactListGroupGetResponseAllOfSessionItem> sessionItem) {
    this.sessionItem = sessionItem;
  }


  public GetRecentContactListGroupGetResponse completeFlag(Integer completeFlag) {
    
    this.completeFlag = completeFlag;
    return this;
  }

   /**
   * 结束标识：1 表示已返回全量会话，0 表示还有会话没拉完
   * @return completeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结束标识：1 表示已返回全量会话，0 表示还有会话没拉完")
  @JsonProperty(JSON_PROPERTY_COMPLETE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCompleteFlag() {
    return completeFlag;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompleteFlag(Integer completeFlag) {
    this.completeFlag = completeFlag;
  }


  public GetRecentContactListGroupGetResponse timeStamp(Integer timeStamp) {
    
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * 普通会话下一页拉取的起始时间，分页拉取时通过请求包的 TimeStamp 字段带给移动通信后台
   * @return timeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "普通会话下一页拉取的起始时间，分页拉取时通过请求包的 TimeStamp 字段带给移动通信后台")
  @JsonProperty(JSON_PROPERTY_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeStamp() {
    return timeStamp;
  }


  @JsonProperty(JSON_PROPERTY_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeStamp(Integer timeStamp) {
    this.timeStamp = timeStamp;
  }


  public GetRecentContactListGroupGetResponse startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * 普通会话下一页拉取的起始位置，分页拉取时通过请求包的 StartIndex 字段带给移动通信后台
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "普通会话下一页拉取的起始位置，分页拉取时通过请求包的 StartIndex 字段带给移动通信后台")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public GetRecentContactListGroupGetResponse topTimeStamp(Integer topTimeStamp) {
    
    this.topTimeStamp = topTimeStamp;
    return this;
  }

   /**
   * 置顶会话下一页拉取的起始时间，分页拉取时通过请求包的 TopTimeStamp 字段带给移动通信后台
   * @return topTimeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "置顶会话下一页拉取的起始时间，分页拉取时通过请求包的 TopTimeStamp 字段带给移动通信后台")
  @JsonProperty(JSON_PROPERTY_TOP_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTopTimeStamp() {
    return topTimeStamp;
  }


  @JsonProperty(JSON_PROPERTY_TOP_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopTimeStamp(Integer topTimeStamp) {
    this.topTimeStamp = topTimeStamp;
  }


  public GetRecentContactListGroupGetResponse topStartIndex(Integer topStartIndex) {
    
    this.topStartIndex = topStartIndex;
    return this;
  }

   /**
   * 置顶会话下一页拉取的起始位置，分页拉取时通过请求包的 TopStartIndex 字段带给移动通信后台
   * @return topStartIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "置顶会话下一页拉取的起始位置，分页拉取时通过请求包的 TopStartIndex 字段带给移动通信后台")
  @JsonProperty(JSON_PROPERTY_TOP_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTopStartIndex() {
    return topStartIndex;
  }


  @JsonProperty(JSON_PROPERTY_TOP_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopStartIndex(Integer topStartIndex) {
    this.topStartIndex = topStartIndex;
  }


  public GetRecentContactListGroupGetResponse errorDisplay(String errorDisplay) {
    
    this.errorDisplay = errorDisplay;
    return this;
  }

   /**
   * 详细的客户端展示信息
   * @return errorDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "详细的客户端展示信息")
  @JsonProperty(JSON_PROPERTY_ERROR_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDisplay() {
    return errorDisplay;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorDisplay(String errorDisplay) {
    this.errorDisplay = errorDisplay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecentContactListGroupGetResponse getRecentContactListGroupGetResponse = (GetRecentContactListGroupGetResponse) o;
    return Objects.equals(this.actionStatus, getRecentContactListGroupGetResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getRecentContactListGroupGetResponse.errorInfo) &&
        Objects.equals(this.errorCode, getRecentContactListGroupGetResponse.errorCode) &&
        Objects.equals(this.sessionItem, getRecentContactListGroupGetResponse.sessionItem) &&
        Objects.equals(this.completeFlag, getRecentContactListGroupGetResponse.completeFlag) &&
        Objects.equals(this.timeStamp, getRecentContactListGroupGetResponse.timeStamp) &&
        Objects.equals(this.startIndex, getRecentContactListGroupGetResponse.startIndex) &&
        Objects.equals(this.topTimeStamp, getRecentContactListGroupGetResponse.topTimeStamp) &&
        Objects.equals(this.topStartIndex, getRecentContactListGroupGetResponse.topStartIndex) &&
        Objects.equals(this.errorDisplay, getRecentContactListGroupGetResponse.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, sessionItem, completeFlag, timeStamp, startIndex, topTimeStamp, topStartIndex, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecentContactListGroupGetResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    sessionItem: ").append(toIndentedString(sessionItem)).append("\n");
    sb.append("    completeFlag: ").append(toIndentedString(completeFlag)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    topTimeStamp: ").append(toIndentedString(topTimeStamp)).append("\n");
    sb.append("    topStartIndex: ").append(toIndentedString(topStartIndex)).append("\n");
    sb.append("    errorDisplay: ").append(toIndentedString(errorDisplay)).append("\n");
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

