
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
 * FriendGetListResponseAllOfSnsProfileItem
 */
@JsonPropertyOrder({
  FriendGetListResponseAllOfSnsProfileItem.JSON_PROPERTY_TAG,
  FriendGetListResponseAllOfSnsProfileItem.JSON_PROPERTY_VALUE
})
@JsonTypeName("FriendGetListResponse_allOf_SnsProfileItem")

public class FriendGetListResponseAllOfSnsProfileItem {
  public static final String JSON_PROPERTY_TAG = "Tag";
  private String tag;

  public static final String JSON_PROPERTY_VALUE = "Value";
  private String value;

  public FriendGetListResponseAllOfSnsProfileItem() { 
  }

  public FriendGetListResponseAllOfSnsProfileItem tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * 字段的名称
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "字段的名称")
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTag(String tag) {
    this.tag = tag;
  }


  public FriendGetListResponseAllOfSnsProfileItem value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 字段的值
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "字段的值")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    FriendGetListResponseAllOfSnsProfileItem friendGetListResponseAllOfSnsProfileItem = (FriendGetListResponseAllOfSnsProfileItem) o;
    return Objects.equals(this.tag, friendGetListResponseAllOfSnsProfileItem.tag) &&
        Objects.equals(this.value, friendGetListResponseAllOfSnsProfileItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendGetListResponseAllOfSnsProfileItem {\n");
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

