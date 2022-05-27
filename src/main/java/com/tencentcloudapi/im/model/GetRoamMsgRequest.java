
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
 * GetRoamMsgRequest
 */
@JsonPropertyOrder({
  GetRoamMsgRequest.JSON_PROPERTY_FROM_ACCOUNT,
  GetRoamMsgRequest.JSON_PROPERTY_TO_ACCOUNT,
  GetRoamMsgRequest.JSON_PROPERTY_MAX_CNT,
  GetRoamMsgRequest.JSON_PROPERTY_MIN_TIME,
  GetRoamMsgRequest.JSON_PROPERTY_MAX_TIME,
  GetRoamMsgRequest.JSON_PROPERTY_LAST_MSG_KEY
})

public class GetRoamMsgRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_MAX_CNT = "MaxCnt";
  private Integer maxCnt;

  public static final String JSON_PROPERTY_MIN_TIME = "MinTime";
  private Integer minTime;

  public static final String JSON_PROPERTY_MAX_TIME = "MaxTime";
  private Integer maxTime;

  public static final String JSON_PROPERTY_LAST_MSG_KEY = "LastMsgKey";
  private String lastMsgKey;

  public GetRoamMsgRequest() { 
  }

  public GetRoamMsgRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 会话其中一方的 UserID，若已指定发送消息方帐号，则为消息发送方
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "会话其中一方的 UserID，若已指定发送消息方帐号，则为消息发送方")
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


  public GetRoamMsgRequest toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 会话其中一方的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "会话其中一方的 UserID")
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


  public GetRoamMsgRequest maxCnt(Integer maxCnt) {
    
    this.maxCnt = maxCnt;
    return this;
  }

   /**
   * 请求的消息条数
   * @return maxCnt
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "请求的消息条数")
  @JsonProperty(JSON_PROPERTY_MAX_CNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMaxCnt() {
    return maxCnt;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxCnt(Integer maxCnt) {
    this.maxCnt = maxCnt;
  }


  public GetRoamMsgRequest minTime(Integer minTime) {
    
    this.minTime = minTime;
    return this;
  }

   /**
   * 请求的消息时间范围的最小值
   * @return minTime
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "请求的消息时间范围的最小值")
  @JsonProperty(JSON_PROPERTY_MIN_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMinTime() {
    return minTime;
  }


  @JsonProperty(JSON_PROPERTY_MIN_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinTime(Integer minTime) {
    this.minTime = minTime;
  }


  public GetRoamMsgRequest maxTime(Integer maxTime) {
    
    this.maxTime = maxTime;
    return this;
  }

   /**
   * 请求的消息时间范围的最大值
   * @return maxTime
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "请求的消息时间范围的最大值")
  @JsonProperty(JSON_PROPERTY_MAX_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMaxTime() {
    return maxTime;
  }


  @JsonProperty(JSON_PROPERTY_MAX_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxTime(Integer maxTime) {
    this.maxTime = maxTime;
  }


  public GetRoamMsgRequest lastMsgKey(String lastMsgKey) {
    
    this.lastMsgKey = lastMsgKey;
    return this;
  }

   /**
   * 上一次拉取到的最后一条消息的 MsgKey，续拉时需要填该字段,填写方法见示例（https://cloud.tencent.com/document/product/269/42794）
   * @return lastMsgKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上一次拉取到的最后一条消息的 MsgKey，续拉时需要填该字段,填写方法见示例（https://cloud.tencent.com/document/product/269/42794）")
  @JsonProperty(JSON_PROPERTY_LAST_MSG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastMsgKey() {
    return lastMsgKey;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MSG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastMsgKey(String lastMsgKey) {
    this.lastMsgKey = lastMsgKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRoamMsgRequest getRoamMsgRequest = (GetRoamMsgRequest) o;
    return Objects.equals(this.fromAccount, getRoamMsgRequest.fromAccount) &&
        Objects.equals(this.toAccount, getRoamMsgRequest.toAccount) &&
        Objects.equals(this.maxCnt, getRoamMsgRequest.maxCnt) &&
        Objects.equals(this.minTime, getRoamMsgRequest.minTime) &&
        Objects.equals(this.maxTime, getRoamMsgRequest.maxTime) &&
        Objects.equals(this.lastMsgKey, getRoamMsgRequest.lastMsgKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, toAccount, maxCnt, minTime, maxTime, lastMsgKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoamMsgRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    maxCnt: ").append(toIndentedString(maxCnt)).append("\n");
    sb.append("    minTime: ").append(toIndentedString(minTime)).append("\n");
    sb.append("    maxTime: ").append(toIndentedString(maxTime)).append("\n");
    sb.append("    lastMsgKey: ").append(toIndentedString(lastMsgKey)).append("\n");
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

