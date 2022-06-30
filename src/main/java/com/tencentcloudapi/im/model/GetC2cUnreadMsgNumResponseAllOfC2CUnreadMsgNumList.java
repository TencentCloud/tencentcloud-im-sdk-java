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
 * GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList
 */

public class GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PEER_ACCOUNT = "Peer_Account";
  @SerializedName(SERIALIZED_NAME_PEER_ACCOUNT)
  private String peerAccount;

  public static final String SERIALIZED_NAME_C2_C_UNREAD_MSG_NUM = "C2CUnreadMsgNum";
  @SerializedName(SERIALIZED_NAME_C2_C_UNREAD_MSG_NUM)
  private String c2CUnreadMsgNum;

  public GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList() { 
  }

  public GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList peerAccount(String peerAccount) {
    
    this.peerAccount = peerAccount;
    return this;
  }

   /**
   * 单聊会话对端 UserId
   * @return peerAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单聊会话对端 UserId")

  public String getPeerAccount() {
    return peerAccount;
  }


  public void setPeerAccount(String peerAccount) {
    this.peerAccount = peerAccount;
  }


  public GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList c2CUnreadMsgNum(String c2CUnreadMsgNum) {
    
    this.c2CUnreadMsgNum = c2CUnreadMsgNum;
    return this;
  }

   /**
   * 该单聊会话的未读数
   * @return c2CUnreadMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该单聊会话的未读数")

  public String getC2CUnreadMsgNum() {
    return c2CUnreadMsgNum;
  }


  public void setC2CUnreadMsgNum(String c2CUnreadMsgNum) {
    this.c2CUnreadMsgNum = c2CUnreadMsgNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList getC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList = (GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList) o;
    return Objects.equals(this.peerAccount, getC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.peerAccount) &&
        Objects.equals(this.c2CUnreadMsgNum, getC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.c2CUnreadMsgNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peerAccount, c2CUnreadMsgNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList {\n");
    sb.append("    peerAccount: ").append(toIndentedString(peerAccount)).append("\n");
    sb.append("    c2CUnreadMsgNum: ").append(toIndentedString(c2CUnreadMsgNum)).append("\n");
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
    openapiFields.add("Peer_Account");
    openapiFields.add("C2CUnreadMsgNum");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList is not found in the empty JSON string", GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("Peer_Account") != null && !jsonObj.get("Peer_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Peer_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Peer_Account").toString()));
      }
      if (jsonObj.get("C2CUnreadMsgNum") != null && !jsonObj.get("C2CUnreadMsgNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `C2CUnreadMsgNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("C2CUnreadMsgNum").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.class));

       return (TypeAdapter<T>) new TypeAdapter<GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList>() {
           @Override
           public void write(JsonWriter out, GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList
  * @throws IOException if the JSON string is invalid with respect to GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList
  */
  public static GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.class);
  }

 /**
  * Convert an instance of GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

