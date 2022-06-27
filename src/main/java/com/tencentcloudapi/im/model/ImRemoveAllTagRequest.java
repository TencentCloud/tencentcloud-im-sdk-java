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
 * ImRemoveAllTagRequest
 */

public class ImRemoveAllTagRequest {
  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private List<String> toAccount = new ArrayList<>();

  public ImRemoveAllTagRequest() { 
  }

  public ImRemoveAllTagRequest toAccount(List<String> toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

  public ImRemoveAllTagRequest addToAccountItem(String toAccountItem) {
    this.toAccount.add(toAccountItem);
    return this;
  }

   /**
   * 目标用户帐号
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "目标用户帐号")

  public List<String> getToAccount() {
    return toAccount;
  }


  public void setToAccount(List<String> toAccount) {
    this.toAccount = toAccount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImRemoveAllTagRequest imRemoveAllTagRequest = (ImRemoveAllTagRequest) o;
    return Objects.equals(this.toAccount, imRemoveAllTagRequest.toAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImRemoveAllTagRequest {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("To_Account");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImRemoveAllTagRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImRemoveAllTagRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImRemoveAllTagRequest is not found in the empty JSON string", ImRemoveAllTagRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImRemoveAllTagRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImRemoveAllTagRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImRemoveAllTagRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be an array in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImRemoveAllTagRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImRemoveAllTagRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImRemoveAllTagRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImRemoveAllTagRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ImRemoveAllTagRequest>() {
           @Override
           public void write(JsonWriter out, ImRemoveAllTagRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImRemoveAllTagRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImRemoveAllTagRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImRemoveAllTagRequest
  * @throws IOException if the JSON string is invalid with respect to ImRemoveAllTagRequest
  */
  public static ImRemoveAllTagRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImRemoveAllTagRequest.class);
  }

 /**
  * Convert an instance of ImRemoveAllTagRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

