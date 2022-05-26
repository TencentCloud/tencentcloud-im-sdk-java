
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
 * ImportGroupMemberResponseAllOfMemberList
 */
@JsonPropertyOrder({
  ImportGroupMemberResponseAllOfMemberList.JSON_PROPERTY_RESULT,
  ImportGroupMemberResponseAllOfMemberList.JSON_PROPERTY_MEMBER_ACCOUNT
})
@JsonTypeName("ImportGroupMemberResponse_allOf_MemberList")

public class ImportGroupMemberResponseAllOfMemberList {
  public static final String JSON_PROPERTY_RESULT = "Result";
  private Integer result;

  public static final String JSON_PROPERTY_MEMBER_ACCOUNT = "Member_Account";
  private String memberAccount;

  public ImportGroupMemberResponseAllOfMemberList() { 
  }

  public ImportGroupMemberResponseAllOfMemberList result(Integer result) {
    
    this.result = result;
    return this;
  }

   /**
   * 导入结果：0表示失败；1表示成功；2 表示已经是群成员
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "导入结果：0表示失败；1表示成功；2 表示已经是群成员")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(Integer result) {
    this.result = result;
  }


  public ImportGroupMemberResponseAllOfMemberList memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * 返回的群成员帐号
   * @return memberAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回的群成员帐号")
  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemberAccount() {
    return memberAccount;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupMemberResponseAllOfMemberList importGroupMemberResponseAllOfMemberList = (ImportGroupMemberResponseAllOfMemberList) o;
    return Objects.equals(this.result, importGroupMemberResponseAllOfMemberList.result) &&
        Objects.equals(this.memberAccount, importGroupMemberResponseAllOfMemberList.memberAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, memberAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMemberResponseAllOfMemberList {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
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

