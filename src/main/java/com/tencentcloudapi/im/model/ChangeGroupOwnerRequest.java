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
 * ChangeGroupOwnerRequest
 */

public class ChangeGroupOwnerRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_NEW_OWNER_ACCOUNT = "NewOwner_Account";
  @SerializedName(SERIALIZED_NAME_NEW_OWNER_ACCOUNT)
  private String newOwnerAccount;

  public ChangeGroupOwnerRequest() { 
  }

  public ChangeGroupOwnerRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 要被转移的群组 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "要被转移的群组 ID")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ChangeGroupOwnerRequest newOwnerAccount(String newOwnerAccount) {
    
    this.newOwnerAccount = newOwnerAccount;
    return this;
  }

   /**
   * 新群主 ID
   * @return newOwnerAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "新群主 ID")

  public String getNewOwnerAccount() {
    return newOwnerAccount;
  }


  public void setNewOwnerAccount(String newOwnerAccount) {
    this.newOwnerAccount = newOwnerAccount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeGroupOwnerRequest changeGroupOwnerRequest = (ChangeGroupOwnerRequest) o;
    return Objects.equals(this.groupId, changeGroupOwnerRequest.groupId) &&
        Objects.equals(this.newOwnerAccount, changeGroupOwnerRequest.newOwnerAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, newOwnerAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeGroupOwnerRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    newOwnerAccount: ").append(toIndentedString(newOwnerAccount)).append("\n");
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
    openapiFields.add("NewOwner_Account");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GroupId");
    openapiRequiredFields.add("NewOwner_Account");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChangeGroupOwnerRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ChangeGroupOwnerRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeGroupOwnerRequest is not found in the empty JSON string", ChangeGroupOwnerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChangeGroupOwnerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangeGroupOwnerRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChangeGroupOwnerRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
      if (jsonObj.get("NewOwner_Account") != null && !jsonObj.get("NewOwner_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NewOwner_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NewOwner_Account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeGroupOwnerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeGroupOwnerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeGroupOwnerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeGroupOwnerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeGroupOwnerRequest>() {
           @Override
           public void write(JsonWriter out, ChangeGroupOwnerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangeGroupOwnerRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChangeGroupOwnerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeGroupOwnerRequest
  * @throws IOException if the JSON string is invalid with respect to ChangeGroupOwnerRequest
  */
  public static ChangeGroupOwnerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeGroupOwnerRequest.class);
  }

 /**
  * Convert an instance of ChangeGroupOwnerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

