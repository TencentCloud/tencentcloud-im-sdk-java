
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetC2cUnreadMsgNumRequest
 */
@JsonPropertyOrder({
  GetC2cUnreadMsgNumRequest.JSON_PROPERTY_TO_ACCOUNT,
  GetC2cUnreadMsgNumRequest.JSON_PROPERTY_PEER_ACCOUNT
})

public class GetC2cUnreadMsgNumRequest {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_PEER_ACCOUNT = "Peer_Account";
  private List<String> peerAccount = null;

  public GetC2cUnreadMsgNumRequest() { 
  }

  public GetC2cUnreadMsgNumRequest toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 待查询的用户 UserId
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "待查询的用户 UserId")
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


  public GetC2cUnreadMsgNumRequest peerAccount(List<String> peerAccount) {
    
    this.peerAccount = peerAccount;
    return this;
  }

  public GetC2cUnreadMsgNumRequest addPeerAccountItem(String peerAccountItem) {
    if (this.peerAccount == null) {
      this.peerAccount = new ArrayList<>();
    }
    this.peerAccount.add(peerAccountItem);
    return this;
  }

   /**
   * 待查询的单聊会话对端的用户 UserId。若要查询单个会话的未读数，该字段必填该数组最大大小为10
   * @return peerAccount
  **/
  @javax.annotation.Nullable
 @Size(max=10)  @ApiModelProperty(value = "待查询的单聊会话对端的用户 UserId。若要查询单个会话的未读数，该字段必填该数组最大大小为10")
  @JsonProperty(JSON_PROPERTY_PEER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPeerAccount() {
    return peerAccount;
  }


  @JsonProperty(JSON_PROPERTY_PEER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeerAccount(List<String> peerAccount) {
    this.peerAccount = peerAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetC2cUnreadMsgNumRequest getC2cUnreadMsgNumRequest = (GetC2cUnreadMsgNumRequest) o;
    return Objects.equals(this.toAccount, getC2cUnreadMsgNumRequest.toAccount) &&
        Objects.equals(this.peerAccount, getC2cUnreadMsgNumRequest.peerAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, peerAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetC2cUnreadMsgNumRequest {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    peerAccount: ").append(toIndentedString(peerAccount)).append("\n");
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

