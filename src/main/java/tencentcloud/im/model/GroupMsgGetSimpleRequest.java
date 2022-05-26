
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
 * GroupMsgGetSimpleRequest
 */
@JsonPropertyOrder({
  GroupMsgGetSimpleRequest.JSON_PROPERTY_GROUP_ID,
  GroupMsgGetSimpleRequest.JSON_PROPERTY_REQ_MSG_NUMBER,
  GroupMsgGetSimpleRequest.JSON_PROPERTY_REQ_MSG_SEQ,
  GroupMsgGetSimpleRequest.JSON_PROPERTY_WITH_RECALLED_MSG
})

public class GroupMsgGetSimpleRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_REQ_MSG_NUMBER = "ReqMsgNumber";
  private Integer reqMsgNumber;

  public static final String JSON_PROPERTY_REQ_MSG_SEQ = "ReqMsgSeq";
  private Integer reqMsgSeq;

  public static final String JSON_PROPERTY_WITH_RECALLED_MSG = "WithRecalledMsg";
  private Integer withRecalledMsg;

  public GroupMsgGetSimpleRequest() { 
  }

  public GroupMsgGetSimpleRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 要拉取历史消息的群组 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "要拉取历史消息的群组 ID")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public GroupMsgGetSimpleRequest reqMsgNumber(Integer reqMsgNumber) {
    
    this.reqMsgNumber = reqMsgNumber;
    return this;
  }

   /**
   * 拉取的历史消息的条数，目前一次请求最多返回20条历史消息，所以这里最好小于等于20
   * maximum: 20
   * @return reqMsgNumber
  **/
  @javax.annotation.Nonnull
  @NotNull
 @Max(20)  @ApiModelProperty(required = true, value = "拉取的历史消息的条数，目前一次请求最多返回20条历史消息，所以这里最好小于等于20")
  @JsonProperty(JSON_PROPERTY_REQ_MSG_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getReqMsgNumber() {
    return reqMsgNumber;
  }


  @JsonProperty(JSON_PROPERTY_REQ_MSG_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReqMsgNumber(Integer reqMsgNumber) {
    this.reqMsgNumber = reqMsgNumber;
  }


  public GroupMsgGetSimpleRequest reqMsgSeq(Integer reqMsgSeq) {
    
    this.reqMsgSeq = reqMsgSeq;
    return this;
  }

   /**
   * 拉取消息的最大 seq
   * @return reqMsgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "拉取消息的最大 seq")
  @JsonProperty(JSON_PROPERTY_REQ_MSG_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReqMsgSeq() {
    return reqMsgSeq;
  }


  @JsonProperty(JSON_PROPERTY_REQ_MSG_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReqMsgSeq(Integer reqMsgSeq) {
    this.reqMsgSeq = reqMsgSeq;
  }


  public GroupMsgGetSimpleRequest withRecalledMsg(Integer withRecalledMsg) {
    
    this.withRecalledMsg = withRecalledMsg;
    return this;
  }

   /**
   * 是否带撤回的消息，填1表明需要拉取撤回后的消息；默认不拉取撤回后的消息
   * @return withRecalledMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否带撤回的消息，填1表明需要拉取撤回后的消息；默认不拉取撤回后的消息")
  @JsonProperty(JSON_PROPERTY_WITH_RECALLED_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWithRecalledMsg() {
    return withRecalledMsg;
  }


  @JsonProperty(JSON_PROPERTY_WITH_RECALLED_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWithRecalledMsg(Integer withRecalledMsg) {
    this.withRecalledMsg = withRecalledMsg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMsgGetSimpleRequest groupMsgGetSimpleRequest = (GroupMsgGetSimpleRequest) o;
    return Objects.equals(this.groupId, groupMsgGetSimpleRequest.groupId) &&
        Objects.equals(this.reqMsgNumber, groupMsgGetSimpleRequest.reqMsgNumber) &&
        Objects.equals(this.reqMsgSeq, groupMsgGetSimpleRequest.reqMsgSeq) &&
        Objects.equals(this.withRecalledMsg, groupMsgGetSimpleRequest.withRecalledMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, reqMsgNumber, reqMsgSeq, withRecalledMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgGetSimpleRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    reqMsgNumber: ").append(toIndentedString(reqMsgNumber)).append("\n");
    sb.append("    reqMsgSeq: ").append(toIndentedString(reqMsgSeq)).append("\n");
    sb.append("    withRecalledMsg: ").append(toIndentedString(withRecalledMsg)).append("\n");
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

