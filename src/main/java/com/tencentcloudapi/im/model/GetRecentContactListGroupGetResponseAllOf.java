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
import com.tencentcloudapi.im.model.GetRecentContactListGroupGetResponseAllOfSessionItem;
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
 * GetRecentContactListGroupGetResponseAllOf
 */

public class GetRecentContactListGroupGetResponseAllOf {
  public static final String SERIALIZED_NAME_SESSION_ITEM = "SessionItem";
  @SerializedName(SERIALIZED_NAME_SESSION_ITEM)
  private List<GetRecentContactListGroupGetResponseAllOfSessionItem> sessionItem = null;

  public static final String SERIALIZED_NAME_COMPLETE_FLAG = "CompleteFlag";
  @SerializedName(SERIALIZED_NAME_COMPLETE_FLAG)
  private Integer completeFlag;

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

  public static final String SERIALIZED_NAME_ERROR_DISPLAY = "ErrorDisplay";
  @SerializedName(SERIALIZED_NAME_ERROR_DISPLAY)
  private String errorDisplay;

  public GetRecentContactListGroupGetResponseAllOf() { 
  }

  public GetRecentContactListGroupGetResponseAllOf sessionItem(List<GetRecentContactListGroupGetResponseAllOfSessionItem> sessionItem) {
    
    this.sessionItem = sessionItem;
    return this;
  }

  public GetRecentContactListGroupGetResponseAllOf addSessionItemItem(GetRecentContactListGroupGetResponseAllOfSessionItem sessionItemItem) {
    if (this.sessionItem == null) {
      this.sessionItem = new ArrayList<>();
    }
    this.sessionItem.add(sessionItemItem);
    return this;
  }

   /**
   * 会话对象数组
   * @return sessionItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会话对象数组")

  public List<GetRecentContactListGroupGetResponseAllOfSessionItem> getSessionItem() {
    return sessionItem;
  }


  public void setSessionItem(List<GetRecentContactListGroupGetResponseAllOfSessionItem> sessionItem) {
    this.sessionItem = sessionItem;
  }


  public GetRecentContactListGroupGetResponseAllOf completeFlag(Integer completeFlag) {
    
    this.completeFlag = completeFlag;
    return this;
  }

   /**
   * 结束标识：1 表示已返回全量会话，0 表示还有会话没拉完
   * @return completeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结束标识：1 表示已返回全量会话，0 表示还有会话没拉完")

  public Integer getCompleteFlag() {
    return completeFlag;
  }


  public void setCompleteFlag(Integer completeFlag) {
    this.completeFlag = completeFlag;
  }


  public GetRecentContactListGroupGetResponseAllOf timeStamp(Integer timeStamp) {
    
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * 普通会话下一页拉取的起始时间，分页拉取时通过请求包的 TimeStamp 字段带给移动通信后台
   * @return timeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "普通会话下一页拉取的起始时间，分页拉取时通过请求包的 TimeStamp 字段带给移动通信后台")

  public Integer getTimeStamp() {
    return timeStamp;
  }


  public void setTimeStamp(Integer timeStamp) {
    this.timeStamp = timeStamp;
  }


  public GetRecentContactListGroupGetResponseAllOf startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * 普通会话下一页拉取的起始位置，分页拉取时通过请求包的 StartIndex 字段带给移动通信后台
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "普通会话下一页拉取的起始位置，分页拉取时通过请求包的 StartIndex 字段带给移动通信后台")

  public Integer getStartIndex() {
    return startIndex;
  }


  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public GetRecentContactListGroupGetResponseAllOf topTimeStamp(Integer topTimeStamp) {
    
    this.topTimeStamp = topTimeStamp;
    return this;
  }

   /**
   * 置顶会话下一页拉取的起始时间，分页拉取时通过请求包的 TopTimeStamp 字段带给移动通信后台
   * @return topTimeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "置顶会话下一页拉取的起始时间，分页拉取时通过请求包的 TopTimeStamp 字段带给移动通信后台")

  public Integer getTopTimeStamp() {
    return topTimeStamp;
  }


  public void setTopTimeStamp(Integer topTimeStamp) {
    this.topTimeStamp = topTimeStamp;
  }


  public GetRecentContactListGroupGetResponseAllOf topStartIndex(Integer topStartIndex) {
    
    this.topStartIndex = topStartIndex;
    return this;
  }

   /**
   * 置顶会话下一页拉取的起始位置，分页拉取时通过请求包的 TopStartIndex 字段带给移动通信后台
   * @return topStartIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "置顶会话下一页拉取的起始位置，分页拉取时通过请求包的 TopStartIndex 字段带给移动通信后台")

  public Integer getTopStartIndex() {
    return topStartIndex;
  }


  public void setTopStartIndex(Integer topStartIndex) {
    this.topStartIndex = topStartIndex;
  }


  public GetRecentContactListGroupGetResponseAllOf errorDisplay(String errorDisplay) {
    
    this.errorDisplay = errorDisplay;
    return this;
  }

   /**
   * 详细的客户端展示信息
   * @return errorDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "详细的客户端展示信息")

  public String getErrorDisplay() {
    return errorDisplay;
  }


  public void setErrorDisplay(String errorDisplay) {
    this.errorDisplay = errorDisplay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecentContactListGroupGetResponseAllOf getRecentContactListGroupGetResponseAllOf = (GetRecentContactListGroupGetResponseAllOf) o;
    return Objects.equals(this.sessionItem, getRecentContactListGroupGetResponseAllOf.sessionItem) &&
        Objects.equals(this.completeFlag, getRecentContactListGroupGetResponseAllOf.completeFlag) &&
        Objects.equals(this.timeStamp, getRecentContactListGroupGetResponseAllOf.timeStamp) &&
        Objects.equals(this.startIndex, getRecentContactListGroupGetResponseAllOf.startIndex) &&
        Objects.equals(this.topTimeStamp, getRecentContactListGroupGetResponseAllOf.topTimeStamp) &&
        Objects.equals(this.topStartIndex, getRecentContactListGroupGetResponseAllOf.topStartIndex) &&
        Objects.equals(this.errorDisplay, getRecentContactListGroupGetResponseAllOf.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionItem, completeFlag, timeStamp, startIndex, topTimeStamp, topStartIndex, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecentContactListGroupGetResponseAllOf {\n");
    sb.append("    sessionItem: ").append(toIndentedString(sessionItem)).append("\n");
    sb.append("    completeFlag: ").append(toIndentedString(completeFlag)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    topTimeStamp: ").append(toIndentedString(topTimeStamp)).append("\n");
    sb.append("    topStartIndex: ").append(toIndentedString(topStartIndex)).append("\n");
    sb.append("    errorDisplay: ").append(toIndentedString(errorDisplay)).append("\n");
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
    openapiFields.add("SessionItem");
    openapiFields.add("CompleteFlag");
    openapiFields.add("TimeStamp");
    openapiFields.add("StartIndex");
    openapiFields.add("TopTimeStamp");
    openapiFields.add("TopStartIndex");
    openapiFields.add("ErrorDisplay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetRecentContactListGroupGetResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetRecentContactListGroupGetResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRecentContactListGroupGetResponseAllOf is not found in the empty JSON string", GetRecentContactListGroupGetResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetRecentContactListGroupGetResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRecentContactListGroupGetResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraysessionItem = jsonObj.getAsJsonArray("SessionItem");
      if (jsonArraysessionItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("SessionItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `SessionItem` to be an array in the JSON string but got `%s`", jsonObj.get("SessionItem").toString()));
        }

        // validate the optional field `SessionItem` (array)
        for (int i = 0; i < jsonArraysessionItem.size(); i++) {
          GetRecentContactListGroupGetResponseAllOfSessionItem.validateJsonObject(jsonArraysessionItem.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("ErrorDisplay") != null && !jsonObj.get("ErrorDisplay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ErrorDisplay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ErrorDisplay").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRecentContactListGroupGetResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRecentContactListGroupGetResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRecentContactListGroupGetResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRecentContactListGroupGetResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRecentContactListGroupGetResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GetRecentContactListGroupGetResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRecentContactListGroupGetResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetRecentContactListGroupGetResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRecentContactListGroupGetResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GetRecentContactListGroupGetResponseAllOf
  */
  public static GetRecentContactListGroupGetResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRecentContactListGroupGetResponseAllOf.class);
  }

 /**
  * Convert an instance of GetRecentContactListGroupGetResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

