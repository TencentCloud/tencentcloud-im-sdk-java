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
 * ImGetAttrResponseAllOfUserAttrs
 */

public class ImGetAttrResponseAllOfUserAttrs {
  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_ATTRS = "Attrs";
  @SerializedName(SERIALIZED_NAME_ATTRS)
  private Object attrs;

  public ImGetAttrResponseAllOfUserAttrs() { 
  }

  public ImGetAttrResponseAllOfUserAttrs toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 用户帐号
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户帐号")

  public String getToAccount() {
    return toAccount;
  }


  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public ImGetAttrResponseAllOfUserAttrs attrs(Object attrs) {
    
    this.attrs = attrs;
    return this;
  }

   /**
   * 属性内容
   * @return attrs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "属性内容")

  public Object getAttrs() {
    return attrs;
  }


  public void setAttrs(Object attrs) {
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
    ImGetAttrResponseAllOfUserAttrs imGetAttrResponseAllOfUserAttrs = (ImGetAttrResponseAllOfUserAttrs) o;
    return Objects.equals(this.toAccount, imGetAttrResponseAllOfUserAttrs.toAccount) &&
        Objects.equals(this.attrs, imGetAttrResponseAllOfUserAttrs.attrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, attrs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImGetAttrResponseAllOfUserAttrs {\n");
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
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImGetAttrResponseAllOfUserAttrs
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImGetAttrResponseAllOfUserAttrs.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImGetAttrResponseAllOfUserAttrs is not found in the empty JSON string", ImGetAttrResponseAllOfUserAttrs.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImGetAttrResponseAllOfUserAttrs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImGetAttrResponseAllOfUserAttrs` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImGetAttrResponseAllOfUserAttrs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImGetAttrResponseAllOfUserAttrs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImGetAttrResponseAllOfUserAttrs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImGetAttrResponseAllOfUserAttrs.class));

       return (TypeAdapter<T>) new TypeAdapter<ImGetAttrResponseAllOfUserAttrs>() {
           @Override
           public void write(JsonWriter out, ImGetAttrResponseAllOfUserAttrs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImGetAttrResponseAllOfUserAttrs read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImGetAttrResponseAllOfUserAttrs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImGetAttrResponseAllOfUserAttrs
  * @throws IOException if the JSON string is invalid with respect to ImGetAttrResponseAllOfUserAttrs
  */
  public static ImGetAttrResponseAllOfUserAttrs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImGetAttrResponseAllOfUserAttrs.class);
  }

 /**
  * Convert an instance of ImGetAttrResponseAllOfUserAttrs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

