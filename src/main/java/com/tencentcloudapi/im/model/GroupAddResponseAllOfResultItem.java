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
 * GroupAddResponseAllOfResultItem
 */

public class GroupAddResponseAllOfResultItem {
  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_RESULT_CODE = "ResultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private Integer resultCode;

  public static final String SERIALIZED_NAME_RESULT_INFO = "ResultInfo";
  @SerializedName(SERIALIZED_NAME_RESULT_INFO)
  private String resultInfo;

  public GroupAddResponseAllOfResultItem() { 
  }

  public GroupAddResponseAllOfResultItem toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 请求加入新分组的好友的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求加入新分组的好友的 UserID")

  public String getToAccount() {
    return toAccount;
  }


  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public GroupAddResponseAllOfResultItem resultCode(Integer resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * To_Account 的处理结果，0表示成功，非0表示失败，非0取值的详细描述请参见 错误码说明（https://cloud.tencent.com/document/product/269/10107#ErrorCode）
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To_Account 的处理结果，0表示成功，非0表示失败，非0取值的详细描述请参见 错误码说明（https://cloud.tencent.com/document/product/269/10107#ErrorCode）")

  public Integer getResultCode() {
    return resultCode;
  }


  public void setResultCode(Integer resultCode) {
    this.resultCode = resultCode;
  }


  public GroupAddResponseAllOfResultItem resultInfo(String resultInfo) {
    
    this.resultInfo = resultInfo;
    return this;
  }

   /**
   * To_Account 的错误描述信息，成功时该字段为空
   * @return resultInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To_Account 的错误描述信息，成功时该字段为空")

  public String getResultInfo() {
    return resultInfo;
  }


  public void setResultInfo(String resultInfo) {
    this.resultInfo = resultInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupAddResponseAllOfResultItem groupAddResponseAllOfResultItem = (GroupAddResponseAllOfResultItem) o;
    return Objects.equals(this.toAccount, groupAddResponseAllOfResultItem.toAccount) &&
        Objects.equals(this.resultCode, groupAddResponseAllOfResultItem.resultCode) &&
        Objects.equals(this.resultInfo, groupAddResponseAllOfResultItem.resultInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, resultCode, resultInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupAddResponseAllOfResultItem {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
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
    openapiFields.add("ResultCode");
    openapiFields.add("ResultInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupAddResponseAllOfResultItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupAddResponseAllOfResultItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupAddResponseAllOfResultItem is not found in the empty JSON string", GroupAddResponseAllOfResultItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupAddResponseAllOfResultItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupAddResponseAllOfResultItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
      if (jsonObj.get("ResultInfo") != null && !jsonObj.get("ResultInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ResultInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ResultInfo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupAddResponseAllOfResultItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupAddResponseAllOfResultItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupAddResponseAllOfResultItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupAddResponseAllOfResultItem.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupAddResponseAllOfResultItem>() {
           @Override
           public void write(JsonWriter out, GroupAddResponseAllOfResultItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupAddResponseAllOfResultItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupAddResponseAllOfResultItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupAddResponseAllOfResultItem
  * @throws IOException if the JSON string is invalid with respect to GroupAddResponseAllOfResultItem
  */
  public static GroupAddResponseAllOfResultItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupAddResponseAllOfResultItem.class);
  }

 /**
  * Convert an instance of GroupAddResponseAllOfResultItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

