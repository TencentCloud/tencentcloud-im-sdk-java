
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GroupDeleteResponseAllOf
 */
@JsonPropertyOrder({
  GroupDeleteResponseAllOf.JSON_PROPERTY_CURRENT_SEQUENCE,
  GroupDeleteResponseAllOf.JSON_PROPERTY_ERROR_DISPLAY
})
@JsonTypeName("GroupDeleteResponse_allOf")

public class GroupDeleteResponseAllOf {
  public static final String JSON_PROPERTY_CURRENT_SEQUENCE = "CurrentSequence";
  private Integer currentSequence;

  public static final String JSON_PROPERTY_ERROR_DISPLAY = "ErrorDisplay";
  private String errorDisplay;

  public GroupDeleteResponseAllOf() { 
  }

  public GroupDeleteResponseAllOf currentSequence(Integer currentSequence) {
    
    this.currentSequence = currentSequence;
    return this;
  }

   /**
   * 返回最新的分组 Sequence
   * @return currentSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回最新的分组 Sequence")
  @JsonProperty(JSON_PROPERTY_CURRENT_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCurrentSequence() {
    return currentSequence;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentSequence(Integer currentSequence) {
    this.currentSequence = currentSequence;
  }


  public GroupDeleteResponseAllOf errorDisplay(String errorDisplay) {
    
    this.errorDisplay = errorDisplay;
    return this;
  }

   /**
   * 详细的客户端展示信息
   * @return errorDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "详细的客户端展示信息")
  @JsonProperty(JSON_PROPERTY_ERROR_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDisplay() {
    return errorDisplay;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorDisplay(String errorDisplay) {
    this.errorDisplay = errorDisplay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupDeleteResponseAllOf groupDeleteResponseAllOf = (GroupDeleteResponseAllOf) o;
    return Objects.equals(this.currentSequence, groupDeleteResponseAllOf.currentSequence) &&
        Objects.equals(this.errorDisplay, groupDeleteResponseAllOf.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentSequence, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupDeleteResponseAllOf {\n");
    sb.append("    currentSequence: ").append(toIndentedString(currentSequence)).append("\n");
    sb.append("    errorDisplay: ").append(toIndentedString(errorDisplay)).append("\n");
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

