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
   * ????????????????????????OK ?????????????????????FAIL ????????????
   * @return actionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "????????????????????????OK ?????????????????????FAIL ????????????")

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
   * ????????????
   * @return errorInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "????????????")

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
   * ????????????0??????????????????0????????????
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "????????????0??????????????????0????????????")

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
   * ??????????????????????????????????????????
   * @return queryResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????????????????????????????")

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
   * ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????? ErrorList ??????
   * @return errorList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????? ErrorList ??????")

  public List<QueryOnlineStatusResponseAllOfErrorList> getErrorList() {
    return errorList;
  }


  public void setErrorList(List<QueryOnlineStatusResponseAllOfErrorList> errorList) {
    this.errorList = errorList;
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
  public QueryOnlineStatusResponse putAdditionalProperty(String key, Object value) {
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
    QueryOnlineStatusResponse queryOnlineStatusResponse = (QueryOnlineStatusResponse) o;
    return Objects.equals(this.actionStatus, queryOnlineStatusResponse.actionStatus) &&
        Objects.equals(this.errorInfo, queryOnlineStatusResponse.errorInfo) &&
        Objects.equals(this.errorCode, queryOnlineStatusResponse.errorCode) &&
        Objects.equals(this.queryResult, queryOnlineStatusResponse.queryResult) &&
        Objects.equals(this.errorList, queryOnlineStatusResponse.errorList)&&
        Objects.equals(this.additionalProperties, queryOnlineStatusResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, queryResult, errorList, additionalProperties);
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
    openapiFields.add("QueryResult");
    openapiFields.add("ErrorList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
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
           public QueryOnlineStatusResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             QueryOnlineStatusResponse instance = thisAdapter.fromJsonTree(jsonObj);
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

