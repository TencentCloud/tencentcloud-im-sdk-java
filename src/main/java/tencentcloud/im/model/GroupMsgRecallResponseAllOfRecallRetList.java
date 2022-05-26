
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
 * GroupMsgRecallResponseAllOfRecallRetList
 */
@JsonPropertyOrder({
  GroupMsgRecallResponseAllOfRecallRetList.JSON_PROPERTY_MSG_SEQ,
  GroupMsgRecallResponseAllOfRecallRetList.JSON_PROPERTY_RET_CODE
})
@JsonTypeName("GroupMsgRecallResponse_allOf_RecallRetList")

public class GroupMsgRecallResponseAllOfRecallRetList {
  public static final String JSON_PROPERTY_MSG_SEQ = "MsgSeq";
  private Integer msgSeq;

  public static final String JSON_PROPERTY_RET_CODE = "RetCode";
  private Integer retCode;

  public GroupMsgRecallResponseAllOfRecallRetList() { 
  }

  public GroupMsgRecallResponseAllOfRecallRetList msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * 单个被撤回消息的 seq
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单个被撤回消息的 seq")
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


  public GroupMsgRecallResponseAllOfRecallRetList retCode(Integer retCode) {
    
    this.retCode = retCode;
    return this;
  }

   /**
   * 单个消息的被撤回结果：0表示成功；其它表示失败，参考下文错误码说明（https://cloud.tencent.com/document/product/269/12341#.E5.BA.94.E7.AD.94.E5.8C.85.E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E）
   * @return retCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单个消息的被撤回结果：0表示成功；其它表示失败，参考下文错误码说明（https://cloud.tencent.com/document/product/269/12341#.E5.BA.94.E7.AD.94.E5.8C.85.E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E）")
  @JsonProperty(JSON_PROPERTY_RET_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRetCode() {
    return retCode;
  }


  @JsonProperty(JSON_PROPERTY_RET_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetCode(Integer retCode) {
    this.retCode = retCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMsgRecallResponseAllOfRecallRetList groupMsgRecallResponseAllOfRecallRetList = (GroupMsgRecallResponseAllOfRecallRetList) o;
    return Objects.equals(this.msgSeq, groupMsgRecallResponseAllOfRecallRetList.msgSeq) &&
        Objects.equals(this.retCode, groupMsgRecallResponseAllOfRecallRetList.retCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgSeq, retCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgRecallResponseAllOfRecallRetList {\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
    sb.append("    retCode: ").append(toIndentedString(retCode)).append("\n");
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

