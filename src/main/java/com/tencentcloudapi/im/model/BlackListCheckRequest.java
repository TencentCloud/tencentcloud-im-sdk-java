
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
 * BlackListCheckRequest
 */
@JsonPropertyOrder({
  BlackListCheckRequest.JSON_PROPERTY_FROM_ACCOUNT,
  BlackListCheckRequest.JSON_PROPERTY_TO_ACCOUNT,
  BlackListCheckRequest.JSON_PROPERTY_CHECK_TYPE
})

public class BlackListCheckRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private List<String> toAccount = new ArrayList<>();

  public static final String JSON_PROPERTY_CHECK_TYPE = "CheckType";
  private String checkType;

  public BlackListCheckRequest() { 
  }

  public BlackListCheckRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 需要校验该 UserID 的黑名单
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要校验该 UserID 的黑名单")
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


  public BlackListCheckRequest toAccount(List<String> toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

  public BlackListCheckRequest addToAccountItem(String toAccountItem) {
    this.toAccount.add(toAccountItem);
    return this;
  }

   /**
   * 待校验的黑名单的 UserID 列表，单次请求的 To_Account 数不得超过1000
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "待校验的黑名单的 UserID 列表，单次请求的 To_Account 数不得超过1000")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToAccount(List<String> toAccount) {
    this.toAccount = toAccount;
  }


  public BlackListCheckRequest checkType(String checkType) {
    
    this.checkType = checkType;
    return this;
  }

   /**
   * 校验模式，详情可参见 校验黑名单（校验黑名单）
   * @return checkType
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "校验模式，详情可参见 校验黑名单（校验黑名单）")
  @JsonProperty(JSON_PROPERTY_CHECK_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCheckType() {
    return checkType;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCheckType(String checkType) {
    this.checkType = checkType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlackListCheckRequest blackListCheckRequest = (BlackListCheckRequest) o;
    return Objects.equals(this.fromAccount, blackListCheckRequest.fromAccount) &&
        Objects.equals(this.toAccount, blackListCheckRequest.toAccount) &&
        Objects.equals(this.checkType, blackListCheckRequest.checkType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, toAccount, checkType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlackListCheckRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
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

