
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * FriendGetListRequest
 */
@JsonPropertyOrder({
  FriendGetListRequest.JSON_PROPERTY_FROM_ACCOUNT,
  FriendGetListRequest.JSON_PROPERTY_TO_ACCOUNT,
  FriendGetListRequest.JSON_PROPERTY_TAG_LIST
})

public class FriendGetListRequest {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "From_Account";
  private String fromAccount;

  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private List<String> toAccount = new ArrayList<>();

  public static final String JSON_PROPERTY_TAG_LIST = "TagList";
  private List<String> tagList = new ArrayList<>();

  public FriendGetListRequest() { 
  }

  public FriendGetListRequest fromAccount(String fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * 指定要拉取好友数据的用户的 UserID
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "指定要拉取好友数据的用户的 UserID")
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


  public FriendGetListRequest toAccount(List<String> toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

  public FriendGetListRequest addToAccountItem(String toAccountItem) {
    this.toAccount.add(toAccountItem);
    return this;
  }

   /**
   * 好友的 UserID 列表 建议每次请求的好友数不超过100，避免因数据量太大导致回包失败
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "好友的 UserID 列表 建议每次请求的好友数不超过100，避免因数据量太大导致回包失败")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToAccount(List<String> toAccount) {
    this.toAccount = toAccount;
  }


  public FriendGetListRequest tagList(List<String> tagList) {
    
    this.tagList = tagList;
    return this;
  }

  public FriendGetListRequest addTagListItem(String tagListItem) {
    this.tagList.add(tagListItem);
    return this;
  }

   /**
   * 指定要拉取的资料字段及好友字段：标配资料字段（https://cloud.tencent.com/document/product/269/1500#.E6.A0.87.E9.85.8D.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5）、自定义资料字段（https://cloud.tencent.com/document/product/269/1500#.E8.87.AA.E5.AE.9A.E4.B9.89.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5）、标配好友字段（https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）、自定义好友字段（https://cloud.tencent.com/document/product/269/1501#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）
   * @return tagList
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "指定要拉取的资料字段及好友字段：标配资料字段（https://cloud.tencent.com/document/product/269/1500#.E6.A0.87.E9.85.8D.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5）、自定义资料字段（https://cloud.tencent.com/document/product/269/1500#.E8.87.AA.E5.AE.9A.E4.B9.89.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5）、标配好友字段（https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）、自定义好友字段（https://cloud.tencent.com/document/product/269/1501#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）")
  @JsonProperty(JSON_PROPERTY_TAG_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getTagList() {
    return tagList;
  }


  @JsonProperty(JSON_PROPERTY_TAG_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTagList(List<String> tagList) {
    this.tagList = tagList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendGetListRequest friendGetListRequest = (FriendGetListRequest) o;
    return Objects.equals(this.fromAccount, friendGetListRequest.fromAccount) &&
        Objects.equals(this.toAccount, friendGetListRequest.toAccount) &&
        Objects.equals(this.tagList, friendGetListRequest.tagList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, toAccount, tagList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendGetListRequest {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
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

