
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
 * TIMCustomElemMsgContent
 */
@JsonPropertyOrder({
  TIMCustomElemMsgContent.JSON_PROPERTY_DATA,
  TIMCustomElemMsgContent.JSON_PROPERTY_DESC,
  TIMCustomElemMsgContent.JSON_PROPERTY_EXT,
  TIMCustomElemMsgContent.JSON_PROPERTY_SOUND
})
@JsonTypeName("TIMCustomElem_MsgContent")

public class TIMCustomElemMsgContent {
  public static final String JSON_PROPERTY_DATA = "Data";
  private String data;

  public static final String JSON_PROPERTY_DESC = "Desc";
  private String desc;

  public static final String JSON_PROPERTY_EXT = "Ext";
  private String ext;

  public static final String JSON_PROPERTY_SOUND = "Sound";
  private String sound;

  public TIMCustomElemMsgContent() { 
  }

  public TIMCustomElemMsgContent data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(String data) {
    this.data = data;
  }


  public TIMCustomElemMsgContent desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public TIMCustomElemMsgContent ext(String ext) {
    
    this.ext = ext;
    return this;
  }

   /**
   * Get ext
   * @return ext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public TIMCustomElemMsgContent sound(String sound) {
    
    this.sound = sound;
    return this;
  }

   /**
   * Get sound
   * @return sound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSound() {
    return sound;
  }


  @JsonProperty(JSON_PROPERTY_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSound(String sound) {
    this.sound = sound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TIMCustomElemMsgContent tiMCustomElemMsgContent = (TIMCustomElemMsgContent) o;
    return Objects.equals(this.data, tiMCustomElemMsgContent.data) &&
        Objects.equals(this.desc, tiMCustomElemMsgContent.desc) &&
        Objects.equals(this.ext, tiMCustomElemMsgContent.ext) &&
        Objects.equals(this.sound, tiMCustomElemMsgContent.sound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, desc, ext, sound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TIMCustomElemMsgContent {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    sound: ").append(toIndentedString(sound)).append("\n");
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

