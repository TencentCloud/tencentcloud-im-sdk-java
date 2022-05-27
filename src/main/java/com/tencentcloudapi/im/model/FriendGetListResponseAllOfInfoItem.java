
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.FriendGetListResponseAllOfSnsProfileItem;
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
 * FriendGetListResponseAllOfInfoItem
 */
@JsonPropertyOrder({
  FriendGetListResponseAllOfInfoItem.JSON_PROPERTY_TO_ACCOUNT,
  FriendGetListResponseAllOfInfoItem.JSON_PROPERTY_SNS_PROFILE_ITEM,
  FriendGetListResponseAllOfInfoItem.JSON_PROPERTY_RESULT_CODE,
  FriendGetListResponseAllOfInfoItem.JSON_PROPERTY_RESULT_INFO
})
@JsonTypeName("FriendGetListResponse_allOf_InfoItem")

public class FriendGetListResponseAllOfInfoItem {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_SNS_PROFILE_ITEM = "SnsProfileItem";
  private List<FriendGetListResponseAllOfSnsProfileItem> snsProfileItem = null;

  public static final String JSON_PROPERTY_RESULT_CODE = "ResultCode";
  private Integer resultCode;

  public static final String JSON_PROPERTY_RESULT_INFO = "ResultInfo";
  private String resultInfo;

  public FriendGetListResponseAllOfInfoItem() { 
  }

  public FriendGetListResponseAllOfInfoItem toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 请求校验的用户的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求校验的用户的 UserID")
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


  public FriendGetListResponseAllOfInfoItem snsProfileItem(List<FriendGetListResponseAllOfSnsProfileItem> snsProfileItem) {
    
    this.snsProfileItem = snsProfileItem;
    return this;
  }

  public FriendGetListResponseAllOfInfoItem addSnsProfileItemItem(FriendGetListResponseAllOfSnsProfileItem snsProfileItemItem) {
    if (this.snsProfileItem == null) {
      this.snsProfileItem = new ArrayList<>();
    }
    this.snsProfileItem.add(snsProfileItemItem);
    return this;
  }

   /**
   * 保存好友数据的数组，数组每一个元素都包含一个 Tag 字段和一个 Value 字段
   * @return snsProfileItem
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "保存好友数据的数组，数组每一个元素都包含一个 Tag 字段和一个 Value 字段")
  @JsonProperty(JSON_PROPERTY_SNS_PROFILE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FriendGetListResponseAllOfSnsProfileItem> getSnsProfileItem() {
    return snsProfileItem;
  }


  @JsonProperty(JSON_PROPERTY_SNS_PROFILE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnsProfileItem(List<FriendGetListResponseAllOfSnsProfileItem> snsProfileItem) {
    this.snsProfileItem = snsProfileItem;
  }


  public FriendGetListResponseAllOfInfoItem resultCode(Integer resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * To_Account 的处理结果，0表示成功，非0表示失败，非0取值的详细描述请参见 错误码说明（https://cloud.tencent.com/document/product/269/1643#ErrorCode）
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To_Account 的处理结果，0表示成功，非0表示失败，非0取值的详细描述请参见 错误码说明（https://cloud.tencent.com/document/product/269/1643#ErrorCode）")
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


  public FriendGetListResponseAllOfInfoItem resultInfo(String resultInfo) {
    
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
    FriendGetListResponseAllOfInfoItem friendGetListResponseAllOfInfoItem = (FriendGetListResponseAllOfInfoItem) o;
    return Objects.equals(this.toAccount, friendGetListResponseAllOfInfoItem.toAccount) &&
        Objects.equals(this.snsProfileItem, friendGetListResponseAllOfInfoItem.snsProfileItem) &&
        Objects.equals(this.resultCode, friendGetListResponseAllOfInfoItem.resultCode) &&
        Objects.equals(this.resultInfo, friendGetListResponseAllOfInfoItem.resultInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, snsProfileItem, resultCode, resultInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendGetListResponseAllOfInfoItem {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    snsProfileItem: ").append(toIndentedString(snsProfileItem)).append("\n");
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

