
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
import tencentcloud.im.model.FriendImportRequestAddFriendItemInnerCustomItemInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * FriendImportRequestAddFriendItemInner
 */
@JsonPropertyOrder({
  FriendImportRequestAddFriendItemInner.JSON_PROPERTY_TO_ACCOUNT,
  FriendImportRequestAddFriendItemInner.JSON_PROPERTY_REMARK,
  FriendImportRequestAddFriendItemInner.JSON_PROPERTY_REMARK_TIME,
  FriendImportRequestAddFriendItemInner.JSON_PROPERTY_GROUP_NAME,
  FriendImportRequestAddFriendItemInner.JSON_PROPERTY_ADD_SOURCE,
  FriendImportRequestAddFriendItemInner.JSON_PROPERTY_ADD_WORDING,
  FriendImportRequestAddFriendItemInner.JSON_PROPERTY_ADD_TIME,
  FriendImportRequestAddFriendItemInner.JSON_PROPERTY_CUSTOM_ITEM
})
@JsonTypeName("FriendImportRequest_AddFriendItem_inner")

public class FriendImportRequestAddFriendItemInner {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_REMARK = "Remark";
  private String remark;

  public static final String JSON_PROPERTY_REMARK_TIME = "RemarkTime";
  private Integer remarkTime;

  public static final String JSON_PROPERTY_GROUP_NAME = "GroupName";
  private List<String> groupName = null;

  public static final String JSON_PROPERTY_ADD_SOURCE = "AddSource";
  private String addSource;

  public static final String JSON_PROPERTY_ADD_WORDING = "AddWording";
  private String addWording;

  public static final String JSON_PROPERTY_ADD_TIME = "AddTime";
  private Integer addTime;

  public static final String JSON_PROPERTY_CUSTOM_ITEM = "CustomItem";
  private List<FriendImportRequestAddFriendItemInnerCustomItemInner> customItem = null;

  public FriendImportRequestAddFriendItemInner() { 
  }

  public FriendImportRequestAddFriendItemInner toAccount(String toAccount) {
    
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


  public FriendImportRequestAddFriendItemInner remark(String remark) {
    
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


  public FriendImportRequestAddFriendItemInner remarkTime(Integer remarkTime) {
    
    this.remarkTime = remarkTime;
    return this;
  }

   /**
   * From_Account 对 To_Account 的好友备注时间
   * @return remarkTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From_Account 对 To_Account 的好友备注时间")
  @JsonProperty(JSON_PROPERTY_REMARK_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRemarkTime() {
    return remarkTime;
  }


  @JsonProperty(JSON_PROPERTY_REMARK_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemarkTime(Integer remarkTime) {
    this.remarkTime = remarkTime;
  }


  public FriendImportRequestAddFriendItemInner groupName(List<String> groupName) {
    
    this.groupName = groupName;
    return this;
  }

  public FriendImportRequestAddFriendItemInner addGroupNameItem(String groupNameItem) {
    if (this.groupName == null) {
      this.groupName = new ArrayList<>();
    }
    this.groupName.add(groupNameItem);
    return this;
  }

   /**
   * From_Account 对 To_Account 的分组信息，详情可参见 标配好友字段(https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5)
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From_Account 对 To_Account 的分组信息，详情可参见 标配好友字段(https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5)")
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getGroupName() {
    return groupName;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupName(List<String> groupName) {
    this.groupName = groupName;
  }


  public FriendImportRequestAddFriendItemInner addSource(String addSource) {
    
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


  public FriendImportRequestAddFriendItemInner addWording(String addWording) {
    
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


  public FriendImportRequestAddFriendItemInner addTime(Integer addTime) {
    
    this.addTime = addTime;
    return this;
  }

   /**
   * From_Account 和 To_Account 形成好友关系的时间
   * @return addTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From_Account 和 To_Account 形成好友关系的时间")
  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAddTime() {
    return addTime;
  }


  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddTime(Integer addTime) {
    this.addTime = addTime;
  }


  public FriendImportRequestAddFriendItemInner customItem(List<FriendImportRequestAddFriendItemInnerCustomItemInner> customItem) {
    
    this.customItem = customItem;
    return this;
  }

  public FriendImportRequestAddFriendItemInner addCustomItemItem(FriendImportRequestAddFriendItemInnerCustomItemInner customItemItem) {
    if (this.customItem == null) {
      this.customItem = new ArrayList<>();
    }
    this.customItem.add(customItemItem);
    return this;
  }

   /**
   * From_Account 对 To_Account 的自定义好友数据，每一个成员都包含一个 Tag 字段和一个 Value 字段，详情可参见 自定义好友字段（https://cloud.tencent.com/document/product/269/1501#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）
   * @return customItem
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "From_Account 对 To_Account 的自定义好友数据，每一个成员都包含一个 Tag 字段和一个 Value 字段，详情可参见 自定义好友字段（https://cloud.tencent.com/document/product/269/1501#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）")
  @JsonProperty(JSON_PROPERTY_CUSTOM_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FriendImportRequestAddFriendItemInnerCustomItemInner> getCustomItem() {
    return customItem;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomItem(List<FriendImportRequestAddFriendItemInnerCustomItemInner> customItem) {
    this.customItem = customItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendImportRequestAddFriendItemInner friendImportRequestAddFriendItemInner = (FriendImportRequestAddFriendItemInner) o;
    return Objects.equals(this.toAccount, friendImportRequestAddFriendItemInner.toAccount) &&
        Objects.equals(this.remark, friendImportRequestAddFriendItemInner.remark) &&
        Objects.equals(this.remarkTime, friendImportRequestAddFriendItemInner.remarkTime) &&
        Objects.equals(this.groupName, friendImportRequestAddFriendItemInner.groupName) &&
        Objects.equals(this.addSource, friendImportRequestAddFriendItemInner.addSource) &&
        Objects.equals(this.addWording, friendImportRequestAddFriendItemInner.addWording) &&
        Objects.equals(this.addTime, friendImportRequestAddFriendItemInner.addTime) &&
        Objects.equals(this.customItem, friendImportRequestAddFriendItemInner.customItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, remark, remarkTime, groupName, addSource, addWording, addTime, customItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendImportRequestAddFriendItemInner {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    remarkTime: ").append(toIndentedString(remarkTime)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    addSource: ").append(toIndentedString(addSource)).append("\n");
    sb.append("    addWording: ").append(toIndentedString(addWording)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("    customItem: ").append(toIndentedString(customItem)).append("\n");
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

