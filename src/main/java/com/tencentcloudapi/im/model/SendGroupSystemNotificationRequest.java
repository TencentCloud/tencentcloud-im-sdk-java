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
 * SendGroupSystemNotificationRequest
 */

public class SendGroupSystemNotificationRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_TO_MEMBERS_ACCOUNT = "ToMembers_Account";
  @SerializedName(SERIALIZED_NAME_TO_MEMBERS_ACCOUNT)
  private List<String> toMembersAccount = null;

  public static final String SERIALIZED_NAME_CONTENT = "Content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public SendGroupSystemNotificationRequest() { 
  }

  public SendGroupSystemNotificationRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 向哪个群组发送系统通知
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "向哪个群组发送系统通知")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public SendGroupSystemNotificationRequest toMembersAccount(List<String> toMembersAccount) {
    
    this.toMembersAccount = toMembersAccount;
    return this;
  }

  public SendGroupSystemNotificationRequest addToMembersAccountItem(String toMembersAccountItem) {
    if (this.toMembersAccount == null) {
      this.toMembersAccount = new ArrayList<>();
    }
    this.toMembersAccount.add(toMembersAccountItem);
    return this;
  }

   /**
   * 接收者群成员列表，请填写接收者 UserID，最多填写500个，不填或为空表示全员下发
   * @return toMembersAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "接收者群成员列表，请填写接收者 UserID，最多填写500个，不填或为空表示全员下发")

  public List<String> getToMembersAccount() {
    return toMembersAccount;
  }


  public void setToMembersAccount(List<String> toMembersAccount) {
    this.toMembersAccount = toMembersAccount;
  }


  public SendGroupSystemNotificationRequest content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 系统通知的内容
   * @return content
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "系统通知的内容")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendGroupSystemNotificationRequest sendGroupSystemNotificationRequest = (SendGroupSystemNotificationRequest) o;
    return Objects.equals(this.groupId, sendGroupSystemNotificationRequest.groupId) &&
        Objects.equals(this.toMembersAccount, sendGroupSystemNotificationRequest.toMembersAccount) &&
        Objects.equals(this.content, sendGroupSystemNotificationRequest.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, toMembersAccount, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendGroupSystemNotificationRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    toMembersAccount: ").append(toIndentedString(toMembersAccount)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
    openapiFields.add("GroupId");
    openapiFields.add("ToMembers_Account");
    openapiFields.add("Content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GroupId");
    openapiRequiredFields.add("Content");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendGroupSystemNotificationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SendGroupSystemNotificationRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendGroupSystemNotificationRequest is not found in the empty JSON string", SendGroupSystemNotificationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendGroupSystemNotificationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendGroupSystemNotificationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SendGroupSystemNotificationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("ToMembers_Account") != null && !jsonObj.get("ToMembers_Account").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ToMembers_Account` to be an array in the JSON string but got `%s`", jsonObj.get("ToMembers_Account").toString()));
      }
      if (jsonObj.get("Content") != null && !jsonObj.get("Content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Content").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendGroupSystemNotificationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendGroupSystemNotificationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendGroupSystemNotificationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendGroupSystemNotificationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SendGroupSystemNotificationRequest>() {
           @Override
           public void write(JsonWriter out, SendGroupSystemNotificationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendGroupSystemNotificationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendGroupSystemNotificationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendGroupSystemNotificationRequest
  * @throws IOException if the JSON string is invalid with respect to SendGroupSystemNotificationRequest
  */
  public static SendGroupSystemNotificationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendGroupSystemNotificationRequest.class);
  }

 /**
  * Convert an instance of SendGroupSystemNotificationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

