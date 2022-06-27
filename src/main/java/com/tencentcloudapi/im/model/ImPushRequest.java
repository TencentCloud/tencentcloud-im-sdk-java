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
import com.tencentcloudapi.im.model.ImPushRequestConditionInner;
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
 * ImPushRequest
 */

public class ImPushRequest {
  public static final String SERIALIZED_NAME_CONDITION = "Condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private List<ImPushRequestConditionInner> condition = null;

  public static final String SERIALIZED_NAME_MSG_RANDOM = "MsgRandom";
  @SerializedName(SERIALIZED_NAME_MSG_RANDOM)
  private Integer msgRandom;

  public static final String SERIALIZED_NAME_MSG_BODY = "MsgBody";
  @SerializedName(SERIALIZED_NAME_MSG_BODY)
  private List<TIMMsgElement> msgBody = new ArrayList<>();

  public static final String SERIALIZED_NAME_MSG_LIFE_TIME = "MsgLifeTime";
  @SerializedName(SERIALIZED_NAME_MSG_LIFE_TIME)
  private Integer msgLifeTime;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_OFFLINE_PUSH_INFO = "OfflinePushInfo";
  @SerializedName(SERIALIZED_NAME_OFFLINE_PUSH_INFO)
  private OfflinePushInfo offlinePushInfo;

  public ImPushRequest() { 
  }

  public ImPushRequest condition(List<ImPushRequestConditionInner> condition) {
    
    this.condition = condition;
    return this;
  }

  public ImPushRequest addConditionItem(ImPushRequestConditionInner conditionItem) {
    if (this.condition == null) {
      this.condition = new ArrayList<>();
    }
    this.condition.add(conditionItem);
    return this;
  }

   /**
   * Condition 共有4种条件类型，分别是：属性的或条件 AttrsOr、属性的与条件 AttrsAnd、标签的或条件 TagsOr、标签的与条件 TagsAnd。AttrsOr 和 AttrsAnd 可以并存，TagsOr 和 TagsAnd 也可以并存。但是标签和属性条件不能并存。如果没有 Condition，则推送给全部用户
   * @return condition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Condition 共有4种条件类型，分别是：属性的或条件 AttrsOr、属性的与条件 AttrsAnd、标签的或条件 TagsOr、标签的与条件 TagsAnd。AttrsOr 和 AttrsAnd 可以并存，TagsOr 和 TagsAnd 也可以并存。但是标签和属性条件不能并存。如果没有 Condition，则推送给全部用户")

  public List<ImPushRequestConditionInner> getCondition() {
    return condition;
  }


  public void setCondition(List<ImPushRequestConditionInner> condition) {
    this.condition = condition;
  }


  public ImPushRequest msgRandom(Integer msgRandom) {
    
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


  public ImPushRequest msgBody(List<TIMMsgElement> msgBody) {
    
    this.msgBody = msgBody;
    return this;
  }

  public ImPushRequest addMsgBodyItem(TIMMsgElement msgBodyItem) {
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


  public ImPushRequest msgLifeTime(Integer msgLifeTime) {
    
    this.msgLifeTime = msgLifeTime;
    return this;
  }

   /**
   * 消息离线存储时间，单位秒，最多保存7天（604800秒）。默认为0，表示不离线存储，即只推在线用户
   * maximum: 604800
   * @return msgLifeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息离线存储时间，单位秒，最多保存7天（604800秒）。默认为0，表示不离线存储，即只推在线用户")

  public Integer getMsgLifeTime() {
    return msgLifeTime;
  }


  public void setMsgLifeTime(Integer msgLifeTime) {
    this.msgLifeTime = msgLifeTime;
  }


  public ImPushRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 消息推送方帐号
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息推送方帐号")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public ImPushRequest offlinePushInfo(OfflinePushInfo offlinePushInfo) {
    
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
    ImPushRequest imPushRequest = (ImPushRequest) o;
    return Objects.equals(this.condition, imPushRequest.condition) &&
        Objects.equals(this.msgRandom, imPushRequest.msgRandom) &&
        Objects.equals(this.msgBody, imPushRequest.msgBody) &&
        Objects.equals(this.msgLifeTime, imPushRequest.msgLifeTime) &&
        Objects.equals(this.fromAccount, imPushRequest.fromAccount) &&
        Objects.equals(this.offlinePushInfo, imPushRequest.offlinePushInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, msgRandom, msgBody, msgLifeTime, fromAccount, offlinePushInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImPushRequest {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    msgRandom: ").append(toIndentedString(msgRandom)).append("\n");
    sb.append("    msgBody: ").append(toIndentedString(msgBody)).append("\n");
    sb.append("    msgLifeTime: ").append(toIndentedString(msgLifeTime)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
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
    openapiFields.add("Condition");
    openapiFields.add("MsgRandom");
    openapiFields.add("MsgBody");
    openapiFields.add("MsgLifeTime");
    openapiFields.add("From_Account");
    openapiFields.add("OfflinePushInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MsgRandom");
    openapiRequiredFields.add("MsgBody");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImPushRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImPushRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImPushRequest is not found in the empty JSON string", ImPushRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImPushRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImPushRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImPushRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArraycondition = jsonObj.getAsJsonArray("Condition");
      if (jsonArraycondition != null) {
        // ensure the json data is an array
        if (!jsonObj.get("Condition").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `Condition` to be an array in the JSON string but got `%s`", jsonObj.get("Condition").toString()));
        }

        // validate the optional field `Condition` (array)
        for (int i = 0; i < jsonArraycondition.size(); i++) {
          ImPushRequestConditionInner.validateJsonObject(jsonArraycondition.get(i).getAsJsonObject());
        };
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImPushRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImPushRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImPushRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImPushRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ImPushRequest>() {
           @Override
           public void write(JsonWriter out, ImPushRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImPushRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImPushRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImPushRequest
  * @throws IOException if the JSON string is invalid with respect to ImPushRequest
  */
  public static ImPushRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImPushRequest.class);
  }

 /**
  * Convert an instance of ImPushRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

