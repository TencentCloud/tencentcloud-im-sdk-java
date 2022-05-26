
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
import tencentcloud.im.model.QueryOnlineStatusResponseAllOfErrorList;
import tencentcloud.im.model.QueryOnlineStatusResponseAllOfQueryResult;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * QueryOnlineStatusResponseAllOf
 */
@JsonPropertyOrder({
  QueryOnlineStatusResponseAllOf.JSON_PROPERTY_QUERY_RESULT,
  QueryOnlineStatusResponseAllOf.JSON_PROPERTY_ERROR_LIST
})
@JsonTypeName("QueryOnlineStatusResponse_allOf")

public class QueryOnlineStatusResponseAllOf {
  public static final String JSON_PROPERTY_QUERY_RESULT = "QueryResult";
  private List<QueryOnlineStatusResponseAllOfQueryResult> queryResult = null;

  public static final String JSON_PROPERTY_ERROR_LIST = "ErrorList";
  private List<QueryOnlineStatusResponseAllOfErrorList> errorList = null;

  public QueryOnlineStatusResponseAllOf() { 
  }

  public QueryOnlineStatusResponseAllOf queryResult(List<QueryOnlineStatusResponseAllOfQueryResult> queryResult) {
    
    this.queryResult = queryResult;
    return this;
  }

  public QueryOnlineStatusResponseAllOf addQueryResultItem(QueryOnlineStatusResponseAllOfQueryResult queryResultItem) {
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


  public QueryOnlineStatusResponseAllOf errorList(List<QueryOnlineStatusResponseAllOfErrorList> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public QueryOnlineStatusResponseAllOf addErrorListItem(QueryOnlineStatusResponseAllOfErrorList errorListItem) {
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
    QueryOnlineStatusResponseAllOf queryOnlineStatusResponseAllOf = (QueryOnlineStatusResponseAllOf) o;
    return Objects.equals(this.queryResult, queryOnlineStatusResponseAllOf.queryResult) &&
        Objects.equals(this.errorList, queryOnlineStatusResponseAllOf.errorList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryResult, errorList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOnlineStatusResponseAllOf {\n");
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

