
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.FriendImportRequestAddFriendItemInner;
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
 * FriendImportRequest
 */
@JsonPropertyOrder({
  FriendImportRequest.JSON_PROPERTY_FROM_ACCOUNT,
  FriendImportRequest.JSON_PROPERTY_ADD_FRIEND_ITEM
})

public class FriendImportRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_ADD_FRIEND_ITEM = "AddFriendItem";
  private List<FriendImportRequestAddFriendItemInner> addFriendItem = new ArrayList<>();

  public FriendImportRequest() { 
  }

  public FriendImportRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 需要为该 UserID 添加好友
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要为该 UserID 添加好友")
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


  public FriendImportRequest addFriendItem(List<FriendImportRequestAddFriendItemInner> addFriendItem) {
    
    this.addFriendItem = addFriendItem;
    return this;
  }

  public FriendImportRequest addAddFriendItemItem(FriendImportRequestAddFriendItemInner addFriendItemItem) {
    this.addFriendItem.add(addFriendItemItem);
    return this;
  }

   /**
   * 好友结构体对象
   * @return addFriendItem
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "好友结构体对象")
  @JsonProperty(JSON_PROPERTY_ADD_FRIEND_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<FriendImportRequestAddFriendItemInner> getAddFriendItem() {
    return addFriendItem;
  }


  @JsonProperty(JSON_PROPERTY_ADD_FRIEND_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddFriendItem(List<FriendImportRequestAddFriendItemInner> addFriendItem) {
    this.addFriendItem = addFriendItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendImportRequest friendImportRequest = (FriendImportRequest) o;
    return Objects.equals(this.fromAccount, friendImportRequest.fromAccount) &&
        Objects.equals(this.addFriendItem, friendImportRequest.addFriendItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, addFriendItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendImportRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    addFriendItem: ").append(toIndentedString(addFriendItem)).append("\n");
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

