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
 * ImportGroupMemberRequestMemberListInner
 */

public class ImportGroupMemberRequestMemberListInner {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MEMBER_ACCOUNT = "Member_Account";
  @SerializedName(SERIALIZED_NAME_MEMBER_ACCOUNT)
  private String memberAccount;

  public static final String SERIALIZED_NAME_ROLE = "Role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_JOIN_TIME = "JoinTime";
  @SerializedName(SERIALIZED_NAME_JOIN_TIME)
  private Integer joinTime;

  public static final String SERIALIZED_NAME_UNREAD_MSG_NUM = "UnreadMsgNum";
  @SerializedName(SERIALIZED_NAME_UNREAD_MSG_NUM)
  private Integer unreadMsgNum;

  public ImportGroupMemberRequestMemberListInner() { 
  }

  public ImportGroupMemberRequestMemberListInner memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * 待导入的群成员帐号
   * @return memberAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "待导入的群成员帐号")

  public String getMemberAccount() {
    return memberAccount;
  }


  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  public ImportGroupMemberRequestMemberListInner role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * 待导入群成员角色；目前只支持填 Admin，不填则为普通成员 Member
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "待导入群成员角色；目前只支持填 Admin，不填则为普通成员 Member")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public ImportGroupMemberRequestMemberListInner joinTime(Integer joinTime) {
    
    this.joinTime = joinTime;
    return this;
  }

   /**
   * 待导入群成员的入群时间
   * @return joinTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "待导入群成员的入群时间")

  public Integer getJoinTime() {
    return joinTime;
  }


  public void setJoinTime(Integer joinTime) {
    this.joinTime = joinTime;
  }


  public ImportGroupMemberRequestMemberListInner unreadMsgNum(Integer unreadMsgNum) {
    
    this.unreadMsgNum = unreadMsgNum;
    return this;
  }

   /**
   * 待导入群成员的未读消息计数
   * @return unreadMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "待导入群成员的未读消息计数")

  public Integer getUnreadMsgNum() {
    return unreadMsgNum;
  }


  public void setUnreadMsgNum(Integer unreadMsgNum) {
    this.unreadMsgNum = unreadMsgNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupMemberRequestMemberListInner importGroupMemberRequestMemberListInner = (ImportGroupMemberRequestMemberListInner) o;
    return Objects.equals(this.memberAccount, importGroupMemberRequestMemberListInner.memberAccount) &&
        Objects.equals(this.role, importGroupMemberRequestMemberListInner.role) &&
        Objects.equals(this.joinTime, importGroupMemberRequestMemberListInner.joinTime) &&
        Objects.equals(this.unreadMsgNum, importGroupMemberRequestMemberListInner.unreadMsgNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAccount, role, joinTime, unreadMsgNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMemberRequestMemberListInner {\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
    sb.append("    unreadMsgNum: ").append(toIndentedString(unreadMsgNum)).append("\n");
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
    openapiFields.add("Member_Account");
    openapiFields.add("Role");
    openapiFields.add("JoinTime");
    openapiFields.add("UnreadMsgNum");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Member_Account");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportGroupMemberRequestMemberListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImportGroupMemberRequestMemberListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportGroupMemberRequestMemberListInner is not found in the empty JSON string", ImportGroupMemberRequestMemberListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImportGroupMemberRequestMemberListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportGroupMemberRequestMemberListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImportGroupMemberRequestMemberListInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Member_Account") != null && !jsonObj.get("Member_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Member_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Member_Account").toString()));
      }
      if (jsonObj.get("Role") != null && !jsonObj.get("Role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Role").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportGroupMemberRequestMemberListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportGroupMemberRequestMemberListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportGroupMemberRequestMemberListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportGroupMemberRequestMemberListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportGroupMemberRequestMemberListInner>() {
           @Override
           public void write(JsonWriter out, ImportGroupMemberRequestMemberListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportGroupMemberRequestMemberListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImportGroupMemberRequestMemberListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportGroupMemberRequestMemberListInner
  * @throws IOException if the JSON string is invalid with respect to ImportGroupMemberRequestMemberListInner
  */
  public static ImportGroupMemberRequestMemberListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportGroupMemberRequestMemberListInner.class);
  }

 /**
  * Convert an instance of ImportGroupMemberRequestMemberListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

