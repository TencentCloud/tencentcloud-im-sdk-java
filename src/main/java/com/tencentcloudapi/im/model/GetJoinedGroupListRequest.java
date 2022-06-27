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
import com.tencentcloudapi.im.model.GetJoinedGroupListRequestResponseFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * GetJoinedGroupListRequest
 */

public class GetJoinedGroupListRequest {
  public static final String SERIALIZED_NAME_MEMBER_ACCOUNT = "Member_Account";
  @SerializedName(SERIALIZED_NAME_MEMBER_ACCOUNT)
  private String memberAccount;

  /**
   * 是否获取用户加入的 AVChatRoom(直播群)，0表示不获取，1表示获取。默认为0
   */
  @JsonAdapter(WithHugeGroupsEnum.Adapter.class)
  public enum WithHugeGroupsEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    WithHugeGroupsEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WithHugeGroupsEnum fromValue(Integer value) {
      for (WithHugeGroupsEnum b : WithHugeGroupsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WithHugeGroupsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WithHugeGroupsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WithHugeGroupsEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return WithHugeGroupsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WITH_HUGE_GROUPS = "WithHugeGroups";
  @SerializedName(SERIALIZED_NAME_WITH_HUGE_GROUPS)
  private WithHugeGroupsEnum withHugeGroups;

  /**
   * 是否获取用户已加入但未激活的 Private（即新版本中 Work，好友工作群) 群信息，0表示不获取，1表示获取。默认为0
   */
  @JsonAdapter(WithNoActiveGroupsEnum.Adapter.class)
  public enum WithNoActiveGroupsEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    WithNoActiveGroupsEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WithNoActiveGroupsEnum fromValue(Integer value) {
      for (WithNoActiveGroupsEnum b : WithNoActiveGroupsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WithNoActiveGroupsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WithNoActiveGroupsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WithNoActiveGroupsEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return WithNoActiveGroupsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WITH_NO_ACTIVE_GROUPS = "WithNoActiveGroups";
  @SerializedName(SERIALIZED_NAME_WITH_NO_ACTIVE_GROUPS)
  private WithNoActiveGroupsEnum withNoActiveGroups;

  public static final String SERIALIZED_NAME_LIMIT = "Limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_OFFSET = "Offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_GROUP_TYPE = "GroupType";
  @SerializedName(SERIALIZED_NAME_GROUP_TYPE)
  private String groupType;

  public static final String SERIALIZED_NAME_RESPONSE_FILTER = "ResponseFilter";
  @SerializedName(SERIALIZED_NAME_RESPONSE_FILTER)
  private GetJoinedGroupListRequestResponseFilter responseFilter;

  public GetJoinedGroupListRequest() { 
  }

  public GetJoinedGroupListRequest memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * 需要查询的用户帐号
   * @return memberAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "需要查询的用户帐号")

  public String getMemberAccount() {
    return memberAccount;
  }


  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  public GetJoinedGroupListRequest withHugeGroups(WithHugeGroupsEnum withHugeGroups) {
    
    this.withHugeGroups = withHugeGroups;
    return this;
  }

   /**
   * 是否获取用户加入的 AVChatRoom(直播群)，0表示不获取，1表示获取。默认为0
   * @return withHugeGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否获取用户加入的 AVChatRoom(直播群)，0表示不获取，1表示获取。默认为0")

  public WithHugeGroupsEnum getWithHugeGroups() {
    return withHugeGroups;
  }


  public void setWithHugeGroups(WithHugeGroupsEnum withHugeGroups) {
    this.withHugeGroups = withHugeGroups;
  }


  public GetJoinedGroupListRequest withNoActiveGroups(WithNoActiveGroupsEnum withNoActiveGroups) {
    
    this.withNoActiveGroups = withNoActiveGroups;
    return this;
  }

   /**
   * 是否获取用户已加入但未激活的 Private（即新版本中 Work，好友工作群) 群信息，0表示不获取，1表示获取。默认为0
   * @return withNoActiveGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否获取用户已加入但未激活的 Private（即新版本中 Work，好友工作群) 群信息，0表示不获取，1表示获取。默认为0")

  public WithNoActiveGroupsEnum getWithNoActiveGroups() {
    return withNoActiveGroups;
  }


  public void setWithNoActiveGroups(WithNoActiveGroupsEnum withNoActiveGroups) {
    this.withNoActiveGroups = withNoActiveGroups;
  }


  public GetJoinedGroupListRequest limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * 单次拉取的群组数量，如果不填代表所有群组
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单次拉取的群组数量，如果不填代表所有群组")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public GetJoinedGroupListRequest offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * 从第多少个群组开始拉取
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "从第多少个群组开始拉取")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public GetJoinedGroupListRequest groupType(String groupType) {
    
    this.groupType = groupType;
    return this;
  }

   /**
   * 拉取哪种群组类型，例如 Public(陌生人社交群)，Private（即新版本Work，好友工作群)，ChatRoom （即新版本Meeting，会议群），AVChatRoom(直播群)，Community（社群），不填为拉取所有
   * @return groupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "拉取哪种群组类型，例如 Public(陌生人社交群)，Private（即新版本Work，好友工作群)，ChatRoom （即新版本Meeting，会议群），AVChatRoom(直播群)，Community（社群），不填为拉取所有")

  public String getGroupType() {
    return groupType;
  }


  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }


  public GetJoinedGroupListRequest responseFilter(GetJoinedGroupListRequestResponseFilter responseFilter) {
    
    this.responseFilter = responseFilter;
    return this;
  }

   /**
   * Get responseFilter
   * @return responseFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetJoinedGroupListRequestResponseFilter getResponseFilter() {
    return responseFilter;
  }


  public void setResponseFilter(GetJoinedGroupListRequestResponseFilter responseFilter) {
    this.responseFilter = responseFilter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetJoinedGroupListRequest getJoinedGroupListRequest = (GetJoinedGroupListRequest) o;
    return Objects.equals(this.memberAccount, getJoinedGroupListRequest.memberAccount) &&
        Objects.equals(this.withHugeGroups, getJoinedGroupListRequest.withHugeGroups) &&
        Objects.equals(this.withNoActiveGroups, getJoinedGroupListRequest.withNoActiveGroups) &&
        Objects.equals(this.limit, getJoinedGroupListRequest.limit) &&
        Objects.equals(this.offset, getJoinedGroupListRequest.offset) &&
        Objects.equals(this.groupType, getJoinedGroupListRequest.groupType) &&
        Objects.equals(this.responseFilter, getJoinedGroupListRequest.responseFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAccount, withHugeGroups, withNoActiveGroups, limit, offset, groupType, responseFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetJoinedGroupListRequest {\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    withHugeGroups: ").append(toIndentedString(withHugeGroups)).append("\n");
    sb.append("    withNoActiveGroups: ").append(toIndentedString(withNoActiveGroups)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    responseFilter: ").append(toIndentedString(responseFilter)).append("\n");
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
    openapiFields.add("Member_Account");
    openapiFields.add("WithHugeGroups");
    openapiFields.add("WithNoActiveGroups");
    openapiFields.add("Limit");
    openapiFields.add("Offset");
    openapiFields.add("GroupType");
    openapiFields.add("ResponseFilter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Member_Account");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetJoinedGroupListRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetJoinedGroupListRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetJoinedGroupListRequest is not found in the empty JSON string", GetJoinedGroupListRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetJoinedGroupListRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetJoinedGroupListRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetJoinedGroupListRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Member_Account") != null && !jsonObj.get("Member_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Member_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Member_Account").toString()));
      }
      if (jsonObj.get("GroupType") != null && !jsonObj.get("GroupType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupType").toString()));
      }
      // validate the optional field `ResponseFilter`
      if (jsonObj.getAsJsonObject("ResponseFilter") != null) {
        GetJoinedGroupListRequestResponseFilter.validateJsonObject(jsonObj.getAsJsonObject("ResponseFilter"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetJoinedGroupListRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetJoinedGroupListRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetJoinedGroupListRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetJoinedGroupListRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetJoinedGroupListRequest>() {
           @Override
           public void write(JsonWriter out, GetJoinedGroupListRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetJoinedGroupListRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetJoinedGroupListRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetJoinedGroupListRequest
  * @throws IOException if the JSON string is invalid with respect to GetJoinedGroupListRequest
  */
  public static GetJoinedGroupListRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetJoinedGroupListRequest.class);
  }

 /**
  * Convert an instance of GetJoinedGroupListRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

