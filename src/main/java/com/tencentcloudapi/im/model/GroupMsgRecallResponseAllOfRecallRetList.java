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
 * GroupMsgRecallResponseAllOfRecallRetList
 */

public class GroupMsgRecallResponseAllOfRecallRetList {
  public static final String SERIALIZED_NAME_MSG_SEQ = "MsgSeq";
  @SerializedName(SERIALIZED_NAME_MSG_SEQ)
  private Integer msgSeq;

  public static final String SERIALIZED_NAME_RET_CODE = "RetCode";
  @SerializedName(SERIALIZED_NAME_RET_CODE)
  private Integer retCode;

  public GroupMsgRecallResponseAllOfRecallRetList() { 
  }

  public GroupMsgRecallResponseAllOfRecallRetList msgSeq(Integer msgSeq) {
    
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


  public GroupMsgRecallResponseAllOfRecallRetList retCode(Integer retCode) {
    
    this.retCode = retCode;
    return this;
  }

   /**
   * 单个消息的被撤回结果：0表示成功；其它表示失败，参考下文错误码说明（https://cloud.tencent.com/document/product/269/12341#.E5.BA.94.E7.AD.94.E5.8C.85.E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E）
   * @return retCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单个消息的被撤回结果：0表示成功；其它表示失败，参考下文错误码说明（https://cloud.tencent.com/document/product/269/12341#.E5.BA.94.E7.AD.94.E5.8C.85.E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E）")

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
    GroupMsgRecallResponseAllOfRecallRetList groupMsgRecallResponseAllOfRecallRetList = (GroupMsgRecallResponseAllOfRecallRetList) o;
    return Objects.equals(this.msgSeq, groupMsgRecallResponseAllOfRecallRetList.msgSeq) &&
        Objects.equals(this.retCode, groupMsgRecallResponseAllOfRecallRetList.retCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgSeq, retCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMsgRecallResponseAllOfRecallRetList {\n");
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
    openapiFields.add("MsgSeq");
    openapiFields.add("RetCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupMsgRecallResponseAllOfRecallRetList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupMsgRecallResponseAllOfRecallRetList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupMsgRecallResponseAllOfRecallRetList is not found in the empty JSON string", GroupMsgRecallResponseAllOfRecallRetList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupMsgRecallResponseAllOfRecallRetList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupMsgRecallResponseAllOfRecallRetList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupMsgRecallResponseAllOfRecallRetList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupMsgRecallResponseAllOfRecallRetList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupMsgRecallResponseAllOfRecallRetList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupMsgRecallResponseAllOfRecallRetList.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupMsgRecallResponseAllOfRecallRetList>() {
           @Override
           public void write(JsonWriter out, GroupMsgRecallResponseAllOfRecallRetList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupMsgRecallResponseAllOfRecallRetList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupMsgRecallResponseAllOfRecallRetList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupMsgRecallResponseAllOfRecallRetList
  * @throws IOException if the JSON string is invalid with respect to GroupMsgRecallResponseAllOfRecallRetList
  */
  public static GroupMsgRecallResponseAllOfRecallRetList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupMsgRecallResponseAllOfRecallRetList.class);
  }

 /**
  * Convert an instance of GroupMsgRecallResponseAllOfRecallRetList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

