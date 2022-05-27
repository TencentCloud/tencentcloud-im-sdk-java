
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
 * AccountDeleteResponseAllOfResultItem
 */
@JsonPropertyOrder({
  AccountDeleteResponseAllOfResultItem.JSON_PROPERTY_RESULT_CODE,
  AccountDeleteResponseAllOfResultItem.JSON_PROPERTY_RESULT_INFO,
  AccountDeleteResponseAllOfResultItem.JSON_PROPERTY_USER_I_D
})
@JsonTypeName("AccountDeleteResponse_allOf_ResultItem")

public class AccountDeleteResponseAllOfResultItem {
  public static final String JSON_PROPERTY_RESULT_CODE = "ResultCode";
  private Integer resultCode;

  public static final String JSON_PROPERTY_RESULT_INFO = "ResultInfo";
  private String resultInfo;

  public static final String JSON_PROPERTY_USER_I_D = "UserID";
  private String userID;

  public AccountDeleteResponseAllOfResultItem() { 
  }

  public AccountDeleteResponseAllOfResultItem resultCode(Integer resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * 单个帐号的错误码，0表示成功，非0表示失败
   * @return resultCode
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "单个帐号的错误码，0表示成功，非0表示失败")
  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getResultCode() {
    return resultCode;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResultCode(Integer resultCode) {
    this.resultCode = resultCode;
  }


  public AccountDeleteResponseAllOfResultItem resultInfo(String resultInfo) {
    
    this.resultInfo = resultInfo;
    return this;
  }

   /**
   * 单个帐号删除失败时的错误描述信息
   * @return resultInfo
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "单个帐号删除失败时的错误描述信息")
  @JsonProperty(JSON_PROPERTY_RESULT_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResultInfo() {
    return resultInfo;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResultInfo(String resultInfo) {
    this.resultInfo = resultInfo;
  }


  public AccountDeleteResponseAllOfResultItem userID(String userID) {
    
    this.userID = userID;
    return this;
  }

   /**
   * 请求删除的帐号的 UserID
   * @return userID
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "请求删除的帐号的 UserID")
  @JsonProperty(JSON_PROPERTY_USER_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserID() {
    return userID;
  }


  @JsonProperty(JSON_PROPERTY_USER_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserID(String userID) {
    this.userID = userID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDeleteResponseAllOfResultItem accountDeleteResponseAllOfResultItem = (AccountDeleteResponseAllOfResultItem) o;
    return Objects.equals(this.resultCode, accountDeleteResponseAllOfResultItem.resultCode) &&
        Objects.equals(this.resultInfo, accountDeleteResponseAllOfResultItem.resultInfo) &&
        Objects.equals(this.userID, accountDeleteResponseAllOfResultItem.userID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultCode, resultInfo, userID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDeleteResponseAllOfResultItem {\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
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

