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
import com.tencentcloudapi.im.model.OfflinePushInfoAndroidInfo;
import com.tencentcloudapi.im.model.OfflinePushInfoApnsInfo;
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
 * OfflinePushInfo
 */

public class OfflinePushInfo {
  /**
   * 0表示推送，1表示不离线推送。
   */
  @JsonAdapter(PushFlagEnum.Adapter.class)
  public enum PushFlagEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    PushFlagEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PushFlagEnum fromValue(Integer value) {
      for (PushFlagEnum b : PushFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PushFlagEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PushFlagEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PushFlagEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return PushFlagEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PUSH_FLAG = "PushFlag";
  @SerializedName(SERIALIZED_NAME_PUSH_FLAG)
  private PushFlagEnum pushFlag;

  public static final String SERIALIZED_NAME_TITLE = "Title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESC = "Desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_EXT = "Ext";
  @SerializedName(SERIALIZED_NAME_EXT)
  private String ext;

  public static final String SERIALIZED_NAME_ANDROID_INFO = "AndroidInfo";
  @SerializedName(SERIALIZED_NAME_ANDROID_INFO)
  private OfflinePushInfoAndroidInfo androidInfo;

  public static final String SERIALIZED_NAME_APNS_INFO = "ApnsInfo";
  @SerializedName(SERIALIZED_NAME_APNS_INFO)
  private OfflinePushInfoApnsInfo apnsInfo;

  public OfflinePushInfo() { 
  }

  public OfflinePushInfo pushFlag(PushFlagEnum pushFlag) {
    
    this.pushFlag = pushFlag;
    return this;
  }

   /**
   * 0表示推送，1表示不离线推送。
   * @return pushFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0表示推送，1表示不离线推送。")

  public PushFlagEnum getPushFlag() {
    return pushFlag;
  }


  public void setPushFlag(PushFlagEnum pushFlag) {
    this.pushFlag = pushFlag;
  }


  public OfflinePushInfo title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 离线推送标题。该字段为 iOS 和 Android 共用。
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "离线推送标题。该字段为 iOS 和 Android 共用。")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public OfflinePushInfo desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 离线推送内容。该字段会覆盖上面各种消息元素 TIMMsgElement 的离线推送展示文本。若发送的消息只有一个 TIMCustomElem 自定义消息元素，该 Desc 字段会覆盖 TIMCustomElem 中的 Desc 字段。如果两个 Desc 字段都不填，将收不到该自定义消息的离线推送。
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "离线推送内容。该字段会覆盖上面各种消息元素 TIMMsgElement 的离线推送展示文本。若发送的消息只有一个 TIMCustomElem 自定义消息元素，该 Desc 字段会覆盖 TIMCustomElem 中的 Desc 字段。如果两个 Desc 字段都不填，将收不到该自定义消息的离线推送。")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public OfflinePushInfo ext(String ext) {
    
    this.ext = ext;
    return this;
  }

   /**
   * 离线推送透传内容。由于国内各 Android 手机厂商的推送平台要求各不一样，请保证此字段为 JSON 格式，否则可能会导致收不到某些厂商的离线推送。
   * @return ext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "离线推送透传内容。由于国内各 Android 手机厂商的推送平台要求各不一样，请保证此字段为 JSON 格式，否则可能会导致收不到某些厂商的离线推送。")

  public String getExt() {
    return ext;
  }


  public void setExt(String ext) {
    this.ext = ext;
  }


  public OfflinePushInfo androidInfo(OfflinePushInfoAndroidInfo androidInfo) {
    
    this.androidInfo = androidInfo;
    return this;
  }

   /**
   * Get androidInfo
   * @return androidInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OfflinePushInfoAndroidInfo getAndroidInfo() {
    return androidInfo;
  }


  public void setAndroidInfo(OfflinePushInfoAndroidInfo androidInfo) {
    this.androidInfo = androidInfo;
  }


  public OfflinePushInfo apnsInfo(OfflinePushInfoApnsInfo apnsInfo) {
    
    this.apnsInfo = apnsInfo;
    return this;
  }

   /**
   * Get apnsInfo
   * @return apnsInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OfflinePushInfoApnsInfo getApnsInfo() {
    return apnsInfo;
  }


  public void setApnsInfo(OfflinePushInfoApnsInfo apnsInfo) {
    this.apnsInfo = apnsInfo;
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
  public OfflinePushInfo putAdditionalProperty(String key, Object value) {
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
    OfflinePushInfo offlinePushInfo = (OfflinePushInfo) o;
    return Objects.equals(this.pushFlag, offlinePushInfo.pushFlag) &&
        Objects.equals(this.title, offlinePushInfo.title) &&
        Objects.equals(this.desc, offlinePushInfo.desc) &&
        Objects.equals(this.ext, offlinePushInfo.ext) &&
        Objects.equals(this.androidInfo, offlinePushInfo.androidInfo) &&
        Objects.equals(this.apnsInfo, offlinePushInfo.apnsInfo)&&
        Objects.equals(this.additionalProperties, offlinePushInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushFlag, title, desc, ext, androidInfo, apnsInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflinePushInfo {\n");
    sb.append("    pushFlag: ").append(toIndentedString(pushFlag)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    androidInfo: ").append(toIndentedString(androidInfo)).append("\n");
    sb.append("    apnsInfo: ").append(toIndentedString(apnsInfo)).append("\n");
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
    openapiFields.add("PushFlag");
    openapiFields.add("Title");
    openapiFields.add("Desc");
    openapiFields.add("Ext");
    openapiFields.add("AndroidInfo");
    openapiFields.add("ApnsInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OfflinePushInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OfflinePushInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OfflinePushInfo is not found in the empty JSON string", OfflinePushInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("Title") != null && !jsonObj.get("Title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Title").toString()));
      }
      if (jsonObj.get("Desc") != null && !jsonObj.get("Desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Desc").toString()));
      }
      if (jsonObj.get("Ext") != null && !jsonObj.get("Ext").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Ext` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Ext").toString()));
      }
      // validate the optional field `AndroidInfo`
      if (jsonObj.getAsJsonObject("AndroidInfo") != null) {
        OfflinePushInfoAndroidInfo.validateJsonObject(jsonObj.getAsJsonObject("AndroidInfo"));
      }
      // validate the optional field `ApnsInfo`
      if (jsonObj.getAsJsonObject("ApnsInfo") != null) {
        OfflinePushInfoApnsInfo.validateJsonObject(jsonObj.getAsJsonObject("ApnsInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfflinePushInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfflinePushInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfflinePushInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfflinePushInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OfflinePushInfo>() {
           @Override
           public void write(JsonWriter out, OfflinePushInfo value) throws IOException {
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
           public OfflinePushInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OfflinePushInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OfflinePushInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfflinePushInfo
  * @throws IOException if the JSON string is invalid with respect to OfflinePushInfo
  */
  public static OfflinePushInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfflinePushInfo.class);
  }

 /**
  * Convert an instance of OfflinePushInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

