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
 * GetRecentContactListGroupDeleteRequest
 */

public class GetRecentContactListGroupDeleteRequest {
  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "From_Account";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private String fromAccount;

  /**
   * 会话类型：1 表示 C2C 会话；2 表示 G2C 会话
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    TypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(Integer value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_TO_GROUPID = "ToGroupid";
  @SerializedName(SERIALIZED_NAME_TO_GROUPID)
  private String toGroupid;

  /**
   * 是否清理漫游消息：1 表示清理漫游消息；0 表示不清理漫游消息
   */
  @JsonAdapter(ClearRambleEnum.Adapter.class)
  public enum ClearRambleEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    ClearRambleEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClearRambleEnum fromValue(Integer value) {
      for (ClearRambleEnum b : ClearRambleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ClearRambleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClearRambleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClearRambleEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ClearRambleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CLEAR_RAMBLE = "ClearRamble";
  @SerializedName(SERIALIZED_NAME_CLEAR_RAMBLE)
  private ClearRambleEnum clearRamble;

  public GetRecentContactListGroupDeleteRequest() { 
  }

  public GetRecentContactListGroupDeleteRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 请求删除该 UserID 的会话
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "请求删除该 UserID 的会话")

  public String getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }


  public GetRecentContactListGroupDeleteRequest type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * 会话类型：1 表示 C2C 会话；2 表示 G2C 会话
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "会话类型：1 表示 C2C 会话；2 表示 G2C 会话")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public GetRecentContactListGroupDeleteRequest toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * C2C 会话才赋值，C2C 会话方的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "C2C 会话才赋值，C2C 会话方的 UserID")

  public String getToAccount() {
    return toAccount;
  }


  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public GetRecentContactListGroupDeleteRequest toGroupid(String toGroupid) {
    
    this.toGroupid = toGroupid;
    return this;
  }

   /**
   * G2C 会话才赋值，G2C 会话的群 ID
   * @return toGroupid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "G2C 会话才赋值，G2C 会话的群 ID")

  public String getToGroupid() {
    return toGroupid;
  }


  public void setToGroupid(String toGroupid) {
    this.toGroupid = toGroupid;
  }


  public GetRecentContactListGroupDeleteRequest clearRamble(ClearRambleEnum clearRamble) {
    
    this.clearRamble = clearRamble;
    return this;
  }

   /**
   * 是否清理漫游消息：1 表示清理漫游消息；0 表示不清理漫游消息
   * @return clearRamble
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否清理漫游消息：1 表示清理漫游消息；0 表示不清理漫游消息")

  public ClearRambleEnum getClearRamble() {
    return clearRamble;
  }


  public void setClearRamble(ClearRambleEnum clearRamble) {
    this.clearRamble = clearRamble;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecentContactListGroupDeleteRequest getRecentContactListGroupDeleteRequest = (GetRecentContactListGroupDeleteRequest) o;
    return Objects.equals(this.fromAccount, getRecentContactListGroupDeleteRequest.fromAccount) &&
        Objects.equals(this.type, getRecentContactListGroupDeleteRequest.type) &&
        Objects.equals(this.toAccount, getRecentContactListGroupDeleteRequest.toAccount) &&
        Objects.equals(this.toGroupid, getRecentContactListGroupDeleteRequest.toGroupid) &&
        Objects.equals(this.clearRamble, getRecentContactListGroupDeleteRequest.clearRamble);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, type, toAccount, toGroupid, clearRamble);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecentContactListGroupDeleteRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    toGroupid: ").append(toIndentedString(toGroupid)).append("\n");
    sb.append("    clearRamble: ").append(toIndentedString(clearRamble)).append("\n");
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
    openapiFields.add("Type");
    openapiFields.add("To_Account");
    openapiFields.add("ToGroupid");
    openapiFields.add("ClearRamble");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("From_Account");
    openapiRequiredFields.add("Type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetRecentContactListGroupDeleteRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetRecentContactListGroupDeleteRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRecentContactListGroupDeleteRequest is not found in the empty JSON string", GetRecentContactListGroupDeleteRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetRecentContactListGroupDeleteRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRecentContactListGroupDeleteRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetRecentContactListGroupDeleteRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("From_Account") != null && !jsonObj.get("From_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From_Account").toString()));
      }
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
      if (jsonObj.get("ToGroupid") != null && !jsonObj.get("ToGroupid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ToGroupid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ToGroupid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRecentContactListGroupDeleteRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRecentContactListGroupDeleteRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRecentContactListGroupDeleteRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRecentContactListGroupDeleteRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRecentContactListGroupDeleteRequest>() {
           @Override
           public void write(JsonWriter out, GetRecentContactListGroupDeleteRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRecentContactListGroupDeleteRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetRecentContactListGroupDeleteRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRecentContactListGroupDeleteRequest
  * @throws IOException if the JSON string is invalid with respect to GetRecentContactListGroupDeleteRequest
  */
  public static GetRecentContactListGroupDeleteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRecentContactListGroupDeleteRequest.class);
  }

 /**
  * Convert an instance of GetRecentContactListGroupDeleteRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

