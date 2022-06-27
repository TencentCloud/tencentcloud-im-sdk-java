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
 * From_Account 对 To_Account 的自定义好友数据，每一个成员都包含一个 Tag 字段和一个 Value 字段，详情可参见 自定义好友字段（https://cloud.tencent.com/document/product/269/1501#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）
 */
@ApiModel(description = "From_Account 对 To_Account 的自定义好友数据，每一个成员都包含一个 Tag 字段和一个 Value 字段，详情可参见 自定义好友字段（https://cloud.tencent.com/document/product/269/1501#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）")

public class FriendImportRequestAddFriendItemInnerCustomItemInner {
  public static final String SERIALIZED_NAME_TAG = "Tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public FriendImportRequestAddFriendItemInnerCustomItemInner() { 
  }

  public FriendImportRequestAddFriendItemInnerCustomItemInner tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * 自定义好友字段的名称，使用前请通过即时通信 IM 控制台 &gt;【应用配置】&gt;【功能配置】申请自定义好友字段
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "自定义好友字段的名称，使用前请通过即时通信 IM 控制台 >【应用配置】>【功能配置】申请自定义好友字段")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public FriendImportRequestAddFriendItemInnerCustomItemInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 自定义好友字段的值
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "自定义好友字段的值")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendImportRequestAddFriendItemInnerCustomItemInner friendImportRequestAddFriendItemInnerCustomItemInner = (FriendImportRequestAddFriendItemInnerCustomItemInner) o;
    return Objects.equals(this.tag, friendImportRequestAddFriendItemInnerCustomItemInner.tag) &&
        Objects.equals(this.value, friendImportRequestAddFriendItemInnerCustomItemInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendImportRequestAddFriendItemInnerCustomItemInner {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("Tag");
    openapiFields.add("Value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FriendImportRequestAddFriendItemInnerCustomItemInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FriendImportRequestAddFriendItemInnerCustomItemInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FriendImportRequestAddFriendItemInnerCustomItemInner is not found in the empty JSON string", FriendImportRequestAddFriendItemInnerCustomItemInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FriendImportRequestAddFriendItemInnerCustomItemInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FriendImportRequestAddFriendItemInnerCustomItemInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("Tag") != null && !jsonObj.get("Tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Tag").toString()));
      }
      if (jsonObj.get("Value") != null && !jsonObj.get("Value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FriendImportRequestAddFriendItemInnerCustomItemInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FriendImportRequestAddFriendItemInnerCustomItemInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FriendImportRequestAddFriendItemInnerCustomItemInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FriendImportRequestAddFriendItemInnerCustomItemInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FriendImportRequestAddFriendItemInnerCustomItemInner>() {
           @Override
           public void write(JsonWriter out, FriendImportRequestAddFriendItemInnerCustomItemInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FriendImportRequestAddFriendItemInnerCustomItemInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FriendImportRequestAddFriendItemInnerCustomItemInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FriendImportRequestAddFriendItemInnerCustomItemInner
  * @throws IOException if the JSON string is invalid with respect to FriendImportRequestAddFriendItemInnerCustomItemInner
  */
  public static FriendImportRequestAddFriendItemInnerCustomItemInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FriendImportRequestAddFriendItemInnerCustomItemInner.class);
  }

 /**
  * Convert an instance of FriendImportRequestAddFriendItemInnerCustomItemInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

