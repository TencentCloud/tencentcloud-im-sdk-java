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
import com.tencentcloudapi.im.model.TIMMsgElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

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
 * ImportGroupMsgRequestMsgListInner
 */

public class ImportGroupMsgRequestMsgListInner {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_SEND_TIME = "SendTime";
  @SerializedName(SERIALIZED_NAME_SEND_TIME)
  private Integer sendTime;

  public static final String SERIALIZED_NAME_RANDOM = "Random";
  @SerializedName(SERIALIZED_NAME_RANDOM)
  private Integer random;

  public static final String SERIALIZED_NAME_MSG_BODY = "MsgBody";
  @SerializedName(SERIALIZED_NAME_MSG_BODY)
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

  public String getFromAccount() {
    return fromAccount;
  }


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

  public Integer getSendTime() {
    return sendTime;
  }


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

  public Integer getRandom() {
    return random;
  }


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
  @ApiModelProperty(value = "")

  public List<TIMMsgElement> getMsgBody() {
    return msgBody;
  }


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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("From_Account");
    openapiFields.add("SendTime");
    openapiFields.add("Random");
    openapiFields.add("MsgBody");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportGroupMsgRequestMsgListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImportGroupMsgRequestMsgListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportGroupMsgRequestMsgListInner is not found in the empty JSON string", ImportGroupMsgRequestMsgListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImportGroupMsgRequestMsgListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportGroupMsgRequestMsgListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("From_Account") != null && !jsonObj.get("From_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From_Account").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportGroupMsgRequestMsgListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportGroupMsgRequestMsgListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportGroupMsgRequestMsgListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportGroupMsgRequestMsgListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportGroupMsgRequestMsgListInner>() {
           @Override
           public void write(JsonWriter out, ImportGroupMsgRequestMsgListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportGroupMsgRequestMsgListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImportGroupMsgRequestMsgListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportGroupMsgRequestMsgListInner
  * @throws IOException if the JSON string is invalid with respect to ImportGroupMsgRequestMsgListInner
  */
  public static ImportGroupMsgRequestMsgListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportGroupMsgRequestMsgListInner.class);
  }

 /**
  * Convert an instance of ImportGroupMsgRequestMsgListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

