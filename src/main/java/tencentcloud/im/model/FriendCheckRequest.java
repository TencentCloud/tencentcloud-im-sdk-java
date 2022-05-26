
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
 * FriendCheckRequest
 */
@JsonPropertyOrder({
  FriendCheckRequest.JSON_PROPERTY_FROM_ACCOUNT,
  FriendCheckRequest.JSON_PROPERTY_TO_ACCOUNT,
  FriendCheckRequest.JSON_PROPERTY_CHECK_TYPE
})

public class FriendCheckRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private List<String> toAccount = new ArrayList<>();

  public static final String JSON_PROPERTY_CHECK_TYPE = "CheckType";
  private String checkType;

  public FriendCheckRequest() { 
  }

  public FriendCheckRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 需要校验该 UserID 的好友
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要校验该 UserID 的好友")
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


  public FriendCheckRequest toAccount(List<String> toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

  public FriendCheckRequest addToAccountItem(String toAccountItem) {
    this.toAccount.add(toAccountItem);
    return this;
  }

   /**
   * 请求校验的好友的 UserID 列表，单次请求的 To_Account 数不得超过1000
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
 @Size(max=1000)  @ApiModelProperty(required = true, value = "请求校验的好友的 UserID 列表，单次请求的 To_Account 数不得超过1000")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToAccount(List<String> toAccount) {
    this.toAccount = toAccount;
  }


  public FriendCheckRequest checkType(String checkType) {
    
    this.checkType = checkType;
    return this;
  }

   /**
   * 校验模式，详情可参见 校验好友（https://cloud.tencent.com/document/product/269/1501#.E6.A0.A1.E9.AA.8C.E5.A5.BD.E5.8F.8B）
   * @return checkType
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "校验模式，详情可参见 校验好友（https://cloud.tencent.com/document/product/269/1501#.E6.A0.A1.E9.AA.8C.E5.A5.BD.E5.8F.8B）")
  @JsonProperty(JSON_PROPERTY_CHECK_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCheckType() {
    return checkType;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCheckType(String checkType) {
    this.checkType = checkType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendCheckRequest friendCheckRequest = (FriendCheckRequest) o;
    return Objects.equals(this.fromAccount, friendCheckRequest.fromAccount) &&
        Objects.equals(this.toAccount, friendCheckRequest.toAccount) &&
        Objects.equals(this.checkType, friendCheckRequest.checkType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, toAccount, checkType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendCheckRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
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

