
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.OfflinePushInfo;
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
 * SendSingleChatMsgRequest
 */
@JsonPropertyOrder({
  SendSingleChatMsgRequest.JSON_PROPERTY_SYNC_OTHER_MACHINE,
  SendSingleChatMsgRequest.JSON_PROPERTY_FROM_ACCOUNT,
  SendSingleChatMsgRequest.JSON_PROPERTY_TO_ACCOUNT,
  SendSingleChatMsgRequest.JSON_PROPERTY_MSG_LIFE_TIME,
  SendSingleChatMsgRequest.JSON_PROPERTY_MSG_SEQ,
  SendSingleChatMsgRequest.JSON_PROPERTY_MSG_RANDOM,
  SendSingleChatMsgRequest.JSON_PROPERTY_MSG_TIME_STAMP,
  SendSingleChatMsgRequest.JSON_PROPERTY_FORBID_CALLBACK_CONTROL,
  SendSingleChatMsgRequest.JSON_PROPERTY_SEND_MSG_CONTROL,
  SendSingleChatMsgRequest.JSON_PROPERTY_MSG_BODY,
  SendSingleChatMsgRequest.JSON_PROPERTY_CLOUD_CUSTOM_DATA,
  SendSingleChatMsgRequest.JSON_PROPERTY_OFFLINE_PUSH_INFO
})

public class SendSingleChatMsgRequest {
  /**
   * 1：把消息同步到 From_Account 在线终端和漫游上；2：消息不同步至 From_Account；若不填写默认情况下会将消息存 From_Account 漫游
   */
  public enum SyncOtherMachineEnum {
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    SyncOtherMachineEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SyncOtherMachineEnum fromValue(Integer value) {
      for (SyncOtherMachineEnum b : SyncOtherMachineEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SYNC_OTHER_MACHINE = "SyncOtherMachine";
  private SyncOtherMachineEnum syncOtherMachine;

  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_MSG_LIFE_TIME = "MsgLifeTime";
  private Integer msgLifeTime;

  public static final String JSON_PROPERTY_MSG_SEQ = "MsgSeq";
  private Integer msgSeq;

  public static final String JSON_PROPERTY_MSG_RANDOM = "MsgRandom";
  private Integer msgRandom;

  public static final String JSON_PROPERTY_MSG_TIME_STAMP = "MsgTimeStamp";
  private Integer msgTimeStamp;

  public static final String JSON_PROPERTY_FORBID_CALLBACK_CONTROL = "ForbidCallbackControl";
  private List<String> forbidCallbackControl = null;

  public static final String JSON_PROPERTY_SEND_MSG_CONTROL = "SendMsgControl";
  private List<String> sendMsgControl = null;

  public static final String JSON_PROPERTY_MSG_BODY = "MsgBody";
  private List<TIMMsgElement> msgBody = new ArrayList<>();

  public static final String JSON_PROPERTY_CLOUD_CUSTOM_DATA = "CloudCustomData";
  private String cloudCustomData;

  public static final String JSON_PROPERTY_OFFLINE_PUSH_INFO = "OfflinePushInfo";
  private OfflinePushInfo offlinePushInfo;

  public SendSingleChatMsgRequest() { 
  }

  public SendSingleChatMsgRequest syncOtherMachine(SyncOtherMachineEnum syncOtherMachine) {
    
    this.syncOtherMachine = syncOtherMachine;
    return this;
  }

   /**
   * 1：把消息同步到 From_Account 在线终端和漫游上；2：消息不同步至 From_Account；若不填写默认情况下会将消息存 From_Account 漫游
   * @return syncOtherMachine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "1：把消息同步到 From_Account 在线终端和漫游上；2：消息不同步至 From_Account；若不填写默认情况下会将消息存 From_Account 漫游")
  @JsonProperty(JSON_PROPERTY_SYNC_OTHER_MACHINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyncOtherMachineEnum getSyncOtherMachine() {
    return syncOtherMachine;
  }


  @JsonProperty(JSON_PROPERTY_SYNC_OTHER_MACHINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSyncOtherMachine(SyncOtherMachineEnum syncOtherMachine) {
    this.syncOtherMachine = syncOtherMachine;
  }


  public SendSingleChatMsgRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 消息发送方 UserID（用于指定发送消息方帐号）
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息发送方 UserID（用于指定发送消息方帐号）")
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


  public SendSingleChatMsgRequest toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 消息接收方 UserID
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "消息接收方 UserID")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public SendSingleChatMsgRequest msgLifeTime(Integer msgLifeTime) {
    
    this.msgLifeTime = msgLifeTime;
    return this;
  }

   /**
   * 消息离线保存时长（单位：秒），最长为7天（604800秒） 若设置该字段为0，则消息只发在线用户，不保存离线 若设置该字段超过7天（604800秒），仍只保存7天 若不设置该字段，则默认保存7天
   * @return msgLifeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息离线保存时长（单位：秒），最长为7天（604800秒） 若设置该字段为0，则消息只发在线用户，不保存离线 若设置该字段超过7天（604800秒），仍只保存7天 若不设置该字段，则默认保存7天")
  @JsonProperty(JSON_PROPERTY_MSG_LIFE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMsgLifeTime() {
    return msgLifeTime;
  }


  @JsonProperty(JSON_PROPERTY_MSG_LIFE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgLifeTime(Integer msgLifeTime) {
    this.msgLifeTime = msgLifeTime;
  }


  public SendSingleChatMsgRequest msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * 消息序列号（32位无符号整数），后台会根据该字段去重及进行同秒内消息的排序，详细规则请看本接口的功能说明。若不填该字段，则由后台填入随机数
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息序列号（32位无符号整数），后台会根据该字段去重及进行同秒内消息的排序，详细规则请看本接口的功能说明。若不填该字段，则由后台填入随机数")
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


  public SendSingleChatMsgRequest msgRandom(Integer msgRandom) {
    
    this.msgRandom = msgRandom;
    return this;
  }

   /**
   * 消息随机数（32位无符号整数），后台用于同一秒内的消息去重。请确保该字段填的是随机
   * @return msgRandom
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "消息随机数（32位无符号整数），后台用于同一秒内的消息去重。请确保该字段填的是随机")
  @JsonProperty(JSON_PROPERTY_MSG_RANDOM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMsgRandom() {
    return msgRandom;
  }


  @JsonProperty(JSON_PROPERTY_MSG_RANDOM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsgRandom(Integer msgRandom) {
    this.msgRandom = msgRandom;
  }


  public SendSingleChatMsgRequest msgTimeStamp(Integer msgTimeStamp) {
    
    this.msgTimeStamp = msgTimeStamp;
    return this;
  }

   /**
   * 消息时间戳，UNIX 时间戳（单位：秒）
   * @return msgTimeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息时间戳，UNIX 时间戳（单位：秒）")
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


  public SendSingleChatMsgRequest forbidCallbackControl(List<String> forbidCallbackControl) {
    
    this.forbidCallbackControl = forbidCallbackControl;
    return this;
  }

  public SendSingleChatMsgRequest addForbidCallbackControlItem(String forbidCallbackControlItem) {
    if (this.forbidCallbackControl == null) {
      this.forbidCallbackControl = new ArrayList<>();
    }
    this.forbidCallbackControl.add(forbidCallbackControlItem);
    return this;
  }

   /**
   * 消息回调禁止开关，只对本条消息有效，ForbidBeforeSendMsgCallback 表示禁止发消息前回调，ForbidAfterSendMsgCallback 表示禁止发消息后回调
   * @return forbidCallbackControl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息回调禁止开关，只对本条消息有效，ForbidBeforeSendMsgCallback 表示禁止发消息前回调，ForbidAfterSendMsgCallback 表示禁止发消息后回调")
  @JsonProperty(JSON_PROPERTY_FORBID_CALLBACK_CONTROL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getForbidCallbackControl() {
    return forbidCallbackControl;
  }


  @JsonProperty(JSON_PROPERTY_FORBID_CALLBACK_CONTROL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForbidCallbackControl(List<String> forbidCallbackControl) {
    this.forbidCallbackControl = forbidCallbackControl;
  }


  public SendSingleChatMsgRequest sendMsgControl(List<String> sendMsgControl) {
    
    this.sendMsgControl = sendMsgControl;
    return this;
  }

  public SendSingleChatMsgRequest addSendMsgControlItem(String sendMsgControlItem) {
    if (this.sendMsgControl == null) {
      this.sendMsgControl = new ArrayList<>();
    }
    this.sendMsgControl.add(sendMsgControlItem);
    return this;
  }

   /**
   * 消息发送控制选项，是一个 String 数组，只对本条消息有效。\&quot;NoUnread\&quot;表示该条消息不计入未读数。\&quot;NoLastMsg\&quot;表示该条消息不更新会话列表。\&quot;WithMuteNotifications\&quot;表示该条消息的接收方对发送方设置的免打扰选项生效（默认不生效）。
   * @return sendMsgControl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息发送控制选项，是一个 String 数组，只对本条消息有效。\"NoUnread\"表示该条消息不计入未读数。\"NoLastMsg\"表示该条消息不更新会话列表。\"WithMuteNotifications\"表示该条消息的接收方对发送方设置的免打扰选项生效（默认不生效）。")
  @JsonProperty(JSON_PROPERTY_SEND_MSG_CONTROL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSendMsgControl() {
    return sendMsgControl;
  }


  @JsonProperty(JSON_PROPERTY_SEND_MSG_CONTROL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendMsgControl(List<String> sendMsgControl) {
    this.sendMsgControl = sendMsgControl;
  }


  public SendSingleChatMsgRequest msgBody(List<TIMMsgElement> msgBody) {
    
    this.msgBody = msgBody;
    return this;
  }

  public SendSingleChatMsgRequest addMsgBodyItem(TIMMsgElement msgBodyItem) {
    this.msgBody.add(msgBodyItem);
    return this;
  }

   /**
   * Get msgBody
   * @return msgBody
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MSG_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TIMMsgElement> getMsgBody() {
    return msgBody;
  }


  @JsonProperty(JSON_PROPERTY_MSG_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsgBody(List<TIMMsgElement> msgBody) {
    this.msgBody = msgBody;
  }


  public SendSingleChatMsgRequest cloudCustomData(String cloudCustomData) {
    
    this.cloudCustomData = cloudCustomData;
    return this;
  }

   /**
   * Get cloudCustomData
   * @return cloudCustomData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_CUSTOM_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudCustomData() {
    return cloudCustomData;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_CUSTOM_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudCustomData(String cloudCustomData) {
    this.cloudCustomData = cloudCustomData;
  }


  public SendSingleChatMsgRequest offlinePushInfo(OfflinePushInfo offlinePushInfo) {
    
    this.offlinePushInfo = offlinePushInfo;
    return this;
  }

   /**
   * Get offlinePushInfo
   * @return offlinePushInfo
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OFFLINE_PUSH_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OfflinePushInfo getOfflinePushInfo() {
    return offlinePushInfo;
  }


  @JsonProperty(JSON_PROPERTY_OFFLINE_PUSH_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOfflinePushInfo(OfflinePushInfo offlinePushInfo) {
    this.offlinePushInfo = offlinePushInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendSingleChatMsgRequest sendSingleChatMsgRequest = (SendSingleChatMsgRequest) o;
    return Objects.equals(this.syncOtherMachine, sendSingleChatMsgRequest.syncOtherMachine) &&
        Objects.equals(this.fromAccount, sendSingleChatMsgRequest.fromAccount) &&
        Objects.equals(this.toAccount, sendSingleChatMsgRequest.toAccount) &&
        Objects.equals(this.msgLifeTime, sendSingleChatMsgRequest.msgLifeTime) &&
        Objects.equals(this.msgSeq, sendSingleChatMsgRequest.msgSeq) &&
        Objects.equals(this.msgRandom, sendSingleChatMsgRequest.msgRandom) &&
        Objects.equals(this.msgTimeStamp, sendSingleChatMsgRequest.msgTimeStamp) &&
        Objects.equals(this.forbidCallbackControl, sendSingleChatMsgRequest.forbidCallbackControl) &&
        Objects.equals(this.sendMsgControl, sendSingleChatMsgRequest.sendMsgControl) &&
        Objects.equals(this.msgBody, sendSingleChatMsgRequest.msgBody) &&
        Objects.equals(this.cloudCustomData, sendSingleChatMsgRequest.cloudCustomData) &&
        Objects.equals(this.offlinePushInfo, sendSingleChatMsgRequest.offlinePushInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncOtherMachine, fromAccount, toAccount, msgLifeTime, msgSeq, msgRandom, msgTimeStamp, forbidCallbackControl, sendMsgControl, msgBody, cloudCustomData, offlinePushInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSingleChatMsgRequest {\n");
    sb.append("    syncOtherMachine: ").append(toIndentedString(syncOtherMachine)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    msgLifeTime: ").append(toIndentedString(msgLifeTime)).append("\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
    sb.append("    msgRandom: ").append(toIndentedString(msgRandom)).append("\n");
    sb.append("    msgTimeStamp: ").append(toIndentedString(msgTimeStamp)).append("\n");
    sb.append("    forbidCallbackControl: ").append(toIndentedString(forbidCallbackControl)).append("\n");
    sb.append("    sendMsgControl: ").append(toIndentedString(sendMsgControl)).append("\n");
    sb.append("    msgBody: ").append(toIndentedString(msgBody)).append("\n");
    sb.append("    cloudCustomData: ").append(toIndentedString(cloudCustomData)).append("\n");
    sb.append("    offlinePushInfo: ").append(toIndentedString(offlinePushInfo)).append("\n");
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

