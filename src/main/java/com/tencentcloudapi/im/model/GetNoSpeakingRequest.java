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
 * GetNoSpeakingRequest
 */

public class GetNoSpeakingRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GET_ACCOUNT = "Get_Account";
  @SerializedName(SERIALIZED_NAME_GET_ACCOUNT)
  private String getAccount;

  public GetNoSpeakingRequest() { 
  }

  public GetNoSpeakingRequest getAccount(String getAccount) {
    
    this.getAccount = getAccount;
    return this;
  }

   /**
   * 查询禁言信息的帐号
   * @return getAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "查询禁言信息的帐号")

  public String getGetAccount() {
    return getAccount;
  }


  public void setGetAccount(String getAccount) {
    this.getAccount = getAccount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetNoSpeakingRequest getNoSpeakingRequest = (GetNoSpeakingRequest) o;
    return Objects.equals(this.getAccount, getNoSpeakingRequest.getAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNoSpeakingRequest {\n");
    sb.append("    getAccount: ").append(toIndentedString(getAccount)).append("\n");
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
    openapiFields.add("Get_Account");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Get_Account");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetNoSpeakingRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetNoSpeakingRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetNoSpeakingRequest is not found in the empty JSON string", GetNoSpeakingRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetNoSpeakingRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetNoSpeakingRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetNoSpeakingRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Get_Account") != null && !jsonObj.get("Get_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Get_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Get_Account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetNoSpeakingRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetNoSpeakingRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetNoSpeakingRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetNoSpeakingRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetNoSpeakingRequest>() {
           @Override
           public void write(JsonWriter out, GetNoSpeakingRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetNoSpeakingRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetNoSpeakingRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetNoSpeakingRequest
  * @throws IOException if the JSON string is invalid with respect to GetNoSpeakingRequest
  */
  public static GetNoSpeakingRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetNoSpeakingRequest.class);
  }

 /**
  * Convert an instance of GetNoSpeakingRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

