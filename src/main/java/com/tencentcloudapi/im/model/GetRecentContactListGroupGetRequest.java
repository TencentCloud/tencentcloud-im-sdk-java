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
 * GetRecentContactListGroupGetRequest
 */

public class GetRecentContactListGroupGetRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_TIME_STAMP = "TimeStamp";
  @SerializedName(SERIALIZED_NAME_TIME_STAMP)
  private Integer timeStamp;

  public static final String SERIALIZED_NAME_START_INDEX = "StartIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Integer startIndex;

  public static final String SERIALIZED_NAME_TOP_TIME_STAMP = "TopTimeStamp";
  @SerializedName(SERIALIZED_NAME_TOP_TIME_STAMP)
  private Integer topTimeStamp;

  public static final String SERIALIZED_NAME_TOP_START_INDEX = "TopStartIndex";
  @SerializedName(SERIALIZED_NAME_TOP_START_INDEX)
  private Integer topStartIndex;

  public static final String SERIALIZED_NAME_ASSIST_FLAGS = "AssistFlags";
  @SerializedName(SERIALIZED_NAME_ASSIST_FLAGS)
  private Integer assistFlags;

  public GetRecentContactListGroupGetRequest() { 
  }

  public GetRecentContactListGroupGetRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 填 UserID，请求拉取该用户的会话列表
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "填 UserID，请求拉取该用户的会话列表")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public GetRecentContactListGroupGetRequest timeStamp(Integer timeStamp) {
    
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * 普通会话的起始时间，第一页填 0
   * @return timeStamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "普通会话的起始时间，第一页填 0")

  public Integer getTimeStamp() {
    return timeStamp;
  }


  public void setTimeStamp(Integer timeStamp) {
    this.timeStamp = timeStamp;
  }


  public GetRecentContactListGroupGetRequest startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * 普通会话的起始位置，第一页填 0
   * @return startIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "普通会话的起始位置，第一页填 0")

  public Integer getStartIndex() {
    return startIndex;
  }


  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public GetRecentContactListGroupGetRequest topTimeStamp(Integer topTimeStamp) {
    
    this.topTimeStamp = topTimeStamp;
    return this;
  }

   /**
   * 置顶会话的起始时间，第一页填 0
   * @return topTimeStamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "置顶会话的起始时间，第一页填 0")

  public Integer getTopTimeStamp() {
    return topTimeStamp;
  }


  public void setTopTimeStamp(Integer topTimeStamp) {
    this.topTimeStamp = topTimeStamp;
  }


  public GetRecentContactListGroupGetRequest topStartIndex(Integer topStartIndex) {
    
    this.topStartIndex = topStartIndex;
    return this;
  }

   /**
   * 置顶会话的起始位置，第一页填 0
   * @return topStartIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "置顶会话的起始位置，第一页填 0")

  public Integer getTopStartIndex() {
    return topStartIndex;
  }


  public void setTopStartIndex(Integer topStartIndex) {
    this.topStartIndex = topStartIndex;
  }


  public GetRecentContactListGroupGetRequest assistFlags(Integer assistFlags) {
    
    this.assistFlags = assistFlags;
    return this;
  }

   /**
   * 会话辅助标志位： bit 0 - 是否支持置顶会话 bit 1 - 是否返回空会话 bit 2 - 是否支持置顶会话分页
   * @return assistFlags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "会话辅助标志位： bit 0 - 是否支持置顶会话 bit 1 - 是否返回空会话 bit 2 - 是否支持置顶会话分页")

  public Integer getAssistFlags() {
    return assistFlags;
  }


  public void setAssistFlags(Integer assistFlags) {
    this.assistFlags = assistFlags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecentContactListGroupGetRequest getRecentContactListGroupGetRequest = (GetRecentContactListGroupGetRequest) o;
    return Objects.equals(this.fromAccount, getRecentContactListGroupGetRequest.fromAccount) &&
        Objects.equals(this.timeStamp, getRecentContactListGroupGetRequest.timeStamp) &&
        Objects.equals(this.startIndex, getRecentContactListGroupGetRequest.startIndex) &&
        Objects.equals(this.topTimeStamp, getRecentContactListGroupGetRequest.topTimeStamp) &&
        Objects.equals(this.topStartIndex, getRecentContactListGroupGetRequest.topStartIndex) &&
        Objects.equals(this.assistFlags, getRecentContactListGroupGetRequest.assistFlags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, timeStamp, startIndex, topTimeStamp, topStartIndex, assistFlags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecentContactListGroupGetRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    topTimeStamp: ").append(toIndentedString(topTimeStamp)).append("\n");
    sb.append("    topStartIndex: ").append(toIndentedString(topStartIndex)).append("\n");
    sb.append("    assistFlags: ").append(toIndentedString(assistFlags)).append("\n");
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
    openapiFields.add("TimeStamp");
    openapiFields.add("StartIndex");
    openapiFields.add("TopTimeStamp");
    openapiFields.add("TopStartIndex");
    openapiFields.add("AssistFlags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("From_Account");
    openapiRequiredFields.add("TimeStamp");
    openapiRequiredFields.add("StartIndex");
    openapiRequiredFields.add("TopTimeStamp");
    openapiRequiredFields.add("TopStartIndex");
    openapiRequiredFields.add("AssistFlags");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetRecentContactListGroupGetRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetRecentContactListGroupGetRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRecentContactListGroupGetRequest is not found in the empty JSON string", GetRecentContactListGroupGetRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetRecentContactListGroupGetRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRecentContactListGroupGetRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetRecentContactListGroupGetRequest.openapiRequiredFields) {
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
       if (!GetRecentContactListGroupGetRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRecentContactListGroupGetRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRecentContactListGroupGetRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRecentContactListGroupGetRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRecentContactListGroupGetRequest>() {
           @Override
           public void write(JsonWriter out, GetRecentContactListGroupGetRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRecentContactListGroupGetRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetRecentContactListGroupGetRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRecentContactListGroupGetRequest
  * @throws IOException if the JSON string is invalid with respect to GetRecentContactListGroupGetRequest
  */
  public static GetRecentContactListGroupGetRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRecentContactListGroupGetRequest.class);
  }

 /**
  * Convert an instance of GetRecentContactListGroupGetRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

