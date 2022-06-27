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
import com.tencentcloudapi.im.model.ImportGroupMsgResponseAllOfImportMsgResult;
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
 * ImportGroupMsgResponseAllOf
 */

public class ImportGroupMsgResponseAllOf {
  public static final String SERIALIZED_NAME_IMPORT_MSG_RESULT = "ImportMsgResult";
  @SerializedName(SERIALIZED_NAME_IMPORT_MSG_RESULT)
  private List<ImportGroupMsgResponseAllOfImportMsgResult> importMsgResult = null;

  public ImportGroupMsgResponseAllOf() { 
  }

  public ImportGroupMsgResponseAllOf importMsgResult(List<ImportGroupMsgResponseAllOfImportMsgResult> importMsgResult) {
    
    this.importMsgResult = importMsgResult;
    return this;
  }

  public ImportGroupMsgResponseAllOf addImportMsgResultItem(ImportGroupMsgResponseAllOfImportMsgResult importMsgResultItem) {
    if (this.importMsgResult == null) {
      this.importMsgResult = new ArrayList<>();
    }
    this.importMsgResult.add(importMsgResultItem);
    return this;
  }

   /**
   * 具体的消息导入结果
   * @return importMsgResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "具体的消息导入结果")

  public List<ImportGroupMsgResponseAllOfImportMsgResult> getImportMsgResult() {
    return importMsgResult;
  }


  public void setImportMsgResult(List<ImportGroupMsgResponseAllOfImportMsgResult> importMsgResult) {
    this.importMsgResult = importMsgResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupMsgResponseAllOf importGroupMsgResponseAllOf = (ImportGroupMsgResponseAllOf) o;
    return Objects.equals(this.importMsgResult, importGroupMsgResponseAllOf.importMsgResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importMsgResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMsgResponseAllOf {\n");
    sb.append("    importMsgResult: ").append(toIndentedString(importMsgResult)).append("\n");
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
    openapiFields.add("ImportMsgResult");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportGroupMsgResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImportGroupMsgResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportGroupMsgResponseAllOf is not found in the empty JSON string", ImportGroupMsgResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImportGroupMsgResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportGroupMsgResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayimportMsgResult = jsonObj.getAsJsonArray("ImportMsgResult");
      if (jsonArrayimportMsgResult != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ImportMsgResult").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ImportMsgResult` to be an array in the JSON string but got `%s`", jsonObj.get("ImportMsgResult").toString()));
        }

        // validate the optional field `ImportMsgResult` (array)
        for (int i = 0; i < jsonArrayimportMsgResult.size(); i++) {
          ImportGroupMsgResponseAllOfImportMsgResult.validateJsonObject(jsonArrayimportMsgResult.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportGroupMsgResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportGroupMsgResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportGroupMsgResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportGroupMsgResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportGroupMsgResponseAllOf>() {
           @Override
           public void write(JsonWriter out, ImportGroupMsgResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportGroupMsgResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImportGroupMsgResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportGroupMsgResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to ImportGroupMsgResponseAllOf
  */
  public static ImportGroupMsgResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportGroupMsgResponseAllOf.class);
  }

 /**
  * Convert an instance of ImportGroupMsgResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

