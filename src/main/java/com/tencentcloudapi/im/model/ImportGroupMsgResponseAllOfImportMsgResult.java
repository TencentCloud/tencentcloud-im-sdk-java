
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
 * ImportGroupMsgResponseAllOfImportMsgResult
 */
@JsonPropertyOrder({
  ImportGroupMsgResponseAllOfImportMsgResult.JSON_PROPERTY_RESULT,
  ImportGroupMsgResponseAllOfImportMsgResult.JSON_PROPERTY_MSG_TIME,
  ImportGroupMsgResponseAllOfImportMsgResult.JSON_PROPERTY_MSG_SEQ
})
@JsonTypeName("ImportGroupMsgResponse_allOf_ImportMsgResult")

public class ImportGroupMsgResponseAllOfImportMsgResult {
  public static final String JSON_PROPERTY_RESULT = "Result";
  private Integer result;

  public static final String JSON_PROPERTY_MSG_TIME = "MsgTime";
  private Integer msgTime;

  public static final String JSON_PROPERTY_MSG_SEQ = "MsgSeq";
  private Integer msgSeq;

  public ImportGroupMsgResponseAllOfImportMsgResult() { 
  }

  public ImportGroupMsgResponseAllOfImportMsgResult result(Integer result) {
    
    this.result = result;
    return this;
  }

   /**
   * 单条消息导入结果 0表示单条消息成功 10004表示单条消息发送时间无效 80001表示单条消息包含脏字，拒绝存储此消息 80002表示为消息内容过长，目前支持8000字节的消息，请调整消息长度
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单条消息导入结果 0表示单条消息成功 10004表示单条消息发送时间无效 80001表示单条消息包含脏字，拒绝存储此消息 80002表示为消息内容过长，目前支持8000字节的消息，请调整消息长度")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(Integer result) {
    this.result = result;
  }


  public ImportGroupMsgResponseAllOfImportMsgResult msgTime(Integer msgTime) {
    
    this.msgTime = msgTime;
    return this;
  }

   /**
   * 消息的时间戳
   * @return msgTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息的时间戳")
  @JsonProperty(JSON_PROPERTY_MSG_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMsgTime() {
    return msgTime;
  }


  @JsonProperty(JSON_PROPERTY_MSG_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgTime(Integer msgTime) {
    this.msgTime = msgTime;
  }


  public ImportGroupMsgResponseAllOfImportMsgResult msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * 消息序列号，唯一标示一条消息
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息序列号，唯一标示一条消息")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupMsgResponseAllOfImportMsgResult importGroupMsgResponseAllOfImportMsgResult = (ImportGroupMsgResponseAllOfImportMsgResult) o;
    return Objects.equals(this.result, importGroupMsgResponseAllOfImportMsgResult.result) &&
        Objects.equals(this.msgTime, importGroupMsgResponseAllOfImportMsgResult.msgTime) &&
        Objects.equals(this.msgSeq, importGroupMsgResponseAllOfImportMsgResult.msgSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msgTime, msgSeq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMsgResponseAllOfImportMsgResult {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msgTime: ").append(toIndentedString(msgTime)).append("\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
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

