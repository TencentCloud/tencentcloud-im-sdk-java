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
import com.tencentcloudapi.im.model.ImageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * TIMImageElemMsgContent
 */

public class TIMImageElemMsgContent {
  public static final String SERIALIZED_NAME_U_U_I_D = "UUID";
  @SerializedName(SERIALIZED_NAME_U_U_I_D)
  private String UUID;

  /**
   * Gets or Sets imageFormat
   */
  @JsonAdapter(ImageFormatEnum.Adapter.class)
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

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImageFormatEnum fromValue(Integer value) {
      for (ImageFormatEnum b : ImageFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ImageFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImageFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImageFormatEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ImageFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IMAGE_FORMAT = "ImageFormat";
  @SerializedName(SERIALIZED_NAME_IMAGE_FORMAT)
  private ImageFormatEnum imageFormat;

  public static final String SERIALIZED_NAME_IMAGE_INFO_ARRAY = "ImageInfoArray";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO_ARRAY)
  private List<ImageInfo> imageInfoArray = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3);

    private Integer value;

    TypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(Integer value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_WIDTH = "Width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "Height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_U_R_L = "URL";
  @SerializedName(SERIALIZED_NAME_U_R_L)
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
  @ApiModelProperty(required = true, value = "")

  public String getUUID() {
    return UUID;
  }


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
  @ApiModelProperty(required = true, value = "")

  public ImageFormatEnum getImageFormat() {
    return imageFormat;
  }


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
  @ApiModelProperty(value = "")

  public List<ImageInfo> getImageInfoArray() {
    return imageInfoArray;
  }


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

  public TypeEnum getType() {
    return type;
  }


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

  public Integer getSize() {
    return size;
  }


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

  public Integer getWidth() {
    return width;
  }


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

  public Integer getHeight() {
    return height;
  }


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

  public String getURL() {
    return URL;
  }


  public void setURL(String URL) {
    this.URL = URL;
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
  public TIMImageElemMsgContent putAdditionalProperty(String key, Object value) {
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
    TIMImageElemMsgContent tiMImageElemMsgContent = (TIMImageElemMsgContent) o;
    return Objects.equals(this.UUID, tiMImageElemMsgContent.UUID) &&
        Objects.equals(this.imageFormat, tiMImageElemMsgContent.imageFormat) &&
        Objects.equals(this.imageInfoArray, tiMImageElemMsgContent.imageInfoArray) &&
        Objects.equals(this.type, tiMImageElemMsgContent.type) &&
        Objects.equals(this.size, tiMImageElemMsgContent.size) &&
        Objects.equals(this.width, tiMImageElemMsgContent.width) &&
        Objects.equals(this.height, tiMImageElemMsgContent.height) &&
        Objects.equals(this.URL, tiMImageElemMsgContent.URL)&&
        Objects.equals(this.additionalProperties, tiMImageElemMsgContent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(UUID, imageFormat, imageInfoArray, type, size, width, height, URL, additionalProperties);
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
    openapiFields.add("UUID");
    openapiFields.add("ImageFormat");
    openapiFields.add("ImageInfoArray");
    openapiFields.add("Type");
    openapiFields.add("Size");
    openapiFields.add("Width");
    openapiFields.add("Height");
    openapiFields.add("URL");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("UUID");
    openapiRequiredFields.add("ImageFormat");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TIMImageElemMsgContent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TIMImageElemMsgContent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TIMImageElemMsgContent is not found in the empty JSON string", TIMImageElemMsgContent.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TIMImageElemMsgContent.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("UUID") != null && !jsonObj.get("UUID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UUID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UUID").toString()));
      }
      JsonArray jsonArrayimageInfoArray = jsonObj.getAsJsonArray("ImageInfoArray");
      if (jsonArrayimageInfoArray != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ImageInfoArray").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ImageInfoArray` to be an array in the JSON string but got `%s`", jsonObj.get("ImageInfoArray").toString()));
        }

        // validate the optional field `ImageInfoArray` (array)
        for (int i = 0; i < jsonArrayimageInfoArray.size(); i++) {
          ImageInfo.validateJsonObject(jsonArrayimageInfoArray.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("URL") != null && !jsonObj.get("URL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `URL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("URL").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TIMImageElemMsgContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TIMImageElemMsgContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TIMImageElemMsgContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TIMImageElemMsgContent.class));

       return (TypeAdapter<T>) new TypeAdapter<TIMImageElemMsgContent>() {
           @Override
           public void write(JsonWriter out, TIMImageElemMsgContent value) throws IOException {
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
           public TIMImageElemMsgContent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TIMImageElemMsgContent instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TIMImageElemMsgContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TIMImageElemMsgContent
  * @throws IOException if the JSON string is invalid with respect to TIMImageElemMsgContent
  */
  public static TIMImageElemMsgContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TIMImageElemMsgContent.class);
  }

 /**
  * Convert an instance of TIMImageElemMsgContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

