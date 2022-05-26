
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
import tencentcloud.im.model.GetGroupInfoResponseAllOf;
import tencentcloud.im.model.GetGroupInfoResponseAllOfGroupInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetGroupInfoResponse
 */
@JsonPropertyOrder({
  GetGroupInfoResponse.JSON_PROPERTY_ACTION_STATUS,
  GetGroupInfoResponse.JSON_PROPERTY_ERROR_INFO,
  GetGroupInfoResponse.JSON_PROPERTY_ERROR_CODE,
  GetGroupInfoResponse.JSON_PROPERTY_GROUP_INFO
})

public class GetGroupInfoResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_GROUP_INFO = "GroupInfo";
  private List<GetGroupInfoResponseAllOfGroupInfo> groupInfo = null;

  public GetGroupInfoResponse() { 
  }

  public GetGroupInfoResponse actionStatus(String actionStatus) {
    
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


  public GetGroupInfoResponse errorInfo(String errorInfo) {
    
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


  public GetGroupInfoResponse errorCode(Integer errorCode) {
    
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


  public GetGroupInfoResponse groupInfo(List<GetGroupInfoResponseAllOfGroupInfo> groupInfo) {
    
    this.groupInfo = groupInfo;
    return this;
  }

  public GetGroupInfoResponse addGroupInfoItem(GetGroupInfoResponseAllOfGroupInfo groupInfoItem) {
    if (this.groupInfo == null) {
      this.groupInfo = new ArrayList<>();
    }
    this.groupInfo.add(groupInfoItem);
    return this;
  }

   /**
   * 返回结果为群组信息数组，内容包括群基础资料字段、群成员资料字段、群组维度自定义字段和群成员维度自定义字段，字段详情请参阅 群组数据结构介绍（https://cloud.tencent.com/document/product/269/1502#.E7.BE.A4.E7.BB.84.E6.95.B0.E6.8D.AE.E7.BB.93.E6.9E.84.E4.BB.8B.E7.BB.8D）
   * @return groupInfo
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "返回结果为群组信息数组，内容包括群基础资料字段、群成员资料字段、群组维度自定义字段和群成员维度自定义字段，字段详情请参阅 群组数据结构介绍（https://cloud.tencent.com/document/product/269/1502#.E7.BE.A4.E7.BB.84.E6.95.B0.E6.8D.AE.E7.BB.93.E6.9E.84.E4.BB.8B.E7.BB.8D）")
  @JsonProperty(JSON_PROPERTY_GROUP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetGroupInfoResponseAllOfGroupInfo> getGroupInfo() {
    return groupInfo;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupInfo(List<GetGroupInfoResponseAllOfGroupInfo> groupInfo) {
    this.groupInfo = groupInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupInfoResponse getGroupInfoResponse = (GetGroupInfoResponse) o;
    return Objects.equals(this.actionStatus, getGroupInfoResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getGroupInfoResponse.errorInfo) &&
        Objects.equals(this.errorCode, getGroupInfoResponse.errorCode) &&
        Objects.equals(this.groupInfo, getGroupInfoResponse.groupInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, groupInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupInfoResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    groupInfo: ").append(toIndentedString(groupInfo)).append("\n");
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

