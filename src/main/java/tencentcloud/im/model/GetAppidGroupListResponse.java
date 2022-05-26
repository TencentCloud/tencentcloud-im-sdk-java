
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
import tencentcloud.im.model.GetAppidGroupListResponseAllOf;
import tencentcloud.im.model.GetAppidGroupListResponseAllOfGroupIdList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetAppidGroupListResponse
 */
@JsonPropertyOrder({
  GetAppidGroupListResponse.JSON_PROPERTY_ACTION_STATUS,
  GetAppidGroupListResponse.JSON_PROPERTY_ERROR_INFO,
  GetAppidGroupListResponse.JSON_PROPERTY_ERROR_CODE,
  GetAppidGroupListResponse.JSON_PROPERTY_TOTAL_COUNT,
  GetAppidGroupListResponse.JSON_PROPERTY_GROUP_ID_LIST,
  GetAppidGroupListResponse.JSON_PROPERTY_NEXT
})

public class GetAppidGroupListResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "TotalCount";
  private Integer totalCount;

  public static final String JSON_PROPERTY_GROUP_ID_LIST = "GroupIdList";
  private List<GetAppidGroupListResponseAllOfGroupIdList> groupIdList = null;

  public static final String JSON_PROPERTY_NEXT = "Next";
  private Integer next;

  public GetAppidGroupListResponse() { 
  }

  public GetAppidGroupListResponse actionStatus(String actionStatus) {
    
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


  public GetAppidGroupListResponse errorInfo(String errorInfo) {
    
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


  public GetAppidGroupListResponse errorCode(Integer errorCode) {
    
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


  public GetAppidGroupListResponse totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * App 当前的群组总数。如果仅需要返回特定群组形态的群组，可以通过 GroupType 进行过滤，但此时返回的 TotalCount 的含义就变成了 App 中该群组形态的群组总数；例如：假设 App 旗下总共 50000 个群组，其中有 20000 个为公开群组，如果将请求包体中的 GroupType 设置为 Public，那么不论 Limit 和 Offset 怎样设置，应答包体中的 TotalCount 都为 20000，且 GroupIdList 中的群组全部为公开群组
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "App 当前的群组总数。如果仅需要返回特定群组形态的群组，可以通过 GroupType 进行过滤，但此时返回的 TotalCount 的含义就变成了 App 中该群组形态的群组总数；例如：假设 App 旗下总共 50000 个群组，其中有 20000 个为公开群组，如果将请求包体中的 GroupType 设置为 Public，那么不论 Limit 和 Offset 怎样设置，应答包体中的 TotalCount 都为 20000，且 GroupIdList 中的群组全部为公开群组")
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public GetAppidGroupListResponse groupIdList(List<GetAppidGroupListResponseAllOfGroupIdList> groupIdList) {
    
    this.groupIdList = groupIdList;
    return this;
  }

  public GetAppidGroupListResponse addGroupIdListItem(GetAppidGroupListResponseAllOfGroupIdList groupIdListItem) {
    if (this.groupIdList == null) {
      this.groupIdList = new ArrayList<>();
    }
    this.groupIdList.add(groupIdListItem);
    return this;
  }

   /**
   * 获取到的群组 ID 的集合
   * @return groupIdList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "获取到的群组 ID 的集合")
  @JsonProperty(JSON_PROPERTY_GROUP_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetAppidGroupListResponseAllOfGroupIdList> getGroupIdList() {
    return groupIdList;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupIdList(List<GetAppidGroupListResponseAllOfGroupIdList> groupIdList) {
    this.groupIdList = groupIdList;
  }


  public GetAppidGroupListResponse next(Integer next) {
    
    this.next = next;
    return this;
  }

   /**
   * 分页拉取的标志
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分页拉取的标志")
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNext() {
    return next;
  }


  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNext(Integer next) {
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
    GetAppidGroupListResponse getAppidGroupListResponse = (GetAppidGroupListResponse) o;
    return Objects.equals(this.actionStatus, getAppidGroupListResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getAppidGroupListResponse.errorInfo) &&
        Objects.equals(this.errorCode, getAppidGroupListResponse.errorCode) &&
        Objects.equals(this.totalCount, getAppidGroupListResponse.totalCount) &&
        Objects.equals(this.groupIdList, getAppidGroupListResponse.groupIdList) &&
        Objects.equals(this.next, getAppidGroupListResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, totalCount, groupIdList, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAppidGroupListResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    groupIdList: ").append(toIndentedString(groupIdList)).append("\n");
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

