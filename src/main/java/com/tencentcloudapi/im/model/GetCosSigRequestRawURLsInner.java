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
 * GetCosSigRequestRawURLsInner
 */

public class GetCosSigRequestRawURLsInner {
  public static final String SERIALIZED_NAME_RESOURCE_I_D = "ResourceID";
  @SerializedName(SERIALIZED_NAME_RESOURCE_I_D)
  private Integer resourceID;

  public static final String SERIALIZED_NAME_RAW_U_R_L = "RawURL";
  @SerializedName(SERIALIZED_NAME_RAW_U_R_L)
  private String rawURL;

  public GetCosSigRequestRawURLsInner() { 
  }

  public GetCosSigRequestRawURLsInner resourceID(Integer resourceID) {
    
    this.resourceID = resourceID;
    return this;
  }

   /**
   * 同批次查询的资源 ID
   * @return resourceID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "同批次查询的资源 ID")

  public Integer getResourceID() {
    return resourceID;
  }


  public void setResourceID(Integer resourceID) {
    this.resourceID = resourceID;
  }


  public GetCosSigRequestRawURLsInner rawURL(String rawURL) {
    
    this.rawURL = rawURL;
    return this;
  }

   /**
   * 同批次查询的文件 URL
   * @return rawURL
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "同批次查询的文件 URL")

  public String getRawURL() {
    return rawURL;
  }


  public void setRawURL(String rawURL) {
    this.rawURL = rawURL;
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
  public GetCosSigRequestRawURLsInner putAdditionalProperty(String key, Object value) {
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
    GetCosSigRequestRawURLsInner getCosSigRequestRawURLsInner = (GetCosSigRequestRawURLsInner) o;
    return Objects.equals(this.resourceID, getCosSigRequestRawURLsInner.resourceID) &&
        Objects.equals(this.rawURL, getCosSigRequestRawURLsInner.rawURL)&&
        Objects.equals(this.additionalProperties, getCosSigRequestRawURLsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceID, rawURL, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCosSigRequestRawURLsInner {\n");
    sb.append("    resourceID: ").append(toIndentedString(resourceID)).append("\n");
    sb.append("    rawURL: ").append(toIndentedString(rawURL)).append("\n");
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
    openapiFields.add("ResourceID");
    openapiFields.add("RawURL");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ResourceID");
    openapiRequiredFields.add("RawURL");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetCosSigRequestRawURLsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetCosSigRequestRawURLsInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCosSigRequestRawURLsInner is not found in the empty JSON string", GetCosSigRequestRawURLsInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetCosSigRequestRawURLsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("RawURL") != null && !jsonObj.get("RawURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RawURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RawURL").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCosSigRequestRawURLsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCosSigRequestRawURLsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCosSigRequestRawURLsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCosSigRequestRawURLsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCosSigRequestRawURLsInner>() {
           @Override
           public void write(JsonWriter out, GetCosSigRequestRawURLsInner value) throws IOException {
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
           public GetCosSigRequestRawURLsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetCosSigRequestRawURLsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetCosSigRequestRawURLsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetCosSigRequestRawURLsInner
  * @throws IOException if the JSON string is invalid with respect to GetCosSigRequestRawURLsInner
  */
  public static GetCosSigRequestRawURLsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCosSigRequestRawURLsInner.class);
  }

 /**
  * Convert an instance of GetCosSigRequestRawURLsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

