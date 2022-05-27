
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.BlackListGetResponseAllOfBlackListItem;
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
 * BlackListGetResponseAllOf
 */
@JsonPropertyOrder({
  BlackListGetResponseAllOf.JSON_PROPERTY_BLACK_LIST_ITEM,
  BlackListGetResponseAllOf.JSON_PROPERTY_START_INDEX,
  BlackListGetResponseAllOf.JSON_PROPERTY_CURRUENT_SEQUENCE,
  BlackListGetResponseAllOf.JSON_PROPERTY_ERROR_DISPLAY
})
@JsonTypeName("BlackListGetResponse_allOf")

public class BlackListGetResponseAllOf {
  public static final String JSON_PROPERTY_BLACK_LIST_ITEM = "BlackListItem";
  private List<BlackListGetResponseAllOfBlackListItem> blackListItem = null;

  public static final String JSON_PROPERTY_START_INDEX = "StartIndex";
  private Integer startIndex;

  public static final String JSON_PROPERTY_CURRUENT_SEQUENCE = "CurruentSequence";
  private Integer curruentSequence;

  public static final String JSON_PROPERTY_ERROR_DISPLAY = "ErrorDisplay";
  private String errorDisplay;

  public BlackListGetResponseAllOf() { 
  }

  public BlackListGetResponseAllOf blackListItem(List<BlackListGetResponseAllOfBlackListItem> blackListItem) {
    
    this.blackListItem = blackListItem;
    return this;
  }

  public BlackListGetResponseAllOf addBlackListItemItem(BlackListGetResponseAllOfBlackListItem blackListItemItem) {
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


  public BlackListGetResponseAllOf startIndex(Integer startIndex) {
    
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


  public BlackListGetResponseAllOf curruentSequence(Integer curruentSequence) {
    
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


  public BlackListGetResponseAllOf errorDisplay(String errorDisplay) {
    
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
    BlackListGetResponseAllOf blackListGetResponseAllOf = (BlackListGetResponseAllOf) o;
    return Objects.equals(this.blackListItem, blackListGetResponseAllOf.blackListItem) &&
        Objects.equals(this.startIndex, blackListGetResponseAllOf.startIndex) &&
        Objects.equals(this.curruentSequence, blackListGetResponseAllOf.curruentSequence) &&
        Objects.equals(this.errorDisplay, blackListGetResponseAllOf.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blackListItem, startIndex, curruentSequence, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlackListGetResponseAllOf {\n");
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

