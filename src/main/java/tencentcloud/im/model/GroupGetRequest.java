
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
 * GroupGetRequest
 */
@JsonPropertyOrder({
  GroupGetRequest.JSON_PROPERTY_FROM_ACCOUNT,
  GroupGetRequest.JSON_PROPERTY_NEED_FRIEND,
  GroupGetRequest.JSON_PROPERTY_GROUP_NAME
})

public class GroupGetRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_NEED_FRIEND = "NeedFriend";
  private String needFriend;

  public static final String JSON_PROPERTY_GROUP_NAME = "GroupName";
  private List<String> groupName = null;

  public GroupGetRequest() { 
  }

  public GroupGetRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 指定要拉取分组的用户的 UserID
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "指定要拉取分组的用户的 UserID")
  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFromAccount() {
    return fromAccount;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public GroupGetRequest needFriend(String needFriend) {
    
    this.needFriend = needFriend;
    return this;
  }

   /**
   * 是否需要拉取分组下的 User 列表, Need_Friend_Type_Yes： 需要拉取, 不填时默认不拉取, 只有 GroupName 为空时有效
   * @return needFriend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否需要拉取分组下的 User 列表, Need_Friend_Type_Yes： 需要拉取, 不填时默认不拉取, 只有 GroupName 为空时有效")
  @JsonProperty(JSON_PROPERTY_NEED_FRIEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNeedFriend() {
    return needFriend;
  }


  @JsonProperty(JSON_PROPERTY_NEED_FRIEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNeedFriend(String needFriend) {
    this.needFriend = needFriend;
  }


  public GroupGetRequest groupName(List<String> groupName) {
    
    this.groupName = groupName;
    return this;
  }

  public GroupGetRequest addGroupNameItem(String groupNameItem) {
    if (this.groupName == null) {
      this.groupName = new ArrayList<>();
    }
    this.groupName.add(groupNameItem);
    return this;
  }

   /**
   * 要拉取的分组名称
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "要拉取的分组名称")
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getGroupName() {
    return groupName;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupName(List<String> groupName) {
    this.groupName = groupName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupGetRequest groupGetRequest = (GroupGetRequest) o;
    return Objects.equals(this.fromAccount, groupGetRequest.fromAccount) &&
        Objects.equals(this.needFriend, groupGetRequest.needFriend) &&
        Objects.equals(this.groupName, groupGetRequest.groupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, needFriend, groupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupGetRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    needFriend: ").append(toIndentedString(needFriend)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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

