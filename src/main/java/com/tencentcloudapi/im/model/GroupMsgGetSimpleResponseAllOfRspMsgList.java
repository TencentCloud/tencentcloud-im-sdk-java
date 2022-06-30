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
 * GroupMsgGetSimpleResponseAllOfRspMsgList
 */

public class GroupMsgGetSimpleResponseAllOfRspMsgList {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_IS_PLACE_MSG = "IsPlaceMsg";
  @SerializedName(SERIALIZED_NAME_IS_PLACE_MSG)
  private Integer isPlaceMsg;

  public static final String SERIALIZED_NAME_MSG_PRIORITY = "MsgPriority";
  @SerializedName(SERIALIZED_NAME_MSG_PRIORITY)
  private Integer msgPriority;

  public static final String SERIALIZED_NAME_MSG_RANDOM = "MsgRandom";
  @SerializedName(SERIALIZED_NAME_MSG_RANDOM)
  private Integer msgRandom;

  public static final String SERIALIZED_NAME_MSG_SEQ = "MsgSeq";
  @SerializedName(SERIALIZED_NAME_MSG_SEQ)
  private Integer msgSeq;

  public static final String SERIALIZED_NAME_MSG_TIME_STAMP = "MsgTimeStamp";
  @SerializedName(SERIALIZED_NAME_MSG_TIME_STAMP)
  private Integer msgTimeStamp;

  public static final String SERIALIZED_NAME_MSG_BODY = "MsgBody";
  @SerializedName(SERIALIZED_NAME_MSG_BODY)
  private List<TIMMsgElement> msgBody = null;

  public static final String SERIALIZED_NAME_IS_SYSTEM_MSG = "IsSystemMsg";
  @SerializedName(SERIALIZED_NAME_IS_SYSTEM_MSG)
  private Integer isSystemMsg;

  public GroupMsgGetSimpleResponseAllOfRspMsgList() { 
  }

  public GroupMsgGetSimpleResponseAllOfRspMsgList fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 消息的发送者
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息的发送者")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList isPlaceMsg(Integer isPlaceMsg) {
    
    this.isPlaceMsg = isPlaceMsg;
    return this;
  }

   /**
   * 是否是空洞消息，当消息被删除或者消息过期后，MsgBody 为空，该字段为1，撤回的消息，该字段为2
   * @return isPlaceMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否是空洞消息，当消息被删除或者消息过期后，MsgBody 为空，该字段为1，撤回的消息，该字段为2")

  public Integer getIsPlaceMsg() {
    return isPlaceMsg;
  }


  public void setIsPlaceMsg(Integer isPlaceMsg) {
    this.isPlaceMsg = isPlaceMsg;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList msgPriority(Integer msgPriority) {
    
    this.msgPriority = msgPriority;
    return this;
  }

   /**
   * 消息的优先级，用于消息去重，有客户端发消息时填写，如果没有填，服务端会自动生成，1表示 High 优先级消息，2表示 Normal 优先级消息，3表示 Low 优先级消息，4表示 Lowest 优先级消息
   * @return msgPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息的优先级，用于消息去重，有客户端发消息时填写，如果没有填，服务端会自动生成，1表示 High 优先级消息，2表示 Normal 优先级消息，3表示 Low 优先级消息，4表示 Lowest 优先级消息")

  public Integer getMsgPriority() {
    return msgPriority;
  }


  public void setMsgPriority(Integer msgPriority) {
    this.msgPriority = msgPriority;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList msgRandom(Integer msgRandom) {
    
    this.msgRandom = msgRandom;
    return this;
  }

   /**
   * 消息随机值，用于对消息去重，有客户端发消息时填写，如果没有填，服务端会自动生成
   * @return msgRandom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息随机值，用于对消息去重，有客户端发消息时填写，如果没有填，服务端会自动生成")

  public Integer getMsgRandom() {
    return msgRandom;
  }


  public void setMsgRandom(Integer msgRandom) {
    this.msgRandom = msgRandom;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * 消息 seq，用于标识唯一消息，值越小发送的越早
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息 seq，用于标识唯一消息，值越小发送的越早")

  public Integer getMsgSeq() {
    return msgSeq;
  }


  public void setMsgSeq(Integer msgSeq) {
    this.msgSeq = msgSeq;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList msgTimeStamp(Integer msgTimeStamp) {
    
    this.msgTimeStamp = msgTimeStamp;
    return this;
  }

   /**
   * 消息被发送的时间戳，server 的时间
   * @return msgTimeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息被发送的时间戳，server 的时间")

  public Integer getMsgTimeStamp() {
    return msgTimeStamp;
  }


  public void setMsgTimeStamp(Integer msgTimeStamp) {
    this.msgTimeStamp = msgTimeStamp;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList msgBody(List<TIMMsgElement> msgBody) {
    
    this.msgBody = msgBody;
    return this;
  }

  public GroupMsgGetSimpleResponseAllOfRspMsgList addMsgBodyItem(TIMMsgElement msgBodyItem) {
    if (this.msgBody == null) {
      this.msgBody = new ArrayList<>();
    }
    this.msgBody.add(msgBodyItem);
    return this;
  }

   /**
   * Get msgBody
   * @return msgBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TIMMsgElement> getMsgBody() {
    return msgBody;
  }


  public void setMsgBody(List<TIMMsgElement> msgBody) {
    this.msgBody = msgBody;
  }


  public GroupMsgGetSimpleResponseAllOfRspMsgList isSystemMsg(Integer isSystemMsg) {
    
    this.isSystemMsg = isSystemMsg;
    return this;
  }

   /**
   * 字段为1时表示系统消息
   * @return isSystemMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "字段为1时表示系统消息")

  public Integer getIsSystemMsg() {
    return isSystemMsg;
  }


  public void setIsSystemMsg(Integer isSystemMsg) {
    this.isSystemMsg = isSystemMsg;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMsgGetSimpleResponseAllOfRspMsgList groupMsgGetSimpleResponseAllOfRspMsgList = (GroupMsgGetSimpleResponseAllOfRspMsgList) o;
    return Objects.equals(this.fromAccount, groupMsgGetSimpleResponseAllOfRspMsgList.fromAccount) &&
        Objects.equals(this.isPlaceMsg, groupMsgGetSimpleResponseAllOfRspMsgList.isPlaceMsg) &&
        Objects.equals(this.msgPriority, groupMsgGetSimpleResponseAllOfRspMsgList.msgPriority) &&
        Objects.equals(this.msgRandom, groupMsgGetSimpleResponseAllOfRspMsgList.msgRandom) &&
        Objects.equals(this.msgSeq, groupMsgGetSimpleResponseAllOfRspMsgList.msgSeq) &&
        Objects.equals(this.msgTimeStamp, groupMsgGetSimpleResponseAllOfRspMsgList.msgTimeStamp) &&
        Objects.equals(this.msgBody, groupMsgGetSimpleResponseAllOfRspMsgList.msgBody) &&
        Objects.equals(this.isSystemMsg, groupMsgGetSimpleResponseAllOfRspMsgList.isSystemMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, isPlaceMsg, msgPriority, msgRandom, msgSeq, msgTimeStamp, msgBody, isSystemMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgGetSimpleResponseAllOfRspMsgList {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    isPlaceMsg: ").append(toIndentedString(isPlaceMsg)).append("\n");
    sb.append("    msgPriority: ").append(toIndentedString(msgPriority)).append("\n");
    sb.append("    msgRandom: ").append(toIndentedString(msgRandom)).append("\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
    sb.append("    msgTimeStamp: ").append(toIndentedString(msgTimeStamp)).append("\n");
    sb.append("    msgBody: ").append(toIndentedString(msgBody)).append("\n");
    sb.append("    isSystemMsg: ").append(toIndentedString(isSystemMsg)).append("\n");
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
    openapiFields.add("IsPlaceMsg");
    openapiFields.add("MsgPriority");
    openapiFields.add("MsgRandom");
    openapiFields.add("MsgSeq");
    openapiFields.add("MsgTimeStamp");
    openapiFields.add("MsgBody");
    openapiFields.add("IsSystemMsg");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupMsgGetSimpleResponseAllOfRspMsgList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupMsgGetSimpleResponseAllOfRspMsgList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupMsgGetSimpleResponseAllOfRspMsgList is not found in the empty JSON string", GroupMsgGetSimpleResponseAllOfRspMsgList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupMsgGetSimpleResponseAllOfRspMsgList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupMsgGetSimpleResponseAllOfRspMsgList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("From_Account") != null && !jsonObj.get("From_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From_Account").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupMsgGetSimpleResponseAllOfRspMsgList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupMsgGetSimpleResponseAllOfRspMsgList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupMsgGetSimpleResponseAllOfRspMsgList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupMsgGetSimpleResponseAllOfRspMsgList.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupMsgGetSimpleResponseAllOfRspMsgList>() {
           @Override
           public void write(JsonWriter out, GroupMsgGetSimpleResponseAllOfRspMsgList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupMsgGetSimpleResponseAllOfRspMsgList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupMsgGetSimpleResponseAllOfRspMsgList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupMsgGetSimpleResponseAllOfRspMsgList
  * @throws IOException if the JSON string is invalid with respect to GroupMsgGetSimpleResponseAllOfRspMsgList
  */
  public static GroupMsgGetSimpleResponseAllOfRspMsgList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupMsgGetSimpleResponseAllOfRspMsgList.class);
  }

 /**
  * Convert an instance of GroupMsgGetSimpleResponseAllOfRspMsgList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

