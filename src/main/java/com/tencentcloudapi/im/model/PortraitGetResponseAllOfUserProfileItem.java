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
import com.tencentcloudapi.im.model.PortraitGetResponseAllOfProfileItem;
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
 * PortraitGetResponseAllOfUserProfileItem
 */

public class PortraitGetResponseAllOfUserProfileItem {
  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_PROFILE_ITEM = "ProfileItem";
  @SerializedName(SERIALIZED_NAME_PROFILE_ITEM)
  private List<PortraitGetResponseAllOfProfileItem> profileItem = null;

  public static final String SERIALIZED_NAME_RESULT_CODE = "ResultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private Integer resultCode;

  public static final String SERIALIZED_NAME_RESULT_INFO = "ResultInfo";
  @SerializedName(SERIALIZED_NAME_RESULT_INFO)
  private String resultInfo;

  public PortraitGetResponseAllOfUserProfileItem() { 
  }

  public PortraitGetResponseAllOfUserProfileItem toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * ?????????????????? UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????? UserID")

  public String getToAccount() {
    return toAccount;
  }


  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public PortraitGetResponseAllOfUserProfileItem profileItem(List<PortraitGetResponseAllOfProfileItem> profileItem) {
    
    this.profileItem = profileItem;
    return this;
  }

  public PortraitGetResponseAllOfUserProfileItem addProfileItemItem(PortraitGetResponseAllOfProfileItem profileItemItem) {
    if (this.profileItem == null) {
      this.profileItem = new ArrayList<>();
    }
    this.profileItem.add(profileItemItem);
    return this;
  }

   /**
   * ??????????????????????????????????????????????????????????????????????????? Tag ??? Value
   * @return profileItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????????????????????????????????????????????????????????????? Tag ??? Value")

  public List<PortraitGetResponseAllOfProfileItem> getProfileItem() {
    return profileItem;
  }


  public void setProfileItem(List<PortraitGetResponseAllOfProfileItem> profileItem) {
    this.profileItem = profileItem;
  }


  public PortraitGetResponseAllOfUserProfileItem resultCode(Integer resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * To_Account ??????????????????0??????????????????0????????????
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To_Account ??????????????????0??????????????????0????????????")

  public Integer getResultCode() {
    return resultCode;
  }


  public void setResultCode(Integer resultCode) {
    this.resultCode = resultCode;
  }


  public PortraitGetResponseAllOfUserProfileItem resultInfo(String resultInfo) {
    
    this.resultInfo = resultInfo;
    return this;
  }

   /**
   * To_Account ????????????????????????????????????????????????
   * @return resultInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To_Account ????????????????????????????????????????????????")

  public String getResultInfo() {
    return resultInfo;
  }


  public void setResultInfo(String resultInfo) {
    this.resultInfo = resultInfo;
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
  public PortraitGetResponseAllOfUserProfileItem putAdditionalProperty(String key, Object value) {
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
    PortraitGetResponseAllOfUserProfileItem portraitGetResponseAllOfUserProfileItem = (PortraitGetResponseAllOfUserProfileItem) o;
    return Objects.equals(this.toAccount, portraitGetResponseAllOfUserProfileItem.toAccount) &&
        Objects.equals(this.profileItem, portraitGetResponseAllOfUserProfileItem.profileItem) &&
        Objects.equals(this.resultCode, portraitGetResponseAllOfUserProfileItem.resultCode) &&
        Objects.equals(this.resultInfo, portraitGetResponseAllOfUserProfileItem.resultInfo)&&
        Objects.equals(this.additionalProperties, portraitGetResponseAllOfUserProfileItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, profileItem, resultCode, resultInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortraitGetResponseAllOfUserProfileItem {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    profileItem: ").append(toIndentedString(profileItem)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
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
    openapiFields.add("To_Account");
    openapiFields.add("ProfileItem");
    openapiFields.add("ResultCode");
    openapiFields.add("ResultInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PortraitGetResponseAllOfUserProfileItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PortraitGetResponseAllOfUserProfileItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortraitGetResponseAllOfUserProfileItem is not found in the empty JSON string", PortraitGetResponseAllOfUserProfileItem.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
      JsonArray jsonArrayprofileItem = jsonObj.getAsJsonArray("ProfileItem");
      if (jsonArrayprofileItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ProfileItem").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ProfileItem` to be an array in the JSON string but got `%s`", jsonObj.get("ProfileItem").toString()));
        }

        // validate the optional field `ProfileItem` (array)
        for (int i = 0; i < jsonArrayprofileItem.size(); i++) {
          PortraitGetResponseAllOfProfileItem.validateJsonObject(jsonArrayprofileItem.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("ResultInfo") != null && !jsonObj.get("ResultInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ResultInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ResultInfo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortraitGetResponseAllOfUserProfileItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortraitGetResponseAllOfUserProfileItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortraitGetResponseAllOfUserProfileItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortraitGetResponseAllOfUserProfileItem.class));

       return (TypeAdapter<T>) new TypeAdapter<PortraitGetResponseAllOfUserProfileItem>() {
           @Override
           public void write(JsonWriter out, PortraitGetResponseAllOfUserProfileItem value) throws IOException {
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
           public PortraitGetResponseAllOfUserProfileItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PortraitGetResponseAllOfUserProfileItem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PortraitGetResponseAllOfUserProfileItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PortraitGetResponseAllOfUserProfileItem
  * @throws IOException if the JSON string is invalid with respect to PortraitGetResponseAllOfUserProfileItem
  */
  public static PortraitGetResponseAllOfUserProfileItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortraitGetResponseAllOfUserProfileItem.class);
  }

 /**
  * Convert an instance of PortraitGetResponseAllOfUserProfileItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

