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
import com.tencentcloudapi.im.model.BatchSendSingleChatMsgResponseAllOfErrorList;
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
 * BatchSendSingleChatMsgResponseAllOf
 */

public class BatchSendSingleChatMsgResponseAllOf {
  public static final String SERIALIZED_NAME_MSG_TIME = "MsgTime";
  @SerializedName(SERIALIZED_NAME_MSG_TIME)
  private Integer msgTime;

  public static final String SERIALIZED_NAME_MSG_KEY = "MsgKey";
  @SerializedName(SERIALIZED_NAME_MSG_KEY)
  private String msgKey;

  public static final String SERIALIZED_NAME_ERROR_LIST = "ErrorList";
  @SerializedName(SERIALIZED_NAME_ERROR_LIST)
  private List<BatchSendSingleChatMsgResponseAllOfErrorList> errorList = null;

  public BatchSendSingleChatMsgResponseAllOf() { 
  }

  public BatchSendSingleChatMsgResponseAllOf msgTime(Integer msgTime) {
    
    this.msgTime = msgTime;
    return this;
  }

   /**
   * Get msgTime
   * @return msgTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMsgTime() {
    return msgTime;
  }


  public void setMsgTime(Integer msgTime) {
    this.msgTime = msgTime;
  }


  public BatchSendSingleChatMsgResponseAllOf msgKey(String msgKey) {
    
    this.msgKey = msgKey;
    return this;
  }

   /**
   * Get msgKey
   * @return msgKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMsgKey() {
    return msgKey;
  }


  public void setMsgKey(String msgKey) {
    this.msgKey = msgKey;
  }


  public BatchSendSingleChatMsgResponseAllOf errorList(List<BatchSendSingleChatMsgResponseAllOfErrorList> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public BatchSendSingleChatMsgResponseAllOf addErrorListItem(BatchSendSingleChatMsgResponseAllOfErrorList errorListItem) {
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

  public List<BatchSendSingleChatMsgResponseAllOfErrorList> getErrorList() {
    return errorList;
  }


  public void setErrorList(List<BatchSendSingleChatMsgResponseAllOfErrorList> errorList) {
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
  public BatchSendSingleChatMsgResponseAllOf putAdditionalProperty(String key, Object value) {
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
    BatchSendSingleChatMsgResponseAllOf batchSendSingleChatMsgResponseAllOf = (BatchSendSingleChatMsgResponseAllOf) o;
    return Objects.equals(this.msgTime, batchSendSingleChatMsgResponseAllOf.msgTime) &&
        Objects.equals(this.msgKey, batchSendSingleChatMsgResponseAllOf.msgKey) &&
        Objects.equals(this.errorList, batchSendSingleChatMsgResponseAllOf.errorList)&&
        Objects.equals(this.additionalProperties, batchSendSingleChatMsgResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgTime, msgKey, errorList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchSendSingleChatMsgResponseAllOf {\n");
    sb.append("    msgTime: ").append(toIndentedString(msgTime)).append("\n");
    sb.append("    msgKey: ").append(toIndentedString(msgKey)).append("\n");
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
    openapiFields.add("MsgTime");
    openapiFields.add("MsgKey");
    openapiFields.add("ErrorList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BatchSendSingleChatMsgResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BatchSendSingleChatMsgResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchSendSingleChatMsgResponseAllOf is not found in the empty JSON string", BatchSendSingleChatMsgResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("MsgKey") != null && !jsonObj.get("MsgKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MsgKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MsgKey").toString()));
      }
      JsonArray jsonArrayerrorList = jsonObj.getAsJsonArray("ErrorList");
      if (jsonArrayerrorList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ErrorList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ErrorList` to be an array in the JSON string but got `%s`", jsonObj.get("ErrorList").toString()));
        }

        // validate the optional field `ErrorList` (array)
        for (int i = 0; i < jsonArrayerrorList.size(); i++) {
          BatchSendSingleChatMsgResponseAllOfErrorList.validateJsonObject(jsonArrayerrorList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchSendSingleChatMsgResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchSendSingleChatMsgResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchSendSingleChatMsgResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchSendSingleChatMsgResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchSendSingleChatMsgResponseAllOf>() {
           @Override
           public void write(JsonWriter out, BatchSendSingleChatMsgResponseAllOf value) throws IOException {
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
           public BatchSendSingleChatMsgResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BatchSendSingleChatMsgResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BatchSendSingleChatMsgResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BatchSendSingleChatMsgResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to BatchSendSingleChatMsgResponseAllOf
  */
  public static BatchSendSingleChatMsgResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchSendSingleChatMsgResponseAllOf.class);
  }

 /**
  * Convert an instance of BatchSendSingleChatMsgResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

