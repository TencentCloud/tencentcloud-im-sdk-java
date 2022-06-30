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
import com.tencentcloudapi.im.model.FriendUpdateRequestUpdateItemInnerSnsItemInner;
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
 * FriendUpdateRequestUpdateItemInner
 */

public class FriendUpdateRequestUpdateItemInner {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_SNS_ITEM = "SnsItem";
  @SerializedName(SERIALIZED_NAME_SNS_ITEM)
  private List<FriendUpdateRequestUpdateItemInnerSnsItemInner> snsItem = new ArrayList<>();

  public FriendUpdateRequestUpdateItemInner() { 
  }

  public FriendUpdateRequestUpdateItemInner toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 好友的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "好友的 UserID")

  public String getToAccount() {
    return toAccount;
  }


  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public FriendUpdateRequestUpdateItemInner snsItem(List<FriendUpdateRequestUpdateItemInnerSnsItemInner> snsItem) {
    
    this.snsItem = snsItem;
    return this;
  }

  public FriendUpdateRequestUpdateItemInner addSnsItemItem(FriendUpdateRequestUpdateItemInnerSnsItemInner snsItemItem) {
    this.snsItem.add(snsItemItem);
    return this;
  }

   /**
   * 需要更新的关系链数据对象数组
   * @return snsItem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "需要更新的关系链数据对象数组")

  public List<FriendUpdateRequestUpdateItemInnerSnsItemInner> getSnsItem() {
    return snsItem;
  }


  public void setSnsItem(List<FriendUpdateRequestUpdateItemInnerSnsItemInner> snsItem) {
    this.snsItem = snsItem;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendUpdateRequestUpdateItemInner friendUpdateRequestUpdateItemInner = (FriendUpdateRequestUpdateItemInner) o;
    return Objects.equals(this.toAccount, friendUpdateRequestUpdateItemInner.toAccount) &&
        Objects.equals(this.snsItem, friendUpdateRequestUpdateItemInner.snsItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, snsItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendUpdateRequestUpdateItemInner {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    snsItem: ").append(toIndentedString(snsItem)).append("\n");
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
    openapiFields.add("SnsItem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("To_Account");
    openapiRequiredFields.add("SnsItem");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FriendUpdateRequestUpdateItemInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FriendUpdateRequestUpdateItemInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FriendUpdateRequestUpdateItemInner is not found in the empty JSON string", FriendUpdateRequestUpdateItemInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FriendUpdateRequestUpdateItemInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FriendUpdateRequestUpdateItemInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FriendUpdateRequestUpdateItemInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
      JsonArray jsonArraysnsItem = jsonObj.getAsJsonArray("SnsItem");
      if (jsonArraysnsItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("SnsItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `SnsItem` to be an array in the JSON string but got `%s`", jsonObj.get("SnsItem").toString()));
        }

        // validate the optional field `SnsItem` (array)
        for (int i = 0; i < jsonArraysnsItem.size(); i++) {
          FriendUpdateRequestUpdateItemInnerSnsItemInner.validateJsonObject(jsonArraysnsItem.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FriendUpdateRequestUpdateItemInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FriendUpdateRequestUpdateItemInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FriendUpdateRequestUpdateItemInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FriendUpdateRequestUpdateItemInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FriendUpdateRequestUpdateItemInner>() {
           @Override
           public void write(JsonWriter out, FriendUpdateRequestUpdateItemInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FriendUpdateRequestUpdateItemInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FriendUpdateRequestUpdateItemInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FriendUpdateRequestUpdateItemInner
  * @throws IOException if the JSON string is invalid with respect to FriendUpdateRequestUpdateItemInner
  */
  public static FriendUpdateRequestUpdateItemInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FriendUpdateRequestUpdateItemInner.class);
  }

 /**
  * Convert an instance of FriendUpdateRequestUpdateItemInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

