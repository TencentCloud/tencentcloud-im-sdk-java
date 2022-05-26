
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
import tencentcloud.im.model.GetGroupMemberInfoResponseAllOf;
import tencentcloud.im.model.GetGroupMemberInfoResponseAllOfAppMemberDefinedData;
import tencentcloud.im.model.GetGroupMemberInfoResponseAllOfMemberList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetGroupMemberInfoResponse
 */
@JsonPropertyOrder({
  GetGroupMemberInfoResponse.JSON_PROPERTY_ACTION_STATUS,
  GetGroupMemberInfoResponse.JSON_PROPERTY_ERROR_INFO,
  GetGroupMemberInfoResponse.JSON_PROPERTY_ERROR_CODE,
  GetGroupMemberInfoResponse.JSON_PROPERTY_MEMBER_NUM,
  GetGroupMemberInfoResponse.JSON_PROPERTY_MEMBER_LIST,
  GetGroupMemberInfoResponse.JSON_PROPERTY_APP_MEMBER_DEFINED_DATA,
  GetGroupMemberInfoResponse.JSON_PROPERTY_NEXT
})

public class GetGroupMemberInfoResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_MEMBER_NUM = "MemberNum";
  private Integer memberNum;

  public static final String JSON_PROPERTY_MEMBER_LIST = "MemberList";
  private List<GetGroupMemberInfoResponseAllOfMemberList> memberList = null;

  public static final String JSON_PROPERTY_APP_MEMBER_DEFINED_DATA = "AppMemberDefinedData";
  private List<GetGroupMemberInfoResponseAllOfAppMemberDefinedData> appMemberDefinedData = null;

  public static final String JSON_PROPERTY_NEXT = "Next";
  private String next;

  public GetGroupMemberInfoResponse() { 
  }

  public GetGroupMemberInfoResponse actionStatus(String actionStatus) {
    
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


  public GetGroupMemberInfoResponse errorInfo(String errorInfo) {
    
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


  public GetGroupMemberInfoResponse errorCode(Integer errorCode) {
    
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


  public GetGroupMemberInfoResponse memberNum(Integer memberNum) {
    
    this.memberNum = memberNum;
    return this;
  }

   /**
   * 本群组的群成员总数
   * @return memberNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "本群组的群成员总数")
  @JsonProperty(JSON_PROPERTY_MEMBER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMemberNum() {
    return memberNum;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberNum(Integer memberNum) {
    this.memberNum = memberNum;
  }


  public GetGroupMemberInfoResponse memberList(List<GetGroupMemberInfoResponseAllOfMemberList> memberList) {
    
    this.memberList = memberList;
    return this;
  }

  public GetGroupMemberInfoResponse addMemberListItem(GetGroupMemberInfoResponseAllOfMemberList memberListItem) {
    if (this.memberList == null) {
      this.memberList = new ArrayList<>();
    }
    this.memberList.add(memberListItem);
    return this;
  }

   /**
   * 获取到的群成员列表，其中包含了全部或者指定的群成员信息，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）
   * @return memberList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "获取到的群成员列表，其中包含了全部或者指定的群成员信息，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）")
  @JsonProperty(JSON_PROPERTY_MEMBER_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetGroupMemberInfoResponseAllOfMemberList> getMemberList() {
    return memberList;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberList(List<GetGroupMemberInfoResponseAllOfMemberList> memberList) {
    this.memberList = memberList;
  }


  public GetGroupMemberInfoResponse appMemberDefinedData(List<GetGroupMemberInfoResponseAllOfAppMemberDefinedData> appMemberDefinedData) {
    
    this.appMemberDefinedData = appMemberDefinedData;
    return this;
  }

  public GetGroupMemberInfoResponse addAppMemberDefinedDataItem(GetGroupMemberInfoResponseAllOfAppMemberDefinedData appMemberDefinedDataItem) {
    if (this.appMemberDefinedData == null) {
      this.appMemberDefinedData = new ArrayList<>();
    }
    this.appMemberDefinedData.add(appMemberDefinedDataItem);
    return this;
  }

   /**
   * 返回的群成员自定义字段信息
   * @return appMemberDefinedData
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "返回的群成员自定义字段信息")
  @JsonProperty(JSON_PROPERTY_APP_MEMBER_DEFINED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetGroupMemberInfoResponseAllOfAppMemberDefinedData> getAppMemberDefinedData() {
    return appMemberDefinedData;
  }


  @JsonProperty(JSON_PROPERTY_APP_MEMBER_DEFINED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppMemberDefinedData(List<GetGroupMemberInfoResponseAllOfAppMemberDefinedData> appMemberDefinedData) {
    this.appMemberDefinedData = appMemberDefinedData;
  }


  public GetGroupMemberInfoResponse next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * 下一次请求应该传的 Next 值，仅查询 Community（社群）时会返回该字段
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "下一次请求应该传的 Next 值，仅查询 Community（社群）时会返回该字段")
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNext() {
    return next;
  }


  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNext(String next) {
    this.next = next;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupMemberInfoResponse getGroupMemberInfoResponse = (GetGroupMemberInfoResponse) o;
    return Objects.equals(this.actionStatus, getGroupMemberInfoResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getGroupMemberInfoResponse.errorInfo) &&
        Objects.equals(this.errorCode, getGroupMemberInfoResponse.errorCode) &&
        Objects.equals(this.memberNum, getGroupMemberInfoResponse.memberNum) &&
        Objects.equals(this.memberList, getGroupMemberInfoResponse.memberList) &&
        Objects.equals(this.appMemberDefinedData, getGroupMemberInfoResponse.appMemberDefinedData) &&
        Objects.equals(this.next, getGroupMemberInfoResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, memberNum, memberList, appMemberDefinedData, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupMemberInfoResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    memberNum: ").append(toIndentedString(memberNum)).append("\n");
    sb.append("    memberList: ").append(toIndentedString(memberList)).append("\n");
    sb.append("    appMemberDefinedData: ").append(toIndentedString(appMemberDefinedData)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

