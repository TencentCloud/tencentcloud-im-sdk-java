
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
import tencentcloud.im.model.GetGroupAttrResponseAllOfGroupAttrAry;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetGroupAttrResponseAllOf
 */
@JsonPropertyOrder({
  GetGroupAttrResponseAllOf.JSON_PROPERTY_GROUP_ATTR_ARY
})
@JsonTypeName("GetGroupAttrResponse_allOf")

public class GetGroupAttrResponseAllOf {
  public static final String JSON_PROPERTY_GROUP_ATTR_ARY = "GroupAttrAry";
  private List<GetGroupAttrResponseAllOfGroupAttrAry> groupAttrAry = null;

  public GetGroupAttrResponseAllOf() { 
  }

  public GetGroupAttrResponseAllOf groupAttrAry(List<GetGroupAttrResponseAllOfGroupAttrAry> groupAttrAry) {
    
    this.groupAttrAry = groupAttrAry;
    return this;
  }

  public GetGroupAttrResponseAllOf addGroupAttrAryItem(GetGroupAttrResponseAllOfGroupAttrAry groupAttrAryItem) {
    if (this.groupAttrAry == null) {
      this.groupAttrAry = new ArrayList<>();
    }
    this.groupAttrAry.add(groupAttrAryItem);
    return this;
  }

   /**
   * 自定义属性的键值对
   * @return groupAttrAry
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "自定义属性的键值对")
  @JsonProperty(JSON_PROPERTY_GROUP_ATTR_ARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetGroupAttrResponseAllOfGroupAttrAry> getGroupAttrAry() {
    return groupAttrAry;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ATTR_ARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupAttrAry(List<GetGroupAttrResponseAllOfGroupAttrAry> groupAttrAry) {
    this.groupAttrAry = groupAttrAry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupAttrResponseAllOf getGroupAttrResponseAllOf = (GetGroupAttrResponseAllOf) o;
    return Objects.equals(this.groupAttrAry, getGroupAttrResponseAllOf.groupAttrAry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupAttrAry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupAttrResponseAllOf {\n");
    sb.append("    groupAttrAry: ").append(toIndentedString(groupAttrAry)).append("\n");
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

