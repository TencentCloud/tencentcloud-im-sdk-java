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
import com.tencentcloudapi.im.model.AccountDeleteRequestDeleteItemInner;
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
 * AccountDeleteRequest
 */

public class AccountDeleteRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DELETE_ITEM = "DeleteItem";
  @SerializedName(SERIALIZED_NAME_DELETE_ITEM)
  private List<AccountDeleteRequestDeleteItemInner> deleteItem = new ArrayList<>();

  public AccountDeleteRequest() { 
  }

  public AccountDeleteRequest deleteItem(List<AccountDeleteRequestDeleteItemInner> deleteItem) {
    
    this.deleteItem = deleteItem;
    return this;
  }

  public AccountDeleteRequest addDeleteItemItem(AccountDeleteRequestDeleteItemInner deleteItemItem) {
    this.deleteItem.add(deleteItemItem);
    return this;
  }

   /**
   * 请求删除的帐号对象数组，单次请求最多支持100个帐号
   * @return deleteItem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "请求删除的帐号对象数组，单次请求最多支持100个帐号")

  public List<AccountDeleteRequestDeleteItemInner> getDeleteItem() {
    return deleteItem;
  }


  public void setDeleteItem(List<AccountDeleteRequestDeleteItemInner> deleteItem) {
    this.deleteItem = deleteItem;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDeleteRequest accountDeleteRequest = (AccountDeleteRequest) o;
    return Objects.equals(this.deleteItem, accountDeleteRequest.deleteItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDeleteRequest {\n");
    sb.append("    deleteItem: ").append(toIndentedString(deleteItem)).append("\n");
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
    openapiFields.add("DeleteItem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("DeleteItem");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountDeleteRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AccountDeleteRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountDeleteRequest is not found in the empty JSON string", AccountDeleteRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccountDeleteRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountDeleteRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountDeleteRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArraydeleteItem = jsonObj.getAsJsonArray("DeleteItem");
      if (jsonArraydeleteItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("DeleteItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `DeleteItem` to be an array in the JSON string but got `%s`", jsonObj.get("DeleteItem").toString()));
        }

        // validate the optional field `DeleteItem` (array)
        for (int i = 0; i < jsonArraydeleteItem.size(); i++) {
          AccountDeleteRequestDeleteItemInner.validateJsonObject(jsonArraydeleteItem.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountDeleteRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountDeleteRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountDeleteRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountDeleteRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountDeleteRequest>() {
           @Override
           public void write(JsonWriter out, AccountDeleteRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountDeleteRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountDeleteRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountDeleteRequest
  * @throws IOException if the JSON string is invalid with respect to AccountDeleteRequest
  */
  public static AccountDeleteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountDeleteRequest.class);
  }

 /**
  * Convert an instance of AccountDeleteRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

