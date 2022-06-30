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
import java.io.Serializable;

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
 * TIMCustomElemMsgContent
 */

public class TIMCustomElemMsgContent {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "Data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_DESC = "Desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_EXT = "Ext";
  @SerializedName(SERIALIZED_NAME_EXT)
  private String ext;

  public static final String SERIALIZED_NAME_SOUND = "Sound";
  @SerializedName(SERIALIZED_NAME_SOUND)
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
  @ApiModelProperty(required = true, value = "")

  public String getData() {
    return data;
  }


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

  public String getDesc() {
    return desc;
  }


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

  public String getExt() {
    return ext;
  }


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

  public String getSound() {
    return sound;
  }


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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("Data");
    openapiFields.add("Desc");
    openapiFields.add("Ext");
    openapiFields.add("Sound");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Data");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TIMCustomElemMsgContent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TIMCustomElemMsgContent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TIMCustomElemMsgContent is not found in the empty JSON string", TIMCustomElemMsgContent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TIMCustomElemMsgContent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TIMCustomElemMsgContent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TIMCustomElemMsgContent.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Data") != null && !jsonObj.get("Data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Data").toString()));
      }
      if (jsonObj.get("Desc") != null && !jsonObj.get("Desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Desc").toString()));
      }
      if (jsonObj.get("Ext") != null && !jsonObj.get("Ext").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Ext` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Ext").toString()));
      }
      if (jsonObj.get("Sound") != null && !jsonObj.get("Sound").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Sound` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Sound").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TIMCustomElemMsgContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TIMCustomElemMsgContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TIMCustomElemMsgContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TIMCustomElemMsgContent.class));

       return (TypeAdapter<T>) new TypeAdapter<TIMCustomElemMsgContent>() {
           @Override
           public void write(JsonWriter out, TIMCustomElemMsgContent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TIMCustomElemMsgContent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TIMCustomElemMsgContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TIMCustomElemMsgContent
  * @throws IOException if the JSON string is invalid with respect to TIMCustomElemMsgContent
  */
  public static TIMCustomElemMsgContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TIMCustomElemMsgContent.class);
  }

 /**
  * Convert an instance of TIMCustomElemMsgContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

