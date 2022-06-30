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
import com.tencentcloudapi.im.model.GetOperateMsgHistoryResponseAllOfFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * GetOperateMsgHistoryResponseAllOf
 */

public class GetOperateMsgHistoryResponseAllOf {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FILE = "File";
  @SerializedName(SERIALIZED_NAME_FILE)
  private List<GetOperateMsgHistoryResponseAllOfFile> _file = null;

  public GetOperateMsgHistoryResponseAllOf() { 
  }

  public GetOperateMsgHistoryResponseAllOf _file(List<GetOperateMsgHistoryResponseAllOfFile> _file) {
    
    this._file = _file;
    return this;
  }

  public GetOperateMsgHistoryResponseAllOf addFileItem(GetOperateMsgHistoryResponseAllOfFile _fileItem) {
    if (this._file == null) {
      this._file = new ArrayList<>();
    }
    this._file.add(_fileItem);
    return this;
  }

   /**
   * 消息记录文件下载信息
   * @return _file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息记录文件下载信息")

  public List<GetOperateMsgHistoryResponseAllOfFile> getFile() {
    return _file;
  }


  public void setFile(List<GetOperateMsgHistoryResponseAllOfFile> _file) {
    this._file = _file;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOperateMsgHistoryResponseAllOf getOperateMsgHistoryResponseAllOf = (GetOperateMsgHistoryResponseAllOf) o;
    return Objects.equals(this._file, getOperateMsgHistoryResponseAllOf._file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOperateMsgHistoryResponseAllOf {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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
    openapiFields.add("File");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetOperateMsgHistoryResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetOperateMsgHistoryResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetOperateMsgHistoryResponseAllOf is not found in the empty JSON string", GetOperateMsgHistoryResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetOperateMsgHistoryResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetOperateMsgHistoryResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArray_file = jsonObj.getAsJsonArray("File");
      if (jsonArray_file != null) {
        // ensure the json data is an array
        if (!jsonObj.get("File").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `File` to be an array in the JSON string but got `%s`", jsonObj.get("File").toString()));
        }

        // validate the optional field `File` (array)
        for (int i = 0; i < jsonArray_file.size(); i++) {
          GetOperateMsgHistoryResponseAllOfFile.validateJsonObject(jsonArray_file.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetOperateMsgHistoryResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetOperateMsgHistoryResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetOperateMsgHistoryResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetOperateMsgHistoryResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetOperateMsgHistoryResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GetOperateMsgHistoryResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetOperateMsgHistoryResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetOperateMsgHistoryResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetOperateMsgHistoryResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GetOperateMsgHistoryResponseAllOf
  */
  public static GetOperateMsgHistoryResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetOperateMsgHistoryResponseAllOf.class);
  }

 /**
  * Convert an instance of GetOperateMsgHistoryResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

