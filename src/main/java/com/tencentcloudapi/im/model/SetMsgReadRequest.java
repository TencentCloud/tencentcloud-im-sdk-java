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
import java.io.Serializable;

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
 * SetMsgReadRequest
 */

public class SetMsgReadRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_REPORT_ACCOUNT = "Report_Account";
  @SerializedName(SERIALIZED_NAME_REPORT_ACCOUNT)
  private String reportAccount;

  public static final String SERIALIZED_NAME_PEER_ACCOUNT = "Peer_Account";
  @SerializedName(SERIALIZED_NAME_PEER_ACCOUNT)
  private String peerAccount;

  public static final String SERIALIZED_NAME_MSG_READ_TIME = "MsgReadTime";
  @SerializedName(SERIALIZED_NAME_MSG_READ_TIME)
  private String msgReadTime;

  public SetMsgReadRequest() { 
  }

  public SetMsgReadRequest reportAccount(String reportAccount) {
    
    this.reportAccount = reportAccount;
    return this;
  }

   /**
   * 进行消息已读的用户 UserId
   * @return reportAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "进行消息已读的用户 UserId")

  public String getReportAccount() {
    return reportAccount;
  }


  public void setReportAccount(String reportAccount) {
    this.reportAccount = reportAccount;
  }


  public SetMsgReadRequest peerAccount(String peerAccount) {
    
    this.peerAccount = peerAccount;
    return this;
  }

   /**
   * 进行消息已读的单聊会话的另一方用户 UserId
   * @return peerAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "进行消息已读的单聊会话的另一方用户 UserId")

  public String getPeerAccount() {
    return peerAccount;
  }


  public void setPeerAccount(String peerAccount) {
    this.peerAccount = peerAccount;
  }


  public SetMsgReadRequest msgReadTime(String msgReadTime) {
    
    this.msgReadTime = msgReadTime;
    return this;
  }

   /**
   * 时间戳（秒），该时间戳之前的消息全部已读。若不填，则取当前时间戳
   * @return msgReadTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "时间戳（秒），该时间戳之前的消息全部已读。若不填，则取当前时间戳")

  public String getMsgReadTime() {
    return msgReadTime;
  }


  public void setMsgReadTime(String msgReadTime) {
    this.msgReadTime = msgReadTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetMsgReadRequest setMsgReadRequest = (SetMsgReadRequest) o;
    return Objects.equals(this.reportAccount, setMsgReadRequest.reportAccount) &&
        Objects.equals(this.peerAccount, setMsgReadRequest.peerAccount) &&
        Objects.equals(this.msgReadTime, setMsgReadRequest.msgReadTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportAccount, peerAccount, msgReadTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetMsgReadRequest {\n");
    sb.append("    reportAccount: ").append(toIndentedString(reportAccount)).append("\n");
    sb.append("    peerAccount: ").append(toIndentedString(peerAccount)).append("\n");
    sb.append("    msgReadTime: ").append(toIndentedString(msgReadTime)).append("\n");
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
    openapiFields.add("Report_Account");
    openapiFields.add("Peer_Account");
    openapiFields.add("MsgReadTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Report_Account");
    openapiRequiredFields.add("Peer_Account");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SetMsgReadRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SetMsgReadRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetMsgReadRequest is not found in the empty JSON string", SetMsgReadRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SetMsgReadRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetMsgReadRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SetMsgReadRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Report_Account") != null && !jsonObj.get("Report_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Report_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Report_Account").toString()));
      }
      if (jsonObj.get("Peer_Account") != null && !jsonObj.get("Peer_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Peer_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Peer_Account").toString()));
      }
      if (jsonObj.get("MsgReadTime") != null && !jsonObj.get("MsgReadTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MsgReadTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MsgReadTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetMsgReadRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetMsgReadRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetMsgReadRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetMsgReadRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SetMsgReadRequest>() {
           @Override
           public void write(JsonWriter out, SetMsgReadRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetMsgReadRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetMsgReadRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetMsgReadRequest
  * @throws IOException if the JSON string is invalid with respect to SetMsgReadRequest
  */
  public static SetMsgReadRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetMsgReadRequest.class);
  }

 /**
  * Convert an instance of SetMsgReadRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

