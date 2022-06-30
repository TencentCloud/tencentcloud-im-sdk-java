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
 * GetOnlineMemberNumResponseAllOf
 */

public class GetOnlineMemberNumResponseAllOf {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ONLINE_MEMBER_NUM = "OnlineMemberNum";
  @SerializedName(SERIALIZED_NAME_ONLINE_MEMBER_NUM)
  private Integer onlineMemberNum;

  public GetOnlineMemberNumResponseAllOf() { 
  }

  public GetOnlineMemberNumResponseAllOf onlineMemberNum(Integer onlineMemberNum) {
    
    this.onlineMemberNum = onlineMemberNum;
    return this;
  }

   /**
   * 该群组的在线人数
   * @return onlineMemberNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该群组的在线人数")

  public Integer getOnlineMemberNum() {
    return onlineMemberNum;
  }


  public void setOnlineMemberNum(Integer onlineMemberNum) {
    this.onlineMemberNum = onlineMemberNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOnlineMemberNumResponseAllOf getOnlineMemberNumResponseAllOf = (GetOnlineMemberNumResponseAllOf) o;
    return Objects.equals(this.onlineMemberNum, getOnlineMemberNumResponseAllOf.onlineMemberNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineMemberNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOnlineMemberNumResponseAllOf {\n");
    sb.append("    onlineMemberNum: ").append(toIndentedString(onlineMemberNum)).append("\n");
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
    openapiFields.add("OnlineMemberNum");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetOnlineMemberNumResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetOnlineMemberNumResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetOnlineMemberNumResponseAllOf is not found in the empty JSON string", GetOnlineMemberNumResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetOnlineMemberNumResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetOnlineMemberNumResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetOnlineMemberNumResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetOnlineMemberNumResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetOnlineMemberNumResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetOnlineMemberNumResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetOnlineMemberNumResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GetOnlineMemberNumResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetOnlineMemberNumResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetOnlineMemberNumResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetOnlineMemberNumResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GetOnlineMemberNumResponseAllOf
  */
  public static GetOnlineMemberNumResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetOnlineMemberNumResponseAllOf.class);
  }

 /**
  * Convert an instance of GetOnlineMemberNumResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

