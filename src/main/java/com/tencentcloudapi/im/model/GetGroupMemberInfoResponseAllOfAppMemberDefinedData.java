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
 * GetGroupMemberInfoResponseAllOfAppMemberDefinedData
 */

public class GetGroupMemberInfoResponseAllOfAppMemberDefinedData {
  public static final String SERIALIZED_NAME_KEY = "Key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public GetGroupMemberInfoResponseAllOfAppMemberDefinedData() { 
  }

  public GetGroupMemberInfoResponseAllOfAppMemberDefinedData key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public GetGroupMemberInfoResponseAllOfAppMemberDefinedData value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupMemberInfoResponseAllOfAppMemberDefinedData getGroupMemberInfoResponseAllOfAppMemberDefinedData = (GetGroupMemberInfoResponseAllOfAppMemberDefinedData) o;
    return Objects.equals(this.key, getGroupMemberInfoResponseAllOfAppMemberDefinedData.key) &&
        Objects.equals(this.value, getGroupMemberInfoResponseAllOfAppMemberDefinedData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupMemberInfoResponseAllOfAppMemberDefinedData {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("Key");
    openapiFields.add("Value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetGroupMemberInfoResponseAllOfAppMemberDefinedData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetGroupMemberInfoResponseAllOfAppMemberDefinedData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupMemberInfoResponseAllOfAppMemberDefinedData is not found in the empty JSON string", GetGroupMemberInfoResponseAllOfAppMemberDefinedData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetGroupMemberInfoResponseAllOfAppMemberDefinedData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGroupMemberInfoResponseAllOfAppMemberDefinedData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("Key") != null && !jsonObj.get("Key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Key").toString()));
      }
      if (jsonObj.get("Value") != null && !jsonObj.get("Value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupMemberInfoResponseAllOfAppMemberDefinedData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupMemberInfoResponseAllOfAppMemberDefinedData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupMemberInfoResponseAllOfAppMemberDefinedData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupMemberInfoResponseAllOfAppMemberDefinedData.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupMemberInfoResponseAllOfAppMemberDefinedData>() {
           @Override
           public void write(JsonWriter out, GetGroupMemberInfoResponseAllOfAppMemberDefinedData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGroupMemberInfoResponseAllOfAppMemberDefinedData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGroupMemberInfoResponseAllOfAppMemberDefinedData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGroupMemberInfoResponseAllOfAppMemberDefinedData
  * @throws IOException if the JSON string is invalid with respect to GetGroupMemberInfoResponseAllOfAppMemberDefinedData
  */
  public static GetGroupMemberInfoResponseAllOfAppMemberDefinedData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupMemberInfoResponseAllOfAppMemberDefinedData.class);
  }

 /**
  * Convert an instance of GetGroupMemberInfoResponseAllOfAppMemberDefinedData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

