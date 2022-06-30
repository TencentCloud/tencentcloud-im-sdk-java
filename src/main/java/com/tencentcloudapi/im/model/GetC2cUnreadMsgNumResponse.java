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
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponseAllOf;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponseAllOfErrorList;
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
 * GetC2cUnreadMsgNumResponse
 */

public class GetC2cUnreadMsgNumResponse {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTION_STATUS = "ActionStatus";
  @SerializedName(SERIALIZED_NAME_ACTION_STATUS)
  private String actionStatus;

  public static final String SERIALIZED_NAME_ERROR_INFO = "ErrorInfo";
  @SerializedName(SERIALIZED_NAME_ERROR_INFO)
  private String errorInfo;

  public static final String SERIALIZED_NAME_ERROR_CODE = "ErrorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public static final String SERIALIZED_NAME_ALL_C2_C_UNREAD_MSG_NUM = "AllC2CUnreadMsgNum";
  @SerializedName(SERIALIZED_NAME_ALL_C2_C_UNREAD_MSG_NUM)
  private Integer allC2CUnreadMsgNum;

  public static final String SERIALIZED_NAME_C2_C_UNREAD_MSG_NUM_LIST = "C2CUnreadMsgNumList";
  @SerializedName(SERIALIZED_NAME_C2_C_UNREAD_MSG_NUM_LIST)
  private List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> c2CUnreadMsgNumList = null;

  public static final String SERIALIZED_NAME_ERROR_LIST = "ErrorList";
  @SerializedName(SERIALIZED_NAME_ERROR_LIST)
  private List<GetC2cUnreadMsgNumResponseAllOfErrorList> errorList = null;

  public GetC2cUnreadMsgNumResponse() { 
  }

  public GetC2cUnreadMsgNumResponse actionStatus(String actionStatus) {
    
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


  public GetC2cUnreadMsgNumResponse errorInfo(String errorInfo) {
    
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


  public GetC2cUnreadMsgNumResponse errorCode(Integer errorCode) {
    
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


  public GetC2cUnreadMsgNumResponse allC2CUnreadMsgNum(Integer allC2CUnreadMsgNum) {
    
    this.allC2CUnreadMsgNum = allC2CUnreadMsgNum;
    return this;
  }

   /**
   * 单聊消息总未读数
   * @return allC2CUnreadMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单聊消息总未读数")

  public Integer getAllC2CUnreadMsgNum() {
    return allC2CUnreadMsgNum;
  }


  public void setAllC2CUnreadMsgNum(Integer allC2CUnreadMsgNum) {
    this.allC2CUnreadMsgNum = allC2CUnreadMsgNum;
  }


  public GetC2cUnreadMsgNumResponse c2CUnreadMsgNumList(List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> c2CUnreadMsgNumList) {
    
    this.c2CUnreadMsgNumList = c2CUnreadMsgNumList;
    return this;
  }

  public GetC2cUnreadMsgNumResponse addC2CUnreadMsgNumListItem(GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList c2CUnreadMsgNumListItem) {
    if (this.c2CUnreadMsgNumList == null) {
      this.c2CUnreadMsgNumList = new ArrayList<>();
    }
    this.c2CUnreadMsgNumList.add(c2CUnreadMsgNumListItem);
    return this;
  }

   /**
   * 单聊会话List
   * @return c2CUnreadMsgNumList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单聊会话List")

  public List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> getC2CUnreadMsgNumList() {
    return c2CUnreadMsgNumList;
  }


  public void setC2CUnreadMsgNumList(List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> c2CUnreadMsgNumList) {
    this.c2CUnreadMsgNumList = c2CUnreadMsgNumList;
  }


  public GetC2cUnreadMsgNumResponse errorList(List<GetC2cUnreadMsgNumResponseAllOfErrorList> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public GetC2cUnreadMsgNumResponse addErrorListItem(GetC2cUnreadMsgNumResponseAllOfErrorList errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * Get errorList
   * @return errorList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetC2cUnreadMsgNumResponseAllOfErrorList> getErrorList() {
    return errorList;
  }


  public void setErrorList(List<GetC2cUnreadMsgNumResponseAllOfErrorList> errorList) {
    this.errorList = errorList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetC2cUnreadMsgNumResponse getC2cUnreadMsgNumResponse = (GetC2cUnreadMsgNumResponse) o;
    return Objects.equals(this.actionStatus, getC2cUnreadMsgNumResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getC2cUnreadMsgNumResponse.errorInfo) &&
        Objects.equals(this.errorCode, getC2cUnreadMsgNumResponse.errorCode) &&
        Objects.equals(this.allC2CUnreadMsgNum, getC2cUnreadMsgNumResponse.allC2CUnreadMsgNum) &&
        Objects.equals(this.c2CUnreadMsgNumList, getC2cUnreadMsgNumResponse.c2CUnreadMsgNumList) &&
        Objects.equals(this.errorList, getC2cUnreadMsgNumResponse.errorList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, allC2CUnreadMsgNum, c2CUnreadMsgNumList, errorList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetC2cUnreadMsgNumResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    allC2CUnreadMsgNum: ").append(toIndentedString(allC2CUnreadMsgNum)).append("\n");
    sb.append("    c2CUnreadMsgNumList: ").append(toIndentedString(c2CUnreadMsgNumList)).append("\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
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
    openapiFields.add("AllC2CUnreadMsgNum");
    openapiFields.add("C2CUnreadMsgNumList");
    openapiFields.add("ErrorList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ErrorInfo");
    openapiRequiredFields.add("ErrorCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetC2cUnreadMsgNumResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetC2cUnreadMsgNumResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetC2cUnreadMsgNumResponse is not found in the empty JSON string", GetC2cUnreadMsgNumResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetC2cUnreadMsgNumResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetC2cUnreadMsgNumResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetC2cUnreadMsgNumResponse.openapiRequiredFields) {
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
      JsonArray jsonArrayc2CUnreadMsgNumList = jsonObj.getAsJsonArray("C2CUnreadMsgNumList");
      if (jsonArrayc2CUnreadMsgNumList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("C2CUnreadMsgNumList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `C2CUnreadMsgNumList` to be an array in the JSON string but got `%s`", jsonObj.get("C2CUnreadMsgNumList").toString()));
        }

        // validate the optional field `C2CUnreadMsgNumList` (array)
        for (int i = 0; i < jsonArrayc2CUnreadMsgNumList.size(); i++) {
          GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.validateJsonObject(jsonArrayc2CUnreadMsgNumList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayerrorList = jsonObj.getAsJsonArray("ErrorList");
      if (jsonArrayerrorList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ErrorList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ErrorList` to be an array in the JSON string but got `%s`", jsonObj.get("ErrorList").toString()));
        }

        // validate the optional field `ErrorList` (array)
        for (int i = 0; i < jsonArrayerrorList.size(); i++) {
          GetC2cUnreadMsgNumResponseAllOfErrorList.validateJsonObject(jsonArrayerrorList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetC2cUnreadMsgNumResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetC2cUnreadMsgNumResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetC2cUnreadMsgNumResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetC2cUnreadMsgNumResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetC2cUnreadMsgNumResponse>() {
           @Override
           public void write(JsonWriter out, GetC2cUnreadMsgNumResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetC2cUnreadMsgNumResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetC2cUnreadMsgNumResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetC2cUnreadMsgNumResponse
  * @throws IOException if the JSON string is invalid with respect to GetC2cUnreadMsgNumResponse
  */
  public static GetC2cUnreadMsgNumResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetC2cUnreadMsgNumResponse.class);
  }

 /**
  * Convert an instance of GetC2cUnreadMsgNumResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

