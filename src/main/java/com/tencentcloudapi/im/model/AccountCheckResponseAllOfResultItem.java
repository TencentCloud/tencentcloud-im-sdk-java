
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
 * AccountCheckResponseAllOfResultItem
 */
@JsonPropertyOrder({
  AccountCheckResponseAllOfResultItem.JSON_PROPERTY_RESULT_CODE,
  AccountCheckResponseAllOfResultItem.JSON_PROPERTY_RESULT_INFO,
  AccountCheckResponseAllOfResultItem.JSON_PROPERTY_USER_I_D,
  AccountCheckResponseAllOfResultItem.JSON_PROPERTY_ACCOUNT_STATUS
})
@JsonTypeName("AccountCheckResponse_allOf_ResultItem")

public class AccountCheckResponseAllOfResultItem {
  public static final String JSON_PROPERTY_RESULT_CODE = "ResultCode";
  private Integer resultCode;

  public static final String JSON_PROPERTY_RESULT_INFO = "ResultInfo";
  private String resultInfo;

  public static final String JSON_PROPERTY_USER_I_D = "UserID";
  private String userID;

  public static final String JSON_PROPERTY_ACCOUNT_STATUS = "AccountStatus";
  private String accountStatus;

  public AccountCheckResponseAllOfResultItem() { 
  }

  public AccountCheckResponseAllOfResultItem resultCode(Integer resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * 单个帐号的检查结果：0表示成功，非0表示失败
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单个帐号的检查结果：0表示成功，非0表示失败")
  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResultCode() {
    return resultCode;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultCode(Integer resultCode) {
    this.resultCode = resultCode;
  }


  public AccountCheckResponseAllOfResultItem resultInfo(String resultInfo) {
    
    this.resultInfo = resultInfo;
    return this;
  }

   /**
   * 单个帐号检查失败时的错误描述信息
   * @return resultInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单个帐号检查失败时的错误描述信息")
  @JsonProperty(JSON_PROPERTY_RESULT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResultInfo() {
    return resultInfo;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultInfo(String resultInfo) {
    this.resultInfo = resultInfo;
  }


  public AccountCheckResponseAllOfResultItem userID(String userID) {
    
    this.userID = userID;
    return this;
  }

   /**
   * 请求检查的帐号的 UserID
   * @return userID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求检查的帐号的 UserID")
  @JsonProperty(JSON_PROPERTY_USER_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserID() {
    return userID;
  }


  @JsonProperty(JSON_PROPERTY_USER_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserID(String userID) {
    this.userID = userID;
  }


  public AccountCheckResponseAllOfResultItem accountStatus(String accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * 单个帐号的导入状态：Imported 表示已导入，NotImported 表示未导入
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单个帐号的导入状态：Imported 表示已导入，NotImported 表示未导入")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountStatus() {
    return accountStatus;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCheckResponseAllOfResultItem accountCheckResponseAllOfResultItem = (AccountCheckResponseAllOfResultItem) o;
    return Objects.equals(this.resultCode, accountCheckResponseAllOfResultItem.resultCode) &&
        Objects.equals(this.resultInfo, accountCheckResponseAllOfResultItem.resultInfo) &&
        Objects.equals(this.userID, accountCheckResponseAllOfResultItem.userID) &&
        Objects.equals(this.accountStatus, accountCheckResponseAllOfResultItem.accountStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultCode, resultInfo, userID, accountStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCheckResponseAllOfResultItem {\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
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

