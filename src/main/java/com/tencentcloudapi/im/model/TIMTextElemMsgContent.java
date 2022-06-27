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
 * 对于每种 MsgType 用不同的 MsgContent 格式
 */
@ApiModel(description = "对于每种 MsgType 用不同的 MsgContent 格式")

public class TIMTextElemMsgContent {
  public static final String SERIALIZED_NAME_TEXT = "Text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public TIMTextElemMsgContent() { 
  }

  public TIMTextElemMsgContent text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TIMTextElemMsgContent tiMTextElemMsgContent = (TIMTextElemMsgContent) o;
    return Objects.equals(this.text, tiMTextElemMsgContent.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TIMTextElemMsgContent {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    openapiFields.add("Text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Text");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TIMTextElemMsgContent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TIMTextElemMsgContent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TIMTextElemMsgContent is not found in the empty JSON string", TIMTextElemMsgContent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TIMTextElemMsgContent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TIMTextElemMsgContent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TIMTextElemMsgContent.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Text") != null && !jsonObj.get("Text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TIMTextElemMsgContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TIMTextElemMsgContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TIMTextElemMsgContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TIMTextElemMsgContent.class));

       return (TypeAdapter<T>) new TypeAdapter<TIMTextElemMsgContent>() {
           @Override
           public void write(JsonWriter out, TIMTextElemMsgContent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TIMTextElemMsgContent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TIMTextElemMsgContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TIMTextElemMsgContent
  * @throws IOException if the JSON string is invalid with respect to TIMTextElemMsgContent
  */
  public static TIMTextElemMsgContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TIMTextElemMsgContent.class);
  }

 /**
  * Convert an instance of TIMTextElemMsgContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

