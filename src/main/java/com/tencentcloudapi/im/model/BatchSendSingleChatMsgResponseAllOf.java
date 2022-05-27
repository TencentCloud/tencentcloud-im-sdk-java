
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.BatchSendSingleChatMsgResponseAllOfErrorList;
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
 * BatchSendSingleChatMsgResponseAllOf
 */
@JsonPropertyOrder({
  BatchSendSingleChatMsgResponseAllOf.JSON_PROPERTY_MSG_TIME,
  BatchSendSingleChatMsgResponseAllOf.JSON_PROPERTY_MSG_KEY,
  BatchSendSingleChatMsgResponseAllOf.JSON_PROPERTY_ERROR_LIST
})
@JsonTypeName("BatchSendSingleChatMsgResponse_allOf")

public class BatchSendSingleChatMsgResponseAllOf {
  public static final String JSON_PROPERTY_MSG_TIME = "MsgTime";
  private Integer msgTime;

  public static final String JSON_PROPERTY_MSG_KEY = "MsgKey";
  private String msgKey;

  public static final String JSON_PROPERTY_ERROR_LIST = "ErrorList";
  private List<BatchSendSingleChatMsgResponseAllOfErrorList> errorList = null;

  public BatchSendSingleChatMsgResponseAllOf() { 
  }

  public BatchSendSingleChatMsgResponseAllOf msgTime(Integer msgTime) {
    
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


  public BatchSendSingleChatMsgResponseAllOf msgKey(String msgKey) {
    
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


  public BatchSendSingleChatMsgResponseAllOf errorList(List<BatchSendSingleChatMsgResponseAllOfErrorList> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public BatchSendSingleChatMsgResponseAllOf addErrorListItem(BatchSendSingleChatMsgResponseAllOfErrorList errorListItem) {
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
    BatchSendSingleChatMsgResponseAllOf batchSendSingleChatMsgResponseAllOf = (BatchSendSingleChatMsgResponseAllOf) o;
    return Objects.equals(this.msgTime, batchSendSingleChatMsgResponseAllOf.msgTime) &&
        Objects.equals(this.msgKey, batchSendSingleChatMsgResponseAllOf.msgKey) &&
        Objects.equals(this.errorList, batchSendSingleChatMsgResponseAllOf.errorList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgTime, msgKey, errorList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchSendSingleChatMsgResponseAllOf {\n");
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

