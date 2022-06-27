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
 * TIMFileElemMsgContent
 */

public class TIMFileElemMsgContent {
  public static final String SERIALIZED_NAME_URL = "Url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_U_U_I_D = "UUID";
  @SerializedName(SERIALIZED_NAME_U_U_I_D)
  private String UUID;

  public static final String SERIALIZED_NAME_FILE_NAME = "FileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_FILE_SIZE = "FileSize";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE)
  private Integer fileSize;

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

  public String getUrl() {
    return url;
  }


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
  @ApiModelProperty(required = true, value = "")

  public String getUUID() {
    return UUID;
  }


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
  @ApiModelProperty(required = true, value = "")

  public String getFileName() {
    return fileName;
  }


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
  @ApiModelProperty(required = true, value = "")

  public Integer getFileSize() {
    return fileSize;
  }


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

  public DownloadFlagEnum getDownloadFlag() {
    return downloadFlag;
  }


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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("Url");
    openapiFields.add("UUID");
    openapiFields.add("FileName");
    openapiFields.add("FileSize");
    openapiFields.add("Download_Flag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("UUID");
    openapiRequiredFields.add("FileName");
    openapiRequiredFields.add("FileSize");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TIMFileElemMsgContent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TIMFileElemMsgContent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TIMFileElemMsgContent is not found in the empty JSON string", TIMFileElemMsgContent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TIMFileElemMsgContent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TIMFileElemMsgContent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TIMFileElemMsgContent.openapiRequiredFields) {
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
      if (jsonObj.get("FileName") != null && !jsonObj.get("FileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FileName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TIMFileElemMsgContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TIMFileElemMsgContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TIMFileElemMsgContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TIMFileElemMsgContent.class));

       return (TypeAdapter<T>) new TypeAdapter<TIMFileElemMsgContent>() {
           @Override
           public void write(JsonWriter out, TIMFileElemMsgContent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TIMFileElemMsgContent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TIMFileElemMsgContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TIMFileElemMsgContent
  * @throws IOException if the JSON string is invalid with respect to TIMFileElemMsgContent
  */
  public static TIMFileElemMsgContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TIMFileElemMsgContent.class);
  }

 /**
  * Convert an instance of TIMFileElemMsgContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

