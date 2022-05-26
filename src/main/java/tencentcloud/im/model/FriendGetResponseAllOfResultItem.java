
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
 * FriendGetResponseAllOfResultItem
 */
@JsonPropertyOrder({
  FriendGetResponseAllOfResultItem.JSON_PROPERTY_RESULT_CODE,
  FriendGetResponseAllOfResultItem.JSON_PROPERTY_RESULT_INFO,
  FriendGetResponseAllOfResultItem.JSON_PROPERTY_TO_ACCOUNT
})
@JsonTypeName("FriendGetResponse_allOf_ResultItem")

public class FriendGetResponseAllOfResultItem {
  public static final String JSON_PROPERTY_RESULT_CODE = "ResultCode";
  private Integer resultCode;

  public static final String JSON_PROPERTY_RESULT_INFO = "ResultInfo";
  private String resultInfo;

  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public FriendGetResponseAllOfResultItem() { 
  }

  public FriendGetResponseAllOfResultItem resultCode(Integer resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * Get resultCode
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public FriendGetResponseAllOfResultItem resultInfo(String resultInfo) {
    
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


  public FriendGetResponseAllOfResultItem toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 请求添加为黑名单的用户 UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求添加为黑名单的用户 UserID")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendGetResponseAllOfResultItem friendGetResponseAllOfResultItem = (FriendGetResponseAllOfResultItem) o;
    return Objects.equals(this.resultCode, friendGetResponseAllOfResultItem.resultCode) &&
        Objects.equals(this.resultInfo, friendGetResponseAllOfResultItem.resultInfo) &&
        Objects.equals(this.toAccount, friendGetResponseAllOfResultItem.toAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultCode, resultInfo, toAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendGetResponseAllOfResultItem {\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
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

