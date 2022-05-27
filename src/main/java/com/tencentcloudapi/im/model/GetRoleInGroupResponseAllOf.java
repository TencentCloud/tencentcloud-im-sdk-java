
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.GetRoleInGroupResponseAllOfUserIdList;
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
 * GetRoleInGroupResponseAllOf
 */
@JsonPropertyOrder({
  GetRoleInGroupResponseAllOf.JSON_PROPERTY_USER_ID_LIST
})
@JsonTypeName("GetRoleInGroupResponse_allOf")

public class GetRoleInGroupResponseAllOf {
  public static final String JSON_PROPERTY_USER_ID_LIST = "UserIdList";
  private List<GetRoleInGroupResponseAllOfUserIdList> userIdList = null;

  public GetRoleInGroupResponseAllOf() { 
  }

  public GetRoleInGroupResponseAllOf userIdList(List<GetRoleInGroupResponseAllOfUserIdList> userIdList) {
    
    this.userIdList = userIdList;
    return this;
  }

  public GetRoleInGroupResponseAllOf addUserIdListItem(GetRoleInGroupResponseAllOfUserIdList userIdListItem) {
    if (this.userIdList == null) {
      this.userIdList = new ArrayList<>();
    }
    this.userIdList.add(userIdListItem);
    return this;
  }

   /**
   * 拉取到的成员角色，包括：Owner(群主)，Admin(群管理员)，Member(普通群成员），NotMember(非群成员)
   * @return userIdList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "拉取到的成员角色，包括：Owner(群主)，Admin(群管理员)，Member(普通群成员），NotMember(非群成员)")
  @JsonProperty(JSON_PROPERTY_USER_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetRoleInGroupResponseAllOfUserIdList> getUserIdList() {
    return userIdList;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserIdList(List<GetRoleInGroupResponseAllOfUserIdList> userIdList) {
    this.userIdList = userIdList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRoleInGroupResponseAllOf getRoleInGroupResponseAllOf = (GetRoleInGroupResponseAllOf) o;
    return Objects.equals(this.userIdList, getRoleInGroupResponseAllOf.userIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoleInGroupResponseAllOf {\n");
    sb.append("    userIdList: ").append(toIndentedString(userIdList)).append("\n");
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

