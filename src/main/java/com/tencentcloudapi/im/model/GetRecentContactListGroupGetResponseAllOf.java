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
import com.tencentcloudapi.im.model.GetRecentContactListGroupGetResponseAllOfSessionItem;
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
 * GetRecentContactListGroupGetResponseAllOf
 */

public class GetRecentContactListGroupGetResponseAllOf {
  public static final String SERIALIZED_NAME_SESSION_ITEM = "SessionItem";
  @SerializedName(SERIALIZED_NAME_SESSION_ITEM)
  private List<GetRecentContactListGroupGetResponseAllOfSessionItem> sessionItem = null;

  public static final String SERIALIZED_NAME_COMPLETE_FLAG = "CompleteFlag";
  @SerializedName(SERIALIZED_NAME_COMPLETE_FLAG)
  private Integer completeFlag;

  public static final String SERIALIZED_NAME_TIME_STAMP = "TimeStamp";
  @SerializedName(SERIALIZED_NAME_TIME_STAMP)
  private Integer timeStamp;

  public static final String SERIALIZED_NAME_START_INDEX = "StartIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Integer startIndex;

  public static final String SERIALIZED_NAME_TOP_TIME_STAMP = "TopTimeStamp";
  @SerializedName(SERIALIZED_NAME_TOP_TIME_STAMP)
  private Integer topTimeStamp;

  public static final String SERIALIZED_NAME_TOP_START_INDEX = "TopStartIndex";
  @SerializedName(SERIALIZED_NAME_TOP_START_INDEX)
  private Integer topStartIndex;

  public static final String SERIALIZED_NAME_ERROR_DISPLAY = "ErrorDisplay";
  @SerializedName(SERIALIZED_NAME_ERROR_DISPLAY)
  private String errorDisplay;

  public GetRecentContactListGroupGetResponseAllOf() { 
  }

  public GetRecentContactListGroupGetResponseAllOf sessionItem(List<GetRecentContactListGroupGetResponseAllOfSessionItem> sessionItem) {
    
    this.sessionItem = sessionItem;
    return this;
  }

  public GetRecentContactListGroupGetResponseAllOf addSessionItemItem(GetRecentContactListGroupGetResponseAllOfSessionItem sessionItemItem) {
    if (this.sessionItem == null) {
      this.sessionItem = new ArrayList<>();
    }
    this.sessionItem.add(sessionItemItem);
    return this;
  }

   /**
   * ??????????????????
   * @return sessionItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????")

  public List<GetRecentContactListGroupGetResponseAllOfSessionItem> getSessionItem() {
    return sessionItem;
  }


  public void setSessionItem(List<GetRecentContactListGroupGetResponseAllOfSessionItem> sessionItem) {
    this.sessionItem = sessionItem;
  }


  public GetRecentContactListGroupGetResponseAllOf completeFlag(Integer completeFlag) {
    
    this.completeFlag = completeFlag;
    return this;
  }

   /**
   * ???????????????1 ??????????????????????????????0 ???????????????????????????
   * @return completeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "???????????????1 ??????????????????????????????0 ???????????????????????????")

  public Integer getCompleteFlag() {
    return completeFlag;
  }


  public void setCompleteFlag(Integer completeFlag) {
    this.completeFlag = completeFlag;
  }


  public GetRecentContactListGroupGetResponseAllOf timeStamp(Integer timeStamp) {
    
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * ?????????????????????????????????????????????????????????????????????????????? TimeStamp ??????????????????????????????
   * @return timeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????????????????????????????????????????????????? TimeStamp ??????????????????????????????")

  public Integer getTimeStamp() {
    return timeStamp;
  }


  public void setTimeStamp(Integer timeStamp) {
    this.timeStamp = timeStamp;
  }


  public GetRecentContactListGroupGetResponseAllOf startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * ?????????????????????????????????????????????????????????????????????????????? StartIndex ??????????????????????????????
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????????????????????????????????????????????????? StartIndex ??????????????????????????????")

  public Integer getStartIndex() {
    return startIndex;
  }


  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public GetRecentContactListGroupGetResponseAllOf topTimeStamp(Integer topTimeStamp) {
    
    this.topTimeStamp = topTimeStamp;
    return this;
  }

   /**
   * ?????????????????????????????????????????????????????????????????????????????? TopTimeStamp ??????????????????????????????
   * @return topTimeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????????????????????????????????????????????????? TopTimeStamp ??????????????????????????????")

  public Integer getTopTimeStamp() {
    return topTimeStamp;
  }


  public void setTopTimeStamp(Integer topTimeStamp) {
    this.topTimeStamp = topTimeStamp;
  }


  public GetRecentContactListGroupGetResponseAllOf topStartIndex(Integer topStartIndex) {
    
    this.topStartIndex = topStartIndex;
    return this;
  }

   /**
   * ?????????????????????????????????????????????????????????????????????????????? TopStartIndex ??????????????????????????????
   * @return topStartIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????????????????????????????????????????????????? TopStartIndex ??????????????????????????????")

  public Integer getTopStartIndex() {
    return topStartIndex;
  }


  public void setTopStartIndex(Integer topStartIndex) {
    this.topStartIndex = topStartIndex;
  }


  public GetRecentContactListGroupGetResponseAllOf errorDisplay(String errorDisplay) {
    
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
  public GetRecentContactListGroupGetResponseAllOf putAdditionalProperty(String key, Object value) {
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
    GetRecentContactListGroupGetResponseAllOf getRecentContactListGroupGetResponseAllOf = (GetRecentContactListGroupGetResponseAllOf) o;
    return Objects.equals(this.sessionItem, getRecentContactListGroupGetResponseAllOf.sessionItem) &&
        Objects.equals(this.completeFlag, getRecentContactListGroupGetResponseAllOf.completeFlag) &&
        Objects.equals(this.timeStamp, getRecentContactListGroupGetResponseAllOf.timeStamp) &&
        Objects.equals(this.startIndex, getRecentContactListGroupGetResponseAllOf.startIndex) &&
        Objects.equals(this.topTimeStamp, getRecentContactListGroupGetResponseAllOf.topTimeStamp) &&
        Objects.equals(this.topStartIndex, getRecentContactListGroupGetResponseAllOf.topStartIndex) &&
        Objects.equals(this.errorDisplay, getRecentContactListGroupGetResponseAllOf.errorDisplay)&&
        Objects.equals(this.additionalProperties, getRecentContactListGroupGetResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionItem, completeFlag, timeStamp, startIndex, topTimeStamp, topStartIndex, errorDisplay, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecentContactListGroupGetResponseAllOf {\n");
    sb.append("    sessionItem: ").append(toIndentedString(sessionItem)).append("\n");
    sb.append("    completeFlag: ").append(toIndentedString(completeFlag)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    topTimeStamp: ").append(toIndentedString(topTimeStamp)).append("\n");
    sb.append("    topStartIndex: ").append(toIndentedString(topStartIndex)).append("\n");
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
    openapiFields.add("SessionItem");
    openapiFields.add("CompleteFlag");
    openapiFields.add("TimeStamp");
    openapiFields.add("StartIndex");
    openapiFields.add("TopTimeStamp");
    openapiFields.add("TopStartIndex");
    openapiFields.add("ErrorDisplay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetRecentContactListGroupGetResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetRecentContactListGroupGetResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRecentContactListGroupGetResponseAllOf is not found in the empty JSON string", GetRecentContactListGroupGetResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArraysessionItem = jsonObj.getAsJsonArray("SessionItem");
      if (jsonArraysessionItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("SessionItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `SessionItem` to be an array in the JSON string but got `%s`", jsonObj.get("SessionItem").toString()));
        }

        // validate the optional field `SessionItem` (array)
        for (int i = 0; i < jsonArraysessionItem.size(); i++) {
          GetRecentContactListGroupGetResponseAllOfSessionItem.validateJsonObject(jsonArraysessionItem.get(i).getAsJsonObject());
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
       if (!GetRecentContactListGroupGetResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRecentContactListGroupGetResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRecentContactListGroupGetResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRecentContactListGroupGetResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRecentContactListGroupGetResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GetRecentContactListGroupGetResponseAllOf value) throws IOException {
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
           public GetRecentContactListGroupGetResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetRecentContactListGroupGetResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetRecentContactListGroupGetResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRecentContactListGroupGetResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GetRecentContactListGroupGetResponseAllOf
  */
  public static GetRecentContactListGroupGetResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRecentContactListGroupGetResponseAllOf.class);
  }

 /**
  * Convert an instance of GetRecentContactListGroupGetResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

