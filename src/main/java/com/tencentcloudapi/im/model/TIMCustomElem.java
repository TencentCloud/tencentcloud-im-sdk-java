
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.TIMCustomElemMsgContent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * TIMCustomElem
 */
@JsonPropertyOrder({
  TIMCustomElem.JSON_PROPERTY_MSG_TYPE,
  TIMCustomElem.JSON_PROPERTY_MSG_CONTENT
})

public class TIMCustomElem {
  public static final String JSON_PROPERTY_MSG_TYPE = "MsgType";
  private String msgType = "TIMCustomElem";

  public static final String JSON_PROPERTY_MSG_CONTENT = "MsgContent";
  private TIMCustomElemMsgContent msgContent;

  public TIMCustomElem() { 
  }

  public TIMCustomElem msgType(String msgType) {
    
    this.msgType = msgType;
    return this;
  }

   /**
   * Get msgType
   * @return msgType
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MSG_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMsgType() {
    return msgType;
  }


  @JsonProperty(JSON_PROPERTY_MSG_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsgType(String msgType) {
    this.msgType = msgType;
  }


  public TIMCustomElem msgContent(TIMCustomElemMsgContent msgContent) {
    
    this.msgContent = msgContent;
    return this;
  }

   /**
   * Get msgContent
   * @return msgContent
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MSG_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TIMCustomElemMsgContent getMsgContent() {
    return msgContent;
  }


  @JsonProperty(JSON_PROPERTY_MSG_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsgContent(TIMCustomElemMsgContent msgContent) {
    this.msgContent = msgContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TIMCustomElem tiMCustomElem = (TIMCustomElem) o;
    return Objects.equals(this.msgType, tiMCustomElem.msgType) &&
        Objects.equals(this.msgContent, tiMCustomElem.msgContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgType, msgContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TIMCustomElem {\n");
    sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
    sb.append("    msgContent: ").append(toIndentedString(msgContent)).append("\n");
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

