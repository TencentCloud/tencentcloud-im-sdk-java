
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
import tencentcloud.im.model.QueryOnlineStatusResponseAllOf;
import tencentcloud.im.model.QueryOnlineStatusResponseAllOfErrorList;
import tencentcloud.im.model.QueryOnlineStatusResponseAllOfQueryResult;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * QueryOnlineStatusResponse
 */
@JsonPropertyOrder({
  QueryOnlineStatusResponse.JSON_PROPERTY_ACTION_STATUS,
  QueryOnlineStatusResponse.JSON_PROPERTY_ERROR_INFO,
  QueryOnlineStatusResponse.JSON_PROPERTY_ERROR_CODE,
  QueryOnlineStatusResponse.JSON_PROPERTY_QUERY_RESULT,
  QueryOnlineStatusResponse.JSON_PROPERTY_ERROR_LIST
})

public class QueryOnlineStatusResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_QUERY_RESULT = "QueryResult";
  private List<QueryOnlineStatusResponseAllOfQueryResult> queryResult = null;

  public static final String JSON_PROPERTY_ERROR_LIST = "ErrorList";
  private List<QueryOnlineStatusResponseAllOfErrorList> errorList = null;

  public QueryOnlineStatusResponse() { 
  }

  public QueryOnlineStatusResponse actionStatus(String actionStatus) {
    
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


  public QueryOnlineStatusResponse errorInfo(String errorInfo) {
    
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


  public QueryOnlineStatusResponse errorCode(Integer errorCode) {
    
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


  public QueryOnlineStatusResponse queryResult(List<QueryOnlineStatusResponseAllOfQueryResult> queryResult) {
    
    this.queryResult = queryResult;
    return this;
  }

  public QueryOnlineStatusResponse addQueryResultItem(QueryOnlineStatusResponseAllOfQueryResult queryResultItem) {
    if (this.queryResult == null) {
      this.queryResult = new ArrayList<>();
    }
    this.queryResult.add(queryResultItem);
    return this;
  }

   /**
   * 返回的用户在线状态结构化信息
   * @return queryResult
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "返回的用户在线状态结构化信息")
  @JsonProperty(JSON_PROPERTY_QUERY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QueryOnlineStatusResponseAllOfQueryResult> getQueryResult() {
    return queryResult;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueryResult(List<QueryOnlineStatusResponseAllOfQueryResult> queryResult) {
    this.queryResult = queryResult;
  }


  public QueryOnlineStatusResponse errorList(List<QueryOnlineStatusResponseAllOfErrorList> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public QueryOnlineStatusResponse addErrorListItem(QueryOnlineStatusResponseAllOfErrorList errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * 状态查询失败的帐号列表，在此列表中的目标帐号，状态查询失败或目标帐号不存在。若状态全部查询成功，则 ErrorList 为空
   * @return errorList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "状态查询失败的帐号列表，在此列表中的目标帐号，状态查询失败或目标帐号不存在。若状态全部查询成功，则 ErrorList 为空")
  @JsonProperty(JSON_PROPERTY_ERROR_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QueryOnlineStatusResponseAllOfErrorList> getErrorList() {
    return errorList;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorList(List<QueryOnlineStatusResponseAllOfErrorList> errorList) {
    this.errorList = errorList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryOnlineStatusResponse queryOnlineStatusResponse = (QueryOnlineStatusResponse) o;
    return Objects.equals(this.actionStatus, queryOnlineStatusResponse.actionStatus) &&
        Objects.equals(this.errorInfo, queryOnlineStatusResponse.errorInfo) &&
        Objects.equals(this.errorCode, queryOnlineStatusResponse.errorCode) &&
        Objects.equals(this.queryResult, queryOnlineStatusResponse.queryResult) &&
        Objects.equals(this.errorList, queryOnlineStatusResponse.errorList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, queryResult, errorList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOnlineStatusResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    queryResult: ").append(toIndentedString(queryResult)).append("\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
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

