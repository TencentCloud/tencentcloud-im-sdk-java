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
 * GetC2cUnreadMsgNumResponseAllOfErrorList
 */

public class GetC2cUnreadMsgNumResponseAllOfErrorList {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PEER_ACCOUNT = "Peer_Account";
  @SerializedName(SERIALIZED_NAME_PEER_ACCOUNT)
  private String peerAccount;

  public static final String SERIALIZED_NAME_ERROR_CODE = "ErrorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public GetC2cUnreadMsgNumResponseAllOfErrorList() { 
  }

  public GetC2cUnreadMsgNumResponseAllOfErrorList peerAccount(String peerAccount) {
    
    this.peerAccount = peerAccount;
    return this;
  }

   /**
   * 查询错误的目标帐号
   * @return peerAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "查询错误的目标帐号")

  public String getPeerAccount() {
    return peerAccount;
  }


  public void setPeerAccount(String peerAccount) {
    this.peerAccount = peerAccount;
  }


  public GetC2cUnreadMsgNumResponseAllOfErrorList errorCode(Integer errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 查询错误的错误码。若目标帐号的错误码为70107表示该帐号不存在
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "查询错误的错误码。若目标帐号的错误码为70107表示该帐号不存在")

  public Integer getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetC2cUnreadMsgNumResponseAllOfErrorList getC2cUnreadMsgNumResponseAllOfErrorList = (GetC2cUnreadMsgNumResponseAllOfErrorList) o;
    return Objects.equals(this.peerAccount, getC2cUnreadMsgNumResponseAllOfErrorList.peerAccount) &&
        Objects.equals(this.errorCode, getC2cUnreadMsgNumResponseAllOfErrorList.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peerAccount, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetC2cUnreadMsgNumResponseAllOfErrorList {\n");
    sb.append("    peerAccount: ").append(toIndentedString(peerAccount)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
    openapiFields.add("ErrorCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Peer_Account");
    openapiRequiredFields.add("ErrorCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetC2cUnreadMsgNumResponseAllOfErrorList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetC2cUnreadMsgNumResponseAllOfErrorList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetC2cUnreadMsgNumResponseAllOfErrorList is not found in the empty JSON string", GetC2cUnreadMsgNumResponseAllOfErrorList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetC2cUnreadMsgNumResponseAllOfErrorList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetC2cUnreadMsgNumResponseAllOfErrorList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetC2cUnreadMsgNumResponseAllOfErrorList.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Peer_Account") != null && !jsonObj.get("Peer_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Peer_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Peer_Account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetC2cUnreadMsgNumResponseAllOfErrorList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetC2cUnreadMsgNumResponseAllOfErrorList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetC2cUnreadMsgNumResponseAllOfErrorList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetC2cUnreadMsgNumResponseAllOfErrorList.class));

       return (TypeAdapter<T>) new TypeAdapter<GetC2cUnreadMsgNumResponseAllOfErrorList>() {
           @Override
           public void write(JsonWriter out, GetC2cUnreadMsgNumResponseAllOfErrorList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetC2cUnreadMsgNumResponseAllOfErrorList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetC2cUnreadMsgNumResponseAllOfErrorList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetC2cUnreadMsgNumResponseAllOfErrorList
  * @throws IOException if the JSON string is invalid with respect to GetC2cUnreadMsgNumResponseAllOfErrorList
  */
  public static GetC2cUnreadMsgNumResponseAllOfErrorList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetC2cUnreadMsgNumResponseAllOfErrorList.class);
  }

 /**
  * Convert an instance of GetC2cUnreadMsgNumResponseAllOfErrorList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

