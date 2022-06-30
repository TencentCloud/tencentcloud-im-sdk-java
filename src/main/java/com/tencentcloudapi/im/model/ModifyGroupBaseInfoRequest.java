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
import com.tencentcloudapi.im.model.GetGroupMemberInfoResponseAllOfAppMemberDefinedData;
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
 * ModifyGroupBaseInfoRequest
 */

public class ModifyGroupBaseInfoRequest {
  private static final long serialVersionUID = 1L;

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

  public static final String SERIALIZED_NAME_MAX_MEMBER_NUM = "MaxMemberNum";
  @SerializedName(SERIALIZED_NAME_MAX_MEMBER_NUM)
  private Integer maxMemberNum;

  public static final String SERIALIZED_NAME_APPLY_JOIN_OPTION = "ApplyJoinOption";
  @SerializedName(SERIALIZED_NAME_APPLY_JOIN_OPTION)
  private String applyJoinOption;

  public static final String SERIALIZED_NAME_APP_DEFINED_DATA = "AppDefinedData";
  @SerializedName(SERIALIZED_NAME_APP_DEFINED_DATA)
  private List<GetGroupMemberInfoResponseAllOfAppMemberDefinedData> appDefinedData = null;

  public static final String SERIALIZED_NAME_SHUT_UP_ALL_MEMBER = "ShutUpAllMember";
  @SerializedName(SERIALIZED_NAME_SHUT_UP_ALL_MEMBER)
  private String shutUpAllMember;

  public ModifyGroupBaseInfoRequest() { 
  }

  public ModifyGroupBaseInfoRequest groupId(String groupId) {
    
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


  public ModifyGroupBaseInfoRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 群名称，最长30字节
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群名称，最长30字节")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ModifyGroupBaseInfoRequest introduction(String introduction) {
    
    this.introduction = introduction;
    return this;
  }

   /**
   * 群简介，最长240字节
   * @return introduction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群简介，最长240字节")

  public String getIntroduction() {
    return introduction;
  }


  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public ModifyGroupBaseInfoRequest notification(String notification) {
    
    this.notification = notification;
    return this;
  }

   /**
   * 群公告，最长300字节
   * @return notification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群公告，最长300字节")

  public String getNotification() {
    return notification;
  }


  public void setNotification(String notification) {
    this.notification = notification;
  }


  public ModifyGroupBaseInfoRequest faceUrl(String faceUrl) {
    
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


  public ModifyGroupBaseInfoRequest maxMemberNum(Integer maxMemberNum) {
    
    this.maxMemberNum = maxMemberNum;
    return this;
  }

   /**
   * 最大群成员数量；私有群、公开群和聊天室：该字段阈值请参考 群组系统（https://cloud.tencent.com/document/product/269/1502#.E7.BE.A4.E7.BB.84.E9.99.90.E5.88.B6.E5.B7.AE.E5.BC.82） 和 计费概述（https://cloud.tencent.com/document/product/269/40267#.E5.9F.BA.E7.A1.80.E6.9C.8D.E5.8A.A1.E8.AF.A6.E6.83.85） 中的群成员人数上限相关说明；音视频聊天室和在线成员广播大群：该字段为无效字段，无需填写
   * @return maxMemberNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "最大群成员数量；私有群、公开群和聊天室：该字段阈值请参考 群组系统（https://cloud.tencent.com/document/product/269/1502#.E7.BE.A4.E7.BB.84.E9.99.90.E5.88.B6.E5.B7.AE.E5.BC.82） 和 计费概述（https://cloud.tencent.com/document/product/269/40267#.E5.9F.BA.E7.A1.80.E6.9C.8D.E5.8A.A1.E8.AF.A6.E6.83.85） 中的群成员人数上限相关说明；音视频聊天室和在线成员广播大群：该字段为无效字段，无需填写")

  public Integer getMaxMemberNum() {
    return maxMemberNum;
  }


  public void setMaxMemberNum(Integer maxMemberNum) {
    this.maxMemberNum = maxMemberNum;
  }


  public ModifyGroupBaseInfoRequest applyJoinOption(String applyJoinOption) {
    
    this.applyJoinOption = applyJoinOption;
    return this;
  }

   /**
   * 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群）
   * @return applyJoinOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群）")

  public String getApplyJoinOption() {
    return applyJoinOption;
  }


  public void setApplyJoinOption(String applyJoinOption) {
    this.applyJoinOption = applyJoinOption;
  }


  public ModifyGroupBaseInfoRequest appDefinedData(List<GetGroupMemberInfoResponseAllOfAppMemberDefinedData> appDefinedData) {
    
    this.appDefinedData = appDefinedData;
    return this;
  }

  public ModifyGroupBaseInfoRequest addAppDefinedDataItem(GetGroupMemberInfoResponseAllOfAppMemberDefinedData appDefinedDataItem) {
    if (this.appDefinedData == null) {
      this.appDefinedData = new ArrayList<>();
    }
    this.appDefinedData.add(appDefinedDataItem);
    return this;
  }

   /**
   * 默认情况是没有的。开通群组维度的自定义字段详情请参见 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5）
   * @return appDefinedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "默认情况是没有的。开通群组维度的自定义字段详情请参见 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5）")

  public List<GetGroupMemberInfoResponseAllOfAppMemberDefinedData> getAppDefinedData() {
    return appDefinedData;
  }


  public void setAppDefinedData(List<GetGroupMemberInfoResponseAllOfAppMemberDefinedData> appDefinedData) {
    this.appDefinedData = appDefinedData;
  }


  public ModifyGroupBaseInfoRequest shutUpAllMember(String shutUpAllMember) {
    
    this.shutUpAllMember = shutUpAllMember;
    return this;
  }

   /**
   * 群内群成员禁言，只有群管理员和群主以及系统管理员可以发言 设置全员禁言（选填）:\&quot;On\&quot;开启，\&quot;Off\&quot;关闭
   * @return shutUpAllMember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群内群成员禁言，只有群管理员和群主以及系统管理员可以发言 设置全员禁言（选填）:\"On\"开启，\"Off\"关闭")

  public String getShutUpAllMember() {
    return shutUpAllMember;
  }


  public void setShutUpAllMember(String shutUpAllMember) {
    this.shutUpAllMember = shutUpAllMember;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyGroupBaseInfoRequest modifyGroupBaseInfoRequest = (ModifyGroupBaseInfoRequest) o;
    return Objects.equals(this.groupId, modifyGroupBaseInfoRequest.groupId) &&
        Objects.equals(this.name, modifyGroupBaseInfoRequest.name) &&
        Objects.equals(this.introduction, modifyGroupBaseInfoRequest.introduction) &&
        Objects.equals(this.notification, modifyGroupBaseInfoRequest.notification) &&
        Objects.equals(this.faceUrl, modifyGroupBaseInfoRequest.faceUrl) &&
        Objects.equals(this.maxMemberNum, modifyGroupBaseInfoRequest.maxMemberNum) &&
        Objects.equals(this.applyJoinOption, modifyGroupBaseInfoRequest.applyJoinOption) &&
        Objects.equals(this.appDefinedData, modifyGroupBaseInfoRequest.appDefinedData) &&
        Objects.equals(this.shutUpAllMember, modifyGroupBaseInfoRequest.shutUpAllMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, name, introduction, notification, faceUrl, maxMemberNum, applyJoinOption, appDefinedData, shutUpAllMember);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyGroupBaseInfoRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    faceUrl: ").append(toIndentedString(faceUrl)).append("\n");
    sb.append("    maxMemberNum: ").append(toIndentedString(maxMemberNum)).append("\n");
    sb.append("    applyJoinOption: ").append(toIndentedString(applyJoinOption)).append("\n");
    sb.append("    appDefinedData: ").append(toIndentedString(appDefinedData)).append("\n");
    sb.append("    shutUpAllMember: ").append(toIndentedString(shutUpAllMember)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("Introduction");
    openapiFields.add("Notification");
    openapiFields.add("FaceUrl");
    openapiFields.add("MaxMemberNum");
    openapiFields.add("ApplyJoinOption");
    openapiFields.add("AppDefinedData");
    openapiFields.add("ShutUpAllMember");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GroupId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModifyGroupBaseInfoRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ModifyGroupBaseInfoRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModifyGroupBaseInfoRequest is not found in the empty JSON string", ModifyGroupBaseInfoRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModifyGroupBaseInfoRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModifyGroupBaseInfoRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModifyGroupBaseInfoRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
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
          GetGroupMemberInfoResponseAllOfAppMemberDefinedData.validateJsonObject(jsonArrayappDefinedData.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("ShutUpAllMember") != null && !jsonObj.get("ShutUpAllMember").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ShutUpAllMember` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ShutUpAllMember").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModifyGroupBaseInfoRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModifyGroupBaseInfoRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModifyGroupBaseInfoRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModifyGroupBaseInfoRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModifyGroupBaseInfoRequest>() {
           @Override
           public void write(JsonWriter out, ModifyGroupBaseInfoRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModifyGroupBaseInfoRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModifyGroupBaseInfoRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModifyGroupBaseInfoRequest
  * @throws IOException if the JSON string is invalid with respect to ModifyGroupBaseInfoRequest
  */
  public static ModifyGroupBaseInfoRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModifyGroupBaseInfoRequest.class);
  }

 /**
  * Convert an instance of ModifyGroupBaseInfoRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

