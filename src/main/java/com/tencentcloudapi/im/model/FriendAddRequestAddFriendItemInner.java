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
 * FriendAddRequestAddFriendItemInner
 */

public class FriendAddRequestAddFriendItemInner {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_REMARK = "Remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark;

  public static final String SERIALIZED_NAME_GROUP_NAME = "GroupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_ADD_SOURCE = "AddSource";
  @SerializedName(SERIALIZED_NAME_ADD_SOURCE)
  private String addSource;

  public static final String SERIALIZED_NAME_ADD_WORDING = "AddWording";
  @SerializedName(SERIALIZED_NAME_ADD_WORDING)
  private String addWording;

  public FriendAddRequestAddFriendItemInner() { 
  }

  public FriendAddRequestAddFriendItemInner toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 好友的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "好友的 UserID")

  public String getToAccount() {
    return toAccount;
  }


  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public FriendAddRequestAddFriendItemInner remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * From_Account 对 To_Account 的好友备注，详情可参见 标配好友字段(https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5)
   * @return remark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From_Account 对 To_Account 的好友备注，详情可参见 标配好友字段(https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5)")

  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public FriendAddRequestAddFriendItemInner groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * From_Account 对 To_Account 的分组信息，添加好友时只允许设置一个分组，因此使用 String 类型即可，详情可参见 标配好友字段（https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From_Account 对 To_Account 的分组信息，添加好友时只允许设置一个分组，因此使用 String 类型即可，详情可参见 标配好友字段（https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public FriendAddRequestAddFriendItemInner addSource(String addSource) {
    
    this.addSource = addSource;
    return this;
  }

   /**
   * 加好友来源字段，详情可参见 标配好友字段（https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）
   * @return addSource
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "加好友来源字段，详情可参见 标配好友字段（https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）")

  public String getAddSource() {
    return addSource;
  }


  public void setAddSource(String addSource) {
    this.addSource = addSource;
  }


  public FriendAddRequestAddFriendItemInner addWording(String addWording) {
    
    this.addWording = addWording;
    return this;
  }

   /**
   * From_Account 和 To_Account 形成好友关系时的附言信息，详情可参见 标配好友字段（标配好友字段）
   * @return addWording
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From_Account 和 To_Account 形成好友关系时的附言信息，详情可参见 标配好友字段（标配好友字段）")

  public String getAddWording() {
    return addWording;
  }


  public void setAddWording(String addWording) {
    this.addWording = addWording;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendAddRequestAddFriendItemInner friendAddRequestAddFriendItemInner = (FriendAddRequestAddFriendItemInner) o;
    return Objects.equals(this.toAccount, friendAddRequestAddFriendItemInner.toAccount) &&
        Objects.equals(this.remark, friendAddRequestAddFriendItemInner.remark) &&
        Objects.equals(this.groupName, friendAddRequestAddFriendItemInner.groupName) &&
        Objects.equals(this.addSource, friendAddRequestAddFriendItemInner.addSource) &&
        Objects.equals(this.addWording, friendAddRequestAddFriendItemInner.addWording);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, remark, groupName, addSource, addWording);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendAddRequestAddFriendItemInner {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    addSource: ").append(toIndentedString(addSource)).append("\n");
    sb.append("    addWording: ").append(toIndentedString(addWording)).append("\n");
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
    openapiFields.add("Remark");
    openapiFields.add("GroupName");
    openapiFields.add("AddSource");
    openapiFields.add("AddWording");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("To_Account");
    openapiRequiredFields.add("AddSource");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FriendAddRequestAddFriendItemInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FriendAddRequestAddFriendItemInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FriendAddRequestAddFriendItemInner is not found in the empty JSON string", FriendAddRequestAddFriendItemInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FriendAddRequestAddFriendItemInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FriendAddRequestAddFriendItemInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FriendAddRequestAddFriendItemInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
      if (jsonObj.get("Remark") != null && !jsonObj.get("Remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Remark").toString()));
      }
      if (jsonObj.get("GroupName") != null && !jsonObj.get("GroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupName").toString()));
      }
      if (jsonObj.get("AddSource") != null && !jsonObj.get("AddSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AddSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AddSource").toString()));
      }
      if (jsonObj.get("AddWording") != null && !jsonObj.get("AddWording").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AddWording` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AddWording").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FriendAddRequestAddFriendItemInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FriendAddRequestAddFriendItemInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FriendAddRequestAddFriendItemInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FriendAddRequestAddFriendItemInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FriendAddRequestAddFriendItemInner>() {
           @Override
           public void write(JsonWriter out, FriendAddRequestAddFriendItemInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FriendAddRequestAddFriendItemInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FriendAddRequestAddFriendItemInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FriendAddRequestAddFriendItemInner
  * @throws IOException if the JSON string is invalid with respect to FriendAddRequestAddFriendItemInner
  */
  public static FriendAddRequestAddFriendItemInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FriendAddRequestAddFriendItemInner.class);
  }

 /**
  * Convert an instance of FriendAddRequestAddFriendItemInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

