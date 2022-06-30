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
import com.tencentcloudapi.im.model.ImGetAttrResponseAllOf;
import com.tencentcloudapi.im.model.ImGetAttrResponseAllOfUserAttrs;
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
 * ImGetAttrResponse
 */

public class ImGetAttrResponse {
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

  public static final String SERIALIZED_NAME_USER_ATTRS = "UserAttrs";
  @SerializedName(SERIALIZED_NAME_USER_ATTRS)
  private List<ImGetAttrResponseAllOfUserAttrs> userAttrs = null;

  public ImGetAttrResponse() { 
  }

  public ImGetAttrResponse actionStatus(String actionStatus) {
    
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


  public ImGetAttrResponse errorInfo(String errorInfo) {
    
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


  public ImGetAttrResponse errorCode(Integer errorCode) {
    
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


  public ImGetAttrResponse userAttrs(List<ImGetAttrResponseAllOfUserAttrs> userAttrs) {
    
    this.userAttrs = userAttrs;
    return this;
  }

  public ImGetAttrResponse addUserAttrsItem(ImGetAttrResponseAllOfUserAttrs userAttrsItem) {
    if (this.userAttrs == null) {
      this.userAttrs = new ArrayList<>();
    }
    this.userAttrs.add(userAttrsItem);
    return this;
  }

   /**
   * Get userAttrs
   * @return userAttrs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ImGetAttrResponseAllOfUserAttrs> getUserAttrs() {
    return userAttrs;
  }


  public void setUserAttrs(List<ImGetAttrResponseAllOfUserAttrs> userAttrs) {
    this.userAttrs = userAttrs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImGetAttrResponse imGetAttrResponse = (ImGetAttrResponse) o;
    return Objects.equals(this.actionStatus, imGetAttrResponse.actionStatus) &&
        Objects.equals(this.errorInfo, imGetAttrResponse.errorInfo) &&
        Objects.equals(this.errorCode, imGetAttrResponse.errorCode) &&
        Objects.equals(this.userAttrs, imGetAttrResponse.userAttrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, userAttrs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImGetAttrResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    userAttrs: ").append(toIndentedString(userAttrs)).append("\n");
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
    openapiFields.add("UserAttrs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ErrorInfo");
    openapiRequiredFields.add("ErrorCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImGetAttrResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImGetAttrResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImGetAttrResponse is not found in the empty JSON string", ImGetAttrResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImGetAttrResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImGetAttrResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImGetAttrResponse.openapiRequiredFields) {
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
      JsonArray jsonArrayuserAttrs = jsonObj.getAsJsonArray("UserAttrs");
      if (jsonArrayuserAttrs != null) {
        // ensure the json data is an array
        if (!jsonObj.get("UserAttrs").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `UserAttrs` to be an array in the JSON string but got `%s`", jsonObj.get("UserAttrs").toString()));
        }

        // validate the optional field `UserAttrs` (array)
        for (int i = 0; i < jsonArrayuserAttrs.size(); i++) {
          ImGetAttrResponseAllOfUserAttrs.validateJsonObject(jsonArrayuserAttrs.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImGetAttrResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImGetAttrResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImGetAttrResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImGetAttrResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ImGetAttrResponse>() {
           @Override
           public void write(JsonWriter out, ImGetAttrResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImGetAttrResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImGetAttrResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImGetAttrResponse
  * @throws IOException if the JSON string is invalid with respect to ImGetAttrResponse
  */
  public static ImGetAttrResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImGetAttrResponse.class);
  }

 /**
  * Convert an instance of ImGetAttrResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

