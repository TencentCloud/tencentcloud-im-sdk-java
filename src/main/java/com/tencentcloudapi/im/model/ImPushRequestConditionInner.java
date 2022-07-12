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
 * ImPushRequestConditionInner
 */

public class ImPushRequestConditionInner {
  public static final String SERIALIZED_NAME_ATTRS_OR = "AttrsOr";
  @SerializedName(SERIALIZED_NAME_ATTRS_OR)
  private Object attrsOr;

  public static final String SERIALIZED_NAME_ATTRS_AND = "AttrsAnd";
  @SerializedName(SERIALIZED_NAME_ATTRS_AND)
  private Object attrsAnd;

  public static final String SERIALIZED_NAME_TAGS_OR = "TagsOr";
  @SerializedName(SERIALIZED_NAME_TAGS_OR)
  private Object tagsOr;

  public static final String SERIALIZED_NAME_TAGS_AND = "TagsAnd";
  @SerializedName(SERIALIZED_NAME_TAGS_AND)
  private Object tagsAnd;

  public ImPushRequestConditionInner() { 
  }

  public ImPushRequestConditionInner attrsOr(Object attrsOr) {
    
    this.attrsOr = attrsOr;
    return this;
  }

   /**
   * 属性的或条件
   * @return attrsOr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "属性的或条件")

  public Object getAttrsOr() {
    return attrsOr;
  }


  public void setAttrsOr(Object attrsOr) {
    this.attrsOr = attrsOr;
  }


  public ImPushRequestConditionInner attrsAnd(Object attrsAnd) {
    
    this.attrsAnd = attrsAnd;
    return this;
  }

   /**
   * 属性的与条件
   * @return attrsAnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "属性的与条件")

  public Object getAttrsAnd() {
    return attrsAnd;
  }


  public void setAttrsAnd(Object attrsAnd) {
    this.attrsAnd = attrsAnd;
  }


  public ImPushRequestConditionInner tagsOr(Object tagsOr) {
    
    this.tagsOr = tagsOr;
    return this;
  }

   /**
   * 标签的或条件
   * @return tagsOr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签的或条件")

  public Object getTagsOr() {
    return tagsOr;
  }


  public void setTagsOr(Object tagsOr) {
    this.tagsOr = tagsOr;
  }


  public ImPushRequestConditionInner tagsAnd(Object tagsAnd) {
    
    this.tagsAnd = tagsAnd;
    return this;
  }

   /**
   * 标签的与条件
   * @return tagsAnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签的与条件")

  public Object getTagsAnd() {
    return tagsAnd;
  }


  public void setTagsAnd(Object tagsAnd) {
    this.tagsAnd = tagsAnd;
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
  public ImPushRequestConditionInner putAdditionalProperty(String key, Object value) {
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
    ImPushRequestConditionInner imPushRequestConditionInner = (ImPushRequestConditionInner) o;
    return Objects.equals(this.attrsOr, imPushRequestConditionInner.attrsOr) &&
        Objects.equals(this.attrsAnd, imPushRequestConditionInner.attrsAnd) &&
        Objects.equals(this.tagsOr, imPushRequestConditionInner.tagsOr) &&
        Objects.equals(this.tagsAnd, imPushRequestConditionInner.tagsAnd)&&
        Objects.equals(this.additionalProperties, imPushRequestConditionInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrsOr, attrsAnd, tagsOr, tagsAnd, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImPushRequestConditionInner {\n");
    sb.append("    attrsOr: ").append(toIndentedString(attrsOr)).append("\n");
    sb.append("    attrsAnd: ").append(toIndentedString(attrsAnd)).append("\n");
    sb.append("    tagsOr: ").append(toIndentedString(tagsOr)).append("\n");
    sb.append("    tagsAnd: ").append(toIndentedString(tagsAnd)).append("\n");
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
    openapiFields.add("AttrsOr");
    openapiFields.add("AttrsAnd");
    openapiFields.add("TagsOr");
    openapiFields.add("TagsAnd");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImPushRequestConditionInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImPushRequestConditionInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImPushRequestConditionInner is not found in the empty JSON string", ImPushRequestConditionInner.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImPushRequestConditionInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImPushRequestConditionInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImPushRequestConditionInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImPushRequestConditionInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ImPushRequestConditionInner>() {
           @Override
           public void write(JsonWriter out, ImPushRequestConditionInner value) throws IOException {
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
           public ImPushRequestConditionInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ImPushRequestConditionInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ImPushRequestConditionInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImPushRequestConditionInner
  * @throws IOException if the JSON string is invalid with respect to ImPushRequestConditionInner
  */
  public static ImPushRequestConditionInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImPushRequestConditionInner.class);
  }

 /**
  * Convert an instance of ImPushRequestConditionInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

