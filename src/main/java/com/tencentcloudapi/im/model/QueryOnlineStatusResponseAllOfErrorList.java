
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
 * QueryOnlineStatusResponseAllOfErrorList
 */
@JsonPropertyOrder({
  QueryOnlineStatusResponseAllOfErrorList.JSON_PROPERTY_TO_ACCOUNT,
  QueryOnlineStatusResponseAllOfErrorList.JSON_PROPERTY_ERROR_CODE
})
@JsonTypeName("QueryOnlineStatusResponse_allOf_ErrorList")

public class QueryOnlineStatusResponseAllOfErrorList {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public QueryOnlineStatusResponseAllOfErrorList() { 
  }

  public QueryOnlineStatusResponseAllOfErrorList toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 状态查询失败的目标帐号
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "状态查询失败的目标帐号")
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


  public QueryOnlineStatusResponseAllOfErrorList errorCode(Integer errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 状态查询失败的错误码，若目标帐号的错误码为70107，表示该帐号不存在
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "状态查询失败的错误码，若目标帐号的错误码为70107，表示该帐号不存在")
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
    QueryOnlineStatusResponseAllOfErrorList queryOnlineStatusResponseAllOfErrorList = (QueryOnlineStatusResponseAllOfErrorList) o;
    return Objects.equals(this.toAccount, queryOnlineStatusResponseAllOfErrorList.toAccount) &&
        Objects.equals(this.errorCode, queryOnlineStatusResponseAllOfErrorList.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOnlineStatusResponseAllOfErrorList {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
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
