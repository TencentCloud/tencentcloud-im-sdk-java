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
import java.math.BigDecimal;

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
 * GetNoSpeakingResponseAllOf
 */

public class GetNoSpeakingResponseAllOf {
  public static final String SERIALIZED_NAME_C2_CMSG_NOSPEAKING_TIME = "C2CmsgNospeakingTime";
  @SerializedName(SERIALIZED_NAME_C2_CMSG_NOSPEAKING_TIME)
  private BigDecimal c2CmsgNospeakingTime;

  public static final String SERIALIZED_NAME_GROUPMSG_NOSPEAKING_TIME = "GroupmsgNospeakingTime";
  @SerializedName(SERIALIZED_NAME_GROUPMSG_NOSPEAKING_TIME)
  private BigDecimal groupmsgNospeakingTime;

  public GetNoSpeakingResponseAllOf() { 
  }

  public GetNoSpeakingResponseAllOf c2CmsgNospeakingTime(BigDecimal c2CmsgNospeakingTime) {
    
    this.c2CmsgNospeakingTime = c2CmsgNospeakingTime;
    return this;
  }

   /**
   * 单聊消息禁言时长，单位为秒，非负整数。等于 0 代表没有被设置禁言；等于最大值4294967295（十六进制 0xFFFFFFFF）代表被设置永久禁言；其它代表该帐号禁言时长，如果等于3600表示该帐号被禁言一小时
   * @return c2CmsgNospeakingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单聊消息禁言时长，单位为秒，非负整数。等于 0 代表没有被设置禁言；等于最大值4294967295（十六进制 0xFFFFFFFF）代表被设置永久禁言；其它代表该帐号禁言时长，如果等于3600表示该帐号被禁言一小时")

  public BigDecimal getC2CmsgNospeakingTime() {
    return c2CmsgNospeakingTime;
  }


  public void setC2CmsgNospeakingTime(BigDecimal c2CmsgNospeakingTime) {
    this.c2CmsgNospeakingTime = c2CmsgNospeakingTime;
  }


  public GetNoSpeakingResponseAllOf groupmsgNospeakingTime(BigDecimal groupmsgNospeakingTime) {
    
    this.groupmsgNospeakingTime = groupmsgNospeakingTime;
    return this;
  }

   /**
   * 群组消息禁言时长，单位为秒，非负整数。等于0代表没有被设置禁言；等于最大值4294967295（十六进制 0xFFFFFFFF）代表被设置永久禁言；其它代表该帐号禁言时长，如果等于3600表示该帐号被禁言一小时
   * @return groupmsgNospeakingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群组消息禁言时长，单位为秒，非负整数。等于0代表没有被设置禁言；等于最大值4294967295（十六进制 0xFFFFFFFF）代表被设置永久禁言；其它代表该帐号禁言时长，如果等于3600表示该帐号被禁言一小时")

  public BigDecimal getGroupmsgNospeakingTime() {
    return groupmsgNospeakingTime;
  }


  public void setGroupmsgNospeakingTime(BigDecimal groupmsgNospeakingTime) {
    this.groupmsgNospeakingTime = groupmsgNospeakingTime;
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
  public GetNoSpeakingResponseAllOf putAdditionalProperty(String key, Object value) {
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
    GetNoSpeakingResponseAllOf getNoSpeakingResponseAllOf = (GetNoSpeakingResponseAllOf) o;
    return Objects.equals(this.c2CmsgNospeakingTime, getNoSpeakingResponseAllOf.c2CmsgNospeakingTime) &&
        Objects.equals(this.groupmsgNospeakingTime, getNoSpeakingResponseAllOf.groupmsgNospeakingTime)&&
        Objects.equals(this.additionalProperties, getNoSpeakingResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c2CmsgNospeakingTime, groupmsgNospeakingTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNoSpeakingResponseAllOf {\n");
    sb.append("    c2CmsgNospeakingTime: ").append(toIndentedString(c2CmsgNospeakingTime)).append("\n");
    sb.append("    groupmsgNospeakingTime: ").append(toIndentedString(groupmsgNospeakingTime)).append("\n");
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
    openapiFields.add("C2CmsgNospeakingTime");
    openapiFields.add("GroupmsgNospeakingTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetNoSpeakingResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetNoSpeakingResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetNoSpeakingResponseAllOf is not found in the empty JSON string", GetNoSpeakingResponseAllOf.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetNoSpeakingResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetNoSpeakingResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetNoSpeakingResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetNoSpeakingResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetNoSpeakingResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GetNoSpeakingResponseAllOf value) throws IOException {
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
           public GetNoSpeakingResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetNoSpeakingResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetNoSpeakingResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetNoSpeakingResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GetNoSpeakingResponseAllOf
  */
  public static GetNoSpeakingResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetNoSpeakingResponseAllOf.class);
  }

 /**
  * Convert an instance of GetNoSpeakingResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

