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
import com.tencentcloudapi.im.model.AddGroupMemberResponseAllOfMemberList;
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
 * AddGroupMemberResponseAllOf
 */

public class AddGroupMemberResponseAllOf {
  public static final String SERIALIZED_NAME_MEMBER_LIST = "MemberList";
  @SerializedName(SERIALIZED_NAME_MEMBER_LIST)
  private List<AddGroupMemberResponseAllOfMemberList> memberList = null;

  public AddGroupMemberResponseAllOf() { 
  }

  public AddGroupMemberResponseAllOf memberList(List<AddGroupMemberResponseAllOfMemberList> memberList) {
    
    this.memberList = memberList;
    return this;
  }

  public AddGroupMemberResponseAllOf addMemberListItem(AddGroupMemberResponseAllOfMemberList memberListItem) {
    if (this.memberList == null) {
      this.memberList = new ArrayList<>();
    }
    this.memberList.add(memberListItem);
    return this;
  }

   /**
   * Get memberList
   * @return memberList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AddGroupMemberResponseAllOfMemberList> getMemberList() {
    return memberList;
  }


  public void setMemberList(List<AddGroupMemberResponseAllOfMemberList> memberList) {
    this.memberList = memberList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddGroupMemberResponseAllOf addGroupMemberResponseAllOf = (AddGroupMemberResponseAllOf) o;
    return Objects.equals(this.memberList, addGroupMemberResponseAllOf.memberList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddGroupMemberResponseAllOf {\n");
    sb.append("    memberList: ").append(toIndentedString(memberList)).append("\n");
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
    openapiFields.add("MemberList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddGroupMemberResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AddGroupMemberResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddGroupMemberResponseAllOf is not found in the empty JSON string", AddGroupMemberResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddGroupMemberResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddGroupMemberResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraymemberList = jsonObj.getAsJsonArray("MemberList");
      if (jsonArraymemberList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("MemberList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `MemberList` to be an array in the JSON string but got `%s`", jsonObj.get("MemberList").toString()));
        }

        // validate the optional field `MemberList` (array)
        for (int i = 0; i < jsonArraymemberList.size(); i++) {
          AddGroupMemberResponseAllOfMemberList.validateJsonObject(jsonArraymemberList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddGroupMemberResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddGroupMemberResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddGroupMemberResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddGroupMemberResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<AddGroupMemberResponseAllOf>() {
           @Override
           public void write(JsonWriter out, AddGroupMemberResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddGroupMemberResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddGroupMemberResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddGroupMemberResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to AddGroupMemberResponseAllOf
  */
  public static AddGroupMemberResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddGroupMemberResponseAllOf.class);
  }

 /**
  * Convert an instance of AddGroupMemberResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

