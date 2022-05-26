
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
import tencentcloud.im.model.AccountCheckResponseAllOfResultItem;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * AccountCheckResponseAllOf
 */
@JsonPropertyOrder({
  AccountCheckResponseAllOf.JSON_PROPERTY_RESULT_ITEM
})
@JsonTypeName("AccountCheckResponse_allOf")

public class AccountCheckResponseAllOf {
  public static final String JSON_PROPERTY_RESULT_ITEM = "ResultItem";
  private List<AccountCheckResponseAllOfResultItem> resultItem = null;

  public AccountCheckResponseAllOf() { 
  }

  public AccountCheckResponseAllOf resultItem(List<AccountCheckResponseAllOfResultItem> resultItem) {
    
    this.resultItem = resultItem;
    return this;
  }

  public AccountCheckResponseAllOf addResultItemItem(AccountCheckResponseAllOfResultItem resultItemItem) {
    if (this.resultItem == null) {
      this.resultItem = new ArrayList<>();
    }
    this.resultItem.add(resultItemItem);
    return this;
  }

   /**
   * 单个帐号的结果对象数组
   * @return resultItem
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "单个帐号的结果对象数组")
  @JsonProperty(JSON_PROPERTY_RESULT_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountCheckResponseAllOfResultItem> getResultItem() {
    return resultItem;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultItem(List<AccountCheckResponseAllOfResultItem> resultItem) {
    this.resultItem = resultItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCheckResponseAllOf accountCheckResponseAllOf = (AccountCheckResponseAllOf) o;
    return Objects.equals(this.resultItem, accountCheckResponseAllOf.resultItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCheckResponseAllOf {\n");
    sb.append("    resultItem: ").append(toIndentedString(resultItem)).append("\n");
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

