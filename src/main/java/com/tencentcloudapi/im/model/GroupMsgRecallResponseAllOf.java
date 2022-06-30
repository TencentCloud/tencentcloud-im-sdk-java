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
import com.tencentcloudapi.im.model.GroupMsgRecallResponseAllOfRecallRetList;
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
 * GroupMsgRecallResponseAllOf
 */

public class GroupMsgRecallResponseAllOf {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RECALL_RET_LIST = "RecallRetList";
  @SerializedName(SERIALIZED_NAME_RECALL_RET_LIST)
  private List<GroupMsgRecallResponseAllOfRecallRetList> recallRetList = null;

  public static final String SERIALIZED_NAME_MSG_SEQ = "MsgSeq";
  @SerializedName(SERIALIZED_NAME_MSG_SEQ)
  private Integer msgSeq;

  public static final String SERIALIZED_NAME_RET_CODE = "RetCode";
  @SerializedName(SERIALIZED_NAME_RET_CODE)
  private Integer retCode;

  public GroupMsgRecallResponseAllOf() { 
  }

  public GroupMsgRecallResponseAllOf recallRetList(List<GroupMsgRecallResponseAllOfRecallRetList> recallRetList) {
    
    this.recallRetList = recallRetList;
    return this;
  }

  public GroupMsgRecallResponseAllOf addRecallRetListItem(GroupMsgRecallResponseAllOfRecallRetList recallRetListItem) {
    if (this.recallRetList == null) {
      this.recallRetList = new ArrayList<>();
    }
    this.recallRetList.add(recallRetListItem);
    return this;
  }

   /**
   * 消息撤回请求的详细结果
   * @return recallRetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息撤回请求的详细结果")

  public List<GroupMsgRecallResponseAllOfRecallRetList> getRecallRetList() {
    return recallRetList;
  }


  public void setRecallRetList(List<GroupMsgRecallResponseAllOfRecallRetList> recallRetList) {
    this.recallRetList = recallRetList;
  }


  public GroupMsgRecallResponseAllOf msgSeq(Integer msgSeq) {
    
    this.msgSeq = msgSeq;
    return this;
  }

   /**
   * 单个被撤回消息的 seq
   * @return msgSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单个被撤回消息的 seq")

  public Integer getMsgSeq() {
    return msgSeq;
  }


  public void setMsgSeq(Integer msgSeq) {
    this.msgSeq = msgSeq;
  }


  public GroupMsgRecallResponseAllOf retCode(Integer retCode) {
    
    this.retCode = retCode;
    return this;
  }

   /**
   * 单个消息的被撤回结果：0表示成功；其它表示失败，参考下文错误码说明
   * @return retCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单个消息的被撤回结果：0表示成功；其它表示失败，参考下文错误码说明")

  public Integer getRetCode() {
    return retCode;
  }


  public void setRetCode(Integer retCode) {
    this.retCode = retCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMsgRecallResponseAllOf groupMsgRecallResponseAllOf = (GroupMsgRecallResponseAllOf) o;
    return Objects.equals(this.recallRetList, groupMsgRecallResponseAllOf.recallRetList) &&
        Objects.equals(this.msgSeq, groupMsgRecallResponseAllOf.msgSeq) &&
        Objects.equals(this.retCode, groupMsgRecallResponseAllOf.retCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recallRetList, msgSeq, retCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgRecallResponseAllOf {\n");
    sb.append("    recallRetList: ").append(toIndentedString(recallRetList)).append("\n");
    sb.append("    msgSeq: ").append(toIndentedString(msgSeq)).append("\n");
    sb.append("    retCode: ").append(toIndentedString(retCode)).append("\n");
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
    openapiFields.add("RecallRetList");
    openapiFields.add("MsgSeq");
    openapiFields.add("RetCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupMsgRecallResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupMsgRecallResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupMsgRecallResponseAllOf is not found in the empty JSON string", GroupMsgRecallResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupMsgRecallResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupMsgRecallResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayrecallRetList = jsonObj.getAsJsonArray("RecallRetList");
      if (jsonArrayrecallRetList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("RecallRetList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `RecallRetList` to be an array in the JSON string but got `%s`", jsonObj.get("RecallRetList").toString()));
        }

        // validate the optional field `RecallRetList` (array)
        for (int i = 0; i < jsonArrayrecallRetList.size(); i++) {
          GroupMsgRecallResponseAllOfRecallRetList.validateJsonObject(jsonArrayrecallRetList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupMsgRecallResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupMsgRecallResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupMsgRecallResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupMsgRecallResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupMsgRecallResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GroupMsgRecallResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupMsgRecallResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupMsgRecallResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupMsgRecallResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GroupMsgRecallResponseAllOf
  */
  public static GroupMsgRecallResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupMsgRecallResponseAllOf.class);
  }

 /**
  * Convert an instance of GroupMsgRecallResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

