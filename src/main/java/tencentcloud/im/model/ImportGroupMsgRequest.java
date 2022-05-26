
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
import java.util.ArrayList;
import java.util.List;
import tencentcloud.im.model.TIMMsgElement;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ImportGroupMsgRequest
 */
@JsonPropertyOrder({
  ImportGroupMsgRequest.JSON_PROPERTY_GROUP_ID,
  ImportGroupMsgRequest.JSON_PROPERTY_RECENT_CONTACT_FLAG,
  ImportGroupMsgRequest.JSON_PROPERTY_MSG_LIST,
  ImportGroupMsgRequest.JSON_PROPERTY_FROM_ACCOUNT,
  ImportGroupMsgRequest.JSON_PROPERTY_SEND_TIME,
  ImportGroupMsgRequest.JSON_PROPERTY_RANDOM,
  ImportGroupMsgRequest.JSON_PROPERTY_MSG_BODY
})

public class ImportGroupMsgRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_RECENT_CONTACT_FLAG = "RecentContactFlag";
  private Integer recentContactFlag;

  public static final String JSON_PROPERTY_MSG_LIST = "MsgList";
  private String msgList;

  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_SEND_TIME = "SendTime";
  private Integer sendTime;

  public static final String JSON_PROPERTY_RANDOM = "Random";
  private Integer random;

  public static final String JSON_PROPERTY_MSG_BODY = "MsgBody";
  private List<TIMMsgElement> msgBody = new ArrayList<>();

  public ImportGroupMsgRequest() { 
  }

  public ImportGroupMsgRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 要导入消息的群 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "要导入消息的群 ID")
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


  public ImportGroupMsgRequest recentContactFlag(Integer recentContactFlag) {
    
    this.recentContactFlag = recentContactFlag;
    return this;
  }

   /**
   * 会话更新识别，为1的时候标识触发会话更新，默认不触发（avchatroom 群不支持）。
   * @return recentContactFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会话更新识别，为1的时候标识触发会话更新，默认不触发（avchatroom 群不支持）。")
  @JsonProperty(JSON_PROPERTY_RECENT_CONTACT_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRecentContactFlag() {
    return recentContactFlag;
  }


  @JsonProperty(JSON_PROPERTY_RECENT_CONTACT_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecentContactFlag(Integer recentContactFlag) {
    this.recentContactFlag = recentContactFlag;
  }


  public ImportGroupMsgRequest msgList(String msgList) {
    
    this.msgList = msgList;
    return this;
  }

   /**
   * 导入的消息列表
   * @return msgList
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "导入的消息列表")
  @JsonProperty(JSON_PROPERTY_MSG_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMsgList() {
    return msgList;
  }


  @JsonProperty(JSON_PROPERTY_MSG_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsgList(String msgList) {
    this.msgList = msgList;
  }


  public ImportGroupMsgRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 指定消息发送者
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "指定消息发送者")
  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFromAccount() {
    return fromAccount;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public ImportGroupMsgRequest sendTime(Integer sendTime) {
    
    this.sendTime = sendTime;
    return this;
  }

   /**
   * 消息发送时间
   * @return sendTime
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "消息发送时间")
  @JsonProperty(JSON_PROPERTY_SEND_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSendTime() {
    return sendTime;
  }


  @JsonProperty(JSON_PROPERTY_SEND_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSendTime(Integer sendTime) {
    this.sendTime = sendTime;
  }


  public ImportGroupMsgRequest random(Integer random) {
    
    this.random = random;
    return this;
  }

   /**
   * 32位无符号整数；如果5分钟内两条消息的随机值相同，后一条消息将被当做重复消息而丢弃
   * @return random
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "32位无符号整数；如果5分钟内两条消息的随机值相同，后一条消息将被当做重复消息而丢弃")
  @JsonProperty(JSON_PROPERTY_RANDOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRandom() {
    return random;
  }


  @JsonProperty(JSON_PROPERTY_RANDOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRandom(Integer random) {
    this.random = random;
  }


  public ImportGroupMsgRequest msgBody(List<TIMMsgElement> msgBody) {
    
    this.msgBody = msgBody;
    return this;
  }

  public ImportGroupMsgRequest addMsgBodyItem(TIMMsgElement msgBodyItem) {
    this.msgBody.add(msgBodyItem);
    return this;
  }

   /**
   * Get msgBody
   * @return msgBody
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MSG_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TIMMsgElement> getMsgBody() {
    return msgBody;
  }


  @JsonProperty(JSON_PROPERTY_MSG_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsgBody(List<TIMMsgElement> msgBody) {
    this.msgBody = msgBody;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupMsgRequest importGroupMsgRequest = (ImportGroupMsgRequest) o;
    return Objects.equals(this.groupId, importGroupMsgRequest.groupId) &&
        Objects.equals(this.recentContactFlag, importGroupMsgRequest.recentContactFlag) &&
        Objects.equals(this.msgList, importGroupMsgRequest.msgList) &&
        Objects.equals(this.fromAccount, importGroupMsgRequest.fromAccount) &&
        Objects.equals(this.sendTime, importGroupMsgRequest.sendTime) &&
        Objects.equals(this.random, importGroupMsgRequest.random) &&
        Objects.equals(this.msgBody, importGroupMsgRequest.msgBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, recentContactFlag, msgList, fromAccount, sendTime, random, msgBody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMsgRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    recentContactFlag: ").append(toIndentedString(recentContactFlag)).append("\n");
    sb.append("    msgList: ").append(toIndentedString(msgList)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
    sb.append("    random: ").append(toIndentedString(random)).append("\n");
    sb.append("    msgBody: ").append(toIndentedString(msgBody)).append("\n");
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

