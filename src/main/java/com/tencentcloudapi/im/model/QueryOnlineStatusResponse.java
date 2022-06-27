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
import com.tencentcloudapi.im.model.QueryOnlineStatusResponseAllOf;
import com.tencentcloudapi.im.model.QueryOnlineStatusResponseAllOfErrorList;
import com.tencentcloudapi.im.model.QueryOnlineStatusResponseAllOfQueryResult;
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
 * QueryOnlineStatusResponse
 */

public class QueryOnlineStatusResponse {
  public static final String SERIALIZED_NAME_ACTION_STATUS = "ActionStatus";
  @SerializedName(SERIALIZED_NAME_ACTION_STATUS)
  private String actionStatus;

  public static final String SERIALIZED_NAME_ERROR_INFO = "ErrorInfo";
  @SerializedName(SERIALIZED_NAME_ERROR_INFO)
  private String errorInfo;

  public static final String SERIALIZED_NAME_ERROR_CODE = "ErrorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public static final String SERIALIZED_NAME_QUERY_RESULT = "QueryResult";
  @SerializedName(SERIALIZED_NAME_QUERY_RESULT)
  private List<QueryOnlineStatusResponseAllOfQueryResult> queryResult = null;

  public static final String SERIALIZED_NAME_ERROR_LIST = "ErrorList";
  @SerializedName(SERIALIZED_NAME_ERROR_LIST)
  private List<QueryOnlineStatusResponseAllOfErrorList> errorList = null;

  public QueryOnlineStatusResponse() { 
  }

  public QueryOnlineStatusResponse actionStatus(String actionStatus) {
    
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


  public QueryOnlineStatusResponse errorInfo(String errorInfo) {
    
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


  public QueryOnlineStatusResponse errorCode(Integer errorCode) {
    
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


  public QueryOnlineStatusResponse queryResult(List<QueryOnlineStatusResponseAllOfQueryResult> queryResult) {
    
    this.queryResult = queryResult;
    return this;
  }

  public QueryOnlineStatusResponse addQueryResultItem(QueryOnlineStatusResponseAllOfQueryResult queryResultItem) {
    if (this.queryResult == null) {
      this.queryResult = new ArrayList<>();
    }
    this.queryResult.add(queryResultItem);
    return this;
  }

   /**
   * 返回的用户在线状态结构化信息
   * @return queryResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回的用户在线状态结构化信息")

  public List<QueryOnlineStatusResponseAllOfQueryResult> getQueryResult() {
    return queryResult;
  }


  public void setQueryResult(List<QueryOnlineStatusResponseAllOfQueryResult> queryResult) {
    this.queryResult = queryResult;
  }


  public QueryOnlineStatusResponse errorList(List<QueryOnlineStatusResponseAllOfErrorList> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public QueryOnlineStatusResponse addErrorListItem(QueryOnlineStatusResponseAllOfErrorList errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * 状态查询失败的帐号列表，在此列表中的目标帐号，状态查询失败或目标帐号不存在。若状态全部查询成功，则 ErrorList 为空
   * @return errorList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "状态查询失败的帐号列表，在此列表中的目标帐号，状态查询失败或目标帐号不存在。若状态全部查询成功，则 ErrorList 为空")

  public List<QueryOnlineStatusResponseAllOfErrorList> getErrorList() {
    return errorList;
  }


  public void setErrorList(List<QueryOnlineStatusResponseAllOfErrorList> errorList) {
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
    QueryOnlineStatusResponse queryOnlineStatusResponse = (QueryOnlineStatusResponse) o;
    return Objects.equals(this.actionStatus, queryOnlineStatusResponse.actionStatus) &&
        Objects.equals(this.errorInfo, queryOnlineStatusResponse.errorInfo) &&
        Objects.equals(this.errorCode, queryOnlineStatusResponse.errorCode) &&
        Objects.equals(this.queryResult, queryOnlineStatusResponse.queryResult) &&
        Objects.equals(this.errorList, queryOnlineStatusResponse.errorList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, queryResult, errorList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOnlineStatusResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    queryResult: ").append(toIndentedString(queryResult)).append("\n");
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
    openapiFields.add("QueryResult");
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
  * @throws IOException if the JSON Object is invalid with respect to QueryOnlineStatusResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QueryOnlineStatusResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryOnlineStatusResponse is not found in the empty JSON string", QueryOnlineStatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!QueryOnlineStatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueryOnlineStatusResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueryOnlineStatusResponse.openapiRequiredFields) {
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
      JsonArray jsonArrayqueryResult = jsonObj.getAsJsonArray("QueryResult");
      if (jsonArrayqueryResult != null) {
        // ensure the json data is an array
        if (!jsonObj.get("QueryResult").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `QueryResult` to be an array in the JSON string but got `%s`", jsonObj.get("QueryResult").toString()));
        }

        // validate the optional field `QueryResult` (array)
        for (int i = 0; i < jsonArrayqueryResult.size(); i++) {
          QueryOnlineStatusResponseAllOfQueryResult.validateJsonObject(jsonArrayqueryResult.get(i).getAsJsonObject());
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
          QueryOnlineStatusResponseAllOfErrorList.validateJsonObject(jsonArrayerrorList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryOnlineStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryOnlineStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryOnlineStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryOnlineStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryOnlineStatusResponse>() {
           @Override
           public void write(JsonWriter out, QueryOnlineStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryOnlineStatusResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryOnlineStatusResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryOnlineStatusResponse
  * @throws IOException if the JSON string is invalid with respect to QueryOnlineStatusResponse
  */
  public static QueryOnlineStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryOnlineStatusResponse.class);
  }

 /**
  * Convert an instance of QueryOnlineStatusResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

