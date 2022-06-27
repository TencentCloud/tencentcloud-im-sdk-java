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
 * ImportGroupMsgResponseAllOfImportMsgResult
 */

public class ImportGroupMsgResponseAllOfImportMsgResult {
  public static final String SERIALIZED_NAME_RESULT = "Result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Integer result;

  public static final String SERIALIZED_NAME_MSG_TIME = "MsgTime";
  @SerializedName(SERIALIZED_NAME_MSG_TIME)
  private Integer msgTime;

  public static final String SERIALIZED_NAME_MSG_SEQ = "MsgSeq";
  @SerializedName(SERIALIZED_NAME_MSG_SEQ)
  private Integer msgSeq;

  public ImportGroupMsgResponseAllOfImportMsgResult() { 
  }

  public ImportGroupMsgResponseAllOfImportMsgResult result(Integer result) {
    
    this.result = result;
    return this;
  }

   /**
   * 单条消息导入结果 0表示单条消息成功 10004表示单条消息发送时间无效 80001表示单条消息包含脏字，拒绝存储此消息 80002表示为消息内容过长，目前支持8000字节的消息，请调整消息长度
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单条消息导入结果 0表示单条消息成功 10004表示单条消息发送时间无效 80001表示单条消息包含脏字，拒绝存储此消息 80002表示为消息内容过长，目前支持8000字节的消息，请调整消息长度")

  public Integer getResult() {
    return result;
  }


  public void setResult(Integer result) {
    this.result = result;
  }


  public ImportGroupMsgResponseAllOfImportMsgResult msgTime(Integer msgTime) {
    
    this.msgTime = msgTime;
    return this;
  }

   /**
   * 消息的时间戳
   * @return msgTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息的时间戳")

  public Integer getMsgTime() {
    return msgTime;
  }


  public void setMsgTime(Integer msgTime) {
    this.msgTime = msgTime;
  }


  public ImportGroupMsgResponseAllOfImportMsgResult msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * 消息序列号，唯一标示一条消息
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息序列号，唯一标示一条消息")

  public Integer getMsgSeq() {
    return msgSeq;
  }


  public void setMsgSeq(Integer msgSeq) {
    this.msgSeq = msgSeq;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupMsgResponseAllOfImportMsgResult importGroupMsgResponseAllOfImportMsgResult = (ImportGroupMsgResponseAllOfImportMsgResult) o;
    return Objects.equals(this.result, importGroupMsgResponseAllOfImportMsgResult.result) &&
        Objects.equals(this.msgTime, importGroupMsgResponseAllOfImportMsgResult.msgTime) &&
        Objects.equals(this.msgSeq, importGroupMsgResponseAllOfImportMsgResult.msgSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msgTime, msgSeq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMsgResponseAllOfImportMsgResult {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msgTime: ").append(toIndentedString(msgTime)).append("\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
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
    openapiFields.add("Result");
    openapiFields.add("MsgTime");
    openapiFields.add("MsgSeq");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportGroupMsgResponseAllOfImportMsgResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImportGroupMsgResponseAllOfImportMsgResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportGroupMsgResponseAllOfImportMsgResult is not found in the empty JSON string", ImportGroupMsgResponseAllOfImportMsgResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImportGroupMsgResponseAllOfImportMsgResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportGroupMsgResponseAllOfImportMsgResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportGroupMsgResponseAllOfImportMsgResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportGroupMsgResponseAllOfImportMsgResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportGroupMsgResponseAllOfImportMsgResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportGroupMsgResponseAllOfImportMsgResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportGroupMsgResponseAllOfImportMsgResult>() {
           @Override
           public void write(JsonWriter out, ImportGroupMsgResponseAllOfImportMsgResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportGroupMsgResponseAllOfImportMsgResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImportGroupMsgResponseAllOfImportMsgResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportGroupMsgResponseAllOfImportMsgResult
  * @throws IOException if the JSON string is invalid with respect to ImportGroupMsgResponseAllOfImportMsgResult
  */
  public static ImportGroupMsgResponseAllOfImportMsgResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportGroupMsgResponseAllOfImportMsgResult.class);
  }

 /**
  * Convert an instance of ImportGroupMsgResponseAllOfImportMsgResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

