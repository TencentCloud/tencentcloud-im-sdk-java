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
import com.tencentcloudapi.im.model.ImportGroupMsgRequestMsgListInner;
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
 * ImportGroupMsgRequest
 */

public class ImportGroupMsgRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_RECENT_CONTACT_FLAG = "RecentContactFlag";
  @SerializedName(SERIALIZED_NAME_RECENT_CONTACT_FLAG)
  private Integer recentContactFlag;

  public static final String SERIALIZED_NAME_MSG_LIST = "MsgList";
  @SerializedName(SERIALIZED_NAME_MSG_LIST)
  private List<ImportGroupMsgRequestMsgListInner> msgList = new ArrayList<>();

  public ImportGroupMsgRequest() { 
  }

  public ImportGroupMsgRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 要导入消息的群 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "要导入消息的群 ID")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ImportGroupMsgRequest recentContactFlag(Integer recentContactFlag) {
    
    this.recentContactFlag = recentContactFlag;
    return this;
  }

   /**
   * 会话更新识别，为1的时候标识触发会话更新，默认不触发（avchatroom 群不支持）。
   * @return recentContactFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会话更新识别，为1的时候标识触发会话更新，默认不触发（avchatroom 群不支持）。")

  public Integer getRecentContactFlag() {
    return recentContactFlag;
  }


  public void setRecentContactFlag(Integer recentContactFlag) {
    this.recentContactFlag = recentContactFlag;
  }


  public ImportGroupMsgRequest msgList(List<ImportGroupMsgRequestMsgListInner> msgList) {
    
    this.msgList = msgList;
    return this;
  }

  public ImportGroupMsgRequest addMsgListItem(ImportGroupMsgRequestMsgListInner msgListItem) {
    this.msgList.add(msgListItem);
    return this;
  }

   /**
   * 导入的消息列表
   * @return msgList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "导入的消息列表")

  public List<ImportGroupMsgRequestMsgListInner> getMsgList() {
    return msgList;
  }


  public void setMsgList(List<ImportGroupMsgRequestMsgListInner> msgList) {
    this.msgList = msgList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupMsgRequest importGroupMsgRequest = (ImportGroupMsgRequest) o;
    return Objects.equals(this.groupId, importGroupMsgRequest.groupId) &&
        Objects.equals(this.recentContactFlag, importGroupMsgRequest.recentContactFlag) &&
        Objects.equals(this.msgList, importGroupMsgRequest.msgList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, recentContactFlag, msgList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMsgRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    recentContactFlag: ").append(toIndentedString(recentContactFlag)).append("\n");
    sb.append("    msgList: ").append(toIndentedString(msgList)).append("\n");
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
    openapiFields.add("RecentContactFlag");
    openapiFields.add("MsgList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GroupId");
    openapiRequiredFields.add("MsgList");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportGroupMsgRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImportGroupMsgRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportGroupMsgRequest is not found in the empty JSON string", ImportGroupMsgRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImportGroupMsgRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportGroupMsgRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImportGroupMsgRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
      JsonArray jsonArraymsgList = jsonObj.getAsJsonArray("MsgList");
      if (jsonArraymsgList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("MsgList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `MsgList` to be an array in the JSON string but got `%s`", jsonObj.get("MsgList").toString()));
        }

        // validate the optional field `MsgList` (array)
        for (int i = 0; i < jsonArraymsgList.size(); i++) {
          ImportGroupMsgRequestMsgListInner.validateJsonObject(jsonArraymsgList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportGroupMsgRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportGroupMsgRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportGroupMsgRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportGroupMsgRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportGroupMsgRequest>() {
           @Override
           public void write(JsonWriter out, ImportGroupMsgRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportGroupMsgRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImportGroupMsgRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportGroupMsgRequest
  * @throws IOException if the JSON string is invalid with respect to ImportGroupMsgRequest
  */
  public static ImportGroupMsgRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportGroupMsgRequest.class);
  }

 /**
  * Convert an instance of ImportGroupMsgRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

