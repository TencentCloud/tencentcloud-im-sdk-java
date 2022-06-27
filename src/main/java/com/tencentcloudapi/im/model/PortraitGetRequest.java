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
 * PortraitGetRequest
 */

public class PortraitGetRequest {
  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private List<String> toAccount = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAG_LIST = "TagList";
  @SerializedName(SERIALIZED_NAME_TAG_LIST)
  private List<String> tagList = new ArrayList<>();

  public PortraitGetRequest() { 
  }

  public PortraitGetRequest toAccount(List<String> toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

  public PortraitGetRequest addToAccountItem(String toAccountItem) {
    this.toAccount.add(toAccountItem);
    return this;
  }

   /**
   * 需要拉取这些 UserID 的资料；注意：每次拉取的用户数不得超过100，避免因回包数据量太大以致回包失败
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "需要拉取这些 UserID 的资料；注意：每次拉取的用户数不得超过100，避免因回包数据量太大以致回包失败")

  public List<String> getToAccount() {
    return toAccount;
  }


  public void setToAccount(List<String> toAccount) {
    this.toAccount = toAccount;
  }


  public PortraitGetRequest tagList(List<String> tagList) {
    
    this.tagList = tagList;
    return this;
  }

  public PortraitGetRequest addTagListItem(String tagListItem) {
    this.tagList.add(tagListItem);
    return this;
  }

   /**
   * 指定要拉取的资料字段的 Tag，支持的字段有：1. 标配资料字段，详情可参见 标配资料字段（https://cloud.tencent.com/document/product/269/1500#.E6.A0.87.E9.85.8D.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5） 2. 自定义资料字段，详情可参见 自定义资料字段（https://cloud.tencent.com/document/product/269/1500#.E8.87.AA.E5.AE.9A.E4.B9.89.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5）
   * @return tagList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "指定要拉取的资料字段的 Tag，支持的字段有：1. 标配资料字段，详情可参见 标配资料字段（https://cloud.tencent.com/document/product/269/1500#.E6.A0.87.E9.85.8D.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5） 2. 自定义资料字段，详情可参见 自定义资料字段（https://cloud.tencent.com/document/product/269/1500#.E8.87.AA.E5.AE.9A.E4.B9.89.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5）")

  public List<String> getTagList() {
    return tagList;
  }


  public void setTagList(List<String> tagList) {
    this.tagList = tagList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortraitGetRequest portraitGetRequest = (PortraitGetRequest) o;
    return Objects.equals(this.toAccount, portraitGetRequest.toAccount) &&
        Objects.equals(this.tagList, portraitGetRequest.tagList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, tagList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortraitGetRequest {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
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
    openapiFields.add("To_Account");
    openapiFields.add("TagList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("To_Account");
    openapiRequiredFields.add("TagList");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PortraitGetRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PortraitGetRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortraitGetRequest is not found in the empty JSON string", PortraitGetRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PortraitGetRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PortraitGetRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PortraitGetRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be an array in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("TagList") != null && !jsonObj.get("TagList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `TagList` to be an array in the JSON string but got `%s`", jsonObj.get("TagList").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortraitGetRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortraitGetRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortraitGetRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortraitGetRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PortraitGetRequest>() {
           @Override
           public void write(JsonWriter out, PortraitGetRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PortraitGetRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PortraitGetRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PortraitGetRequest
  * @throws IOException if the JSON string is invalid with respect to PortraitGetRequest
  */
  public static PortraitGetRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortraitGetRequest.class);
  }

 /**
  * Convert an instance of PortraitGetRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

