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
 * ImRemoveAttrRequest
 */

public class ImRemoveAttrRequest {
  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_ATTRS = "Attrs";
  @SerializedName(SERIALIZED_NAME_ATTRS)
  private List<String> attrs = new ArrayList<>();

  public ImRemoveAttrRequest() { 
  }

  public ImRemoveAttrRequest toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 目标用户帐号列表
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "目标用户帐号列表")

  public String getToAccount() {
    return toAccount;
  }


  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public ImRemoveAttrRequest attrs(List<String> attrs) {
    
    this.attrs = attrs;
    return this;
  }

  public ImRemoveAttrRequest addAttrsItem(String attrsItem) {
    this.attrs.add(attrsItem);
    return this;
  }

   /**
   * 属性集合，注意这里只需要给出属性名即可
   * @return attrs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "属性集合，注意这里只需要给出属性名即可")

  public List<String> getAttrs() {
    return attrs;
  }


  public void setAttrs(List<String> attrs) {
    this.attrs = attrs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImRemoveAttrRequest imRemoveAttrRequest = (ImRemoveAttrRequest) o;
    return Objects.equals(this.toAccount, imRemoveAttrRequest.toAccount) &&
        Objects.equals(this.attrs, imRemoveAttrRequest.attrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, attrs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImRemoveAttrRequest {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
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
    openapiFields.add("To_Account");
    openapiFields.add("Attrs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("To_Account");
    openapiRequiredFields.add("Attrs");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImRemoveAttrRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImRemoveAttrRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImRemoveAttrRequest is not found in the empty JSON string", ImRemoveAttrRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImRemoveAttrRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImRemoveAttrRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImRemoveAttrRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("Attrs") != null && !jsonObj.get("Attrs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Attrs` to be an array in the JSON string but got `%s`", jsonObj.get("Attrs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImRemoveAttrRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImRemoveAttrRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImRemoveAttrRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImRemoveAttrRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ImRemoveAttrRequest>() {
           @Override
           public void write(JsonWriter out, ImRemoveAttrRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImRemoveAttrRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImRemoveAttrRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImRemoveAttrRequest
  * @throws IOException if the JSON string is invalid with respect to ImRemoveAttrRequest
  */
  public static ImRemoveAttrRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImRemoveAttrRequest.class);
  }

 /**
  * Convert an instance of ImRemoveAttrRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

