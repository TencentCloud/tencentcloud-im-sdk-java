
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
 * GetC2cUnreadMsgNumResponseAllOfErrorList
 */
@JsonPropertyOrder({
  GetC2cUnreadMsgNumResponseAllOfErrorList.JSON_PROPERTY_PEER_ACCOUNT,
  GetC2cUnreadMsgNumResponseAllOfErrorList.JSON_PROPERTY_ERROR_CODE
})
@JsonTypeName("GetC2cUnreadMsgNumResponse_allOf_ErrorList")

public class GetC2cUnreadMsgNumResponseAllOfErrorList {
  public static final String JSON_PROPERTY_PEER_ACCOUNT = "Peer_Account";
  private String peerAccount;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public GetC2cUnreadMsgNumResponseAllOfErrorList() { 
  }

  public GetC2cUnreadMsgNumResponseAllOfErrorList peerAccount(String peerAccount) {
    
    this.peerAccount = peerAccount;
    return this;
  }

   /**
   * 查询错误的目标帐号
   * @return peerAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "查询错误的目标帐号")
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


  public GetC2cUnreadMsgNumResponseAllOfErrorList errorCode(Integer errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 查询错误的错误码。若目标帐号的错误码为70107表示该帐号不存在
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "查询错误的错误码。若目标帐号的错误码为70107表示该帐号不存在")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetC2cUnreadMsgNumResponseAllOfErrorList getC2cUnreadMsgNumResponseAllOfErrorList = (GetC2cUnreadMsgNumResponseAllOfErrorList) o;
    return Objects.equals(this.peerAccount, getC2cUnreadMsgNumResponseAllOfErrorList.peerAccount) &&
        Objects.equals(this.errorCode, getC2cUnreadMsgNumResponseAllOfErrorList.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peerAccount, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetC2cUnreadMsgNumResponseAllOfErrorList {\n");
    sb.append("    peerAccount: ").append(toIndentedString(peerAccount)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

