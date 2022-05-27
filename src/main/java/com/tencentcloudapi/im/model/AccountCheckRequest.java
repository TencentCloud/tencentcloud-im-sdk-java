
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.AccountCheckRequestCheckItemInner;
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
 * AccountCheckRequest
 */
@JsonPropertyOrder({
  AccountCheckRequest.JSON_PROPERTY_CHECK_ITEM
})

public class AccountCheckRequest {
  public static final String JSON_PROPERTY_CHECK_ITEM = "CheckItem";
  private List<AccountCheckRequestCheckItemInner> checkItem = new ArrayList<>();

  public AccountCheckRequest() { 
  }

  public AccountCheckRequest checkItem(List<AccountCheckRequestCheckItemInner> checkItem) {
    
    this.checkItem = checkItem;
    return this;
  }

  public AccountCheckRequest addCheckItemItem(AccountCheckRequestCheckItemInner checkItemItem) {
    this.checkItem.add(checkItemItem);
    return this;
  }

   /**
   * 请求检查的帐号对象数组，单次请求最多支持100个帐号
   * @return checkItem
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
 @Size(max=100)  @ApiModelProperty(required = true, value = "请求检查的帐号对象数组，单次请求最多支持100个帐号")
  @JsonProperty(JSON_PROPERTY_CHECK_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AccountCheckRequestCheckItemInner> getCheckItem() {
    return checkItem;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCheckItem(List<AccountCheckRequestCheckItemInner> checkItem) {
    this.checkItem = checkItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCheckRequest accountCheckRequest = (AccountCheckRequest) o;
    return Objects.equals(this.checkItem, accountCheckRequest.checkItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCheckRequest {\n");
    sb.append("    checkItem: ").append(toIndentedString(checkItem)).append("\n");
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

