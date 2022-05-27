
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.DefinedData;
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
 * CreateGroupRequestMemberListInner
 */
@JsonPropertyOrder({
  CreateGroupRequestMemberListInner.JSON_PROPERTY_MEMBER_ACCOUNT,
  CreateGroupRequestMemberListInner.JSON_PROPERTY_ROLE,
  CreateGroupRequestMemberListInner.JSON_PROPERTY_JOIN_TIME,
  CreateGroupRequestMemberListInner.JSON_PROPERTY_MSG_SEQ,
  CreateGroupRequestMemberListInner.JSON_PROPERTY_MSG_FLAG,
  CreateGroupRequestMemberListInner.JSON_PROPERTY_NAME_CARD,
  CreateGroupRequestMemberListInner.JSON_PROPERTY_LAST_SEND_MSG_TIME,
  CreateGroupRequestMemberListInner.JSON_PROPERTY_APP_MEMBER_DEFINED_DATA
})
@JsonTypeName("CreateGroupRequest_MemberList_inner")

public class CreateGroupRequestMemberListInner {
  public static final String JSON_PROPERTY_MEMBER_ACCOUNT = "Member_Account";
  private String memberAccount;

  public static final String JSON_PROPERTY_ROLE = "Role";
  private String role;

  public static final String JSON_PROPERTY_JOIN_TIME = "JoinTime";
  private Integer joinTime;

  public static final String JSON_PROPERTY_MSG_SEQ = "MsgSeq";
  private Integer msgSeq;

  public static final String JSON_PROPERTY_MSG_FLAG = "MsgFlag";
  private String msgFlag;

  public static final String JSON_PROPERTY_NAME_CARD = "NameCard";
  private String nameCard;

  public static final String JSON_PROPERTY_LAST_SEND_MSG_TIME = "LastSendMsgTime";
  private Integer lastSendMsgTime;

  public static final String JSON_PROPERTY_APP_MEMBER_DEFINED_DATA = "AppMemberDefinedData";
  private List<DefinedData> appMemberDefinedData = null;

  public CreateGroupRequestMemberListInner() { 
  }

  public CreateGroupRequestMemberListInner memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * Get memberAccount
   * @return memberAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMemberAccount() {
    return memberAccount;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  public CreateGroupRequestMemberListInner role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * 群内身份，包括 Owner 群主、Admin 群管理员以及 Member 群成员
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群内身份，包括 Owner 群主、Admin 群管理员以及 Member 群成员")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(String role) {
    this.role = role;
  }


  public CreateGroupRequestMemberListInner joinTime(Integer joinTime) {
    
    this.joinTime = joinTime;
    return this;
  }

   /**
   * 入群时间
   * @return joinTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "入群时间")
  @JsonProperty(JSON_PROPERTY_JOIN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getJoinTime() {
    return joinTime;
  }


  @JsonProperty(JSON_PROPERTY_JOIN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJoinTime(Integer joinTime) {
    this.joinTime = joinTime;
  }


  public CreateGroupRequestMemberListInner msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * 该成员当前已读消息 Seq
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该成员当前已读消息 Seq")
  @JsonProperty(JSON_PROPERTY_MSG_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMsgSeq() {
    return msgSeq;
  }


  @JsonProperty(JSON_PROPERTY_MSG_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgSeq(Integer msgSeq) {
    this.msgSeq = msgSeq;
  }


  public CreateGroupRequestMemberListInner msgFlag(String msgFlag) {
    
    this.msgFlag = msgFlag;
    return this;
  }

   /**
   * 消息接收选项 消息接收选项，包括如下几种 AcceptAndNotify 表示接收并提示 AcceptNotNotify 表示接收不提示（不会触发 APNs 远程推送） Discard 表示屏蔽群消息（不会向客户端推送消息）
   * @return msgFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息接收选项 消息接收选项，包括如下几种 AcceptAndNotify 表示接收并提示 AcceptNotNotify 表示接收不提示（不会触发 APNs 远程推送） Discard 表示屏蔽群消息（不会向客户端推送消息）")
  @JsonProperty(JSON_PROPERTY_MSG_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMsgFlag() {
    return msgFlag;
  }


  @JsonProperty(JSON_PROPERTY_MSG_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgFlag(String msgFlag) {
    this.msgFlag = msgFlag;
  }


  public CreateGroupRequestMemberListInner nameCard(String nameCard) {
    
    this.nameCard = nameCard;
    return this;
  }

   /**
   * 可读可写。最长50字节，不可调整
   * @return nameCard
  **/
  @javax.annotation.Nullable
 @Size(max=50)  @ApiModelProperty(value = "可读可写。最长50字节，不可调整")
  @JsonProperty(JSON_PROPERTY_NAME_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNameCard() {
    return nameCard;
  }


  @JsonProperty(JSON_PROPERTY_NAME_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameCard(String nameCard) {
    this.nameCard = nameCard;
  }


  public CreateGroupRequestMemberListInner lastSendMsgTime(Integer lastSendMsgTime) {
    
    this.lastSendMsgTime = lastSendMsgTime;
    return this;
  }

   /**
   * 最后发送消息的时间 支持三个普通群，不支持直播群
   * @return lastSendMsgTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "最后发送消息的时间 支持三个普通群，不支持直播群")
  @JsonProperty(JSON_PROPERTY_LAST_SEND_MSG_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLastSendMsgTime() {
    return lastSendMsgTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_SEND_MSG_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastSendMsgTime(Integer lastSendMsgTime) {
    this.lastSendMsgTime = lastSendMsgTime;
  }


  public CreateGroupRequestMemberListInner appMemberDefinedData(List<DefinedData> appMemberDefinedData) {
    
    this.appMemberDefinedData = appMemberDefinedData;
    return this;
  }

  public CreateGroupRequestMemberListInner addAppMemberDefinedDataItem(DefinedData appMemberDefinedDataItem) {
    if (this.appMemberDefinedData == null) {
      this.appMemberDefinedData = new ArrayList<>();
    }
    this.appMemberDefinedData.add(appMemberDefinedDataItem);
    return this;
  }

   /**
   * 群成员维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台(https://console.cloud.tencent.com/im) 进行配置，详情请参阅 自定义字段(https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5)
   * @return appMemberDefinedData
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "群成员维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台(https://console.cloud.tencent.com/im) 进行配置，详情请参阅 自定义字段(https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5)")
  @JsonProperty(JSON_PROPERTY_APP_MEMBER_DEFINED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DefinedData> getAppMemberDefinedData() {
    return appMemberDefinedData;
  }


  @JsonProperty(JSON_PROPERTY_APP_MEMBER_DEFINED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppMemberDefinedData(List<DefinedData> appMemberDefinedData) {
    this.appMemberDefinedData = appMemberDefinedData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupRequestMemberListInner createGroupRequestMemberListInner = (CreateGroupRequestMemberListInner) o;
    return Objects.equals(this.memberAccount, createGroupRequestMemberListInner.memberAccount) &&
        Objects.equals(this.role, createGroupRequestMemberListInner.role) &&
        Objects.equals(this.joinTime, createGroupRequestMemberListInner.joinTime) &&
        Objects.equals(this.msgSeq, createGroupRequestMemberListInner.msgSeq) &&
        Objects.equals(this.msgFlag, createGroupRequestMemberListInner.msgFlag) &&
        Objects.equals(this.nameCard, createGroupRequestMemberListInner.nameCard) &&
        Objects.equals(this.lastSendMsgTime, createGroupRequestMemberListInner.lastSendMsgTime) &&
        Objects.equals(this.appMemberDefinedData, createGroupRequestMemberListInner.appMemberDefinedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAccount, role, joinTime, msgSeq, msgFlag, nameCard, lastSendMsgTime, appMemberDefinedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupRequestMemberListInner {\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
    sb.append("    msgFlag: ").append(toIndentedString(msgFlag)).append("\n");
    sb.append("    nameCard: ").append(toIndentedString(nameCard)).append("\n");
    sb.append("    lastSendMsgTime: ").append(toIndentedString(lastSendMsgTime)).append("\n");
    sb.append("    appMemberDefinedData: ").append(toIndentedString(appMemberDefinedData)).append("\n");
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

