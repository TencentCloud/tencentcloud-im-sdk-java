
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * 分别包含 GroupBaseInfoFilter 和 SelfInfoFilter 两个过滤器； GroupBaseInfoFilter 表示需要拉取哪些基础信息字段，详情请参阅 群组系统；SelfInfoFilter 表示需要拉取用户在每个群组中的哪些个人资料，详情请参阅 群组系统 。
 */
@ApiModel(description = "分别包含 GroupBaseInfoFilter 和 SelfInfoFilter 两个过滤器； GroupBaseInfoFilter 表示需要拉取哪些基础信息字段，详情请参阅 群组系统；SelfInfoFilter 表示需要拉取用户在每个群组中的哪些个人资料，详情请参阅 群组系统 。")
@JsonPropertyOrder({
  GetJoinedGroupListRequestResponseFilter.JSON_PROPERTY_GROUP_BASE_INFO_FILTER,
  GetJoinedGroupListRequestResponseFilter.JSON_PROPERTY_SELF_INFO_FILTER
})
@JsonTypeName("GetJoinedGroupListRequest_ResponseFilter")

public class GetJoinedGroupListRequestResponseFilter {
  public static final String JSON_PROPERTY_GROUP_BASE_INFO_FILTER = "GroupBaseInfoFilter";
  private List<String> groupBaseInfoFilter = null;

  public static final String JSON_PROPERTY_SELF_INFO_FILTER = "SelfInfoFilter";
  private List<String> selfInfoFilter = null;

  public GetJoinedGroupListRequestResponseFilter() { 
  }

  public GetJoinedGroupListRequestResponseFilter groupBaseInfoFilter(List<String> groupBaseInfoFilter) {
    
    this.groupBaseInfoFilter = groupBaseInfoFilter;
    return this;
  }

  public GetJoinedGroupListRequestResponseFilter addGroupBaseInfoFilterItem(String groupBaseInfoFilterItem) {
    if (this.groupBaseInfoFilter == null) {
      this.groupBaseInfoFilter = new ArrayList<>();
    }
    this.groupBaseInfoFilter.add(groupBaseInfoFilterItem);
    return this;
  }

   /**
   * 需要拉取哪些基础信息字段，详情请参阅 群组系统（https://cloud.tencent.com/document/product/269/1502#GroupBaseInfoFilter）
   * @return groupBaseInfoFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "需要拉取哪些基础信息字段，详情请参阅 群组系统（https://cloud.tencent.com/document/product/269/1502#GroupBaseInfoFilter）")
  @JsonProperty(JSON_PROPERTY_GROUP_BASE_INFO_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getGroupBaseInfoFilter() {
    return groupBaseInfoFilter;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_BASE_INFO_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupBaseInfoFilter(List<String> groupBaseInfoFilter) {
    this.groupBaseInfoFilter = groupBaseInfoFilter;
  }


  public GetJoinedGroupListRequestResponseFilter selfInfoFilter(List<String> selfInfoFilter) {
    
    this.selfInfoFilter = selfInfoFilter;
    return this;
  }

  public GetJoinedGroupListRequestResponseFilter addSelfInfoFilterItem(String selfInfoFilterItem) {
    if (this.selfInfoFilter == null) {
      this.selfInfoFilter = new ArrayList<>();
    }
    this.selfInfoFilter.add(selfInfoFilterItem);
    return this;
  }

   /**
   * 需要拉取用户在每个群组中的哪些个人资料，详情请参阅 群组系统 （https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）。
   * @return selfInfoFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "需要拉取用户在每个群组中的哪些个人资料，详情请参阅 群组系统 （https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）。")
  @JsonProperty(JSON_PROPERTY_SELF_INFO_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSelfInfoFilter() {
    return selfInfoFilter;
  }


  @JsonProperty(JSON_PROPERTY_SELF_INFO_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelfInfoFilter(List<String> selfInfoFilter) {
    this.selfInfoFilter = selfInfoFilter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetJoinedGroupListRequestResponseFilter getJoinedGroupListRequestResponseFilter = (GetJoinedGroupListRequestResponseFilter) o;
    return Objects.equals(this.groupBaseInfoFilter, getJoinedGroupListRequestResponseFilter.groupBaseInfoFilter) &&
        Objects.equals(this.selfInfoFilter, getJoinedGroupListRequestResponseFilter.selfInfoFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupBaseInfoFilter, selfInfoFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetJoinedGroupListRequestResponseFilter {\n");
    sb.append("    groupBaseInfoFilter: ").append(toIndentedString(groupBaseInfoFilter)).append("\n");
    sb.append("    selfInfoFilter: ").append(toIndentedString(selfInfoFilter)).append("\n");
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

