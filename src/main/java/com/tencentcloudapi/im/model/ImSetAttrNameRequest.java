
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
 * ImSetAttrNameRequest
 */
@JsonPropertyOrder({
  ImSetAttrNameRequest.JSON_PROPERTY_ATTR_NAMES
})

public class ImSetAttrNameRequest {
  public static final String JSON_PROPERTY_ATTR_NAMES = "AttrNames";
  private Object attrNames;

  public ImSetAttrNameRequest() { 
  }

  public ImSetAttrNameRequest attrNames(Object attrNames) {
    
    this.attrNames = attrNames;
    return this;
  }

   /**
   * Get attrNames
   * @return attrNames
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ATTR_NAMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAttrNames() {
    return attrNames;
  }


  @JsonProperty(JSON_PROPERTY_ATTR_NAMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    ImSetAttrNameRequest imSetAttrNameRequest = (ImSetAttrNameRequest) o;
    return Objects.equals(this.attrNames, imSetAttrNameRequest.attrNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImSetAttrNameRequest {\n");
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

