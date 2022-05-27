
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
 * ImSetAttrRequest
 */
@JsonPropertyOrder({
  ImSetAttrRequest.JSON_PROPERTY_TO_ACCOUNT,
  ImSetAttrRequest.JSON_PROPERTY_ATTRS
})

public class ImSetAttrRequest {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_ATTRS = "Attrs";
  private Object attrs;

  public ImSetAttrRequest() { 
  }

  public ImSetAttrRequest toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 目标用户帐号列表
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "目标用户帐号列表")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public ImSetAttrRequest attrs(Object attrs) {
    
    this.attrs = attrs;
    return this;
  }

   /**
   * 属性集合。每个属性是一个键值对，键为属性名，值为该用户对应的属性值。用户属性值不能超过50字节
   * @return attrs
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "属性集合。每个属性是一个键值对，键为属性名，值为该用户对应的属性值。用户属性值不能超过50字节")
  @JsonProperty(JSON_PROPERTY_ATTRS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAttrs() {
    return attrs;
  }


  @JsonProperty(JSON_PROPERTY_ATTRS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttrs(Object attrs) {
    this.attrs = attrs;
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
    return Objects.equals(this.toAccount, imSetAttrRequest.toAccount) &&
        Objects.equals(this.attrs, imSetAttrRequest.attrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, attrs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImSetAttrRequest {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
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

