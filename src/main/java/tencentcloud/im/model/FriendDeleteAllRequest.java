
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
 * FriendDeleteAllRequest
 */
@JsonPropertyOrder({
  FriendDeleteAllRequest.JSON_PROPERTY_FROM_ACCOUNT,
  FriendDeleteAllRequest.JSON_PROPERTY_DELETE_TYPE
})

public class FriendDeleteAllRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_DELETE_TYPE = "DeleteType";
  private String deleteType;

  public FriendDeleteAllRequest() { 
  }

  public FriendDeleteAllRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 指定要清除好友数据的用户的 UserID
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "指定要清除好友数据的用户的 UserID")
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


  public FriendDeleteAllRequest deleteType(String deleteType) {
    
    this.deleteType = deleteType;
    return this;
  }

   /**
   * 删除模式，默认删除单向好友，详情可参见 删除好友（https://cloud.tencent.com/document/product/269/1501#.E5.88.A0.E9.99.A4.E5.A5.BD.E5.8F.8B）
   * @return deleteType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "删除模式，默认删除单向好友，详情可参见 删除好友（https://cloud.tencent.com/document/product/269/1501#.E5.88.A0.E9.99.A4.E5.A5.BD.E5.8F.8B）")
  @JsonProperty(JSON_PROPERTY_DELETE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeleteType() {
    return deleteType;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteType(String deleteType) {
    this.deleteType = deleteType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendDeleteAllRequest friendDeleteAllRequest = (FriendDeleteAllRequest) o;
    return Objects.equals(this.fromAccount, friendDeleteAllRequest.fromAccount) &&
        Objects.equals(this.deleteType, friendDeleteAllRequest.deleteType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, deleteType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendDeleteAllRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    deleteType: ").append(toIndentedString(deleteType)).append("\n");
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

