
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
import tencentcloud.im.model.CommonResponse;
import tencentcloud.im.model.MultiAccountImportResponseAllOf;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * MultiAccountImportResponse
 */
@JsonPropertyOrder({
  MultiAccountImportResponse.JSON_PROPERTY_ACTION_STATUS,
  MultiAccountImportResponse.JSON_PROPERTY_ERROR_INFO,
  MultiAccountImportResponse.JSON_PROPERTY_ERROR_CODE,
  MultiAccountImportResponse.JSON_PROPERTY_FAIL_ACCOUNTS
})

public class MultiAccountImportResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_FAIL_ACCOUNTS = "FailAccounts";
  private List<String> failAccounts = null;

  public MultiAccountImportResponse() { 
  }

  public MultiAccountImportResponse actionStatus(String actionStatus) {
    
    this.actionStatus = actionStatus;
    return this;
  }

   /**
   * 请求处理的结果，OK 表示处理成功，FAIL 表示失败
   * @return actionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求处理的结果，OK 表示处理成功，FAIL 表示失败")
  @JsonProperty(JSON_PROPERTY_ACTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActionStatus() {
    return actionStatus;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }


  public MultiAccountImportResponse errorInfo(String errorInfo) {
    
    this.errorInfo = errorInfo;
    return this;
  }

   /**
   * 错误信息
   * @return errorInfo
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "错误信息")
  @JsonProperty(JSON_PROPERTY_ERROR_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getErrorInfo() {
    return errorInfo;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
  }


  public MultiAccountImportResponse errorCode(Integer errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 错误码，0表示成功，非0表示失败
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "错误码，0表示成功，非0表示失败")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  public MultiAccountImportResponse failAccounts(List<String> failAccounts) {
    
    this.failAccounts = failAccounts;
    return this;
  }

  public MultiAccountImportResponse addFailAccountsItem(String failAccountsItem) {
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
    MultiAccountImportResponse multiAccountImportResponse = (MultiAccountImportResponse) o;
    return Objects.equals(this.actionStatus, multiAccountImportResponse.actionStatus) &&
        Objects.equals(this.errorInfo, multiAccountImportResponse.errorInfo) &&
        Objects.equals(this.errorCode, multiAccountImportResponse.errorCode) &&
        Objects.equals(this.failAccounts, multiAccountImportResponse.failAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, failAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiAccountImportResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

