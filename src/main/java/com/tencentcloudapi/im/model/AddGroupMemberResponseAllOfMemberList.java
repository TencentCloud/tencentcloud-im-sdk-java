
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
 * AddGroupMemberResponseAllOfMemberList
 */
@JsonPropertyOrder({
  AddGroupMemberResponseAllOfMemberList.JSON_PROPERTY_MEMBER_ACCOUNT,
  AddGroupMemberResponseAllOfMemberList.JSON_PROPERTY_RESULT
})
@JsonTypeName("AddGroupMemberResponse_allOf_MemberList")

public class AddGroupMemberResponseAllOfMemberList {
  public static final String JSON_PROPERTY_MEMBER_ACCOUNT = "Member_Account";
  private String memberAccount;

  public static final String JSON_PROPERTY_RESULT = "Result";
  private Integer result;

  public AddGroupMemberResponseAllOfMemberList() { 
  }

  public AddGroupMemberResponseAllOfMemberList memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * 返回的群成员 UserID
   * @return memberAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "返回的群成员 UserID")
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


  public AddGroupMemberResponseAllOfMemberList result(Integer result) {
    
    this.result = result;
    return this;
  }

   /**
   * 加人结果：0-失败；1-成功；2-已经是群成员；3-等待被邀请者确认
   * @return result
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "加人结果：0-失败；1-成功；2-已经是群成员；3-等待被邀请者确认")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResult(Integer result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddGroupMemberResponseAllOfMemberList addGroupMemberResponseAllOfMemberList = (AddGroupMemberResponseAllOfMemberList) o;
    return Objects.equals(this.memberAccount, addGroupMemberResponseAllOfMemberList.memberAccount) &&
        Objects.equals(this.result, addGroupMemberResponseAllOfMemberList.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAccount, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddGroupMemberResponseAllOfMemberList {\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

