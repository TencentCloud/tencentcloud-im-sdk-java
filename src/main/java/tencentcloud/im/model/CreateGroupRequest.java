
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
import tencentcloud.im.model.CreateGroupRequestMemberListInner;
import tencentcloud.im.model.DefinedData;
import tencentcloud.im.model.GroupType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * CreateGroupRequest
 */
@JsonPropertyOrder({
  CreateGroupRequest.JSON_PROPERTY_OWNER_ACCOUNT,
  CreateGroupRequest.JSON_PROPERTY_TYPE,
  CreateGroupRequest.JSON_PROPERTY_GROUP_ID,
  CreateGroupRequest.JSON_PROPERTY_NAME,
  CreateGroupRequest.JSON_PROPERTY_INTRODUCTION,
  CreateGroupRequest.JSON_PROPERTY_NOTIFICATION,
  CreateGroupRequest.JSON_PROPERTY_FACE_URL,
  CreateGroupRequest.JSON_PROPERTY_MAX_MEMBER_COUNT,
  CreateGroupRequest.JSON_PROPERTY_APPLY_JOIN_OPTION,
  CreateGroupRequest.JSON_PROPERTY_APP_DEFINED_DATA,
  CreateGroupRequest.JSON_PROPERTY_MEMBER_LIST
})

public class CreateGroupRequest {
  public static final String JSON_PROPERTY_OWNER_ACCOUNT = "Owner_Account";
  private String ownerAccount;

  public static final String JSON_PROPERTY_TYPE = "Type";
  private GroupType type;

  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_INTRODUCTION = "Introduction";
  private String introduction;

  public static final String JSON_PROPERTY_NOTIFICATION = "Notification";
  private String notification;

  public static final String JSON_PROPERTY_FACE_URL = "FaceUrl";
  private String faceUrl;

  public static final String JSON_PROPERTY_MAX_MEMBER_COUNT = "MaxMemberCount";
  private Integer maxMemberCount;

  /**
   * 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群），不填默认为 NeedPermission（需要验证） 仅当创建支持申请加群的 群组(https://cloud.tencent.com/document/product/269/1502#.E5.8A.A0.E7.BE.A4.E6.96.B9.E5.BC.8F.E5.B7.AE.E5.BC.82) 时，该字段有效
   */
  public enum ApplyJoinOptionEnum {
    FREEACCESS("FreeAccess"),
    
    NEEDPERMISSION("NeedPermission"),
    
    DISABLEAPPLY("DisableApply");

    private String value;

    ApplyJoinOptionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApplyJoinOptionEnum fromValue(String value) {
      for (ApplyJoinOptionEnum b : ApplyJoinOptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_APPLY_JOIN_OPTION = "ApplyJoinOption";
  private ApplyJoinOptionEnum applyJoinOption;

  public static final String JSON_PROPERTY_APP_DEFINED_DATA = "AppDefinedData";
  private List<DefinedData> appDefinedData = null;

  public static final String JSON_PROPERTY_MEMBER_LIST = "MemberList";
  private List<CreateGroupRequestMemberListInner> memberList = null;

  public CreateGroupRequest() { 
  }

  public CreateGroupRequest ownerAccount(String ownerAccount) {
    
    this.ownerAccount = ownerAccount;
    return this;
  }

   /**
   * 群主 ID（需是 已导入(https://cloud.tencent.com/document/product/269/1608))的帐号）。填写后自动添加到群成员中；如果不填，群没有群主
   * @return ownerAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群主 ID（需是 已导入(https://cloud.tencent.com/document/product/269/1608))的帐号）。填写后自动添加到群成员中；如果不填，群没有群主")
  @JsonProperty(JSON_PROPERTY_OWNER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwnerAccount() {
    return ownerAccount;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerAccount(String ownerAccount) {
    this.ownerAccount = ownerAccount;
  }


  public CreateGroupRequest type(GroupType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GroupType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(GroupType type) {
    this.type = type;
  }


  public CreateGroupRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 为了使得群组 ID 更加简单，便于记忆传播，腾讯云支持 App 在通过 REST API 创建群组时 自定义群组 ID(https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E7.BE.A4.E7.BB.84-id)
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "为了使得群组 ID 更加简单，便于记忆传播，腾讯云支持 App 在通过 REST API 创建群组时 自定义群组 ID(https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E7.BE.A4.E7.BB.84-id)")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public CreateGroupRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 群名称，最长30字节，使用 UTF-8 编码，1个汉字占3个字节
   * @return name
  **/
  @javax.annotation.Nonnull
  @NotNull
 @Size(max=30)  @ApiModelProperty(required = true, value = "群名称，最长30字节，使用 UTF-8 编码，1个汉字占3个字节")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateGroupRequest introduction(String introduction) {
    
    this.introduction = introduction;
    return this;
  }

   /**
   * 群简介，最长240字节，使用 UTF-8 编码，1个汉字占3个字节
   * @return introduction
  **/
  @javax.annotation.Nullable
 @Size(max=240)  @ApiModelProperty(value = "群简介，最长240字节，使用 UTF-8 编码，1个汉字占3个字节")
  @JsonProperty(JSON_PROPERTY_INTRODUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntroduction() {
    return introduction;
  }


  @JsonProperty(JSON_PROPERTY_INTRODUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public CreateGroupRequest notification(String notification) {
    
    this.notification = notification;
    return this;
  }

   /**
   * 群公告，最长300字节，使用 UTF-8 编码，1个汉字占3个字节
   * @return notification
  **/
  @javax.annotation.Nullable
 @Size(max=300)  @ApiModelProperty(value = "群公告，最长300字节，使用 UTF-8 编码，1个汉字占3个字节")
  @JsonProperty(JSON_PROPERTY_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotification() {
    return notification;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotification(String notification) {
    this.notification = notification;
  }


  public CreateGroupRequest faceUrl(String faceUrl) {
    
    this.faceUrl = faceUrl;
    return this;
  }

   /**
   * 群头像 URL，最长100字节
   * @return faceUrl
  **/
  @javax.annotation.Nullable
 @Size(max=100)  @ApiModelProperty(value = "群头像 URL，最长100字节")
  @JsonProperty(JSON_PROPERTY_FACE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFaceUrl() {
    return faceUrl;
  }


  @JsonProperty(JSON_PROPERTY_FACE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFaceUrl(String faceUrl) {
    this.faceUrl = faceUrl;
  }


  public CreateGroupRequest maxMemberCount(Integer maxMemberCount) {
    
    this.maxMemberCount = maxMemberCount;
    return this;
  }

   /**
   * 最大群成员数量，缺省时的默认值：付费套餐包上限，例如体验版是20，如果升级套餐包，需按照修改群基础资料修改这个字段
   * @return maxMemberCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "最大群成员数量，缺省时的默认值：付费套餐包上限，例如体验版是20，如果升级套餐包，需按照修改群基础资料修改这个字段")
  @JsonProperty(JSON_PROPERTY_MAX_MEMBER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxMemberCount() {
    return maxMemberCount;
  }


  @JsonProperty(JSON_PROPERTY_MAX_MEMBER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxMemberCount(Integer maxMemberCount) {
    this.maxMemberCount = maxMemberCount;
  }


  public CreateGroupRequest applyJoinOption(ApplyJoinOptionEnum applyJoinOption) {
    
    this.applyJoinOption = applyJoinOption;
    return this;
  }

   /**
   * 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群），不填默认为 NeedPermission（需要验证） 仅当创建支持申请加群的 群组(https://cloud.tencent.com/document/product/269/1502#.E5.8A.A0.E7.BE.A4.E6.96.B9.E5.BC.8F.E5.B7.AE.E5.BC.82) 时，该字段有效
   * @return applyJoinOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群），不填默认为 NeedPermission（需要验证） 仅当创建支持申请加群的 群组(https://cloud.tencent.com/document/product/269/1502#.E5.8A.A0.E7.BE.A4.E6.96.B9.E5.BC.8F.E5.B7.AE.E5.BC.82) 时，该字段有效")
  @JsonProperty(JSON_PROPERTY_APPLY_JOIN_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApplyJoinOptionEnum getApplyJoinOption() {
    return applyJoinOption;
  }


  @JsonProperty(JSON_PROPERTY_APPLY_JOIN_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplyJoinOption(ApplyJoinOptionEnum applyJoinOption) {
    this.applyJoinOption = applyJoinOption;
  }


  public CreateGroupRequest appDefinedData(List<DefinedData> appDefinedData) {
    
    this.appDefinedData = appDefinedData;
    return this;
  }

  public CreateGroupRequest addAppDefinedDataItem(DefinedData appDefinedDataItem) {
    if (this.appDefinedData == null) {
      this.appDefinedData = new ArrayList<>();
    }
    this.appDefinedData.add(appDefinedDataItem);
    return this;
  }

   /**
   * Get appDefinedData
   * @return appDefinedData
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_DEFINED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DefinedData> getAppDefinedData() {
    return appDefinedData;
  }


  @JsonProperty(JSON_PROPERTY_APP_DEFINED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppDefinedData(List<DefinedData> appDefinedData) {
    this.appDefinedData = appDefinedData;
  }


  public CreateGroupRequest memberList(List<CreateGroupRequestMemberListInner> memberList) {
    
    this.memberList = memberList;
    return this;
  }

  public CreateGroupRequest addMemberListItem(CreateGroupRequestMemberListInner memberListItem) {
    if (this.memberList == null) {
      this.memberList = new ArrayList<>();
    }
    this.memberList.add(memberListItem);
    return this;
  }

   /**
   * 群组维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台(https://console.cloud.tencent.com/im) 进行配置，详情请参阅 自定义字段(https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5)
   * @return memberList
  **/
  @javax.annotation.Nullable
  @Valid
 @Size(max=100)  @ApiModelProperty(value = "群组维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台(https://console.cloud.tencent.com/im) 进行配置，详情请参阅 自定义字段(https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5)")
  @JsonProperty(JSON_PROPERTY_MEMBER_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreateGroupRequestMemberListInner> getMemberList() {
    return memberList;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberList(List<CreateGroupRequestMemberListInner> memberList) {
    this.memberList = memberList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupRequest createGroupRequest = (CreateGroupRequest) o;
    return Objects.equals(this.ownerAccount, createGroupRequest.ownerAccount) &&
        Objects.equals(this.type, createGroupRequest.type) &&
        Objects.equals(this.groupId, createGroupRequest.groupId) &&
        Objects.equals(this.name, createGroupRequest.name) &&
        Objects.equals(this.introduction, createGroupRequest.introduction) &&
        Objects.equals(this.notification, createGroupRequest.notification) &&
        Objects.equals(this.faceUrl, createGroupRequest.faceUrl) &&
        Objects.equals(this.maxMemberCount, createGroupRequest.maxMemberCount) &&
        Objects.equals(this.applyJoinOption, createGroupRequest.applyJoinOption) &&
        Objects.equals(this.appDefinedData, createGroupRequest.appDefinedData) &&
        Objects.equals(this.memberList, createGroupRequest.memberList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerAccount, type, groupId, name, introduction, notification, faceUrl, maxMemberCount, applyJoinOption, appDefinedData, memberList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupRequest {\n");
    sb.append("    ownerAccount: ").append(toIndentedString(ownerAccount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    faceUrl: ").append(toIndentedString(faceUrl)).append("\n");
    sb.append("    maxMemberCount: ").append(toIndentedString(maxMemberCount)).append("\n");
    sb.append("    applyJoinOption: ").append(toIndentedString(applyJoinOption)).append("\n");
    sb.append("    appDefinedData: ").append(toIndentedString(appDefinedData)).append("\n");
    sb.append("    memberList: ").append(toIndentedString(memberList)).append("\n");
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

