
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.FriendAddRequestAddFriendItemInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * FriendAddRequest
 */
@JsonPropertyOrder({
  FriendAddRequest.JSON_PROPERTY_FROM_ACCOUNT,
  FriendAddRequest.JSON_PROPERTY_ADD_FRIEND_ITEM,
  FriendAddRequest.JSON_PROPERTY_ADD_TYPE,
  FriendAddRequest.JSON_PROPERTY_FORCE_ADD_FLAGS
})

public class FriendAddRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_ADD_FRIEND_ITEM = "AddFriendItem";
  private List<FriendAddRequestAddFriendItemInner> addFriendItem = new ArrayList<>();

  public static final String JSON_PROPERTY_ADD_TYPE = "AddType";
  private String addType;

  /**
   * 管理员强制加好友标记：1表示强制加好友，0表示常规加好友方式
   */
  public enum ForceAddFlagsEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    ForceAddFlagsEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ForceAddFlagsEnum fromValue(Integer value) {
      for (ForceAddFlagsEnum b : ForceAddFlagsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FORCE_ADD_FLAGS = "ForceAddFlags";
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
  @NotNull
  @ApiModelProperty(required = true, value = "需要为该 UserID 添加好友")
  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFromAccount() {
    return fromAccount;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "好友结构体对象")
  @JsonProperty(JSON_PROPERTY_ADD_FRIEND_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<FriendAddRequestAddFriendItemInner> getAddFriendItem() {
    return addFriendItem;
  }


  @JsonProperty(JSON_PROPERTY_ADD_FRIEND_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @JsonProperty(JSON_PROPERTY_ADD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddType() {
    return addType;
  }


  @JsonProperty(JSON_PROPERTY_ADD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_FORCE_ADD_FLAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ForceAddFlagsEnum getForceAddFlags() {
    return forceAddFlags;
  }


  @JsonProperty(JSON_PROPERTY_FORCE_ADD_FLAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForceAddFlags(ForceAddFlagsEnum forceAddFlags) {
    this.forceAddFlags = forceAddFlags;
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
        Objects.equals(this.forceAddFlags, friendAddRequest.forceAddFlags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, addFriendItem, addType, forceAddFlags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendAddRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    addFriendItem: ").append(toIndentedString(addFriendItem)).append("\n");
    sb.append("    addType: ").append(toIndentedString(addType)).append("\n");
    sb.append("    forceAddFlags: ").append(toIndentedString(forceAddFlags)).append("\n");
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

}

