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
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.GroupMsgGetSimpleResponseAllOf;
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
 * GroupMsgGetSimpleResponse
 */

public class GroupMsgGetSimpleResponse {
  public static final String SERIALIZED_NAME_ACTION_STATUS = "ActionStatus";
  @SerializedName(SERIALIZED_NAME_ACTION_STATUS)
  private String actionStatus;

  public static final String SERIALIZED_NAME_ERROR_INFO = "ErrorInfo";
  @SerializedName(SERIALIZED_NAME_ERROR_INFO)
  private String errorInfo;

  public static final String SERIALIZED_NAME_ERROR_CODE = "ErrorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_IS_FINISHED = "IsFinished";
  @SerializedName(SERIALIZED_NAME_IS_FINISHED)
  private Integer isFinished;

  public static final String SERIALIZED_NAME_RSP_MSG_LIST = "RspMsgList";
  @SerializedName(SERIALIZED_NAME_RSP_MSG_LIST)
  private List<GroupMsgGetSimpleResponseAllOfRspMsgList> rspMsgList = null;

  public GroupMsgGetSimpleResponse() { 
  }

  public GroupMsgGetSimpleResponse actionStatus(String actionStatus) {
    
    this.actionStatus = actionStatus;
    return this;
  }

   /**
   * 请求处理的结果，OK 表示处理成功，FAIL 表示失败
   * @return actionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求处理的结果，OK 表示处理成功，FAIL 表示失败")

  public String getActionStatus() {
    return actionStatus;
  }


  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }


  public GroupMsgGetSimpleResponse errorInfo(String errorInfo) {
    
    this.errorInfo = errorInfo;
    return this;
  }

   /**
   * 错误信息
   * @return errorInfo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误信息")

  public String getErrorInfo() {
    return errorInfo;
  }


  public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
  }


  public GroupMsgGetSimpleResponse errorCode(Integer errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 错误码，0表示成功，非0表示失败
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误码，0表示成功，非0表示失败")

  public Integer getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  public GroupMsgGetSimpleResponse groupId(String groupId) {
    
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


  public GroupMsgGetSimpleResponse isFinished(Integer isFinished) {
    
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


  public GroupMsgGetSimpleResponse rspMsgList(List<GroupMsgGetSimpleResponseAllOfRspMsgList> rspMsgList) {
    
    this.rspMsgList = rspMsgList;
    return this;
  }

  public GroupMsgGetSimpleResponse addRspMsgListItem(GroupMsgGetSimpleResponseAllOfRspMsgList rspMsgListItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMsgGetSimpleResponse groupMsgGetSimpleResponse = (GroupMsgGetSimpleResponse) o;
    return Objects.equals(this.actionStatus, groupMsgGetSimpleResponse.actionStatus) &&
        Objects.equals(this.errorInfo, groupMsgGetSimpleResponse.errorInfo) &&
        Objects.equals(this.errorCode, groupMsgGetSimpleResponse.errorCode) &&
        Objects.equals(this.groupId, groupMsgGetSimpleResponse.groupId) &&
        Objects.equals(this.isFinished, groupMsgGetSimpleResponse.isFinished) &&
        Objects.equals(this.rspMsgList, groupMsgGetSimpleResponse.rspMsgList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, groupId, isFinished, rspMsgList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgGetSimpleResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    isFinished: ").append(toIndentedString(isFinished)).append("\n");
    sb.append("    rspMsgList: ").append(toIndentedString(rspMsgList)).append("\n");
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
    openapiFields.add("ActionStatus");
    openapiFields.add("ErrorInfo");
    openapiFields.add("ErrorCode");
    openapiFields.add("GroupId");
    openapiFields.add("IsFinished");
    openapiFields.add("RspMsgList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ErrorInfo");
    openapiRequiredFields.add("ErrorCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupMsgGetSimpleResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupMsgGetSimpleResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupMsgGetSimpleResponse is not found in the empty JSON string", GroupMsgGetSimpleResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupMsgGetSimpleResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupMsgGetSimpleResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupMsgGetSimpleResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("ActionStatus") != null && !jsonObj.get("ActionStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ActionStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ActionStatus").toString()));
      }
      if (jsonObj.get("ErrorInfo") != null && !jsonObj.get("ErrorInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ErrorInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ErrorInfo").toString()));
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
       if (!GroupMsgGetSimpleResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupMsgGetSimpleResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupMsgGetSimpleResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupMsgGetSimpleResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupMsgGetSimpleResponse>() {
           @Override
           public void write(JsonWriter out, GroupMsgGetSimpleResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupMsgGetSimpleResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupMsgGetSimpleResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupMsgGetSimpleResponse
  * @throws IOException if the JSON string is invalid with respect to GroupMsgGetSimpleResponse
  */
  public static GroupMsgGetSimpleResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupMsgGetSimpleResponse.class);
  }

 /**
  * Convert an instance of GroupMsgGetSimpleResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

