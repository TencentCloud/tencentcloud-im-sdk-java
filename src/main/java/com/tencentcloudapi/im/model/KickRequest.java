
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
 * KickRequest
 */
@JsonPropertyOrder({
  KickRequest.JSON_PROPERTY_USER_I_D
})

public class KickRequest {
  public static final String JSON_PROPERTY_USER_I_D = "UserID";
  private String userID;

  public KickRequest() { 
  }

  public KickRequest userID(String userID) {
    
    this.userID = userID;
    return this;
  }

   /**
   * 用户名
   * @return userID
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "用户名")
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
    KickRequest kickRequest = (KickRequest) o;
    return Objects.equals(this.userID, kickRequest.userID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KickRequest {\n");
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

