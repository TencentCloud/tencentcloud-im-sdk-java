/*
 * TIM SERVER REST API SDK
 * TIM REST API
 */


package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.tencentcloudapi.im.JSON;

/**
 * TIMVideoFileElemMsgContent
 */

public class TIMVideoFileElemMsgContent {
  public static final String SERIALIZED_NAME_VIDEO_URL = "VideoUrl";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl;

  public static final String SERIALIZED_NAME_VIDEO_U_U_I_D = "VideoUUID";
  @SerializedName(SERIALIZED_NAME_VIDEO_U_U_I_D)
  private String videoUUID;

  public static final String SERIALIZED_NAME_VIDEO_SIZE = "VideoSize";
  @SerializedName(SERIALIZED_NAME_VIDEO_SIZE)
  private Integer videoSize;

  public static final String SERIALIZED_NAME_VIDEO_SECOND = "VideoSecond";
  @SerializedName(SERIALIZED_NAME_VIDEO_SECOND)
  private Integer videoSecond;

  public static final String SERIALIZED_NAME_VIDEO_FORMAT = "VideoFormat";
  @SerializedName(SERIALIZED_NAME_VIDEO_FORMAT)
  private String videoFormat;

  /**
   * Gets or Sets videoDownloadFlag
   */
  @JsonAdapter(VideoDownloadFlagEnum.Adapter.class)
  public enum VideoDownloadFlagEnum {
    NUMBER_2(2);

    private Integer value;

    VideoDownloadFlagEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VideoDownloadFlagEnum fromValue(Integer value) {
      for (VideoDownloadFlagEnum b : VideoDownloadFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VideoDownloadFlagEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VideoDownloadFlagEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VideoDownloadFlagEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return VideoDownloadFlagEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIDEO_DOWNLOAD_FLAG = "VideoDownloadFlag";
  @SerializedName(SERIALIZED_NAME_VIDEO_DOWNLOAD_FLAG)
  private VideoDownloadFlagEnum videoDownloadFlag;

  public static final String SERIALIZED_NAME_THUMB_URL = "ThumbUrl";
  @SerializedName(SERIALIZED_NAME_THUMB_URL)
  private String thumbUrl;

  public static final String SERIALIZED_NAME_THUMB_U_U_I_D = "ThumbUUID";
  @SerializedName(SERIALIZED_NAME_THUMB_U_U_I_D)
  private String thumbUUID;

  public static final String SERIALIZED_NAME_THUMB_SIZE = "ThumbSize";
  @SerializedName(SERIALIZED_NAME_THUMB_SIZE)
  private Integer thumbSize;

  public static final String SERIALIZED_NAME_THUMB_WIDTH = "ThumbWidth";
  @SerializedName(SERIALIZED_NAME_THUMB_WIDTH)
  private Integer thumbWidth;

  public static final String SERIALIZED_NAME_THUMB_HEIGHT = "ThumbHeight";
  @SerializedName(SERIALIZED_NAME_THUMB_HEIGHT)
  private Integer thumbHeight;

  public static final String SERIALIZED_NAME_THUMB_FORMAT = "ThumbFormat";
  @SerializedName(SERIALIZED_NAME_THUMB_FORMAT)
  private String thumbFormat;

  /**
   * Gets or Sets thumbDownloadFlag
   */
  @JsonAdapter(ThumbDownloadFlagEnum.Adapter.class)
  public enum ThumbDownloadFlagEnum {
    NUMBER_2(2);

    private Integer value;

    ThumbDownloadFlagEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ThumbDownloadFlagEnum fromValue(Integer value) {
      for (ThumbDownloadFlagEnum b : ThumbDownloadFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ThumbDownloadFlagEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ThumbDownloadFlagEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ThumbDownloadFlagEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ThumbDownloadFlagEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_THUMB_DOWNLOAD_FLAG = "ThumbDownloadFlag";
  @SerializedName(SERIALIZED_NAME_THUMB_DOWNLOAD_FLAG)
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

  public String getVideoUrl() {
    return videoUrl;
  }


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
  @ApiModelProperty(required = true, value = "")

  public String getVideoUUID() {
    return videoUUID;
  }


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
  @ApiModelProperty(required = true, value = "")

  public Integer getVideoSize() {
    return videoSize;
  }


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
  @ApiModelProperty(required = true, value = "")

  public Integer getVideoSecond() {
    return videoSecond;
  }


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
  @ApiModelProperty(required = true, value = "")

  public String getVideoFormat() {
    return videoFormat;
  }


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

  public VideoDownloadFlagEnum getVideoDownloadFlag() {
    return videoDownloadFlag;
  }


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

  public String getThumbUrl() {
    return thumbUrl;
  }


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
  @ApiModelProperty(required = true, value = "")

  public String getThumbUUID() {
    return thumbUUID;
  }


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
  @ApiModelProperty(required = true, value = "")

  public Integer getThumbSize() {
    return thumbSize;
  }


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
  @ApiModelProperty(required = true, value = "")

  public Integer getThumbWidth() {
    return thumbWidth;
  }


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
  @ApiModelProperty(required = true, value = "")

  public Integer getThumbHeight() {
    return thumbHeight;
  }


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
  @ApiModelProperty(required = true, value = "")

  public String getThumbFormat() {
    return thumbFormat;
  }


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

  public ThumbDownloadFlagEnum getThumbDownloadFlag() {
    return thumbDownloadFlag;
  }


  public void setThumbDownloadFlag(ThumbDownloadFlagEnum thumbDownloadFlag) {
    this.thumbDownloadFlag = thumbDownloadFlag;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public TIMVideoFileElemMsgContent putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
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
        Objects.equals(this.thumbDownloadFlag, tiMVideoFileElemMsgContent.thumbDownloadFlag)&&
        Objects.equals(this.additionalProperties, tiMVideoFileElemMsgContent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoUrl, videoUUID, videoSize, videoSecond, videoFormat, videoDownloadFlag, thumbUrl, thumbUUID, thumbSize, thumbWidth, thumbHeight, thumbFormat, thumbDownloadFlag, additionalProperties);
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
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("VideoUrl");
    openapiFields.add("VideoUUID");
    openapiFields.add("VideoSize");
    openapiFields.add("VideoSecond");
    openapiFields.add("VideoFormat");
    openapiFields.add("VideoDownloadFlag");
    openapiFields.add("ThumbUrl");
    openapiFields.add("ThumbUUID");
    openapiFields.add("ThumbSize");
    openapiFields.add("ThumbWidth");
    openapiFields.add("ThumbHeight");
    openapiFields.add("ThumbFormat");
    openapiFields.add("ThumbDownloadFlag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("VideoUUID");
    openapiRequiredFields.add("VideoSize");
    openapiRequiredFields.add("VideoSecond");
    openapiRequiredFields.add("VideoFormat");
    openapiRequiredFields.add("ThumbUUID");
    openapiRequiredFields.add("ThumbSize");
    openapiRequiredFields.add("ThumbWidth");
    openapiRequiredFields.add("ThumbHeight");
    openapiRequiredFields.add("ThumbFormat");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TIMVideoFileElemMsgContent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TIMVideoFileElemMsgContent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TIMVideoFileElemMsgContent is not found in the empty JSON string", TIMVideoFileElemMsgContent.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TIMVideoFileElemMsgContent.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("VideoUrl") != null && !jsonObj.get("VideoUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VideoUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VideoUrl").toString()));
      }
      if (jsonObj.get("VideoUUID") != null && !jsonObj.get("VideoUUID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VideoUUID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VideoUUID").toString()));
      }
      if (jsonObj.get("VideoFormat") != null && !jsonObj.get("VideoFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VideoFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VideoFormat").toString()));
      }
      if (jsonObj.get("ThumbUrl") != null && !jsonObj.get("ThumbUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ThumbUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ThumbUrl").toString()));
      }
      if (jsonObj.get("ThumbUUID") != null && !jsonObj.get("ThumbUUID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ThumbUUID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ThumbUUID").toString()));
      }
      if (jsonObj.get("ThumbFormat") != null && !jsonObj.get("ThumbFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ThumbFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ThumbFormat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TIMVideoFileElemMsgContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TIMVideoFileElemMsgContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TIMVideoFileElemMsgContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TIMVideoFileElemMsgContent.class));

       return (TypeAdapter<T>) new TypeAdapter<TIMVideoFileElemMsgContent>() {
           @Override
           public void write(JsonWriter out, TIMVideoFileElemMsgContent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public TIMVideoFileElemMsgContent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TIMVideoFileElemMsgContent instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), Object.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TIMVideoFileElemMsgContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TIMVideoFileElemMsgContent
  * @throws IOException if the JSON string is invalid with respect to TIMVideoFileElemMsgContent
  */
  public static TIMVideoFileElemMsgContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TIMVideoFileElemMsgContent.class);
  }

 /**
  * Convert an instance of TIMVideoFileElemMsgContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

