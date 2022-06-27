/*
 * TIM SERVER REST API SDK
 * TIM REST API
 */


package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tencentcloudapi.im.model.OfflinePushInfo;
import com.tencentcloudapi.im.model.TIMMsgElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.tencentcloudapi.im.JSON;

/**
 * SendSingleChatMsgRequest
 */

public class SendSingleChatMsgRequest {
  /**
   * 1：把消息同步到 From_Account 在线终端和漫游上；2：消息不同步至 From_Account；若不填写默认情况下会将消息存 From_Account 漫游
   */
  @JsonAdapter(SyncOtherMachineEnum.Adapter.class)
  public enum SyncOtherMachineEnum {
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    SyncOtherMachineEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SyncOtherMachineEnum fromValue(Integer value) {
      for (SyncOtherMachineEnum b : SyncOtherMachineEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SyncOtherMachineEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SyncOtherMachineEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SyncOtherMachineEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return SyncOtherMachineEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SYNC_OTHER_MACHINE = "SyncOtherMachine";
  @SerializedName(SERIALIZED_NAME_SYNC_OTHER_MACHINE)
  private SyncOtherMachineEnum syncOtherMachine;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_MSG_LIFE_TIME = "MsgLifeTime";
  @SerializedName(SERIALIZED_NAME_MSG_LIFE_TIME)
  private Integer msgLifeTime;

  public static final String SERIALIZED_NAME_MSG_SEQ = "MsgSeq";
  @SerializedName(SERIALIZED_NAME_MSG_SEQ)
  private Integer msgSeq;

  public static final String SERIALIZED_NAME_MSG_RANDOM = "MsgRandom";
  @SerializedName(SERIALIZED_NAME_MSG_RANDOM)
  private Integer msgRandom;

  public static final String SERIALIZED_NAME_MSG_TIME_STAMP = "MsgTimeStamp";
  @SerializedName(SERIALIZED_NAME_MSG_TIME_STAMP)
  private Integer msgTimeStamp;

  public static final String SERIALIZED_NAME_FORBID_CALLBACK_CONTROL = "ForbidCallbackControl";
  @SerializedName(SERIALIZED_NAME_FORBID_CALLBACK_CONTROL)
  private List<String> forbidCallbackControl = null;

  public static final String SERIALIZED_NAME_SEND_MSG_CONTROL = "SendMsgControl";
  @SerializedName(SERIALIZED_NAME_SEND_MSG_CONTROL)
  private List<String> sendMsgControl = null;

  public static final String SERIALIZED_NAME_MSG_BODY = "MsgBody";
  @SerializedName(SERIALIZED_NAME_MSG_BODY)
  private List<TIMMsgElement> msgBody = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLOUD_CUSTOM_DATA = "CloudCustomData";
  @SerializedName(SERIALIZED_NAME_CLOUD_CUSTOM_DATA)
  private String cloudCustomData;

  public static final String SERIALIZED_NAME_OFFLINE_PUSH_INFO = "OfflinePushInfo";
  @SerializedName(SERIALIZED_NAME_OFFLINE_PUSH_INFO)
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

  public SyncOtherMachineEnum getSyncOtherMachine() {
    return syncOtherMachine;
  }


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

  public String getFromAccount() {
    return fromAccount;
  }


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
  @ApiModelProperty(required = true, value = "消息接收方 UserID")

  public String getToAccount() {
    return toAccount;
  }


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

  public Integer getMsgLifeTime() {
    return msgLifeTime;
  }


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

  public Integer getMsgSeq() {
    return msgSeq;
  }


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
  @ApiModelProperty(required = true, value = "消息随机数（32位无符号整数），后台用于同一秒内的消息去重。请确保该字段填的是随机")

  public Integer getMsgRandom() {
    return msgRandom;
  }


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

  public Integer getMsgTimeStamp() {
    return msgTimeStamp;
  }


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

  public List<String> getForbidCallbackControl() {
    return forbidCallbackControl;
  }


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

  public List<String> getSendMsgControl() {
    return sendMsgControl;
  }


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
  @ApiModelProperty(required = true, value = "")

  public List<TIMMsgElement> getMsgBody() {
    return msgBody;
  }


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

  public String getCloudCustomData() {
    return cloudCustomData;
  }


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
  @ApiModelProperty(value = "")

  public OfflinePushInfo getOfflinePushInfo() {
    return offlinePushInfo;
  }


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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("SyncOtherMachine");
    openapiFields.add("From_Account");
    openapiFields.add("To_Account");
    openapiFields.add("MsgLifeTime");
    openapiFields.add("MsgSeq");
    openapiFields.add("MsgRandom");
    openapiFields.add("MsgTimeStamp");
    openapiFields.add("ForbidCallbackControl");
    openapiFields.add("SendMsgControl");
    openapiFields.add("MsgBody");
    openapiFields.add("CloudCustomData");
    openapiFields.add("OfflinePushInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("To_Account");
    openapiRequiredFields.add("MsgRandom");
    openapiRequiredFields.add("MsgBody");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendSingleChatMsgRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SendSingleChatMsgRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendSingleChatMsgRequest is not found in the empty JSON string", SendSingleChatMsgRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendSingleChatMsgRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendSingleChatMsgRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SendSingleChatMsgRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("From_Account") != null && !jsonObj.get("From_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From_Account").toString()));
      }
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("ForbidCallbackControl") != null && !jsonObj.get("ForbidCallbackControl").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ForbidCallbackControl` to be an array in the JSON string but got `%s`", jsonObj.get("ForbidCallbackControl").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("SendMsgControl") != null && !jsonObj.get("SendMsgControl").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SendMsgControl` to be an array in the JSON string but got `%s`", jsonObj.get("SendMsgControl").toString()));
      }
      JsonArray jsonArraymsgBody = jsonObj.getAsJsonArray("MsgBody");
      if (jsonArraymsgBody != null) {
        // ensure the json data is an array
        if (!jsonObj.get("MsgBody").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `MsgBody` to be an array in the JSON string but got `%s`", jsonObj.get("MsgBody").toString()));
        }

        // validate the optional field `MsgBody` (array)
        for (int i = 0; i < jsonArraymsgBody.size(); i++) {
          TIMMsgElement.validateJsonObject(jsonArraymsgBody.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("CloudCustomData") != null && !jsonObj.get("CloudCustomData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CloudCustomData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CloudCustomData").toString()));
      }
      // validate the optional field `OfflinePushInfo`
      if (jsonObj.getAsJsonObject("OfflinePushInfo") != null) {
        OfflinePushInfo.validateJsonObject(jsonObj.getAsJsonObject("OfflinePushInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendSingleChatMsgRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendSingleChatMsgRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendSingleChatMsgRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendSingleChatMsgRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SendSingleChatMsgRequest>() {
           @Override
           public void write(JsonWriter out, SendSingleChatMsgRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendSingleChatMsgRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendSingleChatMsgRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendSingleChatMsgRequest
  * @throws IOException if the JSON string is invalid with respect to SendSingleChatMsgRequest
  */
  public static SendSingleChatMsgRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendSingleChatMsgRequest.class);
  }

 /**
  * Convert an instance of SendSingleChatMsgRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

