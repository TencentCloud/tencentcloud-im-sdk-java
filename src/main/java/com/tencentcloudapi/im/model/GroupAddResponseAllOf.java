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
import com.tencentcloudapi.im.model.GroupAddResponseAllOfResultItem;
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
 * GroupAddResponseAllOf
 */

public class GroupAddResponseAllOf {
  public static final String SERIALIZED_NAME_RESULT_ITEM = "ResultItem";
  @SerializedName(SERIALIZED_NAME_RESULT_ITEM)
  private List<GroupAddResponseAllOfResultItem> resultItem = null;

  public static final String SERIALIZED_NAME_FAIL_ACCOUNT = "Fail_Account";
  @SerializedName(SERIALIZED_NAME_FAIL_ACCOUNT)
  private List<String> failAccount = null;

  public static final String SERIALIZED_NAME_CURRENT_SEQUENCE = "CurrentSequence";
  @SerializedName(SERIALIZED_NAME_CURRENT_SEQUENCE)
  private Integer currentSequence;

  public static final String SERIALIZED_NAME_ERROR_DISPLAY = "ErrorDisplay";
  @SerializedName(SERIALIZED_NAME_ERROR_DISPLAY)
  private String errorDisplay;

  public GroupAddResponseAllOf() { 
  }

  public GroupAddResponseAllOf resultItem(List<GroupAddResponseAllOfResultItem> resultItem) {
    
    this.resultItem = resultItem;
    return this;
  }

  public GroupAddResponseAllOf addResultItemItem(GroupAddResponseAllOfResultItem resultItemItem) {
    if (this.resultItem == null) {
      this.resultItem = new ArrayList<>();
    }
    this.resultItem.add(resultItemItem);
    return this;
  }

   /**
   * 好友加入新增分组的结果对象数组
   * @return resultItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "好友加入新增分组的结果对象数组")

  public List<GroupAddResponseAllOfResultItem> getResultItem() {
    return resultItem;
  }


  public void setResultItem(List<GroupAddResponseAllOfResultItem> resultItem) {
    this.resultItem = resultItem;
  }


  public GroupAddResponseAllOf failAccount(List<String> failAccount) {
    
    this.failAccount = failAccount;
    return this;
  }

  public GroupAddResponseAllOf addFailAccountItem(String failAccountItem) {
    if (this.failAccount == null) {
      this.failAccount = new ArrayList<>();
    }
    this.failAccount.add(failAccountItem);
    return this;
  }

   /**
   * 返回处理失败的用户列表，仅当存在失败用户时才返回该字段
   * @return failAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回处理失败的用户列表，仅当存在失败用户时才返回该字段")

  public List<String> getFailAccount() {
    return failAccount;
  }


  public void setFailAccount(List<String> failAccount) {
    this.failAccount = failAccount;
  }


  public GroupAddResponseAllOf currentSequence(Integer currentSequence) {
    
    this.currentSequence = currentSequence;
    return this;
  }

   /**
   * 返回最新的分组 Sequence
   * @return currentSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回最新的分组 Sequence")

  public Integer getCurrentSequence() {
    return currentSequence;
  }


  public void setCurrentSequence(Integer currentSequence) {
    this.currentSequence = currentSequence;
  }


  public GroupAddResponseAllOf errorDisplay(String errorDisplay) {
    
    this.errorDisplay = errorDisplay;
    return this;
  }

   /**
   * 详细的客户端展示信息
   * @return errorDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "详细的客户端展示信息")

  public String getErrorDisplay() {
    return errorDisplay;
  }


  public void setErrorDisplay(String errorDisplay) {
    this.errorDisplay = errorDisplay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupAddResponseAllOf groupAddResponseAllOf = (GroupAddResponseAllOf) o;
    return Objects.equals(this.resultItem, groupAddResponseAllOf.resultItem) &&
        Objects.equals(this.failAccount, groupAddResponseAllOf.failAccount) &&
        Objects.equals(this.currentSequence, groupAddResponseAllOf.currentSequence) &&
        Objects.equals(this.errorDisplay, groupAddResponseAllOf.errorDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultItem, failAccount, currentSequence, errorDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupAddResponseAllOf {\n");
    sb.append("    resultItem: ").append(toIndentedString(resultItem)).append("\n");
    sb.append("    failAccount: ").append(toIndentedString(failAccount)).append("\n");
    sb.append("    currentSequence: ").append(toIndentedString(currentSequence)).append("\n");
    sb.append("    errorDisplay: ").append(toIndentedString(errorDisplay)).append("\n");
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
    openapiFields.add("ResultItem");
    openapiFields.add("Fail_Account");
    openapiFields.add("CurrentSequence");
    openapiFields.add("ErrorDisplay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupAddResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupAddResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupAddResponseAllOf is not found in the empty JSON string", GroupAddResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupAddResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupAddResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayresultItem = jsonObj.getAsJsonArray("ResultItem");
      if (jsonArrayresultItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ResultItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ResultItem` to be an array in the JSON string but got `%s`", jsonObj.get("ResultItem").toString()));
        }

        // validate the optional field `ResultItem` (array)
        for (int i = 0; i < jsonArrayresultItem.size(); i++) {
          GroupAddResponseAllOfResultItem.validateJsonObject(jsonArrayresultItem.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("Fail_Account") != null && !jsonObj.get("Fail_Account").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Fail_Account` to be an array in the JSON string but got `%s`", jsonObj.get("Fail_Account").toString()));
      }
      if (jsonObj.get("ErrorDisplay") != null && !jsonObj.get("ErrorDisplay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ErrorDisplay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ErrorDisplay").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupAddResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupAddResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupAddResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupAddResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupAddResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GroupAddResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupAddResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupAddResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupAddResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GroupAddResponseAllOf
  */
  public static GroupAddResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupAddResponseAllOf.class);
  }

 /**
  * Convert an instance of GroupAddResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

