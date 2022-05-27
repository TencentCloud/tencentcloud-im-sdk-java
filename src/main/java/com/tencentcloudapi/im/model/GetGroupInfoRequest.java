
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.GetGroupInfoRequestResponseFilter;
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
 * GetGroupInfoRequest
 */
@JsonPropertyOrder({
  GetGroupInfoRequest.JSON_PROPERTY_GROUP_ID_LIST,
  GetGroupInfoRequest.JSON_PROPERTY_RESPONSE_FILTER
})

public class GetGroupInfoRequest {
  public static final String JSON_PROPERTY_GROUP_ID_LIST = "GroupIdList";
  private List<String> groupIdList = new ArrayList<>();

  public static final String JSON_PROPERTY_RESPONSE_FILTER = "ResponseFilter";
  private GetGroupInfoRequestResponseFilter responseFilter;

  public GetGroupInfoRequest() { 
  }

  public GetGroupInfoRequest groupIdList(List<String> groupIdList) {
    
    this.groupIdList = groupIdList;
    return this;
  }

  public GetGroupInfoRequest addGroupIdListItem(String groupIdListItem) {
    this.groupIdList.add(groupIdListItem);
    return this;
  }

   /**
   * 需要拉取的群组列表
   * @return groupIdList
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要拉取的群组列表")
  @JsonProperty(JSON_PROPERTY_GROUP_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getGroupIdList() {
    return groupIdList;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupIdList(List<String> groupIdList) {
    this.groupIdList = groupIdList;
  }


  public GetGroupInfoRequest responseFilter(GetGroupInfoRequestResponseFilter responseFilter) {
    
    this.responseFilter = responseFilter;
    return this;
  }

   /**
   * Get responseFilter
   * @return responseFilter
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetGroupInfoRequestResponseFilter getResponseFilter() {
    return responseFilter;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseFilter(GetGroupInfoRequestResponseFilter responseFilter) {
    this.responseFilter = responseFilter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupInfoRequest getGroupInfoRequest = (GetGroupInfoRequest) o;
    return Objects.equals(this.groupIdList, getGroupInfoRequest.groupIdList) &&
        Objects.equals(this.responseFilter, getGroupInfoRequest.responseFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupIdList, responseFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupInfoRequest {\n");
    sb.append("    groupIdList: ").append(toIndentedString(groupIdList)).append("\n");
    sb.append("    responseFilter: ").append(toIndentedString(responseFilter)).append("\n");
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

