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
import com.tencentcloudapi.im.model.TIMLocationElemMsgContent;
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
 * TIMLocationElem
 */

public class TIMLocationElem {
  public static final String SERIALIZED_NAME_MSG_TYPE = "MsgType";
  @SerializedName(SERIALIZED_NAME_MSG_TYPE)
  private String msgType = "TIMLocationElem";

  public static final String SERIALIZED_NAME_MSG_CONTENT = "MsgContent";
  @SerializedName(SERIALIZED_NAME_MSG_CONTENT)
  private TIMLocationElemMsgContent msgContent;

  public TIMLocationElem() { 
  }

  public TIMLocationElem msgType(String msgType) {
    
    this.msgType = msgType;
    return this;
  }

   /**
   * Get msgType
   * @return msgType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMsgType() {
    return msgType;
  }


  public void setMsgType(String msgType) {
    this.msgType = msgType;
  }


  public TIMLocationElem msgContent(TIMLocationElemMsgContent msgContent) {
    
    this.msgContent = msgContent;
    return this;
  }

   /**
   * Get msgContent
   * @return msgContent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TIMLocationElemMsgContent getMsgContent() {
    return msgContent;
  }


  public void setMsgContent(TIMLocationElemMsgContent msgContent) {
    this.msgContent = msgContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TIMLocationElem tiMLocationElem = (TIMLocationElem) o;
    return Objects.equals(this.msgType, tiMLocationElem.msgType) &&
        Objects.equals(this.msgContent, tiMLocationElem.msgContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgType, msgContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TIMLocationElem {\n");
    sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
    sb.append("    msgContent: ").append(toIndentedString(msgContent)).append("\n");
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
    openapiFields.add("MsgType");
    openapiFields.add("MsgContent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MsgType");
    openapiRequiredFields.add("MsgContent");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TIMLocationElem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TIMLocationElem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TIMLocationElem is not found in the empty JSON string", TIMLocationElem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TIMLocationElem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TIMLocationElem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TIMLocationElem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("MsgType") != null && !jsonObj.get("MsgType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MsgType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MsgType").toString()));
      }
      // validate the optional field `MsgContent`
      if (jsonObj.getAsJsonObject("MsgContent") != null) {
        TIMLocationElemMsgContent.validateJsonObject(jsonObj.getAsJsonObject("MsgContent"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TIMLocationElem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TIMLocationElem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TIMLocationElem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TIMLocationElem.class));

       return (TypeAdapter<T>) new TypeAdapter<TIMLocationElem>() {
           @Override
           public void write(JsonWriter out, TIMLocationElem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TIMLocationElem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TIMLocationElem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TIMLocationElem
  * @throws IOException if the JSON string is invalid with respect to TIMLocationElem
  */
  public static TIMLocationElem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TIMLocationElem.class);
  }

 /**
  * Convert an instance of TIMLocationElem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

