
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
import tencentcloud.im.model.AddGroupMemberRequestMemberListInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * AddGroupMemberRequest
 */
@JsonPropertyOrder({
  AddGroupMemberRequest.JSON_PROPERTY_GROUP_ID,
  AddGroupMemberRequest.JSON_PROPERTY_SILENCE,
  AddGroupMemberRequest.JSON_PROPERTY_MEMBER_LIST
})

public class AddGroupMemberRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  /**
   * 是否静默加人。0：非静默加人；1：静默加人。不填该字段默认为0
   */
  public enum SilenceEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    SilenceEnum(Integer value) {
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
    public static SilenceEnum fromValue(Integer value) {
      for (SilenceEnum b : SilenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SILENCE = "Silence";
  private SilenceEnum silence;

  public static final String JSON_PROPERTY_MEMBER_LIST = "MemberList";
  private List<AddGroupMemberRequestMemberListInner> memberList = new ArrayList<>();

  public AddGroupMemberRequest() { 
  }

  public AddGroupMemberRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 操作的群 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "操作的群 ID")
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


  public AddGroupMemberRequest silence(SilenceEnum silence) {
    
    this.silence = silence;
    return this;
  }

   /**
   * 是否静默加人。0：非静默加人；1：静默加人。不填该字段默认为0
   * @return silence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否静默加人。0：非静默加人；1：静默加人。不填该字段默认为0")
  @JsonProperty(JSON_PROPERTY_SILENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SilenceEnum getSilence() {
    return silence;
  }


  @JsonProperty(JSON_PROPERTY_SILENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSilence(SilenceEnum silence) {
    this.silence = silence;
  }


  public AddGroupMemberRequest memberList(List<AddGroupMemberRequestMemberListInner> memberList) {
    
    this.memberList = memberList;
    return this;
  }

  public AddGroupMemberRequest addMemberListItem(AddGroupMemberRequestMemberListInner memberListItem) {
    this.memberList.add(memberListItem);
    return this;
  }

   /**
   * 待添加的群成员数组
   * @return memberList
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "待添加的群成员数组")
  @JsonProperty(JSON_PROPERTY_MEMBER_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AddGroupMemberRequestMemberListInner> getMemberList() {
    return memberList;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMemberList(List<AddGroupMemberRequestMemberListInner> memberList) {
    this.memberList = memberList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddGroupMemberRequest addGroupMemberRequest = (AddGroupMemberRequest) o;
    return Objects.equals(this.groupId, addGroupMemberRequest.groupId) &&
        Objects.equals(this.silence, addGroupMemberRequest.silence) &&
        Objects.equals(this.memberList, addGroupMemberRequest.memberList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, silence, memberList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddGroupMemberRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    silence: ").append(toIndentedString(silence)).append("\n");
    sb.append("    memberList: ").append(toIndentedString(memberList)).append("\n");
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

