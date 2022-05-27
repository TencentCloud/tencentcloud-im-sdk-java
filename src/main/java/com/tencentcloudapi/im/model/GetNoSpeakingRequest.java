
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
 * GetNoSpeakingRequest
 */
@JsonPropertyOrder({
  GetNoSpeakingRequest.JSON_PROPERTY_GET_ACCOUNT
})

public class GetNoSpeakingRequest {
  public static final String JSON_PROPERTY_GET_ACCOUNT = "Get_Account";
  private String getAccount;

  public GetNoSpeakingRequest() { 
  }

  public GetNoSpeakingRequest getAccount(String getAccount) {
    
    this.getAccount = getAccount;
    return this;
  }

   /**
   * 查询禁言信息的帐号
   * @return getAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "查询禁言信息的帐号")
  @JsonProperty(JSON_PROPERTY_GET_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGetAccount() {
    return getAccount;
  }


  @JsonProperty(JSON_PROPERTY_GET_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGetAccount(String getAccount) {
    this.getAccount = getAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetNoSpeakingRequest getNoSpeakingRequest = (GetNoSpeakingRequest) o;
    return Objects.equals(this.getAccount, getNoSpeakingRequest.getAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNoSpeakingRequest {\n");
    sb.append("    getAccount: ").append(toIndentedString(getAccount)).append("\n");
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

