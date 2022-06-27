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
import com.tencentcloudapi.im.model.FriendImportRequestAddFriendItemInner;
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
 * FriendImportRequest
 */

public class FriendImportRequest {
  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_ADD_FRIEND_ITEM = "AddFriendItem";
  @SerializedName(SERIALIZED_NAME_ADD_FRIEND_ITEM)
  private List<FriendImportRequestAddFriendItemInner> addFriendItem = new ArrayList<>();

  public FriendImportRequest() { 
  }

  public FriendImportRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 需要为该 UserID 添加好友
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "需要为该 UserID 添加好友")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public FriendImportRequest addFriendItem(List<FriendImportRequestAddFriendItemInner> addFriendItem) {
    
    this.addFriendItem = addFriendItem;
    return this;
  }

  public FriendImportRequest addAddFriendItemItem(FriendImportRequestAddFriendItemInner addFriendItemItem) {
    this.addFriendItem.add(addFriendItemItem);
    return this;
  }

   /**
   * 好友结构体对象
   * @return addFriendItem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "好友结构体对象")

  public List<FriendImportRequestAddFriendItemInner> getAddFriendItem() {
    return addFriendItem;
  }


  public void setAddFriendItem(List<FriendImportRequestAddFriendItemInner> addFriendItem) {
    this.addFriendItem = addFriendItem;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendImportRequest friendImportRequest = (FriendImportRequest) o;
    return Objects.equals(this.fromAccount, friendImportRequest.fromAccount) &&
        Objects.equals(this.addFriendItem, friendImportRequest.addFriendItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, addFriendItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendImportRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    addFriendItem: ").append(toIndentedString(addFriendItem)).append("\n");
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
    openapiFields.add("AddFriendItem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("From_Account");
    openapiRequiredFields.add("AddFriendItem");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FriendImportRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FriendImportRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FriendImportRequest is not found in the empty JSON string", FriendImportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FriendImportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FriendImportRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FriendImportRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("From_Account") != null && !jsonObj.get("From_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From_Account").toString()));
      }
      JsonArray jsonArrayaddFriendItem = jsonObj.getAsJsonArray("AddFriendItem");
      if (jsonArrayaddFriendItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("AddFriendItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `AddFriendItem` to be an array in the JSON string but got `%s`", jsonObj.get("AddFriendItem").toString()));
        }

        // validate the optional field `AddFriendItem` (array)
        for (int i = 0; i < jsonArrayaddFriendItem.size(); i++) {
          FriendImportRequestAddFriendItemInner.validateJsonObject(jsonArrayaddFriendItem.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FriendImportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FriendImportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FriendImportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FriendImportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FriendImportRequest>() {
           @Override
           public void write(JsonWriter out, FriendImportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FriendImportRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FriendImportRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FriendImportRequest
  * @throws IOException if the JSON string is invalid with respect to FriendImportRequest
  */
  public static FriendImportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FriendImportRequest.class);
  }

 /**
  * Convert an instance of FriendImportRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

