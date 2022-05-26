
package tencentcloud.im.model;

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
 * GetGroupMemberInfoResponseAllOfMemberList
 */
@JsonPropertyOrder({
  GetGroupMemberInfoResponseAllOfMemberList.JSON_PROPERTY_MEMBER_ACCOUNT,
  GetGroupMemberInfoResponseAllOfMemberList.JSON_PROPERTY_ROLE,
  GetGroupMemberInfoResponseAllOfMemberList.JSON_PROPERTY_JOIN_TIME,
  GetGroupMemberInfoResponseAllOfMemberList.JSON_PROPERTY_MSG_SEQ,
  GetGroupMemberInfoResponseAllOfMemberList.JSON_PROPERTY_MSG_FLAG,
  GetGroupMemberInfoResponseAllOfMemberList.JSON_PROPERTY_LAST_SEND_MSG_TIME,
  GetGroupMemberInfoResponseAllOfMemberList.JSON_PROPERTY_NAME_CARD
})
@JsonTypeName("GetGroupMemberInfoResponse_allOf_MemberList")

public class GetGroupMemberInfoResponseAllOfMemberList {
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

  public static final String JSON_PROPERTY_LAST_SEND_MSG_TIME = "LastSendMsgTime";
  private Integer lastSendMsgTime;

  public static final String JSON_PROPERTY_NAME_CARD = "NameCard";
  private String nameCard;

  public GetGroupMemberInfoResponseAllOfMemberList() { 
  }

  public GetGroupMemberInfoResponseAllOfMemberList memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * 群成员 ID 只读
   * @return memberAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群成员 ID 只读")
  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemberAccount() {
    return memberAccount;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  public GetGroupMemberInfoResponseAllOfMemberList role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * 群内身份 群内身份，包括 Owner 群主、Admin 群管理员以及 Member 群成员
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群内身份 群内身份，包括 Owner 群主、Admin 群管理员以及 Member 群成员")
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


  public GetGroupMemberInfoResponseAllOfMemberList joinTime(Integer joinTime) {
    
    this.joinTime = joinTime;
    return this;
  }

   /**
   * 入群时间 只读
   * @return joinTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "入群时间 只读")
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


  public GetGroupMemberInfoResponseAllOfMemberList msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * 该成员当前已读消息 Seq 只读
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该成员当前已读消息 Seq 只读")
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


  public GetGroupMemberInfoResponseAllOfMemberList msgFlag(String msgFlag) {
    
    this.msgFlag = msgFlag;
    return this;
  }

   /**
   * 消息接收选项 消息接收选项，包括如下几种：AcceptAndNotify 表示接收并提示；AcceptNotNotify 表示接收不提示（不会触发 APNs 远程推送）；Discard 表示屏蔽群消息（不会向客户端推送消息）
   * @return msgFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息接收选项 消息接收选项，包括如下几种：AcceptAndNotify 表示接收并提示；AcceptNotNotify 表示接收不提示（不会触发 APNs 远程推送）；Discard 表示屏蔽群消息（不会向客户端推送消息）")
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


  public GetGroupMemberInfoResponseAllOfMemberList lastSendMsgTime(Integer lastSendMsgTime) {
    
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


  public GetGroupMemberInfoResponseAllOfMemberList nameCard(String nameCard) {
    
    this.nameCard = nameCard;
    return this;
  }

   /**
   * 群名片 可读可写。最长50字节，不可调整
   * @return nameCard
  **/
  @javax.annotation.Nullable
 @Size(max=50)  @ApiModelProperty(value = "群名片 可读可写。最长50字节，不可调整")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupMemberInfoResponseAllOfMemberList getGroupMemberInfoResponseAllOfMemberList = (GetGroupMemberInfoResponseAllOfMemberList) o;
    return Objects.equals(this.memberAccount, getGroupMemberInfoResponseAllOfMemberList.memberAccount) &&
        Objects.equals(this.role, getGroupMemberInfoResponseAllOfMemberList.role) &&
        Objects.equals(this.joinTime, getGroupMemberInfoResponseAllOfMemberList.joinTime) &&
        Objects.equals(this.msgSeq, getGroupMemberInfoResponseAllOfMemberList.msgSeq) &&
        Objects.equals(this.msgFlag, getGroupMemberInfoResponseAllOfMemberList.msgFlag) &&
        Objects.equals(this.lastSendMsgTime, getGroupMemberInfoResponseAllOfMemberList.lastSendMsgTime) &&
        Objects.equals(this.nameCard, getGroupMemberInfoResponseAllOfMemberList.nameCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAccount, role, joinTime, msgSeq, msgFlag, lastSendMsgTime, nameCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupMemberInfoResponseAllOfMemberList {\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
    sb.append("    msgFlag: ").append(toIndentedString(msgFlag)).append("\n");
    sb.append("    lastSendMsgTime: ").append(toIndentedString(lastSendMsgTime)).append("\n");
    sb.append("    nameCard: ").append(toIndentedString(nameCard)).append("\n");
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

