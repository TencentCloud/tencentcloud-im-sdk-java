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
import com.tencentcloudapi.im.model.FriendAddRequestAddFriendItemInner;
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
 * FriendAddRequest
 */

public class FriendAddRequest {
  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  public static final String SERIALIZED_NAME_ADD_FRIEND_ITEM = "AddFriendItem";
  @SerializedName(SERIALIZED_NAME_ADD_FRIEND_ITEM)
  private List<FriendAddRequestAddFriendItemInner> addFriendItem = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADD_TYPE = "AddType";
  @SerializedName(SERIALIZED_NAME_ADD_TYPE)
  private String addType;

  /**
   * 管理员强制加好友标记：1表示强制加好友，0表示常规加好友方式
   */
  @JsonAdapter(ForceAddFlagsEnum.Adapter.class)
  public enum ForceAddFlagsEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    ForceAddFlagsEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ForceAddFlagsEnum fromValue(Integer value) {
      for (ForceAddFlagsEnum b : ForceAddFlagsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ForceAddFlagsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ForceAddFlagsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ForceAddFlagsEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ForceAddFlagsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FORCE_ADD_FLAGS = "ForceAddFlags";
  @SerializedName(SERIALIZED_NAME_FORCE_ADD_FLAGS)
  private ForceAddFlagsEnum forceAddFlags;

  public FriendAddRequest() { 
  }

  public FriendAddRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 需要为该 UserID 添加好友
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "需要为该 UserID 添加好友")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public FriendAddRequest addFriendItem(List<FriendAddRequestAddFriendItemInner> addFriendItem) {
    
    this.addFriendItem = addFriendItem;
    return this;
  }

  public FriendAddRequest addAddFriendItemItem(FriendAddRequestAddFriendItemInner addFriendItemItem) {
    this.addFriendItem.add(addFriendItemItem);
    return this;
  }

   /**
   * 好友结构体对象
   * @return addFriendItem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "好友结构体对象")

  public List<FriendAddRequestAddFriendItemInner> getAddFriendItem() {
    return addFriendItem;
  }


  public void setAddFriendItem(List<FriendAddRequestAddFriendItemInner> addFriendItem) {
    this.addFriendItem = addFriendItem;
  }


  public FriendAddRequest addType(String addType) {
    
    this.addType = addType;
    return this;
  }

   /**
   * 加好友方式（默认双向加好友方式）：Add_Type_Single 表示单向加好友 Add_Type_Both 表示双向加好友
   * @return addType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "加好友方式（默认双向加好友方式）：Add_Type_Single 表示单向加好友 Add_Type_Both 表示双向加好友")

  public String getAddType() {
    return addType;
  }


  public void setAddType(String addType) {
    this.addType = addType;
  }


  public FriendAddRequest forceAddFlags(ForceAddFlagsEnum forceAddFlags) {
    
    this.forceAddFlags = forceAddFlags;
    return this;
  }

   /**
   * 管理员强制加好友标记：1表示强制加好友，0表示常规加好友方式
   * @return forceAddFlags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "管理员强制加好友标记：1表示强制加好友，0表示常规加好友方式")

  public ForceAddFlagsEnum getForceAddFlags() {
    return forceAddFlags;
  }


  public void setForceAddFlags(ForceAddFlagsEnum forceAddFlags) {
    this.forceAddFlags = forceAddFlags;
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
  public FriendAddRequest putAdditionalProperty(String key, Object value) {
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
    FriendAddRequest friendAddRequest = (FriendAddRequest) o;
    return Objects.equals(this.fromAccount, friendAddRequest.fromAccount) &&
        Objects.equals(this.addFriendItem, friendAddRequest.addFriendItem) &&
        Objects.equals(this.addType, friendAddRequest.addType) &&
        Objects.equals(this.forceAddFlags, friendAddRequest.forceAddFlags)&&
        Objects.equals(this.additionalProperties, friendAddRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, addFriendItem, addType, forceAddFlags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendAddRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    addFriendItem: ").append(toIndentedString(addFriendItem)).append("\n");
    sb.append("    addType: ").append(toIndentedString(addType)).append("\n");
    sb.append("    forceAddFlags: ").append(toIndentedString(forceAddFlags)).append("\n");
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
    openapiFields.add("From_Account");
    openapiFields.add("AddFriendItem");
    openapiFields.add("AddType");
    openapiFields.add("ForceAddFlags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("From_Account");
    openapiRequiredFields.add("AddFriendItem");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FriendAddRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FriendAddRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FriendAddRequest is not found in the empty JSON string", FriendAddRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FriendAddRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("From_Account") != null && !jsonObj.get("From_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From_Account").toString()));
      }
      JsonArray jsonArrayaddFriendItem = jsonObj.getAsJsonArray("AddFriendItem");
      if (jsonArrayaddFriendItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("AddFriendItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `AddFriendItem` to be an array in the JSON string but got `%s`", jsonObj.get("AddFriendItem").toString()));
        }

        // validate the optional field `AddFriendItem` (array)
        for (int i = 0; i < jsonArrayaddFriendItem.size(); i++) {
          FriendAddRequestAddFriendItemInner.validateJsonObject(jsonArrayaddFriendItem.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("AddType") != null && !jsonObj.get("AddType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AddType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AddType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FriendAddRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FriendAddRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FriendAddRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FriendAddRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FriendAddRequest>() {
           @Override
           public void write(JsonWriter out, FriendAddRequest value) throws IOException {
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
           public FriendAddRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FriendAddRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FriendAddRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FriendAddRequest
  * @throws IOException if the JSON string is invalid with respect to FriendAddRequest
  */
  public static FriendAddRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FriendAddRequest.class);
  }

 /**
  * Convert an instance of FriendAddRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

