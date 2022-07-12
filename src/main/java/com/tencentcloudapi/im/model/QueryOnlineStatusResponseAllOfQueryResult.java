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
import com.tencentcloudapi.im.model.QueryOnlineStatusResponseAllOfDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * QueryOnlineStatusResponseAllOfQueryResult
 */

public class QueryOnlineStatusResponseAllOfQueryResult {
  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_DETAIL = "Detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private QueryOnlineStatusResponseAllOfDetail detail;

  public QueryOnlineStatusResponseAllOfQueryResult() { 
  }

  public QueryOnlineStatusResponseAllOfQueryResult toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 返回的用户的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "返回的用户的 UserID")

  public String getToAccount() {
    return toAccount;
  }


  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public QueryOnlineStatusResponseAllOfQueryResult status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 返回的用户状态，目前支持的状态有： 前台运行状态（Online）：客户端登录后和即时通信 IM 后台有长连接 后台运行状态（PushOnline）：iOS 和 Android 进程被 kill 或因网络问题掉线，进入 PushOnline 状态，此时仍然可以接收消息的离线推送。客户端切到后台，但是进程未被手机操作系统 kill 掉时，此时状态仍是 Online 未登录状态（Offline）：客户端主动退出登录或者客户端自上一次登录起7天之内未登录过 如果用户是多终端登录，则只要有一个终端的状态是 Online ，该字段值就是 Online
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "返回的用户状态，目前支持的状态有： 前台运行状态（Online）：客户端登录后和即时通信 IM 后台有长连接 后台运行状态（PushOnline）：iOS 和 Android 进程被 kill 或因网络问题掉线，进入 PushOnline 状态，此时仍然可以接收消息的离线推送。客户端切到后台，但是进程未被手机操作系统 kill 掉时，此时状态仍是 Online 未登录状态（Offline）：客户端主动退出登录或者客户端自上一次登录起7天之内未登录过 如果用户是多终端登录，则只要有一个终端的状态是 Online ，该字段值就是 Online")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public QueryOnlineStatusResponseAllOfQueryResult detail(QueryOnlineStatusResponseAllOfDetail detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QueryOnlineStatusResponseAllOfDetail getDetail() {
    return detail;
  }


  public void setDetail(QueryOnlineStatusResponseAllOfDetail detail) {
    this.detail = detail;
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
  public QueryOnlineStatusResponseAllOfQueryResult putAdditionalProperty(String key, Object value) {
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
    QueryOnlineStatusResponseAllOfQueryResult queryOnlineStatusResponseAllOfQueryResult = (QueryOnlineStatusResponseAllOfQueryResult) o;
    return Objects.equals(this.toAccount, queryOnlineStatusResponseAllOfQueryResult.toAccount) &&
        Objects.equals(this.status, queryOnlineStatusResponseAllOfQueryResult.status) &&
        Objects.equals(this.detail, queryOnlineStatusResponseAllOfQueryResult.detail)&&
        Objects.equals(this.additionalProperties, queryOnlineStatusResponseAllOfQueryResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, status, detail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOnlineStatusResponseAllOfQueryResult {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
    openapiFields.add("To_Account");
    openapiFields.add("Status");
    openapiFields.add("Detail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("To_Account");
    openapiRequiredFields.add("Status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QueryOnlineStatusResponseAllOfQueryResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QueryOnlineStatusResponseAllOfQueryResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryOnlineStatusResponseAllOfQueryResult is not found in the empty JSON string", QueryOnlineStatusResponseAllOfQueryResult.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueryOnlineStatusResponseAllOfQueryResult.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
      // validate the optional field `Detail`
      if (jsonObj.getAsJsonObject("Detail") != null) {
        QueryOnlineStatusResponseAllOfDetail.validateJsonObject(jsonObj.getAsJsonObject("Detail"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryOnlineStatusResponseAllOfQueryResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryOnlineStatusResponseAllOfQueryResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryOnlineStatusResponseAllOfQueryResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryOnlineStatusResponseAllOfQueryResult.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryOnlineStatusResponseAllOfQueryResult>() {
           @Override
           public void write(JsonWriter out, QueryOnlineStatusResponseAllOfQueryResult value) throws IOException {
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
           public QueryOnlineStatusResponseAllOfQueryResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             QueryOnlineStatusResponseAllOfQueryResult instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of QueryOnlineStatusResponseAllOfQueryResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryOnlineStatusResponseAllOfQueryResult
  * @throws IOException if the JSON string is invalid with respect to QueryOnlineStatusResponseAllOfQueryResult
  */
  public static QueryOnlineStatusResponseAllOfQueryResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryOnlineStatusResponseAllOfQueryResult.class);
  }

 /**
  * Convert an instance of QueryOnlineStatusResponseAllOfQueryResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

