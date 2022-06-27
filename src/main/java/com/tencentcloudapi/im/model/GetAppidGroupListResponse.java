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
import com.tencentcloudapi.im.model.GetAppidGroupListResponseAllOf;
import com.tencentcloudapi.im.model.GetAppidGroupListResponseAllOfGroupIdList;
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
 * GetAppidGroupListResponse
 */

public class GetAppidGroupListResponse {
  public static final String SERIALIZED_NAME_ACTION_STATUS = "ActionStatus";
  @SerializedName(SERIALIZED_NAME_ACTION_STATUS)
  private String actionStatus;

  public static final String SERIALIZED_NAME_ERROR_INFO = "ErrorInfo";
  @SerializedName(SERIALIZED_NAME_ERROR_INFO)
  private String errorInfo;

  public static final String SERIALIZED_NAME_ERROR_CODE = "ErrorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "TotalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_GROUP_ID_LIST = "GroupIdList";
  @SerializedName(SERIALIZED_NAME_GROUP_ID_LIST)
  private List<GetAppidGroupListResponseAllOfGroupIdList> groupIdList = null;

  public static final String SERIALIZED_NAME_NEXT = "Next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private Integer next;

  public GetAppidGroupListResponse() { 
  }

  public GetAppidGroupListResponse actionStatus(String actionStatus) {
    
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


  public GetAppidGroupListResponse errorInfo(String errorInfo) {
    
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


  public GetAppidGroupListResponse errorCode(Integer errorCode) {
    
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


  public GetAppidGroupListResponse totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * App 当前的群组总数。如果仅需要返回特定群组形态的群组，可以通过 GroupType 进行过滤，但此时返回的 TotalCount 的含义就变成了 App 中该群组形态的群组总数；例如：假设 App 旗下总共 50000 个群组，其中有 20000 个为公开群组，如果将请求包体中的 GroupType 设置为 Public，那么不论 Limit 和 Offset 怎样设置，应答包体中的 TotalCount 都为 20000，且 GroupIdList 中的群组全部为公开群组
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "App 当前的群组总数。如果仅需要返回特定群组形态的群组，可以通过 GroupType 进行过滤，但此时返回的 TotalCount 的含义就变成了 App 中该群组形态的群组总数；例如：假设 App 旗下总共 50000 个群组，其中有 20000 个为公开群组，如果将请求包体中的 GroupType 设置为 Public，那么不论 Limit 和 Offset 怎样设置，应答包体中的 TotalCount 都为 20000，且 GroupIdList 中的群组全部为公开群组")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public GetAppidGroupListResponse groupIdList(List<GetAppidGroupListResponseAllOfGroupIdList> groupIdList) {
    
    this.groupIdList = groupIdList;
    return this;
  }

  public GetAppidGroupListResponse addGroupIdListItem(GetAppidGroupListResponseAllOfGroupIdList groupIdListItem) {
    if (this.groupIdList == null) {
      this.groupIdList = new ArrayList<>();
    }
    this.groupIdList.add(groupIdListItem);
    return this;
  }

   /**
   * 获取到的群组 ID 的集合
   * @return groupIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "获取到的群组 ID 的集合")

  public List<GetAppidGroupListResponseAllOfGroupIdList> getGroupIdList() {
    return groupIdList;
  }


  public void setGroupIdList(List<GetAppidGroupListResponseAllOfGroupIdList> groupIdList) {
    this.groupIdList = groupIdList;
  }


  public GetAppidGroupListResponse next(Integer next) {
    
    this.next = next;
    return this;
  }

   /**
   * 分页拉取的标志
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分页拉取的标志")

  public Integer getNext() {
    return next;
  }


  public void setNext(Integer next) {
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
    GetAppidGroupListResponse getAppidGroupListResponse = (GetAppidGroupListResponse) o;
    return Objects.equals(this.actionStatus, getAppidGroupListResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getAppidGroupListResponse.errorInfo) &&
        Objects.equals(this.errorCode, getAppidGroupListResponse.errorCode) &&
        Objects.equals(this.totalCount, getAppidGroupListResponse.totalCount) &&
        Objects.equals(this.groupIdList, getAppidGroupListResponse.groupIdList) &&
        Objects.equals(this.next, getAppidGroupListResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, totalCount, groupIdList, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAppidGroupListResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    groupIdList: ").append(toIndentedString(groupIdList)).append("\n");
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
    openapiFields.add("TotalCount");
    openapiFields.add("GroupIdList");
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
  * @throws IOException if the JSON Object is invalid with respect to GetAppidGroupListResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetAppidGroupListResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAppidGroupListResponse is not found in the empty JSON string", GetAppidGroupListResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetAppidGroupListResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAppidGroupListResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetAppidGroupListResponse.openapiRequiredFields) {
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
      JsonArray jsonArraygroupIdList = jsonObj.getAsJsonArray("GroupIdList");
      if (jsonArraygroupIdList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("GroupIdList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `GroupIdList` to be an array in the JSON string but got `%s`", jsonObj.get("GroupIdList").toString()));
        }

        // validate the optional field `GroupIdList` (array)
        for (int i = 0; i < jsonArraygroupIdList.size(); i++) {
          GetAppidGroupListResponseAllOfGroupIdList.validateJsonObject(jsonArraygroupIdList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAppidGroupListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAppidGroupListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAppidGroupListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAppidGroupListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAppidGroupListResponse>() {
           @Override
           public void write(JsonWriter out, GetAppidGroupListResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAppidGroupListResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAppidGroupListResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAppidGroupListResponse
  * @throws IOException if the JSON string is invalid with respect to GetAppidGroupListResponse
  */
  public static GetAppidGroupListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAppidGroupListResponse.class);
  }

 /**
  * Convert an instance of GetAppidGroupListResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

