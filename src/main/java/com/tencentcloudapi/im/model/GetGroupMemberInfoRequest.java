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
 * GetGroupMemberInfoRequest
 */

public class GetGroupMemberInfoRequest {
  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_MEMBER_INFO_FILTER = "MemberInfoFilter";
  @SerializedName(SERIALIZED_NAME_MEMBER_INFO_FILTER)
  private List<String> memberInfoFilter = null;

  public static final String SERIALIZED_NAME_MEMBER_ROLE_FILTER = "MemberRoleFilter";
  @SerializedName(SERIALIZED_NAME_MEMBER_ROLE_FILTER)
  private List<String> memberRoleFilter = null;

  public static final String SERIALIZED_NAME_APP_DEFINED_DATA_FILTER_GROUP_MEMBER = "AppDefinedDataFilter_GroupMember";
  @SerializedName(SERIALIZED_NAME_APP_DEFINED_DATA_FILTER_GROUP_MEMBER)
  private List<String> appDefinedDataFilterGroupMember = null;

  public static final String SERIALIZED_NAME_LIMIT = "Limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_OFFSET = "Offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_NEXT = "Next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public GetGroupMemberInfoRequest() { 
  }

  public GetGroupMemberInfoRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * ???????????????????????????????????? ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "???????????????????????????????????? ID")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public GetGroupMemberInfoRequest memberInfoFilter(List<String> memberInfoFilter) {
    
    this.memberInfoFilter = memberInfoFilter;
    return this;
  }

  public GetGroupMemberInfoRequest addMemberInfoFilterItem(String memberInfoFilterItem) {
    if (this.memberInfoFilter == null) {
      this.memberInfoFilter = new ArrayList<>();
    }
    this.memberInfoFilter.add(memberInfoFilterItem);
    return this;
  }

   /**
   * ??????????????????????????? ???????????????????????????????????????????????????????????????????????????????????? ??????????????????https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter???
   * @return memberInfoFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????????????? ???????????????????????????????????????????????????????????????????????????????????? ??????????????????https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter???")

  public List<String> getMemberInfoFilter() {
    return memberInfoFilter;
  }


  public void setMemberInfoFilter(List<String> memberInfoFilter) {
    this.memberInfoFilter = memberInfoFilter;
  }


  public GetGroupMemberInfoRequest memberRoleFilter(List<String> memberRoleFilter) {
    
    this.memberRoleFilter = memberRoleFilter;
    return this;
  }

  public GetGroupMemberInfoRequest addMemberRoleFilterItem(String memberRoleFilterItem) {
    if (this.memberRoleFilter == null) {
      this.memberRoleFilter = new ArrayList<>();
    }
    this.memberRoleFilter.add(memberRoleFilterItem);
    return this;
  }

   /**
   * ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????Owner?????????Admin?????????Member???
   * @return memberRoleFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????Owner?????????Admin?????????Member???")

  public List<String> getMemberRoleFilter() {
    return memberRoleFilter;
  }


  public void setMemberRoleFilter(List<String> memberRoleFilter) {
    this.memberRoleFilter = memberRoleFilter;
  }


  public GetGroupMemberInfoRequest appDefinedDataFilterGroupMember(List<String> appDefinedDataFilterGroupMember) {
    
    this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
    return this;
  }

  public GetGroupMemberInfoRequest addAppDefinedDataFilterGroupMemberItem(String appDefinedDataFilterGroupMemberItem) {
    if (this.appDefinedDataFilterGroupMember == null) {
      this.appDefinedDataFilterGroupMember = new ArrayList<>();
    }
    this.appDefinedDataFilterGroupMember.add(appDefinedDataFilterGroupMemberItem);
    return this;
  }

   /**
   * ???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????? ??????????????????https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5???
   * @return appDefinedDataFilterGroupMember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????? ??????????????????https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5???")

  public List<String> getAppDefinedDataFilterGroupMember() {
    return appDefinedDataFilterGroupMember;
  }


  public void setAppDefinedDataFilterGroupMember(List<String> appDefinedDataFilterGroupMember) {
    this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
  }


  public GetGroupMemberInfoRequest limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * ?????????????????????????????????????????????????????????6000??????????????????????????????????????????????????????
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????????????????????????????6000??????????????????????????????????????????????????????")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public GetGroupMemberInfoRequest offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * ?????????????????????????????????????????????????????????0???????????????????????????????????????
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????????????????????????????0???????????????????????????????????????")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public GetGroupMemberInfoRequest next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * ?????????????????????????????????????????????????????????????????? Offset ??????????????? Next ???????????????????????????\&quot;\&quot;??????????????????????????? Next ???
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????????????????????????????????????? Offset ??????????????? Next ???????????????????????????\"\"??????????????????????????? Next ???")

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
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
  public GetGroupMemberInfoRequest putAdditionalProperty(String key, Object value) {
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
    GetGroupMemberInfoRequest getGroupMemberInfoRequest = (GetGroupMemberInfoRequest) o;
    return Objects.equals(this.groupId, getGroupMemberInfoRequest.groupId) &&
        Objects.equals(this.memberInfoFilter, getGroupMemberInfoRequest.memberInfoFilter) &&
        Objects.equals(this.memberRoleFilter, getGroupMemberInfoRequest.memberRoleFilter) &&
        Objects.equals(this.appDefinedDataFilterGroupMember, getGroupMemberInfoRequest.appDefinedDataFilterGroupMember) &&
        Objects.equals(this.limit, getGroupMemberInfoRequest.limit) &&
        Objects.equals(this.offset, getGroupMemberInfoRequest.offset) &&
        Objects.equals(this.next, getGroupMemberInfoRequest.next)&&
        Objects.equals(this.additionalProperties, getGroupMemberInfoRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, memberInfoFilter, memberRoleFilter, appDefinedDataFilterGroupMember, limit, offset, next, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupMemberInfoRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    memberInfoFilter: ").append(toIndentedString(memberInfoFilter)).append("\n");
    sb.append("    memberRoleFilter: ").append(toIndentedString(memberRoleFilter)).append("\n");
    sb.append("    appDefinedDataFilterGroupMember: ").append(toIndentedString(appDefinedDataFilterGroupMember)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
    openapiFields.add("MemberInfoFilter");
    openapiFields.add("MemberRoleFilter");
    openapiFields.add("AppDefinedDataFilter_GroupMember");
    openapiFields.add("Limit");
    openapiFields.add("Offset");
    openapiFields.add("Next");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GroupId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetGroupMemberInfoRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetGroupMemberInfoRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupMemberInfoRequest is not found in the empty JSON string", GetGroupMemberInfoRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetGroupMemberInfoRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("MemberInfoFilter") != null && !jsonObj.get("MemberInfoFilter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `MemberInfoFilter` to be an array in the JSON string but got `%s`", jsonObj.get("MemberInfoFilter").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("MemberRoleFilter") != null && !jsonObj.get("MemberRoleFilter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `MemberRoleFilter` to be an array in the JSON string but got `%s`", jsonObj.get("MemberRoleFilter").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("AppDefinedDataFilter_GroupMember") != null && !jsonObj.get("AppDefinedDataFilter_GroupMember").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `AppDefinedDataFilter_GroupMember` to be an array in the JSON string but got `%s`", jsonObj.get("AppDefinedDataFilter_GroupMember").toString()));
      }
      if (jsonObj.get("Next") != null && !jsonObj.get("Next").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Next` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Next").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupMemberInfoRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupMemberInfoRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupMemberInfoRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupMemberInfoRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupMemberInfoRequest>() {
           @Override
           public void write(JsonWriter out, GetGroupMemberInfoRequest value) throws IOException {
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
           public GetGroupMemberInfoRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetGroupMemberInfoRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetGroupMemberInfoRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGroupMemberInfoRequest
  * @throws IOException if the JSON string is invalid with respect to GetGroupMemberInfoRequest
  */
  public static GetGroupMemberInfoRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupMemberInfoRequest.class);
  }

 /**
  * Convert an instance of GetGroupMemberInfoRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

