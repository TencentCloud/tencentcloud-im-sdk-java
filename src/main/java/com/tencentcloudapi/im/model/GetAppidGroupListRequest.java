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
 * GetAppidGroupListRequest
 */

public class GetAppidGroupListRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LIMIT = "Limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit = 10000;

  public static final String SERIALIZED_NAME_NEXT = "Next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private Integer next;

  public static final String SERIALIZED_NAME_GROUP_TYPE = "GroupType";
  @SerializedName(SERIALIZED_NAME_GROUP_TYPE)
  private String groupType;

  public GetAppidGroupListRequest() { 
  }

  public GetAppidGroupListRequest limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * 本次获取的群组 ID 数量的上限，不得超过 10000。如果不填，默认为最大值 10000
   * maximum: 10000
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "本次获取的群组 ID 数量的上限，不得超过 10000。如果不填，默认为最大值 10000")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public GetAppidGroupListRequest next(Integer next) {
    
    this.next = next;
    return this;
  }

   /**
   * 群太多时分页拉取标志，第一次填0，以后填上一次返回的值，返回的 Next 为0代表拉完了
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群太多时分页拉取标志，第一次填0，以后填上一次返回的值，返回的 Next 为0代表拉完了")

  public Integer getNext() {
    return next;
  }


  public void setNext(Integer next) {
    this.next = next;
  }


  public GetAppidGroupListRequest groupType(String groupType) {
    
    this.groupType = groupType;
    return this;
  }

   /**
   * 如果仅需要返回特定群组形态的群组，可以通过 GroupType 进行过滤，但此时返回的 TotalCount 的含义就变成了 App 中属于该群组形态的群组总数。不填为获取所有类型的群组。群组形态包括 Public（公开群），Private（即 Work，好友工作群），ChatRoom（即 Meeting，会议群），AVChatRoom（音视频聊天室），BChatRoom（在线成员广播大群）和社群（Community）
   * @return groupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "如果仅需要返回特定群组形态的群组，可以通过 GroupType 进行过滤，但此时返回的 TotalCount 的含义就变成了 App 中属于该群组形态的群组总数。不填为获取所有类型的群组。群组形态包括 Public（公开群），Private（即 Work，好友工作群），ChatRoom（即 Meeting，会议群），AVChatRoom（音视频聊天室），BChatRoom（在线成员广播大群）和社群（Community）")

  public String getGroupType() {
    return groupType;
  }


  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAppidGroupListRequest getAppidGroupListRequest = (GetAppidGroupListRequest) o;
    return Objects.equals(this.limit, getAppidGroupListRequest.limit) &&
        Objects.equals(this.next, getAppidGroupListRequest.next) &&
        Objects.equals(this.groupType, getAppidGroupListRequest.groupType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, next, groupType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAppidGroupListRequest {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
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
    openapiFields.add("Limit");
    openapiFields.add("Next");
    openapiFields.add("GroupType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetAppidGroupListRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetAppidGroupListRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAppidGroupListRequest is not found in the empty JSON string", GetAppidGroupListRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetAppidGroupListRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAppidGroupListRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("GroupType") != null && !jsonObj.get("GroupType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAppidGroupListRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAppidGroupListRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAppidGroupListRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAppidGroupListRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAppidGroupListRequest>() {
           @Override
           public void write(JsonWriter out, GetAppidGroupListRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAppidGroupListRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAppidGroupListRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAppidGroupListRequest
  * @throws IOException if the JSON string is invalid with respect to GetAppidGroupListRequest
  */
  public static GetAppidGroupListRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAppidGroupListRequest.class);
  }

 /**
  * Convert an instance of GetAppidGroupListRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

