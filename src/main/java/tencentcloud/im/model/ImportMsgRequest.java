
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
 * ImportMsgRequest
 */
@JsonPropertyOrder({
  ImportMsgRequest.JSON_PROPERTY_SYNC_FROM_OLD_SYSTEM,
  ImportMsgRequest.JSON_PROPERTY_FROM_ACCOUNT,
  ImportMsgRequest.JSON_PROPERTY_TO_ACCOUNT,
  ImportMsgRequest.JSON_PROPERTY_MSG_SEQ,
  ImportMsgRequest.JSON_PROPERTY_MSG_RANDOM,
  ImportMsgRequest.JSON_PROPERTY_MSG_TIME_STAMP,
  ImportMsgRequest.JSON_PROPERTY_MSG_BODY,
  ImportMsgRequest.JSON_PROPERTY_CLOUD_CUSTOM_DATA
})

public class ImportMsgRequest {
  /**
   * 该字段只能填1或2，其他值是非法值 1表示实时消息导入，消息计入未读计数 2表示历史消息导入，消息不计入未读
   */
  public enum SyncFromOldSystemEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    SyncFromOldSystemEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SyncFromOldSystemEnum fromValue(Integer value) {
      for (SyncFromOldSystemEnum b : SyncFromOldSystemEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SYNC_FROM_OLD_SYSTEM = "SyncFromOldSystem";
  private SyncFromOldSystemEnum syncFromOldSystem;

  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_MSG_SEQ = "MsgSeq";
  private Integer msgSeq;

  public static final String JSON_PROPERTY_MSG_RANDOM = "MsgRandom";
  private Integer msgRandom;

  public static final String JSON_PROPERTY_MSG_TIME_STAMP = "MsgTimeStamp";
  private Integer msgTimeStamp;

  public static final String JSON_PROPERTY_MSG_BODY = "MsgBody";
  private List<TIMMsgElement> msgBody = new ArrayList<>();

  public static final String JSON_PROPERTY_CLOUD_CUSTOM_DATA = "CloudCustomData";
  private String cloudCustomData;

  public ImportMsgRequest() { 
  }

  public ImportMsgRequest syncFromOldSystem(SyncFromOldSystemEnum syncFromOldSystem) {
    
    this.syncFromOldSystem = syncFromOldSystem;
    return this;
  }

   /**
   * 该字段只能填1或2，其他值是非法值 1表示实时消息导入，消息计入未读计数 2表示历史消息导入，消息不计入未读
   * @return syncFromOldSystem
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "该字段只能填1或2，其他值是非法值 1表示实时消息导入，消息计入未读计数 2表示历史消息导入，消息不计入未读")
  @JsonProperty(JSON_PROPERTY_SYNC_FROM_OLD_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SyncFromOldSystemEnum getSyncFromOldSystem() {
    return syncFromOldSystem;
  }


  @JsonProperty(JSON_PROPERTY_SYNC_FROM_OLD_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSyncFromOldSystem(SyncFromOldSystemEnum syncFromOldSystem) {
    this.syncFromOldSystem = syncFromOldSystem;
  }


  public ImportMsgRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 消息发送方 UserID，用于指定发送消息方
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "消息发送方 UserID，用于指定发送消息方")
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


  public ImportMsgRequest toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 消息接收方 UserID
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "消息接收方 UserID")
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


  public ImportMsgRequest msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * 消息序列号（32位无符号整数），后台会根据该字段去重及进行同秒内消息的排序，详细规则请看本接口的功能说明。若不填该字段，则由后台填入随机数
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息序列号（32位无符号整数），后台会根据该字段去重及进行同秒内消息的排序，详细规则请看本接口的功能说明。若不填该字段，则由后台填入随机数")
  @JsonProperty(JSON_PROPERTY_MSG_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMsgSeq() {
    return msgSeq;
  }


  @JsonProperty(JSON_PROPERTY_MSG_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgSeq(Integer msgSeq) {
    this.msgSeq = msgSeq;
  }


  public ImportMsgRequest msgRandom(Integer msgRandom) {
    
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


  public ImportMsgRequest msgTimeStamp(Integer msgTimeStamp) {
    
    this.msgTimeStamp = msgTimeStamp;
    return this;
  }

   /**
   * 消息时间戳，UNIX 时间戳，单位为秒。后台会根据该字段去重，详细规则请看本接口的功能说明。
   * @return msgTimeStamp
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "消息时间戳，UNIX 时间戳，单位为秒。后台会根据该字段去重，详细规则请看本接口的功能说明。")
  @JsonProperty(JSON_PROPERTY_MSG_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMsgTimeStamp() {
    return msgTimeStamp;
  }


  @JsonProperty(JSON_PROPERTY_MSG_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsgTimeStamp(Integer msgTimeStamp) {
    this.msgTimeStamp = msgTimeStamp;
  }


  public ImportMsgRequest msgBody(List<TIMMsgElement> msgBody) {
    
    this.msgBody = msgBody;
    return this;
  }

  public ImportMsgRequest addMsgBodyItem(TIMMsgElement msgBodyItem) {
    this.msgBody.add(msgBodyItem);
    return this;
  }

   /**
   * 消息内容，具体格式请参考（https://cloud.tencent.com/document/product/269/2720）消息格式描述（注意，一条消息可包括多种消息元素，MsgBody 为 Array 类型）
   * @return msgBody
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "消息内容，具体格式请参考（https://cloud.tencent.com/document/product/269/2720）消息格式描述（注意，一条消息可包括多种消息元素，MsgBody 为 Array 类型）")
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


  public ImportMsgRequest cloudCustomData(String cloudCustomData) {
    
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
    ImportMsgRequest importMsgRequest = (ImportMsgRequest) o;
    return Objects.equals(this.syncFromOldSystem, importMsgRequest.syncFromOldSystem) &&
        Objects.equals(this.fromAccount, importMsgRequest.fromAccount) &&
        Objects.equals(this.toAccount, importMsgRequest.toAccount) &&
        Objects.equals(this.msgSeq, importMsgRequest.msgSeq) &&
        Objects.equals(this.msgRandom, importMsgRequest.msgRandom) &&
        Objects.equals(this.msgTimeStamp, importMsgRequest.msgTimeStamp) &&
        Objects.equals(this.msgBody, importMsgRequest.msgBody) &&
        Objects.equals(this.cloudCustomData, importMsgRequest.cloudCustomData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncFromOldSystem, fromAccount, toAccount, msgSeq, msgRandom, msgTimeStamp, msgBody, cloudCustomData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportMsgRequest {\n");
    sb.append("    syncFromOldSystem: ").append(toIndentedString(syncFromOldSystem)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
    sb.append("    msgRandom: ").append(toIndentedString(msgRandom)).append("\n");
    sb.append("    msgTimeStamp: ").append(toIndentedString(msgTimeStamp)).append("\n");
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

