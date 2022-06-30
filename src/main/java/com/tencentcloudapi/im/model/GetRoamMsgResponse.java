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
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.GetRoamMsgResponseAllOf;
import com.tencentcloudapi.im.model.GetRoamMsgResponseAllOfMsgList;
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
 * GetRoamMsgResponse
 */

public class GetRoamMsgResponse {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTION_STATUS = "ActionStatus";
  @SerializedName(SERIALIZED_NAME_ACTION_STATUS)
  private String actionStatus;

  public static final String SERIALIZED_NAME_ERROR_INFO = "ErrorInfo";
  @SerializedName(SERIALIZED_NAME_ERROR_INFO)
  private String errorInfo;

  public static final String SERIALIZED_NAME_ERROR_CODE = "ErrorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  /**
   * 是否全部拉取，0表示未全部拉取，需要续拉，1表示已全部拉取
   */
  @JsonAdapter(CompleteEnum.Adapter.class)
  public enum CompleteEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    CompleteEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompleteEnum fromValue(Integer value) {
      for (CompleteEnum b : CompleteEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CompleteEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompleteEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompleteEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return CompleteEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COMPLETE = "Complete";
  @SerializedName(SERIALIZED_NAME_COMPLETE)
  private CompleteEnum complete;

  public static final String SERIALIZED_NAME_MSG_CNT = "MsgCnt";
  @SerializedName(SERIALIZED_NAME_MSG_CNT)
  private Integer msgCnt;

  public static final String SERIALIZED_NAME_LAST_MSG_TIME = "LastMsgTime";
  @SerializedName(SERIALIZED_NAME_LAST_MSG_TIME)
  private Integer lastMsgTime;

  public static final String SERIALIZED_NAME_LAST_MSG_KEY = "LastMsgKey";
  @SerializedName(SERIALIZED_NAME_LAST_MSG_KEY)
  private String lastMsgKey;

  public static final String SERIALIZED_NAME_MSG_LIST = "MsgList";
  @SerializedName(SERIALIZED_NAME_MSG_LIST)
  private List<GetRoamMsgResponseAllOfMsgList> msgList = null;

  public GetRoamMsgResponse() { 
  }

  public GetRoamMsgResponse actionStatus(String actionStatus) {
    
    this.actionStatus = actionStatus;
    return this;
  }

   /**
   * 请求处理的结果，OK 表示处理成功，FAIL 表示失败
   * @return actionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求处理的结果，OK 表示处理成功，FAIL 表示失败")

  public String getActionStatus() {
    return actionStatus;
  }


  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }


  public GetRoamMsgResponse errorInfo(String errorInfo) {
    
    this.errorInfo = errorInfo;
    return this;
  }

   /**
   * 错误信息
   * @return errorInfo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误信息")

  public String getErrorInfo() {
    return errorInfo;
  }


  public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
  }


  public GetRoamMsgResponse errorCode(Integer errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 错误码，0表示成功，非0表示失败
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误码，0表示成功，非0表示失败")

  public Integer getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  public GetRoamMsgResponse complete(CompleteEnum complete) {
    
    this.complete = complete;
    return this;
  }

   /**
   * 是否全部拉取，0表示未全部拉取，需要续拉，1表示已全部拉取
   * @return complete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否全部拉取，0表示未全部拉取，需要续拉，1表示已全部拉取")

  public CompleteEnum getComplete() {
    return complete;
  }


  public void setComplete(CompleteEnum complete) {
    this.complete = complete;
  }


  public GetRoamMsgResponse msgCnt(Integer msgCnt) {
    
    this.msgCnt = msgCnt;
    return this;
  }

   /**
   * 本次拉取到的消息条数
   * @return msgCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "本次拉取到的消息条数")

  public Integer getMsgCnt() {
    return msgCnt;
  }


  public void setMsgCnt(Integer msgCnt) {
    this.msgCnt = msgCnt;
  }


  public GetRoamMsgResponse lastMsgTime(Integer lastMsgTime) {
    
    this.lastMsgTime = lastMsgTime;
    return this;
  }

   /**
   * 本次拉取到的消息里的最后一条消息的时间
   * @return lastMsgTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "本次拉取到的消息里的最后一条消息的时间")

  public Integer getLastMsgTime() {
    return lastMsgTime;
  }


  public void setLastMsgTime(Integer lastMsgTime) {
    this.lastMsgTime = lastMsgTime;
  }


  public GetRoamMsgResponse lastMsgKey(String lastMsgKey) {
    
    this.lastMsgKey = lastMsgKey;
    return this;
  }

   /**
   * 本次拉取到的消息里的最后一条消息的标识
   * @return lastMsgKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "本次拉取到的消息里的最后一条消息的标识")

  public String getLastMsgKey() {
    return lastMsgKey;
  }


  public void setLastMsgKey(String lastMsgKey) {
    this.lastMsgKey = lastMsgKey;
  }


  public GetRoamMsgResponse msgList(List<GetRoamMsgResponseAllOfMsgList> msgList) {
    
    this.msgList = msgList;
    return this;
  }

  public GetRoamMsgResponse addMsgListItem(GetRoamMsgResponseAllOfMsgList msgListItem) {
    if (this.msgList == null) {
      this.msgList = new ArrayList<>();
    }
    this.msgList.add(msgListItem);
    return this;
  }

   /**
   * 返回的消息列表
   * @return msgList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回的消息列表")

  public List<GetRoamMsgResponseAllOfMsgList> getMsgList() {
    return msgList;
  }


  public void setMsgList(List<GetRoamMsgResponseAllOfMsgList> msgList) {
    this.msgList = msgList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRoamMsgResponse getRoamMsgResponse = (GetRoamMsgResponse) o;
    return Objects.equals(this.actionStatus, getRoamMsgResponse.actionStatus) &&
        Objects.equals(this.errorInfo, getRoamMsgResponse.errorInfo) &&
        Objects.equals(this.errorCode, getRoamMsgResponse.errorCode) &&
        Objects.equals(this.complete, getRoamMsgResponse.complete) &&
        Objects.equals(this.msgCnt, getRoamMsgResponse.msgCnt) &&
        Objects.equals(this.lastMsgTime, getRoamMsgResponse.lastMsgTime) &&
        Objects.equals(this.lastMsgKey, getRoamMsgResponse.lastMsgKey) &&
        Objects.equals(this.msgList, getRoamMsgResponse.msgList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, complete, msgCnt, lastMsgTime, lastMsgKey, msgList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoamMsgResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    msgCnt: ").append(toIndentedString(msgCnt)).append("\n");
    sb.append("    lastMsgTime: ").append(toIndentedString(lastMsgTime)).append("\n");
    sb.append("    lastMsgKey: ").append(toIndentedString(lastMsgKey)).append("\n");
    sb.append("    msgList: ").append(toIndentedString(msgList)).append("\n");
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
    openapiFields.add("ActionStatus");
    openapiFields.add("ErrorInfo");
    openapiFields.add("ErrorCode");
    openapiFields.add("Complete");
    openapiFields.add("MsgCnt");
    openapiFields.add("LastMsgTime");
    openapiFields.add("LastMsgKey");
    openapiFields.add("MsgList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ErrorInfo");
    openapiRequiredFields.add("ErrorCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetRoamMsgResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetRoamMsgResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRoamMsgResponse is not found in the empty JSON string", GetRoamMsgResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetRoamMsgResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRoamMsgResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetRoamMsgResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("ActionStatus") != null && !jsonObj.get("ActionStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ActionStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ActionStatus").toString()));
      }
      if (jsonObj.get("ErrorInfo") != null && !jsonObj.get("ErrorInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ErrorInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ErrorInfo").toString()));
      }
      if (jsonObj.get("LastMsgKey") != null && !jsonObj.get("LastMsgKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LastMsgKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LastMsgKey").toString()));
      }
      JsonArray jsonArraymsgList = jsonObj.getAsJsonArray("MsgList");
      if (jsonArraymsgList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("MsgList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `MsgList` to be an array in the JSON string but got `%s`", jsonObj.get("MsgList").toString()));
        }

        // validate the optional field `MsgList` (array)
        for (int i = 0; i < jsonArraymsgList.size(); i++) {
          GetRoamMsgResponseAllOfMsgList.validateJsonObject(jsonArraymsgList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRoamMsgResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRoamMsgResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRoamMsgResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRoamMsgResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRoamMsgResponse>() {
           @Override
           public void write(JsonWriter out, GetRoamMsgResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRoamMsgResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetRoamMsgResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRoamMsgResponse
  * @throws IOException if the JSON string is invalid with respect to GetRoamMsgResponse
  */
  public static GetRoamMsgResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRoamMsgResponse.class);
  }

 /**
  * Convert an instance of GetRoamMsgResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

