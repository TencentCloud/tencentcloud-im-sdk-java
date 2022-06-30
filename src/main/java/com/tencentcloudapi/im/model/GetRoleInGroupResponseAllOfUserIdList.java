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
 * GetRoleInGroupResponseAllOfUserIdList
 */

public class GetRoleInGroupResponseAllOfUserIdList {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MEMBER_ACCOUNT = "Member_Account";
  @SerializedName(SERIALIZED_NAME_MEMBER_ACCOUNT)
  private String memberAccount;

  public static final String SERIALIZED_NAME_ROLE = "Role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public GetRoleInGroupResponseAllOfUserIdList() { 
  }

  public GetRoleInGroupResponseAllOfUserIdList memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * Get memberAccount
   * @return memberAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMemberAccount() {
    return memberAccount;
  }


  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  public GetRoleInGroupResponseAllOfUserIdList role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * 成员角色：Owner/Admin/Member/NotMember
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "成员角色：Owner/Admin/Member/NotMember")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRoleInGroupResponseAllOfUserIdList getRoleInGroupResponseAllOfUserIdList = (GetRoleInGroupResponseAllOfUserIdList) o;
    return Objects.equals(this.memberAccount, getRoleInGroupResponseAllOfUserIdList.memberAccount) &&
        Objects.equals(this.role, getRoleInGroupResponseAllOfUserIdList.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAccount, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoleInGroupResponseAllOfUserIdList {\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetRoleInGroupResponseAllOfUserIdList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetRoleInGroupResponseAllOfUserIdList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRoleInGroupResponseAllOfUserIdList is not found in the empty JSON string", GetRoleInGroupResponseAllOfUserIdList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetRoleInGroupResponseAllOfUserIdList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRoleInGroupResponseAllOfUserIdList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!GetRoleInGroupResponseAllOfUserIdList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRoleInGroupResponseAllOfUserIdList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRoleInGroupResponseAllOfUserIdList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRoleInGroupResponseAllOfUserIdList.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRoleInGroupResponseAllOfUserIdList>() {
           @Override
           public void write(JsonWriter out, GetRoleInGroupResponseAllOfUserIdList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRoleInGroupResponseAllOfUserIdList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetRoleInGroupResponseAllOfUserIdList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRoleInGroupResponseAllOfUserIdList
  * @throws IOException if the JSON string is invalid with respect to GetRoleInGroupResponseAllOfUserIdList
  */
  public static GetRoleInGroupResponseAllOfUserIdList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRoleInGroupResponseAllOfUserIdList.class);
  }

 /**
  * Convert an instance of GetRoleInGroupResponseAllOfUserIdList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

