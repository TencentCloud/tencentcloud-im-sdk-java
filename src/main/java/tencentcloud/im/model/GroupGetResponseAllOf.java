
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
import tencentcloud.im.model.GroupGetResponseAllOfResultItem;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GroupGetResponseAllOf
 */
@JsonPropertyOrder({
  GroupGetResponseAllOf.JSON_PROPERTY_RESULT_ITEM,
  GroupGetResponseAllOf.JSON_PROPERTY_CURRENT_SEQUENCE,
  GroupGetResponseAllOf.JSON_PROPERTY_ERROR_DISPLAY
})
@JsonTypeName("GroupGetResponse_allOf")

public class GroupGetResponseAllOf {
  public static final String JSON_PROPERTY_RESULT_ITEM = "ResultItem";
  private List<GroupGetResponseAllOfResultItem> resultItem = null;

  public static final String JSON_PROPERTY_CURRENT_SEQUENCE = "CurrentSequence";
  private List<String> currentSequence = null;

  public static final String JSON_PROPERTY_ERROR_DISPLAY = "ErrorDisplay";
  private String errorDisplay;

  public GroupGetResponseAllOf() { 
  }

  public GroupGetResponseAllOf resultItem(List<GroupGetResponseAllOfResultItem> resultItem) {
    
    this.resultItem = resultItem;
    return this;
  }

  public GroupGetResponseAllOf addResultItemItem(GroupGetResponseAllOfResultItem resultItemItem) {
    if (this.resultItem == null) {
      this.resultItem = new ArrayList<>();
    }
    this.resultItem.add(resultItemItem);
    return this;
  }

   /**
   * 拉取分组的结果对象数组
   * @return resultItem
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "拉取分组的结果对象数组")
  @JsonProperty(JSON_PROPERTY_RESULT_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GroupGetResponseAllOfResultItem> getResultItem() {
    return resultItem;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultItem(List<GroupGetResponseAllOfResultItem> resultItem) {
    this.resultItem = resultItem;
  }


  public GroupGetResponseAllOf currentSequence(List<String> currentSequence) {
    
    this.currentSequence = currentSequence;
    return this;
  }

  public GroupGetResponseAllOf addCurrentSequenceItem(String currentSequenceItem) {
    if (this.currentSequence == null) {
      this.currentSequence = new ArrayList<>();
    }
    this.currentSequence.add(currentSequenceItem);
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

  public List<String> getCurrentSequence() {
    return currentSequence;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentSequence(List<String> currentSequence) {
    this.currentSequence = currentSequence;
  }


  public GroupGetResponseAllOf errorDisplay(String errorDisplay) {
    
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
    GroupGetResponseAllOf groupGetResponseAllOf = (GroupGetResponseAllOf) o;
    return Objects.equals(this.resultItem, groupGetResponseAllOf.resultItem) &&
        Objects.equals(this.currentSequence, groupGetResponseAllOf.currentSequence) &&
        Objects.equals(this.errorDisplay, groupGetResponseAllOf.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultItem, currentSequence, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupGetResponseAllOf {\n");
    sb.append("    resultItem: ").append(toIndentedString(resultItem)).append("\n");
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

