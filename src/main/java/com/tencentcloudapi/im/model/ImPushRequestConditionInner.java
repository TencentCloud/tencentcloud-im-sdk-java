
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
 * ImPushRequestConditionInner
 */
@JsonPropertyOrder({
  ImPushRequestConditionInner.JSON_PROPERTY_ATTRS_OR,
  ImPushRequestConditionInner.JSON_PROPERTY_ATTRS_AND,
  ImPushRequestConditionInner.JSON_PROPERTY_TAGS_OR,
  ImPushRequestConditionInner.JSON_PROPERTY_TAGS_AND
})
@JsonTypeName("ImPushRequest_Condition_inner")

public class ImPushRequestConditionInner {
  public static final String JSON_PROPERTY_ATTRS_OR = "AttrsOr";
  private Object attrsOr;

  public static final String JSON_PROPERTY_ATTRS_AND = "AttrsAnd";
  private Object attrsAnd;

  public static final String JSON_PROPERTY_TAGS_OR = "TagsOr";
  private Object tagsOr;

  public static final String JSON_PROPERTY_TAGS_AND = "TagsAnd";
  private Object tagsAnd;

  public ImPushRequestConditionInner() { 
  }

  public ImPushRequestConditionInner attrsOr(Object attrsOr) {
    
    this.attrsOr = attrsOr;
    return this;
  }

   /**
   * 属性的或条件
   * @return attrsOr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "属性的或条件")
  @JsonProperty(JSON_PROPERTY_ATTRS_OR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAttrsOr() {
    return attrsOr;
  }


  @JsonProperty(JSON_PROPERTY_ATTRS_OR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttrsOr(Object attrsOr) {
    this.attrsOr = attrsOr;
  }


  public ImPushRequestConditionInner attrsAnd(Object attrsAnd) {
    
    this.attrsAnd = attrsAnd;
    return this;
  }

   /**
   * 属性的与条件
   * @return attrsAnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "属性的与条件")
  @JsonProperty(JSON_PROPERTY_ATTRS_AND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAttrsAnd() {
    return attrsAnd;
  }


  @JsonProperty(JSON_PROPERTY_ATTRS_AND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttrsAnd(Object attrsAnd) {
    this.attrsAnd = attrsAnd;
  }


  public ImPushRequestConditionInner tagsOr(Object tagsOr) {
    
    this.tagsOr = tagsOr;
    return this;
  }

   /**
   * 标签的或条件
   * @return tagsOr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签的或条件")
  @JsonProperty(JSON_PROPERTY_TAGS_OR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTagsOr() {
    return tagsOr;
  }


  @JsonProperty(JSON_PROPERTY_TAGS_OR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTagsOr(Object tagsOr) {
    this.tagsOr = tagsOr;
  }


  public ImPushRequestConditionInner tagsAnd(Object tagsAnd) {
    
    this.tagsAnd = tagsAnd;
    return this;
  }

   /**
   * 标签的与条件
   * @return tagsAnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签的与条件")
  @JsonProperty(JSON_PROPERTY_TAGS_AND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTagsAnd() {
    return tagsAnd;
  }


  @JsonProperty(JSON_PROPERTY_TAGS_AND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTagsAnd(Object tagsAnd) {
    this.tagsAnd = tagsAnd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImPushRequestConditionInner imPushRequestConditionInner = (ImPushRequestConditionInner) o;
    return Objects.equals(this.attrsOr, imPushRequestConditionInner.attrsOr) &&
        Objects.equals(this.attrsAnd, imPushRequestConditionInner.attrsAnd) &&
        Objects.equals(this.tagsOr, imPushRequestConditionInner.tagsOr) &&
        Objects.equals(this.tagsAnd, imPushRequestConditionInner.tagsAnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrsOr, attrsAnd, tagsOr, tagsAnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImPushRequestConditionInner {\n");
    sb.append("    attrsOr: ").append(toIndentedString(attrsOr)).append("\n");
    sb.append("    attrsAnd: ").append(toIndentedString(attrsAnd)).append("\n");
    sb.append("    tagsOr: ").append(toIndentedString(tagsOr)).append("\n");
    sb.append("    tagsAnd: ").append(toIndentedString(tagsAnd)).append("\n");
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

