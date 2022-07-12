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
 * DeleteGroupMemberRequest
 */

public class DeleteGroupMemberRequest {
  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  /**
   * 是否静默删人。0表示非静默删人，1表示静默删人。静默即删除成员时不通知群里所有成员，只通知被删除群成员。不填写该字段时默认为0
   */
  @JsonAdapter(SilenceEnum.Adapter.class)
  public enum SilenceEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    SilenceEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SilenceEnum fromValue(Integer value) {
      for (SilenceEnum b : SilenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SilenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SilenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SilenceEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return SilenceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SILENCE = "Silence";
  @SerializedName(SERIALIZED_NAME_SILENCE)
  private SilenceEnum silence;

  public static final String SERIALIZED_NAME_REASON = "Reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_MEMBER_TO_DEL_ACCOUNT = "MemberToDel_Account";
  @SerializedName(SERIALIZED_NAME_MEMBER_TO_DEL_ACCOUNT)
  private List<String> memberToDelAccount = new ArrayList<>();

  public DeleteGroupMemberRequest() { 
  }

  public DeleteGroupMemberRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 操作的群 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "操作的群 ID")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public DeleteGroupMemberRequest silence(SilenceEnum silence) {
    
    this.silence = silence;
    return this;
  }

   /**
   * 是否静默删人。0表示非静默删人，1表示静默删人。静默即删除成员时不通知群里所有成员，只通知被删除群成员。不填写该字段时默认为0
   * @return silence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否静默删人。0表示非静默删人，1表示静默删人。静默即删除成员时不通知群里所有成员，只通知被删除群成员。不填写该字段时默认为0")

  public SilenceEnum getSilence() {
    return silence;
  }


  public void setSilence(SilenceEnum silence) {
    this.silence = silence;
  }


  public DeleteGroupMemberRequest reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 踢出用户原因
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "踢出用户原因")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public DeleteGroupMemberRequest memberToDelAccount(List<String> memberToDelAccount) {
    
    this.memberToDelAccount = memberToDelAccount;
    return this;
  }

  public DeleteGroupMemberRequest addMemberToDelAccountItem(String memberToDelAccountItem) {
    this.memberToDelAccount.add(memberToDelAccountItem);
    return this;
  }

   /**
   * 待删除的群成员
   * @return memberToDelAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "待删除的群成员")

  public List<String> getMemberToDelAccount() {
    return memberToDelAccount;
  }


  public void setMemberToDelAccount(List<String> memberToDelAccount) {
    this.memberToDelAccount = memberToDelAccount;
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
  public DeleteGroupMemberRequest putAdditionalProperty(String key, Object value) {
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
    DeleteGroupMemberRequest deleteGroupMemberRequest = (DeleteGroupMemberRequest) o;
    return Objects.equals(this.groupId, deleteGroupMemberRequest.groupId) &&
        Objects.equals(this.silence, deleteGroupMemberRequest.silence) &&
        Objects.equals(this.reason, deleteGroupMemberRequest.reason) &&
        Objects.equals(this.memberToDelAccount, deleteGroupMemberRequest.memberToDelAccount)&&
        Objects.equals(this.additionalProperties, deleteGroupMemberRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, silence, reason, memberToDelAccount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteGroupMemberRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    silence: ").append(toIndentedString(silence)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    memberToDelAccount: ").append(toIndentedString(memberToDelAccount)).append("\n");
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
    openapiFields.add("Silence");
    openapiFields.add("Reason");
    openapiFields.add("MemberToDel_Account");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GroupId");
    openapiRequiredFields.add("MemberToDel_Account");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeleteGroupMemberRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeleteGroupMemberRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteGroupMemberRequest is not found in the empty JSON string", DeleteGroupMemberRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeleteGroupMemberRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupId").toString()));
      }
      if (jsonObj.get("Reason") != null && !jsonObj.get("Reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Reason").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("MemberToDel_Account") != null && !jsonObj.get("MemberToDel_Account").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `MemberToDel_Account` to be an array in the JSON string but got `%s`", jsonObj.get("MemberToDel_Account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteGroupMemberRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteGroupMemberRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteGroupMemberRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteGroupMemberRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteGroupMemberRequest>() {
           @Override
           public void write(JsonWriter out, DeleteGroupMemberRequest value) throws IOException {
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
           public DeleteGroupMemberRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DeleteGroupMemberRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DeleteGroupMemberRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeleteGroupMemberRequest
  * @throws IOException if the JSON string is invalid with respect to DeleteGroupMemberRequest
  */
  public static DeleteGroupMemberRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteGroupMemberRequest.class);
  }

 /**
  * Convert an instance of DeleteGroupMemberRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

