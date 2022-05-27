
package com.tencentcloudapi.im.model;

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
 * QueryOnlineStatusRequest
 */
@JsonPropertyOrder({
  QueryOnlineStatusRequest.JSON_PROPERTY_TO_ACCOUNT,
  QueryOnlineStatusRequest.JSON_PROPERTY_IS_NEED_DETAIL
})

public class QueryOnlineStatusRequest {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private List<String> toAccount = new ArrayList<>();

  /**
   * 是否需要返回详细的登录平台信息。0表示不需要，1表示需要
   */
  public enum IsNeedDetailEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    IsNeedDetailEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IsNeedDetailEnum fromValue(Integer value) {
      for (IsNeedDetailEnum b : IsNeedDetailEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IS_NEED_DETAIL = "IsNeedDetail";
  private IsNeedDetailEnum isNeedDetail;

  public QueryOnlineStatusRequest() { 
  }

  public QueryOnlineStatusRequest toAccount(List<String> toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

  public QueryOnlineStatusRequest addToAccountItem(String toAccountItem) {
    this.toAccount.add(toAccountItem);
    return this;
  }

   /**
   * 需要查询这些 UserID 的登录状态，一次最多查询500个 UserID 的状态
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
 @Size(max=500)  @ApiModelProperty(required = true, value = "需要查询这些 UserID 的登录状态，一次最多查询500个 UserID 的状态")
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


  public QueryOnlineStatusRequest isNeedDetail(IsNeedDetailEnum isNeedDetail) {
    
    this.isNeedDetail = isNeedDetail;
    return this;
  }

   /**
   * 是否需要返回详细的登录平台信息。0表示不需要，1表示需要
   * @return isNeedDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否需要返回详细的登录平台信息。0表示不需要，1表示需要")
  @JsonProperty(JSON_PROPERTY_IS_NEED_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IsNeedDetailEnum getIsNeedDetail() {
    return isNeedDetail;
  }


  @JsonProperty(JSON_PROPERTY_IS_NEED_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsNeedDetail(IsNeedDetailEnum isNeedDetail) {
    this.isNeedDetail = isNeedDetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryOnlineStatusRequest queryOnlineStatusRequest = (QueryOnlineStatusRequest) o;
    return Objects.equals(this.toAccount, queryOnlineStatusRequest.toAccount) &&
        Objects.equals(this.isNeedDetail, queryOnlineStatusRequest.isNeedDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, isNeedDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOnlineStatusRequest {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    isNeedDetail: ").append(toIndentedString(isNeedDetail)).append("\n");
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

