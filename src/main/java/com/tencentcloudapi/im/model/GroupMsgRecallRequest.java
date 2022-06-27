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
import com.tencentcloudapi.im.model.GroupMsgRecallRequestMsgSeqListInner;
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
 * GroupMsgRecallRequest
 */

public class GroupMsgRecallRequest {
  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_MSG_SEQ_LIST = "MsgSeqList";
  @SerializedName(SERIALIZED_NAME_MSG_SEQ_LIST)
  private List<GroupMsgRecallRequestMsgSeqListInner> msgSeqList = new ArrayList<>();

  public GroupMsgRecallRequest() { 
  }

  public GroupMsgRecallRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 操作的群 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "操作的群 ID")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public GroupMsgRecallRequest msgSeqList(List<GroupMsgRecallRequestMsgSeqListInner> msgSeqList) {
    
    this.msgSeqList = msgSeqList;
    return this;
  }

  public GroupMsgRecallRequest addMsgSeqListItem(GroupMsgRecallRequestMsgSeqListInner msgSeqListItem) {
    this.msgSeqList.add(msgSeqListItem);
    return this;
  }

   /**
   * 被撤回的消息 seq 列表，一次请求最多可以撤回10条消息 seq
   * @return msgSeqList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "被撤回的消息 seq 列表，一次请求最多可以撤回10条消息 seq")

  public List<GroupMsgRecallRequestMsgSeqListInner> getMsgSeqList() {
    return msgSeqList;
  }


  public void setMsgSeqList(List<GroupMsgRecallRequestMsgSeqListInner> msgSeqList) {
    this.msgSeqList = msgSeqList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMsgRecallRequest groupMsgRecallRequest = (GroupMsgRecallRequest) o;
    return Objects.equals(this.groupId, groupMsgRecallRequest.groupId) &&
        Objects.equals(this.msgSeqList, groupMsgRecallRequest.msgSeqList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, msgSeqList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgRecallRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    msgSeqList: ").append(toIndentedString(msgSeqList)).append("\n");
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
    openapiFields.add("MsgSeqList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GroupId");
    openapiRequiredFields.add("MsgSeqList");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupMsgRecallRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupMsgRecallRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupMsgRecallRequest is not found in the empty JSON string", GroupMsgRecallRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupMsgRecallRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupMsgRecallRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupMsgRecallRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
      JsonArray jsonArraymsgSeqList = jsonObj.getAsJsonArray("MsgSeqList");
      if (jsonArraymsgSeqList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("MsgSeqList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `MsgSeqList` to be an array in the JSON string but got `%s`", jsonObj.get("MsgSeqList").toString()));
        }

        // validate the optional field `MsgSeqList` (array)
        for (int i = 0; i < jsonArraymsgSeqList.size(); i++) {
          GroupMsgRecallRequestMsgSeqListInner.validateJsonObject(jsonArraymsgSeqList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupMsgRecallRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupMsgRecallRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupMsgRecallRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupMsgRecallRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupMsgRecallRequest>() {
           @Override
           public void write(JsonWriter out, GroupMsgRecallRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupMsgRecallRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupMsgRecallRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupMsgRecallRequest
  * @throws IOException if the JSON string is invalid with respect to GroupMsgRecallRequest
  */
  public static GroupMsgRecallRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupMsgRecallRequest.class);
  }

 /**
  * Convert an instance of GroupMsgRecallRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

