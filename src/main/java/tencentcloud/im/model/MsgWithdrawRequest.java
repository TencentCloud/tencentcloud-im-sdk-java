
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
 * MsgWithdrawRequest
 */
@JsonPropertyOrder({
  MsgWithdrawRequest.JSON_PROPERTY_FROM_ACCOUNT,
  MsgWithdrawRequest.JSON_PROPERTY_TO_ACCOUNT,
  MsgWithdrawRequest.JSON_PROPERTY_MSG_KEY
})

public class MsgWithdrawRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_MSG_KEY = "MsgKey";
  private String msgKey;

  public MsgWithdrawRequest() { 
  }

  public MsgWithdrawRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 消息发送方 UserID
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "消息发送方 UserID")
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


  public MsgWithdrawRequest toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 消息接收方 UserID
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "消息接收方 UserID")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public MsgWithdrawRequest msgKey(String msgKey) {
    
    this.msgKey = msgKey;
    return this;
  }

   /**
   * 待撤回消息的唯一标识。该字段由REST API接口单发单聊消息（https://cloud.tencent.com/document/product/269/2282）和 批量发单聊消息（https://cloud.tencent.com/document/product/269/1612）返回
   * @return msgKey
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "待撤回消息的唯一标识。该字段由REST API接口单发单聊消息（https://cloud.tencent.com/document/product/269/2282）和 批量发单聊消息（https://cloud.tencent.com/document/product/269/1612）返回")
  @JsonProperty(JSON_PROPERTY_MSG_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMsgKey() {
    return msgKey;
  }


  @JsonProperty(JSON_PROPERTY_MSG_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsgKey(String msgKey) {
    this.msgKey = msgKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MsgWithdrawRequest msgWithdrawRequest = (MsgWithdrawRequest) o;
    return Objects.equals(this.fromAccount, msgWithdrawRequest.fromAccount) &&
        Objects.equals(this.toAccount, msgWithdrawRequest.toAccount) &&
        Objects.equals(this.msgKey, msgWithdrawRequest.msgKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, toAccount, msgKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MsgWithdrawRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    msgKey: ").append(toIndentedString(msgKey)).append("\n");
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

