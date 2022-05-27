
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.GetGroupAttrResponseAllOf;
import com.tencentcloudapi.im.model.GetGroupAttrResponseAllOfGroupAttrAry;
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
 * GetGroupAttrResponse
 */
@JsonPropertyOrder({
  GetGroupAttrResponse.JSON_PROPERTY_ACTION_STATUS,
  GetGroupAttrResponse.JSON_PROPERTY_ERROR_INFO,
  GetGroupAttrResponse.JSON_PROPERTY_ERROR_CODE,
  GetGroupAttrResponse.JSON_PROPERTY_GROUP_ATTR_ARY
})

public class GetGroupAttrResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_GROUP_ATTR_ARY = "GroupAttrAry";
  private List<GetGroupAttrResponseAllOfGroupAttrAry> groupAttrAry = null;

  public GetGroupAttrResponse() { 
  }

  public GetGroupAttrResponse actionStatus(String actionStatus) {
    
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


  public GetGroupAttrResponse errorInfo(String errorInfo) {
    
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


  public GetGroupAttrResponse errorCode(Integer errorCode) {
    
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


  public GetGroupAttrResponse groupAttrAry(List<GetGroupAttrResponseAllOfGroupAttrAry> groupAttrAry) {
    
    this.groupAttrAry = groupAttrAry;
    return this;
  }

  public GetGroupAttrResponse addGroupAttrAryItem(GetGroupAttrResponseAllOfGroupAttrAry groupAttrAryItem) {
    if (this.groupAttrAry == null) {
      this.groupAttrAry = new ArrayList<>();
    }
    this.groupAttrAry.add(groupAttrAryItem);
    return this;
  }

   /**
   * 自定义属性的键值对
   * @return groupAttrAry
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "自定义属性的键值对")
  @JsonProperty(JSON_PROPERTY_GROUP_ATTR_ARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetGroupAttrResponseAllOfGroupAttrAry> getGroupAttrAry() {
    return groupAttrAry;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ATTR_ARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupAttrAry(List<GetGroupAttrResponseAllOfGroupAttrAry> groupAttrAry) {
    this.groupAttrAry = groupAttrAry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupAttrResponse getGroupAttrResponse = (GetGroupAttrResponse) o;
    return Objects.equals(this.actionStatus, getGroupAttrResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getGroupAttrResponse.errorInfo) &&
        Objects.equals(this.errorCode, getGroupAttrResponse.errorCode) &&
        Objects.equals(this.groupAttrAry, getGroupAttrResponse.groupAttrAry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, groupAttrAry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupAttrResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    groupAttrAry: ").append(toIndentedString(groupAttrAry)).append("\n");
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

