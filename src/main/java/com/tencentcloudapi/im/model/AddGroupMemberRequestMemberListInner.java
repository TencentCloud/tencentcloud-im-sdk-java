
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * AddGroupMemberRequestMemberListInner
 */
@JsonPropertyOrder({
  AddGroupMemberRequestMemberListInner.JSON_PROPERTY_MEMBER_ACCOUNT
})
@JsonTypeName("AddGroupMemberRequest_MemberList_inner")

public class AddGroupMemberRequestMemberListInner {
  public static final String JSON_PROPERTY_MEMBER_ACCOUNT = "Member_Account";
  private String memberAccount;

  public AddGroupMemberRequestMemberListInner() { 
  }

  public AddGroupMemberRequestMemberListInner memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * 待添加的群成员 UserID
   * @return memberAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "待添加的群成员 UserID")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddGroupMemberRequestMemberListInner addGroupMemberRequestMemberListInner = (AddGroupMemberRequestMemberListInner) o;
    return Objects.equals(this.memberAccount, addGroupMemberRequestMemberListInner.memberAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddGroupMemberRequestMemberListInner {\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
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

