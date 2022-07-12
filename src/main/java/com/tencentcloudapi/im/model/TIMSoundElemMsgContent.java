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
 * TIMSoundElemMsgContent
 */

public class TIMSoundElemMsgContent {
  public static final String SERIALIZED_NAME_URL = "Url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_U_U_I_D = "UUID";
  @SerializedName(SERIALIZED_NAME_U_U_I_D)
  private String UUID;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_SECOND = "Second";
  @SerializedName(SERIALIZED_NAME_SECOND)
  private Integer second;

  /**
   * Gets or Sets downloadFlag
   */
  @JsonAdapter(DownloadFlagEnum.Adapter.class)
  public enum DownloadFlagEnum {
    NUMBER_2(2);

    private Integer value;

    DownloadFlagEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DownloadFlagEnum fromValue(Integer value) {
      for (DownloadFlagEnum b : DownloadFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DownloadFlagEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DownloadFlagEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DownloadFlagEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return DownloadFlagEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DOWNLOAD_FLAG = "Download_Flag";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_FLAG)
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
  @ApiModelProperty(required = true, value = "")

  public String getUrl() {
    return url;
  }


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
  @ApiModelProperty(required = true, value = "")

  public String getUUID() {
    return UUID;
  }


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

  public Integer getSize() {
    return size;
  }


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

  public Integer getSecond() {
    return second;
  }


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
  @ApiModelProperty(required = true, value = "")

  public DownloadFlagEnum getDownloadFlag() {
    return downloadFlag;
  }


  public void setDownloadFlag(DownloadFlagEnum downloadFlag) {
    this.downloadFlag = downloadFlag;
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
  public TIMSoundElemMsgContent putAdditionalProperty(String key, Object value) {
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
    TIMSoundElemMsgContent tiMSoundElemMsgContent = (TIMSoundElemMsgContent) o;
    return Objects.equals(this.url, tiMSoundElemMsgContent.url) &&
        Objects.equals(this.UUID, tiMSoundElemMsgContent.UUID) &&
        Objects.equals(this.size, tiMSoundElemMsgContent.size) &&
        Objects.equals(this.second, tiMSoundElemMsgContent.second) &&
        Objects.equals(this.downloadFlag, tiMSoundElemMsgContent.downloadFlag)&&
        Objects.equals(this.additionalProperties, tiMSoundElemMsgContent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, UUID, size, second, downloadFlag, additionalProperties);
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
    openapiFields.add("Url");
    openapiFields.add("UUID");
    openapiFields.add("Size");
    openapiFields.add("Second");
    openapiFields.add("Download_Flag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Url");
    openapiRequiredFields.add("UUID");
    openapiRequiredFields.add("Download_Flag");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TIMSoundElemMsgContent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TIMSoundElemMsgContent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TIMSoundElemMsgContent is not found in the empty JSON string", TIMSoundElemMsgContent.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TIMSoundElemMsgContent.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Url") != null && !jsonObj.get("Url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Url").toString()));
      }
      if (jsonObj.get("UUID") != null && !jsonObj.get("UUID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UUID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UUID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TIMSoundElemMsgContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TIMSoundElemMsgContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TIMSoundElemMsgContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TIMSoundElemMsgContent.class));

       return (TypeAdapter<T>) new TypeAdapter<TIMSoundElemMsgContent>() {
           @Override
           public void write(JsonWriter out, TIMSoundElemMsgContent value) throws IOException {
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
           public TIMSoundElemMsgContent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TIMSoundElemMsgContent instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TIMSoundElemMsgContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TIMSoundElemMsgContent
  * @throws IOException if the JSON string is invalid with respect to TIMSoundElemMsgContent
  */
  public static TIMSoundElemMsgContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TIMSoundElemMsgContent.class);
  }

 /**
  * Convert an instance of TIMSoundElemMsgContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

