
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
 * PortraitGetResponseAllOfProfileItem
 */
@JsonPropertyOrder({
  PortraitGetResponseAllOfProfileItem.JSON_PROPERTY_TAG,
  PortraitGetResponseAllOfProfileItem.JSON_PROPERTY_VALUE
})
@JsonTypeName("PortraitGetResponse_allOf_ProfileItem")

public class PortraitGetResponseAllOfProfileItem {
  public static final String JSON_PROPERTY_TAG = "Tag";
  private String tag;

  public static final String JSON_PROPERTY_VALUE = "Value";
  private String value;

  public PortraitGetResponseAllOfProfileItem() { 
  }

  public PortraitGetResponseAllOfProfileItem tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * 返回的资料对象的名称：1. 标配资料字段，详情可参见 标配资料字段（https://cloud.tencent.com/document/product/269/1500#.E6.A0.87.E9.85.8D.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5）2. 自定义资料字段，详情可参见 自定义资料字段（https://cloud.tencent.com/document/product/269/1500#.E8.87.AA.E5.AE.9A.E4.B9.89.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5）
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回的资料对象的名称：1. 标配资料字段，详情可参见 标配资料字段（https://cloud.tencent.com/document/product/269/1500#.E6.A0.87.E9.85.8D.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5）2. 自定义资料字段，详情可参见 自定义资料字段（https://cloud.tencent.com/document/product/269/1500#.E8.87.AA.E5.AE.9A.E4.B9.89.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5）")
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTag(String tag) {
    this.tag = tag;
  }


  public PortraitGetResponseAllOfProfileItem value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 拉取的资料对象的值，详情可参见 资料字段（https://cloud.tencent.com/document/product/269/1500#.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5）
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "拉取的资料对象的值，详情可参见 资料字段（https://cloud.tencent.com/document/product/269/1500#.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5）")
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
    PortraitGetResponseAllOfProfileItem portraitGetResponseAllOfProfileItem = (PortraitGetResponseAllOfProfileItem) o;
    return Objects.equals(this.tag, portraitGetResponseAllOfProfileItem.tag) &&
        Objects.equals(this.value, portraitGetResponseAllOfProfileItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortraitGetResponseAllOfProfileItem {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

