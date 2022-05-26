
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
import tencentcloud.im.model.GetRecentContactListGroupGetResponseAllOfSessionItem;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetRecentContactListGroupGetResponseAllOf
 */
@JsonPropertyOrder({
  GetRecentContactListGroupGetResponseAllOf.JSON_PROPERTY_SESSION_ITEM,
  GetRecentContactListGroupGetResponseAllOf.JSON_PROPERTY_COMPLETE_FLAG,
  GetRecentContactListGroupGetResponseAllOf.JSON_PROPERTY_TIME_STAMP,
  GetRecentContactListGroupGetResponseAllOf.JSON_PROPERTY_START_INDEX,
  GetRecentContactListGroupGetResponseAllOf.JSON_PROPERTY_TOP_TIME_STAMP,
  GetRecentContactListGroupGetResponseAllOf.JSON_PROPERTY_TOP_START_INDEX,
  GetRecentContactListGroupGetResponseAllOf.JSON_PROPERTY_ERROR_DISPLAY
})
@JsonTypeName("GetRecentContactListGroupGetResponse_allOf")

public class GetRecentContactListGroupGetResponseAllOf {
  public static final String JSON_PROPERTY_SESSION_ITEM = "SessionItem";
  private List<GetRecentContactListGroupGetResponseAllOfSessionItem> sessionItem = null;

  public static final String JSON_PROPERTY_COMPLETE_FLAG = "CompleteFlag";
  private Integer completeFlag;

  public static final String JSON_PROPERTY_TIME_STAMP = "TimeStamp";
  private Integer timeStamp;

  public static final String JSON_PROPERTY_START_INDEX = "StartIndex";
  private Integer startIndex;

  public static final String JSON_PROPERTY_TOP_TIME_STAMP = "TopTimeStamp";
  private Integer topTimeStamp;

  public static final String JSON_PROPERTY_TOP_START_INDEX = "TopStartIndex";
  private Integer topStartIndex;

  public static final String JSON_PROPERTY_ERROR_DISPLAY = "ErrorDisplay";
  private String errorDisplay;

  public GetRecentContactListGroupGetResponseAllOf() { 
  }

  public GetRecentContactListGroupGetResponseAllOf sessionItem(List<GetRecentContactListGroupGetResponseAllOfSessionItem> sessionItem) {
    
    this.sessionItem = sessionItem;
    return this;
  }

  public GetRecentContactListGroupGetResponseAllOf addSessionItemItem(GetRecentContactListGroupGetResponseAllOfSessionItem sessionItemItem) {
    if (this.sessionItem == null) {
      this.sessionItem = new ArrayList<>();
    }
    this.sessionItem.add(sessionItemItem);
    return this;
  }

   /**
   * 会话对象数组
   * @return sessionItem
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "会话对象数组")
  @JsonProperty(JSON_PROPERTY_SESSION_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetRecentContactListGroupGetResponseAllOfSessionItem> getSessionItem() {
    return sessionItem;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionItem(List<GetRecentContactListGroupGetResponseAllOfSessionItem> sessionItem) {
    this.sessionItem = sessionItem;
  }


  public GetRecentContactListGroupGetResponseAllOf completeFlag(Integer completeFlag) {
    
    this.completeFlag = completeFlag;
    return this;
  }

   /**
   * 结束标识：1 表示已返回全量会话，0 表示还有会话没拉完
   * @return completeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结束标识：1 表示已返回全量会话，0 表示还有会话没拉完")
  @JsonProperty(JSON_PROPERTY_COMPLETE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCompleteFlag() {
    return completeFlag;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompleteFlag(Integer completeFlag) {
    this.completeFlag = completeFlag;
  }


  public GetRecentContactListGroupGetResponseAllOf timeStamp(Integer timeStamp) {
    
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * 普通会话下一页拉取的起始时间，分页拉取时通过请求包的 TimeStamp 字段带给移动通信后台
   * @return timeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "普通会话下一页拉取的起始时间，分页拉取时通过请求包的 TimeStamp 字段带给移动通信后台")
  @JsonProperty(JSON_PROPERTY_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeStamp() {
    return timeStamp;
  }


  @JsonProperty(JSON_PROPERTY_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeStamp(Integer timeStamp) {
    this.timeStamp = timeStamp;
  }


  public GetRecentContactListGroupGetResponseAllOf startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * 普通会话下一页拉取的起始位置，分页拉取时通过请求包的 StartIndex 字段带给移动通信后台
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "普通会话下一页拉取的起始位置，分页拉取时通过请求包的 StartIndex 字段带给移动通信后台")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public GetRecentContactListGroupGetResponseAllOf topTimeStamp(Integer topTimeStamp) {
    
    this.topTimeStamp = topTimeStamp;
    return this;
  }

   /**
   * 置顶会话下一页拉取的起始时间，分页拉取时通过请求包的 TopTimeStamp 字段带给移动通信后台
   * @return topTimeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "置顶会话下一页拉取的起始时间，分页拉取时通过请求包的 TopTimeStamp 字段带给移动通信后台")
  @JsonProperty(JSON_PROPERTY_TOP_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTopTimeStamp() {
    return topTimeStamp;
  }


  @JsonProperty(JSON_PROPERTY_TOP_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopTimeStamp(Integer topTimeStamp) {
    this.topTimeStamp = topTimeStamp;
  }


  public GetRecentContactListGroupGetResponseAllOf topStartIndex(Integer topStartIndex) {
    
    this.topStartIndex = topStartIndex;
    return this;
  }

   /**
   * 置顶会话下一页拉取的起始位置，分页拉取时通过请求包的 TopStartIndex 字段带给移动通信后台
   * @return topStartIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "置顶会话下一页拉取的起始位置，分页拉取时通过请求包的 TopStartIndex 字段带给移动通信后台")
  @JsonProperty(JSON_PROPERTY_TOP_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTopStartIndex() {
    return topStartIndex;
  }


  @JsonProperty(JSON_PROPERTY_TOP_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopStartIndex(Integer topStartIndex) {
    this.topStartIndex = topStartIndex;
  }


  public GetRecentContactListGroupGetResponseAllOf errorDisplay(String errorDisplay) {
    
    this.errorDisplay = errorDisplay;
    return this;
  }

   /**
   * 详细的客户端展示信息
   * @return errorDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "详细的客户端展示信息")
  @JsonProperty(JSON_PROPERTY_ERROR_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDisplay() {
    return errorDisplay;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorDisplay(String errorDisplay) {
    this.errorDisplay = errorDisplay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecentContactListGroupGetResponseAllOf getRecentContactListGroupGetResponseAllOf = (GetRecentContactListGroupGetResponseAllOf) o;
    return Objects.equals(this.sessionItem, getRecentContactListGroupGetResponseAllOf.sessionItem) &&
        Objects.equals(this.completeFlag, getRecentContactListGroupGetResponseAllOf.completeFlag) &&
        Objects.equals(this.timeStamp, getRecentContactListGroupGetResponseAllOf.timeStamp) &&
        Objects.equals(this.startIndex, getRecentContactListGroupGetResponseAllOf.startIndex) &&
        Objects.equals(this.topTimeStamp, getRecentContactListGroupGetResponseAllOf.topTimeStamp) &&
        Objects.equals(this.topStartIndex, getRecentContactListGroupGetResponseAllOf.topStartIndex) &&
        Objects.equals(this.errorDisplay, getRecentContactListGroupGetResponseAllOf.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionItem, completeFlag, timeStamp, startIndex, topTimeStamp, topStartIndex, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecentContactListGroupGetResponseAllOf {\n");
    sb.append("    sessionItem: ").append(toIndentedString(sessionItem)).append("\n");
    sb.append("    completeFlag: ").append(toIndentedString(completeFlag)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    topTimeStamp: ").append(toIndentedString(topTimeStamp)).append("\n");
    sb.append("    topStartIndex: ").append(toIndentedString(topStartIndex)).append("\n");
    sb.append("    errorDisplay: ").append(toIndentedString(errorDisplay)).append("\n");
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

