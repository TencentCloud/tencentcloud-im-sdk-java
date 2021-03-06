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
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponseAllOfErrorList;
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
 * GetC2cUnreadMsgNumResponseAllOf
 */

public class GetC2cUnreadMsgNumResponseAllOf {
  public static final String SERIALIZED_NAME_ALL_C2_C_UNREAD_MSG_NUM = "AllC2CUnreadMsgNum";
  @SerializedName(SERIALIZED_NAME_ALL_C2_C_UNREAD_MSG_NUM)
  private Integer allC2CUnreadMsgNum;

  public static final String SERIALIZED_NAME_C2_C_UNREAD_MSG_NUM_LIST = "C2CUnreadMsgNumList";
  @SerializedName(SERIALIZED_NAME_C2_C_UNREAD_MSG_NUM_LIST)
  private List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> c2CUnreadMsgNumList = null;

  public static final String SERIALIZED_NAME_ERROR_LIST = "ErrorList";
  @SerializedName(SERIALIZED_NAME_ERROR_LIST)
  private List<GetC2cUnreadMsgNumResponseAllOfErrorList> errorList = null;

  public GetC2cUnreadMsgNumResponseAllOf() { 
  }

  public GetC2cUnreadMsgNumResponseAllOf allC2CUnreadMsgNum(Integer allC2CUnreadMsgNum) {
    
    this.allC2CUnreadMsgNum = allC2CUnreadMsgNum;
    return this;
  }

   /**
   * ????????????????????????
   * @return allC2CUnreadMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "????????????????????????")

  public Integer getAllC2CUnreadMsgNum() {
    return allC2CUnreadMsgNum;
  }


  public void setAllC2CUnreadMsgNum(Integer allC2CUnreadMsgNum) {
    this.allC2CUnreadMsgNum = allC2CUnreadMsgNum;
  }


  public GetC2cUnreadMsgNumResponseAllOf c2CUnreadMsgNumList(List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> c2CUnreadMsgNumList) {
    
    this.c2CUnreadMsgNumList = c2CUnreadMsgNumList;
    return this;
  }

  public GetC2cUnreadMsgNumResponseAllOf addC2CUnreadMsgNumListItem(GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList c2CUnreadMsgNumListItem) {
    if (this.c2CUnreadMsgNumList == null) {
      this.c2CUnreadMsgNumList = new ArrayList<>();
    }
    this.c2CUnreadMsgNumList.add(c2CUnreadMsgNumListItem);
    return this;
  }

   /**
   * ????????????List
   * @return c2CUnreadMsgNumList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "????????????List")

  public List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> getC2CUnreadMsgNumList() {
    return c2CUnreadMsgNumList;
  }


  public void setC2CUnreadMsgNumList(List<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> c2CUnreadMsgNumList) {
    this.c2CUnreadMsgNumList = c2CUnreadMsgNumList;
  }


  public GetC2cUnreadMsgNumResponseAllOf errorList(List<GetC2cUnreadMsgNumResponseAllOfErrorList> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public GetC2cUnreadMsgNumResponseAllOf addErrorListItem(GetC2cUnreadMsgNumResponseAllOfErrorList errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * Get errorList
   * @return errorList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetC2cUnreadMsgNumResponseAllOfErrorList> getErrorList() {
    return errorList;
  }


  public void setErrorList(List<GetC2cUnreadMsgNumResponseAllOfErrorList> errorList) {
    this.errorList = errorList;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public GetC2cUnreadMsgNumResponseAllOf putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetC2cUnreadMsgNumResponseAllOf getC2cUnreadMsgNumResponseAllOf = (GetC2cUnreadMsgNumResponseAllOf) o;
    return Objects.equals(this.allC2CUnreadMsgNum, getC2cUnreadMsgNumResponseAllOf.allC2CUnreadMsgNum) &&
        Objects.equals(this.c2CUnreadMsgNumList, getC2cUnreadMsgNumResponseAllOf.c2CUnreadMsgNumList) &&
        Objects.equals(this.errorList, getC2cUnreadMsgNumResponseAllOf.errorList)&&
        Objects.equals(this.additionalProperties, getC2cUnreadMsgNumResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allC2CUnreadMsgNum, c2CUnreadMsgNumList, errorList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetC2cUnreadMsgNumResponseAllOf {\n");
    sb.append("    allC2CUnreadMsgNum: ").append(toIndentedString(allC2CUnreadMsgNum)).append("\n");
    sb.append("    c2CUnreadMsgNumList: ").append(toIndentedString(c2CUnreadMsgNumList)).append("\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("AllC2CUnreadMsgNum");
    openapiFields.add("C2CUnreadMsgNumList");
    openapiFields.add("ErrorList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetC2cUnreadMsgNumResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetC2cUnreadMsgNumResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetC2cUnreadMsgNumResponseAllOf is not found in the empty JSON string", GetC2cUnreadMsgNumResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayc2CUnreadMsgNumList = jsonObj.getAsJsonArray("C2CUnreadMsgNumList");
      if (jsonArrayc2CUnreadMsgNumList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("C2CUnreadMsgNumList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `C2CUnreadMsgNumList` to be an array in the JSON string but got `%s`", jsonObj.get("C2CUnreadMsgNumList").toString()));
        }

        // validate the optional field `C2CUnreadMsgNumList` (array)
        for (int i = 0; i < jsonArrayc2CUnreadMsgNumList.size(); i++) {
          GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.validateJsonObject(jsonArrayc2CUnreadMsgNumList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayerrorList = jsonObj.getAsJsonArray("ErrorList");
      if (jsonArrayerrorList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ErrorList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ErrorList` to be an array in the JSON string but got `%s`", jsonObj.get("ErrorList").toString()));
        }

        // validate the optional field `ErrorList` (array)
        for (int i = 0; i < jsonArrayerrorList.size(); i++) {
          GetC2cUnreadMsgNumResponseAllOfErrorList.validateJsonObject(jsonArrayerrorList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetC2cUnreadMsgNumResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetC2cUnreadMsgNumResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetC2cUnreadMsgNumResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetC2cUnreadMsgNumResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetC2cUnreadMsgNumResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GetC2cUnreadMsgNumResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public GetC2cUnreadMsgNumResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetC2cUnreadMsgNumResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), Object.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetC2cUnreadMsgNumResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetC2cUnreadMsgNumResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GetC2cUnreadMsgNumResponseAllOf
  */
  public static GetC2cUnreadMsgNumResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetC2cUnreadMsgNumResponseAllOf.class);
  }

 /**
  * Convert an instance of GetC2cUnreadMsgNumResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

