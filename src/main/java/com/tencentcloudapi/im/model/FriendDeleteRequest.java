
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
 * FriendDeleteRequest
 */
@JsonPropertyOrder({
  FriendDeleteRequest.JSON_PROPERTY_FROM_ACCOUNT,
  FriendDeleteRequest.JSON_PROPERTY_TO_ACCOUNT,
  FriendDeleteRequest.JSON_PROPERTY_DELETE_TYPE
})

public class FriendDeleteRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private List<String> toAccount = null;

  public static final String JSON_PROPERTY_DELETE_TYPE = "DeleteType";
  private String deleteType;

  public FriendDeleteRequest() { 
  }

  public FriendDeleteRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 需要删除该 UserID 的好友
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要删除该 UserID 的好友")
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


  public FriendDeleteRequest toAccount(List<String> toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

  public FriendDeleteRequest addToAccountItem(String toAccountItem) {
    if (this.toAccount == null) {
      this.toAccount = new ArrayList<>();
    }
    this.toAccount.add(toAccountItem);
    return this;
  }

   /**
   * 待删除的好友的 UserID 列表，单次请求的 To_Account 数不得超过1000
   * @return toAccount
  **/
  @javax.annotation.Nullable
 @Size(max=1000)  @ApiModelProperty(value = "待删除的好友的 UserID 列表，单次请求的 To_Account 数不得超过1000")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAccount(List<String> toAccount) {
    this.toAccount = toAccount;
  }


  public FriendDeleteRequest deleteType(String deleteType) {
    
    this.deleteType = deleteType;
    return this;
  }

   /**
   * 删除模式，详情可参见 删除好友（https://cloud.tencent.com/document/product/269/1501#.E5.88.A0.E9.99.A4.E5.A5.BD.E5.8F.8B）
   * @return deleteType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "删除模式，详情可参见 删除好友（https://cloud.tencent.com/document/product/269/1501#.E5.88.A0.E9.99.A4.E5.A5.BD.E5.8F.8B）")
  @JsonProperty(JSON_PROPERTY_DELETE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeleteType() {
    return deleteType;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteType(String deleteType) {
    this.deleteType = deleteType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendDeleteRequest friendDeleteRequest = (FriendDeleteRequest) o;
    return Objects.equals(this.fromAccount, friendDeleteRequest.fromAccount) &&
        Objects.equals(this.toAccount, friendDeleteRequest.toAccount) &&
        Objects.equals(this.deleteType, friendDeleteRequest.deleteType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, toAccount, deleteType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendDeleteRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    deleteType: ").append(toIndentedString(deleteType)).append("\n");
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

