
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.ImGetAttrResponseAllOfUserAttrs;
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
 * ImSetAttrRequest
 */
@JsonPropertyOrder({
  ImSetAttrRequest.JSON_PROPERTY_USER_ATTRS
})

public class ImSetAttrRequest {
  public static final String JSON_PROPERTY_USER_ATTRS = "UserAttrs";
  private List<ImGetAttrResponseAllOfUserAttrs> userAttrs = null;

  public ImSetAttrRequest() { 
  }

  public ImSetAttrRequest userAttrs(List<ImGetAttrResponseAllOfUserAttrs> userAttrs) {
    
    this.userAttrs = userAttrs;
    return this;
  }

  public ImSetAttrRequest addUserAttrsItem(ImGetAttrResponseAllOfUserAttrs userAttrsItem) {
    if (this.userAttrs == null) {
      this.userAttrs = new ArrayList<>();
    }
    this.userAttrs.add(userAttrsItem);
    return this;
  }

   /**
   * Get userAttrs
   * @return userAttrs
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ATTRS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ImGetAttrResponseAllOfUserAttrs> getUserAttrs() {
    return userAttrs;
  }


  @JsonProperty(JSON_PROPERTY_USER_ATTRS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserAttrs(List<ImGetAttrResponseAllOfUserAttrs> userAttrs) {
    this.userAttrs = userAttrs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImSetAttrRequest imSetAttrRequest = (ImSetAttrRequest) o;
    return Objects.equals(this.userAttrs, imSetAttrRequest.userAttrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAttrs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImSetAttrRequest {\n");
    sb.append("    userAttrs: ").append(toIndentedString(userAttrs)).append("\n");
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

