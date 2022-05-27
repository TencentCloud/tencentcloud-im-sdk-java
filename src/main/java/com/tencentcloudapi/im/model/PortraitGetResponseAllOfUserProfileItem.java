
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.PortraitGetResponseAllOfProfileItem;
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
 * PortraitGetResponseAllOfUserProfileItem
 */
@JsonPropertyOrder({
  PortraitGetResponseAllOfUserProfileItem.JSON_PROPERTY_TO_ACCOUNT,
  PortraitGetResponseAllOfUserProfileItem.JSON_PROPERTY_PROFILE_ITEM,
  PortraitGetResponseAllOfUserProfileItem.JSON_PROPERTY_RESULT_CODE,
  PortraitGetResponseAllOfUserProfileItem.JSON_PROPERTY_RESULT_INFO
})
@JsonTypeName("PortraitGetResponse_allOf_UserProfileItem")

public class PortraitGetResponseAllOfUserProfileItem {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_PROFILE_ITEM = "ProfileItem";
  private List<PortraitGetResponseAllOfProfileItem> profileItem = null;

  public static final String JSON_PROPERTY_RESULT_CODE = "ResultCode";
  private Integer resultCode;

  public static final String JSON_PROPERTY_RESULT_INFO = "ResultInfo";
  private String resultInfo;

  public PortraitGetResponseAllOfUserProfileItem() { 
  }

  public PortraitGetResponseAllOfUserProfileItem toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 返回的用户的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回的用户的 UserID")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public PortraitGetResponseAllOfUserProfileItem profileItem(List<PortraitGetResponseAllOfProfileItem> profileItem) {
    
    this.profileItem = profileItem;
    return this;
  }

  public PortraitGetResponseAllOfUserProfileItem addProfileItemItem(PortraitGetResponseAllOfProfileItem profileItemItem) {
    if (this.profileItem == null) {
      this.profileItem = new ArrayList<>();
    }
    this.profileItem.add(profileItemItem);
    return this;
  }

   /**
   * 返回的用户的资料对象数组，数组中每一个对象都包含了 Tag 和 Value
   * @return profileItem
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "返回的用户的资料对象数组，数组中每一个对象都包含了 Tag 和 Value")
  @JsonProperty(JSON_PROPERTY_PROFILE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PortraitGetResponseAllOfProfileItem> getProfileItem() {
    return profileItem;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileItem(List<PortraitGetResponseAllOfProfileItem> profileItem) {
    this.profileItem = profileItem;
  }


  public PortraitGetResponseAllOfUserProfileItem resultCode(Integer resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * To_Account 的处理结果，0表示成功，非0表示失败
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To_Account 的处理结果，0表示成功，非0表示失败")
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


  public PortraitGetResponseAllOfUserProfileItem resultInfo(String resultInfo) {
    
    this.resultInfo = resultInfo;
    return this;
  }

   /**
   * To_Account 的错误描述信息，成功时该字段为空
   * @return resultInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To_Account 的错误描述信息，成功时该字段为空")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortraitGetResponseAllOfUserProfileItem portraitGetResponseAllOfUserProfileItem = (PortraitGetResponseAllOfUserProfileItem) o;
    return Objects.equals(this.toAccount, portraitGetResponseAllOfUserProfileItem.toAccount) &&
        Objects.equals(this.profileItem, portraitGetResponseAllOfUserProfileItem.profileItem) &&
        Objects.equals(this.resultCode, portraitGetResponseAllOfUserProfileItem.resultCode) &&
        Objects.equals(this.resultInfo, portraitGetResponseAllOfUserProfileItem.resultInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, profileItem, resultCode, resultInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortraitGetResponseAllOfUserProfileItem {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    profileItem: ").append(toIndentedString(profileItem)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
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

