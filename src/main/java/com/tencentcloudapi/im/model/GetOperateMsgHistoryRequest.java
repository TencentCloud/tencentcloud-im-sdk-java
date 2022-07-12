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
 * GetOperateMsgHistoryRequest
 */

public class GetOperateMsgHistoryRequest {
  public static final String SERIALIZED_NAME_CHAT_TYPE = "ChatType";
  @SerializedName(SERIALIZED_NAME_CHAT_TYPE)
  private String chatType;

  public static final String SERIALIZED_NAME_MSG_TIME = "MsgTime";
  @SerializedName(SERIALIZED_NAME_MSG_TIME)
  private String msgTime;

  public GetOperateMsgHistoryRequest() { 
  }

  public GetOperateMsgHistoryRequest chatType(String chatType) {
    
    this.chatType = chatType;
    return this;
  }

   /**
   * 消息类型，C2C 表示单发消息 Group 表示群组消息
   * @return chatType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "消息类型，C2C 表示单发消息 Group 表示群组消息")

  public String getChatType() {
    return chatType;
  }


  public void setChatType(String chatType) {
    this.chatType = chatType;
  }


  public GetOperateMsgHistoryRequest msgTime(String msgTime) {
    
    this.msgTime = msgTime;
    return this;
  }

   /**
   * 需要下载的消息记录的时间段，2015120121表示获取2015年12月1日21:00 - 21:59的消息的下载地址。该字段需精确到小时。每次请求只能获取某天某小时的所有单发或群组消息记录
   * @return msgTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "需要下载的消息记录的时间段，2015120121表示获取2015年12月1日21:00 - 21:59的消息的下载地址。该字段需精确到小时。每次请求只能获取某天某小时的所有单发或群组消息记录")

  public String getMsgTime() {
    return msgTime;
  }


  public void setMsgTime(String msgTime) {
    this.msgTime = msgTime;
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
  public GetOperateMsgHistoryRequest putAdditionalProperty(String key, Object value) {
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
    GetOperateMsgHistoryRequest getOperateMsgHistoryRequest = (GetOperateMsgHistoryRequest) o;
    return Objects.equals(this.chatType, getOperateMsgHistoryRequest.chatType) &&
        Objects.equals(this.msgTime, getOperateMsgHistoryRequest.msgTime)&&
        Objects.equals(this.additionalProperties, getOperateMsgHistoryRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatType, msgTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOperateMsgHistoryRequest {\n");
    sb.append("    chatType: ").append(toIndentedString(chatType)).append("\n");
    sb.append("    msgTime: ").append(toIndentedString(msgTime)).append("\n");
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
    openapiFields.add("ChatType");
    openapiFields.add("MsgTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ChatType");
    openapiRequiredFields.add("MsgTime");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetOperateMsgHistoryRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetOperateMsgHistoryRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetOperateMsgHistoryRequest is not found in the empty JSON string", GetOperateMsgHistoryRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetOperateMsgHistoryRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("ChatType") != null && !jsonObj.get("ChatType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChatType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChatType").toString()));
      }
      if (jsonObj.get("MsgTime") != null && !jsonObj.get("MsgTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MsgTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MsgTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetOperateMsgHistoryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetOperateMsgHistoryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetOperateMsgHistoryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetOperateMsgHistoryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetOperateMsgHistoryRequest>() {
           @Override
           public void write(JsonWriter out, GetOperateMsgHistoryRequest value) throws IOException {
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
           public GetOperateMsgHistoryRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetOperateMsgHistoryRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetOperateMsgHistoryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetOperateMsgHistoryRequest
  * @throws IOException if the JSON string is invalid with respect to GetOperateMsgHistoryRequest
  */
  public static GetOperateMsgHistoryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetOperateMsgHistoryRequest.class);
  }

 /**
  * Convert an instance of GetOperateMsgHistoryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

