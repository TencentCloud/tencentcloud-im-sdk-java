
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
import tencentcloud.im.model.ImportGroupMemberRequestMemberListInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ImportGroupMemberRequest
 */
@JsonPropertyOrder({
  ImportGroupMemberRequest.JSON_PROPERTY_GROUP_ID,
  ImportGroupMemberRequest.JSON_PROPERTY_MEMBER_LIST
})

public class ImportGroupMemberRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_MEMBER_LIST = "MemberList";
  private List<ImportGroupMemberRequestMemberListInner> memberList = new ArrayList<>();

  public ImportGroupMemberRequest() { 
  }

  public ImportGroupMemberRequest groupId(String groupId) {
    
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


  public ImportGroupMemberRequest memberList(List<ImportGroupMemberRequestMemberListInner> memberList) {
    
    this.memberList = memberList;
    return this;
  }

  public ImportGroupMemberRequest addMemberListItem(ImportGroupMemberRequestMemberListInner memberListItem) {
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

  public List<ImportGroupMemberRequestMemberListInner> getMemberList() {
    return memberList;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMemberList(List<ImportGroupMemberRequestMemberListInner> memberList) {
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
    ImportGroupMemberRequest importGroupMemberRequest = (ImportGroupMemberRequest) o;
    return Objects.equals(this.groupId, importGroupMemberRequest.groupId) &&
        Objects.equals(this.memberList, importGroupMemberRequest.memberList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, memberList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMemberRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

