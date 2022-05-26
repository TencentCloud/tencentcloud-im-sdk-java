
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GroupAddResponseAllOfResultItem
 */
@JsonPropertyOrder({
  GroupAddResponseAllOfResultItem.JSON_PROPERTY_TO_ACCOUNT,
  GroupAddResponseAllOfResultItem.JSON_PROPERTY_RESULT_CODE,
  GroupAddResponseAllOfResultItem.JSON_PROPERTY_RESULT_INFO
})
@JsonTypeName("GroupAddResponse_allOf_ResultItem")

public class GroupAddResponseAllOfResultItem {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_RESULT_CODE = "ResultCode";
  private Integer resultCode;

  public static final String JSON_PROPERTY_RESULT_INFO = "ResultInfo";
  private String resultInfo;

  public GroupAddResponseAllOfResultItem() { 
  }

  public GroupAddResponseAllOfResultItem toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 请求加入新分组的好友的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求加入新分组的好友的 UserID")
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


  public GroupAddResponseAllOfResultItem resultCode(Integer resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * To_Account 的处理结果，0表示成功，非0表示失败，非0取值的详细描述请参见 错误码说明（https://cloud.tencent.com/document/product/269/10107#ErrorCode）
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To_Account 的处理结果，0表示成功，非0表示失败，非0取值的详细描述请参见 错误码说明（https://cloud.tencent.com/document/product/269/10107#ErrorCode）")
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


  public GroupAddResponseAllOfResultItem resultInfo(String resultInfo) {
    
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
    GroupAddResponseAllOfResultItem groupAddResponseAllOfResultItem = (GroupAddResponseAllOfResultItem) o;
    return Objects.equals(this.toAccount, groupAddResponseAllOfResultItem.toAccount) &&
        Objects.equals(this.resultCode, groupAddResponseAllOfResultItem.resultCode) &&
        Objects.equals(this.resultInfo, groupAddResponseAllOfResultItem.resultInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, resultCode, resultInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupAddResponseAllOfResultItem {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
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

