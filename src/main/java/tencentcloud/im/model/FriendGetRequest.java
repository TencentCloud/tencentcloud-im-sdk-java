
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
 * FriendGetRequest
 */
@JsonPropertyOrder({
  FriendGetRequest.JSON_PROPERTY_FROM_ACCOUNT,
  FriendGetRequest.JSON_PROPERTY_START_INDEX,
  FriendGetRequest.JSON_PROPERTY_STANDARD_SEQUENCE,
  FriendGetRequest.JSON_PROPERTY_CUSTOM_SEQUENCE
})

public class FriendGetRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_START_INDEX = "StartIndex";
  private Integer startIndex;

  public static final String JSON_PROPERTY_STANDARD_SEQUENCE = "StandardSequence";
  private Integer standardSequence;

  public static final String JSON_PROPERTY_CUSTOM_SEQUENCE = "CustomSequence";
  private Integer customSequence;

  public FriendGetRequest() { 
  }

  public FriendGetRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 指定要拉取好友数据的用户的 UserID
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "指定要拉取好友数据的用户的 UserID")
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


  public FriendGetRequest startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * 分页的起始位置
   * @return startIndex
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "分页的起始位置")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public FriendGetRequest standardSequence(Integer standardSequence) {
    
    this.standardSequence = standardSequence;
    return this;
  }

   /**
   * 上次拉好友数据时返回的 StandardSequence，如果 StandardSequence 字段的值与后台一致，后台不会返回标配好友数据
   * @return standardSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上次拉好友数据时返回的 StandardSequence，如果 StandardSequence 字段的值与后台一致，后台不会返回标配好友数据")
  @JsonProperty(JSON_PROPERTY_STANDARD_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStandardSequence() {
    return standardSequence;
  }


  @JsonProperty(JSON_PROPERTY_STANDARD_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStandardSequence(Integer standardSequence) {
    this.standardSequence = standardSequence;
  }


  public FriendGetRequest customSequence(Integer customSequence) {
    
    this.customSequence = customSequence;
    return this;
  }

   /**
   * 上次拉好友数据时返回的 CustomSequence，如果 CustomSequence 字段的值与后台一致，后台不会返回自定义好友数据
   * @return customSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上次拉好友数据时返回的 CustomSequence，如果 CustomSequence 字段的值与后台一致，后台不会返回自定义好友数据")
  @JsonProperty(JSON_PROPERTY_CUSTOM_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCustomSequence() {
    return customSequence;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomSequence(Integer customSequence) {
    this.customSequence = customSequence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendGetRequest friendGetRequest = (FriendGetRequest) o;
    return Objects.equals(this.fromAccount, friendGetRequest.fromAccount) &&
        Objects.equals(this.startIndex, friendGetRequest.startIndex) &&
        Objects.equals(this.standardSequence, friendGetRequest.standardSequence) &&
        Objects.equals(this.customSequence, friendGetRequest.customSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, startIndex, standardSequence, customSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendGetRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    standardSequence: ").append(toIndentedString(standardSequence)).append("\n");
    sb.append("    customSequence: ").append(toIndentedString(customSequence)).append("\n");
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

