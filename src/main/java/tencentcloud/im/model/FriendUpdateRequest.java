
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
import tencentcloud.im.model.FriendUpdateRequestUpdateItemInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * FriendUpdateRequest
 */
@JsonPropertyOrder({
  FriendUpdateRequest.JSON_PROPERTY_FROM_ACCOUNT,
  FriendUpdateRequest.JSON_PROPERTY_UPDATE_ITEM
})

public class FriendUpdateRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_UPDATE_ITEM = "UpdateItem";
  private List<FriendUpdateRequestUpdateItemInner> updateItem = new ArrayList<>();

  public FriendUpdateRequest() { 
  }

  public FriendUpdateRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 需要更新该 UserID 的关系链数据
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要更新该 UserID 的关系链数据")
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


  public FriendUpdateRequest updateItem(List<FriendUpdateRequestUpdateItemInner> updateItem) {
    
    this.updateItem = updateItem;
    return this;
  }

  public FriendUpdateRequest addUpdateItemItem(FriendUpdateRequestUpdateItemInner updateItemItem) {
    this.updateItem.add(updateItemItem);
    return this;
  }

   /**
   * 需要更新的好友对象数组
   * @return updateItem
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "需要更新的好友对象数组")
  @JsonProperty(JSON_PROPERTY_UPDATE_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<FriendUpdateRequestUpdateItemInner> getUpdateItem() {
    return updateItem;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdateItem(List<FriendUpdateRequestUpdateItemInner> updateItem) {
    this.updateItem = updateItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendUpdateRequest friendUpdateRequest = (FriendUpdateRequest) o;
    return Objects.equals(this.fromAccount, friendUpdateRequest.fromAccount) &&
        Objects.equals(this.updateItem, friendUpdateRequest.updateItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, updateItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendUpdateRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    updateItem: ").append(toIndentedString(updateItem)).append("\n");
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

