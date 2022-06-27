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
 * FriendGetRequest
 */

public class FriendGetRequest {
  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_START_INDEX = "StartIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Integer startIndex;

  public static final String SERIALIZED_NAME_STANDARD_SEQUENCE = "StandardSequence";
  @SerializedName(SERIALIZED_NAME_STANDARD_SEQUENCE)
  private Integer standardSequence;

  public static final String SERIALIZED_NAME_CUSTOM_SEQUENCE = "CustomSequence";
  @SerializedName(SERIALIZED_NAME_CUSTOM_SEQUENCE)
  private Integer customSequence;

  public FriendGetRequest() { 
  }

  public FriendGetRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 指定要拉取好友数据的用户的 UserID
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "指定要拉取好友数据的用户的 UserID")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public FriendGetRequest startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * 分页的起始位置
   * @return startIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "分页的起始位置")

  public Integer getStartIndex() {
    return startIndex;
  }


  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public FriendGetRequest standardSequence(Integer standardSequence) {
    
    this.standardSequence = standardSequence;
    return this;
  }

   /**
   * 上次拉好友数据时返回的 StandardSequence，如果 StandardSequence 字段的值与后台一致，后台不会返回标配好友数据
   * @return standardSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上次拉好友数据时返回的 StandardSequence，如果 StandardSequence 字段的值与后台一致，后台不会返回标配好友数据")

  public Integer getStandardSequence() {
    return standardSequence;
  }


  public void setStandardSequence(Integer standardSequence) {
    this.standardSequence = standardSequence;
  }


  public FriendGetRequest customSequence(Integer customSequence) {
    
    this.customSequence = customSequence;
    return this;
  }

   /**
   * 上次拉好友数据时返回的 CustomSequence，如果 CustomSequence 字段的值与后台一致，后台不会返回自定义好友数据
   * @return customSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上次拉好友数据时返回的 CustomSequence，如果 CustomSequence 字段的值与后台一致，后台不会返回自定义好友数据")

  public Integer getCustomSequence() {
    return customSequence;
  }


  public void setCustomSequence(Integer customSequence) {
    this.customSequence = customSequence;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendGetRequest friendGetRequest = (FriendGetRequest) o;
    return Objects.equals(this.fromAccount, friendGetRequest.fromAccount) &&
        Objects.equals(this.startIndex, friendGetRequest.startIndex) &&
        Objects.equals(this.standardSequence, friendGetRequest.standardSequence) &&
        Objects.equals(this.customSequence, friendGetRequest.customSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, startIndex, standardSequence, customSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendGetRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    standardSequence: ").append(toIndentedString(standardSequence)).append("\n");
    sb.append("    customSequence: ").append(toIndentedString(customSequence)).append("\n");
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
    openapiFields.add("StartIndex");
    openapiFields.add("StandardSequence");
    openapiFields.add("CustomSequence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("From_Account");
    openapiRequiredFields.add("StartIndex");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FriendGetRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FriendGetRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FriendGetRequest is not found in the empty JSON string", FriendGetRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FriendGetRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FriendGetRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FriendGetRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("From_Account") != null && !jsonObj.get("From_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From_Account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FriendGetRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FriendGetRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FriendGetRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FriendGetRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FriendGetRequest>() {
           @Override
           public void write(JsonWriter out, FriendGetRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FriendGetRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FriendGetRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FriendGetRequest
  * @throws IOException if the JSON string is invalid with respect to FriendGetRequest
  */
  public static FriendGetRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FriendGetRequest.class);
  }

 /**
  * Convert an instance of FriendGetRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

