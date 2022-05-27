
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
 * ImGetAttrNameResponseAllOf
 */
@JsonPropertyOrder({
  ImGetAttrNameResponseAllOf.JSON_PROPERTY_ATTR_NAMES
})
@JsonTypeName("ImGetAttrNameResponse_allOf")

public class ImGetAttrNameResponseAllOf {
  public static final String JSON_PROPERTY_ATTR_NAMES = "AttrNames";
  private Object attrNames;

  public ImGetAttrNameResponseAllOf() { 
  }

  public ImGetAttrNameResponseAllOf attrNames(Object attrNames) {
    
    this.attrNames = attrNames;
    return this;
  }

   /**
   * 包含多个键对。每对键值对，表示第几个属性对应的名称。例如\&quot;0\&quot;:\&quot;xxx\&quot;表示第0号属性的名称是 xxx
   * @return attrNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "包含多个键对。每对键值对，表示第几个属性对应的名称。例如\"0\":\"xxx\"表示第0号属性的名称是 xxx")
  @JsonProperty(JSON_PROPERTY_ATTR_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAttrNames() {
    return attrNames;
  }


  @JsonProperty(JSON_PROPERTY_ATTR_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttrNames(Object attrNames) {
    this.attrNames = attrNames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImGetAttrNameResponseAllOf imGetAttrNameResponseAllOf = (ImGetAttrNameResponseAllOf) o;
    return Objects.equals(this.attrNames, imGetAttrNameResponseAllOf.attrNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImGetAttrNameResponseAllOf {\n");
    sb.append("    attrNames: ").append(toIndentedString(attrNames)).append("\n");
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

