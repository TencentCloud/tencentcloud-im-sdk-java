
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
 * FriendCheckResponseAllOfInfoItem
 */
@JsonPropertyOrder({
  FriendCheckResponseAllOfInfoItem.JSON_PROPERTY_TO_ACCOUNT,
  FriendCheckResponseAllOfInfoItem.JSON_PROPERTY_RELATION,
  FriendCheckResponseAllOfInfoItem.JSON_PROPERTY_RESULT_CODE,
  FriendCheckResponseAllOfInfoItem.JSON_PROPERTY_RESULT_INFO
})
@JsonTypeName("FriendCheckResponse_allOf_InfoItem")

public class FriendCheckResponseAllOfInfoItem {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_RELATION = "Relation";
  private String relation;

  public static final String JSON_PROPERTY_RESULT_CODE = "ResultCode";
  private Integer resultCode;

  public static final String JSON_PROPERTY_RESULT_INFO = "ResultInfo";
  private String resultInfo;

  public FriendCheckResponseAllOfInfoItem() { 
  }

  public FriendCheckResponseAllOfInfoItem toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 请求校验的用户的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求校验的用户的 UserID")
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


  public FriendCheckResponseAllOfInfoItem relation(String relation) {
    
    this.relation = relation;
    return this;
  }

   /**
   * 校验成功时 To_Account 与 From_Account 之间的好友关系，详情可参见 校验好友（https://cloud.tencent.com/document/product/269/1501#.E6.A0.A1.E9.AA.8C.E5.A5.BD.E5.8F.8B）
   * @return relation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "校验成功时 To_Account 与 From_Account 之间的好友关系，详情可参见 校验好友（https://cloud.tencent.com/document/product/269/1501#.E6.A0.A1.E9.AA.8C.E5.A5.BD.E5.8F.8B）")
  @JsonProperty(JSON_PROPERTY_RELATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRelation() {
    return relation;
  }


  @JsonProperty(JSON_PROPERTY_RELATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelation(String relation) {
    this.relation = relation;
  }


  public FriendCheckResponseAllOfInfoItem resultCode(Integer resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * To_Account 的处理结果，0表示成功，非0表示失败，非0取值的详细描述请参见 错误码说明（https://cloud.tencent.com/document/product/269/1643#ErrorCode）
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To_Account 的处理结果，0表示成功，非0表示失败，非0取值的详细描述请参见 错误码说明（https://cloud.tencent.com/document/product/269/1643#ErrorCode）")
  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResultCode() {
    return resultCode;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultCode(Integer resultCode) {
    this.resultCode = resultCode;
  }


  public FriendCheckResponseAllOfInfoItem resultInfo(String resultInfo) {
    
    this.resultInfo = resultInfo;
    return this;
  }

   /**
   * To_Account 的错误描述信息，成功时该字段为空
   * @return resultInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To_Account 的错误描述信息，成功时该字段为空")
  @JsonProperty(JSON_PROPERTY_RESULT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResultInfo() {
    return resultInfo;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultInfo(String resultInfo) {
    this.resultInfo = resultInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendCheckResponseAllOfInfoItem friendCheckResponseAllOfInfoItem = (FriendCheckResponseAllOfInfoItem) o;
    return Objects.equals(this.toAccount, friendCheckResponseAllOfInfoItem.toAccount) &&
        Objects.equals(this.relation, friendCheckResponseAllOfInfoItem.relation) &&
        Objects.equals(this.resultCode, friendCheckResponseAllOfInfoItem.resultCode) &&
        Objects.equals(this.resultInfo, friendCheckResponseAllOfInfoItem.resultInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, relation, resultCode, resultInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendCheckResponseAllOfInfoItem {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
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

