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
 * GetAppInfoRequest
 */

public class GetAppInfoRequest {
  public static final String SERIALIZED_NAME_REQUEST_FIELD = "RequestField";
  @SerializedName(SERIALIZED_NAME_REQUEST_FIELD)
  private List<String> requestField = null;

  public GetAppInfoRequest() { 
  }

  public GetAppInfoRequest requestField(List<String> requestField) {
    
    this.requestField = requestField;
    return this;
  }

  public GetAppInfoRequest addRequestFieldItem(String requestFieldItem) {
    if (this.requestField == null) {
      this.requestField = new ArrayList<>();
    }
    this.requestField.add(requestFieldItem);
    return this;
  }

   /**
   * 该字段用来指定需要拉取的运营数据，不填默认拉取所有字段。详细可参阅下文 可拉取的运营字段（https://cloud.tencent.com/document/product/269/4193#operation）
   * @return requestField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该字段用来指定需要拉取的运营数据，不填默认拉取所有字段。详细可参阅下文 可拉取的运营字段（https://cloud.tencent.com/document/product/269/4193#operation）")

  public List<String> getRequestField() {
    return requestField;
  }


  public void setRequestField(List<String> requestField) {
    this.requestField = requestField;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAppInfoRequest getAppInfoRequest = (GetAppInfoRequest) o;
    return Objects.equals(this.requestField, getAppInfoRequest.requestField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAppInfoRequest {\n");
    sb.append("    requestField: ").append(toIndentedString(requestField)).append("\n");
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
    openapiFields.add("RequestField");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetAppInfoRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetAppInfoRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAppInfoRequest is not found in the empty JSON string", GetAppInfoRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetAppInfoRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAppInfoRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("RequestField") != null && !jsonObj.get("RequestField").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `RequestField` to be an array in the JSON string but got `%s`", jsonObj.get("RequestField").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAppInfoRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAppInfoRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAppInfoRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAppInfoRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAppInfoRequest>() {
           @Override
           public void write(JsonWriter out, GetAppInfoRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAppInfoRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAppInfoRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAppInfoRequest
  * @throws IOException if the JSON string is invalid with respect to GetAppInfoRequest
  */
  public static GetAppInfoRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAppInfoRequest.class);
  }

 /**
  * Convert an instance of GetAppInfoRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

