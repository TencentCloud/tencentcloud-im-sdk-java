
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
 * GroupMsgRecallRequestMsgSeqListInner
 */
@JsonPropertyOrder({
  GroupMsgRecallRequestMsgSeqListInner.JSON_PROPERTY_MSG_SEQ
})
@JsonTypeName("GroupMsgRecallRequest_MsgSeqList_inner")

public class GroupMsgRecallRequestMsgSeqListInner {
  public static final String JSON_PROPERTY_MSG_SEQ = "MsgSeq";
  private Integer msgSeq;

  public GroupMsgRecallRequestMsgSeqListInner() { 
  }

  public GroupMsgRecallRequestMsgSeqListInner msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * 请求撤回的消息 seq
   * @return msgSeq
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "请求撤回的消息 seq")
  @JsonProperty(JSON_PROPERTY_MSG_SEQ)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMsgSeq() {
    return msgSeq;
  }


  @JsonProperty(JSON_PROPERTY_MSG_SEQ)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    GroupMsgRecallRequestMsgSeqListInner groupMsgRecallRequestMsgSeqListInner = (GroupMsgRecallRequestMsgSeqListInner) o;
    return Objects.equals(this.msgSeq, groupMsgRecallRequestMsgSeqListInner.msgSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgSeq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgRecallRequestMsgSeqListInner {\n");
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

