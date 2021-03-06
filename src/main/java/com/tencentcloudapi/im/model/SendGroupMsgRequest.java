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
   * 1??????????????????????????????????????????0???????????????????????????AVChatRoom(?????????)??????????????????
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
   * ???????????????????????????
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "???????????????????????????")

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
   * ?????????32??????????????????5??????????????????????????????????????????????????????????????????????????????????????????
   * @return random
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "?????????32??????????????????5??????????????????????????????????????????????????????????????????????????????????????????")

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
   * ??????????????????
   * @return msgPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????")

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
   * ??????????????????????????? ??????????????????(https://cloud.tencent.com/document/product/269/2720)
   * @return msgBody
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "??????????????????????????? ??????????????????(https://cloud.tencent.com/document/product/269/2720)")

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
   * ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????? App ?????????????????????????????????App ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????????????????????????????????????????????????????????????????????????????????????? App ?????????????????????????????????App ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????")

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
   * ??????????????????????????????????????????????????????ForbidBeforeSendMsgCallback ?????????????????????????????????ForbidAfterSendMsgCallback ??????????????????????????????
   * @return forbidCallbackControl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????????????????????????????????????????ForbidBeforeSendMsgCallback ?????????????????????????????????ForbidAfterSendMsgCallback ??????????????????????????????")

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
   * 1??????????????????????????????????????????0???????????????????????????AVChatRoom(?????????)??????????????????
   * @return onlineOnlyFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "1??????????????????????????????????????????0???????????????????????????AVChatRoom(?????????)??????????????????")

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
   * ?????????????????????NoLastMsg ??????????????????????????????????????????????????????????????????NoUnread ???????????????????????????????????????????????????????????? OnlineOnlyFlag ?????????1????????????????????????????????????
   * @return sendMsgControl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????NoLastMsg ??????????????????????????????????????????????????????????????????NoUnread ???????????????????????????????????????????????????????????? OnlineOnlyFlag ?????????1????????????????????????????????????")

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
   * ???????????????????????????????????????????????????????????????????????????????????????????????????
   * @return cloudCustomData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "???????????????????????????????????????????????????????????????????????????????????????????????????")

  public String getCloudCustomData() {
    return cloudCustomData;
  }


  public void setCloudCustomData(String cloudCustomData) {
    this.cloudCustomData = cloudCustomData;
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
  public SendGroupMsgRequest putAdditionalProperty(String key, Object value) {
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
        Objects.equals(this.cloudCustomData, sendGroupMsgRequest.cloudCustomData)&&
        Objects.equals(this.additionalProperties, sendGroupMsgRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, random, msgPriority, msgBody, fromAccount, offlinePushInfo, forbidCallbackControl, onlineOnlyFlag, sendMsgControl, cloudCustomData, additionalProperties);
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
           public SendGroupMsgRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SendGroupMsgRequest instance = thisAdapter.fromJsonTree(jsonObj);
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

