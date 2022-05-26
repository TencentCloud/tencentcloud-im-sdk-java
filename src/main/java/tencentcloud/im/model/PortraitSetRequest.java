
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
import tencentcloud.im.model.PortraitSetRequestProfileItemInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * PortraitSetRequest
 */
@JsonPropertyOrder({
  PortraitSetRequest.JSON_PROPERTY_FROM_ACCOUNT,
  PortraitSetRequest.JSON_PROPERTY_PROFILE_ITEM
})

public class PortraitSetRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_PROFILE_ITEM = "ProfileItem";
  private List<PortraitSetRequestProfileItemInner> profileItem = new ArrayList<>();

  public PortraitSetRequest() { 
  }

  public PortraitSetRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 消息发送方 UserID
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "消息发送方 UserID")
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


  public PortraitSetRequest profileItem(List<PortraitSetRequestProfileItemInner> profileItem) {
    
    this.profileItem = profileItem;
    return this;
  }

  public PortraitSetRequest addProfileItemItem(PortraitSetRequestProfileItemInner profileItemItem) {
    this.profileItem.add(profileItemItem);
    return this;
  }

   /**
   * 待设置的用户的资料对象数组，数组中每一个对象都包含了 Tag 和 Value
   * @return profileItem
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "待设置的用户的资料对象数组，数组中每一个对象都包含了 Tag 和 Value")
  @JsonProperty(JSON_PROPERTY_PROFILE_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<PortraitSetRequestProfileItemInner> getProfileItem() {
    return profileItem;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProfileItem(List<PortraitSetRequestProfileItemInner> profileItem) {
    this.profileItem = profileItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortraitSetRequest portraitSetRequest = (PortraitSetRequest) o;
    return Objects.equals(this.fromAccount, portraitSetRequest.fromAccount) &&
        Objects.equals(this.profileItem, portraitSetRequest.profileItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, profileItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortraitSetRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    profileItem: ").append(toIndentedString(profileItem)).append("\n");
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

