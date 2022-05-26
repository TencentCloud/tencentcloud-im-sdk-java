
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
 * MultiAccountImportRequest
 */
@JsonPropertyOrder({
  MultiAccountImportRequest.JSON_PROPERTY_ACCOUNTS
})

public class MultiAccountImportRequest {
  public static final String JSON_PROPERTY_ACCOUNTS = "Accounts";
  private List<String> accounts = new ArrayList<>();

  public MultiAccountImportRequest() { 
  }

  public MultiAccountImportRequest accounts(List<String> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public MultiAccountImportRequest addAccountsItem(String accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * 用户名，单个用户名长度不超过32字节，单次最多导入100个用户名
   * @return accounts
  **/
  @javax.annotation.Nonnull
  @NotNull
 @Size(max=100)  @ApiModelProperty(required = true, value = "用户名，单个用户名长度不超过32字节，单次最多导入100个用户名")
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAccounts() {
    return accounts;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccounts(List<String> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiAccountImportRequest multiAccountImportRequest = (MultiAccountImportRequest) o;
    return Objects.equals(this.accounts, multiAccountImportRequest.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiAccountImportRequest {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

