
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
import tencentcloud.im.model.BatchSendSingleChatMsgResponseAllOf;
import tencentcloud.im.model.BatchSendSingleChatMsgResponseAllOfErrorList;
import tencentcloud.im.model.CommonResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * BatchSendSingleChatMsgResponse
 */
@JsonPropertyOrder({
  BatchSendSingleChatMsgResponse.JSON_PROPERTY_ACTION_STATUS,
  BatchSendSingleChatMsgResponse.JSON_PROPERTY_ERROR_INFO,
  BatchSendSingleChatMsgResponse.JSON_PROPERTY_ERROR_CODE,
  BatchSendSingleChatMsgResponse.JSON_PROPERTY_MSG_TIME,
  BatchSendSingleChatMsgResponse.JSON_PROPERTY_MSG_KEY,
  BatchSendSingleChatMsgResponse.JSON_PROPERTY_ERROR_LIST
})

public class BatchSendSingleChatMsgResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_MSG_TIME = "MsgTime";
  private Integer msgTime;

  public static final String JSON_PROPERTY_MSG_KEY = "MsgKey";
  private String msgKey;

  public static final String JSON_PROPERTY_ERROR_LIST = "ErrorList";
  private List<BatchSendSingleChatMsgResponseAllOfErrorList> errorList = null;

  public BatchSendSingleChatMsgResponse() { 
  }

  public BatchSendSingleChatMsgResponse actionStatus(String actionStatus) {
    
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


  public BatchSendSingleChatMsgResponse errorInfo(String errorInfo) {
    
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


  public BatchSendSingleChatMsgResponse errorCode(Integer errorCode) {
    
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


  public BatchSendSingleChatMsgResponse msgTime(Integer msgTime) {
    
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


  public BatchSendSingleChatMsgResponse msgKey(String msgKey) {
    
    this.msgKey = msgKey;
    return this;
  }

   /**
   * Get msgKey
   * @return msgKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MSG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMsgKey() {
    return msgKey;
  }


  @JsonProperty(JSON_PROPERTY_MSG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgKey(String msgKey) {
    this.msgKey = msgKey;
  }


  public BatchSendSingleChatMsgResponse errorList(List<BatchSendSingleChatMsgResponseAllOfErrorList> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public BatchSendSingleChatMsgResponse addErrorListItem(BatchSendSingleChatMsgResponseAllOfErrorList errorListItem) {
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

  public List<BatchSendSingleChatMsgResponseAllOfErrorList> getErrorList() {
    return errorList;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorList(List<BatchSendSingleChatMsgResponseAllOfErrorList> errorList) {
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
    BatchSendSingleChatMsgResponse batchSendSingleChatMsgResponse = (BatchSendSingleChatMsgResponse) o;
    return Objects.equals(this.actionStatus, batchSendSingleChatMsgResponse.actionStatus) &&
        Objects.equals(this.errorInfo, batchSendSingleChatMsgResponse.errorInfo) &&
        Objects.equals(this.errorCode, batchSendSingleChatMsgResponse.errorCode) &&
        Objects.equals(this.msgTime, batchSendSingleChatMsgResponse.msgTime) &&
        Objects.equals(this.msgKey, batchSendSingleChatMsgResponse.msgKey) &&
        Objects.equals(this.errorList, batchSendSingleChatMsgResponse.errorList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, msgTime, msgKey, errorList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchSendSingleChatMsgResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    msgTime: ").append(toIndentedString(msgTime)).append("\n");
    sb.append("    msgKey: ").append(toIndentedString(msgKey)).append("\n");
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

