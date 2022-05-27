
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.PortraitGetResponseAllOfUserProfileItem;
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
 * PortraitGetResponseAllOf
 */
@JsonPropertyOrder({
  PortraitGetResponseAllOf.JSON_PROPERTY_USER_PROFILE_ITEM,
  PortraitGetResponseAllOf.JSON_PROPERTY_FAIL_ACCOUNT,
  PortraitGetResponseAllOf.JSON_PROPERTY_ERROR_DISPLAY
})
@JsonTypeName("PortraitGetResponse_allOf")

public class PortraitGetResponseAllOf {
  public static final String JSON_PROPERTY_USER_PROFILE_ITEM = "UserProfileItem";
  private List<PortraitGetResponseAllOfUserProfileItem> userProfileItem = null;

  public static final String JSON_PROPERTY_FAIL_ACCOUNT = "Fail_Account";
  private List<String> failAccount = null;

  public static final String JSON_PROPERTY_ERROR_DISPLAY = "ErrorDisplay";
  private String errorDisplay;

  public PortraitGetResponseAllOf() { 
  }

  public PortraitGetResponseAllOf userProfileItem(List<PortraitGetResponseAllOfUserProfileItem> userProfileItem) {
    
    this.userProfileItem = userProfileItem;
    return this;
  }

  public PortraitGetResponseAllOf addUserProfileItemItem(PortraitGetResponseAllOfUserProfileItem userProfileItemItem) {
    if (this.userProfileItem == null) {
      this.userProfileItem = new ArrayList<>();
    }
    this.userProfileItem.add(userProfileItemItem);
    return this;
  }

   /**
   * 返回的用户资料结构化信息
   * @return userProfileItem
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "返回的用户资料结构化信息")
  @JsonProperty(JSON_PROPERTY_USER_PROFILE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PortraitGetResponseAllOfUserProfileItem> getUserProfileItem() {
    return userProfileItem;
  }


  @JsonProperty(JSON_PROPERTY_USER_PROFILE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserProfileItem(List<PortraitGetResponseAllOfUserProfileItem> userProfileItem) {
    this.userProfileItem = userProfileItem;
  }


  public PortraitGetResponseAllOf failAccount(List<String> failAccount) {
    
    this.failAccount = failAccount;
    return this;
  }

  public PortraitGetResponseAllOf addFailAccountItem(String failAccountItem) {
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


  public PortraitGetResponseAllOf errorDisplay(String errorDisplay) {
    
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
    PortraitGetResponseAllOf portraitGetResponseAllOf = (PortraitGetResponseAllOf) o;
    return Objects.equals(this.userProfileItem, portraitGetResponseAllOf.userProfileItem) &&
        Objects.equals(this.failAccount, portraitGetResponseAllOf.failAccount) &&
        Objects.equals(this.errorDisplay, portraitGetResponseAllOf.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userProfileItem, failAccount, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortraitGetResponseAllOf {\n");
    sb.append("    userProfileItem: ").append(toIndentedString(userProfileItem)).append("\n");
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

