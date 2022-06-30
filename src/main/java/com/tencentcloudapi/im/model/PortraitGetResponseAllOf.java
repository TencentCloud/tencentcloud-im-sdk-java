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
import com.tencentcloudapi.im.model.PortraitGetResponseAllOfUserProfileItem;
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
 * PortraitGetResponseAllOf
 */

public class PortraitGetResponseAllOf {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_USER_PROFILE_ITEM = "UserProfileItem";
  @SerializedName(SERIALIZED_NAME_USER_PROFILE_ITEM)
  private List<PortraitGetResponseAllOfUserProfileItem> userProfileItem = null;

  public static final String SERIALIZED_NAME_FAIL_ACCOUNT = "Fail_Account";
  @SerializedName(SERIALIZED_NAME_FAIL_ACCOUNT)
  private List<String> failAccount = null;

  public static final String SERIALIZED_NAME_ERROR_DISPLAY = "ErrorDisplay";
  @SerializedName(SERIALIZED_NAME_ERROR_DISPLAY)
  private String errorDisplay;

  public PortraitGetResponseAllOf() { 
  }

  public PortraitGetResponseAllOf userProfileItem(List<PortraitGetResponseAllOfUserProfileItem> userProfileItem) {
    
    this.userProfileItem = userProfileItem;
    return this;
  }

  public PortraitGetResponseAllOf addUserProfileItemItem(PortraitGetResponseAllOfUserProfileItem userProfileItemItem) {
    if (this.userProfileItem == null) {
      this.userProfileItem = new ArrayList<>();
    }
    this.userProfileItem.add(userProfileItemItem);
    return this;
  }

   /**
   * 返回的用户资料结构化信息
   * @return userProfileItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回的用户资料结构化信息")

  public List<PortraitGetResponseAllOfUserProfileItem> getUserProfileItem() {
    return userProfileItem;
  }


  public void setUserProfileItem(List<PortraitGetResponseAllOfUserProfileItem> userProfileItem) {
    this.userProfileItem = userProfileItem;
  }


  public PortraitGetResponseAllOf failAccount(List<String> failAccount) {
    
    this.failAccount = failAccount;
    return this;
  }

  public PortraitGetResponseAllOf addFailAccountItem(String failAccountItem) {
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


  public PortraitGetResponseAllOf errorDisplay(String errorDisplay) {
    
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
    PortraitGetResponseAllOf portraitGetResponseAllOf = (PortraitGetResponseAllOf) o;
    return Objects.equals(this.userProfileItem, portraitGetResponseAllOf.userProfileItem) &&
        Objects.equals(this.failAccount, portraitGetResponseAllOf.failAccount) &&
        Objects.equals(this.errorDisplay, portraitGetResponseAllOf.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userProfileItem, failAccount, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortraitGetResponseAllOf {\n");
    sb.append("    userProfileItem: ").append(toIndentedString(userProfileItem)).append("\n");
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
    openapiFields.add("UserProfileItem");
    openapiFields.add("Fail_Account");
    openapiFields.add("ErrorDisplay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PortraitGetResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PortraitGetResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortraitGetResponseAllOf is not found in the empty JSON string", PortraitGetResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PortraitGetResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PortraitGetResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayuserProfileItem = jsonObj.getAsJsonArray("UserProfileItem");
      if (jsonArrayuserProfileItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("UserProfileItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `UserProfileItem` to be an array in the JSON string but got `%s`", jsonObj.get("UserProfileItem").toString()));
        }

        // validate the optional field `UserProfileItem` (array)
        for (int i = 0; i < jsonArrayuserProfileItem.size(); i++) {
          PortraitGetResponseAllOfUserProfileItem.validateJsonObject(jsonArrayuserProfileItem.get(i).getAsJsonObject());
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
       if (!PortraitGetResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortraitGetResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortraitGetResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortraitGetResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<PortraitGetResponseAllOf>() {
           @Override
           public void write(JsonWriter out, PortraitGetResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PortraitGetResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PortraitGetResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PortraitGetResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to PortraitGetResponseAllOf
  */
  public static PortraitGetResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortraitGetResponseAllOf.class);
  }

 /**
  * Convert an instance of PortraitGetResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

