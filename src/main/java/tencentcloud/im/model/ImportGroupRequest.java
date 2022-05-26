
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
import tencentcloud.im.model.DefinedData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ImportGroupRequest
 */
@JsonPropertyOrder({
  ImportGroupRequest.JSON_PROPERTY_OWNER_ACCOUNT,
  ImportGroupRequest.JSON_PROPERTY_TYPE,
  ImportGroupRequest.JSON_PROPERTY_GROUP_ID,
  ImportGroupRequest.JSON_PROPERTY_NAME,
  ImportGroupRequest.JSON_PROPERTY_INTRODUCTION,
  ImportGroupRequest.JSON_PROPERTY_NOTIFICATION,
  ImportGroupRequest.JSON_PROPERTY_FACE_URL,
  ImportGroupRequest.JSON_PROPERTY_MAX_MEMBER_COUNT,
  ImportGroupRequest.JSON_PROPERTY_APPLY_JOIN_OPTION,
  ImportGroupRequest.JSON_PROPERTY_APP_DEFINED_DATA,
  ImportGroupRequest.JSON_PROPERTY_CREATE_TIME
})

public class ImportGroupRequest {
  public static final String JSON_PROPERTY_OWNER_ACCOUNT = "Owner_Account";
  private String ownerAccount;

  public static final String JSON_PROPERTY_TYPE = "Type";
  private String type;

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
   * 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群），不填默认为NeedPermission（需要验证）
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

  public static final String JSON_PROPERTY_CREATE_TIME = "CreateTime";
  private Integer createTime;

  public ImportGroupRequest() { 
  }

  public ImportGroupRequest ownerAccount(String ownerAccount) {
    
    this.ownerAccount = ownerAccount;
    return this;
  }

   /**
   * 群主 ID，自动添加到群成员中。如果不填，群没有群主
   * @return ownerAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群主 ID，自动添加到群成员中。如果不填，群没有群主")
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


  public ImportGroupRequest type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 群组类型，包括 Public（陌生人社交群），Private（同新版本中的Work，好友工作群）， ChatRoom（同新版本中的Meeting，会议群）、Community（社群）
   * @return type
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "群组类型，包括 Public（陌生人社交群），Private（同新版本中的Work，好友工作群）， ChatRoom（同新版本中的Meeting，会议群）、Community（社群）")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public ImportGroupRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 为了使得群组 ID 更加简单，便于记忆传播，腾讯云支持 App 在通过 REST API 创建群组时自定义群组 ID。详细请参阅 群组系统（https://cloud.tencent.com/document/product/269/1502）
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "为了使得群组 ID 更加简单，便于记忆传播，腾讯云支持 App 在通过 REST API 创建群组时自定义群组 ID。详细请参阅 群组系统（https://cloud.tencent.com/document/product/269/1502）")
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


  public ImportGroupRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 群名称，最长30字节
   * @return name
  **/
  @javax.annotation.Nonnull
  @NotNull
 @Size(max=30)  @ApiModelProperty(required = true, value = "群名称，最长30字节")
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


  public ImportGroupRequest introduction(String introduction) {
    
    this.introduction = introduction;
    return this;
  }

   /**
   * 群简介，最长240字节
   * @return introduction
  **/
  @javax.annotation.Nullable
 @Size(max=240)  @ApiModelProperty(value = "群简介，最长240字节")
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


  public ImportGroupRequest notification(String notification) {
    
    this.notification = notification;
    return this;
  }

   /**
   * 群公告，最长300字节
   * @return notification
  **/
  @javax.annotation.Nullable
 @Size(max=300)  @ApiModelProperty(value = "群公告，最长300字节")
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


  public ImportGroupRequest faceUrl(String faceUrl) {
    
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


  public ImportGroupRequest maxMemberCount(Integer maxMemberCount) {
    
    this.maxMemberCount = maxMemberCount;
    return this;
  }

   /**
   * 最大群成员数量，最大为6000，不填默认为2000个
   * maximum: 6000
   * @return maxMemberCount
  **/
  @javax.annotation.Nullable
 @Max(6000)  @ApiModelProperty(value = "最大群成员数量，最大为6000，不填默认为2000个")
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


  public ImportGroupRequest applyJoinOption(ApplyJoinOptionEnum applyJoinOption) {
    
    this.applyJoinOption = applyJoinOption;
    return this;
  }

   /**
   * 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群），不填默认为NeedPermission（需要验证）
   * @return applyJoinOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群），不填默认为NeedPermission（需要验证）")
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


  public ImportGroupRequest appDefinedData(List<DefinedData> appDefinedData) {
    
    this.appDefinedData = appDefinedData;
    return this;
  }

  public ImportGroupRequest addAppDefinedDataItem(DefinedData appDefinedDataItem) {
    if (this.appDefinedData == null) {
      this.appDefinedData = new ArrayList<>();
    }
    this.appDefinedData.add(appDefinedDataItem);
    return this;
  }

   /**
   * 群组维度的自定义字段，默认情况是没有的，需要开通，详细请参阅 群组系统(https://cloud.tencent.com/document/product/269/1502)
   * @return appDefinedData
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "群组维度的自定义字段，默认情况是没有的，需要开通，详细请参阅 群组系统(https://cloud.tencent.com/document/product/269/1502)")
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


  public ImportGroupRequest createTime(Integer createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 群组的创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群组的创建时间")
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreateTime() {
    return createTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupRequest importGroupRequest = (ImportGroupRequest) o;
    return Objects.equals(this.ownerAccount, importGroupRequest.ownerAccount) &&
        Objects.equals(this.type, importGroupRequest.type) &&
        Objects.equals(this.groupId, importGroupRequest.groupId) &&
        Objects.equals(this.name, importGroupRequest.name) &&
        Objects.equals(this.introduction, importGroupRequest.introduction) &&
        Objects.equals(this.notification, importGroupRequest.notification) &&
        Objects.equals(this.faceUrl, importGroupRequest.faceUrl) &&
        Objects.equals(this.maxMemberCount, importGroupRequest.maxMemberCount) &&
        Objects.equals(this.applyJoinOption, importGroupRequest.applyJoinOption) &&
        Objects.equals(this.appDefinedData, importGroupRequest.appDefinedData) &&
        Objects.equals(this.createTime, importGroupRequest.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerAccount, type, groupId, name, introduction, notification, faceUrl, maxMemberCount, applyJoinOption, appDefinedData, createTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupRequest {\n");
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
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

