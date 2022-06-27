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
 * GroupDeleteResponseAllOf
 */

public class GroupDeleteResponseAllOf {
  public static final String SERIALIZED_NAME_CURRENT_SEQUENCE = "CurrentSequence";
  @SerializedName(SERIALIZED_NAME_CURRENT_SEQUENCE)
  private Integer currentSequence;

  public static final String SERIALIZED_NAME_ERROR_DISPLAY = "ErrorDisplay";
  @SerializedName(SERIALIZED_NAME_ERROR_DISPLAY)
  private String errorDisplay;

  public GroupDeleteResponseAllOf() { 
  }

  public GroupDeleteResponseAllOf currentSequence(Integer currentSequence) {
    
    this.currentSequence = currentSequence;
    return this;
  }

   /**
   * 返回最新的分组 Sequence
   * @return currentSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回最新的分组 Sequence")

  public Integer getCurrentSequence() {
    return currentSequence;
  }


  public void setCurrentSequence(Integer currentSequence) {
    this.currentSequence = currentSequence;
  }


  public GroupDeleteResponseAllOf errorDisplay(String errorDisplay) {
    
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
    GroupDeleteResponseAllOf groupDeleteResponseAllOf = (GroupDeleteResponseAllOf) o;
    return Objects.equals(this.currentSequence, groupDeleteResponseAllOf.currentSequence) &&
        Objects.equals(this.errorDisplay, groupDeleteResponseAllOf.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentSequence, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupDeleteResponseAllOf {\n");
    sb.append("    currentSequence: ").append(toIndentedString(currentSequence)).append("\n");
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
    openapiFields.add("CurrentSequence");
    openapiFields.add("ErrorDisplay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupDeleteResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupDeleteResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupDeleteResponseAllOf is not found in the empty JSON string", GroupDeleteResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupDeleteResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupDeleteResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ErrorDisplay") != null && !jsonObj.get("ErrorDisplay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ErrorDisplay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ErrorDisplay").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupDeleteResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupDeleteResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupDeleteResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupDeleteResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupDeleteResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GroupDeleteResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupDeleteResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupDeleteResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupDeleteResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GroupDeleteResponseAllOf
  */
  public static GroupDeleteResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupDeleteResponseAllOf.class);
  }

 /**
  * Convert an instance of GroupDeleteResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

