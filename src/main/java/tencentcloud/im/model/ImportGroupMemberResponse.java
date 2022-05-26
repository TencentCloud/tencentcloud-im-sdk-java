
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
import tencentcloud.im.model.ImportGroupMemberResponseAllOf;
import tencentcloud.im.model.ImportGroupMemberResponseAllOfMemberList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ImportGroupMemberResponse
 */
@JsonPropertyOrder({
  ImportGroupMemberResponse.JSON_PROPERTY_ACTION_STATUS,
  ImportGroupMemberResponse.JSON_PROPERTY_ERROR_INFO,
  ImportGroupMemberResponse.JSON_PROPERTY_ERROR_CODE,
  ImportGroupMemberResponse.JSON_PROPERTY_MEMBER_LIST
})

public class ImportGroupMemberResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_MEMBER_LIST = "MemberList";
  private List<ImportGroupMemberResponseAllOfMemberList> memberList = null;

  public ImportGroupMemberResponse() { 
  }

  public ImportGroupMemberResponse actionStatus(String actionStatus) {
    
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


  public ImportGroupMemberResponse errorInfo(String errorInfo) {
    
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


  public ImportGroupMemberResponse errorCode(Integer errorCode) {
    
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


  public ImportGroupMemberResponse memberList(List<ImportGroupMemberResponseAllOfMemberList> memberList) {
    
    this.memberList = memberList;
    return this;
  }

  public ImportGroupMemberResponse addMemberListItem(ImportGroupMemberResponseAllOfMemberList memberListItem) {
    if (this.memberList == null) {
      this.memberList = new ArrayList<>();
    }
    this.memberList.add(memberListItem);
    return this;
  }

   /**
   * 返回添加的群成员结果
   * @return memberList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "返回添加的群成员结果")
  @JsonProperty(JSON_PROPERTY_MEMBER_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ImportGroupMemberResponseAllOfMemberList> getMemberList() {
    return memberList;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberList(List<ImportGroupMemberResponseAllOfMemberList> memberList) {
    this.memberList = memberList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupMemberResponse importGroupMemberResponse = (ImportGroupMemberResponse) o;
    return Objects.equals(this.actionStatus, importGroupMemberResponse.actionStatus) &&
        Objects.equals(this.errorInfo, importGroupMemberResponse.errorInfo) &&
        Objects.equals(this.errorCode, importGroupMemberResponse.errorCode) &&
        Objects.equals(this.memberList, importGroupMemberResponse.memberList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, memberList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMemberResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    memberList: ").append(toIndentedString(memberList)).append("\n");
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

