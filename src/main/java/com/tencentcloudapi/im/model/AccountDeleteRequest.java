
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.AccountDeleteRequestDeleteItemInner;
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
 * AccountDeleteRequest
 */
@JsonPropertyOrder({
  AccountDeleteRequest.JSON_PROPERTY_DELETE_ITEM
})

public class AccountDeleteRequest {
  public static final String JSON_PROPERTY_DELETE_ITEM = "DeleteItem";
  private List<AccountDeleteRequestDeleteItemInner> deleteItem = new ArrayList<>();

  public AccountDeleteRequest() { 
  }

  public AccountDeleteRequest deleteItem(List<AccountDeleteRequestDeleteItemInner> deleteItem) {
    
    this.deleteItem = deleteItem;
    return this;
  }

  public AccountDeleteRequest addDeleteItemItem(AccountDeleteRequestDeleteItemInner deleteItemItem) {
    this.deleteItem.add(deleteItemItem);
    return this;
  }

   /**
   * 请求删除的帐号对象数组，单次请求最多支持100个帐号
   * @return deleteItem
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
 @Size(max=100)  @ApiModelProperty(required = true, value = "请求删除的帐号对象数组，单次请求最多支持100个帐号")
  @JsonProperty(JSON_PROPERTY_DELETE_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AccountDeleteRequestDeleteItemInner> getDeleteItem() {
    return deleteItem;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeleteItem(List<AccountDeleteRequestDeleteItemInner> deleteItem) {
    this.deleteItem = deleteItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDeleteRequest accountDeleteRequest = (AccountDeleteRequest) o;
    return Objects.equals(this.deleteItem, accountDeleteRequest.deleteItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDeleteRequest {\n");
    sb.append("    deleteItem: ").append(toIndentedString(deleteItem)).append("\n");
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

