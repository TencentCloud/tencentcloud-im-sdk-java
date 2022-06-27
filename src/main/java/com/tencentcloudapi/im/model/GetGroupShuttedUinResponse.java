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
import com.tencentcloudapi.im.model.GetGroupShuttedUinResponseAllOf;
import com.tencentcloudapi.im.model.GetGroupShuttedUinResponseAllOfShuttedUinList;
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
 * GetGroupShuttedUinResponse
 */

public class GetGroupShuttedUinResponse {
  public static final String SERIALIZED_NAME_ACTION_STATUS = "ActionStatus";
  @SerializedName(SERIALIZED_NAME_ACTION_STATUS)
  private String actionStatus;

  public static final String SERIALIZED_NAME_ERROR_INFO = "ErrorInfo";
  @SerializedName(SERIALIZED_NAME_ERROR_INFO)
  private String errorInfo;

  public static final String SERIALIZED_NAME_ERROR_CODE = "ErrorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public static final String SERIALIZED_NAME_SHUTTED_UIN_LIST = "ShuttedUinList";
  @SerializedName(SERIALIZED_NAME_SHUTTED_UIN_LIST)
  private List<GetGroupShuttedUinResponseAllOfShuttedUinList> shuttedUinList = null;

  public GetGroupShuttedUinResponse() { 
  }

  public GetGroupShuttedUinResponse actionStatus(String actionStatus) {
    
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


  public GetGroupShuttedUinResponse errorInfo(String errorInfo) {
    
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


  public GetGroupShuttedUinResponse errorCode(Integer errorCode) {
    
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


  public GetGroupShuttedUinResponse shuttedUinList(List<GetGroupShuttedUinResponseAllOfShuttedUinList> shuttedUinList) {
    
    this.shuttedUinList = shuttedUinList;
    return this;
  }

  public GetGroupShuttedUinResponse addShuttedUinListItem(GetGroupShuttedUinResponseAllOfShuttedUinList shuttedUinListItem) {
    if (this.shuttedUinList == null) {
      this.shuttedUinList = new ArrayList<>();
    }
    this.shuttedUinList.add(shuttedUinListItem);
    return this;
  }

   /**
   * 返回结果为禁言用户信息数组，内容包括被禁言的成员 ID，及其被禁言到的时间（使用 UTC 时间，即世界协调时间）
   * @return shuttedUinList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回结果为禁言用户信息数组，内容包括被禁言的成员 ID，及其被禁言到的时间（使用 UTC 时间，即世界协调时间）")

  public List<GetGroupShuttedUinResponseAllOfShuttedUinList> getShuttedUinList() {
    return shuttedUinList;
  }


  public void setShuttedUinList(List<GetGroupShuttedUinResponseAllOfShuttedUinList> shuttedUinList) {
    this.shuttedUinList = shuttedUinList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupShuttedUinResponse getGroupShuttedUinResponse = (GetGroupShuttedUinResponse) o;
    return Objects.equals(this.actionStatus, getGroupShuttedUinResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getGroupShuttedUinResponse.errorInfo) &&
        Objects.equals(this.errorCode, getGroupShuttedUinResponse.errorCode) &&
        Objects.equals(this.shuttedUinList, getGroupShuttedUinResponse.shuttedUinList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, shuttedUinList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupShuttedUinResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    shuttedUinList: ").append(toIndentedString(shuttedUinList)).append("\n");
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
    openapiFields.add("ShuttedUinList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ErrorInfo");
    openapiRequiredFields.add("ErrorCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetGroupShuttedUinResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetGroupShuttedUinResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupShuttedUinResponse is not found in the empty JSON string", GetGroupShuttedUinResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetGroupShuttedUinResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGroupShuttedUinResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetGroupShuttedUinResponse.openapiRequiredFields) {
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
      JsonArray jsonArrayshuttedUinList = jsonObj.getAsJsonArray("ShuttedUinList");
      if (jsonArrayshuttedUinList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ShuttedUinList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ShuttedUinList` to be an array in the JSON string but got `%s`", jsonObj.get("ShuttedUinList").toString()));
        }

        // validate the optional field `ShuttedUinList` (array)
        for (int i = 0; i < jsonArrayshuttedUinList.size(); i++) {
          GetGroupShuttedUinResponseAllOfShuttedUinList.validateJsonObject(jsonArrayshuttedUinList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupShuttedUinResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupShuttedUinResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupShuttedUinResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupShuttedUinResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupShuttedUinResponse>() {
           @Override
           public void write(JsonWriter out, GetGroupShuttedUinResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGroupShuttedUinResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGroupShuttedUinResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGroupShuttedUinResponse
  * @throws IOException if the JSON string is invalid with respect to GetGroupShuttedUinResponse
  */
  public static GetGroupShuttedUinResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupShuttedUinResponse.class);
  }

 /**
  * Convert an instance of GetGroupShuttedUinResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

