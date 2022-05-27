
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.GetRoamMsgResponseAllOfMsgList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetRoamMsgResponseAllOf
 */
@JsonPropertyOrder({
  GetRoamMsgResponseAllOf.JSON_PROPERTY_COMPLETE,
  GetRoamMsgResponseAllOf.JSON_PROPERTY_MSG_CNT,
  GetRoamMsgResponseAllOf.JSON_PROPERTY_LAST_MSG_TIME,
  GetRoamMsgResponseAllOf.JSON_PROPERTY_LAST_MSG_KEY,
  GetRoamMsgResponseAllOf.JSON_PROPERTY_MSG_LIST
})
@JsonTypeName("GetRoamMsgResponse_allOf")

public class GetRoamMsgResponseAllOf {
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

  public GetRoamMsgResponseAllOf() { 
  }

  public GetRoamMsgResponseAllOf complete(CompleteEnum complete) {
    
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


  public GetRoamMsgResponseAllOf msgCnt(Integer msgCnt) {
    
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


  public GetRoamMsgResponseAllOf lastMsgTime(Integer lastMsgTime) {
    
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


  public GetRoamMsgResponseAllOf lastMsgKey(String lastMsgKey) {
    
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


  public GetRoamMsgResponseAllOf msgList(List<GetRoamMsgResponseAllOfMsgList> msgList) {
    
    this.msgList = msgList;
    return this;
  }

  public GetRoamMsgResponseAllOf addMsgListItem(GetRoamMsgResponseAllOfMsgList msgListItem) {
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
    GetRoamMsgResponseAllOf getRoamMsgResponseAllOf = (GetRoamMsgResponseAllOf) o;
    return Objects.equals(this.complete, getRoamMsgResponseAllOf.complete) &&
        Objects.equals(this.msgCnt, getRoamMsgResponseAllOf.msgCnt) &&
        Objects.equals(this.lastMsgTime, getRoamMsgResponseAllOf.lastMsgTime) &&
        Objects.equals(this.lastMsgKey, getRoamMsgResponseAllOf.lastMsgKey) &&
        Objects.equals(this.msgList, getRoamMsgResponseAllOf.msgList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complete, msgCnt, lastMsgTime, lastMsgKey, msgList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoamMsgResponseAllOf {\n");
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

