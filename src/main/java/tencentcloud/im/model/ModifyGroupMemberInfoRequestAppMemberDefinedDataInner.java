
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
 * ModifyGroupMemberInfoRequestAppMemberDefinedDataInner
 */
@JsonPropertyOrder({
  ModifyGroupMemberInfoRequestAppMemberDefinedDataInner.JSON_PROPERTY_KEY,
  ModifyGroupMemberInfoRequestAppMemberDefinedDataInner.JSON_PROPERTY_VALUE
})
@JsonTypeName("ModifyGroupMemberInfoRequest_AppMemberDefinedData_inner")

public class ModifyGroupMemberInfoRequestAppMemberDefinedDataInner {
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_VALUE = "Value";
  private String value;

  public ModifyGroupMemberInfoRequestAppMemberDefinedDataInner() { 
  }

  public ModifyGroupMemberInfoRequestAppMemberDefinedDataInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * 要操作的群成员自定义字段Key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "要操作的群成员自定义字段Key")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  public ModifyGroupMemberInfoRequestAppMemberDefinedDataInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 要设置的数据内容
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "要设置的数据内容")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyGroupMemberInfoRequestAppMemberDefinedDataInner modifyGroupMemberInfoRequestAppMemberDefinedDataInner = (ModifyGroupMemberInfoRequestAppMemberDefinedDataInner) o;
    return Objects.equals(this.key, modifyGroupMemberInfoRequestAppMemberDefinedDataInner.key) &&
        Objects.equals(this.value, modifyGroupMemberInfoRequestAppMemberDefinedDataInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyGroupMemberInfoRequestAppMemberDefinedDataInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

