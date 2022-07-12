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
import com.tencentcloudapi.im.model.ModifyGroupAttrRequestGroupAttrInner;
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
 * SetGroupAttrRequest
 */

public class SetGroupAttrRequest {
  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_GROUP_ATTR = "GroupAttr";
  @SerializedName(SERIALIZED_NAME_GROUP_ATTR)
  private List<ModifyGroupAttrRequestGroupAttrInner> groupAttr = new ArrayList<>();

  public SetGroupAttrRequest() { 
  }

  public SetGroupAttrRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 重置自定义属性的群id
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "重置自定义属性的群id")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public SetGroupAttrRequest groupAttr(List<ModifyGroupAttrRequestGroupAttrInner> groupAttr) {
    
    this.groupAttr = groupAttr;
    return this;
  }

  public SetGroupAttrRequest addGroupAttrItem(ModifyGroupAttrRequestGroupAttrInner groupAttrItem) {
    this.groupAttr.add(groupAttrItem);
    return this;
  }

   /**
   * 自定义属性列表，key 为自定义属性的键，value 为自定义属性的值
   * @return groupAttr
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "自定义属性列表，key 为自定义属性的键，value 为自定义属性的值")

  public List<ModifyGroupAttrRequestGroupAttrInner> getGroupAttr() {
    return groupAttr;
  }


  public void setGroupAttr(List<ModifyGroupAttrRequestGroupAttrInner> groupAttr) {
    this.groupAttr = groupAttr;
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
  public SetGroupAttrRequest putAdditionalProperty(String key, Object value) {
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
    SetGroupAttrRequest setGroupAttrRequest = (SetGroupAttrRequest) o;
    return Objects.equals(this.groupId, setGroupAttrRequest.groupId) &&
        Objects.equals(this.groupAttr, setGroupAttrRequest.groupAttr)&&
        Objects.equals(this.additionalProperties, setGroupAttrRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, groupAttr, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetGroupAttrRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupAttr: ").append(toIndentedString(groupAttr)).append("\n");
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
    openapiFields.add("GroupId");
    openapiFields.add("GroupAttr");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GroupId");
    openapiRequiredFields.add("GroupAttr");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SetGroupAttrRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SetGroupAttrRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetGroupAttrRequest is not found in the empty JSON string", SetGroupAttrRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SetGroupAttrRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
      JsonArray jsonArraygroupAttr = jsonObj.getAsJsonArray("GroupAttr");
      if (jsonArraygroupAttr != null) {
        // ensure the json data is an array
        if (!jsonObj.get("GroupAttr").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `GroupAttr` to be an array in the JSON string but got `%s`", jsonObj.get("GroupAttr").toString()));
        }

        // validate the optional field `GroupAttr` (array)
        for (int i = 0; i < jsonArraygroupAttr.size(); i++) {
          ModifyGroupAttrRequestGroupAttrInner.validateJsonObject(jsonArraygroupAttr.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetGroupAttrRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetGroupAttrRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetGroupAttrRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetGroupAttrRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SetGroupAttrRequest>() {
           @Override
           public void write(JsonWriter out, SetGroupAttrRequest value) throws IOException {
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
           public SetGroupAttrRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SetGroupAttrRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SetGroupAttrRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetGroupAttrRequest
  * @throws IOException if the JSON string is invalid with respect to SetGroupAttrRequest
  */
  public static SetGroupAttrRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetGroupAttrRequest.class);
  }

 /**
  * Convert an instance of SetGroupAttrRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

