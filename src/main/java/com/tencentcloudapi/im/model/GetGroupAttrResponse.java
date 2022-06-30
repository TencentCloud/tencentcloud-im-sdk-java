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
import com.tencentcloudapi.im.model.GetGroupAttrResponseAllOf;
import com.tencentcloudapi.im.model.GetGroupAttrResponseAllOfGroupAttrAry;
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
 * GetGroupAttrResponse
 */

public class GetGroupAttrResponse {
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

  public static final String SERIALIZED_NAME_GROUP_ATTR_ARY = "GroupAttrAry";
  @SerializedName(SERIALIZED_NAME_GROUP_ATTR_ARY)
  private List<GetGroupAttrResponseAllOfGroupAttrAry> groupAttrAry = null;

  public GetGroupAttrResponse() { 
  }

  public GetGroupAttrResponse actionStatus(String actionStatus) {
    
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


  public GetGroupAttrResponse errorInfo(String errorInfo) {
    
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


  public GetGroupAttrResponse errorCode(Integer errorCode) {
    
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


  public GetGroupAttrResponse groupAttrAry(List<GetGroupAttrResponseAllOfGroupAttrAry> groupAttrAry) {
    
    this.groupAttrAry = groupAttrAry;
    return this;
  }

  public GetGroupAttrResponse addGroupAttrAryItem(GetGroupAttrResponseAllOfGroupAttrAry groupAttrAryItem) {
    if (this.groupAttrAry == null) {
      this.groupAttrAry = new ArrayList<>();
    }
    this.groupAttrAry.add(groupAttrAryItem);
    return this;
  }

   /**
   * 自定义属性的键值对
   * @return groupAttrAry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "自定义属性的键值对")

  public List<GetGroupAttrResponseAllOfGroupAttrAry> getGroupAttrAry() {
    return groupAttrAry;
  }


  public void setGroupAttrAry(List<GetGroupAttrResponseAllOfGroupAttrAry> groupAttrAry) {
    this.groupAttrAry = groupAttrAry;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupAttrResponse getGroupAttrResponse = (GetGroupAttrResponse) o;
    return Objects.equals(this.actionStatus, getGroupAttrResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getGroupAttrResponse.errorInfo) &&
        Objects.equals(this.errorCode, getGroupAttrResponse.errorCode) &&
        Objects.equals(this.groupAttrAry, getGroupAttrResponse.groupAttrAry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, groupAttrAry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupAttrResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    groupAttrAry: ").append(toIndentedString(groupAttrAry)).append("\n");
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
    openapiFields.add("GroupAttrAry");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ErrorInfo");
    openapiRequiredFields.add("ErrorCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetGroupAttrResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetGroupAttrResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupAttrResponse is not found in the empty JSON string", GetGroupAttrResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetGroupAttrResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGroupAttrResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetGroupAttrResponse.openapiRequiredFields) {
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
      JsonArray jsonArraygroupAttrAry = jsonObj.getAsJsonArray("GroupAttrAry");
      if (jsonArraygroupAttrAry != null) {
        // ensure the json data is an array
        if (!jsonObj.get("GroupAttrAry").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `GroupAttrAry` to be an array in the JSON string but got `%s`", jsonObj.get("GroupAttrAry").toString()));
        }

        // validate the optional field `GroupAttrAry` (array)
        for (int i = 0; i < jsonArraygroupAttrAry.size(); i++) {
          GetGroupAttrResponseAllOfGroupAttrAry.validateJsonObject(jsonArraygroupAttrAry.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupAttrResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupAttrResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupAttrResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupAttrResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupAttrResponse>() {
           @Override
           public void write(JsonWriter out, GetGroupAttrResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGroupAttrResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGroupAttrResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGroupAttrResponse
  * @throws IOException if the JSON string is invalid with respect to GetGroupAttrResponse
  */
  public static GetGroupAttrResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupAttrResponse.class);
  }

 /**
  * Convert an instance of GetGroupAttrResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

