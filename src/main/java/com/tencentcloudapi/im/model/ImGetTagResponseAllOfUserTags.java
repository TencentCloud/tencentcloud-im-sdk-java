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
 * ImGetTagResponseAllOfUserTags
 */

public class ImGetTagResponseAllOfUserTags {
  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public ImGetTagResponseAllOfUserTags() { 
  }

  public ImGetTagResponseAllOfUserTags toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 用户帐号
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户帐号")

  public String getToAccount() {
    return toAccount;
  }


  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public ImGetTagResponseAllOfUserTags tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ImGetTagResponseAllOfUserTags addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags内容
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags内容")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImGetTagResponseAllOfUserTags imGetTagResponseAllOfUserTags = (ImGetTagResponseAllOfUserTags) o;
    return Objects.equals(this.toAccount, imGetTagResponseAllOfUserTags.toAccount) &&
        Objects.equals(this.tags, imGetTagResponseAllOfUserTags.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImGetTagResponseAllOfUserTags {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("To_Account");
    openapiFields.add("Tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImGetTagResponseAllOfUserTags
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImGetTagResponseAllOfUserTags.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImGetTagResponseAllOfUserTags is not found in the empty JSON string", ImGetTagResponseAllOfUserTags.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImGetTagResponseAllOfUserTags.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImGetTagResponseAllOfUserTags` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Tags` to be an array in the JSON string but got `%s`", jsonObj.get("Tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImGetTagResponseAllOfUserTags.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImGetTagResponseAllOfUserTags' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImGetTagResponseAllOfUserTags> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImGetTagResponseAllOfUserTags.class));

       return (TypeAdapter<T>) new TypeAdapter<ImGetTagResponseAllOfUserTags>() {
           @Override
           public void write(JsonWriter out, ImGetTagResponseAllOfUserTags value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImGetTagResponseAllOfUserTags read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImGetTagResponseAllOfUserTags given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImGetTagResponseAllOfUserTags
  * @throws IOException if the JSON string is invalid with respect to ImGetTagResponseAllOfUserTags
  */
  public static ImGetTagResponseAllOfUserTags fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImGetTagResponseAllOfUserTags.class);
  }

 /**
  * Convert an instance of ImGetTagResponseAllOfUserTags to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

