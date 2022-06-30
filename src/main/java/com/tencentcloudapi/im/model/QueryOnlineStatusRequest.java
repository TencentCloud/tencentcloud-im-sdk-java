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
 * QueryOnlineStatusRequest
 */

public class QueryOnlineStatusRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private List<String> toAccount = new ArrayList<>();

  /**
   * 是否需要返回详细的登录平台信息。0表示不需要，1表示需要
   */
  @JsonAdapter(IsNeedDetailEnum.Adapter.class)
  public enum IsNeedDetailEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    IsNeedDetailEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsNeedDetailEnum fromValue(Integer value) {
      for (IsNeedDetailEnum b : IsNeedDetailEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IsNeedDetailEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsNeedDetailEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsNeedDetailEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return IsNeedDetailEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IS_NEED_DETAIL = "IsNeedDetail";
  @SerializedName(SERIALIZED_NAME_IS_NEED_DETAIL)
  private IsNeedDetailEnum isNeedDetail;

  public QueryOnlineStatusRequest() { 
  }

  public QueryOnlineStatusRequest toAccount(List<String> toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

  public QueryOnlineStatusRequest addToAccountItem(String toAccountItem) {
    this.toAccount.add(toAccountItem);
    return this;
  }

   /**
   * 需要查询这些 UserID 的登录状态，一次最多查询500个 UserID 的状态
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "需要查询这些 UserID 的登录状态，一次最多查询500个 UserID 的状态")

  public List<String> getToAccount() {
    return toAccount;
  }


  public void setToAccount(List<String> toAccount) {
    this.toAccount = toAccount;
  }


  public QueryOnlineStatusRequest isNeedDetail(IsNeedDetailEnum isNeedDetail) {
    
    this.isNeedDetail = isNeedDetail;
    return this;
  }

   /**
   * 是否需要返回详细的登录平台信息。0表示不需要，1表示需要
   * @return isNeedDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否需要返回详细的登录平台信息。0表示不需要，1表示需要")

  public IsNeedDetailEnum getIsNeedDetail() {
    return isNeedDetail;
  }


  public void setIsNeedDetail(IsNeedDetailEnum isNeedDetail) {
    this.isNeedDetail = isNeedDetail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryOnlineStatusRequest queryOnlineStatusRequest = (QueryOnlineStatusRequest) o;
    return Objects.equals(this.toAccount, queryOnlineStatusRequest.toAccount) &&
        Objects.equals(this.isNeedDetail, queryOnlineStatusRequest.isNeedDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, isNeedDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOnlineStatusRequest {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    isNeedDetail: ").append(toIndentedString(isNeedDetail)).append("\n");
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
    openapiFields.add("IsNeedDetail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("To_Account");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QueryOnlineStatusRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QueryOnlineStatusRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryOnlineStatusRequest is not found in the empty JSON string", QueryOnlineStatusRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!QueryOnlineStatusRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueryOnlineStatusRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueryOnlineStatusRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be an array in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryOnlineStatusRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryOnlineStatusRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryOnlineStatusRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryOnlineStatusRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryOnlineStatusRequest>() {
           @Override
           public void write(JsonWriter out, QueryOnlineStatusRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryOnlineStatusRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryOnlineStatusRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryOnlineStatusRequest
  * @throws IOException if the JSON string is invalid with respect to QueryOnlineStatusRequest
  */
  public static QueryOnlineStatusRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryOnlineStatusRequest.class);
  }

 /**
  * Convert an instance of QueryOnlineStatusRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

