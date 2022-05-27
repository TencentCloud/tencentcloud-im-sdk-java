
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.FriendGetListResponseAllOfInfoItem;
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
 * FriendGetListResponseAllOf
 */
@JsonPropertyOrder({
  FriendGetListResponseAllOf.JSON_PROPERTY_INFO_ITEM,
  FriendGetListResponseAllOf.JSON_PROPERTY_FAIL_ACCOUNT,
  FriendGetListResponseAllOf.JSON_PROPERTY_ERROR_DISPLAY
})
@JsonTypeName("FriendGetListResponse_allOf")

public class FriendGetListResponseAllOf {
  public static final String JSON_PROPERTY_INFO_ITEM = "InfoItem";
  private List<FriendGetListResponseAllOfInfoItem> infoItem = null;

  public static final String JSON_PROPERTY_FAIL_ACCOUNT = "Fail_Account";
  private List<String> failAccount = null;

  public static final String JSON_PROPERTY_ERROR_DISPLAY = "ErrorDisplay";
  private String errorDisplay;

  public FriendGetListResponseAllOf() { 
  }

  public FriendGetListResponseAllOf infoItem(List<FriendGetListResponseAllOfInfoItem> infoItem) {
    
    this.infoItem = infoItem;
    return this;
  }

  public FriendGetListResponseAllOf addInfoItemItem(FriendGetListResponseAllOfInfoItem infoItemItem) {
    if (this.infoItem == null) {
      this.infoItem = new ArrayList<>();
    }
    this.infoItem.add(infoItemItem);
    return this;
  }

   /**
   * 好友对象数组，每一个好友对象都包含一个 To_Account 字段和一个 SnsProfileItem 数组
   * @return infoItem
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "好友对象数组，每一个好友对象都包含一个 To_Account 字段和一个 SnsProfileItem 数组")
  @JsonProperty(JSON_PROPERTY_INFO_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FriendGetListResponseAllOfInfoItem> getInfoItem() {
    return infoItem;
  }


  @JsonProperty(JSON_PROPERTY_INFO_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfoItem(List<FriendGetListResponseAllOfInfoItem> infoItem) {
    this.infoItem = infoItem;
  }


  public FriendGetListResponseAllOf failAccount(List<String> failAccount) {
    
    this.failAccount = failAccount;
    return this;
  }

  public FriendGetListResponseAllOf addFailAccountItem(String failAccountItem) {
    if (this.failAccount == null) {
      this.failAccount = new ArrayList<>();
    }
    this.failAccount.add(failAccountItem);
    return this;
  }

   /**
   * 返回处理失败的 UserID 列表，仅当存在失败用户时才返回该字段
   * @return failAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回处理失败的 UserID 列表，仅当存在失败用户时才返回该字段")
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


  public FriendGetListResponseAllOf errorDisplay(String errorDisplay) {
    
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
    FriendGetListResponseAllOf friendGetListResponseAllOf = (FriendGetListResponseAllOf) o;
    return Objects.equals(this.infoItem, friendGetListResponseAllOf.infoItem) &&
        Objects.equals(this.failAccount, friendGetListResponseAllOf.failAccount) &&
        Objects.equals(this.errorDisplay, friendGetListResponseAllOf.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infoItem, failAccount, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendGetListResponseAllOf {\n");
    sb.append("    infoItem: ").append(toIndentedString(infoItem)).append("\n");
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

