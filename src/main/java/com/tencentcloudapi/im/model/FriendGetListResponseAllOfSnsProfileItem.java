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
 * FriendGetListResponseAllOfSnsProfileItem
 */

public class FriendGetListResponseAllOfSnsProfileItem {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TAG = "Tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public FriendGetListResponseAllOfSnsProfileItem() { 
  }

  public FriendGetListResponseAllOfSnsProfileItem tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * 字段的名称
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "字段的名称")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public FriendGetListResponseAllOfSnsProfileItem value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 字段的值
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "字段的值")

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
    FriendGetListResponseAllOfSnsProfileItem friendGetListResponseAllOfSnsProfileItem = (FriendGetListResponseAllOfSnsProfileItem) o;
    return Objects.equals(this.tag, friendGetListResponseAllOfSnsProfileItem.tag) &&
        Objects.equals(this.value, friendGetListResponseAllOfSnsProfileItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendGetListResponseAllOfSnsProfileItem {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("Tag");
    openapiFields.add("Value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FriendGetListResponseAllOfSnsProfileItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FriendGetListResponseAllOfSnsProfileItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FriendGetListResponseAllOfSnsProfileItem is not found in the empty JSON string", FriendGetListResponseAllOfSnsProfileItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FriendGetListResponseAllOfSnsProfileItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FriendGetListResponseAllOfSnsProfileItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("Tag") != null && !jsonObj.get("Tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Tag").toString()));
      }
      if (jsonObj.get("Value") != null && !jsonObj.get("Value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FriendGetListResponseAllOfSnsProfileItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FriendGetListResponseAllOfSnsProfileItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FriendGetListResponseAllOfSnsProfileItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FriendGetListResponseAllOfSnsProfileItem.class));

       return (TypeAdapter<T>) new TypeAdapter<FriendGetListResponseAllOfSnsProfileItem>() {
           @Override
           public void write(JsonWriter out, FriendGetListResponseAllOfSnsProfileItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FriendGetListResponseAllOfSnsProfileItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FriendGetListResponseAllOfSnsProfileItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FriendGetListResponseAllOfSnsProfileItem
  * @throws IOException if the JSON string is invalid with respect to FriendGetListResponseAllOfSnsProfileItem
  */
  public static FriendGetListResponseAllOfSnsProfileItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FriendGetListResponseAllOfSnsProfileItem.class);
  }

 /**
  * Convert an instance of FriendGetListResponseAllOfSnsProfileItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

