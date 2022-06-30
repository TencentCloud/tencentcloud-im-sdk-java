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
 * AccountDeleteRequestDeleteItemInner
 */

public class AccountDeleteRequestDeleteItemInner {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_USER_I_D = "UserID";
  @SerializedName(SERIALIZED_NAME_USER_I_D)
  private String userID;

  public AccountDeleteRequestDeleteItemInner() { 
  }

  public AccountDeleteRequestDeleteItemInner userID(String userID) {
    
    this.userID = userID;
    return this;
  }

   /**
   * 请求删除的帐号的 UserID
   * @return userID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "请求删除的帐号的 UserID")

  public String getUserID() {
    return userID;
  }


  public void setUserID(String userID) {
    this.userID = userID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDeleteRequestDeleteItemInner accountDeleteRequestDeleteItemInner = (AccountDeleteRequestDeleteItemInner) o;
    return Objects.equals(this.userID, accountDeleteRequestDeleteItemInner.userID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDeleteRequestDeleteItemInner {\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
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
    openapiFields.add("UserID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("UserID");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountDeleteRequestDeleteItemInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AccountDeleteRequestDeleteItemInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountDeleteRequestDeleteItemInner is not found in the empty JSON string", AccountDeleteRequestDeleteItemInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccountDeleteRequestDeleteItemInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountDeleteRequestDeleteItemInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountDeleteRequestDeleteItemInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("UserID") != null && !jsonObj.get("UserID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UserID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UserID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountDeleteRequestDeleteItemInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountDeleteRequestDeleteItemInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountDeleteRequestDeleteItemInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountDeleteRequestDeleteItemInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountDeleteRequestDeleteItemInner>() {
           @Override
           public void write(JsonWriter out, AccountDeleteRequestDeleteItemInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountDeleteRequestDeleteItemInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountDeleteRequestDeleteItemInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountDeleteRequestDeleteItemInner
  * @throws IOException if the JSON string is invalid with respect to AccountDeleteRequestDeleteItemInner
  */
  public static AccountDeleteRequestDeleteItemInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountDeleteRequestDeleteItemInner.class);
  }

 /**
  * Convert an instance of AccountDeleteRequestDeleteItemInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

