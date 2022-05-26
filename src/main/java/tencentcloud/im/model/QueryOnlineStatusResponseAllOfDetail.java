
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
 * 详细的登录平台信息
 */
@ApiModel(description = "详细的登录平台信息")
@JsonPropertyOrder({
  QueryOnlineStatusResponseAllOfDetail.JSON_PROPERTY_PLATFORM,
  QueryOnlineStatusResponseAllOfDetail.JSON_PROPERTY_STATUS
})
@JsonTypeName("QueryOnlineStatusResponse_allOf_Detail")

public class QueryOnlineStatusResponseAllOfDetail {
  public static final String JSON_PROPERTY_PLATFORM = "Platform";
  private String platform;

  public static final String JSON_PROPERTY_STATUS = "Status";
  private String status;

  public QueryOnlineStatusResponseAllOfDetail() { 
  }

  public QueryOnlineStatusResponseAllOfDetail platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * 登录的平台类型。可能的返回值有：\&quot;iPhone\&quot;, \&quot;Android\&quot;, \&quot;Web\&quot;, \&quot;PC\&quot;, \&quot;iPad\&quot;, \&quot;Mac\&quot;。
   * @return platform
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "登录的平台类型。可能的返回值有：\"iPhone\", \"Android\", \"Web\", \"PC\", \"iPad\", \"Mac\"。")
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public QueryOnlineStatusResponseAllOfDetail status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 该登录平台的状态
   * @return status
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "该登录平台的状态")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryOnlineStatusResponseAllOfDetail queryOnlineStatusResponseAllOfDetail = (QueryOnlineStatusResponseAllOfDetail) o;
    return Objects.equals(this.platform, queryOnlineStatusResponseAllOfDetail.platform) &&
        Objects.equals(this.status, queryOnlineStatusResponseAllOfDetail.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOnlineStatusResponseAllOfDetail {\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

