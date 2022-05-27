
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.BlackListCheckResponseAllOfBlackListCheckItem;
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
 * BlackListCheckResponseAllOf
 */
@JsonPropertyOrder({
  BlackListCheckResponseAllOf.JSON_PROPERTY_BLACK_LIST_CHECK_ITEM,
  BlackListCheckResponseAllOf.JSON_PROPERTY_FAIL_ACCOUNT,
  BlackListCheckResponseAllOf.JSON_PROPERTY_ERROR_DISPLAY
})
@JsonTypeName("BlackListCheckResponse_allOf")

public class BlackListCheckResponseAllOf {
  public static final String JSON_PROPERTY_BLACK_LIST_CHECK_ITEM = "BlackListCheckItem";
  private List<BlackListCheckResponseAllOfBlackListCheckItem> blackListCheckItem = null;

  public static final String JSON_PROPERTY_FAIL_ACCOUNT = "Fail_Account";
  private List<String> failAccount = null;

  public static final String JSON_PROPERTY_ERROR_DISPLAY = "ErrorDisplay";
  private String errorDisplay;

  public BlackListCheckResponseAllOf() { 
  }

  public BlackListCheckResponseAllOf blackListCheckItem(List<BlackListCheckResponseAllOfBlackListCheckItem> blackListCheckItem) {
    
    this.blackListCheckItem = blackListCheckItem;
    return this;
  }

  public BlackListCheckResponseAllOf addBlackListCheckItemItem(BlackListCheckResponseAllOfBlackListCheckItem blackListCheckItemItem) {
    if (this.blackListCheckItem == null) {
      this.blackListCheckItem = new ArrayList<>();
    }
    this.blackListCheckItem.add(blackListCheckItemItem);
    return this;
  }

   /**
   * 校验结果对象数组
   * @return blackListCheckItem
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "校验结果对象数组")
  @JsonProperty(JSON_PROPERTY_BLACK_LIST_CHECK_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BlackListCheckResponseAllOfBlackListCheckItem> getBlackListCheckItem() {
    return blackListCheckItem;
  }


  @JsonProperty(JSON_PROPERTY_BLACK_LIST_CHECK_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlackListCheckItem(List<BlackListCheckResponseAllOfBlackListCheckItem> blackListCheckItem) {
    this.blackListCheckItem = blackListCheckItem;
  }


  public BlackListCheckResponseAllOf failAccount(List<String> failAccount) {
    
    this.failAccount = failAccount;
    return this;
  }

  public BlackListCheckResponseAllOf addFailAccountItem(String failAccountItem) {
    if (this.failAccount == null) {
      this.failAccount = new ArrayList<>();
    }
    this.failAccount.add(failAccountItem);
    return this;
  }

   /**
   * 返回处理失败的用户列表，仅当存在失败用户时才返回该字段
   * @return failAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回处理失败的用户列表，仅当存在失败用户时才返回该字段")
  @JsonProperty(JSON_PROPERTY_FAIL_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFailAccount() {
    return failAccount;
  }


  @JsonProperty(JSON_PROPERTY_FAIL_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailAccount(List<String> failAccount) {
    this.failAccount = failAccount;
  }


  public BlackListCheckResponseAllOf errorDisplay(String errorDisplay) {
    
    this.errorDisplay = errorDisplay;
    return this;
  }

   /**
   * 详细的客户端展示信息
   * @return errorDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "详细的客户端展示信息")
  @JsonProperty(JSON_PROPERTY_ERROR_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDisplay() {
    return errorDisplay;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorDisplay(String errorDisplay) {
    this.errorDisplay = errorDisplay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlackListCheckResponseAllOf blackListCheckResponseAllOf = (BlackListCheckResponseAllOf) o;
    return Objects.equals(this.blackListCheckItem, blackListCheckResponseAllOf.blackListCheckItem) &&
        Objects.equals(this.failAccount, blackListCheckResponseAllOf.failAccount) &&
        Objects.equals(this.errorDisplay, blackListCheckResponseAllOf.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blackListCheckItem, failAccount, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlackListCheckResponseAllOf {\n");
    sb.append("    blackListCheckItem: ").append(toIndentedString(blackListCheckItem)).append("\n");
    sb.append("    failAccount: ").append(toIndentedString(failAccount)).append("\n");
    sb.append("    errorDisplay: ").append(toIndentedString(errorDisplay)).append("\n");
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

