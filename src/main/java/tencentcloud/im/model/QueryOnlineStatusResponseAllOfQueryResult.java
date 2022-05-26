
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
import tencentcloud.im.model.QueryOnlineStatusResponseAllOfDetail;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * QueryOnlineStatusResponseAllOfQueryResult
 */
@JsonPropertyOrder({
  QueryOnlineStatusResponseAllOfQueryResult.JSON_PROPERTY_TO_ACCOUNT,
  QueryOnlineStatusResponseAllOfQueryResult.JSON_PROPERTY_STATUS,
  QueryOnlineStatusResponseAllOfQueryResult.JSON_PROPERTY_DETAIL
})
@JsonTypeName("QueryOnlineStatusResponse_allOf_QueryResult")

public class QueryOnlineStatusResponseAllOfQueryResult {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_STATUS = "Status";
  private String status;

  public static final String JSON_PROPERTY_DETAIL = "Detail";
  private QueryOnlineStatusResponseAllOfDetail detail;

  public QueryOnlineStatusResponseAllOfQueryResult() { 
  }

  public QueryOnlineStatusResponseAllOfQueryResult toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 返回的用户的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "返回的用户的 UserID")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public QueryOnlineStatusResponseAllOfQueryResult status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 返回的用户状态，目前支持的状态有： 前台运行状态（Online）：客户端登录后和即时通信 IM 后台有长连接 后台运行状态（PushOnline）：iOS 和 Android 进程被 kill 或因网络问题掉线，进入 PushOnline 状态，此时仍然可以接收消息的离线推送。客户端切到后台，但是进程未被手机操作系统 kill 掉时，此时状态仍是 Online 未登录状态（Offline）：客户端主动退出登录或者客户端自上一次登录起7天之内未登录过 如果用户是多终端登录，则只要有一个终端的状态是 Online ，该字段值就是 Online
   * @return status
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "返回的用户状态，目前支持的状态有： 前台运行状态（Online）：客户端登录后和即时通信 IM 后台有长连接 后台运行状态（PushOnline）：iOS 和 Android 进程被 kill 或因网络问题掉线，进入 PushOnline 状态，此时仍然可以接收消息的离线推送。客户端切到后台，但是进程未被手机操作系统 kill 掉时，此时状态仍是 Online 未登录状态（Offline）：客户端主动退出登录或者客户端自上一次登录起7天之内未登录过 如果用户是多终端登录，则只要有一个终端的状态是 Online ，该字段值就是 Online")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public QueryOnlineStatusResponseAllOfQueryResult detail(QueryOnlineStatusResponseAllOfDetail detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QueryOnlineStatusResponseAllOfDetail getDetail() {
    return detail;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetail(QueryOnlineStatusResponseAllOfDetail detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryOnlineStatusResponseAllOfQueryResult queryOnlineStatusResponseAllOfQueryResult = (QueryOnlineStatusResponseAllOfQueryResult) o;
    return Objects.equals(this.toAccount, queryOnlineStatusResponseAllOfQueryResult.toAccount) &&
        Objects.equals(this.status, queryOnlineStatusResponseAllOfQueryResult.status) &&
        Objects.equals(this.detail, queryOnlineStatusResponseAllOfQueryResult.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, status, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOnlineStatusResponseAllOfQueryResult {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

