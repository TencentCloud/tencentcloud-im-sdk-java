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
 * ModifyGroupAttrRequest
 */

public class ModifyGroupAttrRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_GROUP_ATTR = "GroupAttr";
  @SerializedName(SERIALIZED_NAME_GROUP_ATTR)
  private List<ModifyGroupAttrRequestGroupAttrInner> groupAttr = new ArrayList<>();

  public ModifyGroupAttrRequest() { 
  }

  public ModifyGroupAttrRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 修改自定义属性的群id
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "修改自定义属性的群id")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ModifyGroupAttrRequest groupAttr(List<ModifyGroupAttrRequestGroupAttrInner> groupAttr) {
    
    this.groupAttr = groupAttr;
    return this;
  }

  public ModifyGroupAttrRequest addGroupAttrItem(ModifyGroupAttrRequestGroupAttrInner groupAttrItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyGroupAttrRequest modifyGroupAttrRequest = (ModifyGroupAttrRequest) o;
    return Objects.equals(this.groupId, modifyGroupAttrRequest.groupId) &&
        Objects.equals(this.groupAttr, modifyGroupAttrRequest.groupAttr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, groupAttr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyGroupAttrRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupAttr: ").append(toIndentedString(groupAttr)).append("\n");
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
  * @throws IOException if the JSON Object is invalid with respect to ModifyGroupAttrRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ModifyGroupAttrRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModifyGroupAttrRequest is not found in the empty JSON string", ModifyGroupAttrRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModifyGroupAttrRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModifyGroupAttrRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModifyGroupAttrRequest.openapiRequiredFields) {
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
       if (!ModifyGroupAttrRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModifyGroupAttrRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModifyGroupAttrRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModifyGroupAttrRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModifyGroupAttrRequest>() {
           @Override
           public void write(JsonWriter out, ModifyGroupAttrRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModifyGroupAttrRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModifyGroupAttrRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModifyGroupAttrRequest
  * @throws IOException if the JSON string is invalid with respect to ModifyGroupAttrRequest
  */
  public static ModifyGroupAttrRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModifyGroupAttrRequest.class);
  }

 /**
  * Convert an instance of ModifyGroupAttrRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

