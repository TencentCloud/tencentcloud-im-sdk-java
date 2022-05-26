
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
 * GetRoleInGroupRequest
 */
@JsonPropertyOrder({
  GetRoleInGroupRequest.JSON_PROPERTY_GROUP_ID,
  GetRoleInGroupRequest.JSON_PROPERTY_USER_ACCOUNT
})

public class GetRoleInGroupRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_USER_ACCOUNT = "User_Account";
  private List<String> userAccount = new ArrayList<>();

  public GetRoleInGroupRequest() { 
  }

  public GetRoleInGroupRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 需要查询的群组 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要查询的群组 ID")
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


  public GetRoleInGroupRequest userAccount(List<String> userAccount) {
    
    this.userAccount = userAccount;
    return this;
  }

  public GetRoleInGroupRequest addUserAccountItem(String userAccountItem) {
    this.userAccount.add(userAccountItem);
    return this;
  }

   /**
   * 表示需要查询的用户帐号，最多支持500个帐号
   * @return userAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
 @Size(max=500)  @ApiModelProperty(required = true, value = "表示需要查询的用户帐号，最多支持500个帐号")
  @JsonProperty(JSON_PROPERTY_USER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getUserAccount() {
    return userAccount;
  }


  @JsonProperty(JSON_PROPERTY_USER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserAccount(List<String> userAccount) {
    this.userAccount = userAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRoleInGroupRequest getRoleInGroupRequest = (GetRoleInGroupRequest) o;
    return Objects.equals(this.groupId, getRoleInGroupRequest.groupId) &&
        Objects.equals(this.userAccount, getRoleInGroupRequest.userAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, userAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoleInGroupRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    userAccount: ").append(toIndentedString(userAccount)).append("\n");
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

