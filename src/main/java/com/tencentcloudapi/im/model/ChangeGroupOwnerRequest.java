
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
 * ChangeGroupOwnerRequest
 */
@JsonPropertyOrder({
  ChangeGroupOwnerRequest.JSON_PROPERTY_GROUP_ID,
  ChangeGroupOwnerRequest.JSON_PROPERTY_NEW_OWNER_ACCOUNT
})

public class ChangeGroupOwnerRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_NEW_OWNER_ACCOUNT = "NewOwner_Account";
  private String newOwnerAccount;

  public ChangeGroupOwnerRequest() { 
  }

  public ChangeGroupOwnerRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 要被转移的群组 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "要被转移的群组 ID")
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


  public ChangeGroupOwnerRequest newOwnerAccount(String newOwnerAccount) {
    
    this.newOwnerAccount = newOwnerAccount;
    return this;
  }

   /**
   * 新群主 ID
   * @return newOwnerAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "新群主 ID")
  @JsonProperty(JSON_PROPERTY_NEW_OWNER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNewOwnerAccount() {
    return newOwnerAccount;
  }


  @JsonProperty(JSON_PROPERTY_NEW_OWNER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNewOwnerAccount(String newOwnerAccount) {
    this.newOwnerAccount = newOwnerAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeGroupOwnerRequest changeGroupOwnerRequest = (ChangeGroupOwnerRequest) o;
    return Objects.equals(this.groupId, changeGroupOwnerRequest.groupId) &&
        Objects.equals(this.newOwnerAccount, changeGroupOwnerRequest.newOwnerAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, newOwnerAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeGroupOwnerRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    newOwnerAccount: ").append(toIndentedString(newOwnerAccount)).append("\n");
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

