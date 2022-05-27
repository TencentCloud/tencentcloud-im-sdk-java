
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.GetGroupMemberInfoResponseAllOfAppMemberDefinedData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ModifyGroupBaseInfoRequest
 */
@JsonPropertyOrder({
  ModifyGroupBaseInfoRequest.JSON_PROPERTY_GROUP_ID,
  ModifyGroupBaseInfoRequest.JSON_PROPERTY_NAME,
  ModifyGroupBaseInfoRequest.JSON_PROPERTY_INTRODUCTION,
  ModifyGroupBaseInfoRequest.JSON_PROPERTY_NOTIFICATION,
  ModifyGroupBaseInfoRequest.JSON_PROPERTY_FACE_URL,
  ModifyGroupBaseInfoRequest.JSON_PROPERTY_MAX_MEMBER_NUM,
  ModifyGroupBaseInfoRequest.JSON_PROPERTY_APPLY_JOIN_OPTION,
  ModifyGroupBaseInfoRequest.JSON_PROPERTY_APP_DEFINED_DATA,
  ModifyGroupBaseInfoRequest.JSON_PROPERTY_SHUT_UP_ALL_MEMBER
})

public class ModifyGroupBaseInfoRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_INTRODUCTION = "Introduction";
  private String introduction;

  public static final String JSON_PROPERTY_NOTIFICATION = "Notification";
  private String notification;

  public static final String JSON_PROPERTY_FACE_URL = "FaceUrl";
  private String faceUrl;

  public static final String JSON_PROPERTY_MAX_MEMBER_NUM = "MaxMemberNum";
  private Integer maxMemberNum;

  public static final String JSON_PROPERTY_APPLY_JOIN_OPTION = "ApplyJoinOption";
  private String applyJoinOption;

  public static final String JSON_PROPERTY_APP_DEFINED_DATA = "AppDefinedData";
  private List<GetGroupMemberInfoResponseAllOfAppMemberDefinedData> appDefinedData = null;

  public static final String JSON_PROPERTY_SHUT_UP_ALL_MEMBER = "ShutUpAllMember";
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
  @NotNull
  @ApiModelProperty(required = true, value = "需要拉取成员信息的群组的 ID")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
 @Size(max=30)  @ApiModelProperty(value = "群名称，最长30字节")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
 @Size(max=240)  @ApiModelProperty(value = "群简介，最长240字节")
  @JsonProperty(JSON_PROPERTY_INTRODUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntroduction() {
    return introduction;
  }


  @JsonProperty(JSON_PROPERTY_INTRODUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
 @Size(max=300)  @ApiModelProperty(value = "群公告，最长300字节")
  @JsonProperty(JSON_PROPERTY_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotification() {
    return notification;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
 @Size(max=100)  @ApiModelProperty(value = "群头像 URL，最长100字节")
  @JsonProperty(JSON_PROPERTY_FACE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFaceUrl() {
    return faceUrl;
  }


  @JsonProperty(JSON_PROPERTY_FACE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_MAX_MEMBER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxMemberNum() {
    return maxMemberNum;
  }


  @JsonProperty(JSON_PROPERTY_MAX_MEMBER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_APPLY_JOIN_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApplyJoinOption() {
    return applyJoinOption;
  }


  @JsonProperty(JSON_PROPERTY_APPLY_JOIN_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @Valid
  @ApiModelProperty(value = "默认情况是没有的。开通群组维度的自定义字段详情请参见 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5）")
  @JsonProperty(JSON_PROPERTY_APP_DEFINED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetGroupMemberInfoResponseAllOfAppMemberDefinedData> getAppDefinedData() {
    return appDefinedData;
  }


  @JsonProperty(JSON_PROPERTY_APP_DEFINED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_SHUT_UP_ALL_MEMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShutUpAllMember() {
    return shutUpAllMember;
  }


  @JsonProperty(JSON_PROPERTY_SHUT_UP_ALL_MEMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

}

