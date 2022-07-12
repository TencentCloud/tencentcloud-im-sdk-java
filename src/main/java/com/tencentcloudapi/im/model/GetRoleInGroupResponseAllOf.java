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
import com.tencentcloudapi.im.model.GetRoleInGroupResponseAllOfUserIdList;
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
 * GetRoleInGroupResponseAllOf
 */

public class GetRoleInGroupResponseAllOf {
  public static final String SERIALIZED_NAME_USER_ID_LIST = "UserIdList";
  @SerializedName(SERIALIZED_NAME_USER_ID_LIST)
  private List<GetRoleInGroupResponseAllOfUserIdList> userIdList = null;

  public GetRoleInGroupResponseAllOf() { 
  }

  public GetRoleInGroupResponseAllOf userIdList(List<GetRoleInGroupResponseAllOfUserIdList> userIdList) {
    
    this.userIdList = userIdList;
    return this;
  }

  public GetRoleInGroupResponseAllOf addUserIdListItem(GetRoleInGroupResponseAllOfUserIdList userIdListItem) {
    if (this.userIdList == null) {
      this.userIdList = new ArrayList<>();
    }
    this.userIdList.add(userIdListItem);
    return this;
  }

   /**
   * 拉取到的成员角色，包括：Owner(群主)，Admin(群管理员)，Member(普通群成员），NotMember(非群成员)
   * @return userIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "拉取到的成员角色，包括：Owner(群主)，Admin(群管理员)，Member(普通群成员），NotMember(非群成员)")

  public List<GetRoleInGroupResponseAllOfUserIdList> getUserIdList() {
    return userIdList;
  }


  public void setUserIdList(List<GetRoleInGroupResponseAllOfUserIdList> userIdList) {
    this.userIdList = userIdList;
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
  public GetRoleInGroupResponseAllOf putAdditionalProperty(String key, Object value) {
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
    GetRoleInGroupResponseAllOf getRoleInGroupResponseAllOf = (GetRoleInGroupResponseAllOf) o;
    return Objects.equals(this.userIdList, getRoleInGroupResponseAllOf.userIdList)&&
        Objects.equals(this.additionalProperties, getRoleInGroupResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIdList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoleInGroupResponseAllOf {\n");
    sb.append("    userIdList: ").append(toIndentedString(userIdList)).append("\n");
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
    openapiFields.add("UserIdList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetRoleInGroupResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetRoleInGroupResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRoleInGroupResponseAllOf is not found in the empty JSON string", GetRoleInGroupResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayuserIdList = jsonObj.getAsJsonArray("UserIdList");
      if (jsonArrayuserIdList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("UserIdList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `UserIdList` to be an array in the JSON string but got `%s`", jsonObj.get("UserIdList").toString()));
        }

        // validate the optional field `UserIdList` (array)
        for (int i = 0; i < jsonArrayuserIdList.size(); i++) {
          GetRoleInGroupResponseAllOfUserIdList.validateJsonObject(jsonArrayuserIdList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRoleInGroupResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRoleInGroupResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRoleInGroupResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRoleInGroupResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRoleInGroupResponseAllOf>() {
           @Override
           public void write(JsonWriter out, GetRoleInGroupResponseAllOf value) throws IOException {
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
           public GetRoleInGroupResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetRoleInGroupResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetRoleInGroupResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRoleInGroupResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to GetRoleInGroupResponseAllOf
  */
  public static GetRoleInGroupResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRoleInGroupResponseAllOf.class);
  }

 /**
  * Convert an instance of GetRoleInGroupResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

