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
 * ImportGroupMemberResponseAllOfMemberList
 */

public class ImportGroupMemberResponseAllOfMemberList {
  public static final String SERIALIZED_NAME_RESULT = "Result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Integer result;

  public static final String SERIALIZED_NAME_MEMBER_ACCOUNT = "Member_Account";
  @SerializedName(SERIALIZED_NAME_MEMBER_ACCOUNT)
  private String memberAccount;

  public ImportGroupMemberResponseAllOfMemberList() { 
  }

  public ImportGroupMemberResponseAllOfMemberList result(Integer result) {
    
    this.result = result;
    return this;
  }

   /**
   * 导入结果：0表示失败；1表示成功；2 表示已经是群成员
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "导入结果：0表示失败；1表示成功；2 表示已经是群成员")

  public Integer getResult() {
    return result;
  }


  public void setResult(Integer result) {
    this.result = result;
  }


  public ImportGroupMemberResponseAllOfMemberList memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * 返回的群成员帐号
   * @return memberAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回的群成员帐号")

  public String getMemberAccount() {
    return memberAccount;
  }


  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupMemberResponseAllOfMemberList importGroupMemberResponseAllOfMemberList = (ImportGroupMemberResponseAllOfMemberList) o;
    return Objects.equals(this.result, importGroupMemberResponseAllOfMemberList.result) &&
        Objects.equals(this.memberAccount, importGroupMemberResponseAllOfMemberList.memberAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, memberAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMemberResponseAllOfMemberList {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
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
    openapiFields.add("Result");
    openapiFields.add("Member_Account");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportGroupMemberResponseAllOfMemberList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImportGroupMemberResponseAllOfMemberList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportGroupMemberResponseAllOfMemberList is not found in the empty JSON string", ImportGroupMemberResponseAllOfMemberList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImportGroupMemberResponseAllOfMemberList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportGroupMemberResponseAllOfMemberList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!ImportGroupMemberResponseAllOfMemberList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportGroupMemberResponseAllOfMemberList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportGroupMemberResponseAllOfMemberList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportGroupMemberResponseAllOfMemberList.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportGroupMemberResponseAllOfMemberList>() {
           @Override
           public void write(JsonWriter out, ImportGroupMemberResponseAllOfMemberList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportGroupMemberResponseAllOfMemberList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImportGroupMemberResponseAllOfMemberList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportGroupMemberResponseAllOfMemberList
  * @throws IOException if the JSON string is invalid with respect to ImportGroupMemberResponseAllOfMemberList
  */
  public static ImportGroupMemberResponseAllOfMemberList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportGroupMemberResponseAllOfMemberList.class);
  }

 /**
  * Convert an instance of ImportGroupMemberResponseAllOfMemberList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

