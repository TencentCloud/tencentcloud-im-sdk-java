
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
import tencentcloud.im.model.BlackListGetResponseAllOf;
import tencentcloud.im.model.BlackListGetResponseAllOfBlackListItem;
import tencentcloud.im.model.CommonResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * BlackListGetResponse
 */
@JsonPropertyOrder({
  BlackListGetResponse.JSON_PROPERTY_ACTION_STATUS,
  BlackListGetResponse.JSON_PROPERTY_ERROR_INFO,
  BlackListGetResponse.JSON_PROPERTY_ERROR_CODE,
  BlackListGetResponse.JSON_PROPERTY_BLACK_LIST_ITEM,
  BlackListGetResponse.JSON_PROPERTY_START_INDEX,
  BlackListGetResponse.JSON_PROPERTY_CURRUENT_SEQUENCE,
  BlackListGetResponse.JSON_PROPERTY_ERROR_DISPLAY
})

public class BlackListGetResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_BLACK_LIST_ITEM = "BlackListItem";
  private List<BlackListGetResponseAllOfBlackListItem> blackListItem = null;

  public static final String JSON_PROPERTY_START_INDEX = "StartIndex";
  private Integer startIndex;

  public static final String JSON_PROPERTY_CURRUENT_SEQUENCE = "CurruentSequence";
  private Integer curruentSequence;

  public static final String JSON_PROPERTY_ERROR_DISPLAY = "ErrorDisplay";
  private String errorDisplay;

  public BlackListGetResponse() { 
  }

  public BlackListGetResponse actionStatus(String actionStatus) {
    
    this.actionStatus = actionStatus;
    return this;
  }

   /**
   * 请求处理的结果，OK 表示处理成功，FAIL 表示失败
   * @return actionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求处理的结果，OK 表示处理成功，FAIL 表示失败")
  @JsonProperty(JSON_PROPERTY_ACTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActionStatus() {
    return actionStatus;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }


  public BlackListGetResponse errorInfo(String errorInfo) {
    
    this.errorInfo = errorInfo;
    return this;
  }

   /**
   * 错误信息
   * @return errorInfo
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "错误信息")
  @JsonProperty(JSON_PROPERTY_ERROR_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getErrorInfo() {
    return errorInfo;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
  }


  public BlackListGetResponse errorCode(Integer errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 错误码，0表示成功，非0表示失败
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "错误码，0表示成功，非0表示失败")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  public BlackListGetResponse blackListItem(List<BlackListGetResponseAllOfBlackListItem> blackListItem) {
    
    this.blackListItem = blackListItem;
    return this;
  }

  public BlackListGetResponse addBlackListItemItem(BlackListGetResponseAllOfBlackListItem blackListItemItem) {
    if (this.blackListItem == null) {
      this.blackListItem = new ArrayList<>();
    }
    this.blackListItem.add(blackListItemItem);
    return this;
  }

   /**
   * 黑名单对象数组，每一个黑名单对象都包括了 To_Account 和 AddBlackTimeStamp
   * @return blackListItem
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "黑名单对象数组，每一个黑名单对象都包括了 To_Account 和 AddBlackTimeStamp")
  @JsonProperty(JSON_PROPERTY_BLACK_LIST_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BlackListGetResponseAllOfBlackListItem> getBlackListItem() {
    return blackListItem;
  }


  @JsonProperty(JSON_PROPERTY_BLACK_LIST_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlackListItem(List<BlackListGetResponseAllOfBlackListItem> blackListItem) {
    this.blackListItem = blackListItem;
  }


  public BlackListGetResponse startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * 下页拉取的起始位置，0表示已拉完
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "下页拉取的起始位置，0表示已拉完")
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


  public BlackListGetResponse curruentSequence(Integer curruentSequence) {
    
    this.curruentSequence = curruentSequence;
    return this;
  }

   /**
   * 黑名单最新的 Seq
   * @return curruentSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "黑名单最新的 Seq")
  @JsonProperty(JSON_PROPERTY_CURRUENT_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCurruentSequence() {
    return curruentSequence;
  }


  @JsonProperty(JSON_PROPERTY_CURRUENT_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurruentSequence(Integer curruentSequence) {
    this.curruentSequence = curruentSequence;
  }


  public BlackListGetResponse errorDisplay(String errorDisplay) {
    
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
    BlackListGetResponse blackListGetResponse = (BlackListGetResponse) o;
    return Objects.equals(this.actionStatus, blackListGetResponse.actionStatus) &&
        Objects.equals(this.errorInfo, blackListGetResponse.errorInfo) &&
        Objects.equals(this.errorCode, blackListGetResponse.errorCode) &&
        Objects.equals(this.blackListItem, blackListGetResponse.blackListItem) &&
        Objects.equals(this.startIndex, blackListGetResponse.startIndex) &&
        Objects.equals(this.curruentSequence, blackListGetResponse.curruentSequence) &&
        Objects.equals(this.errorDisplay, blackListGetResponse.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, blackListItem, startIndex, curruentSequence, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlackListGetResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    blackListItem: ").append(toIndentedString(blackListItem)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    curruentSequence: ").append(toIndentedString(curruentSequence)).append("\n");
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

