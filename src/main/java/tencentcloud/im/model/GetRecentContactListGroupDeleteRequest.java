
package tencentcloud.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetRecentContactListGroupDeleteRequest
 */
@JsonPropertyOrder({
  GetRecentContactListGroupDeleteRequest.JSON_PROPERTY_FROM_ACCOUNT,
  GetRecentContactListGroupDeleteRequest.JSON_PROPERTY_TYPE,
  GetRecentContactListGroupDeleteRequest.JSON_PROPERTY_TO_ACCOUNT,
  GetRecentContactListGroupDeleteRequest.JSON_PROPERTY_TO_GROUPID,
  GetRecentContactListGroupDeleteRequest.JSON_PROPERTY_CLEAR_RAMBLE
})

public class GetRecentContactListGroupDeleteRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  /**
   * 会话类型：1 表示 C2C 会话；2 表示 G2C 会话
   */
  public enum TypeEnum {
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    TypeEnum(Integer value) {
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
    public static TypeEnum fromValue(Integer value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "Type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_TO_GROUPID = "ToGroupid";
  private String toGroupid;

  /**
   * 是否清理漫游消息：1 表示清理漫游消息；0 表示不清理漫游消息
   */
  public enum ClearRambleEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    ClearRambleEnum(Integer value) {
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
    public static ClearRambleEnum fromValue(Integer value) {
      for (ClearRambleEnum b : ClearRambleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CLEAR_RAMBLE = "ClearRamble";
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
  @NotNull
  @ApiModelProperty(required = true, value = "请求删除该 UserID 的会话")
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


  public GetRecentContactListGroupDeleteRequest type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * 会话类型：1 表示 C2C 会话；2 表示 G2C 会话
   * @return type
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "会话类型：1 表示 C2C 会话；2 表示 G2C 会话")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_TO_GROUPID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToGroupid() {
    return toGroupid;
  }


  @JsonProperty(JSON_PROPERTY_TO_GROUPID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_CLEAR_RAMBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ClearRambleEnum getClearRamble() {
    return clearRamble;
  }


  @JsonProperty(JSON_PROPERTY_CLEAR_RAMBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

}

