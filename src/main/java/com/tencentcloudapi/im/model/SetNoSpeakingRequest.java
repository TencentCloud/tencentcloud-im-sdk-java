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
 * SetNoSpeakingRequest
 */

public class SetNoSpeakingRequest {
  public static final String SERIALIZED_NAME_SET_ACCOUNT = "Set_Account";
  @SerializedName(SERIALIZED_NAME_SET_ACCOUNT)
  private String setAccount;

  public static final String SERIALIZED_NAME_C2_CMSG_NOSPEAKING_TIME = "C2CmsgNospeakingTime";
  @SerializedName(SERIALIZED_NAME_C2_CMSG_NOSPEAKING_TIME)
  private Integer c2CmsgNospeakingTime;

  public static final String SERIALIZED_NAME_GROUPMSG_NOSPEAKING_TIME = "GroupmsgNospeakingTime";
  @SerializedName(SERIALIZED_NAME_GROUPMSG_NOSPEAKING_TIME)
  private Integer groupmsgNospeakingTime;

  public SetNoSpeakingRequest() { 
  }

  public SetNoSpeakingRequest setAccount(String setAccount) {
    
    this.setAccount = setAccount;
    return this;
  }

   /**
   * 设置禁言配置的帐号
   * @return setAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "设置禁言配置的帐号")

  public String getSetAccount() {
    return setAccount;
  }


  public void setSetAccount(String setAccount) {
    this.setAccount = setAccount;
  }


  public SetNoSpeakingRequest c2CmsgNospeakingTime(Integer c2CmsgNospeakingTime) {
    
    this.c2CmsgNospeakingTime = c2CmsgNospeakingTime;
    return this;
  }

   /**
   * 单聊消息禁言时间，单位为秒，非负整数，最大值为4294967295（十六进制 0xFFFFFFFF） 0表示取消该帐号的单聊消息禁言 4294967295表示该帐号被设置永久禁言 其它值表示该帐号具体的禁言时间
   * @return c2CmsgNospeakingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单聊消息禁言时间，单位为秒，非负整数，最大值为4294967295（十六进制 0xFFFFFFFF） 0表示取消该帐号的单聊消息禁言 4294967295表示该帐号被设置永久禁言 其它值表示该帐号具体的禁言时间")

  public Integer getC2CmsgNospeakingTime() {
    return c2CmsgNospeakingTime;
  }


  public void setC2CmsgNospeakingTime(Integer c2CmsgNospeakingTime) {
    this.c2CmsgNospeakingTime = c2CmsgNospeakingTime;
  }


  public SetNoSpeakingRequest groupmsgNospeakingTime(Integer groupmsgNospeakingTime) {
    
    this.groupmsgNospeakingTime = groupmsgNospeakingTime;
    return this;
  }

   /**
   * 群组消息禁言时间，单位为秒，非负整数，最大值为4294967295（十六进制 0xFFFFFFFF） 0表示取消该帐号的群组消息禁言  4294967295表示该帐号被设置永久禁言 其它值表示该帐号的具体禁言时间
   * @return groupmsgNospeakingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群组消息禁言时间，单位为秒，非负整数，最大值为4294967295（十六进制 0xFFFFFFFF） 0表示取消该帐号的群组消息禁言  4294967295表示该帐号被设置永久禁言 其它值表示该帐号的具体禁言时间")

  public Integer getGroupmsgNospeakingTime() {
    return groupmsgNospeakingTime;
  }


  public void setGroupmsgNospeakingTime(Integer groupmsgNospeakingTime) {
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
  public SetNoSpeakingRequest putAdditionalProperty(String key, Object value) {
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
    SetNoSpeakingRequest setNoSpeakingRequest = (SetNoSpeakingRequest) o;
    return Objects.equals(this.setAccount, setNoSpeakingRequest.setAccount) &&
        Objects.equals(this.c2CmsgNospeakingTime, setNoSpeakingRequest.c2CmsgNospeakingTime) &&
        Objects.equals(this.groupmsgNospeakingTime, setNoSpeakingRequest.groupmsgNospeakingTime)&&
        Objects.equals(this.additionalProperties, setNoSpeakingRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(setAccount, c2CmsgNospeakingTime, groupmsgNospeakingTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetNoSpeakingRequest {\n");
    sb.append("    setAccount: ").append(toIndentedString(setAccount)).append("\n");
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
    openapiFields.add("Set_Account");
    openapiFields.add("C2CmsgNospeakingTime");
    openapiFields.add("GroupmsgNospeakingTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Set_Account");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SetNoSpeakingRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SetNoSpeakingRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetNoSpeakingRequest is not found in the empty JSON string", SetNoSpeakingRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SetNoSpeakingRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Set_Account") != null && !jsonObj.get("Set_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Set_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Set_Account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetNoSpeakingRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetNoSpeakingRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetNoSpeakingRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetNoSpeakingRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SetNoSpeakingRequest>() {
           @Override
           public void write(JsonWriter out, SetNoSpeakingRequest value) throws IOException {
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
           public SetNoSpeakingRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SetNoSpeakingRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SetNoSpeakingRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetNoSpeakingRequest
  * @throws IOException if the JSON string is invalid with respect to SetNoSpeakingRequest
  */
  public static SetNoSpeakingRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetNoSpeakingRequest.class);
  }

 /**
  * Convert an instance of SetNoSpeakingRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

