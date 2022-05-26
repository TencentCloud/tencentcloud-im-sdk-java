
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
import tencentcloud.im.model.CommonResponse;
import tencentcloud.im.model.GetRoamMsgResponseAllOf;
import tencentcloud.im.model.GetRoamMsgResponseAllOfMsgList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetRoamMsgResponse
 */
@JsonPropertyOrder({
  GetRoamMsgResponse.JSON_PROPERTY_ACTION_STATUS,
  GetRoamMsgResponse.JSON_PROPERTY_ERROR_INFO,
  GetRoamMsgResponse.JSON_PROPERTY_ERROR_CODE,
  GetRoamMsgResponse.JSON_PROPERTY_COMPLETE,
  GetRoamMsgResponse.JSON_PROPERTY_MSG_CNT,
  GetRoamMsgResponse.JSON_PROPERTY_LAST_MSG_TIME,
  GetRoamMsgResponse.JSON_PROPERTY_LAST_MSG_KEY,
  GetRoamMsgResponse.JSON_PROPERTY_MSG_LIST
})

public class GetRoamMsgResponse {
  public static final String JSON_PROPERTY_ACTION_STATUS = "ActionStatus";
  private String actionStatus;

  public static final String JSON_PROPERTY_ERROR_INFO = "ErrorInfo";
  private String errorInfo;

  public static final String JSON_PROPERTY_ERROR_CODE = "ErrorCode";
  private Integer errorCode;

  /**
   * 是否全部拉取，0表示未全部拉取，需要续拉，1表示已全部拉取
   */
  public enum CompleteEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    CompleteEnum(Integer value) {
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
    public static CompleteEnum fromValue(Integer value) {
      for (CompleteEnum b : CompleteEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_COMPLETE = "Complete";
  private CompleteEnum complete;

  public static final String JSON_PROPERTY_MSG_CNT = "MsgCnt";
  private Integer msgCnt;

  public static final String JSON_PROPERTY_LAST_MSG_TIME = "LastMsgTime";
  private Integer lastMsgTime;

  public static final String JSON_PROPERTY_LAST_MSG_KEY = "LastMsgKey";
  private String lastMsgKey;

  public static final String JSON_PROPERTY_MSG_LIST = "MsgList";
  private List<GetRoamMsgResponseAllOfMsgList> msgList = null;

  public GetRoamMsgResponse() { 
  }

  public GetRoamMsgResponse actionStatus(String actionStatus) {
    
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


  public GetRoamMsgResponse errorInfo(String errorInfo) {
    
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


  public GetRoamMsgResponse errorCode(Integer errorCode) {
    
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


  public GetRoamMsgResponse complete(CompleteEnum complete) {
    
    this.complete = complete;
    return this;
  }

   /**
   * 是否全部拉取，0表示未全部拉取，需要续拉，1表示已全部拉取
   * @return complete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否全部拉取，0表示未全部拉取，需要续拉，1表示已全部拉取")
  @JsonProperty(JSON_PROPERTY_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CompleteEnum getComplete() {
    return complete;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplete(CompleteEnum complete) {
    this.complete = complete;
  }


  public GetRoamMsgResponse msgCnt(Integer msgCnt) {
    
    this.msgCnt = msgCnt;
    return this;
  }

   /**
   * 本次拉取到的消息条数
   * @return msgCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "本次拉取到的消息条数")
  @JsonProperty(JSON_PROPERTY_MSG_CNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMsgCnt() {
    return msgCnt;
  }


  @JsonProperty(JSON_PROPERTY_MSG_CNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgCnt(Integer msgCnt) {
    this.msgCnt = msgCnt;
  }


  public GetRoamMsgResponse lastMsgTime(Integer lastMsgTime) {
    
    this.lastMsgTime = lastMsgTime;
    return this;
  }

   /**
   * 本次拉取到的消息里的最后一条消息的时间
   * @return lastMsgTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "本次拉取到的消息里的最后一条消息的时间")
  @JsonProperty(JSON_PROPERTY_LAST_MSG_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLastMsgTime() {
    return lastMsgTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MSG_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastMsgTime(Integer lastMsgTime) {
    this.lastMsgTime = lastMsgTime;
  }


  public GetRoamMsgResponse lastMsgKey(String lastMsgKey) {
    
    this.lastMsgKey = lastMsgKey;
    return this;
  }

   /**
   * 本次拉取到的消息里的最后一条消息的标识
   * @return lastMsgKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "本次拉取到的消息里的最后一条消息的标识")
  @JsonProperty(JSON_PROPERTY_LAST_MSG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastMsgKey() {
    return lastMsgKey;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MSG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastMsgKey(String lastMsgKey) {
    this.lastMsgKey = lastMsgKey;
  }


  public GetRoamMsgResponse msgList(List<GetRoamMsgResponseAllOfMsgList> msgList) {
    
    this.msgList = msgList;
    return this;
  }

  public GetRoamMsgResponse addMsgListItem(GetRoamMsgResponseAllOfMsgList msgListItem) {
    if (this.msgList == null) {
      this.msgList = new ArrayList<>();
    }
    this.msgList.add(msgListItem);
    return this;
  }

   /**
   * 返回的消息列表
   * @return msgList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "返回的消息列表")
  @JsonProperty(JSON_PROPERTY_MSG_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetRoamMsgResponseAllOfMsgList> getMsgList() {
    return msgList;
  }


  @JsonProperty(JSON_PROPERTY_MSG_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgList(List<GetRoamMsgResponseAllOfMsgList> msgList) {
    this.msgList = msgList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRoamMsgResponse getRoamMsgResponse = (GetRoamMsgResponse) o;
    return Objects.equals(this.actionStatus, getRoamMsgResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getRoamMsgResponse.errorInfo) &&
        Objects.equals(this.errorCode, getRoamMsgResponse.errorCode) &&
        Objects.equals(this.complete, getRoamMsgResponse.complete) &&
        Objects.equals(this.msgCnt, getRoamMsgResponse.msgCnt) &&
        Objects.equals(this.lastMsgTime, getRoamMsgResponse.lastMsgTime) &&
        Objects.equals(this.lastMsgKey, getRoamMsgResponse.lastMsgKey) &&
        Objects.equals(this.msgList, getRoamMsgResponse.msgList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, complete, msgCnt, lastMsgTime, lastMsgKey, msgList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoamMsgResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    msgCnt: ").append(toIndentedString(msgCnt)).append("\n");
    sb.append("    lastMsgTime: ").append(toIndentedString(lastMsgTime)).append("\n");
    sb.append("    lastMsgKey: ").append(toIndentedString(lastMsgKey)).append("\n");
    sb.append("    msgList: ").append(toIndentedString(msgList)).append("\n");
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

