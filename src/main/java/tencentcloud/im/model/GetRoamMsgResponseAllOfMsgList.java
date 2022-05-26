
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
import tencentcloud.im.model.TIMMsgElement;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetRoamMsgResponseAllOfMsgList
 */
@JsonPropertyOrder({
  GetRoamMsgResponseAllOfMsgList.JSON_PROPERTY_FROM_ACCOUNT,
  GetRoamMsgResponseAllOfMsgList.JSON_PROPERTY_TO_ACCOUNT,
  GetRoamMsgResponseAllOfMsgList.JSON_PROPERTY_MSG_RANDOM,
  GetRoamMsgResponseAllOfMsgList.JSON_PROPERTY_MSG_TIME_STAMP,
  GetRoamMsgResponseAllOfMsgList.JSON_PROPERTY_MSG_FLAG_BITS,
  GetRoamMsgResponseAllOfMsgList.JSON_PROPERTY_MSG_KEY,
  GetRoamMsgResponseAllOfMsgList.JSON_PROPERTY_MSG_BODY,
  GetRoamMsgResponseAllOfMsgList.JSON_PROPERTY_CLOUD_CUSTOM_DATA
})
@JsonTypeName("GetRoamMsgResponse_allOf_MsgList")

public class GetRoamMsgResponseAllOfMsgList {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private Integer fromAccount;

  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private Integer toAccount;

  public static final String JSON_PROPERTY_MSG_RANDOM = "MsgRandom";
  private Integer msgRandom;

  public static final String JSON_PROPERTY_MSG_TIME_STAMP = "MsgTimeStamp";
  private Integer msgTimeStamp;

  public static final String JSON_PROPERTY_MSG_FLAG_BITS = "MsgFlagBits";
  private Integer msgFlagBits;

  public static final String JSON_PROPERTY_MSG_KEY = "MsgKey";
  private String msgKey;

  public static final String JSON_PROPERTY_MSG_BODY = "MsgBody";
  private List<TIMMsgElement> msgBody = null;

  public static final String JSON_PROPERTY_CLOUD_CUSTOM_DATA = "CloudCustomData";
  private String cloudCustomData;

  public GetRoamMsgResponseAllOfMsgList() { 
  }

  public GetRoamMsgResponseAllOfMsgList fromAccount(Integer fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 消息发送方 UserID
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息发送方 UserID")
  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFromAccount() {
    return fromAccount;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromAccount(Integer fromAccount) {
    this.fromAccount = fromAccount;
  }


  public GetRoamMsgResponseAllOfMsgList toAccount(Integer toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 消息接收方 UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息接收方 UserID")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAccount(Integer toAccount) {
    this.toAccount = toAccount;
  }


  public GetRoamMsgResponseAllOfMsgList msgRandom(Integer msgRandom) {
    
    this.msgRandom = msgRandom;
    return this;
  }

   /**
   * 消息随机数（32位无符号整数），后台用于同一秒内的消息去重。请确保该字段填的是随机
   * @return msgRandom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息随机数（32位无符号整数），后台用于同一秒内的消息去重。请确保该字段填的是随机")
  @JsonProperty(JSON_PROPERTY_MSG_RANDOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMsgRandom() {
    return msgRandom;
  }


  @JsonProperty(JSON_PROPERTY_MSG_RANDOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgRandom(Integer msgRandom) {
    this.msgRandom = msgRandom;
  }


  public GetRoamMsgResponseAllOfMsgList msgTimeStamp(Integer msgTimeStamp) {
    
    this.msgTimeStamp = msgTimeStamp;
    return this;
  }

   /**
   * 消息时间戳，UNIX 时间戳（单位：秒
   * @return msgTimeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息时间戳，UNIX 时间戳（单位：秒")
  @JsonProperty(JSON_PROPERTY_MSG_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMsgTimeStamp() {
    return msgTimeStamp;
  }


  @JsonProperty(JSON_PROPERTY_MSG_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgTimeStamp(Integer msgTimeStamp) {
    this.msgTimeStamp = msgTimeStamp;
  }


  public GetRoamMsgResponseAllOfMsgList msgFlagBits(Integer msgFlagBits) {
    
    this.msgFlagBits = msgFlagBits;
    return this;
  }

   /**
   * 该条消息的属性，0表示正常消息，8表示被撤回的消息
   * @return msgFlagBits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该条消息的属性，0表示正常消息，8表示被撤回的消息")
  @JsonProperty(JSON_PROPERTY_MSG_FLAG_BITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMsgFlagBits() {
    return msgFlagBits;
  }


  @JsonProperty(JSON_PROPERTY_MSG_FLAG_BITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgFlagBits(Integer msgFlagBits) {
    this.msgFlagBits = msgFlagBits;
  }


  public GetRoamMsgResponseAllOfMsgList msgKey(String msgKey) {
    
    this.msgKey = msgKey;
    return this;
  }

   /**
   * 标识该条消息，可用于 REST API（https://cloud.tencent.com/document/product/269/38980） 撤回单聊消息
   * @return msgKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标识该条消息，可用于 REST API（https://cloud.tencent.com/document/product/269/38980） 撤回单聊消息")
  @JsonProperty(JSON_PROPERTY_MSG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMsgKey() {
    return msgKey;
  }


  @JsonProperty(JSON_PROPERTY_MSG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgKey(String msgKey) {
    this.msgKey = msgKey;
  }


  public GetRoamMsgResponseAllOfMsgList msgBody(List<TIMMsgElement> msgBody) {
    
    this.msgBody = msgBody;
    return this;
  }

  public GetRoamMsgResponseAllOfMsgList addMsgBodyItem(TIMMsgElement msgBodyItem) {
    if (this.msgBody == null) {
      this.msgBody = new ArrayList<>();
    }
    this.msgBody.add(msgBodyItem);
    return this;
  }

   /**
   * 消息内容
   * @return msgBody
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "消息内容")
  @JsonProperty(JSON_PROPERTY_MSG_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TIMMsgElement> getMsgBody() {
    return msgBody;
  }


  @JsonProperty(JSON_PROPERTY_MSG_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgBody(List<TIMMsgElement> msgBody) {
    this.msgBody = msgBody;
  }


  public GetRoamMsgResponseAllOfMsgList cloudCustomData(String cloudCustomData) {
    
    this.cloudCustomData = cloudCustomData;
    return this;
  }

   /**
   * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
   * @return cloudCustomData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）")
  @JsonProperty(JSON_PROPERTY_CLOUD_CUSTOM_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudCustomData() {
    return cloudCustomData;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_CUSTOM_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudCustomData(String cloudCustomData) {
    this.cloudCustomData = cloudCustomData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRoamMsgResponseAllOfMsgList getRoamMsgResponseAllOfMsgList = (GetRoamMsgResponseAllOfMsgList) o;
    return Objects.equals(this.fromAccount, getRoamMsgResponseAllOfMsgList.fromAccount) &&
        Objects.equals(this.toAccount, getRoamMsgResponseAllOfMsgList.toAccount) &&
        Objects.equals(this.msgRandom, getRoamMsgResponseAllOfMsgList.msgRandom) &&
        Objects.equals(this.msgTimeStamp, getRoamMsgResponseAllOfMsgList.msgTimeStamp) &&
        Objects.equals(this.msgFlagBits, getRoamMsgResponseAllOfMsgList.msgFlagBits) &&
        Objects.equals(this.msgKey, getRoamMsgResponseAllOfMsgList.msgKey) &&
        Objects.equals(this.msgBody, getRoamMsgResponseAllOfMsgList.msgBody) &&
        Objects.equals(this.cloudCustomData, getRoamMsgResponseAllOfMsgList.cloudCustomData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, toAccount, msgRandom, msgTimeStamp, msgFlagBits, msgKey, msgBody, cloudCustomData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoamMsgResponseAllOfMsgList {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    msgRandom: ").append(toIndentedString(msgRandom)).append("\n");
    sb.append("    msgTimeStamp: ").append(toIndentedString(msgTimeStamp)).append("\n");
    sb.append("    msgFlagBits: ").append(toIndentedString(msgFlagBits)).append("\n");
    sb.append("    msgKey: ").append(toIndentedString(msgKey)).append("\n");
    sb.append("    msgBody: ").append(toIndentedString(msgBody)).append("\n");
    sb.append("    cloudCustomData: ").append(toIndentedString(cloudCustomData)).append("\n");
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

