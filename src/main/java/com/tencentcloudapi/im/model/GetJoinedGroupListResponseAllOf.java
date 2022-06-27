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
import com.tencentcloudapi.im.model.GetJoinedGroupListResponseAllOfGroupIdList;
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
 * GetJoinedGroupListResponseAllOf
 */

public class GetJoinedGroupListResponseAllOf {
  public static final String SERIALIZED_NAME_TOTAL_COUNT = "TotalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_GROUP_ID_LIST = "GroupIdList";
  @SerializedName(SERIALIZED_NAME_GROUP_ID_LIST)
  private List<GetJoinedGroupListResponseAllOfGroupIdList> groupIdList = null;

  public GetJoinedGroupListResponseAllOf() { 
  }

  public GetJoinedGroupListResponseAllOf totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 用户所加入的群组个数
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户所加入的群组个数")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public GetJoinedGroupListResponseAllOf groupIdList(List<GetJoinedGroupListResponseAllOfGroupIdList> groupIdList) {
    
    this.groupIdList = groupIdList;
    return this;
  }

  public GetJoinedGroupListResponseAllOf addGroupIdListItem(GetJoinedGroupListResponseAllOfGroupIdList groupIdListItem) {
    if (this.groupIdList == null) {
      this.groupIdList = new ArrayList<>();
    }
    this.groupIdList.add(groupIdListItem);
    return this;
  }

   /**
   * 拉取到的群组信息，返回的结果是根据过滤器中设置的过滤字段进行过滤后的信息，字段详情请参阅 群组数据结构介绍（https://cloud.tencent.com/document/product/269/1502#.E7.BE.A4.E7.BB.84.E6.95.B0.E6.8D.AE.E7.BB.93.E6.9E.84.E4.BB.8B.E7.BB.8D）
   * @return groupIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "拉取到的群组信息，返回的结果是根据过滤器中设置的过滤字段进行过滤后的信息，字段详情请参阅 群组数据结构介绍（https://cloud.tencent.com/document/product/269/1502#.E7.BE.A4.E7.BB.84.E6.95.B0.E6.8D.AE.E7.BB.93.E6.9E.84.E4.BB.8B.E7.BB.8D）")

  public List<GetJoinedGroupListResponseAllOfGroupIdList> getGroupIdList() {
    return groupIdList;
  }


  public void setGroupIdList(List<GetJoinedGroupListResponseAllOfGroupIdList> groupIdList) {
    this.groupIdList = groupIdList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetJoinedGroupListResponseAllOf getJoinedGroupListResponseAllOf = (GetJoinedGroupListResponseAllOf) o;
    return Objects.equals(this.totalCount, getJoinedGroupListResponseAllOf.totalCount) &&
        Objects.equals(this.groupIdList, getJoinedGroupListResponseAllOf.groupIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, groupIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetJoinedGroupListResponseAllOf {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    groupIdList: ").append(toIndentedString(groupIdList)).append("\n");
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
    openapiFields.add("TotalCount");
    openapiFields.add("GroupIdList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetJoinedGroupListResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetJoinedGroupListResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetJoinedGroupListResponseAllOf is not found in the empty JSON string", GetJoinedGroupListResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetJoinedGroupListResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetJoinedGroupListResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraygroupIdList = jsonObj.getAsJsonArray("GroupIdList");
      if (jsonArraygroupIdList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("GroupIdList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `GroupIdList` to be an array in the JSON string but got `%s`", jsonObj.get("GroupIdList").toString()));
        }

        // validate the optional field `GroupIdList` (array)
        for (int i = 0; i < jsonArraygroupIdList.size(); i++) {
          GetJoinedGroupListResponseAllOfGroupIdList.validateJsonObject(jsonArraygroupIdList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetJoinedGroupListResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetJoinedGroupListResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetJoinedGroupListResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetJoinedGroupListResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetJoinedGroupListResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GetJoinedGroupListResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetJoinedGroupListResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetJoinedGroupListResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetJoinedGroupListResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GetJoinedGroupListResponseAllOf
  */
  public static GetJoinedGroupListResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetJoinedGroupListResponseAllOf.class);
  }

 /**
  * Convert an instance of GetJoinedGroupListResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

