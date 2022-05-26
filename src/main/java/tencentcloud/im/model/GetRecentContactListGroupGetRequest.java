
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
 * GetRecentContactListGroupGetRequest
 */
@JsonPropertyOrder({
  GetRecentContactListGroupGetRequest.JSON_PROPERTY_FROM_ACCOUNT,
  GetRecentContactListGroupGetRequest.JSON_PROPERTY_TIME_STAMP,
  GetRecentContactListGroupGetRequest.JSON_PROPERTY_START_INDEX,
  GetRecentContactListGroupGetRequest.JSON_PROPERTY_TOP_TIME_STAMP,
  GetRecentContactListGroupGetRequest.JSON_PROPERTY_TOP_START_INDEX,
  GetRecentContactListGroupGetRequest.JSON_PROPERTY_ASSIST_FLAGS
})

public class GetRecentContactListGroupGetRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_TIME_STAMP = "TimeStamp";
  private Integer timeStamp;

  public static final String JSON_PROPERTY_START_INDEX = "StartIndex";
  private Integer startIndex;

  public static final String JSON_PROPERTY_TOP_TIME_STAMP = "TopTimeStamp";
  private Integer topTimeStamp;

  public static final String JSON_PROPERTY_TOP_START_INDEX = "TopStartIndex";
  private Integer topStartIndex;

  public static final String JSON_PROPERTY_ASSIST_FLAGS = "AssistFlags";
  private Integer assistFlags;

  public GetRecentContactListGroupGetRequest() { 
  }

  public GetRecentContactListGroupGetRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 填 UserID，请求拉取该用户的会话列表
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "填 UserID，请求拉取该用户的会话列表")
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


  public GetRecentContactListGroupGetRequest timeStamp(Integer timeStamp) {
    
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * 普通会话的起始时间，第一页填 0
   * @return timeStamp
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "普通会话的起始时间，第一页填 0")
  @JsonProperty(JSON_PROPERTY_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTimeStamp() {
    return timeStamp;
  }


  @JsonProperty(JSON_PROPERTY_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimeStamp(Integer timeStamp) {
    this.timeStamp = timeStamp;
  }


  public GetRecentContactListGroupGetRequest startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * 普通会话的起始位置，第一页填 0
   * @return startIndex
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "普通会话的起始位置，第一页填 0")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public GetRecentContactListGroupGetRequest topTimeStamp(Integer topTimeStamp) {
    
    this.topTimeStamp = topTimeStamp;
    return this;
  }

   /**
   * 置顶会话的起始时间，第一页填 0
   * @return topTimeStamp
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "置顶会话的起始时间，第一页填 0")
  @JsonProperty(JSON_PROPERTY_TOP_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTopTimeStamp() {
    return topTimeStamp;
  }


  @JsonProperty(JSON_PROPERTY_TOP_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTopTimeStamp(Integer topTimeStamp) {
    this.topTimeStamp = topTimeStamp;
  }


  public GetRecentContactListGroupGetRequest topStartIndex(Integer topStartIndex) {
    
    this.topStartIndex = topStartIndex;
    return this;
  }

   /**
   * 置顶会话的起始位置，第一页填 0
   * @return topStartIndex
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "置顶会话的起始位置，第一页填 0")
  @JsonProperty(JSON_PROPERTY_TOP_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTopStartIndex() {
    return topStartIndex;
  }


  @JsonProperty(JSON_PROPERTY_TOP_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTopStartIndex(Integer topStartIndex) {
    this.topStartIndex = topStartIndex;
  }


  public GetRecentContactListGroupGetRequest assistFlags(Integer assistFlags) {
    
    this.assistFlags = assistFlags;
    return this;
  }

   /**
   * 会话辅助标志位： bit 0 - 是否支持置顶会话 bit 1 - 是否返回空会话 bit 2 - 是否支持置顶会话分页
   * @return assistFlags
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "会话辅助标志位： bit 0 - 是否支持置顶会话 bit 1 - 是否返回空会话 bit 2 - 是否支持置顶会话分页")
  @JsonProperty(JSON_PROPERTY_ASSIST_FLAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAssistFlags() {
    return assistFlags;
  }


  @JsonProperty(JSON_PROPERTY_ASSIST_FLAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssistFlags(Integer assistFlags) {
    this.assistFlags = assistFlags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecentContactListGroupGetRequest getRecentContactListGroupGetRequest = (GetRecentContactListGroupGetRequest) o;
    return Objects.equals(this.fromAccount, getRecentContactListGroupGetRequest.fromAccount) &&
        Objects.equals(this.timeStamp, getRecentContactListGroupGetRequest.timeStamp) &&
        Objects.equals(this.startIndex, getRecentContactListGroupGetRequest.startIndex) &&
        Objects.equals(this.topTimeStamp, getRecentContactListGroupGetRequest.topTimeStamp) &&
        Objects.equals(this.topStartIndex, getRecentContactListGroupGetRequest.topStartIndex) &&
        Objects.equals(this.assistFlags, getRecentContactListGroupGetRequest.assistFlags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, timeStamp, startIndex, topTimeStamp, topStartIndex, assistFlags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecentContactListGroupGetRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    topTimeStamp: ").append(toIndentedString(topTimeStamp)).append("\n");
    sb.append("    topStartIndex: ").append(toIndentedString(topStartIndex)).append("\n");
    sb.append("    assistFlags: ").append(toIndentedString(assistFlags)).append("\n");
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

