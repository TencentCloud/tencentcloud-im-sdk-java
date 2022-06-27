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
import com.tencentcloudapi.im.model.FriendGetListResponseAllOfInfoItem;
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
 * FriendGetListResponseAllOf
 */

public class FriendGetListResponseAllOf {
  public static final String SERIALIZED_NAME_INFO_ITEM = "InfoItem";
  @SerializedName(SERIALIZED_NAME_INFO_ITEM)
  private List<FriendGetListResponseAllOfInfoItem> infoItem = null;

  public static final String SERIALIZED_NAME_FAIL_ACCOUNT = "Fail_Account";
  @SerializedName(SERIALIZED_NAME_FAIL_ACCOUNT)
  private List<String> failAccount = null;

  public static final String SERIALIZED_NAME_ERROR_DISPLAY = "ErrorDisplay";
  @SerializedName(SERIALIZED_NAME_ERROR_DISPLAY)
  private String errorDisplay;

  public FriendGetListResponseAllOf() { 
  }

  public FriendGetListResponseAllOf infoItem(List<FriendGetListResponseAllOfInfoItem> infoItem) {
    
    this.infoItem = infoItem;
    return this;
  }

  public FriendGetListResponseAllOf addInfoItemItem(FriendGetListResponseAllOfInfoItem infoItemItem) {
    if (this.infoItem == null) {
      this.infoItem = new ArrayList<>();
    }
    this.infoItem.add(infoItemItem);
    return this;
  }

   /**
   * 好友对象数组，每一个好友对象都包含一个 To_Account 字段和一个 SnsProfileItem 数组
   * @return infoItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "好友对象数组，每一个好友对象都包含一个 To_Account 字段和一个 SnsProfileItem 数组")

  public List<FriendGetListResponseAllOfInfoItem> getInfoItem() {
    return infoItem;
  }


  public void setInfoItem(List<FriendGetListResponseAllOfInfoItem> infoItem) {
    this.infoItem = infoItem;
  }


  public FriendGetListResponseAllOf failAccount(List<String> failAccount) {
    
    this.failAccount = failAccount;
    return this;
  }

  public FriendGetListResponseAllOf addFailAccountItem(String failAccountItem) {
    if (this.failAccount == null) {
      this.failAccount = new ArrayList<>();
    }
    this.failAccount.add(failAccountItem);
    return this;
  }

   /**
   * 返回处理失败的 UserID 列表，仅当存在失败用户时才返回该字段
   * @return failAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回处理失败的 UserID 列表，仅当存在失败用户时才返回该字段")

  public List<String> getFailAccount() {
    return failAccount;
  }


  public void setFailAccount(List<String> failAccount) {
    this.failAccount = failAccount;
  }


  public FriendGetListResponseAllOf errorDisplay(String errorDisplay) {
    
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
    FriendGetListResponseAllOf friendGetListResponseAllOf = (FriendGetListResponseAllOf) o;
    return Objects.equals(this.infoItem, friendGetListResponseAllOf.infoItem) &&
        Objects.equals(this.failAccount, friendGetListResponseAllOf.failAccount) &&
        Objects.equals(this.errorDisplay, friendGetListResponseAllOf.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infoItem, failAccount, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendGetListResponseAllOf {\n");
    sb.append("    infoItem: ").append(toIndentedString(infoItem)).append("\n");
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
    openapiFields.add("InfoItem");
    openapiFields.add("Fail_Account");
    openapiFields.add("ErrorDisplay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FriendGetListResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FriendGetListResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FriendGetListResponseAllOf is not found in the empty JSON string", FriendGetListResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FriendGetListResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FriendGetListResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayinfoItem = jsonObj.getAsJsonArray("InfoItem");
      if (jsonArrayinfoItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("InfoItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `InfoItem` to be an array in the JSON string but got `%s`", jsonObj.get("InfoItem").toString()));
        }

        // validate the optional field `InfoItem` (array)
        for (int i = 0; i < jsonArrayinfoItem.size(); i++) {
          FriendGetListResponseAllOfInfoItem.validateJsonObject(jsonArrayinfoItem.get(i).getAsJsonObject());
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
       if (!FriendGetListResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FriendGetListResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FriendGetListResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FriendGetListResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<FriendGetListResponseAllOf>() {
           @Override
           public void write(JsonWriter out, FriendGetListResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FriendGetListResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FriendGetListResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FriendGetListResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to FriendGetListResponseAllOf
  */
  public static FriendGetListResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FriendGetListResponseAllOf.class);
  }

 /**
  * Convert an instance of FriendGetListResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

