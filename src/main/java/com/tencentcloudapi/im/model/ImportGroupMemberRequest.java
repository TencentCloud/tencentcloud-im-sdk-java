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
import com.tencentcloudapi.im.model.ImportGroupMemberRequestMemberListInner;
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
 * ImportGroupMemberRequest
 */

public class ImportGroupMemberRequest {
  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_MEMBER_LIST = "MemberList";
  @SerializedName(SERIALIZED_NAME_MEMBER_LIST)
  private List<ImportGroupMemberRequestMemberListInner> memberList = new ArrayList<>();

  public ImportGroupMemberRequest() { 
  }

  public ImportGroupMemberRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 操作的群 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "操作的群 ID")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ImportGroupMemberRequest memberList(List<ImportGroupMemberRequestMemberListInner> memberList) {
    
    this.memberList = memberList;
    return this;
  }

  public ImportGroupMemberRequest addMemberListItem(ImportGroupMemberRequestMemberListInner memberListItem) {
    this.memberList.add(memberListItem);
    return this;
  }

   /**
   * 待添加的群成员数组
   * @return memberList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "待添加的群成员数组")

  public List<ImportGroupMemberRequestMemberListInner> getMemberList() {
    return memberList;
  }


  public void setMemberList(List<ImportGroupMemberRequestMemberListInner> memberList) {
    this.memberList = memberList;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public ImportGroupMemberRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupMemberRequest importGroupMemberRequest = (ImportGroupMemberRequest) o;
    return Objects.equals(this.groupId, importGroupMemberRequest.groupId) &&
        Objects.equals(this.memberList, importGroupMemberRequest.memberList)&&
        Objects.equals(this.additionalProperties, importGroupMemberRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, memberList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMemberRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    memberList: ").append(toIndentedString(memberList)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("MemberList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GroupId");
    openapiRequiredFields.add("MemberList");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportGroupMemberRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImportGroupMemberRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportGroupMemberRequest is not found in the empty JSON string", ImportGroupMemberRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImportGroupMemberRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
      JsonArray jsonArraymemberList = jsonObj.getAsJsonArray("MemberList");
      if (jsonArraymemberList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("MemberList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `MemberList` to be an array in the JSON string but got `%s`", jsonObj.get("MemberList").toString()));
        }

        // validate the optional field `MemberList` (array)
        for (int i = 0; i < jsonArraymemberList.size(); i++) {
          ImportGroupMemberRequestMemberListInner.validateJsonObject(jsonArraymemberList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportGroupMemberRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportGroupMemberRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportGroupMemberRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportGroupMemberRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportGroupMemberRequest>() {
           @Override
           public void write(JsonWriter out, ImportGroupMemberRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportGroupMemberRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ImportGroupMemberRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), Object.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImportGroupMemberRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportGroupMemberRequest
  * @throws IOException if the JSON string is invalid with respect to ImportGroupMemberRequest
  */
  public static ImportGroupMemberRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportGroupMemberRequest.class);
  }

 /**
  * Convert an instance of ImportGroupMemberRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

