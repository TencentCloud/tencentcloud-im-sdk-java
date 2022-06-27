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
 * SendSingleChatMsgResponseAllOf
 */

public class SendSingleChatMsgResponseAllOf {
  public static final String SERIALIZED_NAME_MSG_TIME = "MsgTime";
  @SerializedName(SERIALIZED_NAME_MSG_TIME)
  private Integer msgTime;

  public static final String SERIALIZED_NAME_MSG_KEY = "MsgKey";
  @SerializedName(SERIALIZED_NAME_MSG_KEY)
  private String msgKey;

  public SendSingleChatMsgResponseAllOf() { 
  }

  public SendSingleChatMsgResponseAllOf msgTime(Integer msgTime) {
    
    this.msgTime = msgTime;
    return this;
  }

   /**
   * 消息时间戳，UNIX 时间戳
   * @return msgTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息时间戳，UNIX 时间戳")

  public Integer getMsgTime() {
    return msgTime;
  }


  public void setMsgTime(Integer msgTime) {
    this.msgTime = msgTime;
  }


  public SendSingleChatMsgResponseAllOf msgKey(String msgKey) {
    
    this.msgKey = msgKey;
    return this;
  }

   /**
   * 消息唯一标识，用于撤回。长度不超过50个字符
   * @return msgKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息唯一标识，用于撤回。长度不超过50个字符")

  public String getMsgKey() {
    return msgKey;
  }


  public void setMsgKey(String msgKey) {
    this.msgKey = msgKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendSingleChatMsgResponseAllOf sendSingleChatMsgResponseAllOf = (SendSingleChatMsgResponseAllOf) o;
    return Objects.equals(this.msgTime, sendSingleChatMsgResponseAllOf.msgTime) &&
        Objects.equals(this.msgKey, sendSingleChatMsgResponseAllOf.msgKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgTime, msgKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSingleChatMsgResponseAllOf {\n");
    sb.append("    msgTime: ").append(toIndentedString(msgTime)).append("\n");
    sb.append("    msgKey: ").append(toIndentedString(msgKey)).append("\n");
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
    openapiFields.add("MsgTime");
    openapiFields.add("MsgKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendSingleChatMsgResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SendSingleChatMsgResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendSingleChatMsgResponseAllOf is not found in the empty JSON string", SendSingleChatMsgResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendSingleChatMsgResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendSingleChatMsgResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("MsgKey") != null && !jsonObj.get("MsgKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MsgKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MsgKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendSingleChatMsgResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendSingleChatMsgResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendSingleChatMsgResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendSingleChatMsgResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<SendSingleChatMsgResponseAllOf>() {
           @Override
           public void write(JsonWriter out, SendSingleChatMsgResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendSingleChatMsgResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendSingleChatMsgResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendSingleChatMsgResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to SendSingleChatMsgResponseAllOf
  */
  public static SendSingleChatMsgResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendSingleChatMsgResponseAllOf.class);
  }

 /**
  * Convert an instance of SendSingleChatMsgResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

