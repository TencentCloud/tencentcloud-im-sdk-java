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
import com.tencentcloudapi.im.model.GetAppidGroupListResponseAllOfGroupIdList;
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
 * GetAppidGroupListResponseAllOf
 */

public class GetAppidGroupListResponseAllOf {
  public static final String SERIALIZED_NAME_TOTAL_COUNT = "TotalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_GROUP_ID_LIST = "GroupIdList";
  @SerializedName(SERIALIZED_NAME_GROUP_ID_LIST)
  private List<GetAppidGroupListResponseAllOfGroupIdList> groupIdList = null;

  public static final String SERIALIZED_NAME_NEXT = "Next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private Integer next;

  public GetAppidGroupListResponseAllOf() { 
  }

  public GetAppidGroupListResponseAllOf totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * App 当前的群组总数。如果仅需要返回特定群组形态的群组，可以通过 GroupType 进行过滤，但此时返回的 TotalCount 的含义就变成了 App 中该群组形态的群组总数；例如：假设 App 旗下总共 50000 个群组，其中有 20000 个为公开群组，如果将请求包体中的 GroupType 设置为 Public，那么不论 Limit 和 Offset 怎样设置，应答包体中的 TotalCount 都为 20000，且 GroupIdList 中的群组全部为公开群组
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "App 当前的群组总数。如果仅需要返回特定群组形态的群组，可以通过 GroupType 进行过滤，但此时返回的 TotalCount 的含义就变成了 App 中该群组形态的群组总数；例如：假设 App 旗下总共 50000 个群组，其中有 20000 个为公开群组，如果将请求包体中的 GroupType 设置为 Public，那么不论 Limit 和 Offset 怎样设置，应答包体中的 TotalCount 都为 20000，且 GroupIdList 中的群组全部为公开群组")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public GetAppidGroupListResponseAllOf groupIdList(List<GetAppidGroupListResponseAllOfGroupIdList> groupIdList) {
    
    this.groupIdList = groupIdList;
    return this;
  }

  public GetAppidGroupListResponseAllOf addGroupIdListItem(GetAppidGroupListResponseAllOfGroupIdList groupIdListItem) {
    if (this.groupIdList == null) {
      this.groupIdList = new ArrayList<>();
    }
    this.groupIdList.add(groupIdListItem);
    return this;
  }

   /**
   * 获取到的群组 ID 的集合
   * @return groupIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "获取到的群组 ID 的集合")

  public List<GetAppidGroupListResponseAllOfGroupIdList> getGroupIdList() {
    return groupIdList;
  }


  public void setGroupIdList(List<GetAppidGroupListResponseAllOfGroupIdList> groupIdList) {
    this.groupIdList = groupIdList;
  }


  public GetAppidGroupListResponseAllOf next(Integer next) {
    
    this.next = next;
    return this;
  }

   /**
   * 分页拉取的标志
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分页拉取的标志")

  public Integer getNext() {
    return next;
  }


  public void setNext(Integer next) {
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
  public GetAppidGroupListResponseAllOf putAdditionalProperty(String key, Object value) {
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
    GetAppidGroupListResponseAllOf getAppidGroupListResponseAllOf = (GetAppidGroupListResponseAllOf) o;
    return Objects.equals(this.totalCount, getAppidGroupListResponseAllOf.totalCount) &&
        Objects.equals(this.groupIdList, getAppidGroupListResponseAllOf.groupIdList) &&
        Objects.equals(this.next, getAppidGroupListResponseAllOf.next)&&
        Objects.equals(this.additionalProperties, getAppidGroupListResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, groupIdList, next, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAppidGroupListResponseAllOf {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    groupIdList: ").append(toIndentedString(groupIdList)).append("\n");
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
    openapiFields.add("TotalCount");
    openapiFields.add("GroupIdList");
    openapiFields.add("Next");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetAppidGroupListResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetAppidGroupListResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAppidGroupListResponseAllOf is not found in the empty JSON string", GetAppidGroupListResponseAllOf.openapiRequiredFields.toString()));
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
          GetAppidGroupListResponseAllOfGroupIdList.validateJsonObject(jsonArraygroupIdList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAppidGroupListResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAppidGroupListResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAppidGroupListResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAppidGroupListResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAppidGroupListResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GetAppidGroupListResponseAllOf value) throws IOException {
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
           public GetAppidGroupListResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetAppidGroupListResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetAppidGroupListResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAppidGroupListResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GetAppidGroupListResponseAllOf
  */
  public static GetAppidGroupListResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAppidGroupListResponseAllOf.class);
  }

 /**
  * Convert an instance of GetAppidGroupListResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

