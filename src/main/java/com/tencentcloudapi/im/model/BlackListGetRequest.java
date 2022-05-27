
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
 * BlackListGetRequest
 */
@JsonPropertyOrder({
  BlackListGetRequest.JSON_PROPERTY_FROM_ACCOUNT,
  BlackListGetRequest.JSON_PROPERTY_START_INDEX,
  BlackListGetRequest.JSON_PROPERTY_MAX_LIMITED,
  BlackListGetRequest.JSON_PROPERTY_LAST_SEQUENCE
})

public class BlackListGetRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_START_INDEX = "StartIndex";
  private Integer startIndex;

  public static final String JSON_PROPERTY_MAX_LIMITED = "MaxLimited";
  private Integer maxLimited;

  public static final String JSON_PROPERTY_LAST_SEQUENCE = "LastSequence";
  private Integer lastSequence;

  public BlackListGetRequest() { 
  }

  public BlackListGetRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 需要拉取该 UserID 的黑名单
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要拉取该 UserID 的黑名单")
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


  public BlackListGetRequest startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * 拉取的起始位置
   * @return startIndex
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "拉取的起始位置")
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


  public BlackListGetRequest maxLimited(Integer maxLimited) {
    
    this.maxLimited = maxLimited;
    return this;
  }

   /**
   * 每页最多拉取的黑名单数
   * @return maxLimited
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "每页最多拉取的黑名单数")
  @JsonProperty(JSON_PROPERTY_MAX_LIMITED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMaxLimited() {
    return maxLimited;
  }


  @JsonProperty(JSON_PROPERTY_MAX_LIMITED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxLimited(Integer maxLimited) {
    this.maxLimited = maxLimited;
  }


  public BlackListGetRequest lastSequence(Integer lastSequence) {
    
    this.lastSequence = lastSequence;
    return this;
  }

   /**
   * 上一次拉黑名单时后台返回给客户端的 Seq，初次拉取时为0
   * @return lastSequence
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "上一次拉黑名单时后台返回给客户端的 Seq，初次拉取时为0")
  @JsonProperty(JSON_PROPERTY_LAST_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLastSequence() {
    return lastSequence;
  }


  @JsonProperty(JSON_PROPERTY_LAST_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastSequence(Integer lastSequence) {
    this.lastSequence = lastSequence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlackListGetRequest blackListGetRequest = (BlackListGetRequest) o;
    return Objects.equals(this.fromAccount, blackListGetRequest.fromAccount) &&
        Objects.equals(this.startIndex, blackListGetRequest.startIndex) &&
        Objects.equals(this.maxLimited, blackListGetRequest.maxLimited) &&
        Objects.equals(this.lastSequence, blackListGetRequest.lastSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, startIndex, maxLimited, lastSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlackListGetRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    maxLimited: ").append(toIndentedString(maxLimited)).append("\n");
    sb.append("    lastSequence: ").append(toIndentedString(lastSequence)).append("\n");
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

