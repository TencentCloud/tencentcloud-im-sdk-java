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
 * BlackListGetRequest
 */

public class BlackListGetRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_START_INDEX = "StartIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Integer startIndex;

  public static final String SERIALIZED_NAME_MAX_LIMITED = "MaxLimited";
  @SerializedName(SERIALIZED_NAME_MAX_LIMITED)
  private Integer maxLimited;

  public static final String SERIALIZED_NAME_LAST_SEQUENCE = "LastSequence";
  @SerializedName(SERIALIZED_NAME_LAST_SEQUENCE)
  private Integer lastSequence;

  public BlackListGetRequest() { 
  }

  public BlackListGetRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 需要拉取该 UserID 的黑名单
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "需要拉取该 UserID 的黑名单")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public BlackListGetRequest startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * 拉取的起始位置
   * @return startIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "拉取的起始位置")

  public Integer getStartIndex() {
    return startIndex;
  }


  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public BlackListGetRequest maxLimited(Integer maxLimited) {
    
    this.maxLimited = maxLimited;
    return this;
  }

   /**
   * 每页最多拉取的黑名单数
   * @return maxLimited
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "每页最多拉取的黑名单数")

  public Integer getMaxLimited() {
    return maxLimited;
  }


  public void setMaxLimited(Integer maxLimited) {
    this.maxLimited = maxLimited;
  }


  public BlackListGetRequest lastSequence(Integer lastSequence) {
    
    this.lastSequence = lastSequence;
    return this;
  }

   /**
   * 上一次拉黑名单时后台返回给客户端的 Seq，初次拉取时为0
   * @return lastSequence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "上一次拉黑名单时后台返回给客户端的 Seq，初次拉取时为0")

  public Integer getLastSequence() {
    return lastSequence;
  }


  public void setLastSequence(Integer lastSequence) {
    this.lastSequence = lastSequence;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlackListGetRequest blackListGetRequest = (BlackListGetRequest) o;
    return Objects.equals(this.fromAccount, blackListGetRequest.fromAccount) &&
        Objects.equals(this.startIndex, blackListGetRequest.startIndex) &&
        Objects.equals(this.maxLimited, blackListGetRequest.maxLimited) &&
        Objects.equals(this.lastSequence, blackListGetRequest.lastSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, startIndex, maxLimited, lastSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlackListGetRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    maxLimited: ").append(toIndentedString(maxLimited)).append("\n");
    sb.append("    lastSequence: ").append(toIndentedString(lastSequence)).append("\n");
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
    openapiFields.add("MaxLimited");
    openapiFields.add("LastSequence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("From_Account");
    openapiRequiredFields.add("StartIndex");
    openapiRequiredFields.add("MaxLimited");
    openapiRequiredFields.add("LastSequence");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BlackListGetRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BlackListGetRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlackListGetRequest is not found in the empty JSON string", BlackListGetRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BlackListGetRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlackListGetRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BlackListGetRequest.openapiRequiredFields) {
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
       if (!BlackListGetRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlackListGetRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlackListGetRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlackListGetRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BlackListGetRequest>() {
           @Override
           public void write(JsonWriter out, BlackListGetRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlackListGetRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlackListGetRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlackListGetRequest
  * @throws IOException if the JSON string is invalid with respect to BlackListGetRequest
  */
  public static BlackListGetRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlackListGetRequest.class);
  }

 /**
  * Convert an instance of BlackListGetRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

