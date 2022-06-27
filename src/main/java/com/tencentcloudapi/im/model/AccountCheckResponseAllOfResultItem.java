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
 * AccountCheckResponseAllOfResultItem
 */

public class AccountCheckResponseAllOfResultItem {
  public static final String SERIALIZED_NAME_RESULT_CODE = "ResultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private Integer resultCode;

  public static final String SERIALIZED_NAME_RESULT_INFO = "ResultInfo";
  @SerializedName(SERIALIZED_NAME_RESULT_INFO)
  private String resultInfo;

  public static final String SERIALIZED_NAME_USER_I_D = "UserID";
  @SerializedName(SERIALIZED_NAME_USER_I_D)
  private String userID;

  public static final String SERIALIZED_NAME_ACCOUNT_STATUS = "AccountStatus";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STATUS)
  private String accountStatus;

  public AccountCheckResponseAllOfResultItem() { 
  }

  public AccountCheckResponseAllOfResultItem resultCode(Integer resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * 单个帐号的检查结果：0表示成功，非0表示失败
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单个帐号的检查结果：0表示成功，非0表示失败")

  public Integer getResultCode() {
    return resultCode;
  }


  public void setResultCode(Integer resultCode) {
    this.resultCode = resultCode;
  }


  public AccountCheckResponseAllOfResultItem resultInfo(String resultInfo) {
    
    this.resultInfo = resultInfo;
    return this;
  }

   /**
   * 单个帐号检查失败时的错误描述信息
   * @return resultInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单个帐号检查失败时的错误描述信息")

  public String getResultInfo() {
    return resultInfo;
  }


  public void setResultInfo(String resultInfo) {
    this.resultInfo = resultInfo;
  }


  public AccountCheckResponseAllOfResultItem userID(String userID) {
    
    this.userID = userID;
    return this;
  }

   /**
   * 请求检查的帐号的 UserID
   * @return userID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求检查的帐号的 UserID")

  public String getUserID() {
    return userID;
  }


  public void setUserID(String userID) {
    this.userID = userID;
  }


  public AccountCheckResponseAllOfResultItem accountStatus(String accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * 单个帐号的导入状态：Imported 表示已导入，NotImported 表示未导入
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单个帐号的导入状态：Imported 表示已导入，NotImported 表示未导入")

  public String getAccountStatus() {
    return accountStatus;
  }


  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCheckResponseAllOfResultItem accountCheckResponseAllOfResultItem = (AccountCheckResponseAllOfResultItem) o;
    return Objects.equals(this.resultCode, accountCheckResponseAllOfResultItem.resultCode) &&
        Objects.equals(this.resultInfo, accountCheckResponseAllOfResultItem.resultInfo) &&
        Objects.equals(this.userID, accountCheckResponseAllOfResultItem.userID) &&
        Objects.equals(this.accountStatus, accountCheckResponseAllOfResultItem.accountStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultCode, resultInfo, userID, accountStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCheckResponseAllOfResultItem {\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
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
    openapiFields.add("ResultCode");
    openapiFields.add("ResultInfo");
    openapiFields.add("UserID");
    openapiFields.add("AccountStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountCheckResponseAllOfResultItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AccountCheckResponseAllOfResultItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountCheckResponseAllOfResultItem is not found in the empty JSON string", AccountCheckResponseAllOfResultItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccountCheckResponseAllOfResultItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountCheckResponseAllOfResultItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ResultInfo") != null && !jsonObj.get("ResultInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ResultInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ResultInfo").toString()));
      }
      if (jsonObj.get("UserID") != null && !jsonObj.get("UserID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UserID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UserID").toString()));
      }
      if (jsonObj.get("AccountStatus") != null && !jsonObj.get("AccountStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountCheckResponseAllOfResultItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountCheckResponseAllOfResultItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountCheckResponseAllOfResultItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountCheckResponseAllOfResultItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountCheckResponseAllOfResultItem>() {
           @Override
           public void write(JsonWriter out, AccountCheckResponseAllOfResultItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountCheckResponseAllOfResultItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountCheckResponseAllOfResultItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountCheckResponseAllOfResultItem
  * @throws IOException if the JSON string is invalid with respect to AccountCheckResponseAllOfResultItem
  */
  public static AccountCheckResponseAllOfResultItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountCheckResponseAllOfResultItem.class);
  }

 /**
  * Convert an instance of AccountCheckResponseAllOfResultItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

