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
 * FriendAddRequestAddFriendItemInner
 */

public class FriendAddRequestAddFriendItemInner {
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
   * ????????? UserID
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "????????? UserID")

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
   * From_Account ??? To_Account ????????????????????????????????? ??????????????????(https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5)
   * @return remark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From_Account ??? To_Account ????????????????????????????????? ??????????????????(https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5)")

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
   * From_Account ??? To_Account ??????????????????????????????????????????????????????????????????????????? String ?????????????????????????????? ?????????????????????https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5???
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From_Account ??? To_Account ??????????????????????????????????????????????????????????????????????????? String ?????????????????????????????? ?????????????????????https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5???")

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
   * ??????????????????????????????????????? ?????????????????????https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5???
   * @return addSource
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "??????????????????????????????????????? ?????????????????????https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5???")

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
   * From_Account ??? To_Account ?????????????????????????????????????????????????????? ??????????????????????????????????????????
   * @return addWording
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From_Account ??? To_Account ?????????????????????????????????????????????????????? ??????????????????????????????????????????")

  public String getAddWording() {
    return addWording;
  }


  public void setAddWording(String addWording) {
    this.addWording = addWording;
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
  public FriendAddRequestAddFriendItemInner putAdditionalProperty(String key, Object value) {
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
    FriendAddRequestAddFriendItemInner friendAddRequestAddFriendItemInner = (FriendAddRequestAddFriendItemInner) o;
    return Objects.equals(this.toAccount, friendAddRequestAddFriendItemInner.toAccount) &&
        Objects.equals(this.remark, friendAddRequestAddFriendItemInner.remark) &&
        Objects.equals(this.groupName, friendAddRequestAddFriendItemInner.groupName) &&
        Objects.equals(this.addSource, friendAddRequestAddFriendItemInner.addSource) &&
        Objects.equals(this.addWording, friendAddRequestAddFriendItemInner.addWording)&&
        Objects.equals(this.additionalProperties, friendAddRequestAddFriendItemInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, remark, groupName, addSource, addWording, additionalProperties);
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
           public FriendAddRequestAddFriendItemInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FriendAddRequestAddFriendItemInner instance = thisAdapter.fromJsonTree(jsonObj);
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

