
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
import tencentcloud.im.model.GetJoinedGroupListResponseAllOf;
import tencentcloud.im.model.GetJoinedGroupListResponseAllOfGroupIdList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetJoinedGroupListResponse
 */
@JsonPropertyOrder({
  GetJoinedGroupListResponse.JSON_PROPERTY_ACTION_STATUS,
  GetJoinedGroupListResponse.JSON_PROPERTY_ERROR_INFO,
  GetJoinedGroupListResponse.JSON_PROPERTY_ERROR_CODE,
  GetJoinedGroupListResponse.JSON_PROPERTY_TOTAL_COUNT,
  GetJoinedGroupListResponse.JSON_PROPERTY_GROUP_ID_LIST
})

public class GetJoinedGroupListResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "TotalCount";
  private Integer totalCount;

  public static final String JSON_PROPERTY_GROUP_ID_LIST = "GroupIdList";
  private List<GetJoinedGroupListResponseAllOfGroupIdList> groupIdList = null;

  public GetJoinedGroupListResponse() { 
  }

  public GetJoinedGroupListResponse actionStatus(String actionStatus) {
    
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


  public GetJoinedGroupListResponse errorInfo(String errorInfo) {
    
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


  public GetJoinedGroupListResponse errorCode(Integer errorCode) {
    
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


  public GetJoinedGroupListResponse totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 用户所加入的群组个数
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户所加入的群组个数")
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


  public GetJoinedGroupListResponse groupIdList(List<GetJoinedGroupListResponseAllOfGroupIdList> groupIdList) {
    
    this.groupIdList = groupIdList;
    return this;
  }

  public GetJoinedGroupListResponse addGroupIdListItem(GetJoinedGroupListResponseAllOfGroupIdList groupIdListItem) {
    if (this.groupIdList == null) {
      this.groupIdList = new ArrayList<>();
    }
    this.groupIdList.add(groupIdListItem);
    return this;
  }

   /**
   * 拉取到的群组信息，返回的结果是根据过滤器中设置的过滤字段进行过滤后的信息，字段详情请参阅 群组数据结构介绍（https://cloud.tencent.com/document/product/269/1502#.E7.BE.A4.E7.BB.84.E6.95.B0.E6.8D.AE.E7.BB.93.E6.9E.84.E4.BB.8B.E7.BB.8D）
   * @return groupIdList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "拉取到的群组信息，返回的结果是根据过滤器中设置的过滤字段进行过滤后的信息，字段详情请参阅 群组数据结构介绍（https://cloud.tencent.com/document/product/269/1502#.E7.BE.A4.E7.BB.84.E6.95.B0.E6.8D.AE.E7.BB.93.E6.9E.84.E4.BB.8B.E7.BB.8D）")
  @JsonProperty(JSON_PROPERTY_GROUP_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetJoinedGroupListResponseAllOfGroupIdList> getGroupIdList() {
    return groupIdList;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupIdList(List<GetJoinedGroupListResponseAllOfGroupIdList> groupIdList) {
    this.groupIdList = groupIdList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetJoinedGroupListResponse getJoinedGroupListResponse = (GetJoinedGroupListResponse) o;
    return Objects.equals(this.actionStatus, getJoinedGroupListResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getJoinedGroupListResponse.errorInfo) &&
        Objects.equals(this.errorCode, getJoinedGroupListResponse.errorCode) &&
        Objects.equals(this.totalCount, getJoinedGroupListResponse.totalCount) &&
        Objects.equals(this.groupIdList, getJoinedGroupListResponse.groupIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, totalCount, groupIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetJoinedGroupListResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    groupIdList: ").append(toIndentedString(groupIdList)).append("\n");
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

