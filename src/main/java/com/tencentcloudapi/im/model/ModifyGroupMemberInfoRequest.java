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
import com.tencentcloudapi.im.model.ModifyGroupMemberInfoRequestAppMemberDefinedDataInner;
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
 * ModifyGroupMemberInfoRequest
 */

public class ModifyGroupMemberInfoRequest {
  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_MEMBER_ACCOUNT = "Member_Account";
  @SerializedName(SERIALIZED_NAME_MEMBER_ACCOUNT)
  private String memberAccount;

  public static final String SERIALIZED_NAME_ROLE = "Role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_MSG_FLAG = "MsgFlag";
  @SerializedName(SERIALIZED_NAME_MSG_FLAG)
  private String msgFlag;

  public static final String SERIALIZED_NAME_NAME_CARD = "NameCard";
  @SerializedName(SERIALIZED_NAME_NAME_CARD)
  private String nameCard;

  public static final String SERIALIZED_NAME_APP_MEMBER_DEFINED_DATA = "AppMemberDefinedData";
  @SerializedName(SERIALIZED_NAME_APP_MEMBER_DEFINED_DATA)
  private List<ModifyGroupMemberInfoRequestAppMemberDefinedDataInner> appMemberDefinedData = null;

  public static final String SERIALIZED_NAME_SHUT_UP_TIME = "ShutUpTime";
  @SerializedName(SERIALIZED_NAME_SHUT_UP_TIME)
  private Integer shutUpTime;

  public ModifyGroupMemberInfoRequest() { 
  }

  public ModifyGroupMemberInfoRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * ???????????? ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "???????????? ID")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ModifyGroupMemberInfoRequest memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * ?????????????????????
   * @return memberAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "?????????????????????")

  public String getMemberAccount() {
    return memberAccount;
  }


  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  public ModifyGroupMemberInfoRequest role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * ???????????????Admin/Member ???????????????/???????????????
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "???????????????Admin/Member ???????????????/???????????????")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public ModifyGroupMemberInfoRequest msgFlag(String msgFlag) {
    
    this.msgFlag = msgFlag;
    return this;
  }

   /**
   * ??????????????????
   * @return msgFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????")

  public String getMsgFlag() {
    return msgFlag;
  }


  public void setMsgFlag(String msgFlag) {
    this.msgFlag = msgFlag;
  }


  public ModifyGroupMemberInfoRequest nameCard(String nameCard) {
    
    this.nameCard = nameCard;
    return this;
  }

   /**
   * ???????????????????????????50????????????
   * @return nameCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "???????????????????????????50????????????")

  public String getNameCard() {
    return nameCard;
  }


  public void setNameCard(String nameCard) {
    this.nameCard = nameCard;
  }


  public ModifyGroupMemberInfoRequest appMemberDefinedData(List<ModifyGroupMemberInfoRequestAppMemberDefinedDataInner> appMemberDefinedData) {
    
    this.appMemberDefinedData = appMemberDefinedData;
    return this;
  }

  public ModifyGroupMemberInfoRequest addAppMemberDefinedDataItem(ModifyGroupMemberInfoRequestAppMemberDefinedDataInner appMemberDefinedDataItem) {
    if (this.appMemberDefinedData == null) {
      this.appMemberDefinedData = new ArrayList<>();
    }
    this.appMemberDefinedData.add(appMemberDefinedDataItem);
    return this;
  }

   /**
   * ??????????????????????????????????????????????????????????????????????????? ???????????? IM ????????????https://console.cloud.tencent.com/im??? ?????????????????????????????? ???????????????https://cloud.tencent.com/document/product/269/1502???
   * @return appMemberDefinedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????????????????????????????????????????????????????????????? ???????????? IM ????????????https://console.cloud.tencent.com/im??? ?????????????????????????????? ???????????????https://cloud.tencent.com/document/product/269/1502???")

  public List<ModifyGroupMemberInfoRequestAppMemberDefinedDataInner> getAppMemberDefinedData() {
    return appMemberDefinedData;
  }


  public void setAppMemberDefinedData(List<ModifyGroupMemberInfoRequestAppMemberDefinedDataInner> appMemberDefinedData) {
    this.appMemberDefinedData = appMemberDefinedData;
  }


  public ModifyGroupMemberInfoRequest shutUpTime(Integer shutUpTime) {
    
    this.shutUpTime = shutUpTime;
    return this;
  }

   /**
   * ?????????????????????????????????0??????????????????
   * @return shutUpTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????0??????????????????")

  public Integer getShutUpTime() {
    return shutUpTime;
  }


  public void setShutUpTime(Integer shutUpTime) {
    this.shutUpTime = shutUpTime;
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
  public ModifyGroupMemberInfoRequest putAdditionalProperty(String key, Object value) {
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
    ModifyGroupMemberInfoRequest modifyGroupMemberInfoRequest = (ModifyGroupMemberInfoRequest) o;
    return Objects.equals(this.groupId, modifyGroupMemberInfoRequest.groupId) &&
        Objects.equals(this.memberAccount, modifyGroupMemberInfoRequest.memberAccount) &&
        Objects.equals(this.role, modifyGroupMemberInfoRequest.role) &&
        Objects.equals(this.msgFlag, modifyGroupMemberInfoRequest.msgFlag) &&
        Objects.equals(this.nameCard, modifyGroupMemberInfoRequest.nameCard) &&
        Objects.equals(this.appMemberDefinedData, modifyGroupMemberInfoRequest.appMemberDefinedData) &&
        Objects.equals(this.shutUpTime, modifyGroupMemberInfoRequest.shutUpTime)&&
        Objects.equals(this.additionalProperties, modifyGroupMemberInfoRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, memberAccount, role, msgFlag, nameCard, appMemberDefinedData, shutUpTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyGroupMemberInfoRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    msgFlag: ").append(toIndentedString(msgFlag)).append("\n");
    sb.append("    nameCard: ").append(toIndentedString(nameCard)).append("\n");
    sb.append("    appMemberDefinedData: ").append(toIndentedString(appMemberDefinedData)).append("\n");
    sb.append("    shutUpTime: ").append(toIndentedString(shutUpTime)).append("\n");
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
    openapiFields.add("GroupId");
    openapiFields.add("Member_Account");
    openapiFields.add("Role");
    openapiFields.add("MsgFlag");
    openapiFields.add("NameCard");
    openapiFields.add("AppMemberDefinedData");
    openapiFields.add("ShutUpTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GroupId");
    openapiRequiredFields.add("Member_Account");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModifyGroupMemberInfoRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ModifyGroupMemberInfoRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModifyGroupMemberInfoRequest is not found in the empty JSON string", ModifyGroupMemberInfoRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModifyGroupMemberInfoRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
      if (jsonObj.get("Member_Account") != null && !jsonObj.get("Member_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Member_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Member_Account").toString()));
      }
      if (jsonObj.get("Role") != null && !jsonObj.get("Role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Role").toString()));
      }
      if (jsonObj.get("MsgFlag") != null && !jsonObj.get("MsgFlag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MsgFlag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MsgFlag").toString()));
      }
      if (jsonObj.get("NameCard") != null && !jsonObj.get("NameCard").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NameCard` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NameCard").toString()));
      }
      JsonArray jsonArrayappMemberDefinedData = jsonObj.getAsJsonArray("AppMemberDefinedData");
      if (jsonArrayappMemberDefinedData != null) {
        // ensure the json data is an array
        if (!jsonObj.get("AppMemberDefinedData").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `AppMemberDefinedData` to be an array in the JSON string but got `%s`", jsonObj.get("AppMemberDefinedData").toString()));
        }

        // validate the optional field `AppMemberDefinedData` (array)
        for (int i = 0; i < jsonArrayappMemberDefinedData.size(); i++) {
          ModifyGroupMemberInfoRequestAppMemberDefinedDataInner.validateJsonObject(jsonArrayappMemberDefinedData.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModifyGroupMemberInfoRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModifyGroupMemberInfoRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModifyGroupMemberInfoRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModifyGroupMemberInfoRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModifyGroupMemberInfoRequest>() {
           @Override
           public void write(JsonWriter out, ModifyGroupMemberInfoRequest value) throws IOException {
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
           public ModifyGroupMemberInfoRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ModifyGroupMemberInfoRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ModifyGroupMemberInfoRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModifyGroupMemberInfoRequest
  * @throws IOException if the JSON string is invalid with respect to ModifyGroupMemberInfoRequest
  */
  public static ModifyGroupMemberInfoRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModifyGroupMemberInfoRequest.class);
  }

 /**
  * Convert an instance of ModifyGroupMemberInfoRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

