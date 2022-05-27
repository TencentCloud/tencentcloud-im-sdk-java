
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.GetNoSpeakingResponseAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetNoSpeakingResponse
 */
@JsonPropertyOrder({
  GetNoSpeakingResponse.JSON_PROPERTY_ACTION_STATUS,
  GetNoSpeakingResponse.JSON_PROPERTY_ERROR_INFO,
  GetNoSpeakingResponse.JSON_PROPERTY_ERROR_CODE,
  GetNoSpeakingResponse.JSON_PROPERTY_C2_CMSG_NOSPEAKING_TIME,
  GetNoSpeakingResponse.JSON_PROPERTY_GROUPMSG_NOSPEAKING_TIME
})

public class GetNoSpeakingResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_C2_CMSG_NOSPEAKING_TIME = "C2CmsgNospeakingTime";
  private BigDecimal c2CmsgNospeakingTime;

  public static final String JSON_PROPERTY_GROUPMSG_NOSPEAKING_TIME = "GroupmsgNospeakingTime";
  private BigDecimal groupmsgNospeakingTime;

  public GetNoSpeakingResponse() { 
  }

  public GetNoSpeakingResponse actionStatus(String actionStatus) {
    
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


  public GetNoSpeakingResponse errorInfo(String errorInfo) {
    
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


  public GetNoSpeakingResponse errorCode(Integer errorCode) {
    
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


  public GetNoSpeakingResponse c2CmsgNospeakingTime(BigDecimal c2CmsgNospeakingTime) {
    
    this.c2CmsgNospeakingTime = c2CmsgNospeakingTime;
    return this;
  }

   /**
   * 单聊消息禁言时长，单位为秒，非负整数。等于 0 代表没有被设置禁言；等于最大值4294967295（十六进制 0xFFFFFFFF）代表被设置永久禁言；其它代表该帐号禁言时长，如果等于3600表示该帐号被禁言一小时
   * @return c2CmsgNospeakingTime
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "单聊消息禁言时长，单位为秒，非负整数。等于 0 代表没有被设置禁言；等于最大值4294967295（十六进制 0xFFFFFFFF）代表被设置永久禁言；其它代表该帐号禁言时长，如果等于3600表示该帐号被禁言一小时")
  @JsonProperty(JSON_PROPERTY_C2_CMSG_NOSPEAKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getC2CmsgNospeakingTime() {
    return c2CmsgNospeakingTime;
  }


  @JsonProperty(JSON_PROPERTY_C2_CMSG_NOSPEAKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setC2CmsgNospeakingTime(BigDecimal c2CmsgNospeakingTime) {
    this.c2CmsgNospeakingTime = c2CmsgNospeakingTime;
  }


  public GetNoSpeakingResponse groupmsgNospeakingTime(BigDecimal groupmsgNospeakingTime) {
    
    this.groupmsgNospeakingTime = groupmsgNospeakingTime;
    return this;
  }

   /**
   * 群组消息禁言时长，单位为秒，非负整数。等于0代表没有被设置禁言；等于最大值4294967295（十六进制 0xFFFFFFFF）代表被设置永久禁言；其它代表该帐号禁言时长，如果等于3600表示该帐号被禁言一小时
   * @return groupmsgNospeakingTime
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "群组消息禁言时长，单位为秒，非负整数。等于0代表没有被设置禁言；等于最大值4294967295（十六进制 0xFFFFFFFF）代表被设置永久禁言；其它代表该帐号禁言时长，如果等于3600表示该帐号被禁言一小时")
  @JsonProperty(JSON_PROPERTY_GROUPMSG_NOSPEAKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGroupmsgNospeakingTime() {
    return groupmsgNospeakingTime;
  }


  @JsonProperty(JSON_PROPERTY_GROUPMSG_NOSPEAKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupmsgNospeakingTime(BigDecimal groupmsgNospeakingTime) {
    this.groupmsgNospeakingTime = groupmsgNospeakingTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetNoSpeakingResponse getNoSpeakingResponse = (GetNoSpeakingResponse) o;
    return Objects.equals(this.actionStatus, getNoSpeakingResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getNoSpeakingResponse.errorInfo) &&
        Objects.equals(this.errorCode, getNoSpeakingResponse.errorCode) &&
        Objects.equals(this.c2CmsgNospeakingTime, getNoSpeakingResponse.c2CmsgNospeakingTime) &&
        Objects.equals(this.groupmsgNospeakingTime, getNoSpeakingResponse.groupmsgNospeakingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, c2CmsgNospeakingTime, groupmsgNospeakingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNoSpeakingResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    c2CmsgNospeakingTime: ").append(toIndentedString(c2CmsgNospeakingTime)).append("\n");
    sb.append("    groupmsgNospeakingTime: ").append(toIndentedString(groupmsgNospeakingTime)).append("\n");
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

