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
import com.tencentcloudapi.im.model.GetGroupInfoResponseAllOfGroupInfo;
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
 * GetGroupInfoResponseAllOf
 */

public class GetGroupInfoResponseAllOf {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GROUP_INFO = "GroupInfo";
  @SerializedName(SERIALIZED_NAME_GROUP_INFO)
  private List<GetGroupInfoResponseAllOfGroupInfo> groupInfo = null;

  public GetGroupInfoResponseAllOf() { 
  }

  public GetGroupInfoResponseAllOf groupInfo(List<GetGroupInfoResponseAllOfGroupInfo> groupInfo) {
    
    this.groupInfo = groupInfo;
    return this;
  }

  public GetGroupInfoResponseAllOf addGroupInfoItem(GetGroupInfoResponseAllOfGroupInfo groupInfoItem) {
    if (this.groupInfo == null) {
      this.groupInfo = new ArrayList<>();
    }
    this.groupInfo.add(groupInfoItem);
    return this;
  }

   /**
   * 返回结果为群组信息数组，内容包括群基础资料字段、群成员资料字段、群组维度自定义字段和群成员维度自定义字段，字段详情请参阅 群组数据结构介绍（https://cloud.tencent.com/document/product/269/1502#.E7.BE.A4.E7.BB.84.E6.95.B0.E6.8D.AE.E7.BB.93.E6.9E.84.E4.BB.8B.E7.BB.8D）
   * @return groupInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回结果为群组信息数组，内容包括群基础资料字段、群成员资料字段、群组维度自定义字段和群成员维度自定义字段，字段详情请参阅 群组数据结构介绍（https://cloud.tencent.com/document/product/269/1502#.E7.BE.A4.E7.BB.84.E6.95.B0.E6.8D.AE.E7.BB.93.E6.9E.84.E4.BB.8B.E7.BB.8D）")

  public List<GetGroupInfoResponseAllOfGroupInfo> getGroupInfo() {
    return groupInfo;
  }


  public void setGroupInfo(List<GetGroupInfoResponseAllOfGroupInfo> groupInfo) {
    this.groupInfo = groupInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupInfoResponseAllOf getGroupInfoResponseAllOf = (GetGroupInfoResponseAllOf) o;
    return Objects.equals(this.groupInfo, getGroupInfoResponseAllOf.groupInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupInfoResponseAllOf {\n");
    sb.append("    groupInfo: ").append(toIndentedString(groupInfo)).append("\n");
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
    openapiFields.add("GroupInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetGroupInfoResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetGroupInfoResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupInfoResponseAllOf is not found in the empty JSON string", GetGroupInfoResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetGroupInfoResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGroupInfoResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraygroupInfo = jsonObj.getAsJsonArray("GroupInfo");
      if (jsonArraygroupInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("GroupInfo").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `GroupInfo` to be an array in the JSON string but got `%s`", jsonObj.get("GroupInfo").toString()));
        }

        // validate the optional field `GroupInfo` (array)
        for (int i = 0; i < jsonArraygroupInfo.size(); i++) {
          GetGroupInfoResponseAllOfGroupInfo.validateJsonObject(jsonArraygroupInfo.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupInfoResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupInfoResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupInfoResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupInfoResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupInfoResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GetGroupInfoResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGroupInfoResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGroupInfoResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGroupInfoResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GetGroupInfoResponseAllOf
  */
  public static GetGroupInfoResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupInfoResponseAllOf.class);
  }

 /**
  * Convert an instance of GetGroupInfoResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

