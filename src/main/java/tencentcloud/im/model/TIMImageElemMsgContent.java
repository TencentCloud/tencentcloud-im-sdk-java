
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
import tencentcloud.im.model.ImageInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * TIMImageElemMsgContent
 */
@JsonPropertyOrder({
  TIMImageElemMsgContent.JSON_PROPERTY_U_U_I_D,
  TIMImageElemMsgContent.JSON_PROPERTY_IMAGE_FORMAT,
  TIMImageElemMsgContent.JSON_PROPERTY_IMAGE_INFO_ARRAY,
  TIMImageElemMsgContent.JSON_PROPERTY_TYPE,
  TIMImageElemMsgContent.JSON_PROPERTY_SIZE,
  TIMImageElemMsgContent.JSON_PROPERTY_WIDTH,
  TIMImageElemMsgContent.JSON_PROPERTY_HEIGHT,
  TIMImageElemMsgContent.JSON_PROPERTY_U_R_L
})
@JsonTypeName("TIMImageElem_MsgContent")

public class TIMImageElemMsgContent {
  public static final String JSON_PROPERTY_U_U_I_D = "UUID";
  private String UUID;

  /**
   * Gets or Sets imageFormat
   */
  public enum ImageFormatEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_255(255);

    private Integer value;

    ImageFormatEnum(Integer value) {
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
    public static ImageFormatEnum fromValue(Integer value) {
      for (ImageFormatEnum b : ImageFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IMAGE_FORMAT = "ImageFormat";
  private ImageFormatEnum imageFormat;

  public static final String JSON_PROPERTY_IMAGE_INFO_ARRAY = "ImageInfoArray";
  private List<ImageInfo> imageInfoArray = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3);

    private Integer value;

    TypeEnum(Integer value) {
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
    public static TypeEnum fromValue(Integer value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "Type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_SIZE = "Size";
  private Integer size;

  public static final String JSON_PROPERTY_WIDTH = "Width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "Height";
  private Integer height;

  public static final String JSON_PROPERTY_U_R_L = "URL";
  private String URL;

  public TIMImageElemMsgContent() { 
  }

  public TIMImageElemMsgContent UUID(String UUID) {
    
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


  public TIMImageElemMsgContent imageFormat(ImageFormatEnum imageFormat) {
    
    this.imageFormat = imageFormat;
    return this;
  }

   /**
   * Get imageFormat
   * @return imageFormat
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ImageFormatEnum getImageFormat() {
    return imageFormat;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImageFormat(ImageFormatEnum imageFormat) {
    this.imageFormat = imageFormat;
  }


  public TIMImageElemMsgContent imageInfoArray(List<ImageInfo> imageInfoArray) {
    
    this.imageInfoArray = imageInfoArray;
    return this;
  }

  public TIMImageElemMsgContent addImageInfoArrayItem(ImageInfo imageInfoArrayItem) {
    if (this.imageInfoArray == null) {
      this.imageInfoArray = new ArrayList<>();
    }
    this.imageInfoArray.add(imageInfoArrayItem);
    return this;
  }

   /**
   * Get imageInfoArray
   * @return imageInfoArray
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_INFO_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ImageInfo> getImageInfoArray() {
    return imageInfoArray;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_INFO_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageInfoArray(List<ImageInfo> imageInfoArray) {
    this.imageInfoArray = imageInfoArray;
  }


  public TIMImageElemMsgContent type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public TIMImageElemMsgContent size(Integer size) {
    
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


  public TIMImageElemMsgContent width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public TIMImageElemMsgContent height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  public TIMImageElemMsgContent URL(String URL) {
    
    this.URL = URL;
    return this;
  }

   /**
   * Get URL
   * @return URL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getURL() {
    return URL;
  }


  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setURL(String URL) {
    this.URL = URL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TIMImageElemMsgContent tiMImageElemMsgContent = (TIMImageElemMsgContent) o;
    return Objects.equals(this.UUID, tiMImageElemMsgContent.UUID) &&
        Objects.equals(this.imageFormat, tiMImageElemMsgContent.imageFormat) &&
        Objects.equals(this.imageInfoArray, tiMImageElemMsgContent.imageInfoArray) &&
        Objects.equals(this.type, tiMImageElemMsgContent.type) &&
        Objects.equals(this.size, tiMImageElemMsgContent.size) &&
        Objects.equals(this.width, tiMImageElemMsgContent.width) &&
        Objects.equals(this.height, tiMImageElemMsgContent.height) &&
        Objects.equals(this.URL, tiMImageElemMsgContent.URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(UUID, imageFormat, imageInfoArray, type, size, width, height, URL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TIMImageElemMsgContent {\n");
    sb.append("    UUID: ").append(toIndentedString(UUID)).append("\n");
    sb.append("    imageFormat: ").append(toIndentedString(imageFormat)).append("\n");
    sb.append("    imageInfoArray: ").append(toIndentedString(imageInfoArray)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
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

