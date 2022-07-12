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
import com.tencentcloudapi.im.model.DefinedData;
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
 * CreateGroupRequestMemberListInner
 */

public class CreateGroupRequestMemberListInner {
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

  public static final String SERIALIZED_NAME_NAME_CARD = "NameCard";
  @SerializedName(SERIALIZED_NAME_NAME_CARD)
  private String nameCard;

  public static final String SERIALIZED_NAME_LAST_SEND_MSG_TIME = "LastSendMsgTime";
  @SerializedName(SERIALIZED_NAME_LAST_SEND_MSG_TIME)
  private Integer lastSendMsgTime;

  public static final String SERIALIZED_NAME_APP_MEMBER_DEFINED_DATA = "AppMemberDefinedData";
  @SerializedName(SERIALIZED_NAME_APP_MEMBER_DEFINED_DATA)
  private List<DefinedData> appMemberDefinedData = null;

  public CreateGroupRequestMemberListInner() { 
  }

  public CreateGroupRequestMemberListInner memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * Get memberAccount
   * @return memberAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMemberAccount() {
    return memberAccount;
  }


  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  public CreateGroupRequestMemberListInner role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * 群内身份，包括 Owner 群主、Admin 群管理员以及 Member 群成员
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群内身份，包括 Owner 群主、Admin 群管理员以及 Member 群成员")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public CreateGroupRequestMemberListInner joinTime(Integer joinTime) {
    
    this.joinTime = joinTime;
    return this;
  }

   /**
   * 入群时间
   * @return joinTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "入群时间")

  public Integer getJoinTime() {
    return joinTime;
  }


  public void setJoinTime(Integer joinTime) {
    this.joinTime = joinTime;
  }


  public CreateGroupRequestMemberListInner msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * 该成员当前已读消息 Seq
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该成员当前已读消息 Seq")

  public Integer getMsgSeq() {
    return msgSeq;
  }


  public void setMsgSeq(Integer msgSeq) {
    this.msgSeq = msgSeq;
  }


  public CreateGroupRequestMemberListInner msgFlag(String msgFlag) {
    
    this.msgFlag = msgFlag;
    return this;
  }

   /**
   * 消息接收选项 消息接收选项，包括如下几种 AcceptAndNotify 表示接收并提示 AcceptNotNotify 表示接收不提示（不会触发 APNs 远程推送） Discard 表示屏蔽群消息（不会向客户端推送消息）
   * @return msgFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息接收选项 消息接收选项，包括如下几种 AcceptAndNotify 表示接收并提示 AcceptNotNotify 表示接收不提示（不会触发 APNs 远程推送） Discard 表示屏蔽群消息（不会向客户端推送消息）")

  public String getMsgFlag() {
    return msgFlag;
  }


  public void setMsgFlag(String msgFlag) {
    this.msgFlag = msgFlag;
  }


  public CreateGroupRequestMemberListInner nameCard(String nameCard) {
    
    this.nameCard = nameCard;
    return this;
  }

   /**
   * 可读可写。最长50字节，不可调整
   * @return nameCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "可读可写。最长50字节，不可调整")

  public String getNameCard() {
    return nameCard;
  }


  public void setNameCard(String nameCard) {
    this.nameCard = nameCard;
  }


  public CreateGroupRequestMemberListInner lastSendMsgTime(Integer lastSendMsgTime) {
    
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


  public CreateGroupRequestMemberListInner appMemberDefinedData(List<DefinedData> appMemberDefinedData) {
    
    this.appMemberDefinedData = appMemberDefinedData;
    return this;
  }

  public CreateGroupRequestMemberListInner addAppMemberDefinedDataItem(DefinedData appMemberDefinedDataItem) {
    if (this.appMemberDefinedData == null) {
      this.appMemberDefinedData = new ArrayList<>();
    }
    this.appMemberDefinedData.add(appMemberDefinedDataItem);
    return this;
  }

   /**
   * 群成员维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台(https://console.cloud.tencent.com/im) 进行配置，详情请参阅 自定义字段(https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5)
   * @return appMemberDefinedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群成员维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台(https://console.cloud.tencent.com/im) 进行配置，详情请参阅 自定义字段(https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5)")

  public List<DefinedData> getAppMemberDefinedData() {
    return appMemberDefinedData;
  }


  public void setAppMemberDefinedData(List<DefinedData> appMemberDefinedData) {
    this.appMemberDefinedData = appMemberDefinedData;
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
  public CreateGroupRequestMemberListInner putAdditionalProperty(String key, Object value) {
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
    CreateGroupRequestMemberListInner createGroupRequestMemberListInner = (CreateGroupRequestMemberListInner) o;
    return Objects.equals(this.memberAccount, createGroupRequestMemberListInner.memberAccount) &&
        Objects.equals(this.role, createGroupRequestMemberListInner.role) &&
        Objects.equals(this.joinTime, createGroupRequestMemberListInner.joinTime) &&
        Objects.equals(this.msgSeq, createGroupRequestMemberListInner.msgSeq) &&
        Objects.equals(this.msgFlag, createGroupRequestMemberListInner.msgFlag) &&
        Objects.equals(this.nameCard, createGroupRequestMemberListInner.nameCard) &&
        Objects.equals(this.lastSendMsgTime, createGroupRequestMemberListInner.lastSendMsgTime) &&
        Objects.equals(this.appMemberDefinedData, createGroupRequestMemberListInner.appMemberDefinedData)&&
        Objects.equals(this.additionalProperties, createGroupRequestMemberListInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAccount, role, joinTime, msgSeq, msgFlag, nameCard, lastSendMsgTime, appMemberDefinedData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupRequestMemberListInner {\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
    sb.append("    msgFlag: ").append(toIndentedString(msgFlag)).append("\n");
    sb.append("    nameCard: ").append(toIndentedString(nameCard)).append("\n");
    sb.append("    lastSendMsgTime: ").append(toIndentedString(lastSendMsgTime)).append("\n");
    sb.append("    appMemberDefinedData: ").append(toIndentedString(appMemberDefinedData)).append("\n");
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
    openapiFields.add("NameCard");
    openapiFields.add("LastSendMsgTime");
    openapiFields.add("AppMemberDefinedData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Member_Account");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateGroupRequestMemberListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateGroupRequestMemberListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGroupRequestMemberListInner is not found in the empty JSON string", CreateGroupRequestMemberListInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateGroupRequestMemberListInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
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
      JsonArray jsonArrayappMemberDefinedData = jsonObj.getAsJsonArray("AppMemberDefinedData");
      if (jsonArrayappMemberDefinedData != null) {
        // ensure the json data is an array
        if (!jsonObj.get("AppMemberDefinedData").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `AppMemberDefinedData` to be an array in the JSON string but got `%s`", jsonObj.get("AppMemberDefinedData").toString()));
        }

        // validate the optional field `AppMemberDefinedData` (array)
        for (int i = 0; i < jsonArrayappMemberDefinedData.size(); i++) {
          DefinedData.validateJsonObject(jsonArrayappMemberDefinedData.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGroupRequestMemberListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGroupRequestMemberListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGroupRequestMemberListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGroupRequestMemberListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGroupRequestMemberListInner>() {
           @Override
           public void write(JsonWriter out, CreateGroupRequestMemberListInner value) throws IOException {
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
           public CreateGroupRequestMemberListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateGroupRequestMemberListInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateGroupRequestMemberListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateGroupRequestMemberListInner
  * @throws IOException if the JSON string is invalid with respect to CreateGroupRequestMemberListInner
  */
  public static CreateGroupRequestMemberListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGroupRequestMemberListInner.class);
  }

 /**
  * Convert an instance of CreateGroupRequestMemberListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

