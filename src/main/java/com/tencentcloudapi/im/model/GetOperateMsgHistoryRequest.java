
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
 * GetOperateMsgHistoryRequest
 */
@JsonPropertyOrder({
  GetOperateMsgHistoryRequest.JSON_PROPERTY_CHAT_TYPE,
  GetOperateMsgHistoryRequest.JSON_PROPERTY_MSG_TIME
})

public class GetOperateMsgHistoryRequest {
  public static final String JSON_PROPERTY_CHAT_TYPE = "ChatType";
  private String chatType;

  public static final String JSON_PROPERTY_MSG_TIME = "MsgTime";
  private String msgTime;

  public GetOperateMsgHistoryRequest() { 
  }

  public GetOperateMsgHistoryRequest chatType(String chatType) {
    
    this.chatType = chatType;
    return this;
  }

   /**
   * 消息类型，C2C 表示单发消息 Group 表示群组消息
   * @return chatType
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "消息类型，C2C 表示单发消息 Group 表示群组消息")
  @JsonProperty(JSON_PROPERTY_CHAT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChatType() {
    return chatType;
  }


  @JsonProperty(JSON_PROPERTY_CHAT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChatType(String chatType) {
    this.chatType = chatType;
  }


  public GetOperateMsgHistoryRequest msgTime(String msgTime) {
    
    this.msgTime = msgTime;
    return this;
  }

   /**
   * 需要下载的消息记录的时间段，2015120121表示获取2015年12月1日21:00 - 21:59的消息的下载地址。该字段需精确到小时。每次请求只能获取某天某小时的所有单发或群组消息记录
   * @return msgTime
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要下载的消息记录的时间段，2015120121表示获取2015年12月1日21:00 - 21:59的消息的下载地址。该字段需精确到小时。每次请求只能获取某天某小时的所有单发或群组消息记录")
  @JsonProperty(JSON_PROPERTY_MSG_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMsgTime() {
    return msgTime;
  }


  @JsonProperty(JSON_PROPERTY_MSG_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsgTime(String msgTime) {
    this.msgTime = msgTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOperateMsgHistoryRequest getOperateMsgHistoryRequest = (GetOperateMsgHistoryRequest) o;
    return Objects.equals(this.chatType, getOperateMsgHistoryRequest.chatType) &&
        Objects.equals(this.msgTime, getOperateMsgHistoryRequest.msgTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatType, msgTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOperateMsgHistoryRequest {\n");
    sb.append("    chatType: ").append(toIndentedString(chatType)).append("\n");
    sb.append("    msgTime: ").append(toIndentedString(msgTime)).append("\n");
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

