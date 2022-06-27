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
 * BlackListCheckRequest
 */

public class BlackListCheckRequest {
  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private List<String> toAccount = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHECK_TYPE = "CheckType";
  @SerializedName(SERIALIZED_NAME_CHECK_TYPE)
  private String checkType;

  public BlackListCheckRequest() { 
  }

  public BlackListCheckRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 需要校验该 UserID 的黑名单
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "需要校验该 UserID 的黑名单")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public BlackListCheckRequest toAccount(List<String> toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

  public BlackListCheckRequest addToAccountItem(String toAccountItem) {
    this.toAccount.add(toAccountItem);
    return this;
  }

   /**
   * 待校验的黑名单的 UserID 列表，单次请求的 To_Account 数不得超过1000
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "待校验的黑名单的 UserID 列表，单次请求的 To_Account 数不得超过1000")

  public List<String> getToAccount() {
    return toAccount;
  }


  public void setToAccount(List<String> toAccount) {
    this.toAccount = toAccount;
  }


  public BlackListCheckRequest checkType(String checkType) {
    
    this.checkType = checkType;
    return this;
  }

   /**
   * 校验模式，详情可参见 校验黑名单（校验黑名单）
   * @return checkType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "校验模式，详情可参见 校验黑名单（校验黑名单）")

  public String getCheckType() {
    return checkType;
  }


  public void setCheckType(String checkType) {
    this.checkType = checkType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlackListCheckRequest blackListCheckRequest = (BlackListCheckRequest) o;
    return Objects.equals(this.fromAccount, blackListCheckRequest.fromAccount) &&
        Objects.equals(this.toAccount, blackListCheckRequest.toAccount) &&
        Objects.equals(this.checkType, blackListCheckRequest.checkType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, toAccount, checkType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlackListCheckRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
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
    openapiFields.add("From_Account");
    openapiFields.add("To_Account");
    openapiFields.add("CheckType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("From_Account");
    openapiRequiredFields.add("To_Account");
    openapiRequiredFields.add("CheckType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BlackListCheckRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BlackListCheckRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlackListCheckRequest is not found in the empty JSON string", BlackListCheckRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BlackListCheckRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlackListCheckRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BlackListCheckRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("From_Account") != null && !jsonObj.get("From_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From_Account").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be an array in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
      if (jsonObj.get("CheckType") != null && !jsonObj.get("CheckType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CheckType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CheckType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlackListCheckRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlackListCheckRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlackListCheckRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlackListCheckRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BlackListCheckRequest>() {
           @Override
           public void write(JsonWriter out, BlackListCheckRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlackListCheckRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlackListCheckRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlackListCheckRequest
  * @throws IOException if the JSON string is invalid with respect to BlackListCheckRequest
  */
  public static BlackListCheckRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlackListCheckRequest.class);
  }

 /**
  * Convert an instance of BlackListCheckRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

