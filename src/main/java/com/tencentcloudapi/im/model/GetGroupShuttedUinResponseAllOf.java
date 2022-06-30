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
import com.tencentcloudapi.im.model.GetGroupShuttedUinResponseAllOfShuttedUinList;
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
 * GetGroupShuttedUinResponseAllOf
 */

public class GetGroupShuttedUinResponseAllOf {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SHUTTED_UIN_LIST = "ShuttedUinList";
  @SerializedName(SERIALIZED_NAME_SHUTTED_UIN_LIST)
  private List<GetGroupShuttedUinResponseAllOfShuttedUinList> shuttedUinList = null;

  public GetGroupShuttedUinResponseAllOf() { 
  }

  public GetGroupShuttedUinResponseAllOf shuttedUinList(List<GetGroupShuttedUinResponseAllOfShuttedUinList> shuttedUinList) {
    
    this.shuttedUinList = shuttedUinList;
    return this;
  }

  public GetGroupShuttedUinResponseAllOf addShuttedUinListItem(GetGroupShuttedUinResponseAllOfShuttedUinList shuttedUinListItem) {
    if (this.shuttedUinList == null) {
      this.shuttedUinList = new ArrayList<>();
    }
    this.shuttedUinList.add(shuttedUinListItem);
    return this;
  }

   /**
   * 返回结果为禁言用户信息数组，内容包括被禁言的成员 ID，及其被禁言到的时间（使用 UTC 时间，即世界协调时间）
   * @return shuttedUinList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回结果为禁言用户信息数组，内容包括被禁言的成员 ID，及其被禁言到的时间（使用 UTC 时间，即世界协调时间）")

  public List<GetGroupShuttedUinResponseAllOfShuttedUinList> getShuttedUinList() {
    return shuttedUinList;
  }


  public void setShuttedUinList(List<GetGroupShuttedUinResponseAllOfShuttedUinList> shuttedUinList) {
    this.shuttedUinList = shuttedUinList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupShuttedUinResponseAllOf getGroupShuttedUinResponseAllOf = (GetGroupShuttedUinResponseAllOf) o;
    return Objects.equals(this.shuttedUinList, getGroupShuttedUinResponseAllOf.shuttedUinList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shuttedUinList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupShuttedUinResponseAllOf {\n");
    sb.append("    shuttedUinList: ").append(toIndentedString(shuttedUinList)).append("\n");
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
    openapiFields.add("ShuttedUinList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetGroupShuttedUinResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetGroupShuttedUinResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupShuttedUinResponseAllOf is not found in the empty JSON string", GetGroupShuttedUinResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetGroupShuttedUinResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGroupShuttedUinResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayshuttedUinList = jsonObj.getAsJsonArray("ShuttedUinList");
      if (jsonArrayshuttedUinList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ShuttedUinList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ShuttedUinList` to be an array in the JSON string but got `%s`", jsonObj.get("ShuttedUinList").toString()));
        }

        // validate the optional field `ShuttedUinList` (array)
        for (int i = 0; i < jsonArrayshuttedUinList.size(); i++) {
          GetGroupShuttedUinResponseAllOfShuttedUinList.validateJsonObject(jsonArrayshuttedUinList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupShuttedUinResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupShuttedUinResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupShuttedUinResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupShuttedUinResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupShuttedUinResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GetGroupShuttedUinResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGroupShuttedUinResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGroupShuttedUinResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGroupShuttedUinResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GetGroupShuttedUinResponseAllOf
  */
  public static GetGroupShuttedUinResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupShuttedUinResponseAllOf.class);
  }

 /**
  * Convert an instance of GetGroupShuttedUinResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

