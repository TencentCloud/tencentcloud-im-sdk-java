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
import com.tencentcloudapi.im.model.ImGetTagResponseAllOfUserTags;
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
 * ImGetTagResponseAllOf
 */

public class ImGetTagResponseAllOf {
  public static final String SERIALIZED_NAME_USER_TAGS = "UserTags";
  @SerializedName(SERIALIZED_NAME_USER_TAGS)
  private List<ImGetTagResponseAllOfUserTags> userTags = null;

  public ImGetTagResponseAllOf() { 
  }

  public ImGetTagResponseAllOf userTags(List<ImGetTagResponseAllOfUserTags> userTags) {
    
    this.userTags = userTags;
    return this;
  }

  public ImGetTagResponseAllOf addUserTagsItem(ImGetTagResponseAllOfUserTags userTagsItem) {
    if (this.userTags == null) {
      this.userTags = new ArrayList<>();
    }
    this.userTags.add(userTagsItem);
    return this;
  }

   /**
   * Get userTags
   * @return userTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ImGetTagResponseAllOfUserTags> getUserTags() {
    return userTags;
  }


  public void setUserTags(List<ImGetTagResponseAllOfUserTags> userTags) {
    this.userTags = userTags;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public ImGetTagResponseAllOf putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImGetTagResponseAllOf imGetTagResponseAllOf = (ImGetTagResponseAllOf) o;
    return Objects.equals(this.userTags, imGetTagResponseAllOf.userTags)&&
        Objects.equals(this.additionalProperties, imGetTagResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userTags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImGetTagResponseAllOf {\n");
    sb.append("    userTags: ").append(toIndentedString(userTags)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImGetTagResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImGetTagResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImGetTagResponseAllOf is not found in the empty JSON string", ImGetTagResponseAllOf.openapiRequiredFields.toString()));
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
          ImGetTagResponseAllOfUserTags.validateJsonObject(jsonArrayuserTags.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImGetTagResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImGetTagResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImGetTagResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImGetTagResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ImGetTagResponseAllOf>() {
           @Override
           public void write(JsonWriter out, ImGetTagResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ImGetTagResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ImGetTagResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), Object.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImGetTagResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImGetTagResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to ImGetTagResponseAllOf
  */
  public static ImGetTagResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImGetTagResponseAllOf.class);
  }

 /**
  * Convert an instance of ImGetTagResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

