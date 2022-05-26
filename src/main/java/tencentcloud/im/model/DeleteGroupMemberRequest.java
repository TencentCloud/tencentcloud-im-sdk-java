
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
 * DeleteGroupMemberRequest
 */
@JsonPropertyOrder({
  DeleteGroupMemberRequest.JSON_PROPERTY_GROUP_ID,
  DeleteGroupMemberRequest.JSON_PROPERTY_SILENCE,
  DeleteGroupMemberRequest.JSON_PROPERTY_REASON,
  DeleteGroupMemberRequest.JSON_PROPERTY_MEMBER_TO_DEL_ACCOUNT
})

public class DeleteGroupMemberRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  /**
   * 是否静默删人。0表示非静默删人，1表示静默删人。静默即删除成员时不通知群里所有成员，只通知被删除群成员。不填写该字段时默认为0
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

  public static final String JSON_PROPERTY_REASON = "Reason";
  private String reason;

  public static final String JSON_PROPERTY_MEMBER_TO_DEL_ACCOUNT = "MemberToDel_Account";
  private List<String> memberToDelAccount = new ArrayList<>();

  public DeleteGroupMemberRequest() { 
  }

  public DeleteGroupMemberRequest groupId(String groupId) {
    
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


  public DeleteGroupMemberRequest silence(SilenceEnum silence) {
    
    this.silence = silence;
    return this;
  }

   /**
   * 是否静默删人。0表示非静默删人，1表示静默删人。静默即删除成员时不通知群里所有成员，只通知被删除群成员。不填写该字段时默认为0
   * @return silence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否静默删人。0表示非静默删人，1表示静默删人。静默即删除成员时不通知群里所有成员，只通知被删除群成员。不填写该字段时默认为0")
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


  public DeleteGroupMemberRequest reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 踢出用户原因
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "踢出用户原因")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(String reason) {
    this.reason = reason;
  }


  public DeleteGroupMemberRequest memberToDelAccount(List<String> memberToDelAccount) {
    
    this.memberToDelAccount = memberToDelAccount;
    return this;
  }

  public DeleteGroupMemberRequest addMemberToDelAccountItem(String memberToDelAccountItem) {
    this.memberToDelAccount.add(memberToDelAccountItem);
    return this;
  }

   /**
   * 待删除的群成员
   * @return memberToDelAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "待删除的群成员")
  @JsonProperty(JSON_PROPERTY_MEMBER_TO_DEL_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getMemberToDelAccount() {
    return memberToDelAccount;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_TO_DEL_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMemberToDelAccount(List<String> memberToDelAccount) {
    this.memberToDelAccount = memberToDelAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteGroupMemberRequest deleteGroupMemberRequest = (DeleteGroupMemberRequest) o;
    return Objects.equals(this.groupId, deleteGroupMemberRequest.groupId) &&
        Objects.equals(this.silence, deleteGroupMemberRequest.silence) &&
        Objects.equals(this.reason, deleteGroupMemberRequest.reason) &&
        Objects.equals(this.memberToDelAccount, deleteGroupMemberRequest.memberToDelAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, silence, reason, memberToDelAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteGroupMemberRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    silence: ").append(toIndentedString(silence)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    memberToDelAccount: ").append(toIndentedString(memberToDelAccount)).append("\n");
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

