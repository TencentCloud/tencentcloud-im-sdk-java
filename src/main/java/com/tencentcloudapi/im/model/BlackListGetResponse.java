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
import com.tencentcloudapi.im.model.BlackListGetResponseAllOf;
import com.tencentcloudapi.im.model.BlackListGetResponseAllOfBlackListItem;
import com.tencentcloudapi.im.model.CommonResponse;
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
 * BlackListGetResponse
 */

public class BlackListGetResponse {
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

  public static final String SERIALIZED_NAME_BLACK_LIST_ITEM = "BlackListItem";
  @SerializedName(SERIALIZED_NAME_BLACK_LIST_ITEM)
  private List<BlackListGetResponseAllOfBlackListItem> blackListItem = null;

  public static final String SERIALIZED_NAME_START_INDEX = "StartIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Integer startIndex;

  public static final String SERIALIZED_NAME_CURRUENT_SEQUENCE = "CurruentSequence";
  @SerializedName(SERIALIZED_NAME_CURRUENT_SEQUENCE)
  private Integer curruentSequence;

  public static final String SERIALIZED_NAME_ERROR_DISPLAY = "ErrorDisplay";
  @SerializedName(SERIALIZED_NAME_ERROR_DISPLAY)
  private String errorDisplay;

  public BlackListGetResponse() { 
  }

  public BlackListGetResponse actionStatus(String actionStatus) {
    
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


  public BlackListGetResponse errorInfo(String errorInfo) {
    
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


  public BlackListGetResponse errorCode(Integer errorCode) {
    
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


  public BlackListGetResponse blackListItem(List<BlackListGetResponseAllOfBlackListItem> blackListItem) {
    
    this.blackListItem = blackListItem;
    return this;
  }

  public BlackListGetResponse addBlackListItemItem(BlackListGetResponseAllOfBlackListItem blackListItemItem) {
    if (this.blackListItem == null) {
      this.blackListItem = new ArrayList<>();
    }
    this.blackListItem.add(blackListItemItem);
    return this;
  }

   /**
   * 黑名单对象数组，每一个黑名单对象都包括了 To_Account 和 AddBlackTimeStamp
   * @return blackListItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "黑名单对象数组，每一个黑名单对象都包括了 To_Account 和 AddBlackTimeStamp")

  public List<BlackListGetResponseAllOfBlackListItem> getBlackListItem() {
    return blackListItem;
  }


  public void setBlackListItem(List<BlackListGetResponseAllOfBlackListItem> blackListItem) {
    this.blackListItem = blackListItem;
  }


  public BlackListGetResponse startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * 下页拉取的起始位置，0表示已拉完
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "下页拉取的起始位置，0表示已拉完")

  public Integer getStartIndex() {
    return startIndex;
  }


  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public BlackListGetResponse curruentSequence(Integer curruentSequence) {
    
    this.curruentSequence = curruentSequence;
    return this;
  }

   /**
   * 黑名单最新的 Seq
   * @return curruentSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "黑名单最新的 Seq")

  public Integer getCurruentSequence() {
    return curruentSequence;
  }


  public void setCurruentSequence(Integer curruentSequence) {
    this.curruentSequence = curruentSequence;
  }


  public BlackListGetResponse errorDisplay(String errorDisplay) {
    
    this.errorDisplay = errorDisplay;
    return this;
  }

   /**
   * 详细的客户端展示信息
   * @return errorDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "详细的客户端展示信息")

  public String getErrorDisplay() {
    return errorDisplay;
  }


  public void setErrorDisplay(String errorDisplay) {
    this.errorDisplay = errorDisplay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlackListGetResponse blackListGetResponse = (BlackListGetResponse) o;
    return Objects.equals(this.actionStatus, blackListGetResponse.actionStatus) &&
        Objects.equals(this.errorInfo, blackListGetResponse.errorInfo) &&
        Objects.equals(this.errorCode, blackListGetResponse.errorCode) &&
        Objects.equals(this.blackListItem, blackListGetResponse.blackListItem) &&
        Objects.equals(this.startIndex, blackListGetResponse.startIndex) &&
        Objects.equals(this.curruentSequence, blackListGetResponse.curruentSequence) &&
        Objects.equals(this.errorDisplay, blackListGetResponse.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, blackListItem, startIndex, curruentSequence, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlackListGetResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    blackListItem: ").append(toIndentedString(blackListItem)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    curruentSequence: ").append(toIndentedString(curruentSequence)).append("\n");
    sb.append("    errorDisplay: ").append(toIndentedString(errorDisplay)).append("\n");
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
    openapiFields.add("BlackListItem");
    openapiFields.add("StartIndex");
    openapiFields.add("CurruentSequence");
    openapiFields.add("ErrorDisplay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ErrorInfo");
    openapiRequiredFields.add("ErrorCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BlackListGetResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BlackListGetResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlackListGetResponse is not found in the empty JSON string", BlackListGetResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BlackListGetResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlackListGetResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BlackListGetResponse.openapiRequiredFields) {
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
      JsonArray jsonArrayblackListItem = jsonObj.getAsJsonArray("BlackListItem");
      if (jsonArrayblackListItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("BlackListItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `BlackListItem` to be an array in the JSON string but got `%s`", jsonObj.get("BlackListItem").toString()));
        }

        // validate the optional field `BlackListItem` (array)
        for (int i = 0; i < jsonArrayblackListItem.size(); i++) {
          BlackListGetResponseAllOfBlackListItem.validateJsonObject(jsonArrayblackListItem.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("ErrorDisplay") != null && !jsonObj.get("ErrorDisplay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ErrorDisplay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ErrorDisplay").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlackListGetResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlackListGetResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlackListGetResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlackListGetResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<BlackListGetResponse>() {
           @Override
           public void write(JsonWriter out, BlackListGetResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlackListGetResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlackListGetResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlackListGetResponse
  * @throws IOException if the JSON string is invalid with respect to BlackListGetResponse
  */
  public static BlackListGetResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlackListGetResponse.class);
  }

 /**
  * Convert an instance of BlackListGetResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

