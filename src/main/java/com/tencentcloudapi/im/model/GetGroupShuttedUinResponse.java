
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.GetGroupShuttedUinResponseAllOf;
import com.tencentcloudapi.im.model.GetGroupShuttedUinResponseAllOfShuttedUinList;
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
 * GetGroupShuttedUinResponse
 */
@JsonPropertyOrder({
  GetGroupShuttedUinResponse.JSON_PROPERTY_ACTION_STATUS,
  GetGroupShuttedUinResponse.JSON_PROPERTY_ERROR_INFO,
  GetGroupShuttedUinResponse.JSON_PROPERTY_ERROR_CODE,
  GetGroupShuttedUinResponse.JSON_PROPERTY_SHUTTED_UIN_LIST
})

public class GetGroupShuttedUinResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_SHUTTED_UIN_LIST = "ShuttedUinList";
  private List<GetGroupShuttedUinResponseAllOfShuttedUinList> shuttedUinList = null;

  public GetGroupShuttedUinResponse() { 
  }

  public GetGroupShuttedUinResponse actionStatus(String actionStatus) {
    
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


  public GetGroupShuttedUinResponse errorInfo(String errorInfo) {
    
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


  public GetGroupShuttedUinResponse errorCode(Integer errorCode) {
    
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


  public GetGroupShuttedUinResponse shuttedUinList(List<GetGroupShuttedUinResponseAllOfShuttedUinList> shuttedUinList) {
    
    this.shuttedUinList = shuttedUinList;
    return this;
  }

  public GetGroupShuttedUinResponse addShuttedUinListItem(GetGroupShuttedUinResponseAllOfShuttedUinList shuttedUinListItem) {
    if (this.shuttedUinList == null) {
      this.shuttedUinList = new ArrayList<>();
    }
    this.shuttedUinList.add(shuttedUinListItem);
    return this;
  }

   /**
   * 返回结果为禁言用户信息数组，内容包括被禁言的成员 ID，及其被禁言到的时间（使用 UTC 时间，即世界协调时间）
   * @return shuttedUinList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "返回结果为禁言用户信息数组，内容包括被禁言的成员 ID，及其被禁言到的时间（使用 UTC 时间，即世界协调时间）")
  @JsonProperty(JSON_PROPERTY_SHUTTED_UIN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetGroupShuttedUinResponseAllOfShuttedUinList> getShuttedUinList() {
    return shuttedUinList;
  }


  @JsonProperty(JSON_PROPERTY_SHUTTED_UIN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShuttedUinList(List<GetGroupShuttedUinResponseAllOfShuttedUinList> shuttedUinList) {
    this.shuttedUinList = shuttedUinList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupShuttedUinResponse getGroupShuttedUinResponse = (GetGroupShuttedUinResponse) o;
    return Objects.equals(this.actionStatus, getGroupShuttedUinResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getGroupShuttedUinResponse.errorInfo) &&
        Objects.equals(this.errorCode, getGroupShuttedUinResponse.errorCode) &&
        Objects.equals(this.shuttedUinList, getGroupShuttedUinResponse.shuttedUinList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, shuttedUinList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupShuttedUinResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    shuttedUinList: ").append(toIndentedString(shuttedUinList)).append("\n");
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

