
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.ModifyGroupAttrRequestGroupAttrInner;
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
 * SetGroupAttrRequest
 */
@JsonPropertyOrder({
  SetGroupAttrRequest.JSON_PROPERTY_GROUP_ID,
  SetGroupAttrRequest.JSON_PROPERTY_GROUP_ATTR
})

public class SetGroupAttrRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_GROUP_ATTR = "GroupAttr";
  private List<ModifyGroupAttrRequestGroupAttrInner> groupAttr = new ArrayList<>();

  public SetGroupAttrRequest() { 
  }

  public SetGroupAttrRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 重置自定义属性的群id
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "重置自定义属性的群id")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public SetGroupAttrRequest groupAttr(List<ModifyGroupAttrRequestGroupAttrInner> groupAttr) {
    
    this.groupAttr = groupAttr;
    return this;
  }

  public SetGroupAttrRequest addGroupAttrItem(ModifyGroupAttrRequestGroupAttrInner groupAttrItem) {
    this.groupAttr.add(groupAttrItem);
    return this;
  }

   /**
   * 自定义属性列表，key 为自定义属性的键，value 为自定义属性的值
   * @return groupAttr
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "自定义属性列表，key 为自定义属性的键，value 为自定义属性的值")
  @JsonProperty(JSON_PROPERTY_GROUP_ATTR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ModifyGroupAttrRequestGroupAttrInner> getGroupAttr() {
    return groupAttr;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ATTR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupAttr(List<ModifyGroupAttrRequestGroupAttrInner> groupAttr) {
    this.groupAttr = groupAttr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetGroupAttrRequest setGroupAttrRequest = (SetGroupAttrRequest) o;
    return Objects.equals(this.groupId, setGroupAttrRequest.groupId) &&
        Objects.equals(this.groupAttr, setGroupAttrRequest.groupAttr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, groupAttr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetGroupAttrRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupAttr: ").append(toIndentedString(groupAttr)).append("\n");
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

