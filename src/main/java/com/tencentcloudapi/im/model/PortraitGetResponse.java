
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.PortraitGetResponseAllOf;
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
 * PortraitGetResponse
 */
@JsonPropertyOrder({
  PortraitGetResponse.JSON_PROPERTY_ACTION_STATUS,
  PortraitGetResponse.JSON_PROPERTY_ERROR_INFO,
  PortraitGetResponse.JSON_PROPERTY_ERROR_CODE,
  PortraitGetResponse.JSON_PROPERTY_USER_PROFILE_ITEM,
  PortraitGetResponse.JSON_PROPERTY_FAIL_ACCOUNT,
  PortraitGetResponse.JSON_PROPERTY_ERROR_DISPLAY
})

public class PortraitGetResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_USER_PROFILE_ITEM = "UserProfileItem";
  private List<PortraitGetResponseAllOfUserProfileItem> userProfileItem = null;

  public static final String JSON_PROPERTY_FAIL_ACCOUNT = "Fail_Account";
  private List<String> failAccount = null;

  public static final String JSON_PROPERTY_ERROR_DISPLAY = "ErrorDisplay";
  private String errorDisplay;

  public PortraitGetResponse() { 
  }

  public PortraitGetResponse actionStatus(String actionStatus) {
    
    this.actionStatus = actionStatus;
    return this;
  }

   /**
   * 请求处理的结果，OK 表示处理成功，FAIL 表示失败
   * @return actionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求处理的结果，OK 表示处理成功，FAIL 表示失败")
  @JsonProperty(JSON_PROPERTY_ACTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActionStatus() {
    return actionStatus;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }


  public PortraitGetResponse errorInfo(String errorInfo) {
    
    this.errorInfo = errorInfo;
    return this;
  }

   /**
   * 错误信息
   * @return errorInfo
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "错误信息")
  @JsonProperty(JSON_PROPERTY_ERROR_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getErrorInfo() {
    return errorInfo;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
  }


  public PortraitGetResponse errorCode(Integer errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 错误码，0表示成功，非0表示失败
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "错误码，0表示成功，非0表示失败")
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


  public PortraitGetResponse userProfileItem(List<PortraitGetResponseAllOfUserProfileItem> userProfileItem) {
    
    this.userProfileItem = userProfileItem;
    return this;
  }

  public PortraitGetResponse addUserProfileItemItem(PortraitGetResponseAllOfUserProfileItem userProfileItemItem) {
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


  public PortraitGetResponse failAccount(List<String> failAccount) {
    
    this.failAccount = failAccount;
    return this;
  }

  public PortraitGetResponse addFailAccountItem(String failAccountItem) {
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


  public PortraitGetResponse errorDisplay(String errorDisplay) {
    
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
    PortraitGetResponse portraitGetResponse = (PortraitGetResponse) o;
    return Objects.equals(this.actionStatus, portraitGetResponse.actionStatus) &&
        Objects.equals(this.errorInfo, portraitGetResponse.errorInfo) &&
        Objects.equals(this.errorCode, portraitGetResponse.errorCode) &&
        Objects.equals(this.userProfileItem, portraitGetResponse.userProfileItem) &&
        Objects.equals(this.failAccount, portraitGetResponse.failAccount) &&
        Objects.equals(this.errorDisplay, portraitGetResponse.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, userProfileItem, failAccount, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortraitGetResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

