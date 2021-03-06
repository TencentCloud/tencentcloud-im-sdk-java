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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * GroupMsgGetSimpleResponseAllOfRspMsgList
 */

public class GroupMsgGetSimpleResponseAllOfRspMsgList {
  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_IS_PLACE_MSG = "IsPlaceMsg";
  @SerializedName(SERIALIZED_NAME_IS_PLACE_MSG)
  private Integer isPlaceMsg;

  public static final String SERIALIZED_NAME_MSG_PRIORITY = "MsgPriority";
  @SerializedName(SERIALIZED_NAME_MSG_PRIORITY)
  private Integer msgPriority;

  public static final String SERIALIZED_NAME_MSG_RANDOM = "MsgRandom";
  @SerializedName(SERIALIZED_NAME_MSG_RANDOM)
  private Integer msgRandom;

  public static final String SERIALIZED_NAME_MSG_SEQ = "MsgSeq";
  @SerializedName(SERIALIZED_NAME_MSG_SEQ)
  private Integer msgSeq;

  public static final String SERIALIZED_NAME_MSG_TIME_STAMP = "MsgTimeStamp";
  @SerializedName(SERIALIZED_NAME_MSG_TIME_STAMP)
  private Integer msgTimeStamp;

  public static final String SERIALIZED_NAME_IS_SYSTEM_MSG = "IsSystemMsg";
  @SerializedName(SERIALIZED_NAME_IS_SYSTEM_MSG)
  private Integer isSystemMsg;

  public static final String SERIALIZED_NAME_MSG_BODY = "MsgBody";
  @SerializedName(SERIALIZED_NAME_MSG_BODY)
  private Object msgBody;

  public GroupMsgGetSimpleResponseAllOfRspMsgList() { 
  }

  public GroupMsgGetSimpleResponseAllOfRspMsgList fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * ??????????????????
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList isPlaceMsg(Integer isPlaceMsg) {
    
    this.isPlaceMsg = isPlaceMsg;
    return this;
  }

   /**
   * ??????????????????????????????????????????????????????????????????MsgBody ?????????????????????1?????????????????????????????????2
   * @return isPlaceMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????????????????????????????????????????????????????MsgBody ?????????????????????1?????????????????????????????????2")

  public Integer getIsPlaceMsg() {
    return isPlaceMsg;
  }


  public void setIsPlaceMsg(Integer isPlaceMsg) {
    this.isPlaceMsg = isPlaceMsg;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList msgPriority(Integer msgPriority) {
    
    this.msgPriority = msgPriority;
    return this;
  }

   /**
   * ????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????1?????? High ??????????????????2?????? Normal ??????????????????3?????? Low ??????????????????4?????? Lowest ???????????????
   * @return msgPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????1?????? High ??????????????????2?????? Normal ??????????????????3?????? Low ??????????????????4?????? Lowest ???????????????")

  public Integer getMsgPriority() {
    return msgPriority;
  }


  public void setMsgPriority(Integer msgPriority) {
    this.msgPriority = msgPriority;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList msgRandom(Integer msgRandom) {
    
    this.msgRandom = msgRandom;
    return this;
  }

   /**
   * ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
   * @return msgRandom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????")

  public Integer getMsgRandom() {
    return msgRandom;
  }


  public void setMsgRandom(Integer msgRandom) {
    this.msgRandom = msgRandom;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * ?????? seq??????????????????????????????????????????????????????
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????? seq??????????????????????????????????????????????????????")

  public Integer getMsgSeq() {
    return msgSeq;
  }


  public void setMsgSeq(Integer msgSeq) {
    this.msgSeq = msgSeq;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList msgTimeStamp(Integer msgTimeStamp) {
    
    this.msgTimeStamp = msgTimeStamp;
    return this;
  }

   /**
   * ??????????????????????????????server ?????????
   * @return msgTimeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????????????????server ?????????")

  public Integer getMsgTimeStamp() {
    return msgTimeStamp;
  }


  public void setMsgTimeStamp(Integer msgTimeStamp) {
    this.msgTimeStamp = msgTimeStamp;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList isSystemMsg(Integer isSystemMsg) {
    
    this.isSystemMsg = isSystemMsg;
    return this;
  }

   /**
   * ?????????1?????????????????????
   * @return isSystemMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????1?????????????????????")

  public Integer getIsSystemMsg() {
    return isSystemMsg;
  }


  public void setIsSystemMsg(Integer isSystemMsg) {
    this.isSystemMsg = isSystemMsg;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList msgBody(Object msgBody) {
    
    this.msgBody = msgBody;
    return this;
  }

   /**
   * ????????????
   * @return msgBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "????????????")

  public Object getMsgBody() {
    return msgBody;
  }


  public void setMsgBody(Object msgBody) {
    this.msgBody = msgBody;
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
  public GroupMsgGetSimpleResponseAllOfRspMsgList putAdditionalProperty(String key, Object value) {
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
    GroupMsgGetSimpleResponseAllOfRspMsgList groupMsgGetSimpleResponseAllOfRspMsgList = (GroupMsgGetSimpleResponseAllOfRspMsgList) o;
    return Objects.equals(this.fromAccount, groupMsgGetSimpleResponseAllOfRspMsgList.fromAccount) &&
        Objects.equals(this.isPlaceMsg, groupMsgGetSimpleResponseAllOfRspMsgList.isPlaceMsg) &&
        Objects.equals(this.msgPriority, groupMsgGetSimpleResponseAllOfRspMsgList.msgPriority) &&
        Objects.equals(this.msgRandom, groupMsgGetSimpleResponseAllOfRspMsgList.msgRandom) &&
        Objects.equals(this.msgSeq, groupMsgGetSimpleResponseAllOfRspMsgList.msgSeq) &&
        Objects.equals(this.msgTimeStamp, groupMsgGetSimpleResponseAllOfRspMsgList.msgTimeStamp) &&
        Objects.equals(this.isSystemMsg, groupMsgGetSimpleResponseAllOfRspMsgList.isSystemMsg) &&
        Objects.equals(this.msgBody, groupMsgGetSimpleResponseAllOfRspMsgList.msgBody)&&
        Objects.equals(this.additionalProperties, groupMsgGetSimpleResponseAllOfRspMsgList.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, isPlaceMsg, msgPriority, msgRandom, msgSeq, msgTimeStamp, isSystemMsg, msgBody, additionalProperties);
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
    sb.append("    isSystemMsg: ").append(toIndentedString(isSystemMsg)).append("\n");
    sb.append("    msgBody: ").append(toIndentedString(msgBody)).append("\n");
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
    openapiFields.add("From_Account");
    openapiFields.add("IsPlaceMsg");
    openapiFields.add("MsgPriority");
    openapiFields.add("MsgRandom");
    openapiFields.add("MsgSeq");
    openapiFields.add("MsgTimeStamp");
    openapiFields.add("IsSystemMsg");
    openapiFields.add("MsgBody");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupMsgGetSimpleResponseAllOfRspMsgList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupMsgGetSimpleResponseAllOfRspMsgList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupMsgGetSimpleResponseAllOfRspMsgList is not found in the empty JSON string", GroupMsgGetSimpleResponseAllOfRspMsgList.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("From_Account") != null && !jsonObj.get("From_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From_Account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupMsgGetSimpleResponseAllOfRspMsgList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupMsgGetSimpleResponseAllOfRspMsgList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupMsgGetSimpleResponseAllOfRspMsgList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupMsgGetSimpleResponseAllOfRspMsgList.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupMsgGetSimpleResponseAllOfRspMsgList>() {
           @Override
           public void write(JsonWriter out, GroupMsgGetSimpleResponseAllOfRspMsgList value) throws IOException {
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
           public GroupMsgGetSimpleResponseAllOfRspMsgList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GroupMsgGetSimpleResponseAllOfRspMsgList instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GroupMsgGetSimpleResponseAllOfRspMsgList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupMsgGetSimpleResponseAllOfRspMsgList
  * @throws IOException if the JSON string is invalid with respect to GroupMsgGetSimpleResponseAllOfRspMsgList
  */
  public static GroupMsgGetSimpleResponseAllOfRspMsgList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupMsgGetSimpleResponseAllOfRspMsgList.class);
  }

 /**
  * Convert an instance of GroupMsgGetSimpleResponseAllOfRspMsgList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

