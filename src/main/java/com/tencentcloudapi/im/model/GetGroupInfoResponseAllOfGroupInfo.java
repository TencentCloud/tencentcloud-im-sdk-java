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
 * GetGroupInfoResponseAllOfGroupInfo
 */

public class GetGroupInfoResponseAllOfGroupInfo {
  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

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

  public static final String SERIALIZED_NAME_OWNER_ACCOUNT = "Owner_Account";
  @SerializedName(SERIALIZED_NAME_OWNER_ACCOUNT)
  private String ownerAccount;

  public static final String SERIALIZED_NAME_CREATE_TIME = "CreateTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Integer createTime;

  public static final String SERIALIZED_NAME_INFO_SEQ = "InfoSeq";
  @SerializedName(SERIALIZED_NAME_INFO_SEQ)
  private Integer infoSeq;

  public static final String SERIALIZED_NAME_LAST_INFO_TIME = "LastInfoTime";
  @SerializedName(SERIALIZED_NAME_LAST_INFO_TIME)
  private Integer lastInfoTime;

  public static final String SERIALIZED_NAME_LAST_MSG_TIME = "LastMsgTime";
  @SerializedName(SERIALIZED_NAME_LAST_MSG_TIME)
  private Integer lastMsgTime;

  public static final String SERIALIZED_NAME_NEXT_MSG_SEQ = "NextMsgSeq";
  @SerializedName(SERIALIZED_NAME_NEXT_MSG_SEQ)
  private Integer nextMsgSeq;

  public static final String SERIALIZED_NAME_MEMBER_NUM = "MemberNum";
  @SerializedName(SERIALIZED_NAME_MEMBER_NUM)
  private Integer memberNum;

  public static final String SERIALIZED_NAME_MAX_MEMBER_NUM = "MaxMemberNum";
  @SerializedName(SERIALIZED_NAME_MAX_MEMBER_NUM)
  private Integer maxMemberNum;

  public static final String SERIALIZED_NAME_APPLY_JOIN_OPTION = "ApplyJoinOption";
  @SerializedName(SERIALIZED_NAME_APPLY_JOIN_OPTION)
  private String applyJoinOption;

  public GetGroupInfoResponseAllOfGroupInfo() { 
  }

  public GetGroupInfoResponseAllOfGroupInfo groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 群组的唯一标识 只读。群组 ID，App 内保证唯一，其格式前缀为 @TGS#。另外，App 亦可自定义群组 ID
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群组的唯一标识 只读。群组 ID，App 内保证唯一，其格式前缀为 @TGS#。另外，App 亦可自定义群组 ID")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public GetGroupInfoResponseAllOfGroupInfo type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 群组类型 只读。默认支持以下群组类型：好友工作群（Work）、陌生人社交群（Public）、临时会议群（Meeting）、直播群（AVChatRoom）、社群（Community），详情请参阅 群组类型介绍（https://cloud.tencent.com/document/product/269/1502#GroupType） 旧版本 SDK 中还包含 Private、ChatRoom 以及 BChatRoom 类型，不建议使用
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群组类型 只读。默认支持以下群组类型：好友工作群（Work）、陌生人社交群（Public）、临时会议群（Meeting）、直播群（AVChatRoom）、社群（Community），详情请参阅 群组类型介绍（https://cloud.tencent.com/document/product/269/1502#GroupType） 旧版本 SDK 中还包含 Private、ChatRoom 以及 BChatRoom 类型，不建议使用")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public GetGroupInfoResponseAllOfGroupInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 群组名称 可读可写。最长30字节，不可调整
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群组名称 可读可写。最长30字节，不可调整")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetGroupInfoResponseAllOfGroupInfo introduction(String introduction) {
    
    this.introduction = introduction;
    return this;
  }

   /**
   * 群组简介，可读可写。最长240字节，不可调整
   * @return introduction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群组简介，可读可写。最长240字节，不可调整")

  public String getIntroduction() {
    return introduction;
  }


  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public GetGroupInfoResponseAllOfGroupInfo notification(String notification) {
    
    this.notification = notification;
    return this;
  }

   /**
   * 群组公告，可读可写。最长300字节，不可调整
   * @return notification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群组公告，可读可写。最长300字节，不可调整")

  public String getNotification() {
    return notification;
  }


  public void setNotification(String notification) {
    this.notification = notification;
  }


  public GetGroupInfoResponseAllOfGroupInfo faceUrl(String faceUrl) {
    
    this.faceUrl = faceUrl;
    return this;
  }

   /**
   * 群组头像 URL，可读可写。最长100字节，不可调整
   * @return faceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群组头像 URL，可读可写。最长100字节，不可调整")

  public String getFaceUrl() {
    return faceUrl;
  }


  public void setFaceUrl(String faceUrl) {
    this.faceUrl = faceUrl;
  }


  public GetGroupInfoResponseAllOfGroupInfo ownerAccount(String ownerAccount) {
    
    this.ownerAccount = ownerAccount;
    return this;
  }

   /**
   * 群主 ID 只读
   * @return ownerAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群主 ID 只读")

  public String getOwnerAccount() {
    return ownerAccount;
  }


  public void setOwnerAccount(String ownerAccount) {
    this.ownerAccount = ownerAccount;
  }


  public GetGroupInfoResponseAllOfGroupInfo createTime(Integer createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 群组的创建时间 只读
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群组的创建时间 只读")

  public Integer getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }


  public GetGroupInfoResponseAllOfGroupInfo infoSeq(Integer infoSeq) {
    
    this.infoSeq = infoSeq;
    return this;
  }

   /**
   * 群资料的每次变都会增加该值 只读
   * @return infoSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群资料的每次变都会增加该值 只读")

  public Integer getInfoSeq() {
    return infoSeq;
  }


  public void setInfoSeq(Integer infoSeq) {
    this.infoSeq = infoSeq;
  }


  public GetGroupInfoResponseAllOfGroupInfo lastInfoTime(Integer lastInfoTime) {
    
    this.lastInfoTime = lastInfoTime;
    return this;
  }

   /**
   * 群组最后一次信息变更时间 只读
   * @return lastInfoTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群组最后一次信息变更时间 只读")

  public Integer getLastInfoTime() {
    return lastInfoTime;
  }


  public void setLastInfoTime(Integer lastInfoTime) {
    this.lastInfoTime = lastInfoTime;
  }


  public GetGroupInfoResponseAllOfGroupInfo lastMsgTime(Integer lastMsgTime) {
    
    this.lastMsgTime = lastMsgTime;
    return this;
  }

   /**
   * 群组内最后发消息的时间 只读
   * @return lastMsgTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群组内最后发消息的时间 只读")

  public Integer getLastMsgTime() {
    return lastMsgTime;
  }


  public void setLastMsgTime(Integer lastMsgTime) {
    this.lastMsgTime = lastMsgTime;
  }


  public GetGroupInfoResponseAllOfGroupInfo nextMsgSeq(Integer nextMsgSeq) {
    
    this.nextMsgSeq = nextMsgSeq;
    return this;
  }

   /**
   * 群内下一条消息的 Seq 只读  群组内每一条消息都有一条唯一的消息 Seq，且该 Seq 是按照发消息顺序而连续的。从1开始，群内每增加一条消息，NextMsgSeq 就会增加1（默认情况下系统消息比如进退群等通知也属于消息，会导致 NextMsgSeq 加1）
   * @return nextMsgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群内下一条消息的 Seq 只读  群组内每一条消息都有一条唯一的消息 Seq，且该 Seq 是按照发消息顺序而连续的。从1开始，群内每增加一条消息，NextMsgSeq 就会增加1（默认情况下系统消息比如进退群等通知也属于消息，会导致 NextMsgSeq 加1）")

  public Integer getNextMsgSeq() {
    return nextMsgSeq;
  }


  public void setNextMsgSeq(Integer nextMsgSeq) {
    this.nextMsgSeq = nextMsgSeq;
  }


  public GetGroupInfoResponseAllOfGroupInfo memberNum(Integer memberNum) {
    
    this.memberNum = memberNum;
    return this;
  }

   /**
   * 当前成员数量 只读
   * @return memberNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "当前成员数量 只读")

  public Integer getMemberNum() {
    return memberNum;
  }


  public void setMemberNum(Integer memberNum) {
    this.memberNum = memberNum;
  }


  public GetGroupInfoResponseAllOfGroupInfo maxMemberNum(Integer maxMemberNum) {
    
    this.maxMemberNum = maxMemberNum;
    return this;
  }

   /**
   * 最大成员数量 缺省时的默认值：付费套餐包上限，例如体验版是20，如果升级套餐包，需按照修改群基础资料修改这个字段到对应数值
   * @return maxMemberNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "最大成员数量 缺省时的默认值：付费套餐包上限，例如体验版是20，如果升级套餐包，需按照修改群基础资料修改这个字段到对应数值")

  public Integer getMaxMemberNum() {
    return maxMemberNum;
  }


  public void setMaxMemberNum(Integer maxMemberNum) {
    this.maxMemberNum = maxMemberNum;
  }


  public GetGroupInfoResponseAllOfGroupInfo applyJoinOption(String applyJoinOption) {
    
    this.applyJoinOption = applyJoinOption;
    return this;
  }

   /**
   * 申请加群选项 申请加群选项包括如下几种：DisableApply 表示禁止任何人申请加入 NeedPermission 表示需要群主或管理员审批 FreeAccess 表示允许无需审批自由加入群组
   * @return applyJoinOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "申请加群选项 申请加群选项包括如下几种：DisableApply 表示禁止任何人申请加入 NeedPermission 表示需要群主或管理员审批 FreeAccess 表示允许无需审批自由加入群组")

  public String getApplyJoinOption() {
    return applyJoinOption;
  }


  public void setApplyJoinOption(String applyJoinOption) {
    this.applyJoinOption = applyJoinOption;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupInfoResponseAllOfGroupInfo getGroupInfoResponseAllOfGroupInfo = (GetGroupInfoResponseAllOfGroupInfo) o;
    return Objects.equals(this.groupId, getGroupInfoResponseAllOfGroupInfo.groupId) &&
        Objects.equals(this.type, getGroupInfoResponseAllOfGroupInfo.type) &&
        Objects.equals(this.name, getGroupInfoResponseAllOfGroupInfo.name) &&
        Objects.equals(this.introduction, getGroupInfoResponseAllOfGroupInfo.introduction) &&
        Objects.equals(this.notification, getGroupInfoResponseAllOfGroupInfo.notification) &&
        Objects.equals(this.faceUrl, getGroupInfoResponseAllOfGroupInfo.faceUrl) &&
        Objects.equals(this.ownerAccount, getGroupInfoResponseAllOfGroupInfo.ownerAccount) &&
        Objects.equals(this.createTime, getGroupInfoResponseAllOfGroupInfo.createTime) &&
        Objects.equals(this.infoSeq, getGroupInfoResponseAllOfGroupInfo.infoSeq) &&
        Objects.equals(this.lastInfoTime, getGroupInfoResponseAllOfGroupInfo.lastInfoTime) &&
        Objects.equals(this.lastMsgTime, getGroupInfoResponseAllOfGroupInfo.lastMsgTime) &&
        Objects.equals(this.nextMsgSeq, getGroupInfoResponseAllOfGroupInfo.nextMsgSeq) &&
        Objects.equals(this.memberNum, getGroupInfoResponseAllOfGroupInfo.memberNum) &&
        Objects.equals(this.maxMemberNum, getGroupInfoResponseAllOfGroupInfo.maxMemberNum) &&
        Objects.equals(this.applyJoinOption, getGroupInfoResponseAllOfGroupInfo.applyJoinOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, type, name, introduction, notification, faceUrl, ownerAccount, createTime, infoSeq, lastInfoTime, lastMsgTime, nextMsgSeq, memberNum, maxMemberNum, applyJoinOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupInfoResponseAllOfGroupInfo {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    faceUrl: ").append(toIndentedString(faceUrl)).append("\n");
    sb.append("    ownerAccount: ").append(toIndentedString(ownerAccount)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    infoSeq: ").append(toIndentedString(infoSeq)).append("\n");
    sb.append("    lastInfoTime: ").append(toIndentedString(lastInfoTime)).append("\n");
    sb.append("    lastMsgTime: ").append(toIndentedString(lastMsgTime)).append("\n");
    sb.append("    nextMsgSeq: ").append(toIndentedString(nextMsgSeq)).append("\n");
    sb.append("    memberNum: ").append(toIndentedString(memberNum)).append("\n");
    sb.append("    maxMemberNum: ").append(toIndentedString(maxMemberNum)).append("\n");
    sb.append("    applyJoinOption: ").append(toIndentedString(applyJoinOption)).append("\n");
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
    openapiFields.add("Type");
    openapiFields.add("Name");
    openapiFields.add("Introduction");
    openapiFields.add("Notification");
    openapiFields.add("FaceUrl");
    openapiFields.add("Owner_Account");
    openapiFields.add("CreateTime");
    openapiFields.add("InfoSeq");
    openapiFields.add("LastInfoTime");
    openapiFields.add("LastMsgTime");
    openapiFields.add("NextMsgSeq");
    openapiFields.add("MemberNum");
    openapiFields.add("MaxMemberNum");
    openapiFields.add("ApplyJoinOption");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetGroupInfoResponseAllOfGroupInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetGroupInfoResponseAllOfGroupInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupInfoResponseAllOfGroupInfo is not found in the empty JSON string", GetGroupInfoResponseAllOfGroupInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetGroupInfoResponseAllOfGroupInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGroupInfoResponseAllOfGroupInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Type").toString()));
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
      if (jsonObj.get("Owner_Account") != null && !jsonObj.get("Owner_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Owner_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Owner_Account").toString()));
      }
      if (jsonObj.get("ApplyJoinOption") != null && !jsonObj.get("ApplyJoinOption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ApplyJoinOption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ApplyJoinOption").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupInfoResponseAllOfGroupInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupInfoResponseAllOfGroupInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupInfoResponseAllOfGroupInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupInfoResponseAllOfGroupInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupInfoResponseAllOfGroupInfo>() {
           @Override
           public void write(JsonWriter out, GetGroupInfoResponseAllOfGroupInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGroupInfoResponseAllOfGroupInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGroupInfoResponseAllOfGroupInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGroupInfoResponseAllOfGroupInfo
  * @throws IOException if the JSON string is invalid with respect to GetGroupInfoResponseAllOfGroupInfo
  */
  public static GetGroupInfoResponseAllOfGroupInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupInfoResponseAllOfGroupInfo.class);
  }

 /**
  * Convert an instance of GetGroupInfoResponseAllOfGroupInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

