
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
 * ImportGroupResponseAllOf
 */
@JsonPropertyOrder({
  ImportGroupResponseAllOf.JSON_PROPERTY_GROUP_ID
})
@JsonTypeName("ImportGroupResponse_allOf")

public class ImportGroupResponseAllOf {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public ImportGroupResponseAllOf() { 
  }

  public ImportGroupResponseAllOf groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 创建成功之后的群 ID，由 IM 云后台分配或者用户指定
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "创建成功之后的群 ID，由 IM 云后台分配或者用户指定")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupResponseAllOf importGroupResponseAllOf = (ImportGroupResponseAllOf) o;
    return Objects.equals(this.groupId, importGroupResponseAllOf.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupResponseAllOf {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

