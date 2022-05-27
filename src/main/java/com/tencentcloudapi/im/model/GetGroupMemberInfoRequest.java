
package com.tencentcloudapi.im.model;

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
 * GetGroupMemberInfoRequest
 */
@JsonPropertyOrder({
  GetGroupMemberInfoRequest.JSON_PROPERTY_GROUP_ID,
  GetGroupMemberInfoRequest.JSON_PROPERTY_MEMBER_INFO_FILTER,
  GetGroupMemberInfoRequest.JSON_PROPERTY_MEMBER_ROLE_FILTER,
  GetGroupMemberInfoRequest.JSON_PROPERTY_APP_DEFINED_DATA_FILTER_GROUP_MEMBER,
  GetGroupMemberInfoRequest.JSON_PROPERTY_LIMIT,
  GetGroupMemberInfoRequest.JSON_PROPERTY_OFFSET,
  GetGroupMemberInfoRequest.JSON_PROPERTY_NEXT
})

public class GetGroupMemberInfoRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_MEMBER_INFO_FILTER = "MemberInfoFilter";
  private List<String> memberInfoFilter = null;

  public static final String JSON_PROPERTY_MEMBER_ROLE_FILTER = "MemberRoleFilter";
  private List<String> memberRoleFilter = null;

  public static final String JSON_PROPERTY_APP_DEFINED_DATA_FILTER_GROUP_MEMBER = "AppDefinedDataFilter_GroupMember";
  private List<String> appDefinedDataFilterGroupMember = null;

  public static final String JSON_PROPERTY_LIMIT = "Limit";
  private Integer limit;

  public static final String JSON_PROPERTY_OFFSET = "Offset";
  private Integer offset;

  public static final String JSON_PROPERTY_NEXT = "Next";
  private String next;

  public GetGroupMemberInfoRequest() { 
  }

  public GetGroupMemberInfoRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 需要拉取成员信息的群组的 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要拉取成员信息的群组的 ID")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public GetGroupMemberInfoRequest memberInfoFilter(List<String> memberInfoFilter) {
    
    this.memberInfoFilter = memberInfoFilter;
    return this;
  }

  public GetGroupMemberInfoRequest addMemberInfoFilterItem(String memberInfoFilterItem) {
    if (this.memberInfoFilter == null) {
      this.memberInfoFilter = new ArrayList<>();
    }
    this.memberInfoFilter.add(memberInfoFilterItem);
    return this;
  }

   /**
   * 需要获取哪些信息， 如果没有该字段则为群成员全部资料，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）
   * @return memberInfoFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "需要获取哪些信息， 如果没有该字段则为群成员全部资料，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）")
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


  public GetGroupMemberInfoRequest memberRoleFilter(List<String> memberRoleFilter) {
    
    this.memberRoleFilter = memberRoleFilter;
    return this;
  }

  public GetGroupMemberInfoRequest addMemberRoleFilterItem(String memberRoleFilterItem) {
    if (this.memberRoleFilter == null) {
      this.memberRoleFilter = new ArrayList<>();
    }
    this.memberRoleFilter.add(memberRoleFilterItem);
    return this;
  }

   /**
   * 拉取指定身份的群成员资料。如没有填写该字段，默认为所有身份成员资料，成员身份可以为：“Owner”，“Admin”，“Member”
   * @return memberRoleFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "拉取指定身份的群成员资料。如没有填写该字段，默认为所有身份成员资料，成员身份可以为：“Owner”，“Admin”，“Member”")
  @JsonProperty(JSON_PROPERTY_MEMBER_ROLE_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMemberRoleFilter() {
    return memberRoleFilter;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_ROLE_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberRoleFilter(List<String> memberRoleFilter) {
    this.memberRoleFilter = memberRoleFilter;
  }


  public GetGroupMemberInfoRequest appDefinedDataFilterGroupMember(List<String> appDefinedDataFilterGroupMember) {
    
    this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
    return this;
  }

  public GetGroupMemberInfoRequest addAppDefinedDataFilterGroupMemberItem(String appDefinedDataFilterGroupMemberItem) {
    if (this.appDefinedDataFilterGroupMember == null) {
      this.appDefinedDataFilterGroupMember = new ArrayList<>();
    }
    this.appDefinedDataFilterGroupMember.add(appDefinedDataFilterGroupMemberItem);
    return this;
  }

   /**
   * 默认情况是没有的。该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段，群成员维度的自定义字段详情请参阅 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5）
   * @return appDefinedDataFilterGroupMember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "默认情况是没有的。该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段，群成员维度的自定义字段详情请参阅 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5）")
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


  public GetGroupMemberInfoRequest limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * 一次最多获取多少个成员的资料，不得超过6000。如果不填，则获取群内全部成员的信息
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "一次最多获取多少个成员的资料，不得超过6000。如果不填，则获取群内全部成员的信息")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public GetGroupMemberInfoRequest offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * 从第几个成员开始获取，如果不填则默认为0，表示从第一个成员开始获取
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "从第几个成员开始获取，如果不填则默认为0，表示从第一个成员开始获取")
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOffset() {
    return offset;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public GetGroupMemberInfoRequest next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * 上一次拉取到的成员位置，社群必填，社群不支持 Offset 参数，使用 Next 参数，首次调用填写\&quot;\&quot;，续拉使用返回中的 Next 值
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上一次拉取到的成员位置，社群必填，社群不支持 Offset 参数，使用 Next 参数，首次调用填写\"\"，续拉使用返回中的 Next 值")
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
    GetGroupMemberInfoRequest getGroupMemberInfoRequest = (GetGroupMemberInfoRequest) o;
    return Objects.equals(this.groupId, getGroupMemberInfoRequest.groupId) &&
        Objects.equals(this.memberInfoFilter, getGroupMemberInfoRequest.memberInfoFilter) &&
        Objects.equals(this.memberRoleFilter, getGroupMemberInfoRequest.memberRoleFilter) &&
        Objects.equals(this.appDefinedDataFilterGroupMember, getGroupMemberInfoRequest.appDefinedDataFilterGroupMember) &&
        Objects.equals(this.limit, getGroupMemberInfoRequest.limit) &&
        Objects.equals(this.offset, getGroupMemberInfoRequest.offset) &&
        Objects.equals(this.next, getGroupMemberInfoRequest.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, memberInfoFilter, memberRoleFilter, appDefinedDataFilterGroupMember, limit, offset, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupMemberInfoRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    memberInfoFilter: ").append(toIndentedString(memberInfoFilter)).append("\n");
    sb.append("    memberRoleFilter: ").append(toIndentedString(memberRoleFilter)).append("\n");
    sb.append("    appDefinedDataFilterGroupMember: ").append(toIndentedString(appDefinedDataFilterGroupMember)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

