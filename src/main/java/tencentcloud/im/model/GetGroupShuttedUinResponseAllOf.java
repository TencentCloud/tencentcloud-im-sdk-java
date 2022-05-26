
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
import tencentcloud.im.model.GetGroupShuttedUinResponseAllOfShuttedUinList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetGroupShuttedUinResponseAllOf
 */
@JsonPropertyOrder({
  GetGroupShuttedUinResponseAllOf.JSON_PROPERTY_SHUTTED_UIN_LIST
})
@JsonTypeName("GetGroupShuttedUinResponse_allOf")

public class GetGroupShuttedUinResponseAllOf {
  public static final String JSON_PROPERTY_SHUTTED_UIN_LIST = "ShuttedUinList";
  private List<GetGroupShuttedUinResponseAllOfShuttedUinList> shuttedUinList = null;

  public GetGroupShuttedUinResponseAllOf() { 
  }

  public GetGroupShuttedUinResponseAllOf shuttedUinList(List<GetGroupShuttedUinResponseAllOfShuttedUinList> shuttedUinList) {
    
    this.shuttedUinList = shuttedUinList;
    return this;
  }

  public GetGroupShuttedUinResponseAllOf addShuttedUinListItem(GetGroupShuttedUinResponseAllOfShuttedUinList shuttedUinListItem) {
    if (this.shuttedUinList == null) {
      this.shuttedUinList = new ArrayList<>();
    }
    this.shuttedUinList.add(shuttedUinListItem);
    return this;
  }

   /**
   * 返回结果为禁言用户信息数组，内容包括被禁言的成员 ID，及其被禁言到的时间（使用 UTC 时间，即世界协调时间）
   * @return shuttedUinList
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "返回结果为禁言用户信息数组，内容包括被禁言的成员 ID，及其被禁言到的时间（使用 UTC 时间，即世界协调时间）")
  @JsonProperty(JSON_PROPERTY_SHUTTED_UIN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetGroupShuttedUinResponseAllOfShuttedUinList> getShuttedUinList() {
    return shuttedUinList;
  }


  @JsonProperty(JSON_PROPERTY_SHUTTED_UIN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShuttedUinList(List<GetGroupShuttedUinResponseAllOfShuttedUinList> shuttedUinList) {
    this.shuttedUinList = shuttedUinList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupShuttedUinResponseAllOf getGroupShuttedUinResponseAllOf = (GetGroupShuttedUinResponseAllOf) o;
    return Objects.equals(this.shuttedUinList, getGroupShuttedUinResponseAllOf.shuttedUinList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shuttedUinList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupShuttedUinResponseAllOf {\n");
    sb.append("    shuttedUinList: ").append(toIndentedString(shuttedUinList)).append("\n");
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

