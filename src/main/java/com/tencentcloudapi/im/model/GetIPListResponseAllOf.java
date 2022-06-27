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
 * GetIPListResponseAllOf
 */

public class GetIPListResponseAllOf {
  public static final String SERIALIZED_NAME_IP_LIST = "IPList";
  @SerializedName(SERIALIZED_NAME_IP_LIST)
  private List<String> ipList = null;

  public GetIPListResponseAllOf() { 
  }

  public GetIPListResponseAllOf ipList(List<String> ipList) {
    
    this.ipList = ipList;
    return this;
  }

  public GetIPListResponseAllOf addIpListItem(String ipListItem) {
    if (this.ipList == null) {
      this.ipList = new ArrayList<>();
    }
    this.ipList.add(ipListItem);
    return this;
  }

   /**
   * 服务器 IP 列表
   * @return ipList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "服务器 IP 列表")

  public List<String> getIpList() {
    return ipList;
  }


  public void setIpList(List<String> ipList) {
    this.ipList = ipList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIPListResponseAllOf getIPListResponseAllOf = (GetIPListResponseAllOf) o;
    return Objects.equals(this.ipList, getIPListResponseAllOf.ipList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIPListResponseAllOf {\n");
    sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
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
    openapiFields.add("IPList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetIPListResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetIPListResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetIPListResponseAllOf is not found in the empty JSON string", GetIPListResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetIPListResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetIPListResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("IPList") != null && !jsonObj.get("IPList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPList` to be an array in the JSON string but got `%s`", jsonObj.get("IPList").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetIPListResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetIPListResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetIPListResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetIPListResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetIPListResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GetIPListResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetIPListResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetIPListResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetIPListResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GetIPListResponseAllOf
  */
  public static GetIPListResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetIPListResponseAllOf.class);
  }

 /**
  * Convert an instance of GetIPListResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

