
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * MultiAccountImportResponseAllOf
 */
@JsonPropertyOrder({
  MultiAccountImportResponseAllOf.JSON_PROPERTY_FAIL_ACCOUNTS
})
@JsonTypeName("MultiAccountImportResponse_allOf")

public class MultiAccountImportResponseAllOf {
  public static final String JSON_PROPERTY_FAIL_ACCOUNTS = "FailAccounts";
  private List<String> failAccounts = null;

  public MultiAccountImportResponseAllOf() { 
  }

  public MultiAccountImportResponseAllOf failAccounts(List<String> failAccounts) {
    
    this.failAccounts = failAccounts;
    return this;
  }

  public MultiAccountImportResponseAllOf addFailAccountsItem(String failAccountsItem) {
    if (this.failAccounts == null) {
      this.failAccounts = new ArrayList<>();
    }
    this.failAccounts.add(failAccountsItem);
    return this;
  }

   /**
   * 导入失败的帐号列表
   * @return failAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "导入失败的帐号列表")
  @JsonProperty(JSON_PROPERTY_FAIL_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFailAccounts() {
    return failAccounts;
  }


  @JsonProperty(JSON_PROPERTY_FAIL_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailAccounts(List<String> failAccounts) {
    this.failAccounts = failAccounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiAccountImportResponseAllOf multiAccountImportResponseAllOf = (MultiAccountImportResponseAllOf) o;
    return Objects.equals(this.failAccounts, multiAccountImportResponseAllOf.failAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiAccountImportResponseAllOf {\n");
    sb.append("    failAccounts: ").append(toIndentedString(failAccounts)).append("\n");
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

