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
 * BatchSendSingleChatMsgRequest
 */

public class BatchSendSingleChatMsgRequest {
  /**
   * 1：把消息同步到 From_Account 在线终端和漫游上 2：消息不同步至 From_Account；若不填写默认情况下会将消息存 From_Account 漫游
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
  private List<String> toAccount = new ArrayList<>();

  public static final String SERIALIZED_NAME_MSG_LIFE_TIME = "MsgLifeTime";
  @SerializedName(SERIALIZED_NAME_MSG_LIFE_TIME)
  private Integer msgLifeTime;

  public static final String SERIALIZED_NAME_MSG_SEQ = "MsgSeq";
  @SerializedName(SERIALIZED_NAME_MSG_SEQ)
  private Integer msgSeq;

  public static final String SERIALIZED_NAME_MSG_RANDOM = "MsgRandom";
  @SerializedName(SERIALIZED_NAME_MSG_RANDOM)
  private Integer msgRandom;

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

  public BatchSendSingleChatMsgRequest() { 
  }

  public BatchSendSingleChatMsgRequest syncOtherMachine(SyncOtherMachineEnum syncOtherMachine) {
    
    this.syncOtherMachine = syncOtherMachine;
    return this;
  }

   /**
   * 1：把消息同步到 From_Account 在线终端和漫游上 2：消息不同步至 From_Account；若不填写默认情况下会将消息存 From_Account 漫游
   * @return syncOtherMachine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "1：把消息同步到 From_Account 在线终端和漫游上 2：消息不同步至 From_Account；若不填写默认情况下会将消息存 From_Account 漫游")

  public SyncOtherMachineEnum getSyncOtherMachine() {
    return syncOtherMachine;
  }


  public void setSyncOtherMachine(SyncOtherMachineEnum syncOtherMachine) {
    this.syncOtherMachine = syncOtherMachine;
  }


  public BatchSendSingleChatMsgRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 管理员指定消息发送方帐号（若需设置 From_Account 信息，则该参数取值不能为空）
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "管理员指定消息发送方帐号（若需设置 From_Account 信息，则该参数取值不能为空）")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public BatchSendSingleChatMsgRequest toAccount(List<String> toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

  public BatchSendSingleChatMsgRequest addToAccountItem(String toAccountItem) {
    this.toAccount.add(toAccountItem);
    return this;
  }

   /**
   * 消息接收方用户 UserID
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "消息接收方用户 UserID")

  public List<String> getToAccount() {
    return toAccount;
  }


  public void setToAccount(List<String> toAccount) {
    this.toAccount = toAccount;
  }


  public BatchSendSingleChatMsgRequest msgLifeTime(Integer msgLifeTime) {
    
    this.msgLifeTime = msgLifeTime;
    return this;
  }

   /**
   * 消息离线保存时长（单位：秒），最长为7天（604800秒）。若设置该字段为0，则消息只发在线用户，不保存离线及漫游
   * maximum: 604800
   * @return msgLifeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息离线保存时长（单位：秒），最长为7天（604800秒）。若设置该字段为0，则消息只发在线用户，不保存离线及漫游")

  public Integer getMsgLifeTime() {
    return msgLifeTime;
  }


  public void setMsgLifeTime(Integer msgLifeTime) {
    this.msgLifeTime = msgLifeTime;
  }


  public BatchSendSingleChatMsgRequest msgSeq(Integer msgSeq) {
    
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


  public BatchSendSingleChatMsgRequest msgRandom(Integer msgRandom) {
    
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


  public BatchSendSingleChatMsgRequest sendMsgControl(List<String> sendMsgControl) {
    
    this.sendMsgControl = sendMsgControl;
    return this;
  }

  public BatchSendSingleChatMsgRequest addSendMsgControlItem(String sendMsgControlItem) {
    if (this.sendMsgControl == null) {
      this.sendMsgControl = new ArrayList<>();
    }
    this.sendMsgControl.add(sendMsgControlItem);
    return this;
  }

   /**
   * 消息发送控制选项，是一个 String 数组，只对本次请求有效。\&quot;NoUnread\&quot;表示该条消息不计入未读数。\&quot;NoLastMsg\&quot;表示该条消息不更新会话列表。\&quot;WithMuteNotifications\&quot;表示该条消息的接收方对发送方设置的免打扰选项生效（默认不生效）。
   * @return sendMsgControl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息发送控制选项，是一个 String 数组，只对本次请求有效。\"NoUnread\"表示该条消息不计入未读数。\"NoLastMsg\"表示该条消息不更新会话列表。\"WithMuteNotifications\"表示该条消息的接收方对发送方设置的免打扰选项生效（默认不生效）。")

  public List<String> getSendMsgControl() {
    return sendMsgControl;
  }


  public void setSendMsgControl(List<String> sendMsgControl) {
    this.sendMsgControl = sendMsgControl;
  }


  public BatchSendSingleChatMsgRequest msgBody(List<TIMMsgElement> msgBody) {
    
    this.msgBody = msgBody;
    return this;
  }

  public BatchSendSingleChatMsgRequest addMsgBodyItem(TIMMsgElement msgBodyItem) {
    this.msgBody.add(msgBodyItem);
    return this;
  }

   /**
   * TIM 消息
   * @return msgBody
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "TIM 消息")

  public List<TIMMsgElement> getMsgBody() {
    return msgBody;
  }


  public void setMsgBody(List<TIMMsgElement> msgBody) {
    this.msgBody = msgBody;
  }


  public BatchSendSingleChatMsgRequest cloudCustomData(String cloudCustomData) {
    
    this.cloudCustomData = cloudCustomData;
    return this;
  }

   /**
   * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
   * @return cloudCustomData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）")

  public String getCloudCustomData() {
    return cloudCustomData;
  }


  public void setCloudCustomData(String cloudCustomData) {
    this.cloudCustomData = cloudCustomData;
  }


  public BatchSendSingleChatMsgRequest offlinePushInfo(OfflinePushInfo offlinePushInfo) {
    
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

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public BatchSendSingleChatMsgRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchSendSingleChatMsgRequest batchSendSingleChatMsgRequest = (BatchSendSingleChatMsgRequest) o;
    return Objects.equals(this.syncOtherMachine, batchSendSingleChatMsgRequest.syncOtherMachine) &&
        Objects.equals(this.fromAccount, batchSendSingleChatMsgRequest.fromAccount) &&
        Objects.equals(this.toAccount, batchSendSingleChatMsgRequest.toAccount) &&
        Objects.equals(this.msgLifeTime, batchSendSingleChatMsgRequest.msgLifeTime) &&
        Objects.equals(this.msgSeq, batchSendSingleChatMsgRequest.msgSeq) &&
        Objects.equals(this.msgRandom, batchSendSingleChatMsgRequest.msgRandom) &&
        Objects.equals(this.sendMsgControl, batchSendSingleChatMsgRequest.sendMsgControl) &&
        Objects.equals(this.msgBody, batchSendSingleChatMsgRequest.msgBody) &&
        Objects.equals(this.cloudCustomData, batchSendSingleChatMsgRequest.cloudCustomData) &&
        Objects.equals(this.offlinePushInfo, batchSendSingleChatMsgRequest.offlinePushInfo)&&
        Objects.equals(this.additionalProperties, batchSendSingleChatMsgRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncOtherMachine, fromAccount, toAccount, msgLifeTime, msgSeq, msgRandom, sendMsgControl, msgBody, cloudCustomData, offlinePushInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchSendSingleChatMsgRequest {\n");
    sb.append("    syncOtherMachine: ").append(toIndentedString(syncOtherMachine)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    msgLifeTime: ").append(toIndentedString(msgLifeTime)).append("\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
    sb.append("    msgRandom: ").append(toIndentedString(msgRandom)).append("\n");
    sb.append("    sendMsgControl: ").append(toIndentedString(sendMsgControl)).append("\n");
    sb.append("    msgBody: ").append(toIndentedString(msgBody)).append("\n");
    sb.append("    cloudCustomData: ").append(toIndentedString(cloudCustomData)).append("\n");
    sb.append("    offlinePushInfo: ").append(toIndentedString(offlinePushInfo)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
  * @throws IOException if the JSON Object is invalid with respect to BatchSendSingleChatMsgRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BatchSendSingleChatMsgRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchSendSingleChatMsgRequest is not found in the empty JSON string", BatchSendSingleChatMsgRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BatchSendSingleChatMsgRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("From_Account") != null && !jsonObj.get("From_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From_Account").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be an array in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
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
       if (!BatchSendSingleChatMsgRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchSendSingleChatMsgRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchSendSingleChatMsgRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchSendSingleChatMsgRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchSendSingleChatMsgRequest>() {
           @Override
           public void write(JsonWriter out, BatchSendSingleChatMsgRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchSendSingleChatMsgRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BatchSendSingleChatMsgRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), Object.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BatchSendSingleChatMsgRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BatchSendSingleChatMsgRequest
  * @throws IOException if the JSON string is invalid with respect to BatchSendSingleChatMsgRequest
  */
  public static BatchSendSingleChatMsgRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchSendSingleChatMsgRequest.class);
  }

 /**
  * Convert an instance of BatchSendSingleChatMsgRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

