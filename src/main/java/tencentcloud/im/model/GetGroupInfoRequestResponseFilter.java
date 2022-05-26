
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
 * 包含三个过滤器：GroupBaseInfoFilter，MemberInfoFilter，AppDefinedDataFilter_Group，分别是基础信息字段过滤器，成员信息字段过滤器，群组维度的自定义字段过滤器
 */
@ApiModel(description = "包含三个过滤器：GroupBaseInfoFilter，MemberInfoFilter，AppDefinedDataFilter_Group，分别是基础信息字段过滤器，成员信息字段过滤器，群组维度的自定义字段过滤器")
@JsonPropertyOrder({
  GetGroupInfoRequestResponseFilter.JSON_PROPERTY_GROUP_BASE_INFO_FILTER,
  GetGroupInfoRequestResponseFilter.JSON_PROPERTY_MEMBER_INFO_FILTER,
  GetGroupInfoRequestResponseFilter.JSON_PROPERTY_APP_DEFINED_DATA_FILTER_GROUP,
  GetGroupInfoRequestResponseFilter.JSON_PROPERTY_APP_DEFINED_DATA_FILTER_GROUP_MEMBER
})
@JsonTypeName("GetGroupInfoRequest_ResponseFilter")

public class GetGroupInfoRequestResponseFilter {
  public static final String JSON_PROPERTY_GROUP_BASE_INFO_FILTER = "GroupBaseInfoFilter";
  private List<String> groupBaseInfoFilter = null;

  public static final String JSON_PROPERTY_MEMBER_INFO_FILTER = "MemberInfoFilter";
  private List<String> memberInfoFilter = null;

  public static final String JSON_PROPERTY_APP_DEFINED_DATA_FILTER_GROUP = "AppDefinedDataFilter_Group";
  private List<String> appDefinedDataFilterGroup = null;

  public static final String JSON_PROPERTY_APP_DEFINED_DATA_FILTER_GROUP_MEMBER = "AppDefinedDataFilter_GroupMember";
  private List<String> appDefinedDataFilterGroupMember = null;

  public GetGroupInfoRequestResponseFilter() { 
  }

  public GetGroupInfoRequestResponseFilter groupBaseInfoFilter(List<String> groupBaseInfoFilter) {
    
    this.groupBaseInfoFilter = groupBaseInfoFilter;
    return this;
  }

  public GetGroupInfoRequestResponseFilter addGroupBaseInfoFilterItem(String groupBaseInfoFilterItem) {
    if (this.groupBaseInfoFilter == null) {
      this.groupBaseInfoFilter = new ArrayList<>();
    }
    this.groupBaseInfoFilter.add(groupBaseInfoFilterItem);
    return this;
  }

   /**
   * 基础信息字段过滤器，指定需要获取的基础信息字段，基础信息字段详情请参阅 群基础资料（https://cloud.tencent.com/document/product/269/1502#GroupBaseInfoFilter）
   * @return groupBaseInfoFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "基础信息字段过滤器，指定需要获取的基础信息字段，基础信息字段详情请参阅 群基础资料（https://cloud.tencent.com/document/product/269/1502#GroupBaseInfoFilter）")
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


  public GetGroupInfoRequestResponseFilter memberInfoFilter(List<String> memberInfoFilter) {
    
    this.memberInfoFilter = memberInfoFilter;
    return this;
  }

  public GetGroupInfoRequestResponseFilter addMemberInfoFilterItem(String memberInfoFilterItem) {
    if (this.memberInfoFilter == null) {
      this.memberInfoFilter = new ArrayList<>();
    }
    this.memberInfoFilter.add(memberInfoFilterItem);
    return this;
  }

   /**
   * 成员信息字段过滤器，指定需要获取的成员信息字段，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）
   * @return memberInfoFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "成员信息字段过滤器，指定需要获取的成员信息字段，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）")
  @JsonProperty(JSON_PROPERTY_MEMBER_INFO_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMemberInfoFilter() {
    return memberInfoFilter;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_INFO_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberInfoFilter(List<String> memberInfoFilter) {
    this.memberInfoFilter = memberInfoFilter;
  }


  public GetGroupInfoRequestResponseFilter appDefinedDataFilterGroup(List<String> appDefinedDataFilterGroup) {
    
    this.appDefinedDataFilterGroup = appDefinedDataFilterGroup;
    return this;
  }

  public GetGroupInfoRequestResponseFilter addAppDefinedDataFilterGroupItem(String appDefinedDataFilterGroupItem) {
    if (this.appDefinedDataFilterGroup == null) {
      this.appDefinedDataFilterGroup = new ArrayList<>();
    }
    this.appDefinedDataFilterGroup.add(appDefinedDataFilterGroupItem);
    return this;
  }

   /**
   * 该字段用来群组维度的自定义字段过滤器，指定需要获取的群组维度的自定义字段，详情请参阅 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5）
   * @return appDefinedDataFilterGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该字段用来群组维度的自定义字段过滤器，指定需要获取的群组维度的自定义字段，详情请参阅 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5）")
  @JsonProperty(JSON_PROPERTY_APP_DEFINED_DATA_FILTER_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAppDefinedDataFilterGroup() {
    return appDefinedDataFilterGroup;
  }


  @JsonProperty(JSON_PROPERTY_APP_DEFINED_DATA_FILTER_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppDefinedDataFilterGroup(List<String> appDefinedDataFilterGroup) {
    this.appDefinedDataFilterGroup = appDefinedDataFilterGroup;
  }


  public GetGroupInfoRequestResponseFilter appDefinedDataFilterGroupMember(List<String> appDefinedDataFilterGroupMember) {
    
    this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
    return this;
  }

  public GetGroupInfoRequestResponseFilter addAppDefinedDataFilterGroupMemberItem(String appDefinedDataFilterGroupMemberItem) {
    if (this.appDefinedDataFilterGroupMember == null) {
      this.appDefinedDataFilterGroupMember = new ArrayList<>();
    }
    this.appDefinedDataFilterGroupMember.add(appDefinedDataFilterGroupMemberItem);
    return this;
  }

   /**
   * 该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段，详情请参阅 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5）
   * @return appDefinedDataFilterGroupMember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段，详情请参阅 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5）")
  @JsonProperty(JSON_PROPERTY_APP_DEFINED_DATA_FILTER_GROUP_MEMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAppDefinedDataFilterGroupMember() {
    return appDefinedDataFilterGroupMember;
  }


  @JsonProperty(JSON_PROPERTY_APP_DEFINED_DATA_FILTER_GROUP_MEMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppDefinedDataFilterGroupMember(List<String> appDefinedDataFilterGroupMember) {
    this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupInfoRequestResponseFilter getGroupInfoRequestResponseFilter = (GetGroupInfoRequestResponseFilter) o;
    return Objects.equals(this.groupBaseInfoFilter, getGroupInfoRequestResponseFilter.groupBaseInfoFilter) &&
        Objects.equals(this.memberInfoFilter, getGroupInfoRequestResponseFilter.memberInfoFilter) &&
        Objects.equals(this.appDefinedDataFilterGroup, getGroupInfoRequestResponseFilter.appDefinedDataFilterGroup) &&
        Objects.equals(this.appDefinedDataFilterGroupMember, getGroupInfoRequestResponseFilter.appDefinedDataFilterGroupMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupBaseInfoFilter, memberInfoFilter, appDefinedDataFilterGroup, appDefinedDataFilterGroupMember);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupInfoRequestResponseFilter {\n");
    sb.append("    groupBaseInfoFilter: ").append(toIndentedString(groupBaseInfoFilter)).append("\n");
    sb.append("    memberInfoFilter: ").append(toIndentedString(memberInfoFilter)).append("\n");
    sb.append("    appDefinedDataFilterGroup: ").append(toIndentedString(appDefinedDataFilterGroup)).append("\n");
    sb.append("    appDefinedDataFilterGroupMember: ").append(toIndentedString(appDefinedDataFilterGroupMember)).append("\n");
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

