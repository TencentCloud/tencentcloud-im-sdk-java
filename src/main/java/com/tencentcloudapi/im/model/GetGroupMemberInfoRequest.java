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
 * GetGroupMemberInfoRequest
 */

public class GetGroupMemberInfoRequest {
  private static final long serialVersionUID = 1L;

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
   * 需要拉取成员信息的群组的 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "需要拉取成员信息的群组的 ID")

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
   * 需要获取哪些信息， 如果没有该字段则为群成员全部资料，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）
   * @return memberInfoFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "需要获取哪些信息， 如果没有该字段则为群成员全部资料，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）")

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
   * 拉取指定身份的群成员资料。如没有填写该字段，默认为所有身份成员资料，成员身份可以为：“Owner”，“Admin”，“Member”
   * @return memberRoleFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "拉取指定身份的群成员资料。如没有填写该字段，默认为所有身份成员资料，成员身份可以为：“Owner”，“Admin”，“Member”")

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
   * 默认情况是没有的。该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段，群成员维度的自定义字段详情请参阅 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5）
   * @return appDefinedDataFilterGroupMember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "默认情况是没有的。该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段，群成员维度的自定义字段详情请参阅 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5）")

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
   * 一次最多获取多少个成员的资料，不得超过6000。如果不填，则获取群内全部成员的信息
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "一次最多获取多少个成员的资料，不得超过6000。如果不填，则获取群内全部成员的信息")

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
   * 从第几个成员开始获取，如果不填则默认为0，表示从第一个成员开始获取
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "从第几个成员开始获取，如果不填则默认为0，表示从第一个成员开始获取")

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
   * 上一次拉取到的成员位置，社群必填，社群不支持 Offset 参数，使用 Next 参数，首次调用填写\&quot;\&quot;，续拉使用返回中的 Next 值
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上一次拉取到的成员位置，社群必填，社群不支持 Offset 参数，使用 Next 参数，首次调用填写\"\"，续拉使用返回中的 Next 值")

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
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
        Objects.equals(this.next, getGroupMemberInfoRequest.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, memberInfoFilter, memberRoleFilter, appDefinedDataFilterGroupMember, limit, offset, next);
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

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetGroupMemberInfoRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGroupMemberInfoRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGroupMemberInfoRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

