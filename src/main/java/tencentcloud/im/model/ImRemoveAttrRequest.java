
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ImRemoveAttrRequest
 */
@JsonPropertyOrder({
  ImRemoveAttrRequest.JSON_PROPERTY_TO_ACCOUNT,
  ImRemoveAttrRequest.JSON_PROPERTY_ATTRS
})

public class ImRemoveAttrRequest {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_ATTRS = "Attrs";
  private List<String> attrs = new ArrayList<>();

  public ImRemoveAttrRequest() { 
  }

  public ImRemoveAttrRequest toAccount(String toAccount) {
    
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


  public ImRemoveAttrRequest attrs(List<String> attrs) {
    
    this.attrs = attrs;
    return this;
  }

  public ImRemoveAttrRequest addAttrsItem(String attrsItem) {
    this.attrs.add(attrsItem);
    return this;
  }

   /**
   * 属性集合，注意这里只需要给出属性名即可
   * @return attrs
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "属性集合，注意这里只需要给出属性名即可")
  @JsonProperty(JSON_PROPERTY_ATTRS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAttrs() {
    return attrs;
  }


  @JsonProperty(JSON_PROPERTY_ATTRS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttrs(List<String> attrs) {
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
    ImRemoveAttrRequest imRemoveAttrRequest = (ImRemoveAttrRequest) o;
    return Objects.equals(this.toAccount, imRemoveAttrRequest.toAccount) &&
        Objects.equals(this.attrs, imRemoveAttrRequest.attrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, attrs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImRemoveAttrRequest {\n");
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

