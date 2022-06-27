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
 * GetC2cUnreadMsgNumRequest
 */

public class GetC2cUnreadMsgNumRequest {
  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_PEER_ACCOUNT = "Peer_Account";
  @SerializedName(SERIALIZED_NAME_PEER_ACCOUNT)
  private List<String> peerAccount = null;

  public GetC2cUnreadMsgNumRequest() { 
  }

  public GetC2cUnreadMsgNumRequest toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 待查询的用户 UserId
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "待查询的用户 UserId")

  public String getToAccount() {
    return toAccount;
  }


  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public GetC2cUnreadMsgNumRequest peerAccount(List<String> peerAccount) {
    
    this.peerAccount = peerAccount;
    return this;
  }

  public GetC2cUnreadMsgNumRequest addPeerAccountItem(String peerAccountItem) {
    if (this.peerAccount == null) {
      this.peerAccount = new ArrayList<>();
    }
    this.peerAccount.add(peerAccountItem);
    return this;
  }

   /**
   * 待查询的单聊会话对端的用户 UserId。若要查询单个会话的未读数，该字段必填该数组最大大小为10
   * @return peerAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "待查询的单聊会话对端的用户 UserId。若要查询单个会话的未读数，该字段必填该数组最大大小为10")

  public List<String> getPeerAccount() {
    return peerAccount;
  }


  public void setPeerAccount(List<String> peerAccount) {
    this.peerAccount = peerAccount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetC2cUnreadMsgNumRequest getC2cUnreadMsgNumRequest = (GetC2cUnreadMsgNumRequest) o;
    return Objects.equals(this.toAccount, getC2cUnreadMsgNumRequest.toAccount) &&
        Objects.equals(this.peerAccount, getC2cUnreadMsgNumRequest.peerAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, peerAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetC2cUnreadMsgNumRequest {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    peerAccount: ").append(toIndentedString(peerAccount)).append("\n");
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
    openapiFields.add("To_Account");
    openapiFields.add("Peer_Account");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("To_Account");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetC2cUnreadMsgNumRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetC2cUnreadMsgNumRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetC2cUnreadMsgNumRequest is not found in the empty JSON string", GetC2cUnreadMsgNumRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetC2cUnreadMsgNumRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetC2cUnreadMsgNumRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetC2cUnreadMsgNumRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("Peer_Account") != null && !jsonObj.get("Peer_Account").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Peer_Account` to be an array in the JSON string but got `%s`", jsonObj.get("Peer_Account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetC2cUnreadMsgNumRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetC2cUnreadMsgNumRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetC2cUnreadMsgNumRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetC2cUnreadMsgNumRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetC2cUnreadMsgNumRequest>() {
           @Override
           public void write(JsonWriter out, GetC2cUnreadMsgNumRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetC2cUnreadMsgNumRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetC2cUnreadMsgNumRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetC2cUnreadMsgNumRequest
  * @throws IOException if the JSON string is invalid with respect to GetC2cUnreadMsgNumRequest
  */
  public static GetC2cUnreadMsgNumRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetC2cUnreadMsgNumRequest.class);
  }

 /**
  * Convert an instance of GetC2cUnreadMsgNumRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

