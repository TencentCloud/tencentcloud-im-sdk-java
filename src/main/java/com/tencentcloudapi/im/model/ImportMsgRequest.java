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
 * ImportMsgRequest
 */

public class ImportMsgRequest {
  /**
   * 该字段只能填1或2，其他值是非法值 1表示实时消息导入，消息计入未读计数 2表示历史消息导入，消息不计入未读
   */
  @JsonAdapter(SyncFromOldSystemEnum.Adapter.class)
  public enum SyncFromOldSystemEnum {
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    SyncFromOldSystemEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SyncFromOldSystemEnum fromValue(Integer value) {
      for (SyncFromOldSystemEnum b : SyncFromOldSystemEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SyncFromOldSystemEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SyncFromOldSystemEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SyncFromOldSystemEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return SyncFromOldSystemEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SYNC_FROM_OLD_SYSTEM = "SyncFromOldSystem";
  @SerializedName(SERIALIZED_NAME_SYNC_FROM_OLD_SYSTEM)
  private SyncFromOldSystemEnum syncFromOldSystem;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_MSG_SEQ = "MsgSeq";
  @SerializedName(SERIALIZED_NAME_MSG_SEQ)
  private Integer msgSeq;

  public static final String SERIALIZED_NAME_MSG_RANDOM = "MsgRandom";
  @SerializedName(SERIALIZED_NAME_MSG_RANDOM)
  private Integer msgRandom;

  public static final String SERIALIZED_NAME_MSG_TIME_STAMP = "MsgTimeStamp";
  @SerializedName(SERIALIZED_NAME_MSG_TIME_STAMP)
  private Integer msgTimeStamp;

  public static final String SERIALIZED_NAME_MSG_BODY = "MsgBody";
  @SerializedName(SERIALIZED_NAME_MSG_BODY)
  private List<TIMMsgElement> msgBody = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLOUD_CUSTOM_DATA = "CloudCustomData";
  @SerializedName(SERIALIZED_NAME_CLOUD_CUSTOM_DATA)
  private String cloudCustomData;

  public ImportMsgRequest() { 
  }

  public ImportMsgRequest syncFromOldSystem(SyncFromOldSystemEnum syncFromOldSystem) {
    
    this.syncFromOldSystem = syncFromOldSystem;
    return this;
  }

   /**
   * 该字段只能填1或2，其他值是非法值 1表示实时消息导入，消息计入未读计数 2表示历史消息导入，消息不计入未读
   * @return syncFromOldSystem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "该字段只能填1或2，其他值是非法值 1表示实时消息导入，消息计入未读计数 2表示历史消息导入，消息不计入未读")

  public SyncFromOldSystemEnum getSyncFromOldSystem() {
    return syncFromOldSystem;
  }


  public void setSyncFromOldSystem(SyncFromOldSystemEnum syncFromOldSystem) {
    this.syncFromOldSystem = syncFromOldSystem;
  }


  public ImportMsgRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 消息发送方 UserID，用于指定发送消息方
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "消息发送方 UserID，用于指定发送消息方")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public ImportMsgRequest toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 消息接收方 UserID
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "消息接收方 UserID")

  public String getToAccount() {
    return toAccount;
  }


  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public ImportMsgRequest msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * 消息序列号（32位无符号整数），后台会根据该字段去重及进行同秒内消息的排序，详细规则请看本接口的功能说明。若不填该字段，则由后台填入随机数
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息序列号（32位无符号整数），后台会根据该字段去重及进行同秒内消息的排序，详细规则请看本接口的功能说明。若不填该字段，则由后台填入随机数")

  public Integer getMsgSeq() {
    return msgSeq;
  }


  public void setMsgSeq(Integer msgSeq) {
    this.msgSeq = msgSeq;
  }


  public ImportMsgRequest msgRandom(Integer msgRandom) {
    
    this.msgRandom = msgRandom;
    return this;
  }

   /**
   * 消息随机数（32位无符号整数），后台用于同一秒内的消息去重。请确保该字段填的是随机
   * @return msgRandom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "消息随机数（32位无符号整数），后台用于同一秒内的消息去重。请确保该字段填的是随机")

  public Integer getMsgRandom() {
    return msgRandom;
  }


  public void setMsgRandom(Integer msgRandom) {
    this.msgRandom = msgRandom;
  }


  public ImportMsgRequest msgTimeStamp(Integer msgTimeStamp) {
    
    this.msgTimeStamp = msgTimeStamp;
    return this;
  }

   /**
   * 消息时间戳，UNIX 时间戳，单位为秒。后台会根据该字段去重，详细规则请看本接口的功能说明。
   * @return msgTimeStamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "消息时间戳，UNIX 时间戳，单位为秒。后台会根据该字段去重，详细规则请看本接口的功能说明。")

  public Integer getMsgTimeStamp() {
    return msgTimeStamp;
  }


  public void setMsgTimeStamp(Integer msgTimeStamp) {
    this.msgTimeStamp = msgTimeStamp;
  }


  public ImportMsgRequest msgBody(List<TIMMsgElement> msgBody) {
    
    this.msgBody = msgBody;
    return this;
  }

  public ImportMsgRequest addMsgBodyItem(TIMMsgElement msgBodyItem) {
    this.msgBody.add(msgBodyItem);
    return this;
  }

   /**
   * 消息内容，具体格式请参考（https://cloud.tencent.com/document/product/269/2720）消息格式描述（注意，一条消息可包括多种消息元素，MsgBody 为 Array 类型）
   * @return msgBody
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "消息内容，具体格式请参考（https://cloud.tencent.com/document/product/269/2720）消息格式描述（注意，一条消息可包括多种消息元素，MsgBody 为 Array 类型）")

  public List<TIMMsgElement> getMsgBody() {
    return msgBody;
  }


  public void setMsgBody(List<TIMMsgElement> msgBody) {
    this.msgBody = msgBody;
  }


  public ImportMsgRequest cloudCustomData(String cloudCustomData) {
    
    this.cloudCustomData = cloudCustomData;
    return this;
  }

   /**
   * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
   * @return cloudCustomData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）")

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
  public ImportMsgRequest putAdditionalProperty(String key, Object value) {
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
    ImportMsgRequest importMsgRequest = (ImportMsgRequest) o;
    return Objects.equals(this.syncFromOldSystem, importMsgRequest.syncFromOldSystem) &&
        Objects.equals(this.fromAccount, importMsgRequest.fromAccount) &&
        Objects.equals(this.toAccount, importMsgRequest.toAccount) &&
        Objects.equals(this.msgSeq, importMsgRequest.msgSeq) &&
        Objects.equals(this.msgRandom, importMsgRequest.msgRandom) &&
        Objects.equals(this.msgTimeStamp, importMsgRequest.msgTimeStamp) &&
        Objects.equals(this.msgBody, importMsgRequest.msgBody) &&
        Objects.equals(this.cloudCustomData, importMsgRequest.cloudCustomData)&&
        Objects.equals(this.additionalProperties, importMsgRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncFromOldSystem, fromAccount, toAccount, msgSeq, msgRandom, msgTimeStamp, msgBody, cloudCustomData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportMsgRequest {\n");
    sb.append("    syncFromOldSystem: ").append(toIndentedString(syncFromOldSystem)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
    sb.append("    msgRandom: ").append(toIndentedString(msgRandom)).append("\n");
    sb.append("    msgTimeStamp: ").append(toIndentedString(msgTimeStamp)).append("\n");
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
    openapiFields.add("SyncFromOldSystem");
    openapiFields.add("From_Account");
    openapiFields.add("To_Account");
    openapiFields.add("MsgSeq");
    openapiFields.add("MsgRandom");
    openapiFields.add("MsgTimeStamp");
    openapiFields.add("MsgBody");
    openapiFields.add("CloudCustomData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("SyncFromOldSystem");
    openapiRequiredFields.add("From_Account");
    openapiRequiredFields.add("To_Account");
    openapiRequiredFields.add("MsgRandom");
    openapiRequiredFields.add("MsgTimeStamp");
    openapiRequiredFields.add("MsgBody");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportMsgRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImportMsgRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportMsgRequest is not found in the empty JSON string", ImportMsgRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImportMsgRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("From_Account") != null && !jsonObj.get("From_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From_Account").toString()));
      }
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
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
       if (!ImportMsgRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportMsgRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportMsgRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportMsgRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportMsgRequest>() {
           @Override
           public void write(JsonWriter out, ImportMsgRequest value) throws IOException {
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
           public ImportMsgRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ImportMsgRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ImportMsgRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportMsgRequest
  * @throws IOException if the JSON string is invalid with respect to ImportMsgRequest
  */
  public static ImportMsgRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportMsgRequest.class);
  }

 /**
  * Convert an instance of ImportMsgRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

