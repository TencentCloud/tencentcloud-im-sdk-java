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
import com.tencentcloudapi.im.model.FriendUpdateRequestUpdateItemInner;
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
 * FriendUpdateRequest
 */

public class FriendUpdateRequest {
  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_UPDATE_ITEM = "UpdateItem";
  @SerializedName(SERIALIZED_NAME_UPDATE_ITEM)
  private List<FriendUpdateRequestUpdateItemInner> updateItem = new ArrayList<>();

  public FriendUpdateRequest() { 
  }

  public FriendUpdateRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 需要更新该 UserID 的关系链数据
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "需要更新该 UserID 的关系链数据")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public FriendUpdateRequest updateItem(List<FriendUpdateRequestUpdateItemInner> updateItem) {
    
    this.updateItem = updateItem;
    return this;
  }

  public FriendUpdateRequest addUpdateItemItem(FriendUpdateRequestUpdateItemInner updateItemItem) {
    this.updateItem.add(updateItemItem);
    return this;
  }

   /**
   * 需要更新的好友对象数组
   * @return updateItem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "需要更新的好友对象数组")

  public List<FriendUpdateRequestUpdateItemInner> getUpdateItem() {
    return updateItem;
  }


  public void setUpdateItem(List<FriendUpdateRequestUpdateItemInner> updateItem) {
    this.updateItem = updateItem;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendUpdateRequest friendUpdateRequest = (FriendUpdateRequest) o;
    return Objects.equals(this.fromAccount, friendUpdateRequest.fromAccount) &&
        Objects.equals(this.updateItem, friendUpdateRequest.updateItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, updateItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendUpdateRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    updateItem: ").append(toIndentedString(updateItem)).append("\n");
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
    openapiFields.add("UpdateItem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("From_Account");
    openapiRequiredFields.add("UpdateItem");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FriendUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FriendUpdateRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FriendUpdateRequest is not found in the empty JSON string", FriendUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FriendUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FriendUpdateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FriendUpdateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("From_Account") != null && !jsonObj.get("From_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From_Account").toString()));
      }
      JsonArray jsonArrayupdateItem = jsonObj.getAsJsonArray("UpdateItem");
      if (jsonArrayupdateItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("UpdateItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `UpdateItem` to be an array in the JSON string but got `%s`", jsonObj.get("UpdateItem").toString()));
        }

        // validate the optional field `UpdateItem` (array)
        for (int i = 0; i < jsonArrayupdateItem.size(); i++) {
          FriendUpdateRequestUpdateItemInner.validateJsonObject(jsonArrayupdateItem.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FriendUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FriendUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FriendUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FriendUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FriendUpdateRequest>() {
           @Override
           public void write(JsonWriter out, FriendUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FriendUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FriendUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FriendUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to FriendUpdateRequest
  */
  public static FriendUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FriendUpdateRequest.class);
  }

 /**
  * Convert an instance of FriendUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

