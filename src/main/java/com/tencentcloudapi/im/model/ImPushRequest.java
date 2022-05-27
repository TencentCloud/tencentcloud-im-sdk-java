
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.ImPushRequestConditionInner;
import com.tencentcloudapi.im.model.OfflinePushInfo;
import com.tencentcloudapi.im.model.TIMMsgElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ImPushRequest
 */
@JsonPropertyOrder({
  ImPushRequest.JSON_PROPERTY_CONDITION,
  ImPushRequest.JSON_PROPERTY_MSG_RANDOM,
  ImPushRequest.JSON_PROPERTY_MSG_BODY,
  ImPushRequest.JSON_PROPERTY_MSG_LIFE_TIME,
  ImPushRequest.JSON_PROPERTY_FROM_ACCOUNT,
  ImPushRequest.JSON_PROPERTY_OFFLINE_PUSH_INFO
})

public class ImPushRequest {
  public static final String JSON_PROPERTY_CONDITION = "Condition";
  private List<ImPushRequestConditionInner> condition = null;

  public static final String JSON_PROPERTY_MSG_RANDOM = "MsgRandom";
  private Integer msgRandom;

  public static final String JSON_PROPERTY_MSG_BODY = "MsgBody";
  private List<TIMMsgElement> msgBody = new ArrayList<>();

  public static final String JSON_PROPERTY_MSG_LIFE_TIME = "MsgLifeTime";
  private Integer msgLifeTime;

  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_OFFLINE_PUSH_INFO = "OfflinePushInfo";
  private OfflinePushInfo offlinePushInfo;

  public ImPushRequest() { 
  }

  public ImPushRequest condition(List<ImPushRequestConditionInner> condition) {
    
    this.condition = condition;
    return this;
  }

  public ImPushRequest addConditionItem(ImPushRequestConditionInner conditionItem) {
    if (this.condition == null) {
      this.condition = new ArrayList<>();
    }
    this.condition.add(conditionItem);
    return this;
  }

   /**
   * Condition 共有4种条件类型，分别是：属性的或条件 AttrsOr、属性的与条件 AttrsAnd、标签的或条件 TagsOr、标签的与条件 TagsAnd。AttrsOr 和 AttrsAnd 可以并存，TagsOr 和 TagsAnd 也可以并存。但是标签和属性条件不能并存。如果没有 Condition，则推送给全部用户
   * @return condition
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "Condition 共有4种条件类型，分别是：属性的或条件 AttrsOr、属性的与条件 AttrsAnd、标签的或条件 TagsOr、标签的与条件 TagsAnd。AttrsOr 和 AttrsAnd 可以并存，TagsOr 和 TagsAnd 也可以并存。但是标签和属性条件不能并存。如果没有 Condition，则推送给全部用户")
  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ImPushRequestConditionInner> getCondition() {
    return condition;
  }


  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCondition(List<ImPushRequestConditionInner> condition) {
    this.condition = condition;
  }


  public ImPushRequest msgRandom(Integer msgRandom) {
    
    this.msgRandom = msgRandom;
    return this;
  }

   /**
   * 消息随机数（32位无符号整数），后台用于同一秒内的消息去重。请确保该字段填的是随机
   * @return msgRandom
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "消息随机数（32位无符号整数），后台用于同一秒内的消息去重。请确保该字段填的是随机")
  @JsonProperty(JSON_PROPERTY_MSG_RANDOM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMsgRandom() {
    return msgRandom;
  }


  @JsonProperty(JSON_PROPERTY_MSG_RANDOM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsgRandom(Integer msgRandom) {
    this.msgRandom = msgRandom;
  }


  public ImPushRequest msgBody(List<TIMMsgElement> msgBody) {
    
    this.msgBody = msgBody;
    return this;
  }

  public ImPushRequest addMsgBodyItem(TIMMsgElement msgBodyItem) {
    this.msgBody.add(msgBodyItem);
    return this;
  }

   /**
   * Get msgBody
   * @return msgBody
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MSG_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TIMMsgElement> getMsgBody() {
    return msgBody;
  }


  @JsonProperty(JSON_PROPERTY_MSG_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsgBody(List<TIMMsgElement> msgBody) {
    this.msgBody = msgBody;
  }


  public ImPushRequest msgLifeTime(Integer msgLifeTime) {
    
    this.msgLifeTime = msgLifeTime;
    return this;
  }

   /**
   * 消息离线存储时间，单位秒，最多保存7天（604800秒）。默认为0，表示不离线存储，即只推在线用户
   * maximum: 604800
   * @return msgLifeTime
  **/
  @javax.annotation.Nullable
 @Max(604800)  @ApiModelProperty(value = "消息离线存储时间，单位秒，最多保存7天（604800秒）。默认为0，表示不离线存储，即只推在线用户")
  @JsonProperty(JSON_PROPERTY_MSG_LIFE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMsgLifeTime() {
    return msgLifeTime;
  }


  @JsonProperty(JSON_PROPERTY_MSG_LIFE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgLifeTime(Integer msgLifeTime) {
    this.msgLifeTime = msgLifeTime;
  }


  public ImPushRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 消息推送方帐号
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息推送方帐号")
  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromAccount() {
    return fromAccount;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public ImPushRequest offlinePushInfo(OfflinePushInfo offlinePushInfo) {
    
    this.offlinePushInfo = offlinePushInfo;
    return this;
  }

   /**
   * Get offlinePushInfo
   * @return offlinePushInfo
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OFFLINE_PUSH_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OfflinePushInfo getOfflinePushInfo() {
    return offlinePushInfo;
  }


  @JsonProperty(JSON_PROPERTY_OFFLINE_PUSH_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOfflinePushInfo(OfflinePushInfo offlinePushInfo) {
    this.offlinePushInfo = offlinePushInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImPushRequest imPushRequest = (ImPushRequest) o;
    return Objects.equals(this.condition, imPushRequest.condition) &&
        Objects.equals(this.msgRandom, imPushRequest.msgRandom) &&
        Objects.equals(this.msgBody, imPushRequest.msgBody) &&
        Objects.equals(this.msgLifeTime, imPushRequest.msgLifeTime) &&
        Objects.equals(this.fromAccount, imPushRequest.fromAccount) &&
        Objects.equals(this.offlinePushInfo, imPushRequest.offlinePushInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, msgRandom, msgBody, msgLifeTime, fromAccount, offlinePushInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImPushRequest {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    msgRandom: ").append(toIndentedString(msgRandom)).append("\n");
    sb.append("    msgBody: ").append(toIndentedString(msgBody)).append("\n");
    sb.append("    msgLifeTime: ").append(toIndentedString(msgLifeTime)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    offlinePushInfo: ").append(toIndentedString(offlinePushInfo)).append("\n");
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

