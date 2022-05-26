
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
import tencentcloud.im.model.OfflinePushInfoAndroidInfo;
import tencentcloud.im.model.OfflinePushInfoApnsInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * OfflinePushInfo
 */
@JsonPropertyOrder({
  OfflinePushInfo.JSON_PROPERTY_PUSH_FLAG,
  OfflinePushInfo.JSON_PROPERTY_TITLE,
  OfflinePushInfo.JSON_PROPERTY_DESC,
  OfflinePushInfo.JSON_PROPERTY_EXT,
  OfflinePushInfo.JSON_PROPERTY_ANDROID_INFO,
  OfflinePushInfo.JSON_PROPERTY_APNS_INFO
})

public class OfflinePushInfo {
  /**
   * 0表示推送，1表示不离线推送。
   */
  public enum PushFlagEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    PushFlagEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PushFlagEnum fromValue(Integer value) {
      for (PushFlagEnum b : PushFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PUSH_FLAG = "PushFlag";
  private PushFlagEnum pushFlag;

  public static final String JSON_PROPERTY_TITLE = "Title";
  private String title;

  public static final String JSON_PROPERTY_DESC = "Desc";
  private String desc;

  public static final String JSON_PROPERTY_EXT = "Ext";
  private String ext;

  public static final String JSON_PROPERTY_ANDROID_INFO = "AndroidInfo";
  private OfflinePushInfoAndroidInfo androidInfo;

  public static final String JSON_PROPERTY_APNS_INFO = "ApnsInfo";
  private OfflinePushInfoApnsInfo apnsInfo;

  public OfflinePushInfo() { 
  }

  public OfflinePushInfo pushFlag(PushFlagEnum pushFlag) {
    
    this.pushFlag = pushFlag;
    return this;
  }

   /**
   * 0表示推送，1表示不离线推送。
   * @return pushFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0表示推送，1表示不离线推送。")
  @JsonProperty(JSON_PROPERTY_PUSH_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PushFlagEnum getPushFlag() {
    return pushFlag;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushFlag(PushFlagEnum pushFlag) {
    this.pushFlag = pushFlag;
  }


  public OfflinePushInfo title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 离线推送标题。该字段为 iOS 和 Android 共用。
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "离线推送标题。该字段为 iOS 和 Android 共用。")
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


  public OfflinePushInfo desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 离线推送内容。该字段会覆盖上面各种消息元素 TIMMsgElement 的离线推送展示文本。若发送的消息只有一个 TIMCustomElem 自定义消息元素，该 Desc 字段会覆盖 TIMCustomElem 中的 Desc 字段。如果两个 Desc 字段都不填，将收不到该自定义消息的离线推送。
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "离线推送内容。该字段会覆盖上面各种消息元素 TIMMsgElement 的离线推送展示文本。若发送的消息只有一个 TIMCustomElem 自定义消息元素，该 Desc 字段会覆盖 TIMCustomElem 中的 Desc 字段。如果两个 Desc 字段都不填，将收不到该自定义消息的离线推送。")
  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesc() {
    return desc;
  }


  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesc(String desc) {
    this.desc = desc;
  }


  public OfflinePushInfo ext(String ext) {
    
    this.ext = ext;
    return this;
  }

   /**
   * 离线推送透传内容。由于国内各 Android 手机厂商的推送平台要求各不一样，请保证此字段为 JSON 格式，否则可能会导致收不到某些厂商的离线推送。
   * @return ext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "离线推送透传内容。由于国内各 Android 手机厂商的推送平台要求各不一样，请保证此字段为 JSON 格式，否则可能会导致收不到某些厂商的离线推送。")
  @JsonProperty(JSON_PROPERTY_EXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExt() {
    return ext;
  }


  @JsonProperty(JSON_PROPERTY_EXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExt(String ext) {
    this.ext = ext;
  }


  public OfflinePushInfo androidInfo(OfflinePushInfoAndroidInfo androidInfo) {
    
    this.androidInfo = androidInfo;
    return this;
  }

   /**
   * Get androidInfo
   * @return androidInfo
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANDROID_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OfflinePushInfoAndroidInfo getAndroidInfo() {
    return androidInfo;
  }


  @JsonProperty(JSON_PROPERTY_ANDROID_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAndroidInfo(OfflinePushInfoAndroidInfo androidInfo) {
    this.androidInfo = androidInfo;
  }


  public OfflinePushInfo apnsInfo(OfflinePushInfoApnsInfo apnsInfo) {
    
    this.apnsInfo = apnsInfo;
    return this;
  }

   /**
   * Get apnsInfo
   * @return apnsInfo
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APNS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OfflinePushInfoApnsInfo getApnsInfo() {
    return apnsInfo;
  }


  @JsonProperty(JSON_PROPERTY_APNS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApnsInfo(OfflinePushInfoApnsInfo apnsInfo) {
    this.apnsInfo = apnsInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflinePushInfo offlinePushInfo = (OfflinePushInfo) o;
    return Objects.equals(this.pushFlag, offlinePushInfo.pushFlag) &&
        Objects.equals(this.title, offlinePushInfo.title) &&
        Objects.equals(this.desc, offlinePushInfo.desc) &&
        Objects.equals(this.ext, offlinePushInfo.ext) &&
        Objects.equals(this.androidInfo, offlinePushInfo.androidInfo) &&
        Objects.equals(this.apnsInfo, offlinePushInfo.apnsInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushFlag, title, desc, ext, androidInfo, apnsInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflinePushInfo {\n");
    sb.append("    pushFlag: ").append(toIndentedString(pushFlag)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    androidInfo: ").append(toIndentedString(androidInfo)).append("\n");
    sb.append("    apnsInfo: ").append(toIndentedString(apnsInfo)).append("\n");
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

