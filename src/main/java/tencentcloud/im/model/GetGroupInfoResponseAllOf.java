
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
import tencentcloud.im.model.GetGroupInfoResponseAllOfGroupInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetGroupInfoResponseAllOf
 */
@JsonPropertyOrder({
  GetGroupInfoResponseAllOf.JSON_PROPERTY_GROUP_INFO
})
@JsonTypeName("GetGroupInfoResponse_allOf")

public class GetGroupInfoResponseAllOf {
  public static final String JSON_PROPERTY_GROUP_INFO = "GroupInfo";
  private List<GetGroupInfoResponseAllOfGroupInfo> groupInfo = null;

  public GetGroupInfoResponseAllOf() { 
  }

  public GetGroupInfoResponseAllOf groupInfo(List<GetGroupInfoResponseAllOfGroupInfo> groupInfo) {
    
    this.groupInfo = groupInfo;
    return this;
  }

  public GetGroupInfoResponseAllOf addGroupInfoItem(GetGroupInfoResponseAllOfGroupInfo groupInfoItem) {
    if (this.groupInfo == null) {
      this.groupInfo = new ArrayList<>();
    }
    this.groupInfo.add(groupInfoItem);
    return this;
  }

   /**
   * 返回结果为群组信息数组，内容包括群基础资料字段、群成员资料字段、群组维度自定义字段和群成员维度自定义字段，字段详情请参阅 群组数据结构介绍（https://cloud.tencent.com/document/product/269/1502#.E7.BE.A4.E7.BB.84.E6.95.B0.E6.8D.AE.E7.BB.93.E6.9E.84.E4.BB.8B.E7.BB.8D）
   * @return groupInfo
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "返回结果为群组信息数组，内容包括群基础资料字段、群成员资料字段、群组维度自定义字段和群成员维度自定义字段，字段详情请参阅 群组数据结构介绍（https://cloud.tencent.com/document/product/269/1502#.E7.BE.A4.E7.BB.84.E6.95.B0.E6.8D.AE.E7.BB.93.E6.9E.84.E4.BB.8B.E7.BB.8D）")
  @JsonProperty(JSON_PROPERTY_GROUP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetGroupInfoResponseAllOfGroupInfo> getGroupInfo() {
    return groupInfo;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupInfo(List<GetGroupInfoResponseAllOfGroupInfo> groupInfo) {
    this.groupInfo = groupInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupInfoResponseAllOf getGroupInfoResponseAllOf = (GetGroupInfoResponseAllOf) o;
    return Objects.equals(this.groupInfo, getGroupInfoResponseAllOf.groupInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupInfoResponseAllOf {\n");
    sb.append("    groupInfo: ").append(toIndentedString(groupInfo)).append("\n");
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

