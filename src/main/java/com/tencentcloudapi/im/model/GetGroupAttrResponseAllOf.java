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
import com.tencentcloudapi.im.model.GetGroupAttrResponseAllOfGroupAttrAry;
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
 * GetGroupAttrResponseAllOf
 */

public class GetGroupAttrResponseAllOf {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GROUP_ATTR_ARY = "GroupAttrAry";
  @SerializedName(SERIALIZED_NAME_GROUP_ATTR_ARY)
  private List<GetGroupAttrResponseAllOfGroupAttrAry> groupAttrAry = null;

  public GetGroupAttrResponseAllOf() { 
  }

  public GetGroupAttrResponseAllOf groupAttrAry(List<GetGroupAttrResponseAllOfGroupAttrAry> groupAttrAry) {
    
    this.groupAttrAry = groupAttrAry;
    return this;
  }

  public GetGroupAttrResponseAllOf addGroupAttrAryItem(GetGroupAttrResponseAllOfGroupAttrAry groupAttrAryItem) {
    if (this.groupAttrAry == null) {
      this.groupAttrAry = new ArrayList<>();
    }
    this.groupAttrAry.add(groupAttrAryItem);
    return this;
  }

   /**
   * 自定义属性的键值对
   * @return groupAttrAry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "自定义属性的键值对")

  public List<GetGroupAttrResponseAllOfGroupAttrAry> getGroupAttrAry() {
    return groupAttrAry;
  }


  public void setGroupAttrAry(List<GetGroupAttrResponseAllOfGroupAttrAry> groupAttrAry) {
    this.groupAttrAry = groupAttrAry;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupAttrResponseAllOf getGroupAttrResponseAllOf = (GetGroupAttrResponseAllOf) o;
    return Objects.equals(this.groupAttrAry, getGroupAttrResponseAllOf.groupAttrAry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupAttrAry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupAttrResponseAllOf {\n");
    sb.append("    groupAttrAry: ").append(toIndentedString(groupAttrAry)).append("\n");
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
    openapiFields.add("GroupAttrAry");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetGroupAttrResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetGroupAttrResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupAttrResponseAllOf is not found in the empty JSON string", GetGroupAttrResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetGroupAttrResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGroupAttrResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraygroupAttrAry = jsonObj.getAsJsonArray("GroupAttrAry");
      if (jsonArraygroupAttrAry != null) {
        // ensure the json data is an array
        if (!jsonObj.get("GroupAttrAry").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `GroupAttrAry` to be an array in the JSON string but got `%s`", jsonObj.get("GroupAttrAry").toString()));
        }

        // validate the optional field `GroupAttrAry` (array)
        for (int i = 0; i < jsonArraygroupAttrAry.size(); i++) {
          GetGroupAttrResponseAllOfGroupAttrAry.validateJsonObject(jsonArraygroupAttrAry.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupAttrResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupAttrResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupAttrResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupAttrResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupAttrResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GetGroupAttrResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGroupAttrResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGroupAttrResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGroupAttrResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GetGroupAttrResponseAllOf
  */
  public static GetGroupAttrResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupAttrResponseAllOf.class);
  }

 /**
  * Convert an instance of GetGroupAttrResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

