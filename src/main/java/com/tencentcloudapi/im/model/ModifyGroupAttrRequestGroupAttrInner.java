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
 * ModifyGroupAttrRequestGroupAttrInner
 */

public class ModifyGroupAttrRequestGroupAttrInner {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public ModifyGroupAttrRequestGroupAttrInner() { 
  }

  public ModifyGroupAttrRequestGroupAttrInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public ModifyGroupAttrRequestGroupAttrInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

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
    ModifyGroupAttrRequestGroupAttrInner modifyGroupAttrRequestGroupAttrInner = (ModifyGroupAttrRequestGroupAttrInner) o;
    return Objects.equals(this.key, modifyGroupAttrRequestGroupAttrInner.key) &&
        Objects.equals(this.value, modifyGroupAttrRequestGroupAttrInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyGroupAttrRequestGroupAttrInner {\n");
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
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModifyGroupAttrRequestGroupAttrInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ModifyGroupAttrRequestGroupAttrInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModifyGroupAttrRequestGroupAttrInner is not found in the empty JSON string", ModifyGroupAttrRequestGroupAttrInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModifyGroupAttrRequestGroupAttrInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModifyGroupAttrRequestGroupAttrInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModifyGroupAttrRequestGroupAttrInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
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
       if (!ModifyGroupAttrRequestGroupAttrInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModifyGroupAttrRequestGroupAttrInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModifyGroupAttrRequestGroupAttrInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModifyGroupAttrRequestGroupAttrInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModifyGroupAttrRequestGroupAttrInner>() {
           @Override
           public void write(JsonWriter out, ModifyGroupAttrRequestGroupAttrInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModifyGroupAttrRequestGroupAttrInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModifyGroupAttrRequestGroupAttrInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModifyGroupAttrRequestGroupAttrInner
  * @throws IOException if the JSON string is invalid with respect to ModifyGroupAttrRequestGroupAttrInner
  */
  public static ModifyGroupAttrRequestGroupAttrInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModifyGroupAttrRequestGroupAttrInner.class);
  }

 /**
  * Convert an instance of ModifyGroupAttrRequestGroupAttrInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

