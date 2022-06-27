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
import com.tencentcloudapi.im.model.ForbidCallbackControl;
import com.tencentcloudapi.im.model.OfflinePushInfo;
import com.tencentcloudapi.im.model.SendMsgControl;
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
 * SendGroupMsgRequest
 */

public class SendGroupMsgRequest {
  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_RANDOM = "Random";
  @SerializedName(SERIALIZED_NAME_RANDOM)
  private Integer random;

  public static final String SERIALIZED_NAME_MSG_PRIORITY = "MsgPriority";
  @SerializedName(SERIALIZED_NAME_MSG_PRIORITY)
  private String msgPriority;

  public static final String SERIALIZED_NAME_MSG_BODY = "MsgBody";
  @SerializedName(SERIALIZED_NAME_MSG_BODY)
  private List<TIMMsgElement> msgBody = new ArrayList<>();

  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_OFFLINE_PUSH_INFO = "OfflinePushInfo";
  @SerializedName(SERIALIZED_NAME_OFFLINE_PUSH_INFO)
  private OfflinePushInfo offlinePushInfo;

  public static final String SERIALIZED_NAME_FORBID_CALLBACK_CONTROL = "ForbidCallbackControl";
  @SerializedName(SERIALIZED_NAME_FORBID_CALLBACK_CONTROL)
  private List<ForbidCallbackControl> forbidCallbackControl = null;

  /**
   * 1表示消息仅发送在线成员，默认0表示发送所有成员，AVChatRoom(直播群)不支持该参数
   */
  @JsonAdapter(OnlineOnlyFlagEnum.Adapter.class)
  public enum OnlineOnlyFlagEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    OnlineOnlyFlagEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OnlineOnlyFlagEnum fromValue(Integer value) {
      for (OnlineOnlyFlagEnum b : OnlineOnlyFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OnlineOnlyFlagEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OnlineOnlyFlagEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OnlineOnlyFlagEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return OnlineOnlyFlagEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ONLINE_ONLY_FLAG = "OnlineOnlyFlag";
  @SerializedName(SERIALIZED_NAME_ONLINE_ONLY_FLAG)
  private OnlineOnlyFlagEnum onlineOnlyFlag;

  public static final String SERIALIZED_NAME_SEND_MSG_CONTROL = "SendMsgControl";
  @SerializedName(SERIALIZED_NAME_SEND_MSG_CONTROL)
  private List<SendMsgControl> sendMsgControl = null;

  public static final String SERIALIZED_NAME_CLOUD_CUSTOM_DATA = "CloudCustomData";
  @SerializedName(SERIALIZED_NAME_CLOUD_CUSTOM_DATA)
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
  @ApiModelProperty(required = true, value = "向哪个群组发送消息")

  public String getGroupId() {
    return groupId;
  }


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
  @ApiModelProperty(required = true, value = "无符号32位整数。如果5分钟内两条消息的随机值相同，后一条消息将被当做重复消息而丢弃")

  public Integer getRandom() {
    return random;
  }


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

  public String getMsgPriority() {
    return msgPriority;
  }


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
  @ApiModelProperty(required = true, value = "消息体，详细可参阅 消息格式描述(https://cloud.tencent.com/document/product/269/2720)")

  public List<TIMMsgElement> getMsgBody() {
    return msgBody;
  }


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

  public String getFromAccount() {
    return fromAccount;
  }


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
  @ApiModelProperty(value = "")

  public OfflinePushInfo getOfflinePushInfo() {
    return offlinePushInfo;
  }


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
  @ApiModelProperty(value = "消息回调禁止开关，只对单条消息有效，ForbidBeforeSendMsgCallback 表示禁止发消息前回调，ForbidAfterSendMsgCallback 表示禁止发消息后回调")

  public List<ForbidCallbackControl> getForbidCallbackControl() {
    return forbidCallbackControl;
  }


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

  public OnlineOnlyFlagEnum getOnlineOnlyFlag() {
    return onlineOnlyFlag;
  }


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
  @ApiModelProperty(value = "消息发送权限，NoLastMsg 只对单条消息有效，表示不更新最近联系人会话；NoUnread 不计未读，只对单条消息有效。（如果该消息 OnlineOnlyFlag 设置为1，则不允许使用该字段。）")

  public List<SendMsgControl> getSendMsgControl() {
    return sendMsgControl;
  }


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

  public String getCloudCustomData() {
    return cloudCustomData;
  }


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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("GroupId");
    openapiFields.add("Random");
    openapiFields.add("MsgPriority");
    openapiFields.add("MsgBody");
    openapiFields.add("From_Account");
    openapiFields.add("OfflinePushInfo");
    openapiFields.add("ForbidCallbackControl");
    openapiFields.add("OnlineOnlyFlag");
    openapiFields.add("SendMsgControl");
    openapiFields.add("CloudCustomData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GroupId");
    openapiRequiredFields.add("Random");
    openapiRequiredFields.add("MsgBody");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendGroupMsgRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SendGroupMsgRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendGroupMsgRequest is not found in the empty JSON string", SendGroupMsgRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendGroupMsgRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendGroupMsgRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SendGroupMsgRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
      if (jsonObj.get("MsgPriority") != null && !jsonObj.get("MsgPriority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MsgPriority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MsgPriority").toString()));
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
      if (jsonObj.get("From_Account") != null && !jsonObj.get("From_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From_Account").toString()));
      }
      // validate the optional field `OfflinePushInfo`
      if (jsonObj.getAsJsonObject("OfflinePushInfo") != null) {
        OfflinePushInfo.validateJsonObject(jsonObj.getAsJsonObject("OfflinePushInfo"));
      }
      // ensure the json data is an array
      if (jsonObj.get("ForbidCallbackControl") != null && !jsonObj.get("ForbidCallbackControl").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ForbidCallbackControl` to be an array in the JSON string but got `%s`", jsonObj.get("ForbidCallbackControl").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("SendMsgControl") != null && !jsonObj.get("SendMsgControl").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SendMsgControl` to be an array in the JSON string but got `%s`", jsonObj.get("SendMsgControl").toString()));
      }
      if (jsonObj.get("CloudCustomData") != null && !jsonObj.get("CloudCustomData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CloudCustomData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CloudCustomData").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendGroupMsgRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendGroupMsgRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendGroupMsgRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendGroupMsgRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SendGroupMsgRequest>() {
           @Override
           public void write(JsonWriter out, SendGroupMsgRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendGroupMsgRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendGroupMsgRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendGroupMsgRequest
  * @throws IOException if the JSON string is invalid with respect to SendGroupMsgRequest
  */
  public static SendGroupMsgRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendGroupMsgRequest.class);
  }

 /**
  * Convert an instance of SendGroupMsgRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

