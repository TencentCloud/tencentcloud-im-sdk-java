
package com.tencentcloudapi.im.model;

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
 * GetOnlineMemberNumResponseAllOf
 */
@JsonPropertyOrder({
  GetOnlineMemberNumResponseAllOf.JSON_PROPERTY_ONLINE_MEMBER_NUM
})
@JsonTypeName("GetOnlineMemberNumResponse_allOf")

public class GetOnlineMemberNumResponseAllOf {
  public static final String JSON_PROPERTY_ONLINE_MEMBER_NUM = "OnlineMemberNum";
  private Integer onlineMemberNum;

  public GetOnlineMemberNumResponseAllOf() { 
  }

  public GetOnlineMemberNumResponseAllOf onlineMemberNum(Integer onlineMemberNum) {
    
    this.onlineMemberNum = onlineMemberNum;
    return this;
  }

   /**
   * 该群组的在线人数
   * @return onlineMemberNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该群组的在线人数")
  @JsonProperty(JSON_PROPERTY_ONLINE_MEMBER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOnlineMemberNum() {
    return onlineMemberNum;
  }


  @JsonProperty(JSON_PROPERTY_ONLINE_MEMBER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlineMemberNum(Integer onlineMemberNum) {
    this.onlineMemberNum = onlineMemberNum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOnlineMemberNumResponseAllOf getOnlineMemberNumResponseAllOf = (GetOnlineMemberNumResponseAllOf) o;
    return Objects.equals(this.onlineMemberNum, getOnlineMemberNumResponseAllOf.onlineMemberNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineMemberNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOnlineMemberNumResponseAllOf {\n");
    sb.append("    onlineMemberNum: ").append(toIndentedString(onlineMemberNum)).append("\n");
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

