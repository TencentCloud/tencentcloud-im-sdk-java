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
 * GroupGetResponseAllOfResultItem
 */

public class GroupGetResponseAllOfResultItem {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GROUP_NAME = "GroupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_FRIEND_NUMBER = "FriendNumber";
  @SerializedName(SERIALIZED_NAME_FRIEND_NUMBER)
  private Integer friendNumber;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "To_Account";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private List<String> toAccount = null;

  public GroupGetResponseAllOfResultItem() { 
  }

  public GroupGetResponseAllOfResultItem groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * 分组名
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分组名")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public GroupGetResponseAllOfResultItem friendNumber(Integer friendNumber) {
    
    this.friendNumber = friendNumber;
    return this;
  }

   /**
   * 该分组下的好友数量
   * @return friendNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该分组下的好友数量")

  public Integer getFriendNumber() {
    return friendNumber;
  }


  public void setFriendNumber(Integer friendNumber) {
    this.friendNumber = friendNumber;
  }


  public GroupGetResponseAllOfResultItem toAccount(List<String> toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

  public GroupGetResponseAllOfResultItem addToAccountItem(String toAccountItem) {
    if (this.toAccount == null) {
      this.toAccount = new ArrayList<>();
    }
    this.toAccount.add(toAccountItem);
    return this;
  }

   /**
   * 该分组下的好友的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该分组下的好友的 UserID")

  public List<String> getToAccount() {
    return toAccount;
  }


  public void setToAccount(List<String> toAccount) {
    this.toAccount = toAccount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupGetResponseAllOfResultItem groupGetResponseAllOfResultItem = (GroupGetResponseAllOfResultItem) o;
    return Objects.equals(this.groupName, groupGetResponseAllOfResultItem.groupName) &&
        Objects.equals(this.friendNumber, groupGetResponseAllOfResultItem.friendNumber) &&
        Objects.equals(this.toAccount, groupGetResponseAllOfResultItem.toAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, friendNumber, toAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupGetResponseAllOfResultItem {\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    friendNumber: ").append(toIndentedString(friendNumber)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
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
    openapiFields.add("GroupName");
    openapiFields.add("FriendNumber");
    openapiFields.add("To_Account");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupGetResponseAllOfResultItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupGetResponseAllOfResultItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupGetResponseAllOfResultItem is not found in the empty JSON string", GroupGetResponseAllOfResultItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupGetResponseAllOfResultItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupGetResponseAllOfResultItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("GroupName") != null && !jsonObj.get("GroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupName").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("To_Account") != null && !jsonObj.get("To_Account").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `To_Account` to be an array in the JSON string but got `%s`", jsonObj.get("To_Account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupGetResponseAllOfResultItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupGetResponseAllOfResultItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupGetResponseAllOfResultItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupGetResponseAllOfResultItem.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupGetResponseAllOfResultItem>() {
           @Override
           public void write(JsonWriter out, GroupGetResponseAllOfResultItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupGetResponseAllOfResultItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupGetResponseAllOfResultItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupGetResponseAllOfResultItem
  * @throws IOException if the JSON string is invalid with respect to GroupGetResponseAllOfResultItem
  */
  public static GroupGetResponseAllOfResultItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupGetResponseAllOfResultItem.class);
  }

 /**
  * Convert an instance of GroupGetResponseAllOfResultItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

