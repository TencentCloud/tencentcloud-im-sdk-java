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
import com.tencentcloudapi.im.model.FriendCheckResponseAllOfInfoItem;
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
 * FriendCheckResponseAllOf
 */

public class FriendCheckResponseAllOf {
  public static final String SERIALIZED_NAME_INFO_ITEM = "InfoItem";
  @SerializedName(SERIALIZED_NAME_INFO_ITEM)
  private List<FriendCheckResponseAllOfInfoItem> infoItem = null;

  public static final String SERIALIZED_NAME_FAIL_ACCOUNT = "Fail_Account";
  @SerializedName(SERIALIZED_NAME_FAIL_ACCOUNT)
  private List<String> failAccount = null;

  public static final String SERIALIZED_NAME_ERROR_DISPLAY = "ErrorDisplay";
  @SerializedName(SERIALIZED_NAME_ERROR_DISPLAY)
  private String errorDisplay;

  public FriendCheckResponseAllOf() { 
  }

  public FriendCheckResponseAllOf infoItem(List<FriendCheckResponseAllOfInfoItem> infoItem) {
    
    this.infoItem = infoItem;
    return this;
  }

  public FriendCheckResponseAllOf addInfoItemItem(FriendCheckResponseAllOfInfoItem infoItemItem) {
    if (this.infoItem == null) {
      this.infoItem = new ArrayList<>();
    }
    this.infoItem.add(infoItemItem);
    return this;
  }

   /**
   * 校验结果对象数组
   * @return infoItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "校验结果对象数组")

  public List<FriendCheckResponseAllOfInfoItem> getInfoItem() {
    return infoItem;
  }


  public void setInfoItem(List<FriendCheckResponseAllOfInfoItem> infoItem) {
    this.infoItem = infoItem;
  }


  public FriendCheckResponseAllOf failAccount(List<String> failAccount) {
    
    this.failAccount = failAccount;
    return this;
  }

  public FriendCheckResponseAllOf addFailAccountItem(String failAccountItem) {
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


  public FriendCheckResponseAllOf errorDisplay(String errorDisplay) {
    
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
  public FriendCheckResponseAllOf putAdditionalProperty(String key, Object value) {
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
    FriendCheckResponseAllOf friendCheckResponseAllOf = (FriendCheckResponseAllOf) o;
    return Objects.equals(this.infoItem, friendCheckResponseAllOf.infoItem) &&
        Objects.equals(this.failAccount, friendCheckResponseAllOf.failAccount) &&
        Objects.equals(this.errorDisplay, friendCheckResponseAllOf.errorDisplay)&&
        Objects.equals(this.additionalProperties, friendCheckResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infoItem, failAccount, errorDisplay, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendCheckResponseAllOf {\n");
    sb.append("    infoItem: ").append(toIndentedString(infoItem)).append("\n");
    sb.append("    failAccount: ").append(toIndentedString(failAccount)).append("\n");
    sb.append("    errorDisplay: ").append(toIndentedString(errorDisplay)).append("\n");
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
  * @throws IOException if the JSON Object is invalid with respect to FriendCheckResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FriendCheckResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FriendCheckResponseAllOf is not found in the empty JSON string", FriendCheckResponseAllOf.openapiRequiredFields.toString()));
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
          FriendCheckResponseAllOfInfoItem.validateJsonObject(jsonArrayinfoItem.get(i).getAsJsonObject());
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
       if (!FriendCheckResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FriendCheckResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FriendCheckResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FriendCheckResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<FriendCheckResponseAllOf>() {
           @Override
           public void write(JsonWriter out, FriendCheckResponseAllOf value) throws IOException {
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
           public FriendCheckResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FriendCheckResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FriendCheckResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FriendCheckResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to FriendCheckResponseAllOf
  */
  public static FriendCheckResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FriendCheckResponseAllOf.class);
  }

 /**
  * Convert an instance of FriendCheckResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

