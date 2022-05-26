
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
import tencentcloud.im.model.CommonResponse;
import tencentcloud.im.model.SendGroupMsgResponseAllOf;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * SendGroupMsgResponse
 */
@JsonPropertyOrder({
  SendGroupMsgResponse.JSON_PROPERTY_ACTION_STATUS,
  SendGroupMsgResponse.JSON_PROPERTY_ERROR_INFO,
  SendGroupMsgResponse.JSON_PROPERTY_ERROR_CODE,
  SendGroupMsgResponse.JSON_PROPERTY_MSG_TIME,
  SendGroupMsgResponse.JSON_PROPERTY_MSG_SEQ
})

public class SendGroupMsgResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_MSG_TIME = "MsgTime";
  private Integer msgTime;

  public static final String JSON_PROPERTY_MSG_SEQ = "MsgSeq";
  private Integer msgSeq;

  public SendGroupMsgResponse() { 
  }

  public SendGroupMsgResponse actionStatus(String actionStatus) {
    
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


  public SendGroupMsgResponse errorInfo(String errorInfo) {
    
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


  public SendGroupMsgResponse errorCode(Integer errorCode) {
    
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


  public SendGroupMsgResponse msgTime(Integer msgTime) {
    
    this.msgTime = msgTime;
    return this;
  }

   /**
   * Get msgTime
   * @return msgTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public SendGroupMsgResponse msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * Get msgSeq
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendGroupMsgResponse sendGroupMsgResponse = (SendGroupMsgResponse) o;
    return Objects.equals(this.actionStatus, sendGroupMsgResponse.actionStatus) &&
        Objects.equals(this.errorInfo, sendGroupMsgResponse.errorInfo) &&
        Objects.equals(this.errorCode, sendGroupMsgResponse.errorCode) &&
        Objects.equals(this.msgTime, sendGroupMsgResponse.msgTime) &&
        Objects.equals(this.msgSeq, sendGroupMsgResponse.msgSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, msgTime, msgSeq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendGroupMsgResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    msgTime: ").append(toIndentedString(msgTime)).append("\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
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

