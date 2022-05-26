
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
import tencentcloud.im.model.FriendUpdateRequestUpdateItemInnerSnsItemInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * FriendUpdateRequestUpdateItemInner
 */
@JsonPropertyOrder({
  FriendUpdateRequestUpdateItemInner.JSON_PROPERTY_TO_ACCOUNT,
  FriendUpdateRequestUpdateItemInner.JSON_PROPERTY_SNS_ITEM
})
@JsonTypeName("FriendUpdateRequest_UpdateItem_inner")

public class FriendUpdateRequestUpdateItemInner {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_SNS_ITEM = "SnsItem";
  private List<FriendUpdateRequestUpdateItemInnerSnsItemInner> snsItem = new ArrayList<>();

  public FriendUpdateRequestUpdateItemInner() { 
  }

  public FriendUpdateRequestUpdateItemInner toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 好友的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "好友的 UserID")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public FriendUpdateRequestUpdateItemInner snsItem(List<FriendUpdateRequestUpdateItemInnerSnsItemInner> snsItem) {
    
    this.snsItem = snsItem;
    return this;
  }

  public FriendUpdateRequestUpdateItemInner addSnsItemItem(FriendUpdateRequestUpdateItemInnerSnsItemInner snsItemItem) {
    this.snsItem.add(snsItemItem);
    return this;
  }

   /**
   * 需要更新的关系链数据对象数组
   * @return snsItem
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "需要更新的关系链数据对象数组")
  @JsonProperty(JSON_PROPERTY_SNS_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<FriendUpdateRequestUpdateItemInnerSnsItemInner> getSnsItem() {
    return snsItem;
  }


  @JsonProperty(JSON_PROPERTY_SNS_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSnsItem(List<FriendUpdateRequestUpdateItemInnerSnsItemInner> snsItem) {
    this.snsItem = snsItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendUpdateRequestUpdateItemInner friendUpdateRequestUpdateItemInner = (FriendUpdateRequestUpdateItemInner) o;
    return Objects.equals(this.toAccount, friendUpdateRequestUpdateItemInner.toAccount) &&
        Objects.equals(this.snsItem, friendUpdateRequestUpdateItemInner.snsItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, snsItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendUpdateRequestUpdateItemInner {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    snsItem: ").append(toIndentedString(snsItem)).append("\n");
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

