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
import com.tencentcloudapi.im.model.ImportGroupMsgResponseAllOf;
import com.tencentcloudapi.im.model.ImportGroupMsgResponseAllOfImportMsgResult;
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
 * ImportGroupMsgResponse
 */

public class ImportGroupMsgResponse {
  public static final String SERIALIZED_NAME_ACTION_STATUS = "ActionStatus";
  @SerializedName(SERIALIZED_NAME_ACTION_STATUS)
  private String actionStatus;

  public static final String SERIALIZED_NAME_ERROR_INFO = "ErrorInfo";
  @SerializedName(SERIALIZED_NAME_ERROR_INFO)
  private String errorInfo;

  public static final String SERIALIZED_NAME_ERROR_CODE = "ErrorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public static final String SERIALIZED_NAME_IMPORT_MSG_RESULT = "ImportMsgResult";
  @SerializedName(SERIALIZED_NAME_IMPORT_MSG_RESULT)
  private List<ImportGroupMsgResponseAllOfImportMsgResult> importMsgResult = null;

  public ImportGroupMsgResponse() { 
  }

  public ImportGroupMsgResponse actionStatus(String actionStatus) {
    
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


  public ImportGroupMsgResponse errorInfo(String errorInfo) {
    
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


  public ImportGroupMsgResponse errorCode(Integer errorCode) {
    
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


  public ImportGroupMsgResponse importMsgResult(List<ImportGroupMsgResponseAllOfImportMsgResult> importMsgResult) {
    
    this.importMsgResult = importMsgResult;
    return this;
  }

  public ImportGroupMsgResponse addImportMsgResultItem(ImportGroupMsgResponseAllOfImportMsgResult importMsgResultItem) {
    if (this.importMsgResult == null) {
      this.importMsgResult = new ArrayList<>();
    }
    this.importMsgResult.add(importMsgResultItem);
    return this;
  }

   /**
   * 具体的消息导入结果
   * @return importMsgResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "具体的消息导入结果")

  public List<ImportGroupMsgResponseAllOfImportMsgResult> getImportMsgResult() {
    return importMsgResult;
  }


  public void setImportMsgResult(List<ImportGroupMsgResponseAllOfImportMsgResult> importMsgResult) {
    this.importMsgResult = importMsgResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupMsgResponse importGroupMsgResponse = (ImportGroupMsgResponse) o;
    return Objects.equals(this.actionStatus, importGroupMsgResponse.actionStatus) &&
        Objects.equals(this.errorInfo, importGroupMsgResponse.errorInfo) &&
        Objects.equals(this.errorCode, importGroupMsgResponse.errorCode) &&
        Objects.equals(this.importMsgResult, importGroupMsgResponse.importMsgResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, errorInfo, errorCode, importMsgResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMsgResponse {\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    importMsgResult: ").append(toIndentedString(importMsgResult)).append("\n");
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
    openapiFields.add("ImportMsgResult");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ErrorInfo");
    openapiRequiredFields.add("ErrorCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportGroupMsgResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImportGroupMsgResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportGroupMsgResponse is not found in the empty JSON string", ImportGroupMsgResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImportGroupMsgResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportGroupMsgResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImportGroupMsgResponse.openapiRequiredFields) {
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
      JsonArray jsonArrayimportMsgResult = jsonObj.getAsJsonArray("ImportMsgResult");
      if (jsonArrayimportMsgResult != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ImportMsgResult").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ImportMsgResult` to be an array in the JSON string but got `%s`", jsonObj.get("ImportMsgResult").toString()));
        }

        // validate the optional field `ImportMsgResult` (array)
        for (int i = 0; i < jsonArrayimportMsgResult.size(); i++) {
          ImportGroupMsgResponseAllOfImportMsgResult.validateJsonObject(jsonArrayimportMsgResult.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportGroupMsgResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportGroupMsgResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportGroupMsgResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportGroupMsgResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportGroupMsgResponse>() {
           @Override
           public void write(JsonWriter out, ImportGroupMsgResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportGroupMsgResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImportGroupMsgResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportGroupMsgResponse
  * @throws IOException if the JSON string is invalid with respect to ImportGroupMsgResponse
  */
  public static ImportGroupMsgResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportGroupMsgResponse.class);
  }

 /**
  * Convert an instance of ImportGroupMsgResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

