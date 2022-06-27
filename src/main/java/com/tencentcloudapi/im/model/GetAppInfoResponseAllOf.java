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
import com.tencentcloudapi.im.model.GetAppInfoResponseAllOfResult;
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
 * GetAppInfoResponseAllOf
 */

public class GetAppInfoResponseAllOf {
  public static final String SERIALIZED_NAME_RESULT = "Result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private List<GetAppInfoResponseAllOfResult> result = null;

  public GetAppInfoResponseAllOf() { 
  }

  public GetAppInfoResponseAllOf result(List<GetAppInfoResponseAllOfResult> result) {
    
    this.result = result;
    return this;
  }

  public GetAppInfoResponseAllOf addResultItem(GetAppInfoResponseAllOfResult resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * 请求最近30天的运营数据
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求最近30天的运营数据")

  public List<GetAppInfoResponseAllOfResult> getResult() {
    return result;
  }


  public void setResult(List<GetAppInfoResponseAllOfResult> result) {
    this.result = result;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAppInfoResponseAllOf getAppInfoResponseAllOf = (GetAppInfoResponseAllOf) o;
    return Objects.equals(this.result, getAppInfoResponseAllOf.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAppInfoResponseAllOf {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
    openapiFields.add("Result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetAppInfoResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetAppInfoResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAppInfoResponseAllOf is not found in the empty JSON string", GetAppInfoResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetAppInfoResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAppInfoResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayresult = jsonObj.getAsJsonArray("Result");
      if (jsonArrayresult != null) {
        // ensure the json data is an array
        if (!jsonObj.get("Result").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `Result` to be an array in the JSON string but got `%s`", jsonObj.get("Result").toString()));
        }

        // validate the optional field `Result` (array)
        for (int i = 0; i < jsonArrayresult.size(); i++) {
          GetAppInfoResponseAllOfResult.validateJsonObject(jsonArrayresult.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAppInfoResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAppInfoResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAppInfoResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAppInfoResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAppInfoResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GetAppInfoResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAppInfoResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAppInfoResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAppInfoResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GetAppInfoResponseAllOf
  */
  public static GetAppInfoResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAppInfoResponseAllOf.class);
  }

 /**
  * Convert an instance of GetAppInfoResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

