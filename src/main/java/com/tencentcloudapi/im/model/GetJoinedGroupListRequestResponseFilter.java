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
 * 分别包含 GroupBaseInfoFilter 和 SelfInfoFilter 两个过滤器； GroupBaseInfoFilter 表示需要拉取哪些基础信息字段，详情请参阅 群组系统；SelfInfoFilter 表示需要拉取用户在每个群组中的哪些个人资料，详情请参阅 群组系统 。
 */
@ApiModel(description = "分别包含 GroupBaseInfoFilter 和 SelfInfoFilter 两个过滤器； GroupBaseInfoFilter 表示需要拉取哪些基础信息字段，详情请参阅 群组系统；SelfInfoFilter 表示需要拉取用户在每个群组中的哪些个人资料，详情请参阅 群组系统 。")

public class GetJoinedGroupListRequestResponseFilter {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GROUP_BASE_INFO_FILTER = "GroupBaseInfoFilter";
  @SerializedName(SERIALIZED_NAME_GROUP_BASE_INFO_FILTER)
  private List<String> groupBaseInfoFilter = null;

  public static final String SERIALIZED_NAME_SELF_INFO_FILTER = "SelfInfoFilter";
  @SerializedName(SERIALIZED_NAME_SELF_INFO_FILTER)
  private List<String> selfInfoFilter = null;

  public GetJoinedGroupListRequestResponseFilter() { 
  }

  public GetJoinedGroupListRequestResponseFilter groupBaseInfoFilter(List<String> groupBaseInfoFilter) {
    
    this.groupBaseInfoFilter = groupBaseInfoFilter;
    return this;
  }

  public GetJoinedGroupListRequestResponseFilter addGroupBaseInfoFilterItem(String groupBaseInfoFilterItem) {
    if (this.groupBaseInfoFilter == null) {
      this.groupBaseInfoFilter = new ArrayList<>();
    }
    this.groupBaseInfoFilter.add(groupBaseInfoFilterItem);
    return this;
  }

   /**
   * 需要拉取哪些基础信息字段，详情请参阅 群组系统（https://cloud.tencent.com/document/product/269/1502#GroupBaseInfoFilter）
   * @return groupBaseInfoFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "需要拉取哪些基础信息字段，详情请参阅 群组系统（https://cloud.tencent.com/document/product/269/1502#GroupBaseInfoFilter）")

  public List<String> getGroupBaseInfoFilter() {
    return groupBaseInfoFilter;
  }


  public void setGroupBaseInfoFilter(List<String> groupBaseInfoFilter) {
    this.groupBaseInfoFilter = groupBaseInfoFilter;
  }


  public GetJoinedGroupListRequestResponseFilter selfInfoFilter(List<String> selfInfoFilter) {
    
    this.selfInfoFilter = selfInfoFilter;
    return this;
  }

  public GetJoinedGroupListRequestResponseFilter addSelfInfoFilterItem(String selfInfoFilterItem) {
    if (this.selfInfoFilter == null) {
      this.selfInfoFilter = new ArrayList<>();
    }
    this.selfInfoFilter.add(selfInfoFilterItem);
    return this;
  }

   /**
   * 需要拉取用户在每个群组中的哪些个人资料，详情请参阅 群组系统 （https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）。
   * @return selfInfoFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "需要拉取用户在每个群组中的哪些个人资料，详情请参阅 群组系统 （https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）。")

  public List<String> getSelfInfoFilter() {
    return selfInfoFilter;
  }


  public void setSelfInfoFilter(List<String> selfInfoFilter) {
    this.selfInfoFilter = selfInfoFilter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetJoinedGroupListRequestResponseFilter getJoinedGroupListRequestResponseFilter = (GetJoinedGroupListRequestResponseFilter) o;
    return Objects.equals(this.groupBaseInfoFilter, getJoinedGroupListRequestResponseFilter.groupBaseInfoFilter) &&
        Objects.equals(this.selfInfoFilter, getJoinedGroupListRequestResponseFilter.selfInfoFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupBaseInfoFilter, selfInfoFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetJoinedGroupListRequestResponseFilter {\n");
    sb.append("    groupBaseInfoFilter: ").append(toIndentedString(groupBaseInfoFilter)).append("\n");
    sb.append("    selfInfoFilter: ").append(toIndentedString(selfInfoFilter)).append("\n");
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
    openapiFields.add("SelfInfoFilter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetJoinedGroupListRequestResponseFilter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetJoinedGroupListRequestResponseFilter.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetJoinedGroupListRequestResponseFilter is not found in the empty JSON string", GetJoinedGroupListRequestResponseFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetJoinedGroupListRequestResponseFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetJoinedGroupListRequestResponseFilter` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("GroupBaseInfoFilter") != null && !jsonObj.get("GroupBaseInfoFilter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupBaseInfoFilter` to be an array in the JSON string but got `%s`", jsonObj.get("GroupBaseInfoFilter").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("SelfInfoFilter") != null && !jsonObj.get("SelfInfoFilter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SelfInfoFilter` to be an array in the JSON string but got `%s`", jsonObj.get("SelfInfoFilter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetJoinedGroupListRequestResponseFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetJoinedGroupListRequestResponseFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetJoinedGroupListRequestResponseFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetJoinedGroupListRequestResponseFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<GetJoinedGroupListRequestResponseFilter>() {
           @Override
           public void write(JsonWriter out, GetJoinedGroupListRequestResponseFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetJoinedGroupListRequestResponseFilter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetJoinedGroupListRequestResponseFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetJoinedGroupListRequestResponseFilter
  * @throws IOException if the JSON string is invalid with respect to GetJoinedGroupListRequestResponseFilter
  */
  public static GetJoinedGroupListRequestResponseFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetJoinedGroupListRequestResponseFilter.class);
  }

 /**
  * Convert an instance of GetJoinedGroupListRequestResponseFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

