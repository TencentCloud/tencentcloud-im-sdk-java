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
import com.tencentcloudapi.im.model.DefinedData;
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
 * ImportGroupRequest
 */

public class ImportGroupRequest {
  public static final String SERIALIZED_NAME_OWNER_ACCOUNT = "Owner_Account";
  @SerializedName(SERIALIZED_NAME_OWNER_ACCOUNT)
  private String ownerAccount;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INTRODUCTION = "Introduction";
  @SerializedName(SERIALIZED_NAME_INTRODUCTION)
  private String introduction;

  public static final String SERIALIZED_NAME_NOTIFICATION = "Notification";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION)
  private String notification;

  public static final String SERIALIZED_NAME_FACE_URL = "FaceUrl";
  @SerializedName(SERIALIZED_NAME_FACE_URL)
  private String faceUrl;

  public static final String SERIALIZED_NAME_MAX_MEMBER_COUNT = "MaxMemberCount";
  @SerializedName(SERIALIZED_NAME_MAX_MEMBER_COUNT)
  private Integer maxMemberCount;

  /**
   * ????????????????????????????????? FreeAccess?????????????????????NeedPermission?????????????????????DisableApply????????????????????????????????????NeedPermission??????????????????
   */
  @JsonAdapter(ApplyJoinOptionEnum.Adapter.class)
  public enum ApplyJoinOptionEnum {
    FREEACCESS("FreeAccess"),
    
    NEEDPERMISSION("NeedPermission"),
    
    DISABLEAPPLY("DisableApply");

    private String value;

    ApplyJoinOptionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApplyJoinOptionEnum fromValue(String value) {
      for (ApplyJoinOptionEnum b : ApplyJoinOptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ApplyJoinOptionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApplyJoinOptionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApplyJoinOptionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ApplyJoinOptionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_APPLY_JOIN_OPTION = "ApplyJoinOption";
  @SerializedName(SERIALIZED_NAME_APPLY_JOIN_OPTION)
  private ApplyJoinOptionEnum applyJoinOption;

  public static final String SERIALIZED_NAME_APP_DEFINED_DATA = "AppDefinedData";
  @SerializedName(SERIALIZED_NAME_APP_DEFINED_DATA)
  private List<DefinedData> appDefinedData = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "CreateTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Integer createTime;

  public ImportGroupRequest() { 
  }

  public ImportGroupRequest ownerAccount(String ownerAccount) {
    
    this.ownerAccount = ownerAccount;
    return this;
  }

   /**
   * ?????? ID???????????????????????????????????????????????????????????????
   * @return ownerAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????? ID???????????????????????????????????????????????????????????????")

  public String getOwnerAccount() {
    return ownerAccount;
  }


  public void setOwnerAccount(String ownerAccount) {
    this.ownerAccount = ownerAccount;
  }


  public ImportGroupRequest type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * ????????????????????? Public???????????????????????????Private?????????????????????Work???????????????????????? ChatRoom?????????????????????Meeting??????????????????Community????????????
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "????????????????????? Public???????????????????????????Private?????????????????????Work???????????????????????? ChatRoom?????????????????????Meeting??????????????????Community????????????")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ImportGroupRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * ?????????????????? ID ??????????????????????????????????????????????????? App ????????? REST API ?????????????????????????????? ID?????????????????? ???????????????https://cloud.tencent.com/document/product/269/1502???
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????? ID ??????????????????????????????????????????????????? App ????????? REST API ?????????????????????????????? ID?????????????????? ???????????????https://cloud.tencent.com/document/product/269/1502???")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ImportGroupRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * ??????????????????30??????
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "??????????????????30??????")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ImportGroupRequest introduction(String introduction) {
    
    this.introduction = introduction;
    return this;
  }

   /**
   * ??????????????????240??????
   * @return introduction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????240??????")

  public String getIntroduction() {
    return introduction;
  }


  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public ImportGroupRequest notification(String notification) {
    
    this.notification = notification;
    return this;
  }

   /**
   * ??????????????????300??????
   * @return notification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????300??????")

  public String getNotification() {
    return notification;
  }


  public void setNotification(String notification) {
    this.notification = notification;
  }


  public ImportGroupRequest faceUrl(String faceUrl) {
    
    this.faceUrl = faceUrl;
    return this;
  }

   /**
   * ????????? URL?????????100??????
   * @return faceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "????????? URL?????????100??????")

  public String getFaceUrl() {
    return faceUrl;
  }


  public void setFaceUrl(String faceUrl) {
    this.faceUrl = faceUrl;
  }


  public ImportGroupRequest maxMemberCount(Integer maxMemberCount) {
    
    this.maxMemberCount = maxMemberCount;
    return this;
  }

   /**
   * ?????????????????????????????????6000??????????????????2000???
   * maximum: 6000
   * @return maxMemberCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????6000??????????????????2000???")

  public Integer getMaxMemberCount() {
    return maxMemberCount;
  }


  public void setMaxMemberCount(Integer maxMemberCount) {
    this.maxMemberCount = maxMemberCount;
  }


  public ImportGroupRequest applyJoinOption(ApplyJoinOptionEnum applyJoinOption) {
    
    this.applyJoinOption = applyJoinOption;
    return this;
  }

   /**
   * ????????????????????????????????? FreeAccess?????????????????????NeedPermission?????????????????????DisableApply????????????????????????????????????NeedPermission??????????????????
   * @return applyJoinOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "????????????????????????????????? FreeAccess?????????????????????NeedPermission?????????????????????DisableApply????????????????????????????????????NeedPermission??????????????????")

  public ApplyJoinOptionEnum getApplyJoinOption() {
    return applyJoinOption;
  }


  public void setApplyJoinOption(ApplyJoinOptionEnum applyJoinOption) {
    this.applyJoinOption = applyJoinOption;
  }


  public ImportGroupRequest appDefinedData(List<DefinedData> appDefinedData) {
    
    this.appDefinedData = appDefinedData;
    return this;
  }

  public ImportGroupRequest addAppDefinedDataItem(DefinedData appDefinedDataItem) {
    if (this.appDefinedData == null) {
      this.appDefinedData = new ArrayList<>();
    }
    this.appDefinedData.add(appDefinedDataItem);
    return this;
  }

   /**
   * ?????????????????????????????????????????????????????????????????????????????????????????? ????????????(https://cloud.tencent.com/document/product/269/1502)
   * @return appDefinedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????????????????????????????????????????????????????????????? ????????????(https://cloud.tencent.com/document/product/269/1502)")

  public List<DefinedData> getAppDefinedData() {
    return appDefinedData;
  }


  public void setAppDefinedData(List<DefinedData> appDefinedData) {
    this.appDefinedData = appDefinedData;
  }


  public ImportGroupRequest createTime(Integer createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * ?????????????????????
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????")

  public Integer getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
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
  public ImportGroupRequest putAdditionalProperty(String key, Object value) {
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
    ImportGroupRequest importGroupRequest = (ImportGroupRequest) o;
    return Objects.equals(this.ownerAccount, importGroupRequest.ownerAccount) &&
        Objects.equals(this.type, importGroupRequest.type) &&
        Objects.equals(this.groupId, importGroupRequest.groupId) &&
        Objects.equals(this.name, importGroupRequest.name) &&
        Objects.equals(this.introduction, importGroupRequest.introduction) &&
        Objects.equals(this.notification, importGroupRequest.notification) &&
        Objects.equals(this.faceUrl, importGroupRequest.faceUrl) &&
        Objects.equals(this.maxMemberCount, importGroupRequest.maxMemberCount) &&
        Objects.equals(this.applyJoinOption, importGroupRequest.applyJoinOption) &&
        Objects.equals(this.appDefinedData, importGroupRequest.appDefinedData) &&
        Objects.equals(this.createTime, importGroupRequest.createTime)&&
        Objects.equals(this.additionalProperties, importGroupRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerAccount, type, groupId, name, introduction, notification, faceUrl, maxMemberCount, applyJoinOption, appDefinedData, createTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupRequest {\n");
    sb.append("    ownerAccount: ").append(toIndentedString(ownerAccount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    faceUrl: ").append(toIndentedString(faceUrl)).append("\n");
    sb.append("    maxMemberCount: ").append(toIndentedString(maxMemberCount)).append("\n");
    sb.append("    applyJoinOption: ").append(toIndentedString(applyJoinOption)).append("\n");
    sb.append("    appDefinedData: ").append(toIndentedString(appDefinedData)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
    openapiFields.add("Owner_Account");
    openapiFields.add("Type");
    openapiFields.add("GroupId");
    openapiFields.add("Name");
    openapiFields.add("Introduction");
    openapiFields.add("Notification");
    openapiFields.add("FaceUrl");
    openapiFields.add("MaxMemberCount");
    openapiFields.add("ApplyJoinOption");
    openapiFields.add("AppDefinedData");
    openapiFields.add("CreateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Type");
    openapiRequiredFields.add("Name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportGroupRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ImportGroupRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportGroupRequest is not found in the empty JSON string", ImportGroupRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImportGroupRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Owner_Account") != null && !jsonObj.get("Owner_Account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Owner_Account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Owner_Account").toString()));
      }
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Type").toString()));
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (jsonObj.get("Introduction") != null && !jsonObj.get("Introduction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Introduction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Introduction").toString()));
      }
      if (jsonObj.get("Notification") != null && !jsonObj.get("Notification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Notification").toString()));
      }
      if (jsonObj.get("FaceUrl") != null && !jsonObj.get("FaceUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FaceUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FaceUrl").toString()));
      }
      if (jsonObj.get("ApplyJoinOption") != null && !jsonObj.get("ApplyJoinOption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ApplyJoinOption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ApplyJoinOption").toString()));
      }
      JsonArray jsonArrayappDefinedData = jsonObj.getAsJsonArray("AppDefinedData");
      if (jsonArrayappDefinedData != null) {
        // ensure the json data is an array
        if (!jsonObj.get("AppDefinedData").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `AppDefinedData` to be an array in the JSON string but got `%s`", jsonObj.get("AppDefinedData").toString()));
        }

        // validate the optional field `AppDefinedData` (array)
        for (int i = 0; i < jsonArrayappDefinedData.size(); i++) {
          DefinedData.validateJsonObject(jsonArrayappDefinedData.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportGroupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportGroupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportGroupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportGroupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportGroupRequest>() {
           @Override
           public void write(JsonWriter out, ImportGroupRequest value) throws IOException {
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
           public ImportGroupRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ImportGroupRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ImportGroupRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportGroupRequest
  * @throws IOException if the JSON string is invalid with respect to ImportGroupRequest
  */
  public static ImportGroupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportGroupRequest.class);
  }

 /**
  * Convert an instance of ImportGroupRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

