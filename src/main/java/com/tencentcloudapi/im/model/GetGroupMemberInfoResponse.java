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
import com.tencentcloudapi.im.model.GetGroupMemberInfoResponseAllOf;
import com.tencentcloudapi.im.model.GetGroupMemberInfoResponseAllOfAppMemberDefinedData;
import com.tencentcloudapi.im.model.GetGroupMemberInfoResponseAllOfMemberList;
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
 * GetGroupMemberInfoResponse
 */

public class GetGroupMemberInfoResponse {
  public static final String SERIALIZED_NAME_ACTION_STATUS = "ActionStatus";
  @SerializedName(SERIALIZED_NAME_ACTION_STATUS)
  private String actionStatus;

  public static final String SERIALIZED_NAME_ERROR_INFO = "ErrorInfo";
  @SerializedName(SERIALIZED_NAME_ERROR_INFO)
  private String errorInfo;

  public static final String SERIALIZED_NAME_ERROR_CODE = "ErrorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public static final String SERIALIZED_NAME_MEMBER_NUM = "MemberNum";
  @SerializedName(SERIALIZED_NAME_MEMBER_NUM)
  private Integer memberNum;

  public static final String SERIALIZED_NAME_MEMBER_LIST = "MemberList";
  @SerializedName(SERIALIZED_NAME_MEMBER_LIST)
  private List<GetGroupMemberInfoResponseAllOfMemberList> memberList = null;

  public static final String SERIALIZED_NAME_APP_MEMBER_DEFINED_DATA = "AppMemberDefinedData";
  @SerializedName(SERIALIZED_NAME_APP_MEMBER_DEFINED_DATA)
  private List<GetGroupMemberInfoResponseAllOfAppMemberDefinedData> appMemberDefinedData = null;

  public static final String SERIALIZED_NAME_NEXT = "Next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public GetGroupMemberInfoResponse() { 
  }

  public GetGroupMemberInfoResponse actionStatus(String actionStatus) {
    
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


  public GetGroupMemberInfoResponse errorInfo(String errorInfo) {
    
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


  public GetGroupMemberInfoResponse errorCode(Integer errorCode) {
    
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


  public GetGroupMemberInfoResponse memberNum(Integer memberNum) {
    
    this.memberNum = memberNum;
    return this;
  }

   /**
   * 本群组的群成员总数
   * @return memberNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "本群组的群成员总数")

  public Integer getMemberNum() {
    return memberNum;
  }


  public void setMemberNum(Integer memberNum) {
    this.memberNum = memberNum;
  }


  public GetGroupMemberInfoResponse memberList(List<GetGroupMemberInfoResponseAllOfMemberList> memberList) {
    
    this.memberList = memberList;
    return this;
  }

  public GetGroupMemberInfoResponse addMemberListItem(GetGroupMemberInfoResponseAllOfMemberList memberListItem) {
    if (this.memberList == null) {
      this.memberList = new ArrayList<>();
    }
    this.memberList.add(memberListItem);
    return this;
  }

   /**
   * 获取到的群成员列表，其中包含了全部或者指定的群成员信息，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）
   * @return memberList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "获取到的群成员列表，其中包含了全部或者指定的群成员信息，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）")

  public List<GetGroupMemberInfoResponseAllOfMemberList> getMemberList() {
    return memberList;
  }


  public void setMemberList(List<GetGroupMemberInfoResponseAllOfMemberList> memberList) {
    this.memberList = memberList;
  }


  public GetGroupMemberInfoResponse appMemberDefinedData(List<GetGroupMemberInfoResponseAllOfAppMemberDefinedData> appMemberDefinedData) {
    
    this.appMemberDefinedData = appMemberDefinedData;
    return this;
  }

  public GetGroupMemberInfoResponse addAppMemberDefinedDataItem(GetGroupMemberInfoResponseAllOfAppMemberDefinedData appMemberDefinedDataItem) {
    if (this.appMemberDefinedData == null) {
      this.appMemberDefinedData = new ArrayList<>();
    }
    this.appMemberDefinedData.add(appMemberDefinedDataItem);
    return this;
  }

   /**
   * 返回的群成员自定义字段信息
   * @return appMemberDefinedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回的群成员自定义字段信息")

  public List<GetGroupMemberInfoResponseAllOfAppMemberDefinedData> getAppMemberDefinedData() {
    return appMemberDefinedData;
  }


  public void setAppMemberDefinedData(List<GetGroupMemberInfoResponseAllOfAppMemberDefinedData> appMemberDefinedData) {
    this.appMemberDefinedData = appMemberDefinedData;
  }


  public GetGroupMemberInfoResponse next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * 下一次请求应该传的 Next 值，仅查询 Community（社群）时会返回该字段
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "下一次请求应该传的 Next 值，仅查询 Community（社群）时会返回该字段")

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupMemberInfoResponse getGroupMemberInfoResponse = (GetGroupMemberInfoResponse) o;
    return Objects.equals(this.actionStatus, getGroupMemberInfoResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getGroupMemberInfoResponse.errorInfo) &&
        Objects.equals(this.errorCode, getGroupMemberInfoResponse.errorCode) &&
        Objects.equals(this.memberNum, getGroupMemberInfoResponse.memberNum) &&
        Objects.equals(this.memberList, getGroupMemberInfoResponse.memberList) &&
        Objects.equals(this.appMemberDefinedData, getGroupMemberInfoResponse.appMemberDefinedData) &&
        Objects.equals(this.next, getGroupMemberInfoResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, memberNum, memberList, appMemberDefinedData, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupMemberInfoResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    memberNum: ").append(toIndentedString(memberNum)).append("\n");
    sb.append("    memberList: ").append(toIndentedString(memberList)).append("\n");
    sb.append("    appMemberDefinedData: ").append(toIndentedString(appMemberDefinedData)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
    openapiFields.add("MemberNum");
    openapiFields.add("MemberList");
    openapiFields.add("AppMemberDefinedData");
    openapiFields.add("Next");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ErrorInfo");
    openapiRequiredFields.add("ErrorCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetGroupMemberInfoResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetGroupMemberInfoResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupMemberInfoResponse is not found in the empty JSON string", GetGroupMemberInfoResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetGroupMemberInfoResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGroupMemberInfoResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetGroupMemberInfoResponse.openapiRequiredFields) {
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
      JsonArray jsonArraymemberList = jsonObj.getAsJsonArray("MemberList");
      if (jsonArraymemberList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("MemberList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `MemberList` to be an array in the JSON string but got `%s`", jsonObj.get("MemberList").toString()));
        }

        // validate the optional field `MemberList` (array)
        for (int i = 0; i < jsonArraymemberList.size(); i++) {
          GetGroupMemberInfoResponseAllOfMemberList.validateJsonObject(jsonArraymemberList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayappMemberDefinedData = jsonObj.getAsJsonArray("AppMemberDefinedData");
      if (jsonArrayappMemberDefinedData != null) {
        // ensure the json data is an array
        if (!jsonObj.get("AppMemberDefinedData").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `AppMemberDefinedData` to be an array in the JSON string but got `%s`", jsonObj.get("AppMemberDefinedData").toString()));
        }

        // validate the optional field `AppMemberDefinedData` (array)
        for (int i = 0; i < jsonArrayappMemberDefinedData.size(); i++) {
          GetGroupMemberInfoResponseAllOfAppMemberDefinedData.validateJsonObject(jsonArrayappMemberDefinedData.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("Next") != null && !jsonObj.get("Next").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Next` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Next").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupMemberInfoResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupMemberInfoResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupMemberInfoResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupMemberInfoResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupMemberInfoResponse>() {
           @Override
           public void write(JsonWriter out, GetGroupMemberInfoResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGroupMemberInfoResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGroupMemberInfoResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGroupMemberInfoResponse
  * @throws IOException if the JSON string is invalid with respect to GetGroupMemberInfoResponse
  */
  public static GetGroupMemberInfoResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupMemberInfoResponse.class);
  }

 /**
  * Convert an instance of GetGroupMemberInfoResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

