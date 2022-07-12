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
 * GetRoamMsgRequest
 */

public class GetRoamMsgRequest {
  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_MAX_CNT = "MaxCnt";
  @SerializedName(SERIALIZED_NAME_MAX_CNT)
  private Integer maxCnt;

  public static final String SERIALIZED_NAME_MIN_TIME = "MinTime";
  @SerializedName(SERIALIZED_NAME_MIN_TIME)
  private Integer minTime;

  public static final String SERIALIZED_NAME_MAX_TIME = "MaxTime";
  @SerializedName(SERIALIZED_NAME_MAX_TIME)
  private Integer maxTime;

  public static final String SERIALIZED_NAME_LAST_MSG_KEY = "LastMsgKey";
  @SerializedName(SERIALIZED_NAME_LAST_MSG_KEY)
  private String lastMsgKey;

  public GetRoamMsgRequest() { 
  }

  public GetRoamMsgRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 会话其中一方的 UserID，若已指定发送消息方帐号，则为消息发送方
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "会话其中一方的 UserID，若已指定发送消息方帐号，则为消息发送方")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public GetRoamMsgRequest toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 会话其中一方的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "会话其中一方的 UserID")

  public String getToAccount() {
    return toAccount;
  }


  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public GetRoamMsgRequest maxCnt(Integer maxCnt) {
    
    this.maxCnt = maxCnt;
    return this;
  }

   /**
   * 请求的消息条数
   * @return maxCnt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "请求的消息条数")

  public Integer getMaxCnt() {
    return maxCnt;
  }


  public void setMaxCnt(Integer maxCnt) {
    this.maxCnt = maxCnt;
  }


  public GetRoamMsgRequest minTime(Integer minTime) {
    
    this.minTime = minTime;
    return this;
  }

   /**
   * 请求的消息时间范围的最小值
   * @return minTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "请求的消息时间范围的最小值")

  public Integer getMinTime() {
    return minTime;
  }


  public void setMinTime(Integer minTime) {
    this.minTime = minTime;
  }


  public GetRoamMsgRequest maxTime(Integer maxTime) {
    
    this.maxTime = maxTime;
    return this;
  }

   /**
   * 请求的消息时间范围的最大值
   * @return maxTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "请求的消息时间范围的最大值")

  public Integer getMaxTime() {
    return maxTime;
  }


  public void setMaxTime(Integer maxTime) {
    this.maxTime = maxTime;
  }


  public GetRoamMsgRequest lastMsgKey(String lastMsgKey) {
    
    this.lastMsgKey = lastMsgKey;
    return this;
  }

   /**
   * 上一次拉取到的最后一条消息的 MsgKey，续拉时需要填该字段,填写方法见示例（https://cloud.tencent.com/document/product/269/42794）
   * @return lastMsgKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上一次拉取到的最后一条消息的 MsgKey，续拉时需要填该字段,填写方法见示例（https://cloud.tencent.com/document/product/269/42794）")

  public String getLastMsgKey() {
    return lastMsgKey;
  }


  public void setLastMsgKey(String lastMsgKey) {
    this.lastMsgKey = lastMsgKey;
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
  public GetRoamMsgRequest putAdditionalProperty(String key, Object value) {
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
    GetRoamMsgRequest getRoamMsgRequest = (GetRoamMsgRequest) o;
    return Objects.equals(this.fromAccount, getRoamMsgRequest.fromAccount) &&
        Objects.equals(this.toAccount, getRoamMsgRequest.toAccount) &&
        Objects.equals(this.maxCnt, getRoamMsgRequest.maxCnt) &&
        Objects.equals(this.minTime, getRoamMsgRequest.minTime) &&
        Objects.equals(this.maxTime, getRoamMsgRequest.maxTime) &&
        Objects.equals(this.lastMsgKey, getRoamMsgRequest.lastMsgKey)&&
        Objects.equals(this.additionalProperties, getRoamMsgRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, toAccount, maxCnt, minTime, maxTime, lastMsgKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoamMsgRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    maxCnt: ").append(toIndentedString(maxCnt)).append("\n");
    sb.append("    minTime: ").append(toIndentedString(minTime)).append("\n");
    sb.append("    maxTime: ").append(toIndentedString(maxTime)).append("\n");
    sb.append("    lastMsgKey: ").append(toIndentedString(lastMsgKey)).append("\n");
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
    openapiFields.add("To_Account");
    openapiFields.add("MaxCnt");
    openapiFields.add("MinTime");
    openapiFields.add("MaxTime");
    openapiFields.add("LastMsgKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("From_Account");
    openapiRequiredFields.add("To_Account");
    openapiRequiredFields.add("MaxCnt");
    openapiRequiredFields.add("MinTime");
    openapiRequiredFields.add("MaxTime");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetRoamMsgRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetRoamMsgRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRoamMsgRequest is not found in the empty JSON string", GetRoamMsgRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetRoamMsgRequest.openapiRequiredFields) {
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
      if (jsonObj.get("LastMsgKey") != null && !jsonObj.get("LastMsgKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LastMsgKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LastMsgKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRoamMsgRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRoamMsgRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRoamMsgRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRoamMsgRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRoamMsgRequest>() {
           @Override
           public void write(JsonWriter out, GetRoamMsgRequest value) throws IOException {
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
           public GetRoamMsgRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetRoamMsgRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetRoamMsgRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRoamMsgRequest
  * @throws IOException if the JSON string is invalid with respect to GetRoamMsgRequest
  */
  public static GetRoamMsgRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRoamMsgRequest.class);
  }

 /**
  * Convert an instance of GetRoamMsgRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

