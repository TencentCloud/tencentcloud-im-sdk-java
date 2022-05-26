
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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * TIMLocationElemMsgContent
 */
@JsonPropertyOrder({
  TIMLocationElemMsgContent.JSON_PROPERTY_LONGITUDE,
  TIMLocationElemMsgContent.JSON_PROPERTY_LATITUDE,
  TIMLocationElemMsgContent.JSON_PROPERTY_DESC
})
@JsonTypeName("TIMLocationElem_MsgContent")

public class TIMLocationElemMsgContent {
  public static final String JSON_PROPERTY_LONGITUDE = "Longitude";
  private BigDecimal longitude;

  public static final String JSON_PROPERTY_LATITUDE = "Latitude";
  private BigDecimal latitude;

  public static final String JSON_PROPERTY_DESC = "Desc";
  private String desc;

  public TIMLocationElemMsgContent() { 
  }

  public TIMLocationElemMsgContent longitude(BigDecimal longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  public TIMLocationElemMsgContent latitude(BigDecimal latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }


  public TIMLocationElemMsgContent desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDesc() {
    return desc;
  }


  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDesc(String desc) {
    this.desc = desc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TIMLocationElemMsgContent tiMLocationElemMsgContent = (TIMLocationElemMsgContent) o;
    return Objects.equals(this.longitude, tiMLocationElemMsgContent.longitude) &&
        Objects.equals(this.latitude, tiMLocationElemMsgContent.latitude) &&
        Objects.equals(this.desc, tiMLocationElemMsgContent.desc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longitude, latitude, desc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TIMLocationElemMsgContent {\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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

