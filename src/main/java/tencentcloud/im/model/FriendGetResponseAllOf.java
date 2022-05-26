
package tencentcloud.im.model;

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
import tencentcloud.im.model.FriendGetResponseAllOfResultItem;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * FriendGetResponseAllOf
 */
@JsonPropertyOrder({
  FriendGetResponseAllOf.JSON_PROPERTY_RESULT_ITEM,
  FriendGetResponseAllOf.JSON_PROPERTY_FAIL_ACCOUNT,
  FriendGetResponseAllOf.JSON_PROPERTY_ERROR_DISPLAY
})
@JsonTypeName("FriendGetResponse_allOf")

public class FriendGetResponseAllOf {
  public static final String JSON_PROPERTY_RESULT_ITEM = "ResultItem";
  private List<FriendGetResponseAllOfResultItem> resultItem = null;

  public static final String JSON_PROPERTY_FAIL_ACCOUNT = "Fail_Account";
  private List<String> failAccount = null;

  public static final String JSON_PROPERTY_ERROR_DISPLAY = "ErrorDisplay";
  private Integer errorDisplay;

  public FriendGetResponseAllOf() { 
  }

  public FriendGetResponseAllOf resultItem(List<FriendGetResponseAllOfResultItem> resultItem) {
    
    this.resultItem = resultItem;
    return this;
  }

  public FriendGetResponseAllOf addResultItemItem(FriendGetResponseAllOfResultItem resultItemItem) {
    if (this.resultItem == null) {
      this.resultItem = new ArrayList<>();
    }
    this.resultItem.add(resultItemItem);
    return this;
  }

   /**
   * Get resultItem
   * @return resultItem
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESULT_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FriendGetResponseAllOfResultItem> getResultItem() {
    return resultItem;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultItem(List<FriendGetResponseAllOfResultItem> resultItem) {
    this.resultItem = resultItem;
  }


  public FriendGetResponseAllOf failAccount(List<String> failAccount) {
    
    this.failAccount = failAccount;
    return this;
  }

  public FriendGetResponseAllOf addFailAccountItem(String failAccountItem) {
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


  public FriendGetResponseAllOf errorDisplay(Integer errorDisplay) {
    
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

  public Integer getErrorDisplay() {
    return errorDisplay;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorDisplay(Integer errorDisplay) {
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
    FriendGetResponseAllOf friendGetResponseAllOf = (FriendGetResponseAllOf) o;
    return Objects.equals(this.resultItem, friendGetResponseAllOf.resultItem) &&
        Objects.equals(this.failAccount, friendGetResponseAllOf.failAccount) &&
        Objects.equals(this.errorDisplay, friendGetResponseAllOf.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultItem, failAccount, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendGetResponseAllOf {\n");
    sb.append("    resultItem: ").append(toIndentedString(resultItem)).append("\n");
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

