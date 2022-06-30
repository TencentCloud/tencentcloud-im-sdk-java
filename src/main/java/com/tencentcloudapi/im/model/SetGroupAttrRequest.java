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
 * SetGroupAttrRequest
 */

public class SetGroupAttrRequest {
  private static final long serialVersionUID = 1L;

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
        Objects.equals(this.groupAttr, setGroupAttrRequest.groupAttr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, groupAttr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetGroupAttrRequest {\n");
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

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SetGroupAttrRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetGroupAttrRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
             elementAdapter.write(out, obj);
           }

           @Override
           public SetGroupAttrRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

