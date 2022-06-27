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
 * GetGroupAttrResponseAllOfGroupAttrAry
 */

public class GetGroupAttrResponseAllOfGroupAttrAry {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public GetGroupAttrResponseAllOfGroupAttrAry() { 
  }

  public GetGroupAttrResponseAllOfGroupAttrAry key(String key) {
    
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


  public GetGroupAttrResponseAllOfGroupAttrAry value(String value) {
    
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
    GetGroupAttrResponseAllOfGroupAttrAry getGroupAttrResponseAllOfGroupAttrAry = (GetGroupAttrResponseAllOfGroupAttrAry) o;
    return Objects.equals(this.key, getGroupAttrResponseAllOfGroupAttrAry.key) &&
        Objects.equals(this.value, getGroupAttrResponseAllOfGroupAttrAry.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupAttrResponseAllOfGroupAttrAry {\n");
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
    openapiFields.add("key");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetGroupAttrResponseAllOfGroupAttrAry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetGroupAttrResponseAllOfGroupAttrAry.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupAttrResponseAllOfGroupAttrAry is not found in the empty JSON string", GetGroupAttrResponseAllOfGroupAttrAry.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetGroupAttrResponseAllOfGroupAttrAry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGroupAttrResponseAllOfGroupAttrAry` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupAttrResponseAllOfGroupAttrAry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupAttrResponseAllOfGroupAttrAry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupAttrResponseAllOfGroupAttrAry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupAttrResponseAllOfGroupAttrAry.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupAttrResponseAllOfGroupAttrAry>() {
           @Override
           public void write(JsonWriter out, GetGroupAttrResponseAllOfGroupAttrAry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGroupAttrResponseAllOfGroupAttrAry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGroupAttrResponseAllOfGroupAttrAry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGroupAttrResponseAllOfGroupAttrAry
  * @throws IOException if the JSON string is invalid with respect to GetGroupAttrResponseAllOfGroupAttrAry
  */
  public static GetGroupAttrResponseAllOfGroupAttrAry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupAttrResponseAllOfGroupAttrAry.class);
  }

 /**
  * Convert an instance of GetGroupAttrResponseAllOfGroupAttrAry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

