
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
import tencentcloud.im.model.GroupMsgRecallRequestMsgSeqListInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GroupMsgRecallRequest
 */
@JsonPropertyOrder({
  GroupMsgRecallRequest.JSON_PROPERTY_GROUP_ID,
  GroupMsgRecallRequest.JSON_PROPERTY_MSG_SEQ_LIST
})

public class GroupMsgRecallRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_MSG_SEQ_LIST = "MsgSeqList";
  private List<GroupMsgRecallRequestMsgSeqListInner> msgSeqList = new ArrayList<>();

  public GroupMsgRecallRequest() { 
  }

  public GroupMsgRecallRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 操作的群 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "操作的群 ID")
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


  public GroupMsgRecallRequest msgSeqList(List<GroupMsgRecallRequestMsgSeqListInner> msgSeqList) {
    
    this.msgSeqList = msgSeqList;
    return this;
  }

  public GroupMsgRecallRequest addMsgSeqListItem(GroupMsgRecallRequestMsgSeqListInner msgSeqListItem) {
    this.msgSeqList.add(msgSeqListItem);
    return this;
  }

   /**
   * 被撤回的消息 seq 列表，一次请求最多可以撤回10条消息 seq
   * @return msgSeqList
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
 @Size(max=10)  @ApiModelProperty(required = true, value = "被撤回的消息 seq 列表，一次请求最多可以撤回10条消息 seq")
  @JsonProperty(JSON_PROPERTY_MSG_SEQ_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<GroupMsgRecallRequestMsgSeqListInner> getMsgSeqList() {
    return msgSeqList;
  }


  @JsonProperty(JSON_PROPERTY_MSG_SEQ_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsgSeqList(List<GroupMsgRecallRequestMsgSeqListInner> msgSeqList) {
    this.msgSeqList = msgSeqList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMsgRecallRequest groupMsgRecallRequest = (GroupMsgRecallRequest) o;
    return Objects.equals(this.groupId, groupMsgRecallRequest.groupId) &&
        Objects.equals(this.msgSeqList, groupMsgRecallRequest.msgSeqList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, msgSeqList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgRecallRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    msgSeqList: ").append(toIndentedString(msgSeqList)).append("\n");
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

