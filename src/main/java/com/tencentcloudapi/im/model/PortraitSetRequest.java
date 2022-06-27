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
import com.tencentcloudapi.im.model.PortraitSetRequestProfileItemInner;
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
 * PortraitSetRequest
 */

public class PortraitSetRequest {
  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_PROFILE_ITEM = "ProfileItem";
  @SerializedName(SERIALIZED_NAME_PROFILE_ITEM)
  private List<PortraitSetRequestProfileItemInner> profileItem = new ArrayList<>();

  public PortraitSetRequest() { 
  }

  public PortraitSetRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 消息发送方 UserID
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "消息发送方 UserID")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public PortraitSetRequest profileItem(List<PortraitSetRequestProfileItemInner> profileItem) {
    
    this.profileItem = profileItem;
    return this;
  }

  public PortraitSetRequest addProfileItemItem(PortraitSetRequestProfileItemInner profileItemItem) {
    this.profileItem.add(profileItemItem);
    return this;
  }

   /**
   * 待设置的用户的资料对象数组，数组中每一个对象都包含了 Tag 和 Value
   * @return profileItem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "待设置的用户的资料对象数组，数组中每一个对象都包含了 Tag 和 Value")

  public List<PortraitSetRequestProfileItemInner> getProfileItem() {
    return profileItem;
  }


  public void setProfileItem(List<PortraitSetRequestProfileItemInner> profileItem) {
    this.profileItem = profileItem;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortraitSetRequest portraitSetRequest = (PortraitSetRequest) o;
    return Objects.equals(this.fromAccount, portraitSetRequest.fromAccount) &&
        Objects.equals(this.profileItem, portraitSetRequest.profileItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, profileItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortraitSetRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    profileItem: ").append(toIndentedString(profileItem)).append("\n");
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
    openapiFields.add("ProfileItem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("From_Account");
    openapiRequiredFields.add("ProfileItem");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PortraitSetRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PortraitSetRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortraitSetRequest is not found in the empty JSON string", PortraitSetRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PortraitSetRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PortraitSetRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PortraitSetRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("From_Account") != null && !jsonObj.get("From_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From_Account").toString()));
      }
      JsonArray jsonArrayprofileItem = jsonObj.getAsJsonArray("ProfileItem");
      if (jsonArrayprofileItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ProfileItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ProfileItem` to be an array in the JSON string but got `%s`", jsonObj.get("ProfileItem").toString()));
        }

        // validate the optional field `ProfileItem` (array)
        for (int i = 0; i < jsonArrayprofileItem.size(); i++) {
          PortraitSetRequestProfileItemInner.validateJsonObject(jsonArrayprofileItem.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortraitSetRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortraitSetRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortraitSetRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortraitSetRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PortraitSetRequest>() {
           @Override
           public void write(JsonWriter out, PortraitSetRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PortraitSetRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PortraitSetRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PortraitSetRequest
  * @throws IOException if the JSON string is invalid with respect to PortraitSetRequest
  */
  public static PortraitSetRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortraitSetRequest.class);
  }

 /**
  * Convert an instance of PortraitSetRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

