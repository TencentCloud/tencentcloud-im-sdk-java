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
 * OfflinePushInfoApnsInfo
 */

public class OfflinePushInfoApnsInfo {
  public static final String SERIALIZED_NAME_BADGE_MODE = "BadgeMode";
  @SerializedName(SERIALIZED_NAME_BADGE_MODE)
  private Integer badgeMode;

  public static final String SERIALIZED_NAME_TITLE = "Title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_SUB_TITLE = "SubTitle";
  @SerializedName(SERIALIZED_NAME_SUB_TITLE)
  private String subTitle;

  public static final String SERIALIZED_NAME_IMAGE = "Image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_MUTABLE_CONTENT = "MutableContent";
  @SerializedName(SERIALIZED_NAME_MUTABLE_CONTENT)
  private Integer mutableContent = 0;

  public OfflinePushInfoApnsInfo() { 
  }

  public OfflinePushInfoApnsInfo badgeMode(Integer badgeMode) {
    
    this.badgeMode = badgeMode;
    return this;
  }

   /**
   * 这个字段缺省或者为0表示需要计数，为1表示本条消息不需要计数，即右上角图标数字不增加。
   * @return badgeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "这个字段缺省或者为0表示需要计数，为1表示本条消息不需要计数，即右上角图标数字不增加。")

  public Integer getBadgeMode() {
    return badgeMode;
  }


  public void setBadgeMode(Integer badgeMode) {
    this.badgeMode = badgeMode;
  }


  public OfflinePushInfoApnsInfo title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 该字段用于标识 APNs 推送的标题，若填写则会覆盖最上层 Title。
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该字段用于标识 APNs 推送的标题，若填写则会覆盖最上层 Title。")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public OfflinePushInfoApnsInfo subTitle(String subTitle) {
    
    this.subTitle = subTitle;
    return this;
  }

   /**
   * 该字段用于标识 APNs 推送的子标题。
   * @return subTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该字段用于标识 APNs 推送的子标题。")

  public String getSubTitle() {
    return subTitle;
  }


  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }


  public OfflinePushInfoApnsInfo image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * 该字段用于标识 APNs 携带的图片地址，当客户端拿到该字段时，可以通过下载图片资源的方式将图片展示在弹窗上。
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该字段用于标识 APNs 携带的图片地址，当客户端拿到该字段时，可以通过下载图片资源的方式将图片展示在弹窗上。")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public OfflinePushInfoApnsInfo mutableContent(Integer mutableContent) {
    
    this.mutableContent = mutableContent;
    return this;
  }

   /**
   * 为1表示开启 iOS 10 的推送扩展，默认为0。
   * @return mutableContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "为1表示开启 iOS 10 的推送扩展，默认为0。")

  public Integer getMutableContent() {
    return mutableContent;
  }


  public void setMutableContent(Integer mutableContent) {
    this.mutableContent = mutableContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflinePushInfoApnsInfo offlinePushInfoApnsInfo = (OfflinePushInfoApnsInfo) o;
    return Objects.equals(this.badgeMode, offlinePushInfoApnsInfo.badgeMode) &&
        Objects.equals(this.title, offlinePushInfoApnsInfo.title) &&
        Objects.equals(this.subTitle, offlinePushInfoApnsInfo.subTitle) &&
        Objects.equals(this.image, offlinePushInfoApnsInfo.image) &&
        Objects.equals(this.mutableContent, offlinePushInfoApnsInfo.mutableContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(badgeMode, title, subTitle, image, mutableContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflinePushInfoApnsInfo {\n");
    sb.append("    badgeMode: ").append(toIndentedString(badgeMode)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    mutableContent: ").append(toIndentedString(mutableContent)).append("\n");
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
    openapiFields.add("BadgeMode");
    openapiFields.add("Title");
    openapiFields.add("SubTitle");
    openapiFields.add("Image");
    openapiFields.add("MutableContent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OfflinePushInfoApnsInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OfflinePushInfoApnsInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OfflinePushInfoApnsInfo is not found in the empty JSON string", OfflinePushInfoApnsInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OfflinePushInfoApnsInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OfflinePushInfoApnsInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("Title") != null && !jsonObj.get("Title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Title").toString()));
      }
      if (jsonObj.get("SubTitle") != null && !jsonObj.get("SubTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SubTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SubTitle").toString()));
      }
      if (jsonObj.get("Image") != null && !jsonObj.get("Image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Image").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfflinePushInfoApnsInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfflinePushInfoApnsInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfflinePushInfoApnsInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfflinePushInfoApnsInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OfflinePushInfoApnsInfo>() {
           @Override
           public void write(JsonWriter out, OfflinePushInfoApnsInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfflinePushInfoApnsInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OfflinePushInfoApnsInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfflinePushInfoApnsInfo
  * @throws IOException if the JSON string is invalid with respect to OfflinePushInfoApnsInfo
  */
  public static OfflinePushInfoApnsInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfflinePushInfoApnsInfo.class);
  }

 /**
  * Convert an instance of OfflinePushInfoApnsInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

