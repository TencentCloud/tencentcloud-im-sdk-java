
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
 * From_Account 对 To_Account 的自定义好友数据，每一个成员都包含一个 Tag 字段和一个 Value 字段，详情可参见 自定义好友字段（https://cloud.tencent.com/document/product/269/1501#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）
 */
@ApiModel(description = "From_Account 对 To_Account 的自定义好友数据，每一个成员都包含一个 Tag 字段和一个 Value 字段，详情可参见 自定义好友字段（https://cloud.tencent.com/document/product/269/1501#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）")
@JsonPropertyOrder({
  FriendImportRequestAddFriendItemInnerCustomItemInner.JSON_PROPERTY_TAG,
  FriendImportRequestAddFriendItemInnerCustomItemInner.JSON_PROPERTY_VALUE
})
@JsonTypeName("FriendImportRequest_AddFriendItem_inner_CustomItem_inner")

public class FriendImportRequestAddFriendItemInnerCustomItemInner {
  public static final String JSON_PROPERTY_TAG = "Tag";
  private String tag;

  public static final String JSON_PROPERTY_VALUE = "Value";
  private String value;

  public FriendImportRequestAddFriendItemInnerCustomItemInner() { 
  }

  public FriendImportRequestAddFriendItemInnerCustomItemInner tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * 自定义好友字段的名称，使用前请通过即时通信 IM 控制台 &gt;【应用配置】&gt;【功能配置】申请自定义好友字段
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "自定义好友字段的名称，使用前请通过即时通信 IM 控制台 >【应用配置】>【功能配置】申请自定义好友字段")
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


  public FriendImportRequestAddFriendItemInnerCustomItemInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 自定义好友字段的值
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "自定义好友字段的值")
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
    FriendImportRequestAddFriendItemInnerCustomItemInner friendImportRequestAddFriendItemInnerCustomItemInner = (FriendImportRequestAddFriendItemInnerCustomItemInner) o;
    return Objects.equals(this.tag, friendImportRequestAddFriendItemInnerCustomItemInner.tag) &&
        Objects.equals(this.value, friendImportRequestAddFriendItemInnerCustomItemInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendImportRequestAddFriendItemInnerCustomItemInner {\n");
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

