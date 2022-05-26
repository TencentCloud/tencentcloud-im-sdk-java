
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
 * GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList
 */
@JsonPropertyOrder({
  GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.JSON_PROPERTY_PEER_ACCOUNT,
  GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.JSON_PROPERTY_C2_C_UNREAD_MSG_NUM
})
@JsonTypeName("GetC2cUnreadMsgNumResponse_allOf_C2CUnreadMsgNumList")

public class GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList {
  public static final String JSON_PROPERTY_PEER_ACCOUNT = "Peer_Account";
  private String peerAccount;

  public static final String JSON_PROPERTY_C2_C_UNREAD_MSG_NUM = "C2CUnreadMsgNum";
  private String c2CUnreadMsgNum;

  public GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList() { 
  }

  public GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList peerAccount(String peerAccount) {
    
    this.peerAccount = peerAccount;
    return this;
  }

   /**
   * 单聊会话对端 UserId
   * @return peerAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单聊会话对端 UserId")
  @JsonProperty(JSON_PROPERTY_PEER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPeerAccount() {
    return peerAccount;
  }


  @JsonProperty(JSON_PROPERTY_PEER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeerAccount(String peerAccount) {
    this.peerAccount = peerAccount;
  }


  public GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList c2CUnreadMsgNum(String c2CUnreadMsgNum) {
    
    this.c2CUnreadMsgNum = c2CUnreadMsgNum;
    return this;
  }

   /**
   * 该单聊会话的未读数
   * @return c2CUnreadMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该单聊会话的未读数")
  @JsonProperty(JSON_PROPERTY_C2_C_UNREAD_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getC2CUnreadMsgNum() {
    return c2CUnreadMsgNum;
  }


  @JsonProperty(JSON_PROPERTY_C2_C_UNREAD_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setC2CUnreadMsgNum(String c2CUnreadMsgNum) {
    this.c2CUnreadMsgNum = c2CUnreadMsgNum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList getC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList = (GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList) o;
    return Objects.equals(this.peerAccount, getC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.peerAccount) &&
        Objects.equals(this.c2CUnreadMsgNum, getC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.c2CUnreadMsgNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peerAccount, c2CUnreadMsgNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList {\n");
    sb.append("    peerAccount: ").append(toIndentedString(peerAccount)).append("\n");
    sb.append("    c2CUnreadMsgNum: ").append(toIndentedString(c2CUnreadMsgNum)).append("\n");
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

