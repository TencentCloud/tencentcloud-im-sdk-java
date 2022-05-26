
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetRoleInGroupResponseAllOfUserIdList
 */
@JsonPropertyOrder({
  GetRoleInGroupResponseAllOfUserIdList.JSON_PROPERTY_MEMBER_ACCOUNT,
  GetRoleInGroupResponseAllOfUserIdList.JSON_PROPERTY_ROLE
})
@JsonTypeName("GetRoleInGroupResponse_allOf_UserIdList")

public class GetRoleInGroupResponseAllOfUserIdList {
  public static final String JSON_PROPERTY_MEMBER_ACCOUNT = "Member_Account";
  private String memberAccount;

  public static final String JSON_PROPERTY_ROLE = "Role";
  private String role;

  public GetRoleInGroupResponseAllOfUserIdList() { 
  }

  public GetRoleInGroupResponseAllOfUserIdList memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * Get memberAccount
   * @return memberAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemberAccount() {
    return memberAccount;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  public GetRoleInGroupResponseAllOfUserIdList role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * 成员角色：Owner/Admin/Member/NotMember
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "成员角色：Owner/Admin/Member/NotMember")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRoleInGroupResponseAllOfUserIdList getRoleInGroupResponseAllOfUserIdList = (GetRoleInGroupResponseAllOfUserIdList) o;
    return Objects.equals(this.memberAccount, getRoleInGroupResponseAllOfUserIdList.memberAccount) &&
        Objects.equals(this.role, getRoleInGroupResponseAllOfUserIdList.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAccount, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoleInGroupResponseAllOfUserIdList {\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

