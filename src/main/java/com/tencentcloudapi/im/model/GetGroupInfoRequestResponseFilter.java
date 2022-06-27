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
 * 包含三个过滤器：GroupBaseInfoFilter，MemberInfoFilter，AppDefinedDataFilter_Group，分别是基础信息字段过滤器，成员信息字段过滤器，群组维度的自定义字段过滤器
 */
@ApiModel(description = "包含三个过滤器：GroupBaseInfoFilter，MemberInfoFilter，AppDefinedDataFilter_Group，分别是基础信息字段过滤器，成员信息字段过滤器，群组维度的自定义字段过滤器")

public class GetGroupInfoRequestResponseFilter {
  public static final String SERIALIZED_NAME_GROUP_BASE_INFO_FILTER = "GroupBaseInfoFilter";
  @SerializedName(SERIALIZED_NAME_GROUP_BASE_INFO_FILTER)
  private List<String> groupBaseInfoFilter = null;

  public static final String SERIALIZED_NAME_MEMBER_INFO_FILTER = "MemberInfoFilter";
  @SerializedName(SERIALIZED_NAME_MEMBER_INFO_FILTER)
  private List<String> memberInfoFilter = null;

  public static final String SERIALIZED_NAME_APP_DEFINED_DATA_FILTER_GROUP = "AppDefinedDataFilter_Group";
  @SerializedName(SERIALIZED_NAME_APP_DEFINED_DATA_FILTER_GROUP)
  private List<String> appDefinedDataFilterGroup = null;

  public static final String SERIALIZED_NAME_APP_DEFINED_DATA_FILTER_GROUP_MEMBER = "AppDefinedDataFilter_GroupMember";
  @SerializedName(SERIALIZED_NAME_APP_DEFINED_DATA_FILTER_GROUP_MEMBER)
  private List<String> appDefinedDataFilterGroupMember = null;

  public GetGroupInfoRequestResponseFilter() { 
  }

  public GetGroupInfoRequestResponseFilter groupBaseInfoFilter(List<String> groupBaseInfoFilter) {
    
    this.groupBaseInfoFilter = groupBaseInfoFilter;
    return this;
  }

  public GetGroupInfoRequestResponseFilter addGroupBaseInfoFilterItem(String groupBaseInfoFilterItem) {
    if (this.groupBaseInfoFilter == null) {
      this.groupBaseInfoFilter = new ArrayList<>();
    }
    this.groupBaseInfoFilter.add(groupBaseInfoFilterItem);
    return this;
  }

   /**
   * 基础信息字段过滤器，指定需要获取的基础信息字段，基础信息字段详情请参阅 群基础资料（https://cloud.tencent.com/document/product/269/1502#GroupBaseInfoFilter）
   * @return groupBaseInfoFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "基础信息字段过滤器，指定需要获取的基础信息字段，基础信息字段详情请参阅 群基础资料（https://cloud.tencent.com/document/product/269/1502#GroupBaseInfoFilter）")

  public List<String> getGroupBaseInfoFilter() {
    return groupBaseInfoFilter;
  }


  public void setGroupBaseInfoFilter(List<String> groupBaseInfoFilter) {
    this.groupBaseInfoFilter = groupBaseInfoFilter;
  }


  public GetGroupInfoRequestResponseFilter memberInfoFilter(List<String> memberInfoFilter) {
    
    this.memberInfoFilter = memberInfoFilter;
    return this;
  }

  public GetGroupInfoRequestResponseFilter addMemberInfoFilterItem(String memberInfoFilterItem) {
    if (this.memberInfoFilter == null) {
      this.memberInfoFilter = new ArrayList<>();
    }
    this.memberInfoFilter.add(memberInfoFilterItem);
    return this;
  }

   /**
   * 成员信息字段过滤器，指定需要获取的成员信息字段，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）
   * @return memberInfoFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "成员信息字段过滤器，指定需要获取的成员信息字段，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）")

  public List<String> getMemberInfoFilter() {
    return memberInfoFilter;
  }


  public void setMemberInfoFilter(List<String> memberInfoFilter) {
    this.memberInfoFilter = memberInfoFilter;
  }


  public GetGroupInfoRequestResponseFilter appDefinedDataFilterGroup(List<String> appDefinedDataFilterGroup) {
    
    this.appDefinedDataFilterGroup = appDefinedDataFilterGroup;
    return this;
  }

  public GetGroupInfoRequestResponseFilter addAppDefinedDataFilterGroupItem(String appDefinedDataFilterGroupItem) {
    if (this.appDefinedDataFilterGroup == null) {
      this.appDefinedDataFilterGroup = new ArrayList<>();
    }
    this.appDefinedDataFilterGroup.add(appDefinedDataFilterGroupItem);
    return this;
  }

   /**
   * 该字段用来群组维度的自定义字段过滤器，指定需要获取的群组维度的自定义字段，详情请参阅 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5）
   * @return appDefinedDataFilterGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该字段用来群组维度的自定义字段过滤器，指定需要获取的群组维度的自定义字段，详情请参阅 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5）")

  public List<String> getAppDefinedDataFilterGroup() {
    return appDefinedDataFilterGroup;
  }


  public void setAppDefinedDataFilterGroup(List<String> appDefinedDataFilterGroup) {
    this.appDefinedDataFilterGroup = appDefinedDataFilterGroup;
  }


  public GetGroupInfoRequestResponseFilter appDefinedDataFilterGroupMember(List<String> appDefinedDataFilterGroupMember) {
    
    this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
    return this;
  }

  public GetGroupInfoRequestResponseFilter addAppDefinedDataFilterGroupMemberItem(String appDefinedDataFilterGroupMemberItem) {
    if (this.appDefinedDataFilterGroupMember == null) {
      this.appDefinedDataFilterGroupMember = new ArrayList<>();
    }
    this.appDefinedDataFilterGroupMember.add(appDefinedDataFilterGroupMemberItem);
    return this;
  }

   /**
   * 该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段，详情请参阅 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5）
   * @return appDefinedDataFilterGroupMember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段，详情请参阅 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5）")

  public List<String> getAppDefinedDataFilterGroupMember() {
    return appDefinedDataFilterGroupMember;
  }


  public void setAppDefinedDataFilterGroupMember(List<String> appDefinedDataFilterGroupMember) {
    this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupInfoRequestResponseFilter getGroupInfoRequestResponseFilter = (GetGroupInfoRequestResponseFilter) o;
    return Objects.equals(this.groupBaseInfoFilter, getGroupInfoRequestResponseFilter.groupBaseInfoFilter) &&
        Objects.equals(this.memberInfoFilter, getGroupInfoRequestResponseFilter.memberInfoFilter) &&
        Objects.equals(this.appDefinedDataFilterGroup, getGroupInfoRequestResponseFilter.appDefinedDataFilterGroup) &&
        Objects.equals(this.appDefinedDataFilterGroupMember, getGroupInfoRequestResponseFilter.appDefinedDataFilterGroupMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupBaseInfoFilter, memberInfoFilter, appDefinedDataFilterGroup, appDefinedDataFilterGroupMember);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupInfoRequestResponseFilter {\n");
    sb.append("    groupBaseInfoFilter: ").append(toIndentedString(groupBaseInfoFilter)).append("\n");
    sb.append("    memberInfoFilter: ").append(toIndentedString(memberInfoFilter)).append("\n");
    sb.append("    appDefinedDataFilterGroup: ").append(toIndentedString(appDefinedDataFilterGroup)).append("\n");
    sb.append("    appDefinedDataFilterGroupMember: ").append(toIndentedString(appDefinedDataFilterGroupMember)).append("\n");
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
    openapiFields.add("GroupBaseInfoFilter");
    openapiFields.add("MemberInfoFilter");
    openapiFields.add("AppDefinedDataFilter_Group");
    openapiFields.add("AppDefinedDataFilter_GroupMember");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetGroupInfoRequestResponseFilter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetGroupInfoRequestResponseFilter.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupInfoRequestResponseFilter is not found in the empty JSON string", GetGroupInfoRequestResponseFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetGroupInfoRequestResponseFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGroupInfoRequestResponseFilter` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("GroupBaseInfoFilter") != null && !jsonObj.get("GroupBaseInfoFilter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupBaseInfoFilter` to be an array in the JSON string but got `%s`", jsonObj.get("GroupBaseInfoFilter").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("MemberInfoFilter") != null && !jsonObj.get("MemberInfoFilter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `MemberInfoFilter` to be an array in the JSON string but got `%s`", jsonObj.get("MemberInfoFilter").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("AppDefinedDataFilter_Group") != null && !jsonObj.get("AppDefinedDataFilter_Group").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `AppDefinedDataFilter_Group` to be an array in the JSON string but got `%s`", jsonObj.get("AppDefinedDataFilter_Group").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("AppDefinedDataFilter_GroupMember") != null && !jsonObj.get("AppDefinedDataFilter_GroupMember").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `AppDefinedDataFilter_GroupMember` to be an array in the JSON string but got `%s`", jsonObj.get("AppDefinedDataFilter_GroupMember").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupInfoRequestResponseFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupInfoRequestResponseFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupInfoRequestResponseFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupInfoRequestResponseFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupInfoRequestResponseFilter>() {
           @Override
           public void write(JsonWriter out, GetGroupInfoRequestResponseFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGroupInfoRequestResponseFilter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGroupInfoRequestResponseFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGroupInfoRequestResponseFilter
  * @throws IOException if the JSON string is invalid with respect to GetGroupInfoRequestResponseFilter
  */
  public static GetGroupInfoRequestResponseFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupInfoRequestResponseFilter.class);
  }

 /**
  * Convert an instance of GetGroupInfoRequestResponseFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

