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
import java.math.BigDecimal;

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
 * TIMLocationElemMsgContent
 */

public class TIMLocationElemMsgContent {
  public static final String SERIALIZED_NAME_LONGITUDE = "Longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private BigDecimal longitude;

  public static final String SERIALIZED_NAME_LATITUDE = "Latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private BigDecimal latitude;

  public static final String SERIALIZED_NAME_DESC = "Desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public TIMLocationElemMsgContent() { 
  }

  public TIMLocationElemMsgContent longitude(BigDecimal longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getLongitude() {
    return longitude;
  }


  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  public TIMLocationElemMsgContent latitude(BigDecimal latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getLatitude() {
    return latitude;
  }


  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }


  public TIMLocationElemMsgContent desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
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
  public TIMLocationElemMsgContent putAdditionalProperty(String key, Object value) {
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
    TIMLocationElemMsgContent tiMLocationElemMsgContent = (TIMLocationElemMsgContent) o;
    return Objects.equals(this.longitude, tiMLocationElemMsgContent.longitude) &&
        Objects.equals(this.latitude, tiMLocationElemMsgContent.latitude) &&
        Objects.equals(this.desc, tiMLocationElemMsgContent.desc)&&
        Objects.equals(this.additionalProperties, tiMLocationElemMsgContent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longitude, latitude, desc, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TIMLocationElemMsgContent {\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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
    openapiFields.add("Longitude");
    openapiFields.add("Latitude");
    openapiFields.add("Desc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Longitude");
    openapiRequiredFields.add("Latitude");
    openapiRequiredFields.add("Desc");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TIMLocationElemMsgContent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TIMLocationElemMsgContent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TIMLocationElemMsgContent is not found in the empty JSON string", TIMLocationElemMsgContent.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TIMLocationElemMsgContent.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Desc") != null && !jsonObj.get("Desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Desc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TIMLocationElemMsgContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TIMLocationElemMsgContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TIMLocationElemMsgContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TIMLocationElemMsgContent.class));

       return (TypeAdapter<T>) new TypeAdapter<TIMLocationElemMsgContent>() {
           @Override
           public void write(JsonWriter out, TIMLocationElemMsgContent value) throws IOException {
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
           public TIMLocationElemMsgContent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TIMLocationElemMsgContent instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TIMLocationElemMsgContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TIMLocationElemMsgContent
  * @throws IOException if the JSON string is invalid with respect to TIMLocationElemMsgContent
  */
  public static TIMLocationElemMsgContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TIMLocationElemMsgContent.class);
  }

 /**
  * Convert an instance of TIMLocationElemMsgContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

