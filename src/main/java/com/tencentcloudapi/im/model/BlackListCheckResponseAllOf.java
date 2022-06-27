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
import com.tencentcloudapi.im.model.BlackListCheckResponseAllOfBlackListCheckItem;
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
 * BlackListCheckResponseAllOf
 */

public class BlackListCheckResponseAllOf {
  public static final String SERIALIZED_NAME_BLACK_LIST_CHECK_ITEM = "BlackListCheckItem";
  @SerializedName(SERIALIZED_NAME_BLACK_LIST_CHECK_ITEM)
  private List<BlackListCheckResponseAllOfBlackListCheckItem> blackListCheckItem = null;

  public static final String SERIALIZED_NAME_FAIL_ACCOUNT = "Fail_Account";
  @SerializedName(SERIALIZED_NAME_FAIL_ACCOUNT)
  private List<String> failAccount = null;

  public static final String SERIALIZED_NAME_ERROR_DISPLAY = "ErrorDisplay";
  @SerializedName(SERIALIZED_NAME_ERROR_DISPLAY)
  private String errorDisplay;

  public BlackListCheckResponseAllOf() { 
  }

  public BlackListCheckResponseAllOf blackListCheckItem(List<BlackListCheckResponseAllOfBlackListCheckItem> blackListCheckItem) {
    
    this.blackListCheckItem = blackListCheckItem;
    return this;
  }

  public BlackListCheckResponseAllOf addBlackListCheckItemItem(BlackListCheckResponseAllOfBlackListCheckItem blackListCheckItemItem) {
    if (this.blackListCheckItem == null) {
      this.blackListCheckItem = new ArrayList<>();
    }
    this.blackListCheckItem.add(blackListCheckItemItem);
    return this;
  }

   /**
   * 校验结果对象数组
   * @return blackListCheckItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "校验结果对象数组")

  public List<BlackListCheckResponseAllOfBlackListCheckItem> getBlackListCheckItem() {
    return blackListCheckItem;
  }


  public void setBlackListCheckItem(List<BlackListCheckResponseAllOfBlackListCheckItem> blackListCheckItem) {
    this.blackListCheckItem = blackListCheckItem;
  }


  public BlackListCheckResponseAllOf failAccount(List<String> failAccount) {
    
    this.failAccount = failAccount;
    return this;
  }

  public BlackListCheckResponseAllOf addFailAccountItem(String failAccountItem) {
    if (this.failAccount == null) {
      this.failAccount = new ArrayList<>();
    }
    this.failAccount.add(failAccountItem);
    return this;
  }

   /**
   * 返回处理失败的用户列表，仅当存在失败用户时才返回该字段
   * @return failAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回处理失败的用户列表，仅当存在失败用户时才返回该字段")

  public List<String> getFailAccount() {
    return failAccount;
  }


  public void setFailAccount(List<String> failAccount) {
    this.failAccount = failAccount;
  }


  public BlackListCheckResponseAllOf errorDisplay(String errorDisplay) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlackListCheckResponseAllOf blackListCheckResponseAllOf = (BlackListCheckResponseAllOf) o;
    return Objects.equals(this.blackListCheckItem, blackListCheckResponseAllOf.blackListCheckItem) &&
        Objects.equals(this.failAccount, blackListCheckResponseAllOf.failAccount) &&
        Objects.equals(this.errorDisplay, blackListCheckResponseAllOf.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blackListCheckItem, failAccount, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlackListCheckResponseAllOf {\n");
    sb.append("    blackListCheckItem: ").append(toIndentedString(blackListCheckItem)).append("\n");
    sb.append("    failAccount: ").append(toIndentedString(failAccount)).append("\n");
    sb.append("    errorDisplay: ").append(toIndentedString(errorDisplay)).append("\n");
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
    openapiFields.add("BlackListCheckItem");
    openapiFields.add("Fail_Account");
    openapiFields.add("ErrorDisplay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BlackListCheckResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BlackListCheckResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlackListCheckResponseAllOf is not found in the empty JSON string", BlackListCheckResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BlackListCheckResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlackListCheckResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayblackListCheckItem = jsonObj.getAsJsonArray("BlackListCheckItem");
      if (jsonArrayblackListCheckItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("BlackListCheckItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `BlackListCheckItem` to be an array in the JSON string but got `%s`", jsonObj.get("BlackListCheckItem").toString()));
        }

        // validate the optional field `BlackListCheckItem` (array)
        for (int i = 0; i < jsonArrayblackListCheckItem.size(); i++) {
          BlackListCheckResponseAllOfBlackListCheckItem.validateJsonObject(jsonArrayblackListCheckItem.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("Fail_Account") != null && !jsonObj.get("Fail_Account").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Fail_Account` to be an array in the JSON string but got `%s`", jsonObj.get("Fail_Account").toString()));
      }
      if (jsonObj.get("ErrorDisplay") != null && !jsonObj.get("ErrorDisplay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ErrorDisplay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ErrorDisplay").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlackListCheckResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlackListCheckResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlackListCheckResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlackListCheckResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<BlackListCheckResponseAllOf>() {
           @Override
           public void write(JsonWriter out, BlackListCheckResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlackListCheckResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlackListCheckResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlackListCheckResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to BlackListCheckResponseAllOf
  */
  public static BlackListCheckResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlackListCheckResponseAllOf.class);
  }

 /**
  * Convert an instance of BlackListCheckResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

