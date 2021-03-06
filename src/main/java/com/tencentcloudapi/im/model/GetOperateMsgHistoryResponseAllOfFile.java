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
 * GetOperateMsgHistoryResponseAllOfFile
 */

public class GetOperateMsgHistoryResponseAllOfFile {
  public static final String SERIALIZED_NAME_U_R_L = "URL";
  @SerializedName(SERIALIZED_NAME_U_R_L)
  private String URL;

  public static final String SERIALIZED_NAME_EXPIRE_TIME = "ExpireTime";
  @SerializedName(SERIALIZED_NAME_EXPIRE_TIME)
  private String expireTime;

  public static final String SERIALIZED_NAME_FILE_SIZE = "FileSize";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE)
  private Integer fileSize;

  public static final String SERIALIZED_NAME_FILE_M_D5 = "FileMD5";
  @SerializedName(SERIALIZED_NAME_FILE_M_D5)
  private String fileMD5;

  public static final String SERIALIZED_NAME_GZIP_SIZE = "GzipSize";
  @SerializedName(SERIALIZED_NAME_GZIP_SIZE)
  private Integer gzipSize;

  public static final String SERIALIZED_NAME_GZIP_M_D5 = "GzipMD5";
  @SerializedName(SERIALIZED_NAME_GZIP_M_D5)
  private String gzipMD5;

  public GetOperateMsgHistoryResponseAllOfFile() { 
  }

  public GetOperateMsgHistoryResponseAllOfFile URL(String URL) {
    
    this.URL = URL;
    return this;
  }

   /**
   * ??????????????????????????????
   * @return URL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????????????????")

  public String getURL() {
    return URL;
  }


  public void setURL(String URL) {
    this.URL = URL;
  }


  public GetOperateMsgHistoryResponseAllOfFile expireTime(String expireTime) {
    
    this.expireTime = expireTime;
    return this;
  }

   /**
   * ?????????????????????????????????????????????????????????????????????????????????????????????????????????
   * @return expireTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????????????????????????????????????????????????????????????????????????????")

  public String getExpireTime() {
    return expireTime;
  }


  public void setExpireTime(String expireTime) {
    this.expireTime = expireTime;
  }


  public GetOperateMsgHistoryResponseAllOfFile fileSize(Integer fileSize) {
    
    this.fileSize = fileSize;
    return this;
  }

   /**
   * GZip ????????????????????????????????? Byte???
   * @return fileSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GZip ????????????????????????????????? Byte???")

  public Integer getFileSize() {
    return fileSize;
  }


  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }


  public GetOperateMsgHistoryResponseAllOfFile fileMD5(String fileMD5) {
    
    this.fileMD5 = fileMD5;
    return this;
  }

   /**
   * GZip ?????????????????? MD5
   * @return fileMD5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GZip ?????????????????? MD5")

  public String getFileMD5() {
    return fileMD5;
  }


  public void setFileMD5(String fileMD5) {
    this.fileMD5 = fileMD5;
  }


  public GetOperateMsgHistoryResponseAllOfFile gzipSize(Integer gzipSize) {
    
    this.gzipSize = gzipSize;
    return this;
  }

   /**
   * GZip ????????????????????????????????? Byte???
   * @return gzipSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GZip ????????????????????????????????? Byte???")

  public Integer getGzipSize() {
    return gzipSize;
  }


  public void setGzipSize(Integer gzipSize) {
    this.gzipSize = gzipSize;
  }


  public GetOperateMsgHistoryResponseAllOfFile gzipMD5(String gzipMD5) {
    
    this.gzipMD5 = gzipMD5;
    return this;
  }

   /**
   * GZip ?????????????????? MD5
   * @return gzipMD5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GZip ?????????????????? MD5")

  public String getGzipMD5() {
    return gzipMD5;
  }


  public void setGzipMD5(String gzipMD5) {
    this.gzipMD5 = gzipMD5;
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
  public GetOperateMsgHistoryResponseAllOfFile putAdditionalProperty(String key, Object value) {
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
    GetOperateMsgHistoryResponseAllOfFile getOperateMsgHistoryResponseAllOfFile = (GetOperateMsgHistoryResponseAllOfFile) o;
    return Objects.equals(this.URL, getOperateMsgHistoryResponseAllOfFile.URL) &&
        Objects.equals(this.expireTime, getOperateMsgHistoryResponseAllOfFile.expireTime) &&
        Objects.equals(this.fileSize, getOperateMsgHistoryResponseAllOfFile.fileSize) &&
        Objects.equals(this.fileMD5, getOperateMsgHistoryResponseAllOfFile.fileMD5) &&
        Objects.equals(this.gzipSize, getOperateMsgHistoryResponseAllOfFile.gzipSize) &&
        Objects.equals(this.gzipMD5, getOperateMsgHistoryResponseAllOfFile.gzipMD5)&&
        Objects.equals(this.additionalProperties, getOperateMsgHistoryResponseAllOfFile.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(URL, expireTime, fileSize, fileMD5, gzipSize, gzipMD5, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOperateMsgHistoryResponseAllOfFile {\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileMD5: ").append(toIndentedString(fileMD5)).append("\n");
    sb.append("    gzipSize: ").append(toIndentedString(gzipSize)).append("\n");
    sb.append("    gzipMD5: ").append(toIndentedString(gzipMD5)).append("\n");
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
    openapiFields.add("URL");
    openapiFields.add("ExpireTime");
    openapiFields.add("FileSize");
    openapiFields.add("FileMD5");
    openapiFields.add("GzipSize");
    openapiFields.add("GzipMD5");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetOperateMsgHistoryResponseAllOfFile
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetOperateMsgHistoryResponseAllOfFile.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetOperateMsgHistoryResponseAllOfFile is not found in the empty JSON string", GetOperateMsgHistoryResponseAllOfFile.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("URL") != null && !jsonObj.get("URL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `URL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("URL").toString()));
      }
      if (jsonObj.get("ExpireTime") != null && !jsonObj.get("ExpireTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExpireTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExpireTime").toString()));
      }
      if (jsonObj.get("FileMD5") != null && !jsonObj.get("FileMD5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FileMD5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FileMD5").toString()));
      }
      if (jsonObj.get("GzipMD5") != null && !jsonObj.get("GzipMD5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GzipMD5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GzipMD5").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetOperateMsgHistoryResponseAllOfFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetOperateMsgHistoryResponseAllOfFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetOperateMsgHistoryResponseAllOfFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetOperateMsgHistoryResponseAllOfFile.class));

       return (TypeAdapter<T>) new TypeAdapter<GetOperateMsgHistoryResponseAllOfFile>() {
           @Override
           public void write(JsonWriter out, GetOperateMsgHistoryResponseAllOfFile value) throws IOException {
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
           public GetOperateMsgHistoryResponseAllOfFile read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetOperateMsgHistoryResponseAllOfFile instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetOperateMsgHistoryResponseAllOfFile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetOperateMsgHistoryResponseAllOfFile
  * @throws IOException if the JSON string is invalid with respect to GetOperateMsgHistoryResponseAllOfFile
  */
  public static GetOperateMsgHistoryResponseAllOfFile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetOperateMsgHistoryResponseAllOfFile.class);
  }

 /**
  * Convert an instance of GetOperateMsgHistoryResponseAllOfFile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

