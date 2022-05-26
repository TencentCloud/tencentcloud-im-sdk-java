
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
 * TIMVideoFileElemMsgContent
 */
@JsonPropertyOrder({
  TIMVideoFileElemMsgContent.JSON_PROPERTY_VIDEO_URL,
  TIMVideoFileElemMsgContent.JSON_PROPERTY_VIDEO_U_U_I_D,
  TIMVideoFileElemMsgContent.JSON_PROPERTY_VIDEO_SIZE,
  TIMVideoFileElemMsgContent.JSON_PROPERTY_VIDEO_SECOND,
  TIMVideoFileElemMsgContent.JSON_PROPERTY_VIDEO_FORMAT,
  TIMVideoFileElemMsgContent.JSON_PROPERTY_VIDEO_DOWNLOAD_FLAG,
  TIMVideoFileElemMsgContent.JSON_PROPERTY_THUMB_URL,
  TIMVideoFileElemMsgContent.JSON_PROPERTY_THUMB_U_U_I_D,
  TIMVideoFileElemMsgContent.JSON_PROPERTY_THUMB_SIZE,
  TIMVideoFileElemMsgContent.JSON_PROPERTY_THUMB_WIDTH,
  TIMVideoFileElemMsgContent.JSON_PROPERTY_THUMB_HEIGHT,
  TIMVideoFileElemMsgContent.JSON_PROPERTY_THUMB_FORMAT,
  TIMVideoFileElemMsgContent.JSON_PROPERTY_THUMB_DOWNLOAD_FLAG
})
@JsonTypeName("TIMVideoFileElem_MsgContent")

public class TIMVideoFileElemMsgContent {
  public static final String JSON_PROPERTY_VIDEO_URL = "VideoUrl";
  private String videoUrl;

  public static final String JSON_PROPERTY_VIDEO_U_U_I_D = "VideoUUID";
  private String videoUUID;

  public static final String JSON_PROPERTY_VIDEO_SIZE = "VideoSize";
  private Integer videoSize;

  public static final String JSON_PROPERTY_VIDEO_SECOND = "VideoSecond";
  private Integer videoSecond;

  public static final String JSON_PROPERTY_VIDEO_FORMAT = "VideoFormat";
  private String videoFormat;

  /**
   * Gets or Sets videoDownloadFlag
   */
  public enum VideoDownloadFlagEnum {
    NUMBER_2(2);

    private Integer value;

    VideoDownloadFlagEnum(Integer value) {
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
    public static VideoDownloadFlagEnum fromValue(Integer value) {
      for (VideoDownloadFlagEnum b : VideoDownloadFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VIDEO_DOWNLOAD_FLAG = "VideoDownloadFlag";
  private VideoDownloadFlagEnum videoDownloadFlag;

  public static final String JSON_PROPERTY_THUMB_URL = "ThumbUrl";
  private String thumbUrl;

  public static final String JSON_PROPERTY_THUMB_U_U_I_D = "ThumbUUID";
  private String thumbUUID;

  public static final String JSON_PROPERTY_THUMB_SIZE = "ThumbSize";
  private Integer thumbSize;

  public static final String JSON_PROPERTY_THUMB_WIDTH = "ThumbWidth";
  private Integer thumbWidth;

  public static final String JSON_PROPERTY_THUMB_HEIGHT = "ThumbHeight";
  private Integer thumbHeight;

  public static final String JSON_PROPERTY_THUMB_FORMAT = "ThumbFormat";
  private String thumbFormat;

  /**
   * Gets or Sets thumbDownloadFlag
   */
  public enum ThumbDownloadFlagEnum {
    NUMBER_2(2);

    private Integer value;

    ThumbDownloadFlagEnum(Integer value) {
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
    public static ThumbDownloadFlagEnum fromValue(Integer value) {
      for (ThumbDownloadFlagEnum b : ThumbDownloadFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_THUMB_DOWNLOAD_FLAG = "ThumbDownloadFlag";
  private ThumbDownloadFlagEnum thumbDownloadFlag;

  public TIMVideoFileElemMsgContent() { 
  }

  public TIMVideoFileElemMsgContent videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * Get videoUrl
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVideoUrl() {
    return videoUrl;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  public TIMVideoFileElemMsgContent videoUUID(String videoUUID) {
    
    this.videoUUID = videoUUID;
    return this;
  }

   /**
   * Get videoUUID
   * @return videoUUID
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVideoUUID() {
    return videoUUID;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVideoUUID(String videoUUID) {
    this.videoUUID = videoUUID;
  }


  public TIMVideoFileElemMsgContent videoSize(Integer videoSize) {
    
    this.videoSize = videoSize;
    return this;
  }

   /**
   * Get videoSize
   * @return videoSize
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVideoSize() {
    return videoSize;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVideoSize(Integer videoSize) {
    this.videoSize = videoSize;
  }


  public TIMVideoFileElemMsgContent videoSecond(Integer videoSecond) {
    
    this.videoSecond = videoSecond;
    return this;
  }

   /**
   * Get videoSecond
   * @return videoSecond
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_SECOND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVideoSecond() {
    return videoSecond;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_SECOND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVideoSecond(Integer videoSecond) {
    this.videoSecond = videoSecond;
  }


  public TIMVideoFileElemMsgContent videoFormat(String videoFormat) {
    
    this.videoFormat = videoFormat;
    return this;
  }

   /**
   * Get videoFormat
   * @return videoFormat
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVideoFormat() {
    return videoFormat;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVideoFormat(String videoFormat) {
    this.videoFormat = videoFormat;
  }


  public TIMVideoFileElemMsgContent videoDownloadFlag(VideoDownloadFlagEnum videoDownloadFlag) {
    
    this.videoDownloadFlag = videoDownloadFlag;
    return this;
  }

   /**
   * Get videoDownloadFlag
   * @return videoDownloadFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_DOWNLOAD_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VideoDownloadFlagEnum getVideoDownloadFlag() {
    return videoDownloadFlag;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_DOWNLOAD_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoDownloadFlag(VideoDownloadFlagEnum videoDownloadFlag) {
    this.videoDownloadFlag = videoDownloadFlag;
  }


  public TIMVideoFileElemMsgContent thumbUrl(String thumbUrl) {
    
    this.thumbUrl = thumbUrl;
    return this;
  }

   /**
   * Get thumbUrl
   * @return thumbUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THUMB_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThumbUrl() {
    return thumbUrl;
  }


  @JsonProperty(JSON_PROPERTY_THUMB_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbUrl(String thumbUrl) {
    this.thumbUrl = thumbUrl;
  }


  public TIMVideoFileElemMsgContent thumbUUID(String thumbUUID) {
    
    this.thumbUUID = thumbUUID;
    return this;
  }

   /**
   * Get thumbUUID
   * @return thumbUUID
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_THUMB_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getThumbUUID() {
    return thumbUUID;
  }


  @JsonProperty(JSON_PROPERTY_THUMB_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThumbUUID(String thumbUUID) {
    this.thumbUUID = thumbUUID;
  }


  public TIMVideoFileElemMsgContent thumbSize(Integer thumbSize) {
    
    this.thumbSize = thumbSize;
    return this;
  }

   /**
   * Get thumbSize
   * @return thumbSize
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_THUMB_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getThumbSize() {
    return thumbSize;
  }


  @JsonProperty(JSON_PROPERTY_THUMB_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThumbSize(Integer thumbSize) {
    this.thumbSize = thumbSize;
  }


  public TIMVideoFileElemMsgContent thumbWidth(Integer thumbWidth) {
    
    this.thumbWidth = thumbWidth;
    return this;
  }

   /**
   * Get thumbWidth
   * @return thumbWidth
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_THUMB_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getThumbWidth() {
    return thumbWidth;
  }


  @JsonProperty(JSON_PROPERTY_THUMB_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThumbWidth(Integer thumbWidth) {
    this.thumbWidth = thumbWidth;
  }


  public TIMVideoFileElemMsgContent thumbHeight(Integer thumbHeight) {
    
    this.thumbHeight = thumbHeight;
    return this;
  }

   /**
   * Get thumbHeight
   * @return thumbHeight
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_THUMB_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getThumbHeight() {
    return thumbHeight;
  }


  @JsonProperty(JSON_PROPERTY_THUMB_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThumbHeight(Integer thumbHeight) {
    this.thumbHeight = thumbHeight;
  }


  public TIMVideoFileElemMsgContent thumbFormat(String thumbFormat) {
    
    this.thumbFormat = thumbFormat;
    return this;
  }

   /**
   * Get thumbFormat
   * @return thumbFormat
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_THUMB_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getThumbFormat() {
    return thumbFormat;
  }


  @JsonProperty(JSON_PROPERTY_THUMB_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThumbFormat(String thumbFormat) {
    this.thumbFormat = thumbFormat;
  }


  public TIMVideoFileElemMsgContent thumbDownloadFlag(ThumbDownloadFlagEnum thumbDownloadFlag) {
    
    this.thumbDownloadFlag = thumbDownloadFlag;
    return this;
  }

   /**
   * Get thumbDownloadFlag
   * @return thumbDownloadFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THUMB_DOWNLOAD_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThumbDownloadFlagEnum getThumbDownloadFlag() {
    return thumbDownloadFlag;
  }


  @JsonProperty(JSON_PROPERTY_THUMB_DOWNLOAD_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbDownloadFlag(ThumbDownloadFlagEnum thumbDownloadFlag) {
    this.thumbDownloadFlag = thumbDownloadFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TIMVideoFileElemMsgContent tiMVideoFileElemMsgContent = (TIMVideoFileElemMsgContent) o;
    return Objects.equals(this.videoUrl, tiMVideoFileElemMsgContent.videoUrl) &&
        Objects.equals(this.videoUUID, tiMVideoFileElemMsgContent.videoUUID) &&
        Objects.equals(this.videoSize, tiMVideoFileElemMsgContent.videoSize) &&
        Objects.equals(this.videoSecond, tiMVideoFileElemMsgContent.videoSecond) &&
        Objects.equals(this.videoFormat, tiMVideoFileElemMsgContent.videoFormat) &&
        Objects.equals(this.videoDownloadFlag, tiMVideoFileElemMsgContent.videoDownloadFlag) &&
        Objects.equals(this.thumbUrl, tiMVideoFileElemMsgContent.thumbUrl) &&
        Objects.equals(this.thumbUUID, tiMVideoFileElemMsgContent.thumbUUID) &&
        Objects.equals(this.thumbSize, tiMVideoFileElemMsgContent.thumbSize) &&
        Objects.equals(this.thumbWidth, tiMVideoFileElemMsgContent.thumbWidth) &&
        Objects.equals(this.thumbHeight, tiMVideoFileElemMsgContent.thumbHeight) &&
        Objects.equals(this.thumbFormat, tiMVideoFileElemMsgContent.thumbFormat) &&
        Objects.equals(this.thumbDownloadFlag, tiMVideoFileElemMsgContent.thumbDownloadFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoUrl, videoUUID, videoSize, videoSecond, videoFormat, videoDownloadFlag, thumbUrl, thumbUUID, thumbSize, thumbWidth, thumbHeight, thumbFormat, thumbDownloadFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TIMVideoFileElemMsgContent {\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    videoUUID: ").append(toIndentedString(videoUUID)).append("\n");
    sb.append("    videoSize: ").append(toIndentedString(videoSize)).append("\n");
    sb.append("    videoSecond: ").append(toIndentedString(videoSecond)).append("\n");
    sb.append("    videoFormat: ").append(toIndentedString(videoFormat)).append("\n");
    sb.append("    videoDownloadFlag: ").append(toIndentedString(videoDownloadFlag)).append("\n");
    sb.append("    thumbUrl: ").append(toIndentedString(thumbUrl)).append("\n");
    sb.append("    thumbUUID: ").append(toIndentedString(thumbUUID)).append("\n");
    sb.append("    thumbSize: ").append(toIndentedString(thumbSize)).append("\n");
    sb.append("    thumbWidth: ").append(toIndentedString(thumbWidth)).append("\n");
    sb.append("    thumbHeight: ").append(toIndentedString(thumbHeight)).append("\n");
    sb.append("    thumbFormat: ").append(toIndentedString(thumbFormat)).append("\n");
    sb.append("    thumbDownloadFlag: ").append(toIndentedString(thumbDownloadFlag)).append("\n");
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

