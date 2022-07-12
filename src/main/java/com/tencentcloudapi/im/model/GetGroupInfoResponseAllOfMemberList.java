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
 * GetGroupInfoResponseAllOfMemberList
 */

public class GetGroupInfoResponseAllOfMemberList {
  public static final String SERIALIZED_NAME_MEMBER_ACCOUNT = "Member_Account";
  @SerializedName(SERIALIZED_NAME_MEMBER_ACCOUNT)
  private String memberAccount;

  public static final String SERIALIZED_NAME_ROLE = "Role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_JOIN_TIME = "JoinTime";
  @SerializedName(SERIALIZED_NAME_JOIN_TIME)
  private Integer joinTime;

  public static final String SERIALIZED_NAME_MSG_SEQ = "MsgSeq";
  @SerializedName(SERIALIZED_NAME_MSG_SEQ)
  private Integer msgSeq;

  public static final String SERIALIZED_NAME_MSG_FLAG = "MsgFlag";
  @SerializedName(SERIALIZED_NAME_MSG_FLAG)
  private String msgFlag;

  public static final String SERIALIZED_NAME_LAST_SEND_MSG_TIME = "LastSendMsgTime";
  @SerializedName(SERIALIZED_NAME_LAST_SEND_MSG_TIME)
  private Integer lastSendMsgTime;

  public static final String SERIALIZED_NAME_NAME_CARD = "NameCard";
  @SerializedName(SERIALIZED_NAME_NAME_CARD)
  private String nameCard;

  public static final String SERIALIZED_NAME_SHUT_UP_UNTIL = "ShutUpUntil";
  @SerializedName(SERIALIZED_NAME_SHUT_UP_UNTIL)
  private Integer shutUpUntil;

  public GetGroupInfoResponseAllOfMemberList() { 
  }

  public GetGroupInfoResponseAllOfMemberList memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * 群成员 ID 只读
   * @return memberAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群成员 ID 只读")

  public String getMemberAccount() {
    return memberAccount;
  }


  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  public GetGroupInfoResponseAllOfMemberList role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * 群内身份 群内身份，包括 Owner 群主、Admin 群管理员以及 Member 群成员
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群内身份 群内身份，包括 Owner 群主、Admin 群管理员以及 Member 群成员")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public GetGroupInfoResponseAllOfMemberList joinTime(Integer joinTime) {
    
    this.joinTime = joinTime;
    return this;
  }

   /**
   * 入群时间 只读
   * @return joinTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "入群时间 只读")

  public Integer getJoinTime() {
    return joinTime;
  }


  public void setJoinTime(Integer joinTime) {
    this.joinTime = joinTime;
  }


  public GetGroupInfoResponseAllOfMemberList msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * 该成员当前已读消息 Seq 只读
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该成员当前已读消息 Seq 只读")

  public Integer getMsgSeq() {
    return msgSeq;
  }


  public void setMsgSeq(Integer msgSeq) {
    this.msgSeq = msgSeq;
  }


  public GetGroupInfoResponseAllOfMemberList msgFlag(String msgFlag) {
    
    this.msgFlag = msgFlag;
    return this;
  }

   /**
   * 消息接收选项 消息接收选项，包括如下几种：AcceptAndNotify 表示接收并提示；AcceptNotNotify 表示接收不提示（不会触发 APNs 远程推送）；Discard 表示屏蔽群消息（不会向客户端推送消息）
   * @return msgFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息接收选项 消息接收选项，包括如下几种：AcceptAndNotify 表示接收并提示；AcceptNotNotify 表示接收不提示（不会触发 APNs 远程推送）；Discard 表示屏蔽群消息（不会向客户端推送消息）")

  public String getMsgFlag() {
    return msgFlag;
  }


  public void setMsgFlag(String msgFlag) {
    this.msgFlag = msgFlag;
  }


  public GetGroupInfoResponseAllOfMemberList lastSendMsgTime(Integer lastSendMsgTime) {
    
    this.lastSendMsgTime = lastSendMsgTime;
    return this;
  }

   /**
   * 最后发送消息的时间 支持三个普通群，不支持直播群
   * @return lastSendMsgTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "最后发送消息的时间 支持三个普通群，不支持直播群")

  public Integer getLastSendMsgTime() {
    return lastSendMsgTime;
  }


  public void setLastSendMsgTime(Integer lastSendMsgTime) {
    this.lastSendMsgTime = lastSendMsgTime;
  }


  public GetGroupInfoResponseAllOfMemberList nameCard(String nameCard) {
    
    this.nameCard = nameCard;
    return this;
  }

   /**
   * 群名片 可读可写。最长50字节，不可调整
   * @return nameCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群名片 可读可写。最长50字节，不可调整")

  public String getNameCard() {
    return nameCard;
  }


  public void setNameCard(String nameCard) {
    this.nameCard = nameCard;
  }


  public GetGroupInfoResponseAllOfMemberList shutUpUntil(Integer shutUpUntil) {
    
    this.shutUpUntil = shutUpUntil;
    return this;
  }

   /**
   * 禁言截止时间（UTC 时间）
   * @return shutUpUntil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "禁言截止时间（UTC 时间）")

  public Integer getShutUpUntil() {
    return shutUpUntil;
  }


  public void setShutUpUntil(Integer shutUpUntil) {
    this.shutUpUntil = shutUpUntil;
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
  public GetGroupInfoResponseAllOfMemberList putAdditionalProperty(String key, Object value) {
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
    GetGroupInfoResponseAllOfMemberList getGroupInfoResponseAllOfMemberList = (GetGroupInfoResponseAllOfMemberList) o;
    return Objects.equals(this.memberAccount, getGroupInfoResponseAllOfMemberList.memberAccount) &&
        Objects.equals(this.role, getGroupInfoResponseAllOfMemberList.role) &&
        Objects.equals(this.joinTime, getGroupInfoResponseAllOfMemberList.joinTime) &&
        Objects.equals(this.msgSeq, getGroupInfoResponseAllOfMemberList.msgSeq) &&
        Objects.equals(this.msgFlag, getGroupInfoResponseAllOfMemberList.msgFlag) &&
        Objects.equals(this.lastSendMsgTime, getGroupInfoResponseAllOfMemberList.lastSendMsgTime) &&
        Objects.equals(this.nameCard, getGroupInfoResponseAllOfMemberList.nameCard) &&
        Objects.equals(this.shutUpUntil, getGroupInfoResponseAllOfMemberList.shutUpUntil)&&
        Objects.equals(this.additionalProperties, getGroupInfoResponseAllOfMemberList.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAccount, role, joinTime, msgSeq, msgFlag, lastSendMsgTime, nameCard, shutUpUntil, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupInfoResponseAllOfMemberList {\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
    sb.append("    msgFlag: ").append(toIndentedString(msgFlag)).append("\n");
    sb.append("    lastSendMsgTime: ").append(toIndentedString(lastSendMsgTime)).append("\n");
    sb.append("    nameCard: ").append(toIndentedString(nameCard)).append("\n");
    sb.append("    shutUpUntil: ").append(toIndentedString(shutUpUntil)).append("\n");
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
    openapiFields.add("Member_Account");
    openapiFields.add("Role");
    openapiFields.add("JoinTime");
    openapiFields.add("MsgSeq");
    openapiFields.add("MsgFlag");
    openapiFields.add("LastSendMsgTime");
    openapiFields.add("NameCard");
    openapiFields.add("ShutUpUntil");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetGroupInfoResponseAllOfMemberList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetGroupInfoResponseAllOfMemberList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupInfoResponseAllOfMemberList is not found in the empty JSON string", GetGroupInfoResponseAllOfMemberList.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("Member_Account") != null && !jsonObj.get("Member_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Member_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Member_Account").toString()));
      }
      if (jsonObj.get("Role") != null && !jsonObj.get("Role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Role").toString()));
      }
      if (jsonObj.get("MsgFlag") != null && !jsonObj.get("MsgFlag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MsgFlag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MsgFlag").toString()));
      }
      if (jsonObj.get("NameCard") != null && !jsonObj.get("NameCard").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NameCard` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NameCard").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupInfoResponseAllOfMemberList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupInfoResponseAllOfMemberList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupInfoResponseAllOfMemberList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupInfoResponseAllOfMemberList.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupInfoResponseAllOfMemberList>() {
           @Override
           public void write(JsonWriter out, GetGroupInfoResponseAllOfMemberList value) throws IOException {
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
           public GetGroupInfoResponseAllOfMemberList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetGroupInfoResponseAllOfMemberList instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetGroupInfoResponseAllOfMemberList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGroupInfoResponseAllOfMemberList
  * @throws IOException if the JSON string is invalid with respect to GetGroupInfoResponseAllOfMemberList
  */
  public static GetGroupInfoResponseAllOfMemberList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupInfoResponseAllOfMemberList.class);
  }

 /**
  * Convert an instance of GetGroupInfoResponseAllOfMemberList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

