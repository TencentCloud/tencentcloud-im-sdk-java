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
import com.tencentcloudapi.im.model.CreateGroupRequestMemberListInner;
import com.tencentcloudapi.im.model.DefinedData;
import com.tencentcloudapi.im.model.GroupType;
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
 * CreateGroupRequest
 */

public class CreateGroupRequest {
  public static final String SERIALIZED_NAME_OWNER_ACCOUNT = "Owner_Account";
  @SerializedName(SERIALIZED_NAME_OWNER_ACCOUNT)
  private String ownerAccount;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private GroupType type;

  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INTRODUCTION = "Introduction";
  @SerializedName(SERIALIZED_NAME_INTRODUCTION)
  private String introduction;

  public static final String SERIALIZED_NAME_NOTIFICATION = "Notification";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION)
  private String notification;

  public static final String SERIALIZED_NAME_FACE_URL = "FaceUrl";
  @SerializedName(SERIALIZED_NAME_FACE_URL)
  private String faceUrl;

  public static final String SERIALIZED_NAME_MAX_MEMBER_COUNT = "MaxMemberCount";
  @SerializedName(SERIALIZED_NAME_MAX_MEMBER_COUNT)
  private Integer maxMemberCount;

  /**
   * 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群），不填默认为 NeedPermission（需要验证） 仅当创建支持申请加群的 群组(https://cloud.tencent.com/document/product/269/1502#.E5.8A.A0.E7.BE.A4.E6.96.B9.E5.BC.8F.E5.B7.AE.E5.BC.82) 时，该字段有效
   */
  @JsonAdapter(ApplyJoinOptionEnum.Adapter.class)
  public enum ApplyJoinOptionEnum {
    FREEACCESS("FreeAccess"),
    
    NEEDPERMISSION("NeedPermission"),
    
    DISABLEAPPLY("DisableApply");

    private String value;

    ApplyJoinOptionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApplyJoinOptionEnum fromValue(String value) {
      for (ApplyJoinOptionEnum b : ApplyJoinOptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ApplyJoinOptionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApplyJoinOptionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApplyJoinOptionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ApplyJoinOptionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_APPLY_JOIN_OPTION = "ApplyJoinOption";
  @SerializedName(SERIALIZED_NAME_APPLY_JOIN_OPTION)
  private ApplyJoinOptionEnum applyJoinOption;

  public static final String SERIALIZED_NAME_APP_DEFINED_DATA = "AppDefinedData";
  @SerializedName(SERIALIZED_NAME_APP_DEFINED_DATA)
  private List<DefinedData> appDefinedData = null;

  public static final String SERIALIZED_NAME_MEMBER_LIST = "MemberList";
  @SerializedName(SERIALIZED_NAME_MEMBER_LIST)
  private List<CreateGroupRequestMemberListInner> memberList = null;

  public CreateGroupRequest() { 
  }

  public CreateGroupRequest ownerAccount(String ownerAccount) {
    
    this.ownerAccount = ownerAccount;
    return this;
  }

   /**
   * 群主 ID（需是 已导入(https://cloud.tencent.com/document/product/269/1608))的帐号）。填写后自动添加到群成员中；如果不填，群没有群主
   * @return ownerAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群主 ID（需是 已导入(https://cloud.tencent.com/document/product/269/1608))的帐号）。填写后自动添加到群成员中；如果不填，群没有群主")

  public String getOwnerAccount() {
    return ownerAccount;
  }


  public void setOwnerAccount(String ownerAccount) {
    this.ownerAccount = ownerAccount;
  }


  public CreateGroupRequest type(GroupType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GroupType getType() {
    return type;
  }


  public void setType(GroupType type) {
    this.type = type;
  }


  public CreateGroupRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 为了使得群组 ID 更加简单，便于记忆传播，腾讯云支持 App 在通过 REST API 创建群组时 自定义群组 ID(https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E7.BE.A4.E7.BB.84-id)
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "为了使得群组 ID 更加简单，便于记忆传播，腾讯云支持 App 在通过 REST API 创建群组时 自定义群组 ID(https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E7.BE.A4.E7.BB.84-id)")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public CreateGroupRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 群名称，最长30字节，使用 UTF-8 编码，1个汉字占3个字节
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "群名称，最长30字节，使用 UTF-8 编码，1个汉字占3个字节")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateGroupRequest introduction(String introduction) {
    
    this.introduction = introduction;
    return this;
  }

   /**
   * 群简介，最长240字节，使用 UTF-8 编码，1个汉字占3个字节
   * @return introduction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群简介，最长240字节，使用 UTF-8 编码，1个汉字占3个字节")

  public String getIntroduction() {
    return introduction;
  }


  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public CreateGroupRequest notification(String notification) {
    
    this.notification = notification;
    return this;
  }

   /**
   * 群公告，最长300字节，使用 UTF-8 编码，1个汉字占3个字节
   * @return notification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群公告，最长300字节，使用 UTF-8 编码，1个汉字占3个字节")

  public String getNotification() {
    return notification;
  }


  public void setNotification(String notification) {
    this.notification = notification;
  }


  public CreateGroupRequest faceUrl(String faceUrl) {
    
    this.faceUrl = faceUrl;
    return this;
  }

   /**
   * 群头像 URL，最长100字节
   * @return faceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群头像 URL，最长100字节")

  public String getFaceUrl() {
    return faceUrl;
  }


  public void setFaceUrl(String faceUrl) {
    this.faceUrl = faceUrl;
  }


  public CreateGroupRequest maxMemberCount(Integer maxMemberCount) {
    
    this.maxMemberCount = maxMemberCount;
    return this;
  }

   /**
   * 最大群成员数量，缺省时的默认值：付费套餐包上限，例如体验版是20，如果升级套餐包，需按照修改群基础资料修改这个字段
   * @return maxMemberCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "最大群成员数量，缺省时的默认值：付费套餐包上限，例如体验版是20，如果升级套餐包，需按照修改群基础资料修改这个字段")

  public Integer getMaxMemberCount() {
    return maxMemberCount;
  }


  public void setMaxMemberCount(Integer maxMemberCount) {
    this.maxMemberCount = maxMemberCount;
  }


  public CreateGroupRequest applyJoinOption(ApplyJoinOptionEnum applyJoinOption) {
    
    this.applyJoinOption = applyJoinOption;
    return this;
  }

   /**
   * 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群），不填默认为 NeedPermission（需要验证） 仅当创建支持申请加群的 群组(https://cloud.tencent.com/document/product/269/1502#.E5.8A.A0.E7.BE.A4.E6.96.B9.E5.BC.8F.E5.B7.AE.E5.BC.82) 时，该字段有效
   * @return applyJoinOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群），不填默认为 NeedPermission（需要验证） 仅当创建支持申请加群的 群组(https://cloud.tencent.com/document/product/269/1502#.E5.8A.A0.E7.BE.A4.E6.96.B9.E5.BC.8F.E5.B7.AE.E5.BC.82) 时，该字段有效")

  public ApplyJoinOptionEnum getApplyJoinOption() {
    return applyJoinOption;
  }


  public void setApplyJoinOption(ApplyJoinOptionEnum applyJoinOption) {
    this.applyJoinOption = applyJoinOption;
  }


  public CreateGroupRequest appDefinedData(List<DefinedData> appDefinedData) {
    
    this.appDefinedData = appDefinedData;
    return this;
  }

  public CreateGroupRequest addAppDefinedDataItem(DefinedData appDefinedDataItem) {
    if (this.appDefinedData == null) {
      this.appDefinedData = new ArrayList<>();
    }
    this.appDefinedData.add(appDefinedDataItem);
    return this;
  }

   /**
   * Get appDefinedData
   * @return appDefinedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DefinedData> getAppDefinedData() {
    return appDefinedData;
  }


  public void setAppDefinedData(List<DefinedData> appDefinedData) {
    this.appDefinedData = appDefinedData;
  }


  public CreateGroupRequest memberList(List<CreateGroupRequestMemberListInner> memberList) {
    
    this.memberList = memberList;
    return this;
  }

  public CreateGroupRequest addMemberListItem(CreateGroupRequestMemberListInner memberListItem) {
    if (this.memberList == null) {
      this.memberList = new ArrayList<>();
    }
    this.memberList.add(memberListItem);
    return this;
  }

   /**
   * 群组维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台(https://console.cloud.tencent.com/im) 进行配置，详情请参阅 自定义字段(https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5)
   * @return memberList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群组维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台(https://console.cloud.tencent.com/im) 进行配置，详情请参阅 自定义字段(https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5)")

  public List<CreateGroupRequestMemberListInner> getMemberList() {
    return memberList;
  }


  public void setMemberList(List<CreateGroupRequestMemberListInner> memberList) {
    this.memberList = memberList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupRequest createGroupRequest = (CreateGroupRequest) o;
    return Objects.equals(this.ownerAccount, createGroupRequest.ownerAccount) &&
        Objects.equals(this.type, createGroupRequest.type) &&
        Objects.equals(this.groupId, createGroupRequest.groupId) &&
        Objects.equals(this.name, createGroupRequest.name) &&
        Objects.equals(this.introduction, createGroupRequest.introduction) &&
        Objects.equals(this.notification, createGroupRequest.notification) &&
        Objects.equals(this.faceUrl, createGroupRequest.faceUrl) &&
        Objects.equals(this.maxMemberCount, createGroupRequest.maxMemberCount) &&
        Objects.equals(this.applyJoinOption, createGroupRequest.applyJoinOption) &&
        Objects.equals(this.appDefinedData, createGroupRequest.appDefinedData) &&
        Objects.equals(this.memberList, createGroupRequest.memberList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerAccount, type, groupId, name, introduction, notification, faceUrl, maxMemberCount, applyJoinOption, appDefinedData, memberList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupRequest {\n");
    sb.append("    ownerAccount: ").append(toIndentedString(ownerAccount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    faceUrl: ").append(toIndentedString(faceUrl)).append("\n");
    sb.append("    maxMemberCount: ").append(toIndentedString(maxMemberCount)).append("\n");
    sb.append("    applyJoinOption: ").append(toIndentedString(applyJoinOption)).append("\n");
    sb.append("    appDefinedData: ").append(toIndentedString(appDefinedData)).append("\n");
    sb.append("    memberList: ").append(toIndentedString(memberList)).append("\n");
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
    openapiFields.add("Owner_Account");
    openapiFields.add("Type");
    openapiFields.add("GroupId");
    openapiFields.add("Name");
    openapiFields.add("Introduction");
    openapiFields.add("Notification");
    openapiFields.add("FaceUrl");
    openapiFields.add("MaxMemberCount");
    openapiFields.add("ApplyJoinOption");
    openapiFields.add("AppDefinedData");
    openapiFields.add("MemberList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Type");
    openapiRequiredFields.add("Name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateGroupRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateGroupRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGroupRequest is not found in the empty JSON string", CreateGroupRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateGroupRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateGroupRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateGroupRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Owner_Account") != null && !jsonObj.get("Owner_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Owner_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Owner_Account").toString()));
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (jsonObj.get("Introduction") != null && !jsonObj.get("Introduction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Introduction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Introduction").toString()));
      }
      if (jsonObj.get("Notification") != null && !jsonObj.get("Notification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Notification").toString()));
      }
      if (jsonObj.get("FaceUrl") != null && !jsonObj.get("FaceUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FaceUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FaceUrl").toString()));
      }
      if (jsonObj.get("ApplyJoinOption") != null && !jsonObj.get("ApplyJoinOption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ApplyJoinOption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ApplyJoinOption").toString()));
      }
      JsonArray jsonArrayappDefinedData = jsonObj.getAsJsonArray("AppDefinedData");
      if (jsonArrayappDefinedData != null) {
        // ensure the json data is an array
        if (!jsonObj.get("AppDefinedData").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `AppDefinedData` to be an array in the JSON string but got `%s`", jsonObj.get("AppDefinedData").toString()));
        }

        // validate the optional field `AppDefinedData` (array)
        for (int i = 0; i < jsonArrayappDefinedData.size(); i++) {
          DefinedData.validateJsonObject(jsonArrayappDefinedData.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraymemberList = jsonObj.getAsJsonArray("MemberList");
      if (jsonArraymemberList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("MemberList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `MemberList` to be an array in the JSON string but got `%s`", jsonObj.get("MemberList").toString()));
        }

        // validate the optional field `MemberList` (array)
        for (int i = 0; i < jsonArraymemberList.size(); i++) {
          CreateGroupRequestMemberListInner.validateJsonObject(jsonArraymemberList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGroupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGroupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGroupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGroupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGroupRequest>() {
           @Override
           public void write(JsonWriter out, CreateGroupRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateGroupRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateGroupRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateGroupRequest
  * @throws IOException if the JSON string is invalid with respect to CreateGroupRequest
  */
  public static CreateGroupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGroupRequest.class);
  }

 /**
  * Convert an instance of CreateGroupRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

