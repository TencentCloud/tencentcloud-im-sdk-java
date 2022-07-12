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
 * GetGroupShuttedUinResponseAllOfShuttedUinList
 */

public class GetGroupShuttedUinResponseAllOfShuttedUinList {
  public static final String SERIALIZED_NAME_MEMBER_ACCOUNT = "Member_Account";
  @SerializedName(SERIALIZED_NAME_MEMBER_ACCOUNT)
  private String memberAccount;

  public static final String SERIALIZED_NAME_SHUTTED_UNTIL = "ShuttedUntil";
  @SerializedName(SERIALIZED_NAME_SHUTTED_UNTIL)
  private Integer shuttedUntil;

  public GetGroupShuttedUinResponseAllOfShuttedUinList() { 
  }

  public GetGroupShuttedUinResponseAllOfShuttedUinList memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * 用户 ID
   * @return memberAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户 ID")

  public String getMemberAccount() {
    return memberAccount;
  }


  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  public GetGroupShuttedUinResponseAllOfShuttedUinList shuttedUntil(Integer shuttedUntil) {
    
    this.shuttedUntil = shuttedUntil;
    return this;
  }

   /**
   * 禁言到的时间（使用 UTC 时间，即世界协调时间）
   * @return shuttedUntil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "禁言到的时间（使用 UTC 时间，即世界协调时间）")

  public Integer getShuttedUntil() {
    return shuttedUntil;
  }


  public void setShuttedUntil(Integer shuttedUntil) {
    this.shuttedUntil = shuttedUntil;
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
  public GetGroupShuttedUinResponseAllOfShuttedUinList putAdditionalProperty(String key, Object value) {
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
    GetGroupShuttedUinResponseAllOfShuttedUinList getGroupShuttedUinResponseAllOfShuttedUinList = (GetGroupShuttedUinResponseAllOfShuttedUinList) o;
    return Objects.equals(this.memberAccount, getGroupShuttedUinResponseAllOfShuttedUinList.memberAccount) &&
        Objects.equals(this.shuttedUntil, getGroupShuttedUinResponseAllOfShuttedUinList.shuttedUntil)&&
        Objects.equals(this.additionalProperties, getGroupShuttedUinResponseAllOfShuttedUinList.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAccount, shuttedUntil, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupShuttedUinResponseAllOfShuttedUinList {\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    shuttedUntil: ").append(toIndentedString(shuttedUntil)).append("\n");
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
    openapiFields.add("Member_Account");
    openapiFields.add("ShuttedUntil");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetGroupShuttedUinResponseAllOfShuttedUinList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetGroupShuttedUinResponseAllOfShuttedUinList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupShuttedUinResponseAllOfShuttedUinList is not found in the empty JSON string", GetGroupShuttedUinResponseAllOfShuttedUinList.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("Member_Account") != null && !jsonObj.get("Member_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Member_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Member_Account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupShuttedUinResponseAllOfShuttedUinList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupShuttedUinResponseAllOfShuttedUinList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupShuttedUinResponseAllOfShuttedUinList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupShuttedUinResponseAllOfShuttedUinList.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupShuttedUinResponseAllOfShuttedUinList>() {
           @Override
           public void write(JsonWriter out, GetGroupShuttedUinResponseAllOfShuttedUinList value) throws IOException {
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
           public GetGroupShuttedUinResponseAllOfShuttedUinList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetGroupShuttedUinResponseAllOfShuttedUinList instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetGroupShuttedUinResponseAllOfShuttedUinList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGroupShuttedUinResponseAllOfShuttedUinList
  * @throws IOException if the JSON string is invalid with respect to GetGroupShuttedUinResponseAllOfShuttedUinList
  */
  public static GetGroupShuttedUinResponseAllOfShuttedUinList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupShuttedUinResponseAllOfShuttedUinList.class);
  }

 /**
  * Convert an instance of GetGroupShuttedUinResponseAllOfShuttedUinList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

