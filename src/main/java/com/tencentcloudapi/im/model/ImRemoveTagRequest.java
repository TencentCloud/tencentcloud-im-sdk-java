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
import com.tencentcloudapi.im.model.ImRemoveTagRequestUserTagsInner;
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
 * ImRemoveTagRequest
 */

public class ImRemoveTagRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_USER_TAGS = "UserTags";
  @SerializedName(SERIALIZED_NAME_USER_TAGS)
  private List<ImRemoveTagRequestUserTagsInner> userTags = new ArrayList<>();

  public ImRemoveTagRequest() { 
  }

  public ImRemoveTagRequest userTags(List<ImRemoveTagRequestUserTagsInner> userTags) {
    
    this.userTags = userTags;
    return this;
  }

  public ImRemoveTagRequest addUserTagsItem(ImRemoveTagRequestUserTagsInner userTagsItem) {
    this.userTags.add(userTagsItem);
    return this;
  }

   /**
   * 目标用户帐号列表
   * @return userTags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "目标用户帐号列表")

  public List<ImRemoveTagRequestUserTagsInner> getUserTags() {
    return userTags;
  }


  public void setUserTags(List<ImRemoveTagRequestUserTagsInner> userTags) {
    this.userTags = userTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImRemoveTagRequest imRemoveTagRequest = (ImRemoveTagRequest) o;
    return Objects.equals(this.userTags, imRemoveTagRequest.userTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImRemoveTagRequest {\n");
    sb.append("    userTags: ").append(toIndentedString(userTags)).append("\n");
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
    openapiFields.add("UserTags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("UserTags");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImRemoveTagRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImRemoveTagRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImRemoveTagRequest is not found in the empty JSON string", ImRemoveTagRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImRemoveTagRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImRemoveTagRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImRemoveTagRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayuserTags = jsonObj.getAsJsonArray("UserTags");
      if (jsonArrayuserTags != null) {
        // ensure the json data is an array
        if (!jsonObj.get("UserTags").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `UserTags` to be an array in the JSON string but got `%s`", jsonObj.get("UserTags").toString()));
        }

        // validate the optional field `UserTags` (array)
        for (int i = 0; i < jsonArrayuserTags.size(); i++) {
          ImRemoveTagRequestUserTagsInner.validateJsonObject(jsonArrayuserTags.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImRemoveTagRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImRemoveTagRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImRemoveTagRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImRemoveTagRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ImRemoveTagRequest>() {
           @Override
           public void write(JsonWriter out, ImRemoveTagRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImRemoveTagRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImRemoveTagRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImRemoveTagRequest
  * @throws IOException if the JSON string is invalid with respect to ImRemoveTagRequest
  */
  public static ImRemoveTagRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImRemoveTagRequest.class);
  }

 /**
  * Convert an instance of ImRemoveTagRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

