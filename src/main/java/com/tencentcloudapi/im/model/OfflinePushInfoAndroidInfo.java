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
 * OfflinePushInfoAndroidInfo
 */

public class OfflinePushInfoAndroidInfo {
  public static final String SERIALIZED_NAME_SOUND = "Sound";
  @SerializedName(SERIALIZED_NAME_SOUND)
  private String sound;

  public static final String SERIALIZED_NAME_HUA_WEI_CHANNEL_I_D = "HuaWeiChannelID";
  @SerializedName(SERIALIZED_NAME_HUA_WEI_CHANNEL_I_D)
  private String huaWeiChannelID;

  public static final String SERIALIZED_NAME_XIAO_MI_CHANNEL_I_D = "XiaoMiChannelID";
  @SerializedName(SERIALIZED_NAME_XIAO_MI_CHANNEL_I_D)
  private String xiaoMiChannelID;

  public static final String SERIALIZED_NAME_OP_P_O_CHANNEL_I_D = "OPPOChannelID";
  @SerializedName(SERIALIZED_NAME_OP_P_O_CHANNEL_I_D)
  private String opPOChannelID;

  public static final String SERIALIZED_NAME_GOOGLE_CHANNEL_I_D = "GoogleChannelID";
  @SerializedName(SERIALIZED_NAME_GOOGLE_CHANNEL_I_D)
  private String googleChannelID;

  /**
   * VIVO 手机推送消息分类，“0”代表运营消息，“1”代表系统消息，不填默认为1。
   */
  @JsonAdapter(ViVOClassificationEnum.Adapter.class)
  public enum ViVOClassificationEnum {
    _0("0"),
    
    _1("1");

    private String value;

    ViVOClassificationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ViVOClassificationEnum fromValue(String value) {
      for (ViVOClassificationEnum b : ViVOClassificationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ViVOClassificationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ViVOClassificationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ViVOClassificationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ViVOClassificationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VI_V_O_CLASSIFICATION = "VIVOClassification";
  @SerializedName(SERIALIZED_NAME_VI_V_O_CLASSIFICATION)
  private ViVOClassificationEnum viVOClassification;

  public static final String SERIALIZED_NAME_HUA_WEI_IMPORTANCE = "HuaWeiImportance";
  @SerializedName(SERIALIZED_NAME_HUA_WEI_IMPORTANCE)
  private String huaWeiImportance;

  /**
   * 在控制台配置华为推送为“打开应用内指定页面”的前提下，传“1”表示将透传内容 Ext 作为 Intent 的参数，“0”表示将透传内容 Ext 作为 Action 参数。不填默认为0。两种传参区别可参见 华为推送文档（https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/andorid-basic-clickaction-0000001087554076#section20203190121410）。
   */
  @JsonAdapter(ExtAsHuaweiIntentParamEnum.Adapter.class)
  public enum ExtAsHuaweiIntentParamEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    ExtAsHuaweiIntentParamEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExtAsHuaweiIntentParamEnum fromValue(Integer value) {
      for (ExtAsHuaweiIntentParamEnum b : ExtAsHuaweiIntentParamEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExtAsHuaweiIntentParamEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExtAsHuaweiIntentParamEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExtAsHuaweiIntentParamEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ExtAsHuaweiIntentParamEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXT_AS_HUAWEI_INTENT_PARAM = "ExtAsHuaweiIntentParam";
  @SerializedName(SERIALIZED_NAME_EXT_AS_HUAWEI_INTENT_PARAM)
  private ExtAsHuaweiIntentParamEnum extAsHuaweiIntentParam;

  public OfflinePushInfoAndroidInfo() { 
  }

  public OfflinePushInfoAndroidInfo sound(String sound) {
    
    this.sound = sound;
    return this;
  }

   /**
   * Android 离线推送声音文件路径。
   * @return sound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Android 离线推送声音文件路径。")

  public String getSound() {
    return sound;
  }


  public void setSound(String sound) {
    this.sound = sound;
  }


  public OfflinePushInfoAndroidInfo huaWeiChannelID(String huaWeiChannelID) {
    
    this.huaWeiChannelID = huaWeiChannelID;
    return this;
  }

   /**
   * 华为手机 EMUI 10.0 及以上的通知渠道字段。该字段不为空时，会覆盖控制台配置的 ChannelID 值；该字段为空时，不会覆盖控制台配置的 ChannelID 值。
   * @return huaWeiChannelID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "华为手机 EMUI 10.0 及以上的通知渠道字段。该字段不为空时，会覆盖控制台配置的 ChannelID 值；该字段为空时，不会覆盖控制台配置的 ChannelID 值。")

  public String getHuaWeiChannelID() {
    return huaWeiChannelID;
  }


  public void setHuaWeiChannelID(String huaWeiChannelID) {
    this.huaWeiChannelID = huaWeiChannelID;
  }


  public OfflinePushInfoAndroidInfo xiaoMiChannelID(String xiaoMiChannelID) {
    
    this.xiaoMiChannelID = xiaoMiChannelID;
    return this;
  }

   /**
   * 小米手机 MIUI 10 及以上的通知类别（Channel）适配字段。该字段不为空时，会覆盖控制台配置的 ChannelID 值；该字段为空时，不会覆盖控制台配置的 ChannelID 值
   * @return xiaoMiChannelID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小米手机 MIUI 10 及以上的通知类别（Channel）适配字段。该字段不为空时，会覆盖控制台配置的 ChannelID 值；该字段为空时，不会覆盖控制台配置的 ChannelID 值")

  public String getXiaoMiChannelID() {
    return xiaoMiChannelID;
  }


  public void setXiaoMiChannelID(String xiaoMiChannelID) {
    this.xiaoMiChannelID = xiaoMiChannelID;
  }


  public OfflinePushInfoAndroidInfo opPOChannelID(String opPOChannelID) {
    
    this.opPOChannelID = opPOChannelID;
    return this;
  }

   /**
   * OPPO 手机 Android 8.0 及以上的 NotificationChannel 通知适配字段。该字段不为空时，会覆盖控制台配置的 ChannelID 值；该字段为空时，不会覆盖控制台配置的 ChannelID 值。
   * @return opPOChannelID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OPPO 手机 Android 8.0 及以上的 NotificationChannel 通知适配字段。该字段不为空时，会覆盖控制台配置的 ChannelID 值；该字段为空时，不会覆盖控制台配置的 ChannelID 值。")

  public String getOpPOChannelID() {
    return opPOChannelID;
  }


  public void setOpPOChannelID(String opPOChannelID) {
    this.opPOChannelID = opPOChannelID;
  }


  public OfflinePushInfoAndroidInfo googleChannelID(String googleChannelID) {
    
    this.googleChannelID = googleChannelID;
    return this;
  }

   /**
   * Google 手机 Android 8.0 及以上的通知渠道字段。Google 推送新接口（上传证书文件）支持 channel id，旧接口（填写服务器密钥）不支持。
   * @return googleChannelID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Google 手机 Android 8.0 及以上的通知渠道字段。Google 推送新接口（上传证书文件）支持 channel id，旧接口（填写服务器密钥）不支持。")

  public String getGoogleChannelID() {
    return googleChannelID;
  }


  public void setGoogleChannelID(String googleChannelID) {
    this.googleChannelID = googleChannelID;
  }


  public OfflinePushInfoAndroidInfo viVOClassification(ViVOClassificationEnum viVOClassification) {
    
    this.viVOClassification = viVOClassification;
    return this;
  }

   /**
   * VIVO 手机推送消息分类，“0”代表运营消息，“1”代表系统消息，不填默认为1。
   * @return viVOClassification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VIVO 手机推送消息分类，“0”代表运营消息，“1”代表系统消息，不填默认为1。")

  public ViVOClassificationEnum getViVOClassification() {
    return viVOClassification;
  }


  public void setViVOClassification(ViVOClassificationEnum viVOClassification) {
    this.viVOClassification = viVOClassification;
  }


  public OfflinePushInfoAndroidInfo huaWeiImportance(String huaWeiImportance) {
    
    this.huaWeiImportance = huaWeiImportance;
    return this;
  }

   /**
   * 华为推送通知消息分类，取值为 LOW、NORMAL，不填默认为 NORMAL。
   * @return huaWeiImportance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "华为推送通知消息分类，取值为 LOW、NORMAL，不填默认为 NORMAL。")

  public String getHuaWeiImportance() {
    return huaWeiImportance;
  }


  public void setHuaWeiImportance(String huaWeiImportance) {
    this.huaWeiImportance = huaWeiImportance;
  }


  public OfflinePushInfoAndroidInfo extAsHuaweiIntentParam(ExtAsHuaweiIntentParamEnum extAsHuaweiIntentParam) {
    
    this.extAsHuaweiIntentParam = extAsHuaweiIntentParam;
    return this;
  }

   /**
   * 在控制台配置华为推送为“打开应用内指定页面”的前提下，传“1”表示将透传内容 Ext 作为 Intent 的参数，“0”表示将透传内容 Ext 作为 Action 参数。不填默认为0。两种传参区别可参见 华为推送文档（https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/andorid-basic-clickaction-0000001087554076#section20203190121410）。
   * @return extAsHuaweiIntentParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "在控制台配置华为推送为“打开应用内指定页面”的前提下，传“1”表示将透传内容 Ext 作为 Intent 的参数，“0”表示将透传内容 Ext 作为 Action 参数。不填默认为0。两种传参区别可参见 华为推送文档（https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/andorid-basic-clickaction-0000001087554076#section20203190121410）。")

  public ExtAsHuaweiIntentParamEnum getExtAsHuaweiIntentParam() {
    return extAsHuaweiIntentParam;
  }


  public void setExtAsHuaweiIntentParam(ExtAsHuaweiIntentParamEnum extAsHuaweiIntentParam) {
    this.extAsHuaweiIntentParam = extAsHuaweiIntentParam;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflinePushInfoAndroidInfo offlinePushInfoAndroidInfo = (OfflinePushInfoAndroidInfo) o;
    return Objects.equals(this.sound, offlinePushInfoAndroidInfo.sound) &&
        Objects.equals(this.huaWeiChannelID, offlinePushInfoAndroidInfo.huaWeiChannelID) &&
        Objects.equals(this.xiaoMiChannelID, offlinePushInfoAndroidInfo.xiaoMiChannelID) &&
        Objects.equals(this.opPOChannelID, offlinePushInfoAndroidInfo.opPOChannelID) &&
        Objects.equals(this.googleChannelID, offlinePushInfoAndroidInfo.googleChannelID) &&
        Objects.equals(this.viVOClassification, offlinePushInfoAndroidInfo.viVOClassification) &&
        Objects.equals(this.huaWeiImportance, offlinePushInfoAndroidInfo.huaWeiImportance) &&
        Objects.equals(this.extAsHuaweiIntentParam, offlinePushInfoAndroidInfo.extAsHuaweiIntentParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sound, huaWeiChannelID, xiaoMiChannelID, opPOChannelID, googleChannelID, viVOClassification, huaWeiImportance, extAsHuaweiIntentParam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflinePushInfoAndroidInfo {\n");
    sb.append("    sound: ").append(toIndentedString(sound)).append("\n");
    sb.append("    huaWeiChannelID: ").append(toIndentedString(huaWeiChannelID)).append("\n");
    sb.append("    xiaoMiChannelID: ").append(toIndentedString(xiaoMiChannelID)).append("\n");
    sb.append("    opPOChannelID: ").append(toIndentedString(opPOChannelID)).append("\n");
    sb.append("    googleChannelID: ").append(toIndentedString(googleChannelID)).append("\n");
    sb.append("    viVOClassification: ").append(toIndentedString(viVOClassification)).append("\n");
    sb.append("    huaWeiImportance: ").append(toIndentedString(huaWeiImportance)).append("\n");
    sb.append("    extAsHuaweiIntentParam: ").append(toIndentedString(extAsHuaweiIntentParam)).append("\n");
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
    openapiFields.add("Sound");
    openapiFields.add("HuaWeiChannelID");
    openapiFields.add("XiaoMiChannelID");
    openapiFields.add("OPPOChannelID");
    openapiFields.add("GoogleChannelID");
    openapiFields.add("VIVOClassification");
    openapiFields.add("HuaWeiImportance");
    openapiFields.add("ExtAsHuaweiIntentParam");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OfflinePushInfoAndroidInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OfflinePushInfoAndroidInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OfflinePushInfoAndroidInfo is not found in the empty JSON string", OfflinePushInfoAndroidInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OfflinePushInfoAndroidInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OfflinePushInfoAndroidInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("Sound") != null && !jsonObj.get("Sound").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Sound` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Sound").toString()));
      }
      if (jsonObj.get("HuaWeiChannelID") != null && !jsonObj.get("HuaWeiChannelID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HuaWeiChannelID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HuaWeiChannelID").toString()));
      }
      if (jsonObj.get("XiaoMiChannelID") != null && !jsonObj.get("XiaoMiChannelID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `XiaoMiChannelID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("XiaoMiChannelID").toString()));
      }
      if (jsonObj.get("OPPOChannelID") != null && !jsonObj.get("OPPOChannelID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OPPOChannelID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OPPOChannelID").toString()));
      }
      if (jsonObj.get("GoogleChannelID") != null && !jsonObj.get("GoogleChannelID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GoogleChannelID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GoogleChannelID").toString()));
      }
      if (jsonObj.get("VIVOClassification") != null && !jsonObj.get("VIVOClassification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VIVOClassification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VIVOClassification").toString()));
      }
      if (jsonObj.get("HuaWeiImportance") != null && !jsonObj.get("HuaWeiImportance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HuaWeiImportance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HuaWeiImportance").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfflinePushInfoAndroidInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfflinePushInfoAndroidInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfflinePushInfoAndroidInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfflinePushInfoAndroidInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OfflinePushInfoAndroidInfo>() {
           @Override
           public void write(JsonWriter out, OfflinePushInfoAndroidInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfflinePushInfoAndroidInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OfflinePushInfoAndroidInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfflinePushInfoAndroidInfo
  * @throws IOException if the JSON string is invalid with respect to OfflinePushInfoAndroidInfo
  */
  public static OfflinePushInfoAndroidInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfflinePushInfoAndroidInfo.class);
  }

 /**
  * Convert an instance of OfflinePushInfoAndroidInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

