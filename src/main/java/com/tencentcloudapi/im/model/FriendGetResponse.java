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
import com.tencentcloudapi.im.model.FriendGetResponseAllOf;
import com.tencentcloudapi.im.model.FriendGetResponseAllOfUserDataItem;
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
 * FriendGetResponse
 */

public class FriendGetResponse {
  public static final String SERIALIZED_NAME_ACTION_STATUS = "ActionStatus";
  @SerializedName(SERIALIZED_NAME_ACTION_STATUS)
  private String actionStatus;

  public static final String SERIALIZED_NAME_ERROR_INFO = "ErrorInfo";
  @SerializedName(SERIALIZED_NAME_ERROR_INFO)
  private String errorInfo;

  public static final String SERIALIZED_NAME_ERROR_CODE = "ErrorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public static final String SERIALIZED_NAME_USER_DATA_ITEM = "UserDataItem";
  @SerializedName(SERIALIZED_NAME_USER_DATA_ITEM)
  private List<FriendGetResponseAllOfUserDataItem> userDataItem = null;

  public static final String SERIALIZED_NAME_STANDARD_SEQUENCE = "StandardSequence";
  @SerializedName(SERIALIZED_NAME_STANDARD_SEQUENCE)
  private Integer standardSequence;

  public static final String SERIALIZED_NAME_CUSTOM_SEQUENCE = "CustomSequence";
  @SerializedName(SERIALIZED_NAME_CUSTOM_SEQUENCE)
  private Integer customSequence;

  public static final String SERIALIZED_NAME_FRIEND_NUM = "FriendNum";
  @SerializedName(SERIALIZED_NAME_FRIEND_NUM)
  private Integer friendNum;

  public static final String SERIALIZED_NAME_COMPLETE_FLAG = "CompleteFlag";
  @SerializedName(SERIALIZED_NAME_COMPLETE_FLAG)
  private Integer completeFlag;

  public static final String SERIALIZED_NAME_NEXT_START_INDEX = "NextStartIndex";
  @SerializedName(SERIALIZED_NAME_NEXT_START_INDEX)
  private Integer nextStartIndex;

  public static final String SERIALIZED_NAME_ERROR_DISPLAY = "ErrorDisplay";
  @SerializedName(SERIALIZED_NAME_ERROR_DISPLAY)
  private String errorDisplay;

  public FriendGetResponse() { 
  }

  public FriendGetResponse actionStatus(String actionStatus) {
    
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


  public FriendGetResponse errorInfo(String errorInfo) {
    
    this.errorInfo = errorInfo;
    return this;
  }

   /**
   * 错误信息
   * @return errorInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "错误信息")

  public String getErrorInfo() {
    return errorInfo;
  }


  public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
  }


  public FriendGetResponse errorCode(Integer errorCode) {
    
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


  public FriendGetResponse userDataItem(List<FriendGetResponseAllOfUserDataItem> userDataItem) {
    
    this.userDataItem = userDataItem;
    return this;
  }

  public FriendGetResponse addUserDataItemItem(FriendGetResponseAllOfUserDataItem userDataItemItem) {
    if (this.userDataItem == null) {
      this.userDataItem = new ArrayList<>();
    }
    this.userDataItem.add(userDataItemItem);
    return this;
  }

   /**
   * Get userDataItem
   * @return userDataItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FriendGetResponseAllOfUserDataItem> getUserDataItem() {
    return userDataItem;
  }


  public void setUserDataItem(List<FriendGetResponseAllOfUserDataItem> userDataItem) {
    this.userDataItem = userDataItem;
  }


  public FriendGetResponse standardSequence(Integer standardSequence) {
    
    this.standardSequence = standardSequence;
    return this;
  }

   /**
   * 标配好友数据的 Sequence，客户端可以保存该 Sequence，下次请求时通过请求的 StandardSequence 字段返回给后台
   * @return standardSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标配好友数据的 Sequence，客户端可以保存该 Sequence，下次请求时通过请求的 StandardSequence 字段返回给后台")

  public Integer getStandardSequence() {
    return standardSequence;
  }


  public void setStandardSequence(Integer standardSequence) {
    this.standardSequence = standardSequence;
  }


  public FriendGetResponse customSequence(Integer customSequence) {
    
    this.customSequence = customSequence;
    return this;
  }

   /**
   * 自定义好友数据的 Sequence，客户端可以保存该 Sequence，下次请求时通过请求的 CustomSequence 字段返回给后台
   * @return customSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "自定义好友数据的 Sequence，客户端可以保存该 Sequence，下次请求时通过请求的 CustomSequence 字段返回给后台")

  public Integer getCustomSequence() {
    return customSequence;
  }


  public void setCustomSequence(Integer customSequence) {
    this.customSequence = customSequence;
  }


  public FriendGetResponse friendNum(Integer friendNum) {
    
    this.friendNum = friendNum;
    return this;
  }

   /**
   * 好友总数
   * @return friendNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "好友总数")

  public Integer getFriendNum() {
    return friendNum;
  }


  public void setFriendNum(Integer friendNum) {
    this.friendNum = friendNum;
  }


  public FriendGetResponse completeFlag(Integer completeFlag) {
    
    this.completeFlag = completeFlag;
    return this;
  }

   /**
   * 分页的结束标识，非0值表示已完成全量拉取
   * @return completeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分页的结束标识，非0值表示已完成全量拉取")

  public Integer getCompleteFlag() {
    return completeFlag;
  }


  public void setCompleteFlag(Integer completeFlag) {
    this.completeFlag = completeFlag;
  }


  public FriendGetResponse nextStartIndex(Integer nextStartIndex) {
    
    this.nextStartIndex = nextStartIndex;
    return this;
  }

   /**
   * 分页接口下一页的起始位置
   * @return nextStartIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分页接口下一页的起始位置")

  public Integer getNextStartIndex() {
    return nextStartIndex;
  }


  public void setNextStartIndex(Integer nextStartIndex) {
    this.nextStartIndex = nextStartIndex;
  }


  public FriendGetResponse errorDisplay(String errorDisplay) {
    
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
  public FriendGetResponse putAdditionalProperty(String key, Object value) {
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
    FriendGetResponse friendGetResponse = (FriendGetResponse) o;
    return Objects.equals(this.actionStatus, friendGetResponse.actionStatus) &&
        Objects.equals(this.errorInfo, friendGetResponse.errorInfo) &&
        Objects.equals(this.errorCode, friendGetResponse.errorCode) &&
        Objects.equals(this.userDataItem, friendGetResponse.userDataItem) &&
        Objects.equals(this.standardSequence, friendGetResponse.standardSequence) &&
        Objects.equals(this.customSequence, friendGetResponse.customSequence) &&
        Objects.equals(this.friendNum, friendGetResponse.friendNum) &&
        Objects.equals(this.completeFlag, friendGetResponse.completeFlag) &&
        Objects.equals(this.nextStartIndex, friendGetResponse.nextStartIndex) &&
        Objects.equals(this.errorDisplay, friendGetResponse.errorDisplay)&&
        Objects.equals(this.additionalProperties, friendGetResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, userDataItem, standardSequence, customSequence, friendNum, completeFlag, nextStartIndex, errorDisplay, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendGetResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    userDataItem: ").append(toIndentedString(userDataItem)).append("\n");
    sb.append("    standardSequence: ").append(toIndentedString(standardSequence)).append("\n");
    sb.append("    customSequence: ").append(toIndentedString(customSequence)).append("\n");
    sb.append("    friendNum: ").append(toIndentedString(friendNum)).append("\n");
    sb.append("    completeFlag: ").append(toIndentedString(completeFlag)).append("\n");
    sb.append("    nextStartIndex: ").append(toIndentedString(nextStartIndex)).append("\n");
    sb.append("    errorDisplay: ").append(toIndentedString(errorDisplay)).append("\n");
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
    openapiFields.add("ActionStatus");
    openapiFields.add("ErrorInfo");
    openapiFields.add("ErrorCode");
    openapiFields.add("UserDataItem");
    openapiFields.add("StandardSequence");
    openapiFields.add("CustomSequence");
    openapiFields.add("FriendNum");
    openapiFields.add("CompleteFlag");
    openapiFields.add("NextStartIndex");
    openapiFields.add("ErrorDisplay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ErrorCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FriendGetResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FriendGetResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FriendGetResponse is not found in the empty JSON string", FriendGetResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FriendGetResponse.openapiRequiredFields) {
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
      JsonArray jsonArrayuserDataItem = jsonObj.getAsJsonArray("UserDataItem");
      if (jsonArrayuserDataItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("UserDataItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `UserDataItem` to be an array in the JSON string but got `%s`", jsonObj.get("UserDataItem").toString()));
        }

        // validate the optional field `UserDataItem` (array)
        for (int i = 0; i < jsonArrayuserDataItem.size(); i++) {
          FriendGetResponseAllOfUserDataItem.validateJsonObject(jsonArrayuserDataItem.get(i).getAsJsonObject());
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
       if (!FriendGetResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FriendGetResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FriendGetResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FriendGetResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<FriendGetResponse>() {
           @Override
           public void write(JsonWriter out, FriendGetResponse value) throws IOException {
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
           public FriendGetResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FriendGetResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FriendGetResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FriendGetResponse
  * @throws IOException if the JSON string is invalid with respect to FriendGetResponse
  */
  public static FriendGetResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FriendGetResponse.class);
  }

 /**
  * Convert an instance of FriendGetResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

