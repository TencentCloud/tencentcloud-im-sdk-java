
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
import tencentcloud.im.model.ModifyGroupMemberInfoRequestAppMemberDefinedDataInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ModifyGroupMemberInfoRequest
 */
@JsonPropertyOrder({
  ModifyGroupMemberInfoRequest.JSON_PROPERTY_GROUP_ID,
  ModifyGroupMemberInfoRequest.JSON_PROPERTY_MEMBER_ACCOUNT,
  ModifyGroupMemberInfoRequest.JSON_PROPERTY_ROLE,
  ModifyGroupMemberInfoRequest.JSON_PROPERTY_MSG_FLAG,
  ModifyGroupMemberInfoRequest.JSON_PROPERTY_NAME_CARD,
  ModifyGroupMemberInfoRequest.JSON_PROPERTY_APP_MEMBER_DEFINED_DATA,
  ModifyGroupMemberInfoRequest.JSON_PROPERTY_SHUT_UP_TIME
})

public class ModifyGroupMemberInfoRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public static final String JSON_PROPERTY_MEMBER_ACCOUNT = "Member_Account";
  private String memberAccount;

  public static final String JSON_PROPERTY_ROLE = "Role";
  private String role;

  public static final String JSON_PROPERTY_MSG_FLAG = "MsgFlag";
  private String msgFlag;

  public static final String JSON_PROPERTY_NAME_CARD = "NameCard";
  private String nameCard;

  public static final String JSON_PROPERTY_APP_MEMBER_DEFINED_DATA = "AppMemberDefinedData";
  private List<ModifyGroupMemberInfoRequestAppMemberDefinedDataInner> appMemberDefinedData = null;

  public static final String JSON_PROPERTY_SHUT_UP_TIME = "ShutUpTime";
  private Integer shutUpTime;

  public ModifyGroupMemberInfoRequest() { 
  }

  public ModifyGroupMemberInfoRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 操作的群 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "操作的群 ID")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ModifyGroupMemberInfoRequest memberAccount(String memberAccount) {
    
    this.memberAccount = memberAccount;
    return this;
  }

   /**
   * 要操作的群成员
   * @return memberAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "要操作的群成员")
  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMemberAccount() {
    return memberAccount;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMemberAccount(String memberAccount) {
    this.memberAccount = memberAccount;
  }


  public ModifyGroupMemberInfoRequest role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * 成员身份，Admin/Member 分别为设置/取消管理员
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "成员身份，Admin/Member 分别为设置/取消管理员")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(String role) {
    this.role = role;
  }


  public ModifyGroupMemberInfoRequest msgFlag(String msgFlag) {
    
    this.msgFlag = msgFlag;
    return this;
  }

   /**
   * 消息屏蔽类型
   * @return msgFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息屏蔽类型")
  @JsonProperty(JSON_PROPERTY_MSG_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMsgFlag() {
    return msgFlag;
  }


  @JsonProperty(JSON_PROPERTY_MSG_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgFlag(String msgFlag) {
    this.msgFlag = msgFlag;
  }


  public ModifyGroupMemberInfoRequest nameCard(String nameCard) {
    
    this.nameCard = nameCard;
    return this;
  }

   /**
   * 群名片（最大不超过50个字节）
   * @return nameCard
  **/
  @javax.annotation.Nullable
 @Size(max=50)  @ApiModelProperty(value = "群名片（最大不超过50个字节）")
  @JsonProperty(JSON_PROPERTY_NAME_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNameCard() {
    return nameCard;
  }


  @JsonProperty(JSON_PROPERTY_NAME_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameCard(String nameCard) {
    this.nameCard = nameCard;
  }


  public ModifyGroupMemberInfoRequest appMemberDefinedData(List<ModifyGroupMemberInfoRequestAppMemberDefinedDataInner> appMemberDefinedData) {
    
    this.appMemberDefinedData = appMemberDefinedData;
    return this;
  }

  public ModifyGroupMemberInfoRequest addAppMemberDefinedDataItem(ModifyGroupMemberInfoRequestAppMemberDefinedDataInner appMemberDefinedDataItem) {
    if (this.appMemberDefinedData == null) {
      this.appMemberDefinedData = new ArrayList<>();
    }
    this.appMemberDefinedData.add(appMemberDefinedDataItem);
    return this;
  }

   /**
   * 群成员维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台（https://console.cloud.tencent.com/im） 进行配置，详情请参阅 群组系统（https://cloud.tencent.com/document/product/269/1502）
   * @return appMemberDefinedData
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "群成员维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台（https://console.cloud.tencent.com/im） 进行配置，详情请参阅 群组系统（https://cloud.tencent.com/document/product/269/1502）")
  @JsonProperty(JSON_PROPERTY_APP_MEMBER_DEFINED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ModifyGroupMemberInfoRequestAppMemberDefinedDataInner> getAppMemberDefinedData() {
    return appMemberDefinedData;
  }


  @JsonProperty(JSON_PROPERTY_APP_MEMBER_DEFINED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppMemberDefinedData(List<ModifyGroupMemberInfoRequestAppMemberDefinedDataInner> appMemberDefinedData) {
    this.appMemberDefinedData = appMemberDefinedData;
  }


  public ModifyGroupMemberInfoRequest shutUpTime(Integer shutUpTime) {
    
    this.shutUpTime = shutUpTime;
    return this;
  }

   /**
   * 需禁言时间，单位为秒，0表示取消禁言
   * @return shutUpTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "需禁言时间，单位为秒，0表示取消禁言")
  @JsonProperty(JSON_PROPERTY_SHUT_UP_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getShutUpTime() {
    return shutUpTime;
  }


  @JsonProperty(JSON_PROPERTY_SHUT_UP_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShutUpTime(Integer shutUpTime) {
    this.shutUpTime = shutUpTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyGroupMemberInfoRequest modifyGroupMemberInfoRequest = (ModifyGroupMemberInfoRequest) o;
    return Objects.equals(this.groupId, modifyGroupMemberInfoRequest.groupId) &&
        Objects.equals(this.memberAccount, modifyGroupMemberInfoRequest.memberAccount) &&
        Objects.equals(this.role, modifyGroupMemberInfoRequest.role) &&
        Objects.equals(this.msgFlag, modifyGroupMemberInfoRequest.msgFlag) &&
        Objects.equals(this.nameCard, modifyGroupMemberInfoRequest.nameCard) &&
        Objects.equals(this.appMemberDefinedData, modifyGroupMemberInfoRequest.appMemberDefinedData) &&
        Objects.equals(this.shutUpTime, modifyGroupMemberInfoRequest.shutUpTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, memberAccount, role, msgFlag, nameCard, appMemberDefinedData, shutUpTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyGroupMemberInfoRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    memberAccount: ").append(toIndentedString(memberAccount)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    msgFlag: ").append(toIndentedString(msgFlag)).append("\n");
    sb.append("    nameCard: ").append(toIndentedString(nameCard)).append("\n");
    sb.append("    appMemberDefinedData: ").append(toIndentedString(appMemberDefinedData)).append("\n");
    sb.append("    shutUpTime: ").append(toIndentedString(shutUpTime)).append("\n");
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

