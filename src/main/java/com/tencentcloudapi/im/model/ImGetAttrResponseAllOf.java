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
import com.tencentcloudapi.im.model.ImGetAttrResponseAllOfUserAttrs;
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
 * ImGetAttrResponseAllOf
 */

public class ImGetAttrResponseAllOf {
  public static final String SERIALIZED_NAME_USER_ATTRS = "UserAttrs";
  @SerializedName(SERIALIZED_NAME_USER_ATTRS)
  private List<ImGetAttrResponseAllOfUserAttrs> userAttrs = null;

  public ImGetAttrResponseAllOf() { 
  }

  public ImGetAttrResponseAllOf userAttrs(List<ImGetAttrResponseAllOfUserAttrs> userAttrs) {
    
    this.userAttrs = userAttrs;
    return this;
  }

  public ImGetAttrResponseAllOf addUserAttrsItem(ImGetAttrResponseAllOfUserAttrs userAttrsItem) {
    if (this.userAttrs == null) {
      this.userAttrs = new ArrayList<>();
    }
    this.userAttrs.add(userAttrsItem);
    return this;
  }

   /**
   * Get userAttrs
   * @return userAttrs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ImGetAttrResponseAllOfUserAttrs> getUserAttrs() {
    return userAttrs;
  }


  public void setUserAttrs(List<ImGetAttrResponseAllOfUserAttrs> userAttrs) {
    this.userAttrs = userAttrs;
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
  public ImGetAttrResponseAllOf putAdditionalProperty(String key, Object value) {
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
    ImGetAttrResponseAllOf imGetAttrResponseAllOf = (ImGetAttrResponseAllOf) o;
    return Objects.equals(this.userAttrs, imGetAttrResponseAllOf.userAttrs)&&
        Objects.equals(this.additionalProperties, imGetAttrResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAttrs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImGetAttrResponseAllOf {\n");
    sb.append("    userAttrs: ").append(toIndentedString(userAttrs)).append("\n");
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
    openapiFields.add("UserAttrs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImGetAttrResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImGetAttrResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImGetAttrResponseAllOf is not found in the empty JSON string", ImGetAttrResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayuserAttrs = jsonObj.getAsJsonArray("UserAttrs");
      if (jsonArrayuserAttrs != null) {
        // ensure the json data is an array
        if (!jsonObj.get("UserAttrs").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `UserAttrs` to be an array in the JSON string but got `%s`", jsonObj.get("UserAttrs").toString()));
        }

        // validate the optional field `UserAttrs` (array)
        for (int i = 0; i < jsonArrayuserAttrs.size(); i++) {
          ImGetAttrResponseAllOfUserAttrs.validateJsonObject(jsonArrayuserAttrs.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImGetAttrResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImGetAttrResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImGetAttrResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImGetAttrResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ImGetAttrResponseAllOf>() {
           @Override
           public void write(JsonWriter out, ImGetAttrResponseAllOf value) throws IOException {
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
           public ImGetAttrResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ImGetAttrResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ImGetAttrResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImGetAttrResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to ImGetAttrResponseAllOf
  */
  public static ImGetAttrResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImGetAttrResponseAllOf.class);
  }

 /**
  * Convert an instance of ImGetAttrResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

