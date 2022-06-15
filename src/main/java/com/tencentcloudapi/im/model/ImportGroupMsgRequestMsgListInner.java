
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.TIMMsgElement;
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
 * ImportGroupMsgRequestMsgListInner
 */
@JsonPropertyOrder({
  ImportGroupMsgRequestMsgListInner.JSON_PROPERTY_FROM_ACCOUNT,
  ImportGroupMsgRequestMsgListInner.JSON_PROPERTY_SEND_TIME,
  ImportGroupMsgRequestMsgListInner.JSON_PROPERTY_RANDOM,
  ImportGroupMsgRequestMsgListInner.JSON_PROPERTY_MSG_BODY
})
@JsonTypeName("ImportGroupMsgRequest_MsgList_inner")

public class ImportGroupMsgRequestMsgListInner {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_SEND_TIME = "SendTime";
  private Integer sendTime;

  public static final String JSON_PROPERTY_RANDOM = "Random";
  private Integer random;

  public static final String JSON_PROPERTY_MSG_BODY = "MsgBody";
  private List<TIMMsgElement> msgBody = null;

  public ImportGroupMsgRequestMsgListInner() { 
  }

  public ImportGroupMsgRequestMsgListInner fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 指定消息发送者
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指定消息发送者")
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


  public ImportGroupMsgRequestMsgListInner sendTime(Integer sendTime) {
    
    this.sendTime = sendTime;
    return this;
  }

   /**
   * 消息发送时间
   * @return sendTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息发送时间")
  @JsonProperty(JSON_PROPERTY_SEND_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSendTime() {
    return sendTime;
  }


  @JsonProperty(JSON_PROPERTY_SEND_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendTime(Integer sendTime) {
    this.sendTime = sendTime;
  }


  public ImportGroupMsgRequestMsgListInner random(Integer random) {
    
    this.random = random;
    return this;
  }

   /**
   * 32位无符号整数；如果5分钟内两条消息的随机值相同，后一条消息将被当做重复消息而丢弃
   * @return random
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "32位无符号整数；如果5分钟内两条消息的随机值相同，后一条消息将被当做重复消息而丢弃")
  @JsonProperty(JSON_PROPERTY_RANDOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRandom() {
    return random;
  }


  @JsonProperty(JSON_PROPERTY_RANDOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRandom(Integer random) {
    this.random = random;
  }


  public ImportGroupMsgRequestMsgListInner msgBody(List<TIMMsgElement> msgBody) {
    
    this.msgBody = msgBody;
    return this;
  }

  public ImportGroupMsgRequestMsgListInner addMsgBodyItem(TIMMsgElement msgBodyItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupMsgRequestMsgListInner importGroupMsgRequestMsgListInner = (ImportGroupMsgRequestMsgListInner) o;
    return Objects.equals(this.fromAccount, importGroupMsgRequestMsgListInner.fromAccount) &&
        Objects.equals(this.sendTime, importGroupMsgRequestMsgListInner.sendTime) &&
        Objects.equals(this.random, importGroupMsgRequestMsgListInner.random) &&
        Objects.equals(this.msgBody, importGroupMsgRequestMsgListInner.msgBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, sendTime, random, msgBody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMsgRequestMsgListInner {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
    sb.append("    random: ").append(toIndentedString(random)).append("\n");
    sb.append("    msgBody: ").append(toIndentedString(msgBody)).append("\n");
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

