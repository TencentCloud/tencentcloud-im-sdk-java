
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
import tencentcloud.im.model.GetAppidGroupListResponseAllOfGroupIdList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetAppidGroupListResponseAllOf
 */
@JsonPropertyOrder({
  GetAppidGroupListResponseAllOf.JSON_PROPERTY_TOTAL_COUNT,
  GetAppidGroupListResponseAllOf.JSON_PROPERTY_GROUP_ID_LIST,
  GetAppidGroupListResponseAllOf.JSON_PROPERTY_NEXT
})
@JsonTypeName("GetAppidGroupListResponse_allOf")

public class GetAppidGroupListResponseAllOf {
  public static final String JSON_PROPERTY_TOTAL_COUNT = "TotalCount";
  private Integer totalCount;

  public static final String JSON_PROPERTY_GROUP_ID_LIST = "GroupIdList";
  private List<GetAppidGroupListResponseAllOfGroupIdList> groupIdList = null;

  public static final String JSON_PROPERTY_NEXT = "Next";
  private Integer next;

  public GetAppidGroupListResponseAllOf() { 
  }

  public GetAppidGroupListResponseAllOf totalCount(Integer totalCount) {
    
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


  public GetAppidGroupListResponseAllOf groupIdList(List<GetAppidGroupListResponseAllOfGroupIdList> groupIdList) {
    
    this.groupIdList = groupIdList;
    return this;
  }

  public GetAppidGroupListResponseAllOf addGroupIdListItem(GetAppidGroupListResponseAllOfGroupIdList groupIdListItem) {
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


  public GetAppidGroupListResponseAllOf next(Integer next) {
    
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
    GetAppidGroupListResponseAllOf getAppidGroupListResponseAllOf = (GetAppidGroupListResponseAllOf) o;
    return Objects.equals(this.totalCount, getAppidGroupListResponseAllOf.totalCount) &&
        Objects.equals(this.groupIdList, getAppidGroupListResponseAllOf.groupIdList) &&
        Objects.equals(this.next, getAppidGroupListResponseAllOf.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, groupIdList, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAppidGroupListResponseAllOf {\n");
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

