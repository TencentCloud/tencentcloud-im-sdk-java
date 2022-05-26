
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
import tencentcloud.im.model.CommonResponse;
import tencentcloud.im.model.ImGetAttrNameResponseAllOf;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ImGetAttrNameResponse
 */
@JsonPropertyOrder({
  ImGetAttrNameResponse.JSON_PROPERTY_ACTION_STATUS,
  ImGetAttrNameResponse.JSON_PROPERTY_ERROR_INFO,
  ImGetAttrNameResponse.JSON_PROPERTY_ERROR_CODE,
  ImGetAttrNameResponse.JSON_PROPERTY_ATTR_NAMES
})

public class ImGetAttrNameResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_ATTR_NAMES = "AttrNames";
  private Object attrNames;

  public ImGetAttrNameResponse() { 
  }

  public ImGetAttrNameResponse actionStatus(String actionStatus) {
    
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


  public ImGetAttrNameResponse errorInfo(String errorInfo) {
    
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


  public ImGetAttrNameResponse errorCode(Integer errorCode) {
    
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


  public ImGetAttrNameResponse attrNames(Object attrNames) {
    
    this.attrNames = attrNames;
    return this;
  }

   /**
   * 包含多个键对。每对键值对，表示第几个属性对应的名称。例如\&quot;0\&quot;:\&quot;xxx\&quot;表示第0号属性的名称是 xxx
   * @return attrNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "包含多个键对。每对键值对，表示第几个属性对应的名称。例如\"0\":\"xxx\"表示第0号属性的名称是 xxx")
  @JsonProperty(JSON_PROPERTY_ATTR_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAttrNames() {
    return attrNames;
  }


  @JsonProperty(JSON_PROPERTY_ATTR_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttrNames(Object attrNames) {
    this.attrNames = attrNames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImGetAttrNameResponse imGetAttrNameResponse = (ImGetAttrNameResponse) o;
    return Objects.equals(this.actionStatus, imGetAttrNameResponse.actionStatus) &&
        Objects.equals(this.errorInfo, imGetAttrNameResponse.errorInfo) &&
        Objects.equals(this.errorCode, imGetAttrNameResponse.errorCode) &&
        Objects.equals(this.attrNames, imGetAttrNameResponse.attrNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, attrNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImGetAttrNameResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    attrNames: ").append(toIndentedString(attrNames)).append("\n");
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

