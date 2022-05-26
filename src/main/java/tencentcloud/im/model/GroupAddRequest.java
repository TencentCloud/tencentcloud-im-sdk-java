
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
 * GroupAddRequest
 */
@JsonPropertyOrder({
  GroupAddRequest.JSON_PROPERTY_FROM_ACCOUNT,
  GroupAddRequest.JSON_PROPERTY_TO_ACCOUNT,
  GroupAddRequest.JSON_PROPERTY_GROUP_NAME
})

public class GroupAddRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private List<String> toAccount = null;

  public static final String JSON_PROPERTY_GROUP_NAME = "GroupName";
  private List<String> groupName = new ArrayList<>();

  public GroupAddRequest() { 
  }

  public GroupAddRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 需要为该 UserID 添加新分组
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要为该 UserID 添加新分组")
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


  public GroupAddRequest toAccount(List<String> toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

  public GroupAddRequest addToAccountItem(String toAccountItem) {
    if (this.toAccount == null) {
      this.toAccount = new ArrayList<>();
    }
    this.toAccount.add(toAccountItem);
    return this;
  }

   /**
   * 需要加入新增分组的好友的 UserID 列表
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "需要加入新增分组的好友的 UserID 列表")
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


  public GroupAddRequest groupName(List<String> groupName) {
    
    this.groupName = groupName;
    return this;
  }

  public GroupAddRequest addGroupNameItem(String groupNameItem) {
    this.groupName.add(groupNameItem);
    return this;
  }

   /**
   * 新增分组列表
   * @return groupName
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "新增分组列表")
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getGroupName() {
    return groupName;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    GroupAddRequest groupAddRequest = (GroupAddRequest) o;
    return Objects.equals(this.fromAccount, groupAddRequest.fromAccount) &&
        Objects.equals(this.toAccount, groupAddRequest.toAccount) &&
        Objects.equals(this.groupName, groupAddRequest.groupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, toAccount, groupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupAddRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
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

