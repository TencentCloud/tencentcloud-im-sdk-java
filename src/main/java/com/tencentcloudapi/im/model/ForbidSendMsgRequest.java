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
 * ForbidSendMsgRequest
 */

public class ForbidSendMsgRequest {
  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_MEMBERS_ACCOUNT = "Members_Account";
  @SerializedName(SERIALIZED_NAME_MEMBERS_ACCOUNT)
  private List<String> membersAccount = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHUT_UP_TIME = "ShutUpTime";
  @SerializedName(SERIALIZED_NAME_SHUT_UP_TIME)
  private Integer shutUpTime;

  public ForbidSendMsgRequest() { 
  }

  public ForbidSendMsgRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 需要查询的群组 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "需要查询的群组 ID")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ForbidSendMsgRequest membersAccount(List<String> membersAccount) {
    
    this.membersAccount = membersAccount;
    return this;
  }

  public ForbidSendMsgRequest addMembersAccountItem(String membersAccountItem) {
    this.membersAccount.add(membersAccountItem);
    return this;
  }

   /**
   * 需要禁言的用户帐号，最多支持500个帐号
   * @return membersAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "需要禁言的用户帐号，最多支持500个帐号")

  public List<String> getMembersAccount() {
    return membersAccount;
  }


  public void setMembersAccount(List<String> membersAccount) {
    this.membersAccount = membersAccount;
  }


  public ForbidSendMsgRequest shutUpTime(Integer shutUpTime) {
    
    this.shutUpTime = shutUpTime;
    return this;
  }

   /**
   * 无符号类型。需禁言时间，单位为秒，为0时表示取消禁言，4294967295为永久禁言。
   * @return shutUpTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "无符号类型。需禁言时间，单位为秒，为0时表示取消禁言，4294967295为永久禁言。")

  public Integer getShutUpTime() {
    return shutUpTime;
  }


  public void setShutUpTime(Integer shutUpTime) {
    this.shutUpTime = shutUpTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForbidSendMsgRequest forbidSendMsgRequest = (ForbidSendMsgRequest) o;
    return Objects.equals(this.groupId, forbidSendMsgRequest.groupId) &&
        Objects.equals(this.membersAccount, forbidSendMsgRequest.membersAccount) &&
        Objects.equals(this.shutUpTime, forbidSendMsgRequest.shutUpTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, membersAccount, shutUpTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForbidSendMsgRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    membersAccount: ").append(toIndentedString(membersAccount)).append("\n");
    sb.append("    shutUpTime: ").append(toIndentedString(shutUpTime)).append("\n");
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
    openapiFields.add("Members_Account");
    openapiFields.add("ShutUpTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GroupId");
    openapiRequiredFields.add("Members_Account");
    openapiRequiredFields.add("ShutUpTime");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ForbidSendMsgRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ForbidSendMsgRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ForbidSendMsgRequest is not found in the empty JSON string", ForbidSendMsgRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ForbidSendMsgRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ForbidSendMsgRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ForbidSendMsgRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("Members_Account") != null && !jsonObj.get("Members_Account").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Members_Account` to be an array in the JSON string but got `%s`", jsonObj.get("Members_Account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ForbidSendMsgRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ForbidSendMsgRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ForbidSendMsgRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ForbidSendMsgRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ForbidSendMsgRequest>() {
           @Override
           public void write(JsonWriter out, ForbidSendMsgRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ForbidSendMsgRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ForbidSendMsgRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ForbidSendMsgRequest
  * @throws IOException if the JSON string is invalid with respect to ForbidSendMsgRequest
  */
  public static ForbidSendMsgRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ForbidSendMsgRequest.class);
  }

 /**
  * Convert an instance of ForbidSendMsgRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

