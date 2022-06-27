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
 * GetRecentContactListGroupGetResponseAllOfSessionItem
 */

public class GetRecentContactListGroupGetResponseAllOfSessionItem {
  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_MSG_TIME = "MsgTime";
  @SerializedName(SERIALIZED_NAME_MSG_TIME)
  private Integer msgTime;

  public static final String SERIALIZED_NAME_TOP_FLAG = "TopFlag";
  @SerializedName(SERIALIZED_NAME_TOP_FLAG)
  private Integer topFlag;

  public GetRecentContactListGroupGetResponseAllOfSessionItem() { 
  }

  public GetRecentContactListGroupGetResponseAllOfSessionItem type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * 会话类型：1 表示 C2C 会话；2 表示 G2C 会话
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会话类型：1 表示 C2C 会话；2 表示 G2C 会话")

  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    this.type = type;
  }


  public GetRecentContactListGroupGetResponseAllOfSessionItem toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * C2C 会话才会返回，返回会话方的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "C2C 会话才会返回，返回会话方的 UserID")

  public String getToAccount() {
    return toAccount;
  }


  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public GetRecentContactListGroupGetResponseAllOfSessionItem groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * G2C 会话才会返回，返回群 ID
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "G2C 会话才会返回，返回群 ID")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public GetRecentContactListGroupGetResponseAllOfSessionItem msgTime(Integer msgTime) {
    
    this.msgTime = msgTime;
    return this;
  }

   /**
   * 会话时间
   * @return msgTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会话时间")

  public Integer getMsgTime() {
    return msgTime;
  }


  public void setMsgTime(Integer msgTime) {
    this.msgTime = msgTime;
  }


  public GetRecentContactListGroupGetResponseAllOfSessionItem topFlag(Integer topFlag) {
    
    this.topFlag = topFlag;
    return this;
  }

   /**
   * 置顶标记：0 标识普通会话；1 标识置顶会话
   * @return topFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "置顶标记：0 标识普通会话；1 标识置顶会话")

  public Integer getTopFlag() {
    return topFlag;
  }


  public void setTopFlag(Integer topFlag) {
    this.topFlag = topFlag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecentContactListGroupGetResponseAllOfSessionItem getRecentContactListGroupGetResponseAllOfSessionItem = (GetRecentContactListGroupGetResponseAllOfSessionItem) o;
    return Objects.equals(this.type, getRecentContactListGroupGetResponseAllOfSessionItem.type) &&
        Objects.equals(this.toAccount, getRecentContactListGroupGetResponseAllOfSessionItem.toAccount) &&
        Objects.equals(this.groupId, getRecentContactListGroupGetResponseAllOfSessionItem.groupId) &&
        Objects.equals(this.msgTime, getRecentContactListGroupGetResponseAllOfSessionItem.msgTime) &&
        Objects.equals(this.topFlag, getRecentContactListGroupGetResponseAllOfSessionItem.topFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, toAccount, groupId, msgTime, topFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecentContactListGroupGetResponseAllOfSessionItem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    msgTime: ").append(toIndentedString(msgTime)).append("\n");
    sb.append("    topFlag: ").append(toIndentedString(topFlag)).append("\n");
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
    openapiFields.add("Type");
    openapiFields.add("To_Account");
    openapiFields.add("GroupId");
    openapiFields.add("MsgTime");
    openapiFields.add("TopFlag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetRecentContactListGroupGetResponseAllOfSessionItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetRecentContactListGroupGetResponseAllOfSessionItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRecentContactListGroupGetResponseAllOfSessionItem is not found in the empty JSON string", GetRecentContactListGroupGetResponseAllOfSessionItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetRecentContactListGroupGetResponseAllOfSessionItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRecentContactListGroupGetResponseAllOfSessionItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRecentContactListGroupGetResponseAllOfSessionItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRecentContactListGroupGetResponseAllOfSessionItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRecentContactListGroupGetResponseAllOfSessionItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRecentContactListGroupGetResponseAllOfSessionItem.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRecentContactListGroupGetResponseAllOfSessionItem>() {
           @Override
           public void write(JsonWriter out, GetRecentContactListGroupGetResponseAllOfSessionItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRecentContactListGroupGetResponseAllOfSessionItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetRecentContactListGroupGetResponseAllOfSessionItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRecentContactListGroupGetResponseAllOfSessionItem
  * @throws IOException if the JSON string is invalid with respect to GetRecentContactListGroupGetResponseAllOfSessionItem
  */
  public static GetRecentContactListGroupGetResponseAllOfSessionItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRecentContactListGroupGetResponseAllOfSessionItem.class);
  }

 /**
  * Convert an instance of GetRecentContactListGroupGetResponseAllOfSessionItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

