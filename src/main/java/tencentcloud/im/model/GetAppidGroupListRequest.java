
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
 * GetAppidGroupListRequest
 */
@JsonPropertyOrder({
  GetAppidGroupListRequest.JSON_PROPERTY_LIMIT,
  GetAppidGroupListRequest.JSON_PROPERTY_NEXT,
  GetAppidGroupListRequest.JSON_PROPERTY_GROUP_TYPE
})

public class GetAppidGroupListRequest {
  public static final String JSON_PROPERTY_LIMIT = "Limit";
  private Integer limit = 10000;

  public static final String JSON_PROPERTY_NEXT = "Next";
  private Integer next;

  public static final String JSON_PROPERTY_GROUP_TYPE = "GroupType";
  private String groupType;

  public GetAppidGroupListRequest() { 
  }

  public GetAppidGroupListRequest limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * 本次获取的群组 ID 数量的上限，不得超过 10000。如果不填，默认为最大值 10000
   * maximum: 10000
   * @return limit
  **/
  @javax.annotation.Nullable
 @Max(10000)  @ApiModelProperty(value = "本次获取的群组 ID 数量的上限，不得超过 10000。如果不填，默认为最大值 10000")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public GetAppidGroupListRequest next(Integer next) {
    
    this.next = next;
    return this;
  }

   /**
   * 群太多时分页拉取标志，第一次填0，以后填上一次返回的值，返回的 Next 为0代表拉完了
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群太多时分页拉取标志，第一次填0，以后填上一次返回的值，返回的 Next 为0代表拉完了")
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNext() {
    return next;
  }


  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNext(Integer next) {
    this.next = next;
  }


  public GetAppidGroupListRequest groupType(String groupType) {
    
    this.groupType = groupType;
    return this;
  }

   /**
   * 如果仅需要返回特定群组形态的群组，可以通过 GroupType 进行过滤，但此时返回的 TotalCount 的含义就变成了 App 中属于该群组形态的群组总数。不填为获取所有类型的群组。群组形态包括 Public（公开群），Private（即 Work，好友工作群），ChatRoom（即 Meeting，会议群），AVChatRoom（音视频聊天室），BChatRoom（在线成员广播大群）和社群（Community）
   * @return groupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "如果仅需要返回特定群组形态的群组，可以通过 GroupType 进行过滤，但此时返回的 TotalCount 的含义就变成了 App 中属于该群组形态的群组总数。不填为获取所有类型的群组。群组形态包括 Public（公开群），Private（即 Work，好友工作群），ChatRoom（即 Meeting，会议群），AVChatRoom（音视频聊天室），BChatRoom（在线成员广播大群）和社群（Community）")
  @JsonProperty(JSON_PROPERTY_GROUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupType() {
    return groupType;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAppidGroupListRequest getAppidGroupListRequest = (GetAppidGroupListRequest) o;
    return Objects.equals(this.limit, getAppidGroupListRequest.limit) &&
        Objects.equals(this.next, getAppidGroupListRequest.next) &&
        Objects.equals(this.groupType, getAppidGroupListRequest.groupType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, next, groupType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAppidGroupListRequest {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
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

