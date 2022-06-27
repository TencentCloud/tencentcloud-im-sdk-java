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
 * GroupMsgGetSimpleRequest
 */

public class GroupMsgGetSimpleRequest {
  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_REQ_MSG_NUMBER = "ReqMsgNumber";
  @SerializedName(SERIALIZED_NAME_REQ_MSG_NUMBER)
  private Integer reqMsgNumber;

  public static final String SERIALIZED_NAME_REQ_MSG_SEQ = "ReqMsgSeq";
  @SerializedName(SERIALIZED_NAME_REQ_MSG_SEQ)
  private Integer reqMsgSeq;

  public static final String SERIALIZED_NAME_WITH_RECALLED_MSG = "WithRecalledMsg";
  @SerializedName(SERIALIZED_NAME_WITH_RECALLED_MSG)
  private Integer withRecalledMsg;

  public GroupMsgGetSimpleRequest() { 
  }

  public GroupMsgGetSimpleRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 要拉取历史消息的群组 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "要拉取历史消息的群组 ID")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public GroupMsgGetSimpleRequest reqMsgNumber(Integer reqMsgNumber) {
    
    this.reqMsgNumber = reqMsgNumber;
    return this;
  }

   /**
   * 拉取的历史消息的条数，目前一次请求最多返回20条历史消息，所以这里最好小于等于20
   * maximum: 20
   * @return reqMsgNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "拉取的历史消息的条数，目前一次请求最多返回20条历史消息，所以这里最好小于等于20")

  public Integer getReqMsgNumber() {
    return reqMsgNumber;
  }


  public void setReqMsgNumber(Integer reqMsgNumber) {
    this.reqMsgNumber = reqMsgNumber;
  }


  public GroupMsgGetSimpleRequest reqMsgSeq(Integer reqMsgSeq) {
    
    this.reqMsgSeq = reqMsgSeq;
    return this;
  }

   /**
   * 拉取消息的最大 seq
   * @return reqMsgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "拉取消息的最大 seq")

  public Integer getReqMsgSeq() {
    return reqMsgSeq;
  }


  public void setReqMsgSeq(Integer reqMsgSeq) {
    this.reqMsgSeq = reqMsgSeq;
  }


  public GroupMsgGetSimpleRequest withRecalledMsg(Integer withRecalledMsg) {
    
    this.withRecalledMsg = withRecalledMsg;
    return this;
  }

   /**
   * 是否带撤回的消息，填1表明需要拉取撤回后的消息；默认不拉取撤回后的消息
   * @return withRecalledMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否带撤回的消息，填1表明需要拉取撤回后的消息；默认不拉取撤回后的消息")

  public Integer getWithRecalledMsg() {
    return withRecalledMsg;
  }


  public void setWithRecalledMsg(Integer withRecalledMsg) {
    this.withRecalledMsg = withRecalledMsg;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMsgGetSimpleRequest groupMsgGetSimpleRequest = (GroupMsgGetSimpleRequest) o;
    return Objects.equals(this.groupId, groupMsgGetSimpleRequest.groupId) &&
        Objects.equals(this.reqMsgNumber, groupMsgGetSimpleRequest.reqMsgNumber) &&
        Objects.equals(this.reqMsgSeq, groupMsgGetSimpleRequest.reqMsgSeq) &&
        Objects.equals(this.withRecalledMsg, groupMsgGetSimpleRequest.withRecalledMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, reqMsgNumber, reqMsgSeq, withRecalledMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgGetSimpleRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    reqMsgNumber: ").append(toIndentedString(reqMsgNumber)).append("\n");
    sb.append("    reqMsgSeq: ").append(toIndentedString(reqMsgSeq)).append("\n");
    sb.append("    withRecalledMsg: ").append(toIndentedString(withRecalledMsg)).append("\n");
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
    openapiFields.add("ReqMsgNumber");
    openapiFields.add("ReqMsgSeq");
    openapiFields.add("WithRecalledMsg");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GroupId");
    openapiRequiredFields.add("ReqMsgNumber");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupMsgGetSimpleRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupMsgGetSimpleRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupMsgGetSimpleRequest is not found in the empty JSON string", GroupMsgGetSimpleRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupMsgGetSimpleRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupMsgGetSimpleRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupMsgGetSimpleRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupMsgGetSimpleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupMsgGetSimpleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupMsgGetSimpleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupMsgGetSimpleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupMsgGetSimpleRequest>() {
           @Override
           public void write(JsonWriter out, GroupMsgGetSimpleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupMsgGetSimpleRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupMsgGetSimpleRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupMsgGetSimpleRequest
  * @throws IOException if the JSON string is invalid with respect to GroupMsgGetSimpleRequest
  */
  public static GroupMsgGetSimpleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupMsgGetSimpleRequest.class);
  }

 /**
  * Convert an instance of GroupMsgGetSimpleRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

