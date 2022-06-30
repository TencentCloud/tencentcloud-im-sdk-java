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
 * ImGetAttrNameResponseAllOf
 */

public class ImGetAttrNameResponseAllOf {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ATTR_NAMES = "AttrNames";
  @SerializedName(SERIALIZED_NAME_ATTR_NAMES)
  private Object attrNames;

  public ImGetAttrNameResponseAllOf() { 
  }

  public ImGetAttrNameResponseAllOf attrNames(Object attrNames) {
    
    this.attrNames = attrNames;
    return this;
  }

   /**
   * 包含多个键对。每对键值对，表示第几个属性对应的名称。例如\&quot;0\&quot;:\&quot;xxx\&quot;表示第0号属性的名称是 xxx
   * @return attrNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "包含多个键对。每对键值对，表示第几个属性对应的名称。例如\"0\":\"xxx\"表示第0号属性的名称是 xxx")

  public Object getAttrNames() {
    return attrNames;
  }


  public void setAttrNames(Object attrNames) {
    this.attrNames = attrNames;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImGetAttrNameResponseAllOf imGetAttrNameResponseAllOf = (ImGetAttrNameResponseAllOf) o;
    return Objects.equals(this.attrNames, imGetAttrNameResponseAllOf.attrNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImGetAttrNameResponseAllOf {\n");
    sb.append("    attrNames: ").append(toIndentedString(attrNames)).append("\n");
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
    openapiFields.add("AttrNames");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImGetAttrNameResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImGetAttrNameResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImGetAttrNameResponseAllOf is not found in the empty JSON string", ImGetAttrNameResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImGetAttrNameResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImGetAttrNameResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImGetAttrNameResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImGetAttrNameResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImGetAttrNameResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImGetAttrNameResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ImGetAttrNameResponseAllOf>() {
           @Override
           public void write(JsonWriter out, ImGetAttrNameResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImGetAttrNameResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImGetAttrNameResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImGetAttrNameResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to ImGetAttrNameResponseAllOf
  */
  public static ImGetAttrNameResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImGetAttrNameResponseAllOf.class);
  }

 /**
  * Convert an instance of ImGetAttrNameResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

