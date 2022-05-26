
package tencentcloud.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * OfflinePushInfoAndroidInfo
 */
@JsonPropertyOrder({
  OfflinePushInfoAndroidInfo.JSON_PROPERTY_SOUND,
  OfflinePushInfoAndroidInfo.JSON_PROPERTY_HUA_WEI_CHANNEL_I_D,
  OfflinePushInfoAndroidInfo.JSON_PROPERTY_XIAO_MI_CHANNEL_I_D,
  OfflinePushInfoAndroidInfo.JSON_PROPERTY_OP_P_O_CHANNEL_I_D,
  OfflinePushInfoAndroidInfo.JSON_PROPERTY_GOOGLE_CHANNEL_I_D,
  OfflinePushInfoAndroidInfo.JSON_PROPERTY_VI_V_O_CLASSIFICATION,
  OfflinePushInfoAndroidInfo.JSON_PROPERTY_HUA_WEI_IMPORTANCE,
  OfflinePushInfoAndroidInfo.JSON_PROPERTY_EXT_AS_HUAWEI_INTENT_PARAM
})
@JsonTypeName("OfflinePushInfo_AndroidInfo")

public class OfflinePushInfoAndroidInfo {
  public static final String JSON_PROPERTY_SOUND = "Sound";
  private String sound;

  public static final String JSON_PROPERTY_HUA_WEI_CHANNEL_I_D = "HuaWeiChannelID";
  private String huaWeiChannelID;

  public static final String JSON_PROPERTY_XIAO_MI_CHANNEL_I_D = "XiaoMiChannelID";
  private String xiaoMiChannelID;

  public static final String JSON_PROPERTY_OP_P_O_CHANNEL_I_D = "OPPOChannelID";
  private String opPOChannelID;

  public static final String JSON_PROPERTY_GOOGLE_CHANNEL_I_D = "GoogleChannelID";
  private String googleChannelID;

  /**
   * VIVO 手机推送消息分类，“0”代表运营消息，“1”代表系统消息，不填默认为1。
   */
  public enum ViVOClassificationEnum {
    _0("0"),
    
    _1("1");

    private String value;

    ViVOClassificationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ViVOClassificationEnum fromValue(String value) {
      for (ViVOClassificationEnum b : ViVOClassificationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VI_V_O_CLASSIFICATION = "VIVOClassification";
  private ViVOClassificationEnum viVOClassification;

  public static final String JSON_PROPERTY_HUA_WEI_IMPORTANCE = "HuaWeiImportance";
  private String huaWeiImportance;

  /**
   * 在控制台配置华为推送为“打开应用内指定页面”的前提下，传“1”表示将透传内容 Ext 作为 Intent 的参数，“0”表示将透传内容 Ext 作为 Action 参数。不填默认为0。两种传参区别可参见 华为推送文档（https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/andorid-basic-clickaction-0000001087554076#section20203190121410）。
   */
  public enum ExtAsHuaweiIntentParamEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    ExtAsHuaweiIntentParamEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExtAsHuaweiIntentParamEnum fromValue(Integer value) {
      for (ExtAsHuaweiIntentParamEnum b : ExtAsHuaweiIntentParamEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EXT_AS_HUAWEI_INTENT_PARAM = "ExtAsHuaweiIntentParam";
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
  @JsonProperty(JSON_PROPERTY_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSound() {
    return sound;
  }


  @JsonProperty(JSON_PROPERTY_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_HUA_WEI_CHANNEL_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHuaWeiChannelID() {
    return huaWeiChannelID;
  }


  @JsonProperty(JSON_PROPERTY_HUA_WEI_CHANNEL_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_XIAO_MI_CHANNEL_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getXiaoMiChannelID() {
    return xiaoMiChannelID;
  }


  @JsonProperty(JSON_PROPERTY_XIAO_MI_CHANNEL_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_OP_P_O_CHANNEL_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOpPOChannelID() {
    return opPOChannelID;
  }


  @JsonProperty(JSON_PROPERTY_OP_P_O_CHANNEL_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_GOOGLE_CHANNEL_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGoogleChannelID() {
    return googleChannelID;
  }


  @JsonProperty(JSON_PROPERTY_GOOGLE_CHANNEL_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_VI_V_O_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ViVOClassificationEnum getViVOClassification() {
    return viVOClassification;
  }


  @JsonProperty(JSON_PROPERTY_VI_V_O_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_HUA_WEI_IMPORTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHuaWeiImportance() {
    return huaWeiImportance;
  }


  @JsonProperty(JSON_PROPERTY_HUA_WEI_IMPORTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_EXT_AS_HUAWEI_INTENT_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExtAsHuaweiIntentParamEnum getExtAsHuaweiIntentParam() {
    return extAsHuaweiIntentParam;
  }


  @JsonProperty(JSON_PROPERTY_EXT_AS_HUAWEI_INTENT_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

}

