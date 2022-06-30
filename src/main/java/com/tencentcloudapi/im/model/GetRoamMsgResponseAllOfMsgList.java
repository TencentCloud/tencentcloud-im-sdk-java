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
 * GetRoamMsgResponseAllOfMsgList
 */

public class GetRoamMsgResponseAllOfMsgList {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private Integer fromAccount;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private Integer toAccount;

  public static final String SERIALIZED_NAME_MSG_RANDOM = "MsgRandom";
  @SerializedName(SERIALIZED_NAME_MSG_RANDOM)
  private Integer msgRandom;

  public static final String SERIALIZED_NAME_MSG_TIME_STAMP = "MsgTimeStamp";
  @SerializedName(SERIALIZED_NAME_MSG_TIME_STAMP)
  private Integer msgTimeStamp;

  public static final String SERIALIZED_NAME_MSG_FLAG_BITS = "MsgFlagBits";
  @SerializedName(SERIALIZED_NAME_MSG_FLAG_BITS)
  private Integer msgFlagBits;

  public static final String SERIALIZED_NAME_MSG_KEY = "MsgKey";
  @SerializedName(SERIALIZED_NAME_MSG_KEY)
  private String msgKey;

  public static final String SERIALIZED_NAME_MSG_BODY = "MsgBody";
  @SerializedName(SERIALIZED_NAME_MSG_BODY)
  private List<TIMMsgElement> msgBody = null;

  public static final String SERIALIZED_NAME_CLOUD_CUSTOM_DATA = "CloudCustomData";
  @SerializedName(SERIALIZED_NAME_CLOUD_CUSTOM_DATA)
  private String cloudCustomData;

  public GetRoamMsgResponseAllOfMsgList() { 
  }

  public GetRoamMsgResponseAllOfMsgList fromAccount(Integer fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 消息发送方 UserID
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息发送方 UserID")

  public Integer getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(Integer fromAccount) {
    this.fromAccount = fromAccount;
  }


  public GetRoamMsgResponseAllOfMsgList toAccount(Integer toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 消息接收方 UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息接收方 UserID")

  public Integer getToAccount() {
    return toAccount;
  }


  public void setToAccount(Integer toAccount) {
    this.toAccount = toAccount;
  }


  public GetRoamMsgResponseAllOfMsgList msgRandom(Integer msgRandom) {
    
    this.msgRandom = msgRandom;
    return this;
  }

   /**
   * 消息随机数（32位无符号整数），后台用于同一秒内的消息去重。请确保该字段填的是随机
   * @return msgRandom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息随机数（32位无符号整数），后台用于同一秒内的消息去重。请确保该字段填的是随机")

  public Integer getMsgRandom() {
    return msgRandom;
  }


  public void setMsgRandom(Integer msgRandom) {
    this.msgRandom = msgRandom;
  }


  public GetRoamMsgResponseAllOfMsgList msgTimeStamp(Integer msgTimeStamp) {
    
    this.msgTimeStamp = msgTimeStamp;
    return this;
  }

   /**
   * 消息时间戳，UNIX 时间戳（单位：秒
   * @return msgTimeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息时间戳，UNIX 时间戳（单位：秒")

  public Integer getMsgTimeStamp() {
    return msgTimeStamp;
  }


  public void setMsgTimeStamp(Integer msgTimeStamp) {
    this.msgTimeStamp = msgTimeStamp;
  }


  public GetRoamMsgResponseAllOfMsgList msgFlagBits(Integer msgFlagBits) {
    
    this.msgFlagBits = msgFlagBits;
    return this;
  }

   /**
   * 该条消息的属性，0表示正常消息，8表示被撤回的消息
   * @return msgFlagBits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该条消息的属性，0表示正常消息，8表示被撤回的消息")

  public Integer getMsgFlagBits() {
    return msgFlagBits;
  }


  public void setMsgFlagBits(Integer msgFlagBits) {
    this.msgFlagBits = msgFlagBits;
  }


  public GetRoamMsgResponseAllOfMsgList msgKey(String msgKey) {
    
    this.msgKey = msgKey;
    return this;
  }

   /**
   * 标识该条消息，可用于 REST API（https://cloud.tencent.com/document/product/269/38980） 撤回单聊消息
   * @return msgKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标识该条消息，可用于 REST API（https://cloud.tencent.com/document/product/269/38980） 撤回单聊消息")

  public String getMsgKey() {
    return msgKey;
  }


  public void setMsgKey(String msgKey) {
    this.msgKey = msgKey;
  }


  public GetRoamMsgResponseAllOfMsgList msgBody(List<TIMMsgElement> msgBody) {
    
    this.msgBody = msgBody;
    return this;
  }

  public GetRoamMsgResponseAllOfMsgList addMsgBodyItem(TIMMsgElement msgBodyItem) {
    if (this.msgBody == null) {
      this.msgBody = new ArrayList<>();
    }
    this.msgBody.add(msgBodyItem);
    return this;
  }

   /**
   * 消息内容
   * @return msgBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息内容")

  public List<TIMMsgElement> getMsgBody() {
    return msgBody;
  }


  public void setMsgBody(List<TIMMsgElement> msgBody) {
    this.msgBody = msgBody;
  }


  public GetRoamMsgResponseAllOfMsgList cloudCustomData(String cloudCustomData) {
    
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
    GetRoamMsgResponseAllOfMsgList getRoamMsgResponseAllOfMsgList = (GetRoamMsgResponseAllOfMsgList) o;
    return Objects.equals(this.fromAccount, getRoamMsgResponseAllOfMsgList.fromAccount) &&
        Objects.equals(this.toAccount, getRoamMsgResponseAllOfMsgList.toAccount) &&
        Objects.equals(this.msgRandom, getRoamMsgResponseAllOfMsgList.msgRandom) &&
        Objects.equals(this.msgTimeStamp, getRoamMsgResponseAllOfMsgList.msgTimeStamp) &&
        Objects.equals(this.msgFlagBits, getRoamMsgResponseAllOfMsgList.msgFlagBits) &&
        Objects.equals(this.msgKey, getRoamMsgResponseAllOfMsgList.msgKey) &&
        Objects.equals(this.msgBody, getRoamMsgResponseAllOfMsgList.msgBody) &&
        Objects.equals(this.cloudCustomData, getRoamMsgResponseAllOfMsgList.cloudCustomData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, toAccount, msgRandom, msgTimeStamp, msgFlagBits, msgKey, msgBody, cloudCustomData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoamMsgResponseAllOfMsgList {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    msgRandom: ").append(toIndentedString(msgRandom)).append("\n");
    sb.append("    msgTimeStamp: ").append(toIndentedString(msgTimeStamp)).append("\n");
    sb.append("    msgFlagBits: ").append(toIndentedString(msgFlagBits)).append("\n");
    sb.append("    msgKey: ").append(toIndentedString(msgKey)).append("\n");
    sb.append("    msgBody: ").append(toIndentedString(msgBody)).append("\n");
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
    openapiFields.add("From_Account");
    openapiFields.add("To_Account");
    openapiFields.add("MsgRandom");
    openapiFields.add("MsgTimeStamp");
    openapiFields.add("MsgFlagBits");
    openapiFields.add("MsgKey");
    openapiFields.add("MsgBody");
    openapiFields.add("CloudCustomData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetRoamMsgResponseAllOfMsgList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetRoamMsgResponseAllOfMsgList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRoamMsgResponseAllOfMsgList is not found in the empty JSON string", GetRoamMsgResponseAllOfMsgList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetRoamMsgResponseAllOfMsgList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRoamMsgResponseAllOfMsgList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("MsgKey") != null && !jsonObj.get("MsgKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MsgKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MsgKey").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRoamMsgResponseAllOfMsgList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRoamMsgResponseAllOfMsgList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRoamMsgResponseAllOfMsgList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRoamMsgResponseAllOfMsgList.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRoamMsgResponseAllOfMsgList>() {
           @Override
           public void write(JsonWriter out, GetRoamMsgResponseAllOfMsgList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRoamMsgResponseAllOfMsgList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetRoamMsgResponseAllOfMsgList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRoamMsgResponseAllOfMsgList
  * @throws IOException if the JSON string is invalid with respect to GetRoamMsgResponseAllOfMsgList
  */
  public static GetRoamMsgResponseAllOfMsgList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRoamMsgResponseAllOfMsgList.class);
  }

 /**
  * Convert an instance of GetRoamMsgResponseAllOfMsgList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

