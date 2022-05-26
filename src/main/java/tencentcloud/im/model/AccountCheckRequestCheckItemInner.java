
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * AccountCheckRequestCheckItemInner
 */
@JsonPropertyOrder({
  AccountCheckRequestCheckItemInner.JSON_PROPERTY_USER_I_D
})
@JsonTypeName("AccountCheckRequest_CheckItem_inner")

public class AccountCheckRequestCheckItemInner {
  public static final String JSON_PROPERTY_USER_I_D = "UserID";
  private String userID;

  public AccountCheckRequestCheckItemInner() { 
  }

  public AccountCheckRequestCheckItemInner userID(String userID) {
    
    this.userID = userID;
    return this;
  }

   /**
   * 请求检查的帐号的 UserID
   * @return userID
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "请求检查的帐号的 UserID")
  @JsonProperty(JSON_PROPERTY_USER_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserID() {
    return userID;
  }


  @JsonProperty(JSON_PROPERTY_USER_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserID(String userID) {
    this.userID = userID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCheckRequestCheckItemInner accountCheckRequestCheckItemInner = (AccountCheckRequestCheckItemInner) o;
    return Objects.equals(this.userID, accountCheckRequestCheckItemInner.userID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCheckRequestCheckItemInner {\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
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

