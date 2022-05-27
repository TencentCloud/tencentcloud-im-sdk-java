
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetGroupInfoResponseAllOfGroupInfo
 */
@JsonPropertyOrder({
  GetGroupInfoResponseAllOfGroupInfo.JSON_PROPERTY_GROUP_ID,
  GetGroupInfoResponseAllOfGroupInfo.JSON_PROPERTY_TYPE,
  GetGroupInfoResponseAllOfGroupInfo.JSON_PROPERTY_NAME,
  GetGroupInfoResponseAllOfGroupInfo.JSON_PROPERTY_INTRODUCTION,
  GetGroupInfoResponseAllOfGroupInfo.JSON_PROPERTY_NOTIFICATION,
  GetGroupInfoResponseAllOfGroupInfo.JSON_PROPERTY_FACE_URL,
  GetGroupInfoResponseAllOfGroupInfo.JSON_PROPERTY_OWNER_ACCOUNT,
  GetGroupInfoResponseAllOfGroupInfo.JSON_PROPERTY_CREATE_TIME,
  GetGroupInfoResponseAllOfGroupInfo.JSON_PROPERTY_INFO_SEQ,
  GetGroupInfoResponseAllOfGroupInfo.JSON_PROPERTY_LAST_INFO_TIME,
  GetGroupInfoResponseAllOfGroupInfo.JSON_PROPERTY_LAST_MSG_TIME,
  GetGroupInfoResponseAllOfGroupInfo.JSON_PROPERTY_NEXT_MSG_SEQ,
  GetGroupInfoResponseAllOfGroupInfo.JSON_PROPERTY_MEMBER_NUM,
  GetGroupInfoResponseAllOfGroupInfo.JSON_PROPERTY_MAX_MEMBER_NUM,
  GetGroupInfoResponseAllOfGroupInfo.JSON_PROPERTY_APPLY_JOIN_OPTION
})
@JsonTypeName("GetGroupInfoResponse_allOf_GroupInfo")

public class GetGroupInfoResponseAllOfGroupInfo {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_TYPE = "Type";
  private String type;

  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_INTRODUCTION = "Introduction";
  private String introduction;

  public static final String JSON_PROPERTY_NOTIFICATION = "Notification";
  private String notification;

  public static final String JSON_PROPERTY_FACE_URL = "FaceUrl";
  private String faceUrl;

  public static final String JSON_PROPERTY_OWNER_ACCOUNT = "Owner_Account";
  private String ownerAccount;

  public static final String JSON_PROPERTY_CREATE_TIME = "CreateTime";
  private Integer createTime;

  public static final String JSON_PROPERTY_INFO_SEQ = "InfoSeq";
  private Integer infoSeq;

  public static final String JSON_PROPERTY_LAST_INFO_TIME = "LastInfoTime";
  private Integer lastInfoTime;

  public static final String JSON_PROPERTY_LAST_MSG_TIME = "LastMsgTime";
  private Integer lastMsgTime;

  public static final String JSON_PROPERTY_NEXT_MSG_SEQ = "NextMsgSeq";
  private Integer nextMsgSeq;

  public static final String JSON_PROPERTY_MEMBER_NUM = "MemberNum";
  private Integer memberNum;

  public static final String JSON_PROPERTY_MAX_MEMBER_NUM = "MaxMemberNum";
  private Integer maxMemberNum;

  public static final String JSON_PROPERTY_APPLY_JOIN_OPTION = "ApplyJoinOption";
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
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
 @Size(max=30)  @ApiModelProperty(value = "群组名称 可读可写。最长30字节，不可调整")
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


  public GetGroupInfoResponseAllOfGroupInfo introduction(String introduction) {
    
    this.introduction = introduction;
    return this;
  }

   /**
   * 群组简介，可读可写。最长240字节，不可调整
   * @return introduction
  **/
  @javax.annotation.Nullable
 @Size(max=240)  @ApiModelProperty(value = "群组简介，可读可写。最长240字节，不可调整")
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


  public GetGroupInfoResponseAllOfGroupInfo notification(String notification) {
    
    this.notification = notification;
    return this;
  }

   /**
   * 群组公告，可读可写。最长300字节，不可调整
   * @return notification
  **/
  @javax.annotation.Nullable
 @Size(max=240)  @ApiModelProperty(value = "群组公告，可读可写。最长300字节，不可调整")
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


  public GetGroupInfoResponseAllOfGroupInfo faceUrl(String faceUrl) {
    
    this.faceUrl = faceUrl;
    return this;
  }

   /**
   * 群组头像 URL，可读可写。最长100字节，不可调整
   * @return faceUrl
  **/
  @javax.annotation.Nullable
 @Size(max=100)  @ApiModelProperty(value = "群组头像 URL，可读可写。最长100字节，不可调整")
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
  @JsonProperty(JSON_PROPERTY_OWNER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwnerAccount() {
    return ownerAccount;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreateTime() {
    return createTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_INFO_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInfoSeq() {
    return infoSeq;
  }


  @JsonProperty(JSON_PROPERTY_INFO_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_LAST_INFO_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLastInfoTime() {
    return lastInfoTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_INFO_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_LAST_MSG_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLastMsgTime() {
    return lastMsgTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MSG_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_NEXT_MSG_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNextMsgSeq() {
    return nextMsgSeq;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_MSG_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_MEMBER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMemberNum() {
    return memberNum;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

}

