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
import com.tencentcloudapi.im.model.GroupMsgGetSimpleResponseAllOfRspMsgList;
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
 * GroupMsgGetSimpleResponseAllOf
 */

public class GroupMsgGetSimpleResponseAllOf {
  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_IS_FINISHED = "IsFinished";
  @SerializedName(SERIALIZED_NAME_IS_FINISHED)
  private Integer isFinished;

  public static final String SERIALIZED_NAME_RSP_MSG_LIST = "RspMsgList";
  @SerializedName(SERIALIZED_NAME_RSP_MSG_LIST)
  private List<GroupMsgGetSimpleResponseAllOfRspMsgList> rspMsgList = null;

  public GroupMsgGetSimpleResponseAllOf() { 
  }

  public GroupMsgGetSimpleResponseAllOf groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 请求中的群组 ID
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求中的群组 ID")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public GroupMsgGetSimpleResponseAllOf isFinished(Integer isFinished) {
    
    this.isFinished = isFinished;
    return this;
  }

   /**
   * 是否返回了请求区间的全部消息 当成功返回了请求区间的全部消息时，值为1;当消息长度太长或者区间太大（超过20）导致无法返回全部消息时，值为0;当消息长度太长或者区间太大（超过20）且所有消息都过期时，值为2
   * @return isFinished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否返回了请求区间的全部消息 当成功返回了请求区间的全部消息时，值为1;当消息长度太长或者区间太大（超过20）导致无法返回全部消息时，值为0;当消息长度太长或者区间太大（超过20）且所有消息都过期时，值为2")

  public Integer getIsFinished() {
    return isFinished;
  }


  public void setIsFinished(Integer isFinished) {
    this.isFinished = isFinished;
  }


  public GroupMsgGetSimpleResponseAllOf rspMsgList(List<GroupMsgGetSimpleResponseAllOfRspMsgList> rspMsgList) {
    
    this.rspMsgList = rspMsgList;
    return this;
  }

  public GroupMsgGetSimpleResponseAllOf addRspMsgListItem(GroupMsgGetSimpleResponseAllOfRspMsgList rspMsgListItem) {
    if (this.rspMsgList == null) {
      this.rspMsgList = new ArrayList<>();
    }
    this.rspMsgList.add(rspMsgListItem);
    return this;
  }

   /**
   * 返回的消息列表
   * @return rspMsgList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回的消息列表")

  public List<GroupMsgGetSimpleResponseAllOfRspMsgList> getRspMsgList() {
    return rspMsgList;
  }


  public void setRspMsgList(List<GroupMsgGetSimpleResponseAllOfRspMsgList> rspMsgList) {
    this.rspMsgList = rspMsgList;
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
  public GroupMsgGetSimpleResponseAllOf putAdditionalProperty(String key, Object value) {
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
    GroupMsgGetSimpleResponseAllOf groupMsgGetSimpleResponseAllOf = (GroupMsgGetSimpleResponseAllOf) o;
    return Objects.equals(this.groupId, groupMsgGetSimpleResponseAllOf.groupId) &&
        Objects.equals(this.isFinished, groupMsgGetSimpleResponseAllOf.isFinished) &&
        Objects.equals(this.rspMsgList, groupMsgGetSimpleResponseAllOf.rspMsgList)&&
        Objects.equals(this.additionalProperties, groupMsgGetSimpleResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, isFinished, rspMsgList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgGetSimpleResponseAllOf {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    isFinished: ").append(toIndentedString(isFinished)).append("\n");
    sb.append("    rspMsgList: ").append(toIndentedString(rspMsgList)).append("\n");
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
    openapiFields.add("IsFinished");
    openapiFields.add("RspMsgList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupMsgGetSimpleResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupMsgGetSimpleResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupMsgGetSimpleResponseAllOf is not found in the empty JSON string", GroupMsgGetSimpleResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
      JsonArray jsonArrayrspMsgList = jsonObj.getAsJsonArray("RspMsgList");
      if (jsonArrayrspMsgList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("RspMsgList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `RspMsgList` to be an array in the JSON string but got `%s`", jsonObj.get("RspMsgList").toString()));
        }

        // validate the optional field `RspMsgList` (array)
        for (int i = 0; i < jsonArrayrspMsgList.size(); i++) {
          GroupMsgGetSimpleResponseAllOfRspMsgList.validateJsonObject(jsonArrayrspMsgList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupMsgGetSimpleResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupMsgGetSimpleResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupMsgGetSimpleResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupMsgGetSimpleResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupMsgGetSimpleResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GroupMsgGetSimpleResponseAllOf value) throws IOException {
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
           public GroupMsgGetSimpleResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GroupMsgGetSimpleResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GroupMsgGetSimpleResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupMsgGetSimpleResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GroupMsgGetSimpleResponseAllOf
  */
  public static GroupMsgGetSimpleResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupMsgGetSimpleResponseAllOf.class);
  }

 /**
  * Convert an instance of GroupMsgGetSimpleResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

