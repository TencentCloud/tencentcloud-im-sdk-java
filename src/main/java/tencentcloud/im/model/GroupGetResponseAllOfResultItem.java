
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
 * GroupGetResponseAllOfResultItem
 */
@JsonPropertyOrder({
  GroupGetResponseAllOfResultItem.JSON_PROPERTY_GROUP_NAME,
  GroupGetResponseAllOfResultItem.JSON_PROPERTY_FRIEND_NUMBER,
  GroupGetResponseAllOfResultItem.JSON_PROPERTY_TO_ACCOUNT
})
@JsonTypeName("GroupGetResponse_allOf_ResultItem")

public class GroupGetResponseAllOfResultItem {
  public static final String JSON_PROPERTY_GROUP_NAME = "GroupName";
  private String groupName;

  public static final String JSON_PROPERTY_FRIEND_NUMBER = "FriendNumber";
  private Integer friendNumber;

  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private List<String> toAccount = null;

  public GroupGetResponseAllOfResultItem() { 
  }

  public GroupGetResponseAllOfResultItem groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * 分组名
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分组名")
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupName() {
    return groupName;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public GroupGetResponseAllOfResultItem friendNumber(Integer friendNumber) {
    
    this.friendNumber = friendNumber;
    return this;
  }

   /**
   * 该分组下的好友数量
   * @return friendNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该分组下的好友数量")
  @JsonProperty(JSON_PROPERTY_FRIEND_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFriendNumber() {
    return friendNumber;
  }


  @JsonProperty(JSON_PROPERTY_FRIEND_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFriendNumber(Integer friendNumber) {
    this.friendNumber = friendNumber;
  }


  public GroupGetResponseAllOfResultItem toAccount(List<String> toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

  public GroupGetResponseAllOfResultItem addToAccountItem(String toAccountItem) {
    if (this.toAccount == null) {
      this.toAccount = new ArrayList<>();
    }
    this.toAccount.add(toAccountItem);
    return this;
  }

   /**
   * 该分组下的好友的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该分组下的好友的 UserID")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAccount(List<String> toAccount) {
    this.toAccount = toAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupGetResponseAllOfResultItem groupGetResponseAllOfResultItem = (GroupGetResponseAllOfResultItem) o;
    return Objects.equals(this.groupName, groupGetResponseAllOfResultItem.groupName) &&
        Objects.equals(this.friendNumber, groupGetResponseAllOfResultItem.friendNumber) &&
        Objects.equals(this.toAccount, groupGetResponseAllOfResultItem.toAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, friendNumber, toAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupGetResponseAllOfResultItem {\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    friendNumber: ").append(toIndentedString(friendNumber)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
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

