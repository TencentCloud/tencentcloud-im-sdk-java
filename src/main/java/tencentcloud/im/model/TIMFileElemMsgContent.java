
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
 * TIMFileElemMsgContent
 */
@JsonPropertyOrder({
  TIMFileElemMsgContent.JSON_PROPERTY_URL,
  TIMFileElemMsgContent.JSON_PROPERTY_U_U_I_D,
  TIMFileElemMsgContent.JSON_PROPERTY_FILE_NAME,
  TIMFileElemMsgContent.JSON_PROPERTY_FILE_SIZE,
  TIMFileElemMsgContent.JSON_PROPERTY_DOWNLOAD_FLAG
})
@JsonTypeName("TIMFileElem_MsgContent")

public class TIMFileElemMsgContent {
  public static final String JSON_PROPERTY_URL = "Url";
  private String url;

  public static final String JSON_PROPERTY_U_U_I_D = "UUID";
  private String UUID;

  public static final String JSON_PROPERTY_FILE_NAME = "FileName";
  private String fileName;

  public static final String JSON_PROPERTY_FILE_SIZE = "FileSize";
  private Integer fileSize;

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
  private DownloadFlagEnum downloadFlag;

  public TIMFileElemMsgContent() { 
  }

  public TIMFileElemMsgContent url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public TIMFileElemMsgContent UUID(String UUID) {
    
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


  public TIMFileElemMsgContent fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public TIMFileElemMsgContent fileSize(Integer fileSize) {
    
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Get fileSize
   * @return fileSize
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }


  public TIMFileElemMsgContent downloadFlag(DownloadFlagEnum downloadFlag) {
    
    this.downloadFlag = downloadFlag;
    return this;
  }

   /**
   * Get downloadFlag
   * @return downloadFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DownloadFlagEnum getDownloadFlag() {
    return downloadFlag;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    TIMFileElemMsgContent tiMFileElemMsgContent = (TIMFileElemMsgContent) o;
    return Objects.equals(this.url, tiMFileElemMsgContent.url) &&
        Objects.equals(this.UUID, tiMFileElemMsgContent.UUID) &&
        Objects.equals(this.fileName, tiMFileElemMsgContent.fileName) &&
        Objects.equals(this.fileSize, tiMFileElemMsgContent.fileSize) &&
        Objects.equals(this.downloadFlag, tiMFileElemMsgContent.downloadFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, UUID, fileName, fileSize, downloadFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TIMFileElemMsgContent {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    UUID: ").append(toIndentedString(UUID)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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

