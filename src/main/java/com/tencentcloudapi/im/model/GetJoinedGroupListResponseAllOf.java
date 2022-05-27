
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.GetJoinedGroupListResponseAllOfGroupIdList;
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
 * GetJoinedGroupListResponseAllOf
 */
@JsonPropertyOrder({
  GetJoinedGroupListResponseAllOf.JSON_PROPERTY_TOTAL_COUNT,
  GetJoinedGroupListResponseAllOf.JSON_PROPERTY_GROUP_ID_LIST
})
@JsonTypeName("GetJoinedGroupListResponse_allOf")

public class GetJoinedGroupListResponseAllOf {
  public static final String JSON_PROPERTY_TOTAL_COUNT = "TotalCount";
  private Integer totalCount;

  public static final String JSON_PROPERTY_GROUP_ID_LIST = "GroupIdList";
  private List<GetJoinedGroupListResponseAllOfGroupIdList> groupIdList = null;

  public GetJoinedGroupListResponseAllOf() { 
  }

  public GetJoinedGroupListResponseAllOf totalCount(Integer totalCount) {
    
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


  public GetJoinedGroupListResponseAllOf groupIdList(List<GetJoinedGroupListResponseAllOfGroupIdList> groupIdList) {
    
    this.groupIdList = groupIdList;
    return this;
  }

  public GetJoinedGroupListResponseAllOf addGroupIdListItem(GetJoinedGroupListResponseAllOfGroupIdList groupIdListItem) {
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
    GetJoinedGroupListResponseAllOf getJoinedGroupListResponseAllOf = (GetJoinedGroupListResponseAllOf) o;
    return Objects.equals(this.totalCount, getJoinedGroupListResponseAllOf.totalCount) &&
        Objects.equals(this.groupIdList, getJoinedGroupListResponseAllOf.groupIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, groupIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetJoinedGroupListResponseAllOf {\n");
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

