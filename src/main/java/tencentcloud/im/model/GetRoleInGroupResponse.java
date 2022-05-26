
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
import tencentcloud.im.model.GetRoleInGroupResponseAllOf;
import tencentcloud.im.model.GetRoleInGroupResponseAllOfUserIdList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetRoleInGroupResponse
 */
@JsonPropertyOrder({
  GetRoleInGroupResponse.JSON_PROPERTY_ACTION_STATUS,
  GetRoleInGroupResponse.JSON_PROPERTY_ERROR_INFO,
  GetRoleInGroupResponse.JSON_PROPERTY_ERROR_CODE,
  GetRoleInGroupResponse.JSON_PROPERTY_USER_ID_LIST
})

public class GetRoleInGroupResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_USER_ID_LIST = "UserIdList";
  private List<GetRoleInGroupResponseAllOfUserIdList> userIdList = null;

  public GetRoleInGroupResponse() { 
  }

  public GetRoleInGroupResponse actionStatus(String actionStatus) {
    
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


  public GetRoleInGroupResponse errorInfo(String errorInfo) {
    
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


  public GetRoleInGroupResponse errorCode(Integer errorCode) {
    
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


  public GetRoleInGroupResponse userIdList(List<GetRoleInGroupResponseAllOfUserIdList> userIdList) {
    
    this.userIdList = userIdList;
    return this;
  }

  public GetRoleInGroupResponse addUserIdListItem(GetRoleInGroupResponseAllOfUserIdList userIdListItem) {
    if (this.userIdList == null) {
      this.userIdList = new ArrayList<>();
    }
    this.userIdList.add(userIdListItem);
    return this;
  }

   /**
   * 拉取到的成员角色，包括：Owner(群主)，Admin(群管理员)，Member(普通群成员），NotMember(非群成员)
   * @return userIdList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "拉取到的成员角色，包括：Owner(群主)，Admin(群管理员)，Member(普通群成员），NotMember(非群成员)")
  @JsonProperty(JSON_PROPERTY_USER_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetRoleInGroupResponseAllOfUserIdList> getUserIdList() {
    return userIdList;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserIdList(List<GetRoleInGroupResponseAllOfUserIdList> userIdList) {
    this.userIdList = userIdList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRoleInGroupResponse getRoleInGroupResponse = (GetRoleInGroupResponse) o;
    return Objects.equals(this.actionStatus, getRoleInGroupResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getRoleInGroupResponse.errorInfo) &&
        Objects.equals(this.errorCode, getRoleInGroupResponse.errorCode) &&
        Objects.equals(this.userIdList, getRoleInGroupResponse.userIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, userIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoleInGroupResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    userIdList: ").append(toIndentedString(userIdList)).append("\n");
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

