
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
import tencentcloud.im.model.ImGetAttrResponseAllOf;
import tencentcloud.im.model.ImGetAttrResponseAllOfUserAttrs;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ImGetAttrResponse
 */
@JsonPropertyOrder({
  ImGetAttrResponse.JSON_PROPERTY_ACTION_STATUS,
  ImGetAttrResponse.JSON_PROPERTY_ERROR_INFO,
  ImGetAttrResponse.JSON_PROPERTY_ERROR_CODE,
  ImGetAttrResponse.JSON_PROPERTY_USER_ATTRS
})

public class ImGetAttrResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_USER_ATTRS = "UserAttrs";
  private List<ImGetAttrResponseAllOfUserAttrs> userAttrs = null;

  public ImGetAttrResponse() { 
  }

  public ImGetAttrResponse actionStatus(String actionStatus) {
    
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


  public ImGetAttrResponse errorInfo(String errorInfo) {
    
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


  public ImGetAttrResponse errorCode(Integer errorCode) {
    
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


  public ImGetAttrResponse userAttrs(List<ImGetAttrResponseAllOfUserAttrs> userAttrs) {
    
    this.userAttrs = userAttrs;
    return this;
  }

  public ImGetAttrResponse addUserAttrsItem(ImGetAttrResponseAllOfUserAttrs userAttrsItem) {
    if (this.userAttrs == null) {
      this.userAttrs = new ArrayList<>();
    }
    this.userAttrs.add(userAttrsItem);
    return this;
  }

   /**
   * Get userAttrs
   * @return userAttrs
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ATTRS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ImGetAttrResponseAllOfUserAttrs> getUserAttrs() {
    return userAttrs;
  }


  @JsonProperty(JSON_PROPERTY_USER_ATTRS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserAttrs(List<ImGetAttrResponseAllOfUserAttrs> userAttrs) {
    this.userAttrs = userAttrs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImGetAttrResponse imGetAttrResponse = (ImGetAttrResponse) o;
    return Objects.equals(this.actionStatus, imGetAttrResponse.actionStatus) &&
        Objects.equals(this.errorInfo, imGetAttrResponse.errorInfo) &&
        Objects.equals(this.errorCode, imGetAttrResponse.errorCode) &&
        Objects.equals(this.userAttrs, imGetAttrResponse.userAttrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, userAttrs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImGetAttrResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    userAttrs: ").append(toIndentedString(userAttrs)).append("\n");
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

