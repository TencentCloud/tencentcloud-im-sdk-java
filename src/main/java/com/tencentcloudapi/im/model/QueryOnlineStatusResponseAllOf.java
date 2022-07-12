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
 * QueryOnlineStatusResponseAllOf
 */

public class QueryOnlineStatusResponseAllOf {
  public static final String SERIALIZED_NAME_QUERY_RESULT = "QueryResult";
  @SerializedName(SERIALIZED_NAME_QUERY_RESULT)
  private List<QueryOnlineStatusResponseAllOfQueryResult> queryResult = null;

  public static final String SERIALIZED_NAME_ERROR_LIST = "ErrorList";
  @SerializedName(SERIALIZED_NAME_ERROR_LIST)
  private List<QueryOnlineStatusResponseAllOfErrorList> errorList = null;

  public QueryOnlineStatusResponseAllOf() { 
  }

  public QueryOnlineStatusResponseAllOf queryResult(List<QueryOnlineStatusResponseAllOfQueryResult> queryResult) {
    
    this.queryResult = queryResult;
    return this;
  }

  public QueryOnlineStatusResponseAllOf addQueryResultItem(QueryOnlineStatusResponseAllOfQueryResult queryResultItem) {
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


  public QueryOnlineStatusResponseAllOf errorList(List<QueryOnlineStatusResponseAllOfErrorList> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public QueryOnlineStatusResponseAllOf addErrorListItem(QueryOnlineStatusResponseAllOfErrorList errorListItem) {
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
  public QueryOnlineStatusResponseAllOf putAdditionalProperty(String key, Object value) {
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
    QueryOnlineStatusResponseAllOf queryOnlineStatusResponseAllOf = (QueryOnlineStatusResponseAllOf) o;
    return Objects.equals(this.queryResult, queryOnlineStatusResponseAllOf.queryResult) &&
        Objects.equals(this.errorList, queryOnlineStatusResponseAllOf.errorList)&&
        Objects.equals(this.additionalProperties, queryOnlineStatusResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryResult, errorList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOnlineStatusResponseAllOf {\n");
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
    openapiFields.add("QueryResult");
    openapiFields.add("ErrorList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QueryOnlineStatusResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QueryOnlineStatusResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryOnlineStatusResponseAllOf is not found in the empty JSON string", QueryOnlineStatusResponseAllOf.openapiRequiredFields.toString()));
        }
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
       if (!QueryOnlineStatusResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryOnlineStatusResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryOnlineStatusResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryOnlineStatusResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryOnlineStatusResponseAllOf>() {
           @Override
           public void write(JsonWriter out, QueryOnlineStatusResponseAllOf value) throws IOException {
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
           public QueryOnlineStatusResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             QueryOnlineStatusResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of QueryOnlineStatusResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryOnlineStatusResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to QueryOnlineStatusResponseAllOf
  */
  public static QueryOnlineStatusResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryOnlineStatusResponseAllOf.class);
  }

 /**
  * Convert an instance of QueryOnlineStatusResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

