
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
import tencentcloud.im.model.TIMMsgElement;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GroupMsgGetSimpleResponseAllOfRspMsgList
 */
@JsonPropertyOrder({
  GroupMsgGetSimpleResponseAllOfRspMsgList.JSON_PROPERTY_FROM_ACCOUNT,
  GroupMsgGetSimpleResponseAllOfRspMsgList.JSON_PROPERTY_IS_PLACE_MSG,
  GroupMsgGetSimpleResponseAllOfRspMsgList.JSON_PROPERTY_MSG_PRIORITY,
  GroupMsgGetSimpleResponseAllOfRspMsgList.JSON_PROPERTY_MSG_RANDOM,
  GroupMsgGetSimpleResponseAllOfRspMsgList.JSON_PROPERTY_MSG_SEQ,
  GroupMsgGetSimpleResponseAllOfRspMsgList.JSON_PROPERTY_MSG_TIME_STAMP,
  GroupMsgGetSimpleResponseAllOfRspMsgList.JSON_PROPERTY_MSG_BODY,
  GroupMsgGetSimpleResponseAllOfRspMsgList.JSON_PROPERTY_IS_SYSTEM_MSG
})
@JsonTypeName("GroupMsgGetSimpleResponse_allOf_RspMsgList")

public class GroupMsgGetSimpleResponseAllOfRspMsgList {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_IS_PLACE_MSG = "IsPlaceMsg";
  private Integer isPlaceMsg;

  public static final String JSON_PROPERTY_MSG_PRIORITY = "MsgPriority";
  private Integer msgPriority;

  public static final String JSON_PROPERTY_MSG_RANDOM = "MsgRandom";
  private Integer msgRandom;

  public static final String JSON_PROPERTY_MSG_SEQ = "MsgSeq";
  private Integer msgSeq;

  public static final String JSON_PROPERTY_MSG_TIME_STAMP = "MsgTimeStamp";
  private Integer msgTimeStamp;

  public static final String JSON_PROPERTY_MSG_BODY = "MsgBody";
  private List<TIMMsgElement> msgBody = null;

  public static final String JSON_PROPERTY_IS_SYSTEM_MSG = "IsSystemMsg";
  private Integer isSystemMsg;

  public GroupMsgGetSimpleResponseAllOfRspMsgList() { 
  }

  public GroupMsgGetSimpleResponseAllOfRspMsgList fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 消息的发送者
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息的发送者")
  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromAccount() {
    return fromAccount;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList isPlaceMsg(Integer isPlaceMsg) {
    
    this.isPlaceMsg = isPlaceMsg;
    return this;
  }

   /**
   * 是否是空洞消息，当消息被删除或者消息过期后，MsgBody 为空，该字段为1，撤回的消息，该字段为2
   * @return isPlaceMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否是空洞消息，当消息被删除或者消息过期后，MsgBody 为空，该字段为1，撤回的消息，该字段为2")
  @JsonProperty(JSON_PROPERTY_IS_PLACE_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIsPlaceMsg() {
    return isPlaceMsg;
  }


  @JsonProperty(JSON_PROPERTY_IS_PLACE_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPlaceMsg(Integer isPlaceMsg) {
    this.isPlaceMsg = isPlaceMsg;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList msgPriority(Integer msgPriority) {
    
    this.msgPriority = msgPriority;
    return this;
  }

   /**
   * 消息的优先级，用于消息去重，有客户端发消息时填写，如果没有填，服务端会自动生成，1表示 High 优先级消息，2表示 Normal 优先级消息，3表示 Low 优先级消息，4表示 Lowest 优先级消息
   * @return msgPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息的优先级，用于消息去重，有客户端发消息时填写，如果没有填，服务端会自动生成，1表示 High 优先级消息，2表示 Normal 优先级消息，3表示 Low 优先级消息，4表示 Lowest 优先级消息")
  @JsonProperty(JSON_PROPERTY_MSG_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMsgPriority() {
    return msgPriority;
  }


  @JsonProperty(JSON_PROPERTY_MSG_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgPriority(Integer msgPriority) {
    this.msgPriority = msgPriority;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList msgRandom(Integer msgRandom) {
    
    this.msgRandom = msgRandom;
    return this;
  }

   /**
   * 消息随机值，用于对消息去重，有客户端发消息时填写，如果没有填，服务端会自动生成
   * @return msgRandom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息随机值，用于对消息去重，有客户端发消息时填写，如果没有填，服务端会自动生成")
  @JsonProperty(JSON_PROPERTY_MSG_RANDOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMsgRandom() {
    return msgRandom;
  }


  @JsonProperty(JSON_PROPERTY_MSG_RANDOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgRandom(Integer msgRandom) {
    this.msgRandom = msgRandom;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * 消息 seq，用于标识唯一消息，值越小发送的越早
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息 seq，用于标识唯一消息，值越小发送的越早")
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


  public GroupMsgGetSimpleResponseAllOfRspMsgList msgTimeStamp(Integer msgTimeStamp) {
    
    this.msgTimeStamp = msgTimeStamp;
    return this;
  }

   /**
   * 消息被发送的时间戳，server 的时间
   * @return msgTimeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息被发送的时间戳，server 的时间")
  @JsonProperty(JSON_PROPERTY_MSG_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMsgTimeStamp() {
    return msgTimeStamp;
  }


  @JsonProperty(JSON_PROPERTY_MSG_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgTimeStamp(Integer msgTimeStamp) {
    this.msgTimeStamp = msgTimeStamp;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList msgBody(List<TIMMsgElement> msgBody) {
    
    this.msgBody = msgBody;
    return this;
  }

  public GroupMsgGetSimpleResponseAllOfRspMsgList addMsgBodyItem(TIMMsgElement msgBodyItem) {
    if (this.msgBody == null) {
      this.msgBody = new ArrayList<>();
    }
    this.msgBody.add(msgBodyItem);
    return this;
  }

   /**
   * Get msgBody
   * @return msgBody
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MSG_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TIMMsgElement> getMsgBody() {
    return msgBody;
  }


  @JsonProperty(JSON_PROPERTY_MSG_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgBody(List<TIMMsgElement> msgBody) {
    this.msgBody = msgBody;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList isSystemMsg(Integer isSystemMsg) {
    
    this.isSystemMsg = isSystemMsg;
    return this;
  }

   /**
   * 字段为1时表示系统消息
   * @return isSystemMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "字段为1时表示系统消息")
  @JsonProperty(JSON_PROPERTY_IS_SYSTEM_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIsSystemMsg() {
    return isSystemMsg;
  }


  @JsonProperty(JSON_PROPERTY_IS_SYSTEM_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsSystemMsg(Integer isSystemMsg) {
    this.isSystemMsg = isSystemMsg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMsgGetSimpleResponseAllOfRspMsgList groupMsgGetSimpleResponseAllOfRspMsgList = (GroupMsgGetSimpleResponseAllOfRspMsgList) o;
    return Objects.equals(this.fromAccount, groupMsgGetSimpleResponseAllOfRspMsgList.fromAccount) &&
        Objects.equals(this.isPlaceMsg, groupMsgGetSimpleResponseAllOfRspMsgList.isPlaceMsg) &&
        Objects.equals(this.msgPriority, groupMsgGetSimpleResponseAllOfRspMsgList.msgPriority) &&
        Objects.equals(this.msgRandom, groupMsgGetSimpleResponseAllOfRspMsgList.msgRandom) &&
        Objects.equals(this.msgSeq, groupMsgGetSimpleResponseAllOfRspMsgList.msgSeq) &&
        Objects.equals(this.msgTimeStamp, groupMsgGetSimpleResponseAllOfRspMsgList.msgTimeStamp) &&
        Objects.equals(this.msgBody, groupMsgGetSimpleResponseAllOfRspMsgList.msgBody) &&
        Objects.equals(this.isSystemMsg, groupMsgGetSimpleResponseAllOfRspMsgList.isSystemMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, isPlaceMsg, msgPriority, msgRandom, msgSeq, msgTimeStamp, msgBody, isSystemMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgGetSimpleResponseAllOfRspMsgList {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    isPlaceMsg: ").append(toIndentedString(isPlaceMsg)).append("\n");
    sb.append("    msgPriority: ").append(toIndentedString(msgPriority)).append("\n");
    sb.append("    msgRandom: ").append(toIndentedString(msgRandom)).append("\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
    sb.append("    msgTimeStamp: ").append(toIndentedString(msgTimeStamp)).append("\n");
    sb.append("    msgBody: ").append(toIndentedString(msgBody)).append("\n");
    sb.append("    isSystemMsg: ").append(toIndentedString(isSystemMsg)).append("\n");
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

