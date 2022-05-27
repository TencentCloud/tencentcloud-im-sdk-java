
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponseAllOf;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponseAllOfErrorList;
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
 * GetC2cUnreadMsgNumResponse
 */
@JsonPropertyOrder({
  GetC2cUnreadMsgNumResponse.JSON_PROPERTY_ACTION_STATUS,
  GetC2cUnreadMsgNumResponse.JSON_PROPERTY_ERROR_INFO,
  GetC2cUnreadMsgNumResponse.JSON_PROPERTY_ERROR_CODE,
  GetC2cUnreadMsgNumResponse.JSON_PROPERTY_ALL_C2_C_UNREAD_MSG_NUM,
  GetC2cUnreadMsgNumResponse.JSON_PROPERTY_C2_C_UNREAD_MSG_NUM_LIST,
  GetC2cUnreadMsgNumResponse.JSON_PROPERTY_ERROR_LIST
})

public class GetC2cUnreadMsgNumResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_ALL_C2_C_UNREAD_MSG_NUM = "AllC2CUnreadMsgNum";
  private Integer allC2CUnreadMsgNum;

  public static final String JSON_PROPERTY_C2_C_UNREAD_MSG_NUM_LIST = "C2CUnreadMsgNumList";
  private List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> c2CUnreadMsgNumList = null;

  public static final String JSON_PROPERTY_ERROR_LIST = "ErrorList";
  private List<GetC2cUnreadMsgNumResponseAllOfErrorList> errorList = null;

  public GetC2cUnreadMsgNumResponse() { 
  }

  public GetC2cUnreadMsgNumResponse actionStatus(String actionStatus) {
    
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


  public GetC2cUnreadMsgNumResponse errorInfo(String errorInfo) {
    
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


  public GetC2cUnreadMsgNumResponse errorCode(Integer errorCode) {
    
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


  public GetC2cUnreadMsgNumResponse allC2CUnreadMsgNum(Integer allC2CUnreadMsgNum) {
    
    this.allC2CUnreadMsgNum = allC2CUnreadMsgNum;
    return this;
  }

   /**
   * 单聊消息总未读数
   * @return allC2CUnreadMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单聊消息总未读数")
  @JsonProperty(JSON_PROPERTY_ALL_C2_C_UNREAD_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAllC2CUnreadMsgNum() {
    return allC2CUnreadMsgNum;
  }


  @JsonProperty(JSON_PROPERTY_ALL_C2_C_UNREAD_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllC2CUnreadMsgNum(Integer allC2CUnreadMsgNum) {
    this.allC2CUnreadMsgNum = allC2CUnreadMsgNum;
  }


  public GetC2cUnreadMsgNumResponse c2CUnreadMsgNumList(List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> c2CUnreadMsgNumList) {
    
    this.c2CUnreadMsgNumList = c2CUnreadMsgNumList;
    return this;
  }

  public GetC2cUnreadMsgNumResponse addC2CUnreadMsgNumListItem(GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList c2CUnreadMsgNumListItem) {
    if (this.c2CUnreadMsgNumList == null) {
      this.c2CUnreadMsgNumList = new ArrayList<>();
    }
    this.c2CUnreadMsgNumList.add(c2CUnreadMsgNumListItem);
    return this;
  }

   /**
   * 单聊会话List
   * @return c2CUnreadMsgNumList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "单聊会话List")
  @JsonProperty(JSON_PROPERTY_C2_C_UNREAD_MSG_NUM_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> getC2CUnreadMsgNumList() {
    return c2CUnreadMsgNumList;
  }


  @JsonProperty(JSON_PROPERTY_C2_C_UNREAD_MSG_NUM_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setC2CUnreadMsgNumList(List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> c2CUnreadMsgNumList) {
    this.c2CUnreadMsgNumList = c2CUnreadMsgNumList;
  }


  public GetC2cUnreadMsgNumResponse errorList(List<GetC2cUnreadMsgNumResponseAllOfErrorList> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public GetC2cUnreadMsgNumResponse addErrorListItem(GetC2cUnreadMsgNumResponseAllOfErrorList errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * Get errorList
   * @return errorList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetC2cUnreadMsgNumResponseAllOfErrorList> getErrorList() {
    return errorList;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorList(List<GetC2cUnreadMsgNumResponseAllOfErrorList> errorList) {
    this.errorList = errorList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetC2cUnreadMsgNumResponse getC2cUnreadMsgNumResponse = (GetC2cUnreadMsgNumResponse) o;
    return Objects.equals(this.actionStatus, getC2cUnreadMsgNumResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getC2cUnreadMsgNumResponse.errorInfo) &&
        Objects.equals(this.errorCode, getC2cUnreadMsgNumResponse.errorCode) &&
        Objects.equals(this.allC2CUnreadMsgNum, getC2cUnreadMsgNumResponse.allC2CUnreadMsgNum) &&
        Objects.equals(this.c2CUnreadMsgNumList, getC2cUnreadMsgNumResponse.c2CUnreadMsgNumList) &&
        Objects.equals(this.errorList, getC2cUnreadMsgNumResponse.errorList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, allC2CUnreadMsgNum, c2CUnreadMsgNumList, errorList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetC2cUnreadMsgNumResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    allC2CUnreadMsgNum: ").append(toIndentedString(allC2CUnreadMsgNum)).append("\n");
    sb.append("    c2CUnreadMsgNumList: ").append(toIndentedString(c2CUnreadMsgNumList)).append("\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
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

