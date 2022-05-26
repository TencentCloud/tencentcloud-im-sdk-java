
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
 * TIMSoundElemMsgContent
 */
@JsonPropertyOrder({
  TIMSoundElemMsgContent.JSON_PROPERTY_URL,
  TIMSoundElemMsgContent.JSON_PROPERTY_U_U_I_D,
  TIMSoundElemMsgContent.JSON_PROPERTY_SIZE,
  TIMSoundElemMsgContent.JSON_PROPERTY_SECOND,
  TIMSoundElemMsgContent.JSON_PROPERTY_DOWNLOAD_FLAG
})
@JsonTypeName("TIMSoundElem_MsgContent")

public class TIMSoundElemMsgContent {
  public static final String JSON_PROPERTY_URL = "Url";
  private String url;

  public static final String JSON_PROPERTY_U_U_I_D = "UUID";
  private String UUID;

  public static final String JSON_PROPERTY_SIZE = "Size";
  private Integer size;

  public static final String JSON_PROPERTY_SECOND = "Second";
  private Integer second;

  /**
   * Gets or Sets downloadFlag
   */
  public enum DownloadFlagEnum {
    NUMBER_2(2);

    private Integer value;

    DownloadFlagEnum(Integer value) {
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
    public static DownloadFlagEnum fromValue(Integer value) {
      for (DownloadFlagEnum b : DownloadFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DOWNLOAD_FLAG = "Download_Flag";
  private DownloadFlagEnum downloadFlag = DownloadFlagEnum.NUMBER_2;

  public TIMSoundElemMsgContent() { 
  }

  public TIMSoundElemMsgContent url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public TIMSoundElemMsgContent UUID(String UUID) {
    
    this.UUID = UUID;
    return this;
  }

   /**
   * Get UUID
   * @return UUID
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUUID() {
    return UUID;
  }


  @JsonProperty(JSON_PROPERTY_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUUID(String UUID) {
    this.UUID = UUID;
  }


  public TIMSoundElemMsgContent size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Integer size) {
    this.size = size;
  }


  public TIMSoundElemMsgContent second(Integer second) {
    
    this.second = second;
    return this;
  }

   /**
   * Get second
   * @return second
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECOND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSecond() {
    return second;
  }


  @JsonProperty(JSON_PROPERTY_SECOND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecond(Integer second) {
    this.second = second;
  }


  public TIMSoundElemMsgContent downloadFlag(DownloadFlagEnum downloadFlag) {
    
    this.downloadFlag = downloadFlag;
    return this;
  }

   /**
   * Get downloadFlag
   * @return downloadFlag
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_FLAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DownloadFlagEnum getDownloadFlag() {
    return downloadFlag;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_FLAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDownloadFlag(DownloadFlagEnum downloadFlag) {
    this.downloadFlag = downloadFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TIMSoundElemMsgContent tiMSoundElemMsgContent = (TIMSoundElemMsgContent) o;
    return Objects.equals(this.url, tiMSoundElemMsgContent.url) &&
        Objects.equals(this.UUID, tiMSoundElemMsgContent.UUID) &&
        Objects.equals(this.size, tiMSoundElemMsgContent.size) &&
        Objects.equals(this.second, tiMSoundElemMsgContent.second) &&
        Objects.equals(this.downloadFlag, tiMSoundElemMsgContent.downloadFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, UUID, size, second, downloadFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TIMSoundElemMsgContent {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    UUID: ").append(toIndentedString(UUID)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
    sb.append("    downloadFlag: ").append(toIndentedString(downloadFlag)).append("\n");
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

