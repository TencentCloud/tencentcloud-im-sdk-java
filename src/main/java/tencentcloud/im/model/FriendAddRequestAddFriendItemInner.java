
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
 * FriendAddRequestAddFriendItemInner
 */
@JsonPropertyOrder({
  FriendAddRequestAddFriendItemInner.JSON_PROPERTY_TO_ACCOUNT,
  FriendAddRequestAddFriendItemInner.JSON_PROPERTY_REMARK,
  FriendAddRequestAddFriendItemInner.JSON_PROPERTY_GROUP_NAME,
  FriendAddRequestAddFriendItemInner.JSON_PROPERTY_ADD_SOURCE,
  FriendAddRequestAddFriendItemInner.JSON_PROPERTY_ADD_WORDING
})
@JsonTypeName("FriendAddRequest_AddFriendItem_inner")

public class FriendAddRequestAddFriendItemInner {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_REMARK = "Remark";
  private String remark;

  public static final String JSON_PROPERTY_GROUP_NAME = "GroupName";
  private String groupName;

  public static final String JSON_PROPERTY_ADD_SOURCE = "AddSource";
  private String addSource;

  public static final String JSON_PROPERTY_ADD_WORDING = "AddWording";
  private String addWording;

  public FriendAddRequestAddFriendItemInner() { 
  }

  public FriendAddRequestAddFriendItemInner toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 好友的 UserID
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "好友的 UserID")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public FriendAddRequestAddFriendItemInner remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * From_Account 对 To_Account 的好友备注，详情可参见 标配好友字段(https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5)
   * @return remark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From_Account 对 To_Account 的好友备注，详情可参见 标配好友字段(https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5)")
  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(String remark) {
    this.remark = remark;
  }


  public FriendAddRequestAddFriendItemInner groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * From_Account 对 To_Account 的分组信息，添加好友时只允许设置一个分组，因此使用 String 类型即可，详情可参见 标配好友字段（https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From_Account 对 To_Account 的分组信息，添加好友时只允许设置一个分组，因此使用 String 类型即可，详情可参见 标配好友字段（https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）")
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupName() {
    return groupName;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public FriendAddRequestAddFriendItemInner addSource(String addSource) {
    
    this.addSource = addSource;
    return this;
  }

   /**
   * 加好友来源字段，详情可参见 标配好友字段（https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）
   * @return addSource
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "加好友来源字段，详情可参见 标配好友字段（https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）")
  @JsonProperty(JSON_PROPERTY_ADD_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddSource() {
    return addSource;
  }


  @JsonProperty(JSON_PROPERTY_ADD_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddSource(String addSource) {
    this.addSource = addSource;
  }


  public FriendAddRequestAddFriendItemInner addWording(String addWording) {
    
    this.addWording = addWording;
    return this;
  }

   /**
   * From_Account 和 To_Account 形成好友关系时的附言信息，详情可参见 标配好友字段（标配好友字段）
   * @return addWording
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From_Account 和 To_Account 形成好友关系时的附言信息，详情可参见 标配好友字段（标配好友字段）")
  @JsonProperty(JSON_PROPERTY_ADD_WORDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddWording() {
    return addWording;
  }


  @JsonProperty(JSON_PROPERTY_ADD_WORDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddWording(String addWording) {
    this.addWording = addWording;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendAddRequestAddFriendItemInner friendAddRequestAddFriendItemInner = (FriendAddRequestAddFriendItemInner) o;
    return Objects.equals(this.toAccount, friendAddRequestAddFriendItemInner.toAccount) &&
        Objects.equals(this.remark, friendAddRequestAddFriendItemInner.remark) &&
        Objects.equals(this.groupName, friendAddRequestAddFriendItemInner.groupName) &&
        Objects.equals(this.addSource, friendAddRequestAddFriendItemInner.addSource) &&
        Objects.equals(this.addWording, friendAddRequestAddFriendItemInner.addWording);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, remark, groupName, addSource, addWording);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendAddRequestAddFriendItemInner {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    addSource: ").append(toIndentedString(addSource)).append("\n");
    sb.append("    addWording: ").append(toIndentedString(addWording)).append("\n");
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

