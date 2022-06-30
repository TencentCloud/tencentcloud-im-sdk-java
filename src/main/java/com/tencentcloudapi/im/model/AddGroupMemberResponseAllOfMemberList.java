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
 * AddGroupMemberResponseAllOfMemberList
 */

public class AddGroupMemberResponseAllOfMemberList {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MEMBER_ACCOUNT = "Member_Account";
  @SerializedName(SERIALIZED_NAME_MEMBER_ACCOUNT)
  private String memberAccount;

  public static final String SERIALIZED_NAME_RESULT = "Result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Integer result;

  public AddGroupMemberResponseAllOfMemberList() { 
  }

  public AddGroupMemberResponseAllOfMemberList memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * 返回的群成员 UserID
   * @return memberAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "返回的群成员 UserID")

  public String getMemberAccount() {
    return memberAccount;
  }


  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  public AddGroupMemberResponseAllOfMemberList result(Integer result) {
    
    this.result = result;
    return this;
  }

   /**
   * 加人结果：0-失败；1-成功；2-已经是群成员；3-等待被邀请者确认
   * @return result
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "加人结果：0-失败；1-成功；2-已经是群成员；3-等待被邀请者确认")

  public Integer getResult() {
    return result;
  }


  public void setResult(Integer result) {
    this.result = result;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddGroupMemberResponseAllOfMemberList addGroupMemberResponseAllOfMemberList = (AddGroupMemberResponseAllOfMemberList) o;
    return Objects.equals(this.memberAccount, addGroupMemberResponseAllOfMemberList.memberAccount) &&
        Objects.equals(this.result, addGroupMemberResponseAllOfMemberList.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAccount, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddGroupMemberResponseAllOfMemberList {\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
    openapiFields.add("Result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Member_Account");
    openapiRequiredFields.add("Result");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddGroupMemberResponseAllOfMemberList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AddGroupMemberResponseAllOfMemberList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddGroupMemberResponseAllOfMemberList is not found in the empty JSON string", AddGroupMemberResponseAllOfMemberList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddGroupMemberResponseAllOfMemberList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddGroupMemberResponseAllOfMemberList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddGroupMemberResponseAllOfMemberList.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Member_Account") != null && !jsonObj.get("Member_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Member_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Member_Account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddGroupMemberResponseAllOfMemberList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddGroupMemberResponseAllOfMemberList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddGroupMemberResponseAllOfMemberList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddGroupMemberResponseAllOfMemberList.class));

       return (TypeAdapter<T>) new TypeAdapter<AddGroupMemberResponseAllOfMemberList>() {
           @Override
           public void write(JsonWriter out, AddGroupMemberResponseAllOfMemberList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddGroupMemberResponseAllOfMemberList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddGroupMemberResponseAllOfMemberList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddGroupMemberResponseAllOfMemberList
  * @throws IOException if the JSON string is invalid with respect to AddGroupMemberResponseAllOfMemberList
  */
  public static AddGroupMemberResponseAllOfMemberList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddGroupMemberResponseAllOfMemberList.class);
  }

 /**
  * Convert an instance of AddGroupMemberResponseAllOfMemberList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

