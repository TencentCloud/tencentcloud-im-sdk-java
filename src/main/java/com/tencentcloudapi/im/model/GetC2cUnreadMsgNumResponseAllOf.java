
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponseAllOfErrorList;
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
 * GetC2cUnreadMsgNumResponseAllOf
 */
@JsonPropertyOrder({
  GetC2cUnreadMsgNumResponseAllOf.JSON_PROPERTY_ALL_C2_C_UNREAD_MSG_NUM,
  GetC2cUnreadMsgNumResponseAllOf.JSON_PROPERTY_C2_C_UNREAD_MSG_NUM_LIST,
  GetC2cUnreadMsgNumResponseAllOf.JSON_PROPERTY_ERROR_LIST
})
@JsonTypeName("GetC2cUnreadMsgNumResponse_allOf")

public class GetC2cUnreadMsgNumResponseAllOf {
  public static final String JSON_PROPERTY_ALL_C2_C_UNREAD_MSG_NUM = "AllC2CUnreadMsgNum";
  private Integer allC2CUnreadMsgNum;

  public static final String JSON_PROPERTY_C2_C_UNREAD_MSG_NUM_LIST = "C2CUnreadMsgNumList";
  private List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> c2CUnreadMsgNumList = null;

  public static final String JSON_PROPERTY_ERROR_LIST = "ErrorList";
  private List<GetC2cUnreadMsgNumResponseAllOfErrorList> errorList = null;

  public GetC2cUnreadMsgNumResponseAllOf() { 
  }

  public GetC2cUnreadMsgNumResponseAllOf allC2CUnreadMsgNum(Integer allC2CUnreadMsgNum) {
    
    this.allC2CUnreadMsgNum = allC2CUnreadMsgNum;
    return this;
  }

   /**
   * 单聊消息总未读数
   * @return allC2CUnreadMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单聊消息总未读数")
  @JsonProperty(JSON_PROPERTY_ALL_C2_C_UNREAD_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAllC2CUnreadMsgNum() {
    return allC2CUnreadMsgNum;
  }


  @JsonProperty(JSON_PROPERTY_ALL_C2_C_UNREAD_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllC2CUnreadMsgNum(Integer allC2CUnreadMsgNum) {
    this.allC2CUnreadMsgNum = allC2CUnreadMsgNum;
  }


  public GetC2cUnreadMsgNumResponseAllOf c2CUnreadMsgNumList(List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> c2CUnreadMsgNumList) {
    
    this.c2CUnreadMsgNumList = c2CUnreadMsgNumList;
    return this;
  }

  public GetC2cUnreadMsgNumResponseAllOf addC2CUnreadMsgNumListItem(GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList c2CUnreadMsgNumListItem) {
    if (this.c2CUnreadMsgNumList == null) {
      this.c2CUnreadMsgNumList = new ArrayList<>();
    }
    this.c2CUnreadMsgNumList.add(c2CUnreadMsgNumListItem);
    return this;
  }

   /**
   * 单聊会话List
   * @return c2CUnreadMsgNumList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "单聊会话List")
  @JsonProperty(JSON_PROPERTY_C2_C_UNREAD_MSG_NUM_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> getC2CUnreadMsgNumList() {
    return c2CUnreadMsgNumList;
  }


  @JsonProperty(JSON_PROPERTY_C2_C_UNREAD_MSG_NUM_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setC2CUnreadMsgNumList(List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> c2CUnreadMsgNumList) {
    this.c2CUnreadMsgNumList = c2CUnreadMsgNumList;
  }


  public GetC2cUnreadMsgNumResponseAllOf errorList(List<GetC2cUnreadMsgNumResponseAllOfErrorList> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public GetC2cUnreadMsgNumResponseAllOf addErrorListItem(GetC2cUnreadMsgNumResponseAllOfErrorList errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * Get errorList
   * @return errorList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetC2cUnreadMsgNumResponseAllOfErrorList> getErrorList() {
    return errorList;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorList(List<GetC2cUnreadMsgNumResponseAllOfErrorList> errorList) {
    this.errorList = errorList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetC2cUnreadMsgNumResponseAllOf getC2cUnreadMsgNumResponseAllOf = (GetC2cUnreadMsgNumResponseAllOf) o;
    return Objects.equals(this.allC2CUnreadMsgNum, getC2cUnreadMsgNumResponseAllOf.allC2CUnreadMsgNum) &&
        Objects.equals(this.c2CUnreadMsgNumList, getC2cUnreadMsgNumResponseAllOf.c2CUnreadMsgNumList) &&
        Objects.equals(this.errorList, getC2cUnreadMsgNumResponseAllOf.errorList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allC2CUnreadMsgNum, c2CUnreadMsgNumList, errorList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetC2cUnreadMsgNumResponseAllOf {\n");
    sb.append("    allC2CUnreadMsgNum: ").append(toIndentedString(allC2CUnreadMsgNum)).append("\n");
    sb.append("    c2CUnreadMsgNumList: ").append(toIndentedString(c2CUnreadMsgNumList)).append("\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
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

