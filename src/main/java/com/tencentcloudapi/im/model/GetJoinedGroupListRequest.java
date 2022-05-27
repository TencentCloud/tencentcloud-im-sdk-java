
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.GetJoinedGroupListRequestResponseFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetJoinedGroupListRequest
 */
@JsonPropertyOrder({
  GetJoinedGroupListRequest.JSON_PROPERTY_MEMBER_ACCOUNT,
  GetJoinedGroupListRequest.JSON_PROPERTY_WITH_HUGE_GROUPS,
  GetJoinedGroupListRequest.JSON_PROPERTY_WITH_NO_ACTIVE_GROUPS,
  GetJoinedGroupListRequest.JSON_PROPERTY_LIMIT,
  GetJoinedGroupListRequest.JSON_PROPERTY_OFFSET,
  GetJoinedGroupListRequest.JSON_PROPERTY_GROUP_TYPE,
  GetJoinedGroupListRequest.JSON_PROPERTY_RESPONSE_FILTER
})

public class GetJoinedGroupListRequest {
  public static final String JSON_PROPERTY_MEMBER_ACCOUNT = "Member_Account";
  private String memberAccount;

  /**
   * 是否获取用户加入的 AVChatRoom(直播群)，0表示不获取，1表示获取。默认为0
   */
  public enum WithHugeGroupsEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    WithHugeGroupsEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WithHugeGroupsEnum fromValue(Integer value) {
      for (WithHugeGroupsEnum b : WithHugeGroupsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WITH_HUGE_GROUPS = "WithHugeGroups";
  private WithHugeGroupsEnum withHugeGroups;

  /**
   * 是否获取用户已加入但未激活的 Private（即新版本中 Work，好友工作群) 群信息，0表示不获取，1表示获取。默认为0
   */
  public enum WithNoActiveGroupsEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    WithNoActiveGroupsEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WithNoActiveGroupsEnum fromValue(Integer value) {
      for (WithNoActiveGroupsEnum b : WithNoActiveGroupsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WITH_NO_ACTIVE_GROUPS = "WithNoActiveGroups";
  private WithNoActiveGroupsEnum withNoActiveGroups;

  public static final String JSON_PROPERTY_LIMIT = "Limit";
  private Integer limit;

  public static final String JSON_PROPERTY_OFFSET = "Offset";
  private Integer offset;

  public static final String JSON_PROPERTY_GROUP_TYPE = "GroupType";
  private String groupType;

  public static final String JSON_PROPERTY_RESPONSE_FILTER = "ResponseFilter";
  private GetJoinedGroupListRequestResponseFilter responseFilter;

  public GetJoinedGroupListRequest() { 
  }

  public GetJoinedGroupListRequest memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * 需要查询的用户帐号
   * @return memberAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要查询的用户帐号")
  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMemberAccount() {
    return memberAccount;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  public GetJoinedGroupListRequest withHugeGroups(WithHugeGroupsEnum withHugeGroups) {
    
    this.withHugeGroups = withHugeGroups;
    return this;
  }

   /**
   * 是否获取用户加入的 AVChatRoom(直播群)，0表示不获取，1表示获取。默认为0
   * @return withHugeGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否获取用户加入的 AVChatRoom(直播群)，0表示不获取，1表示获取。默认为0")
  @JsonProperty(JSON_PROPERTY_WITH_HUGE_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WithHugeGroupsEnum getWithHugeGroups() {
    return withHugeGroups;
  }


  @JsonProperty(JSON_PROPERTY_WITH_HUGE_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWithHugeGroups(WithHugeGroupsEnum withHugeGroups) {
    this.withHugeGroups = withHugeGroups;
  }


  public GetJoinedGroupListRequest withNoActiveGroups(WithNoActiveGroupsEnum withNoActiveGroups) {
    
    this.withNoActiveGroups = withNoActiveGroups;
    return this;
  }

   /**
   * 是否获取用户已加入但未激活的 Private（即新版本中 Work，好友工作群) 群信息，0表示不获取，1表示获取。默认为0
   * @return withNoActiveGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否获取用户已加入但未激活的 Private（即新版本中 Work，好友工作群) 群信息，0表示不获取，1表示获取。默认为0")
  @JsonProperty(JSON_PROPERTY_WITH_NO_ACTIVE_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WithNoActiveGroupsEnum getWithNoActiveGroups() {
    return withNoActiveGroups;
  }


  @JsonProperty(JSON_PROPERTY_WITH_NO_ACTIVE_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWithNoActiveGroups(WithNoActiveGroupsEnum withNoActiveGroups) {
    this.withNoActiveGroups = withNoActiveGroups;
  }


  public GetJoinedGroupListRequest limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * 单次拉取的群组数量，如果不填代表所有群组
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单次拉取的群组数量，如果不填代表所有群组")
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


  public GetJoinedGroupListRequest offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * 从第多少个群组开始拉取
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "从第多少个群组开始拉取")
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


  public GetJoinedGroupListRequest groupType(String groupType) {
    
    this.groupType = groupType;
    return this;
  }

   /**
   * 拉取哪种群组类型，例如 Public(陌生人社交群)，Private（即新版本Work，好友工作群)，ChatRoom （即新版本Meeting，会议群），AVChatRoom(直播群)，Community（社群），不填为拉取所有
   * @return groupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "拉取哪种群组类型，例如 Public(陌生人社交群)，Private（即新版本Work，好友工作群)，ChatRoom （即新版本Meeting，会议群），AVChatRoom(直播群)，Community（社群），不填为拉取所有")
  @JsonProperty(JSON_PROPERTY_GROUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupType() {
    return groupType;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }


  public GetJoinedGroupListRequest responseFilter(GetJoinedGroupListRequestResponseFilter responseFilter) {
    
    this.responseFilter = responseFilter;
    return this;
  }

   /**
   * Get responseFilter
   * @return responseFilter
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetJoinedGroupListRequestResponseFilter getResponseFilter() {
    return responseFilter;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseFilter(GetJoinedGroupListRequestResponseFilter responseFilter) {
    this.responseFilter = responseFilter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetJoinedGroupListRequest getJoinedGroupListRequest = (GetJoinedGroupListRequest) o;
    return Objects.equals(this.memberAccount, getJoinedGroupListRequest.memberAccount) &&
        Objects.equals(this.withHugeGroups, getJoinedGroupListRequest.withHugeGroups) &&
        Objects.equals(this.withNoActiveGroups, getJoinedGroupListRequest.withNoActiveGroups) &&
        Objects.equals(this.limit, getJoinedGroupListRequest.limit) &&
        Objects.equals(this.offset, getJoinedGroupListRequest.offset) &&
        Objects.equals(this.groupType, getJoinedGroupListRequest.groupType) &&
        Objects.equals(this.responseFilter, getJoinedGroupListRequest.responseFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAccount, withHugeGroups, withNoActiveGroups, limit, offset, groupType, responseFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetJoinedGroupListRequest {\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    withHugeGroups: ").append(toIndentedString(withHugeGroups)).append("\n");
    sb.append("    withNoActiveGroups: ").append(toIndentedString(withNoActiveGroups)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    responseFilter: ").append(toIndentedString(responseFilter)).append("\n");
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

