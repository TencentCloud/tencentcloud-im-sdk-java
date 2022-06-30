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
import com.tencentcloudapi.im.model.GetGroupInfoRequestResponseFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * GetGroupInfoRequest
 */

public class GetGroupInfoRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GROUP_ID_LIST = "GroupIdList";
  @SerializedName(SERIALIZED_NAME_GROUP_ID_LIST)
  private List<String> groupIdList = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESPONSE_FILTER = "ResponseFilter";
  @SerializedName(SERIALIZED_NAME_RESPONSE_FILTER)
  private GetGroupInfoRequestResponseFilter responseFilter;

  public GetGroupInfoRequest() { 
  }

  public GetGroupInfoRequest groupIdList(List<String> groupIdList) {
    
    this.groupIdList = groupIdList;
    return this;
  }

  public GetGroupInfoRequest addGroupIdListItem(String groupIdListItem) {
    this.groupIdList.add(groupIdListItem);
    return this;
  }

   /**
   * 需要拉取的群组列表
   * @return groupIdList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "需要拉取的群组列表")

  public List<String> getGroupIdList() {
    return groupIdList;
  }


  public void setGroupIdList(List<String> groupIdList) {
    this.groupIdList = groupIdList;
  }


  public GetGroupInfoRequest responseFilter(GetGroupInfoRequestResponseFilter responseFilter) {
    
    this.responseFilter = responseFilter;
    return this;
  }

   /**
   * Get responseFilter
   * @return responseFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetGroupInfoRequestResponseFilter getResponseFilter() {
    return responseFilter;
  }


  public void setResponseFilter(GetGroupInfoRequestResponseFilter responseFilter) {
    this.responseFilter = responseFilter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupInfoRequest getGroupInfoRequest = (GetGroupInfoRequest) o;
    return Objects.equals(this.groupIdList, getGroupInfoRequest.groupIdList) &&
        Objects.equals(this.responseFilter, getGroupInfoRequest.responseFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupIdList, responseFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupInfoRequest {\n");
    sb.append("    groupIdList: ").append(toIndentedString(groupIdList)).append("\n");
    sb.append("    responseFilter: ").append(toIndentedString(responseFilter)).append("\n");
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
    openapiFields.add("GroupIdList");
    openapiFields.add("ResponseFilter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GroupIdList");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetGroupInfoRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetGroupInfoRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupInfoRequest is not found in the empty JSON string", GetGroupInfoRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetGroupInfoRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGroupInfoRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetGroupInfoRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("GroupIdList") != null && !jsonObj.get("GroupIdList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupIdList` to be an array in the JSON string but got `%s`", jsonObj.get("GroupIdList").toString()));
      }
      // validate the optional field `ResponseFilter`
      if (jsonObj.getAsJsonObject("ResponseFilter") != null) {
        GetGroupInfoRequestResponseFilter.validateJsonObject(jsonObj.getAsJsonObject("ResponseFilter"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupInfoRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupInfoRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupInfoRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupInfoRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupInfoRequest>() {
           @Override
           public void write(JsonWriter out, GetGroupInfoRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGroupInfoRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGroupInfoRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGroupInfoRequest
  * @throws IOException if the JSON string is invalid with respect to GetGroupInfoRequest
  */
  public static GetGroupInfoRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupInfoRequest.class);
  }

 /**
  * Convert an instance of GetGroupInfoRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

