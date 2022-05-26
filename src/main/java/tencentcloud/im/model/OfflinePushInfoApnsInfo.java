
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
 * OfflinePushInfoApnsInfo
 */
@JsonPropertyOrder({
  OfflinePushInfoApnsInfo.JSON_PROPERTY_BADGE_MODE,
  OfflinePushInfoApnsInfo.JSON_PROPERTY_TITLE,
  OfflinePushInfoApnsInfo.JSON_PROPERTY_SUB_TITLE,
  OfflinePushInfoApnsInfo.JSON_PROPERTY_IMAGE,
  OfflinePushInfoApnsInfo.JSON_PROPERTY_MUTABLE_CONTENT
})
@JsonTypeName("OfflinePushInfo_ApnsInfo")

public class OfflinePushInfoApnsInfo {
  public static final String JSON_PROPERTY_BADGE_MODE = "BadgeMode";
  private Integer badgeMode;

  public static final String JSON_PROPERTY_TITLE = "Title";
  private String title;

  public static final String JSON_PROPERTY_SUB_TITLE = "SubTitle";
  private String subTitle;

  public static final String JSON_PROPERTY_IMAGE = "Image";
  private String image;

  public static final String JSON_PROPERTY_MUTABLE_CONTENT = "MutableContent";
  private Integer mutableContent = 0;

  public OfflinePushInfoApnsInfo() { 
  }

  public OfflinePushInfoApnsInfo badgeMode(Integer badgeMode) {
    
    this.badgeMode = badgeMode;
    return this;
  }

   /**
   * 这个字段缺省或者为0表示需要计数，为1表示本条消息不需要计数，即右上角图标数字不增加。
   * @return badgeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "这个字段缺省或者为0表示需要计数，为1表示本条消息不需要计数，即右上角图标数字不增加。")
  @JsonProperty(JSON_PROPERTY_BADGE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBadgeMode() {
    return badgeMode;
  }


  @JsonProperty(JSON_PROPERTY_BADGE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBadgeMode(Integer badgeMode) {
    this.badgeMode = badgeMode;
  }


  public OfflinePushInfoApnsInfo title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 该字段用于标识 APNs 推送的标题，若填写则会覆盖最上层 Title。
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该字段用于标识 APNs 推送的标题，若填写则会覆盖最上层 Title。")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public OfflinePushInfoApnsInfo subTitle(String subTitle) {
    
    this.subTitle = subTitle;
    return this;
  }

   /**
   * 该字段用于标识 APNs 推送的子标题。
   * @return subTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该字段用于标识 APNs 推送的子标题。")
  @JsonProperty(JSON_PROPERTY_SUB_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubTitle() {
    return subTitle;
  }


  @JsonProperty(JSON_PROPERTY_SUB_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }


  public OfflinePushInfoApnsInfo image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * 该字段用于标识 APNs 携带的图片地址，当客户端拿到该字段时，可以通过下载图片资源的方式将图片展示在弹窗上。
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该字段用于标识 APNs 携带的图片地址，当客户端拿到该字段时，可以通过下载图片资源的方式将图片展示在弹窗上。")
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImage() {
    return image;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(String image) {
    this.image = image;
  }


  public OfflinePushInfoApnsInfo mutableContent(Integer mutableContent) {
    
    this.mutableContent = mutableContent;
    return this;
  }

   /**
   * 为1表示开启 iOS 10 的推送扩展，默认为0。
   * @return mutableContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "为1表示开启 iOS 10 的推送扩展，默认为0。")
  @JsonProperty(JSON_PROPERTY_MUTABLE_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMutableContent() {
    return mutableContent;
  }


  @JsonProperty(JSON_PROPERTY_MUTABLE_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMutableContent(Integer mutableContent) {
    this.mutableContent = mutableContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflinePushInfoApnsInfo offlinePushInfoApnsInfo = (OfflinePushInfoApnsInfo) o;
    return Objects.equals(this.badgeMode, offlinePushInfoApnsInfo.badgeMode) &&
        Objects.equals(this.title, offlinePushInfoApnsInfo.title) &&
        Objects.equals(this.subTitle, offlinePushInfoApnsInfo.subTitle) &&
        Objects.equals(this.image, offlinePushInfoApnsInfo.image) &&
        Objects.equals(this.mutableContent, offlinePushInfoApnsInfo.mutableContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(badgeMode, title, subTitle, image, mutableContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflinePushInfoApnsInfo {\n");
    sb.append("    badgeMode: ").append(toIndentedString(badgeMode)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    mutableContent: ").append(toIndentedString(mutableContent)).append("\n");
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

