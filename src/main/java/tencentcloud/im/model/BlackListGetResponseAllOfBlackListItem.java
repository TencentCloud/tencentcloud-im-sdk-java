
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
 * BlackListGetResponseAllOfBlackListItem
 */
@JsonPropertyOrder({
  BlackListGetResponseAllOfBlackListItem.JSON_PROPERTY_TO_ACCOUNT,
  BlackListGetResponseAllOfBlackListItem.JSON_PROPERTY_ADD_BLACK_TIME_STAMP
})
@JsonTypeName("BlackListGetResponse_allOf_BlackListItem")

public class BlackListGetResponseAllOfBlackListItem {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_ADD_BLACK_TIME_STAMP = "AddBlackTimeStamp";
  private Integer addBlackTimeStamp;

  public BlackListGetResponseAllOfBlackListItem() { 
  }

  public BlackListGetResponseAllOfBlackListItem toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 黑名单的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "黑名单的 UserID")
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


  public BlackListGetResponseAllOfBlackListItem addBlackTimeStamp(Integer addBlackTimeStamp) {
    
    this.addBlackTimeStamp = addBlackTimeStamp;
    return this;
  }

   /**
   * 添加黑名单的时间
   * @return addBlackTimeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "添加黑名单的时间")
  @JsonProperty(JSON_PROPERTY_ADD_BLACK_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAddBlackTimeStamp() {
    return addBlackTimeStamp;
  }


  @JsonProperty(JSON_PROPERTY_ADD_BLACK_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddBlackTimeStamp(Integer addBlackTimeStamp) {
    this.addBlackTimeStamp = addBlackTimeStamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlackListGetResponseAllOfBlackListItem blackListGetResponseAllOfBlackListItem = (BlackListGetResponseAllOfBlackListItem) o;
    return Objects.equals(this.toAccount, blackListGetResponseAllOfBlackListItem.toAccount) &&
        Objects.equals(this.addBlackTimeStamp, blackListGetResponseAllOfBlackListItem.addBlackTimeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, addBlackTimeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlackListGetResponseAllOfBlackListItem {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    addBlackTimeStamp: ").append(toIndentedString(addBlackTimeStamp)).append("\n");
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

