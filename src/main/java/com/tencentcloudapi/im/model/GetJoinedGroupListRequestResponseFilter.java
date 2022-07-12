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
 * 分别包含 GroupBaseInfoFilter 和 SelfInfoFilter 两个过滤器； GroupBaseInfoFilter 表示需要拉取哪些基础信息字段，详情请参阅 群组系统；SelfInfoFilter 表示需要拉取用户在每个群组中的哪些个人资料，详情请参阅 群组系统 。
 */
@ApiModel(description = "分别包含 GroupBaseInfoFilter 和 SelfInfoFilter 两个过滤器； GroupBaseInfoFilter 表示需要拉取哪些基础信息字段，详情请参阅 群组系统；SelfInfoFilter 表示需要拉取用户在每个群组中的哪些个人资料，详情请参阅 群组系统 。")

public class GetJoinedGroupListRequestResponseFilter {
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
  public GetJoinedGroupListRequestResponseFilter putAdditionalProperty(String key, Object value) {
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
    GetJoinedGroupListRequestResponseFilter getJoinedGroupListRequestResponseFilter = (GetJoinedGroupListRequestResponseFilter) o;
    return Objects.equals(this.groupBaseInfoFilter, getJoinedGroupListRequestResponseFilter.groupBaseInfoFilter) &&
        Objects.equals(this.selfInfoFilter, getJoinedGroupListRequestResponseFilter.selfInfoFilter)&&
        Objects.equals(this.additionalProperties, getJoinedGroupListRequestResponseFilter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupBaseInfoFilter, selfInfoFilter, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetJoinedGroupListRequestResponseFilter {\n");
    sb.append("    groupBaseInfoFilter: ").append(toIndentedString(groupBaseInfoFilter)).append("\n");
    sb.append("    selfInfoFilter: ").append(toIndentedString(selfInfoFilter)).append("\n");
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
           public GetJoinedGroupListRequestResponseFilter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetJoinedGroupListRequestResponseFilter instance = thisAdapter.fromJsonTree(jsonObj);
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

