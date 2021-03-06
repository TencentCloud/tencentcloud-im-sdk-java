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
import com.tencentcloudapi.im.model.TIMMsgElement;
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
 * GetRoamMsgResponseAllOfMsgList
 */

public class GetRoamMsgResponseAllOfMsgList {
  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_MSG_RANDOM = "MsgRandom";
  @SerializedName(SERIALIZED_NAME_MSG_RANDOM)
  private Integer msgRandom;

  public static final String SERIALIZED_NAME_MSG_TIME_STAMP = "MsgTimeStamp";
  @SerializedName(SERIALIZED_NAME_MSG_TIME_STAMP)
  private Integer msgTimeStamp;

  public static final String SERIALIZED_NAME_MSG_FLAG_BITS = "MsgFlagBits";
  @SerializedName(SERIALIZED_NAME_MSG_FLAG_BITS)
  private Integer msgFlagBits;

  public static final String SERIALIZED_NAME_MSG_KEY = "MsgKey";
  @SerializedName(SERIALIZED_NAME_MSG_KEY)
  private String msgKey;

  public static final String SERIALIZED_NAME_MSG_BODY = "MsgBody";
  @SerializedName(SERIALIZED_NAME_MSG_BODY)
  private List<TIMMsgElement> msgBody = null;

  public static final String SERIALIZED_NAME_CLOUD_CUSTOM_DATA = "CloudCustomData";
  @SerializedName(SERIALIZED_NAME_CLOUD_CUSTOM_DATA)
  private String cloudCustomData;

  public GetRoamMsgResponseAllOfMsgList() { 
  }

  public GetRoamMsgResponseAllOfMsgList fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * ??????????????? UserID
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????? UserID")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public GetRoamMsgResponseAllOfMsgList toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * ??????????????? UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????? UserID")

  public String getToAccount() {
    return toAccount;
  }


  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public GetRoamMsgResponseAllOfMsgList msgRandom(Integer msgRandom) {
    
    this.msgRandom = msgRandom;
    return this;
  }

   /**
   * ??????????????????32???????????????????????????????????????????????????????????????????????????????????????????????????
   * @return msgRandom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????32???????????????????????????????????????????????????????????????????????????????????????????????????")

  public Integer getMsgRandom() {
    return msgRandom;
  }


  public void setMsgRandom(Integer msgRandom) {
    this.msgRandom = msgRandom;
  }


  public GetRoamMsgResponseAllOfMsgList msgTimeStamp(Integer msgTimeStamp) {
    
    this.msgTimeStamp = msgTimeStamp;
    return this;
  }

   /**
   * ??????????????????UNIX ????????????????????????
   * @return msgTimeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????UNIX ????????????????????????")

  public Integer getMsgTimeStamp() {
    return msgTimeStamp;
  }


  public void setMsgTimeStamp(Integer msgTimeStamp) {
    this.msgTimeStamp = msgTimeStamp;
  }


  public GetRoamMsgResponseAllOfMsgList msgFlagBits(Integer msgFlagBits) {
    
    this.msgFlagBits = msgFlagBits;
    return this;
  }

   /**
   * ????????????????????????0?????????????????????8????????????????????????
   * @return msgFlagBits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "????????????????????????0?????????????????????8????????????????????????")

  public Integer getMsgFlagBits() {
    return msgFlagBits;
  }


  public void setMsgFlagBits(Integer msgFlagBits) {
    this.msgFlagBits = msgFlagBits;
  }


  public GetRoamMsgResponseAllOfMsgList msgKey(String msgKey) {
    
    this.msgKey = msgKey;
    return this;
  }

   /**
   * ?????????????????????????????? REST API???https://cloud.tencent.com/document/product/269/38980??? ??????????????????
   * @return msgKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????? REST API???https://cloud.tencent.com/document/product/269/38980??? ??????????????????")

  public String getMsgKey() {
    return msgKey;
  }


  public void setMsgKey(String msgKey) {
    this.msgKey = msgKey;
  }


  public GetRoamMsgResponseAllOfMsgList msgBody(List<TIMMsgElement> msgBody) {
    
    this.msgBody = msgBody;
    return this;
  }

  public GetRoamMsgResponseAllOfMsgList addMsgBodyItem(TIMMsgElement msgBodyItem) {
    if (this.msgBody == null) {
      this.msgBody = new ArrayList<>();
    }
    this.msgBody.add(msgBodyItem);
    return this;
  }

   /**
   * ????????????
   * @return msgBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "????????????")

  public List<TIMMsgElement> getMsgBody() {
    return msgBody;
  }


  public void setMsgBody(List<TIMMsgElement> msgBody) {
    this.msgBody = msgBody;
  }


  public GetRoamMsgResponseAllOfMsgList cloudCustomData(String cloudCustomData) {
    
    this.cloudCustomData = cloudCustomData;
    return this;
  }

   /**
   * ???????????????????????????????????????????????????????????????????????????????????????????????????
   * @return cloudCustomData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "???????????????????????????????????????????????????????????????????????????????????????????????????")

  public String getCloudCustomData() {
    return cloudCustomData;
  }


  public void setCloudCustomData(String cloudCustomData) {
    this.cloudCustomData = cloudCustomData;
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
  public GetRoamMsgResponseAllOfMsgList putAdditionalProperty(String key, Object value) {
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
    GetRoamMsgResponseAllOfMsgList getRoamMsgResponseAllOfMsgList = (GetRoamMsgResponseAllOfMsgList) o;
    return Objects.equals(this.fromAccount, getRoamMsgResponseAllOfMsgList.fromAccount) &&
        Objects.equals(this.toAccount, getRoamMsgResponseAllOfMsgList.toAccount) &&
        Objects.equals(this.msgRandom, getRoamMsgResponseAllOfMsgList.msgRandom) &&
        Objects.equals(this.msgTimeStamp, getRoamMsgResponseAllOfMsgList.msgTimeStamp) &&
        Objects.equals(this.msgFlagBits, getRoamMsgResponseAllOfMsgList.msgFlagBits) &&
        Objects.equals(this.msgKey, getRoamMsgResponseAllOfMsgList.msgKey) &&
        Objects.equals(this.msgBody, getRoamMsgResponseAllOfMsgList.msgBody) &&
        Objects.equals(this.cloudCustomData, getRoamMsgResponseAllOfMsgList.cloudCustomData)&&
        Objects.equals(this.additionalProperties, getRoamMsgResponseAllOfMsgList.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, toAccount, msgRandom, msgTimeStamp, msgFlagBits, msgKey, msgBody, cloudCustomData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoamMsgResponseAllOfMsgList {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    msgRandom: ").append(toIndentedString(msgRandom)).append("\n");
    sb.append("    msgTimeStamp: ").append(toIndentedString(msgTimeStamp)).append("\n");
    sb.append("    msgFlagBits: ").append(toIndentedString(msgFlagBits)).append("\n");
    sb.append("    msgKey: ").append(toIndentedString(msgKey)).append("\n");
    sb.append("    msgBody: ").append(toIndentedString(msgBody)).append("\n");
    sb.append("    cloudCustomData: ").append(toIndentedString(cloudCustomData)).append("\n");
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
    openapiFields.add("From_Account");
    openapiFields.add("To_Account");
    openapiFields.add("MsgRandom");
    openapiFields.add("MsgTimeStamp");
    openapiFields.add("MsgFlagBits");
    openapiFields.add("MsgKey");
    openapiFields.add("MsgBody");
    openapiFields.add("CloudCustomData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetRoamMsgResponseAllOfMsgList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetRoamMsgResponseAllOfMsgList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRoamMsgResponseAllOfMsgList is not found in the empty JSON string", GetRoamMsgResponseAllOfMsgList.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("From_Account") != null && !jsonObj.get("From_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From_Account").toString()));
      }
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
      if (jsonObj.get("MsgKey") != null && !jsonObj.get("MsgKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MsgKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MsgKey").toString()));
      }
      JsonArray jsonArraymsgBody = jsonObj.getAsJsonArray("MsgBody");
      if (jsonArraymsgBody != null) {
        // ensure the json data is an array
        if (!jsonObj.get("MsgBody").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `MsgBody` to be an array in the JSON string but got `%s`", jsonObj.get("MsgBody").toString()));
        }

        // validate the optional field `MsgBody` (array)
        for (int i = 0; i < jsonArraymsgBody.size(); i++) {
          TIMMsgElement.validateJsonObject(jsonArraymsgBody.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("CloudCustomData") != null && !jsonObj.get("CloudCustomData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CloudCustomData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CloudCustomData").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRoamMsgResponseAllOfMsgList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRoamMsgResponseAllOfMsgList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRoamMsgResponseAllOfMsgList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRoamMsgResponseAllOfMsgList.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRoamMsgResponseAllOfMsgList>() {
           @Override
           public void write(JsonWriter out, GetRoamMsgResponseAllOfMsgList value) throws IOException {
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
           public GetRoamMsgResponseAllOfMsgList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetRoamMsgResponseAllOfMsgList instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetRoamMsgResponseAllOfMsgList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRoamMsgResponseAllOfMsgList
  * @throws IOException if the JSON string is invalid with respect to GetRoamMsgResponseAllOfMsgList
  */
  public static GetRoamMsgResponseAllOfMsgList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRoamMsgResponseAllOfMsgList.class);
  }

 /**
  * Convert an instance of GetRoamMsgResponseAllOfMsgList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

