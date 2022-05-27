
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
 * FriendUpdateRequestUpdateItemInnerSnsItemInner
 */
@JsonPropertyOrder({
  FriendUpdateRequestUpdateItemInnerSnsItemInner.JSON_PROPERTY_TAG,
  FriendUpdateRequestUpdateItemInnerSnsItemInner.JSON_PROPERTY_VALUE
})
@JsonTypeName("FriendUpdateRequest_UpdateItem_inner_SnsItem_inner")

public class FriendUpdateRequestUpdateItemInnerSnsItemInner {
  public static final String JSON_PROPERTY_TAG = "Tag";
  private String tag;

  public static final String JSON_PROPERTY_VALUE = "Value";
  private String value;

  public FriendUpdateRequestUpdateItemInnerSnsItemInner() { 
  }

  public FriendUpdateRequestUpdateItemInnerSnsItemInner tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * 需要更新的关系链字段的字段名，目前只支持好友备注、好友分组、关系链自定义字段的更新操作，关系链字段的详细信息可参见 好友表（https://cloud.tencent.com/document/product/269/1501#.E5.A5.BD.E5.8F.8B.E8.A1.A8）
   * @return tag
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要更新的关系链字段的字段名，目前只支持好友备注、好友分组、关系链自定义字段的更新操作，关系链字段的详细信息可参见 好友表（https://cloud.tencent.com/document/product/269/1501#.E5.A5.BD.E5.8F.8B.E8.A1.A8）")
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTag(String tag) {
    this.tag = tag;
  }


  public FriendUpdateRequestUpdateItemInnerSnsItemInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 需要更新的关系链字段的值，关系链字段的值类型信息可参见 好友表（https://cloud.tencent.com/document/product/269/1501#.E5.A5.BD.E5.8F.8B.E8.A1.A8）
   * @return value
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要更新的关系链字段的值，关系链字段的值类型信息可参见 好友表（https://cloud.tencent.com/document/product/269/1501#.E5.A5.BD.E5.8F.8B.E8.A1.A8）")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendUpdateRequestUpdateItemInnerSnsItemInner friendUpdateRequestUpdateItemInnerSnsItemInner = (FriendUpdateRequestUpdateItemInnerSnsItemInner) o;
    return Objects.equals(this.tag, friendUpdateRequestUpdateItemInnerSnsItemInner.tag) &&
        Objects.equals(this.value, friendUpdateRequestUpdateItemInnerSnsItemInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendUpdateRequestUpdateItemInnerSnsItemInner {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

