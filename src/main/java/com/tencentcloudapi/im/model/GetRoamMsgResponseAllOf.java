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
import com.tencentcloudapi.im.model.GetRoamMsgResponseAllOfMsgList;
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
 * GetRoamMsgResponseAllOf
 */

public class GetRoamMsgResponseAllOf {
  /**
   * 是否全部拉取，0表示未全部拉取，需要续拉，1表示已全部拉取
   */
  @JsonAdapter(CompleteEnum.Adapter.class)
  public enum CompleteEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    CompleteEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompleteEnum fromValue(Integer value) {
      for (CompleteEnum b : CompleteEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CompleteEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompleteEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompleteEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return CompleteEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COMPLETE = "Complete";
  @SerializedName(SERIALIZED_NAME_COMPLETE)
  private CompleteEnum complete;

  public static final String SERIALIZED_NAME_MSG_CNT = "MsgCnt";
  @SerializedName(SERIALIZED_NAME_MSG_CNT)
  private Integer msgCnt;

  public static final String SERIALIZED_NAME_LAST_MSG_TIME = "LastMsgTime";
  @SerializedName(SERIALIZED_NAME_LAST_MSG_TIME)
  private Integer lastMsgTime;

  public static final String SERIALIZED_NAME_LAST_MSG_KEY = "LastMsgKey";
  @SerializedName(SERIALIZED_NAME_LAST_MSG_KEY)
  private String lastMsgKey;

  public static final String SERIALIZED_NAME_MSG_LIST = "MsgList";
  @SerializedName(SERIALIZED_NAME_MSG_LIST)
  private List<GetRoamMsgResponseAllOfMsgList> msgList = null;

  public GetRoamMsgResponseAllOf() { 
  }

  public GetRoamMsgResponseAllOf complete(CompleteEnum complete) {
    
    this.complete = complete;
    return this;
  }

   /**
   * 是否全部拉取，0表示未全部拉取，需要续拉，1表示已全部拉取
   * @return complete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否全部拉取，0表示未全部拉取，需要续拉，1表示已全部拉取")

  public CompleteEnum getComplete() {
    return complete;
  }


  public void setComplete(CompleteEnum complete) {
    this.complete = complete;
  }


  public GetRoamMsgResponseAllOf msgCnt(Integer msgCnt) {
    
    this.msgCnt = msgCnt;
    return this;
  }

   /**
   * 本次拉取到的消息条数
   * @return msgCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "本次拉取到的消息条数")

  public Integer getMsgCnt() {
    return msgCnt;
  }


  public void setMsgCnt(Integer msgCnt) {
    this.msgCnt = msgCnt;
  }


  public GetRoamMsgResponseAllOf lastMsgTime(Integer lastMsgTime) {
    
    this.lastMsgTime = lastMsgTime;
    return this;
  }

   /**
   * 本次拉取到的消息里的最后一条消息的时间
   * @return lastMsgTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "本次拉取到的消息里的最后一条消息的时间")

  public Integer getLastMsgTime() {
    return lastMsgTime;
  }


  public void setLastMsgTime(Integer lastMsgTime) {
    this.lastMsgTime = lastMsgTime;
  }


  public GetRoamMsgResponseAllOf lastMsgKey(String lastMsgKey) {
    
    this.lastMsgKey = lastMsgKey;
    return this;
  }

   /**
   * 本次拉取到的消息里的最后一条消息的标识
   * @return lastMsgKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "本次拉取到的消息里的最后一条消息的标识")

  public String getLastMsgKey() {
    return lastMsgKey;
  }


  public void setLastMsgKey(String lastMsgKey) {
    this.lastMsgKey = lastMsgKey;
  }


  public GetRoamMsgResponseAllOf msgList(List<GetRoamMsgResponseAllOfMsgList> msgList) {
    
    this.msgList = msgList;
    return this;
  }

  public GetRoamMsgResponseAllOf addMsgListItem(GetRoamMsgResponseAllOfMsgList msgListItem) {
    if (this.msgList == null) {
      this.msgList = new ArrayList<>();
    }
    this.msgList.add(msgListItem);
    return this;
  }

   /**
   * 返回的消息列表
   * @return msgList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回的消息列表")

  public List<GetRoamMsgResponseAllOfMsgList> getMsgList() {
    return msgList;
  }


  public void setMsgList(List<GetRoamMsgResponseAllOfMsgList> msgList) {
    this.msgList = msgList;
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
  public GetRoamMsgResponseAllOf putAdditionalProperty(String key, Object value) {
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
    GetRoamMsgResponseAllOf getRoamMsgResponseAllOf = (GetRoamMsgResponseAllOf) o;
    return Objects.equals(this.complete, getRoamMsgResponseAllOf.complete) &&
        Objects.equals(this.msgCnt, getRoamMsgResponseAllOf.msgCnt) &&
        Objects.equals(this.lastMsgTime, getRoamMsgResponseAllOf.lastMsgTime) &&
        Objects.equals(this.lastMsgKey, getRoamMsgResponseAllOf.lastMsgKey) &&
        Objects.equals(this.msgList, getRoamMsgResponseAllOf.msgList)&&
        Objects.equals(this.additionalProperties, getRoamMsgResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complete, msgCnt, lastMsgTime, lastMsgKey, msgList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoamMsgResponseAllOf {\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    msgCnt: ").append(toIndentedString(msgCnt)).append("\n");
    sb.append("    lastMsgTime: ").append(toIndentedString(lastMsgTime)).append("\n");
    sb.append("    lastMsgKey: ").append(toIndentedString(lastMsgKey)).append("\n");
    sb.append("    msgList: ").append(toIndentedString(msgList)).append("\n");
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
    openapiFields.add("Complete");
    openapiFields.add("MsgCnt");
    openapiFields.add("LastMsgTime");
    openapiFields.add("LastMsgKey");
    openapiFields.add("MsgList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetRoamMsgResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetRoamMsgResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRoamMsgResponseAllOf is not found in the empty JSON string", GetRoamMsgResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("LastMsgKey") != null && !jsonObj.get("LastMsgKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LastMsgKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LastMsgKey").toString()));
      }
      JsonArray jsonArraymsgList = jsonObj.getAsJsonArray("MsgList");
      if (jsonArraymsgList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("MsgList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `MsgList` to be an array in the JSON string but got `%s`", jsonObj.get("MsgList").toString()));
        }

        // validate the optional field `MsgList` (array)
        for (int i = 0; i < jsonArraymsgList.size(); i++) {
          GetRoamMsgResponseAllOfMsgList.validateJsonObject(jsonArraymsgList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRoamMsgResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRoamMsgResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRoamMsgResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRoamMsgResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRoamMsgResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GetRoamMsgResponseAllOf value) throws IOException {
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
           public GetRoamMsgResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetRoamMsgResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetRoamMsgResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRoamMsgResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GetRoamMsgResponseAllOf
  */
  public static GetRoamMsgResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRoamMsgResponseAllOf.class);
  }

 /**
  * Convert an instance of GetRoamMsgResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

