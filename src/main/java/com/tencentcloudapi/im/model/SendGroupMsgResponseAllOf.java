
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * SendGroupMsgResponseAllOf
 */
@JsonPropertyOrder({
  SendGroupMsgResponseAllOf.JSON_PROPERTY_MSG_TIME,
  SendGroupMsgResponseAllOf.JSON_PROPERTY_MSG_SEQ
})
@JsonTypeName("SendGroupMsgResponse_allOf")

public class SendGroupMsgResponseAllOf {
  public static final String JSON_PROPERTY_MSG_TIME = "MsgTime";
  private Integer msgTime;

  public static final String JSON_PROPERTY_MSG_SEQ = "MsgSeq";
  private Integer msgSeq;

  public SendGroupMsgResponseAllOf() { 
  }

  public SendGroupMsgResponseAllOf msgTime(Integer msgTime) {
    
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


  public SendGroupMsgResponseAllOf msgSeq(Integer msgSeq) {
    
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
    SendGroupMsgResponseAllOf sendGroupMsgResponseAllOf = (SendGroupMsgResponseAllOf) o;
    return Objects.equals(this.msgTime, sendGroupMsgResponseAllOf.msgTime) &&
        Objects.equals(this.msgSeq, sendGroupMsgResponseAllOf.msgSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgTime, msgSeq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendGroupMsgResponseAllOf {\n");
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

