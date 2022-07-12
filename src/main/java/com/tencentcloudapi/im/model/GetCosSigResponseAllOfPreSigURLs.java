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
 * GetCosSigResponseAllOfPreSigURLs
 */

public class GetCosSigResponseAllOfPreSigURLs {
  public static final String SERIALIZED_NAME_RESOURCE_I_D = "ResourceID";
  @SerializedName(SERIALIZED_NAME_RESOURCE_I_D)
  private Integer resourceID;

  public static final String SERIALIZED_NAME_CODE = "Code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_DESC = "Desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_PRE_SIG_U_R_L = "PreSigURL";
  @SerializedName(SERIALIZED_NAME_PRE_SIG_U_R_L)
  private String preSigURL;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public GetCosSigResponseAllOfPreSigURLs() { 
  }

  public GetCosSigResponseAllOfPreSigURLs resourceID(Integer resourceID) {
    
    this.resourceID = resourceID;
    return this;
  }

   /**
   * 同批查询的资源 ID
   * @return resourceID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "同批查询的资源 ID")

  public Integer getResourceID() {
    return resourceID;
  }


  public void setResourceID(Integer resourceID) {
    this.resourceID = resourceID;
  }


  public GetCosSigResponseAllOfPreSigURLs code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * 指定资源 ID 对应的查询结果
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指定资源 ID 对应的查询结果")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public GetCosSigResponseAllOfPreSigURLs desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 指定资源 ID 对应的查询结果的描述
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指定资源 ID 对应的查询结果的描述")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public GetCosSigResponseAllOfPreSigURLs preSigURL(String preSigURL) {
    
    this.preSigURL = preSigURL;
    return this;
  }

   /**
   * 指定资源 ID 对应的最高权限的签名 URL，可以下载封禁的文件，有效期15分钟
   * @return preSigURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指定资源 ID 对应的最高权限的签名 URL，可以下载封禁的文件，有效期15分钟")

  public String getPreSigURL() {
    return preSigURL;
  }


  public void setPreSigURL(String preSigURL) {
    this.preSigURL = preSigURL;
  }


  public GetCosSigResponseAllOfPreSigURLs status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * 指定资源 ID 对应的文件状态:0-文件正常，SDK 可访问 1-文件被封禁，SDK 访问无权限，可使用 PreSigURL 访问; 2-文件不存在，可能过期被删除；
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指定资源 ID 对应的文件状态:0-文件正常，SDK 可访问 1-文件被封禁，SDK 访问无权限，可使用 PreSigURL 访问; 2-文件不存在，可能过期被删除；")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public GetCosSigResponseAllOfPreSigURLs putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCosSigResponseAllOfPreSigURLs getCosSigResponseAllOfPreSigURLs = (GetCosSigResponseAllOfPreSigURLs) o;
    return Objects.equals(this.resourceID, getCosSigResponseAllOfPreSigURLs.resourceID) &&
        Objects.equals(this.code, getCosSigResponseAllOfPreSigURLs.code) &&
        Objects.equals(this.desc, getCosSigResponseAllOfPreSigURLs.desc) &&
        Objects.equals(this.preSigURL, getCosSigResponseAllOfPreSigURLs.preSigURL) &&
        Objects.equals(this.status, getCosSigResponseAllOfPreSigURLs.status)&&
        Objects.equals(this.additionalProperties, getCosSigResponseAllOfPreSigURLs.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceID, code, desc, preSigURL, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCosSigResponseAllOfPreSigURLs {\n");
    sb.append("    resourceID: ").append(toIndentedString(resourceID)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    preSigURL: ").append(toIndentedString(preSigURL)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("ResourceID");
    openapiFields.add("Code");
    openapiFields.add("Desc");
    openapiFields.add("PreSigURL");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetCosSigResponseAllOfPreSigURLs
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetCosSigResponseAllOfPreSigURLs.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCosSigResponseAllOfPreSigURLs is not found in the empty JSON string", GetCosSigResponseAllOfPreSigURLs.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("Desc") != null && !jsonObj.get("Desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Desc").toString()));
      }
      if (jsonObj.get("PreSigURL") != null && !jsonObj.get("PreSigURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PreSigURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PreSigURL").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCosSigResponseAllOfPreSigURLs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCosSigResponseAllOfPreSigURLs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCosSigResponseAllOfPreSigURLs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCosSigResponseAllOfPreSigURLs.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCosSigResponseAllOfPreSigURLs>() {
           @Override
           public void write(JsonWriter out, GetCosSigResponseAllOfPreSigURLs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCosSigResponseAllOfPreSigURLs read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetCosSigResponseAllOfPreSigURLs instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), Object.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetCosSigResponseAllOfPreSigURLs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetCosSigResponseAllOfPreSigURLs
  * @throws IOException if the JSON string is invalid with respect to GetCosSigResponseAllOfPreSigURLs
  */
  public static GetCosSigResponseAllOfPreSigURLs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCosSigResponseAllOfPreSigURLs.class);
  }

 /**
  * Convert an instance of GetCosSigResponseAllOfPreSigURLs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

