
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.ForbidCallbackControl;
import com.tencentcloudapi.im.model.OfflinePushInfo;
import com.tencentcloudapi.im.model.SendMsgControl;
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
 * SendGroupMsgRequest
 */
@JsonPropertyOrder({
  SendGroupMsgRequest.JSON_PROPERTY_GROUP_ID,
  SendGroupMsgRequest.JSON_PROPERTY_RANDOM,
  SendGroupMsgRequest.JSON_PROPERTY_MSG_PRIORITY,
  SendGroupMsgRequest.JSON_PROPERTY_MSG_BODY,
  SendGroupMsgRequest.JSON_PROPERTY_FROM_ACCOUNT,
  SendGroupMsgRequest.JSON_PROPERTY_OFFLINE_PUSH_INFO,
  SendGroupMsgRequest.JSON_PROPERTY_FORBID_CALLBACK_CONTROL,
  SendGroupMsgRequest.JSON_PROPERTY_ONLINE_ONLY_FLAG,
  SendGroupMsgRequest.JSON_PROPERTY_SEND_MSG_CONTROL,
  SendGroupMsgRequest.JSON_PROPERTY_CLOUD_CUSTOM_DATA
})

public class SendGroupMsgRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_RANDOM = "Random";
  private Integer random;

  public static final String JSON_PROPERTY_MSG_PRIORITY = "MsgPriority";
  private String msgPriority;

  public static final String JSON_PROPERTY_MSG_BODY = "MsgBody";
  private List<TIMMsgElement> msgBody = new ArrayList<>();

  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_OFFLINE_PUSH_INFO = "OfflinePushInfo";
  private OfflinePushInfo offlinePushInfo;

  public static final String JSON_PROPERTY_FORBID_CALLBACK_CONTROL = "ForbidCallbackControl";
  private List<ForbidCallbackControl> forbidCallbackControl = null;

  /**
   * 1表示消息仅发送在线成员，默认0表示发送所有成员，AVChatRoom(直播群)不支持该参数
   */
  public enum OnlineOnlyFlagEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    OnlineOnlyFlagEnum(Integer value) {
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
    public static OnlineOnlyFlagEnum fromValue(Integer value) {
      for (OnlineOnlyFlagEnum b : OnlineOnlyFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ONLINE_ONLY_FLAG = "OnlineOnlyFlag";
  private OnlineOnlyFlagEnum onlineOnlyFlag;

  public static final String JSON_PROPERTY_SEND_MSG_CONTROL = "SendMsgControl";
  private List<SendMsgControl> sendMsgControl = null;

  public static final String JSON_PROPERTY_CLOUD_CUSTOM_DATA = "CloudCustomData";
  private String cloudCustomData;

  public SendGroupMsgRequest() { 
  }

  public SendGroupMsgRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 向哪个群组发送消息
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "向哪个群组发送消息")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public SendGroupMsgRequest random(Integer random) {
    
    this.random = random;
    return this;
  }

   /**
   * 无符号32位整数。如果5分钟内两条消息的随机值相同，后一条消息将被当做重复消息而丢弃
   * @return random
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "无符号32位整数。如果5分钟内两条消息的随机值相同，后一条消息将被当做重复消息而丢弃")
  @JsonProperty(JSON_PROPERTY_RANDOM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRandom() {
    return random;
  }


  @JsonProperty(JSON_PROPERTY_RANDOM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRandom(Integer random) {
    this.random = random;
  }


  public SendGroupMsgRequest msgPriority(String msgPriority) {
    
    this.msgPriority = msgPriority;
    return this;
  }

   /**
   * 消息的优先级
   * @return msgPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息的优先级")
  @JsonProperty(JSON_PROPERTY_MSG_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMsgPriority() {
    return msgPriority;
  }


  @JsonProperty(JSON_PROPERTY_MSG_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgPriority(String msgPriority) {
    this.msgPriority = msgPriority;
  }


  public SendGroupMsgRequest msgBody(List<TIMMsgElement> msgBody) {
    
    this.msgBody = msgBody;
    return this;
  }

  public SendGroupMsgRequest addMsgBodyItem(TIMMsgElement msgBodyItem) {
    this.msgBody.add(msgBodyItem);
    return this;
  }

   /**
   * 消息体，详细可参阅 消息格式描述(https://cloud.tencent.com/document/product/269/2720)
   * @return msgBody
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "消息体，详细可参阅 消息格式描述(https://cloud.tencent.com/document/product/269/2720)")
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


  public SendGroupMsgRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 消息来源帐号，选填。如果不填写该字段，则默认消息的发送者为调用该接口时使用的 App 管理员帐号。除此之外，App 亦可通过该字段“伪造”消息的发送者，从而实现一些特殊的功能需求。需要注意的是，如果指定该字段，必须要确保字段中的帐号是存在的
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息来源帐号，选填。如果不填写该字段，则默认消息的发送者为调用该接口时使用的 App 管理员帐号。除此之外，App 亦可通过该字段“伪造”消息的发送者，从而实现一些特殊的功能需求。需要注意的是，如果指定该字段，必须要确保字段中的帐号是存在的")
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


  public SendGroupMsgRequest offlinePushInfo(OfflinePushInfo offlinePushInfo) {
    
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


  public SendGroupMsgRequest forbidCallbackControl(List<ForbidCallbackControl> forbidCallbackControl) {
    
    this.forbidCallbackControl = forbidCallbackControl;
    return this;
  }

  public SendGroupMsgRequest addForbidCallbackControlItem(ForbidCallbackControl forbidCallbackControlItem) {
    if (this.forbidCallbackControl == null) {
      this.forbidCallbackControl = new ArrayList<>();
    }
    this.forbidCallbackControl.add(forbidCallbackControlItem);
    return this;
  }

   /**
   * 消息回调禁止开关，只对单条消息有效，ForbidBeforeSendMsgCallback 表示禁止发消息前回调，ForbidAfterSendMsgCallback 表示禁止发消息后回调
   * @return forbidCallbackControl
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "消息回调禁止开关，只对单条消息有效，ForbidBeforeSendMsgCallback 表示禁止发消息前回调，ForbidAfterSendMsgCallback 表示禁止发消息后回调")
  @JsonProperty(JSON_PROPERTY_FORBID_CALLBACK_CONTROL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ForbidCallbackControl> getForbidCallbackControl() {
    return forbidCallbackControl;
  }


  @JsonProperty(JSON_PROPERTY_FORBID_CALLBACK_CONTROL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForbidCallbackControl(List<ForbidCallbackControl> forbidCallbackControl) {
    this.forbidCallbackControl = forbidCallbackControl;
  }


  public SendGroupMsgRequest onlineOnlyFlag(OnlineOnlyFlagEnum onlineOnlyFlag) {
    
    this.onlineOnlyFlag = onlineOnlyFlag;
    return this;
  }

   /**
   * 1表示消息仅发送在线成员，默认0表示发送所有成员，AVChatRoom(直播群)不支持该参数
   * @return onlineOnlyFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "1表示消息仅发送在线成员，默认0表示发送所有成员，AVChatRoom(直播群)不支持该参数")
  @JsonProperty(JSON_PROPERTY_ONLINE_ONLY_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OnlineOnlyFlagEnum getOnlineOnlyFlag() {
    return onlineOnlyFlag;
  }


  @JsonProperty(JSON_PROPERTY_ONLINE_ONLY_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlineOnlyFlag(OnlineOnlyFlagEnum onlineOnlyFlag) {
    this.onlineOnlyFlag = onlineOnlyFlag;
  }


  public SendGroupMsgRequest sendMsgControl(List<SendMsgControl> sendMsgControl) {
    
    this.sendMsgControl = sendMsgControl;
    return this;
  }

  public SendGroupMsgRequest addSendMsgControlItem(SendMsgControl sendMsgControlItem) {
    if (this.sendMsgControl == null) {
      this.sendMsgControl = new ArrayList<>();
    }
    this.sendMsgControl.add(sendMsgControlItem);
    return this;
  }

   /**
   * 消息发送权限，NoLastMsg 只对单条消息有效，表示不更新最近联系人会话；NoUnread 不计未读，只对单条消息有效。（如果该消息 OnlineOnlyFlag 设置为1，则不允许使用该字段。）
   * @return sendMsgControl
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "消息发送权限，NoLastMsg 只对单条消息有效，表示不更新最近联系人会话；NoUnread 不计未读，只对单条消息有效。（如果该消息 OnlineOnlyFlag 设置为1，则不允许使用该字段。）")
  @JsonProperty(JSON_PROPERTY_SEND_MSG_CONTROL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendMsgControl> getSendMsgControl() {
    return sendMsgControl;
  }


  @JsonProperty(JSON_PROPERTY_SEND_MSG_CONTROL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendMsgControl(List<SendMsgControl> sendMsgControl) {
    this.sendMsgControl = sendMsgControl;
  }


  public SendGroupMsgRequest cloudCustomData(String cloudCustomData) {
    
    this.cloudCustomData = cloudCustomData;
    return this;
  }

   /**
   * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
   * @return cloudCustomData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendGroupMsgRequest sendGroupMsgRequest = (SendGroupMsgRequest) o;
    return Objects.equals(this.groupId, sendGroupMsgRequest.groupId) &&
        Objects.equals(this.random, sendGroupMsgRequest.random) &&
        Objects.equals(this.msgPriority, sendGroupMsgRequest.msgPriority) &&
        Objects.equals(this.msgBody, sendGroupMsgRequest.msgBody) &&
        Objects.equals(this.fromAccount, sendGroupMsgRequest.fromAccount) &&
        Objects.equals(this.offlinePushInfo, sendGroupMsgRequest.offlinePushInfo) &&
        Objects.equals(this.forbidCallbackControl, sendGroupMsgRequest.forbidCallbackControl) &&
        Objects.equals(this.onlineOnlyFlag, sendGroupMsgRequest.onlineOnlyFlag) &&
        Objects.equals(this.sendMsgControl, sendGroupMsgRequest.sendMsgControl) &&
        Objects.equals(this.cloudCustomData, sendGroupMsgRequest.cloudCustomData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, random, msgPriority, msgBody, fromAccount, offlinePushInfo, forbidCallbackControl, onlineOnlyFlag, sendMsgControl, cloudCustomData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendGroupMsgRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    random: ").append(toIndentedString(random)).append("\n");
    sb.append("    msgPriority: ").append(toIndentedString(msgPriority)).append("\n");
    sb.append("    msgBody: ").append(toIndentedString(msgBody)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    offlinePushInfo: ").append(toIndentedString(offlinePushInfo)).append("\n");
    sb.append("    forbidCallbackControl: ").append(toIndentedString(forbidCallbackControl)).append("\n");
    sb.append("    onlineOnlyFlag: ").append(toIndentedString(onlineOnlyFlag)).append("\n");
    sb.append("    sendMsgControl: ").append(toIndentedString(sendMsgControl)).append("\n");
    sb.append("    cloudCustomData: ").append(toIndentedString(cloudCustomData)).append("\n");
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

