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
 * 详细的登录平台信息
 */
@ApiModel(description = "详细的登录平台信息")

public class QueryOnlineStatusResponseAllOfDetail {
  public static final String SERIALIZED_NAME_PLATFORM = "Platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public QueryOnlineStatusResponseAllOfDetail() { 
  }

  public QueryOnlineStatusResponseAllOfDetail platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * 登录的平台类型。可能的返回值有：\&quot;iPhone\&quot;, \&quot;Android\&quot;, \&quot;Web\&quot;, \&quot;PC\&quot;, \&quot;iPad\&quot;, \&quot;Mac\&quot;。
   * @return platform
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "登录的平台类型。可能的返回值有：\"iPhone\", \"Android\", \"Web\", \"PC\", \"iPad\", \"Mac\"。")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public QueryOnlineStatusResponseAllOfDetail status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 该登录平台的状态
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "该登录平台的状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryOnlineStatusResponseAllOfDetail queryOnlineStatusResponseAllOfDetail = (QueryOnlineStatusResponseAllOfDetail) o;
    return Objects.equals(this.platform, queryOnlineStatusResponseAllOfDetail.platform) &&
        Objects.equals(this.status, queryOnlineStatusResponseAllOfDetail.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOnlineStatusResponseAllOfDetail {\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("Platform");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Platform");
    openapiRequiredFields.add("Status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QueryOnlineStatusResponseAllOfDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QueryOnlineStatusResponseAllOfDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryOnlineStatusResponseAllOfDetail is not found in the empty JSON string", QueryOnlineStatusResponseAllOfDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!QueryOnlineStatusResponseAllOfDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueryOnlineStatusResponseAllOfDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueryOnlineStatusResponseAllOfDetail.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Platform") != null && !jsonObj.get("Platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Platform").toString()));
      }
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryOnlineStatusResponseAllOfDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryOnlineStatusResponseAllOfDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryOnlineStatusResponseAllOfDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryOnlineStatusResponseAllOfDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryOnlineStatusResponseAllOfDetail>() {
           @Override
           public void write(JsonWriter out, QueryOnlineStatusResponseAllOfDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryOnlineStatusResponseAllOfDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryOnlineStatusResponseAllOfDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryOnlineStatusResponseAllOfDetail
  * @throws IOException if the JSON string is invalid with respect to QueryOnlineStatusResponseAllOfDetail
  */
  public static QueryOnlineStatusResponseAllOfDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryOnlineStatusResponseAllOfDetail.class);
  }

 /**
  * Convert an instance of QueryOnlineStatusResponseAllOfDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

