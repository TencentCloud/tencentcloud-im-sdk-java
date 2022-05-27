
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
 * SetMsgReadRequest
 */
@JsonPropertyOrder({
  SetMsgReadRequest.JSON_PROPERTY_REPORT_ACCOUNT,
  SetMsgReadRequest.JSON_PROPERTY_PEER_ACCOUNT,
  SetMsgReadRequest.JSON_PROPERTY_MSG_READ_TIME
})

public class SetMsgReadRequest {
  public static final String JSON_PROPERTY_REPORT_ACCOUNT = "Report_Account";
  private String reportAccount;

  public static final String JSON_PROPERTY_PEER_ACCOUNT = "Peer_Account";
  private String peerAccount;

  public static final String JSON_PROPERTY_MSG_READ_TIME = "MsgReadTime";
  private String msgReadTime;

  public SetMsgReadRequest() { 
  }

  public SetMsgReadRequest reportAccount(String reportAccount) {
    
    this.reportAccount = reportAccount;
    return this;
  }

   /**
   * 进行消息已读的用户 UserId
   * @return reportAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "进行消息已读的用户 UserId")
  @JsonProperty(JSON_PROPERTY_REPORT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReportAccount() {
    return reportAccount;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReportAccount(String reportAccount) {
    this.reportAccount = reportAccount;
  }


  public SetMsgReadRequest peerAccount(String peerAccount) {
    
    this.peerAccount = peerAccount;
    return this;
  }

   /**
   * 进行消息已读的单聊会话的另一方用户 UserId
   * @return peerAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "进行消息已读的单聊会话的另一方用户 UserId")
  @JsonProperty(JSON_PROPERTY_PEER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPeerAccount() {
    return peerAccount;
  }


  @JsonProperty(JSON_PROPERTY_PEER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPeerAccount(String peerAccount) {
    this.peerAccount = peerAccount;
  }


  public SetMsgReadRequest msgReadTime(String msgReadTime) {
    
    this.msgReadTime = msgReadTime;
    return this;
  }

   /**
   * 时间戳（秒），该时间戳之前的消息全部已读。若不填，则取当前时间戳
   * @return msgReadTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "时间戳（秒），该时间戳之前的消息全部已读。若不填，则取当前时间戳")
  @JsonProperty(JSON_PROPERTY_MSG_READ_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMsgReadTime() {
    return msgReadTime;
  }


  @JsonProperty(JSON_PROPERTY_MSG_READ_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgReadTime(String msgReadTime) {
    this.msgReadTime = msgReadTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetMsgReadRequest setMsgReadRequest = (SetMsgReadRequest) o;
    return Objects.equals(this.reportAccount, setMsgReadRequest.reportAccount) &&
        Objects.equals(this.peerAccount, setMsgReadRequest.peerAccount) &&
        Objects.equals(this.msgReadTime, setMsgReadRequest.msgReadTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportAccount, peerAccount, msgReadTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetMsgReadRequest {\n");
    sb.append("    reportAccount: ").append(toIndentedString(reportAccount)).append("\n");
    sb.append("    peerAccount: ").append(toIndentedString(peerAccount)).append("\n");
    sb.append("    msgReadTime: ").append(toIndentedString(msgReadTime)).append("\n");
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

