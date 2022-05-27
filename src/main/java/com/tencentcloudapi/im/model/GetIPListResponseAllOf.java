
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetIPListResponseAllOf
 */
@JsonPropertyOrder({
  GetIPListResponseAllOf.JSON_PROPERTY_IP_LIST
})
@JsonTypeName("GetIPListResponse_allOf")

public class GetIPListResponseAllOf {
  public static final String JSON_PROPERTY_IP_LIST = "IPList";
  private List<String> ipList = null;

  public GetIPListResponseAllOf() { 
  }

  public GetIPListResponseAllOf ipList(List<String> ipList) {
    
    this.ipList = ipList;
    return this;
  }

  public GetIPListResponseAllOf addIpListItem(String ipListItem) {
    if (this.ipList == null) {
      this.ipList = new ArrayList<>();
    }
    this.ipList.add(ipListItem);
    return this;
  }

   /**
   * 服务器 IP 列表
   * @return ipList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "服务器 IP 列表")
  @JsonProperty(JSON_PROPERTY_IP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIpList() {
    return ipList;
  }


  @JsonProperty(JSON_PROPERTY_IP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpList(List<String> ipList) {
    this.ipList = ipList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIPListResponseAllOf getIPListResponseAllOf = (GetIPListResponseAllOf) o;
    return Objects.equals(this.ipList, getIPListResponseAllOf.ipList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIPListResponseAllOf {\n");
    sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
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

