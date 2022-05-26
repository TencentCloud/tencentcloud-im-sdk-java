
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * SendSingleChatMsgResponseAllOf
 */
@JsonPropertyOrder({
  SendSingleChatMsgResponseAllOf.JSON_PROPERTY_MSG_TIME,
  SendSingleChatMsgResponseAllOf.JSON_PROPERTY_MSG_KEY
})
@JsonTypeName("SendSingleChatMsgResponse_allOf")

public class SendSingleChatMsgResponseAllOf {
  public static final String JSON_PROPERTY_MSG_TIME = "MsgTime";
  private Integer msgTime;

  public static final String JSON_PROPERTY_MSG_KEY = "MsgKey";
  private String msgKey;

  public SendSingleChatMsgResponseAllOf() { 
  }

  public SendSingleChatMsgResponseAllOf msgTime(Integer msgTime) {
    
    this.msgTime = msgTime;
    return this;
  }

   /**
   * 消息时间戳，UNIX 时间戳
   * @return msgTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息时间戳，UNIX 时间戳")
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


  public SendSingleChatMsgResponseAllOf msgKey(String msgKey) {
    
    this.msgKey = msgKey;
    return this;
  }

   /**
   * 消息唯一标识，用于撤回。长度不超过50个字符
   * @return msgKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息唯一标识，用于撤回。长度不超过50个字符")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendSingleChatMsgResponseAllOf sendSingleChatMsgResponseAllOf = (SendSingleChatMsgResponseAllOf) o;
    return Objects.equals(this.msgTime, sendSingleChatMsgResponseAllOf.msgTime) &&
        Objects.equals(this.msgKey, sendSingleChatMsgResponseAllOf.msgKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgTime, msgKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSingleChatMsgResponseAllOf {\n");
    sb.append("    msgTime: ").append(toIndentedString(msgTime)).append("\n");
    sb.append("    msgKey: ").append(toIndentedString(msgKey)).append("\n");
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

