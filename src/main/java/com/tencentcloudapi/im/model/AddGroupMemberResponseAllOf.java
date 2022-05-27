
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.AddGroupMemberResponseAllOfMemberList;
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
 * AddGroupMemberResponseAllOf
 */
@JsonPropertyOrder({
  AddGroupMemberResponseAllOf.JSON_PROPERTY_MEMBER_LIST
})
@JsonTypeName("AddGroupMemberResponse_allOf")

public class AddGroupMemberResponseAllOf {
  public static final String JSON_PROPERTY_MEMBER_LIST = "MemberList";
  private List<AddGroupMemberResponseAllOfMemberList> memberList = null;

  public AddGroupMemberResponseAllOf() { 
  }

  public AddGroupMemberResponseAllOf memberList(List<AddGroupMemberResponseAllOfMemberList> memberList) {
    
    this.memberList = memberList;
    return this;
  }

  public AddGroupMemberResponseAllOf addMemberListItem(AddGroupMemberResponseAllOfMemberList memberListItem) {
    if (this.memberList == null) {
      this.memberList = new ArrayList<>();
    }
    this.memberList.add(memberListItem);
    return this;
  }

   /**
   * Get memberList
   * @return memberList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEMBER_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AddGroupMemberResponseAllOfMemberList> getMemberList() {
    return memberList;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberList(List<AddGroupMemberResponseAllOfMemberList> memberList) {
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
    AddGroupMemberResponseAllOf addGroupMemberResponseAllOf = (AddGroupMemberResponseAllOf) o;
    return Objects.equals(this.memberList, addGroupMemberResponseAllOf.memberList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddGroupMemberResponseAllOf {\n");
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

