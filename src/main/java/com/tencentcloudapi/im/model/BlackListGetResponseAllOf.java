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
import com.tencentcloudapi.im.model.BlackListGetResponseAllOfBlackListItem;
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
 * BlackListGetResponseAllOf
 */

public class BlackListGetResponseAllOf {
  public static final String SERIALIZED_NAME_BLACK_LIST_ITEM = "BlackListItem";
  @SerializedName(SERIALIZED_NAME_BLACK_LIST_ITEM)
  private List<BlackListGetResponseAllOfBlackListItem> blackListItem = null;

  public static final String SERIALIZED_NAME_START_INDEX = "StartIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Integer startIndex;

  public static final String SERIALIZED_NAME_CURRUENT_SEQUENCE = "CurruentSequence";
  @SerializedName(SERIALIZED_NAME_CURRUENT_SEQUENCE)
  private Integer curruentSequence;

  public static final String SERIALIZED_NAME_ERROR_DISPLAY = "ErrorDisplay";
  @SerializedName(SERIALIZED_NAME_ERROR_DISPLAY)
  private String errorDisplay;

  public BlackListGetResponseAllOf() { 
  }

  public BlackListGetResponseAllOf blackListItem(List<BlackListGetResponseAllOfBlackListItem> blackListItem) {
    
    this.blackListItem = blackListItem;
    return this;
  }

  public BlackListGetResponseAllOf addBlackListItemItem(BlackListGetResponseAllOfBlackListItem blackListItemItem) {
    if (this.blackListItem == null) {
      this.blackListItem = new ArrayList<>();
    }
    this.blackListItem.add(blackListItemItem);
    return this;
  }

   /**
   * ???????????????????????????????????????????????????????????? To_Account ??? AddBlackTimeStamp
   * @return blackListItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "???????????????????????????????????????????????????????????? To_Account ??? AddBlackTimeStamp")

  public List<BlackListGetResponseAllOfBlackListItem> getBlackListItem() {
    return blackListItem;
  }


  public void setBlackListItem(List<BlackListGetResponseAllOfBlackListItem> blackListItem) {
    this.blackListItem = blackListItem;
  }


  public BlackListGetResponseAllOf startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * ??????????????????????????????0???????????????
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????????????????0???????????????")

  public Integer getStartIndex() {
    return startIndex;
  }


  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public BlackListGetResponseAllOf curruentSequence(Integer curruentSequence) {
    
    this.curruentSequence = curruentSequence;
    return this;
  }

   /**
   * ?????????????????? Seq
   * @return curruentSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????? Seq")

  public Integer getCurruentSequence() {
    return curruentSequence;
  }


  public void setCurruentSequence(Integer curruentSequence) {
    this.curruentSequence = curruentSequence;
  }


  public BlackListGetResponseAllOf errorDisplay(String errorDisplay) {
    
    this.errorDisplay = errorDisplay;
    return this;
  }

   /**
   * ??????????????????????????????
   * @return errorDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????????????????")

  public String getErrorDisplay() {
    return errorDisplay;
  }


  public void setErrorDisplay(String errorDisplay) {
    this.errorDisplay = errorDisplay;
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
  public BlackListGetResponseAllOf putAdditionalProperty(String key, Object value) {
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
    BlackListGetResponseAllOf blackListGetResponseAllOf = (BlackListGetResponseAllOf) o;
    return Objects.equals(this.blackListItem, blackListGetResponseAllOf.blackListItem) &&
        Objects.equals(this.startIndex, blackListGetResponseAllOf.startIndex) &&
        Objects.equals(this.curruentSequence, blackListGetResponseAllOf.curruentSequence) &&
        Objects.equals(this.errorDisplay, blackListGetResponseAllOf.errorDisplay)&&
        Objects.equals(this.additionalProperties, blackListGetResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blackListItem, startIndex, curruentSequence, errorDisplay, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlackListGetResponseAllOf {\n");
    sb.append("    blackListItem: ").append(toIndentedString(blackListItem)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    curruentSequence: ").append(toIndentedString(curruentSequence)).append("\n");
    sb.append("    errorDisplay: ").append(toIndentedString(errorDisplay)).append("\n");
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
    openapiFields.add("BlackListItem");
    openapiFields.add("StartIndex");
    openapiFields.add("CurruentSequence");
    openapiFields.add("ErrorDisplay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BlackListGetResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BlackListGetResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlackListGetResponseAllOf is not found in the empty JSON string", BlackListGetResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayblackListItem = jsonObj.getAsJsonArray("BlackListItem");
      if (jsonArrayblackListItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("BlackListItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `BlackListItem` to be an array in the JSON string but got `%s`", jsonObj.get("BlackListItem").toString()));
        }

        // validate the optional field `BlackListItem` (array)
        for (int i = 0; i < jsonArrayblackListItem.size(); i++) {
          BlackListGetResponseAllOfBlackListItem.validateJsonObject(jsonArrayblackListItem.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("ErrorDisplay") != null && !jsonObj.get("ErrorDisplay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ErrorDisplay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ErrorDisplay").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlackListGetResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlackListGetResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlackListGetResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlackListGetResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<BlackListGetResponseAllOf>() {
           @Override
           public void write(JsonWriter out, BlackListGetResponseAllOf value) throws IOException {
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
           public BlackListGetResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BlackListGetResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BlackListGetResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlackListGetResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to BlackListGetResponseAllOf
  */
  public static BlackListGetResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlackListGetResponseAllOf.class);
  }

 /**
  * Convert an instance of BlackListGetResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

