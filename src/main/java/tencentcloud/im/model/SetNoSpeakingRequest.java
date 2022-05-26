
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
 * SetNoSpeakingRequest
 */
@JsonPropertyOrder({
  SetNoSpeakingRequest.JSON_PROPERTY_SET_ACCOUNT,
  SetNoSpeakingRequest.JSON_PROPERTY_C2_CMSG_NOSPEAKING_TIME,
  SetNoSpeakingRequest.JSON_PROPERTY_GROUPMSG_NOSPEAKING_TIME
})

public class SetNoSpeakingRequest {
  public static final String JSON_PROPERTY_SET_ACCOUNT = "Set_Account";
  private String setAccount;

  public static final String JSON_PROPERTY_C2_CMSG_NOSPEAKING_TIME = "C2CmsgNospeakingTime";
  private Integer c2CmsgNospeakingTime;

  public static final String JSON_PROPERTY_GROUPMSG_NOSPEAKING_TIME = "GroupmsgNospeakingTime";
  private Integer groupmsgNospeakingTime;

  public SetNoSpeakingRequest() { 
  }

  public SetNoSpeakingRequest setAccount(String setAccount) {
    
    this.setAccount = setAccount;
    return this;
  }

   /**
   * 设置禁言配置的帐号
   * @return setAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "设置禁言配置的帐号")
  @JsonProperty(JSON_PROPERTY_SET_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSetAccount() {
    return setAccount;
  }


  @JsonProperty(JSON_PROPERTY_SET_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSetAccount(String setAccount) {
    this.setAccount = setAccount;
  }


  public SetNoSpeakingRequest c2CmsgNospeakingTime(Integer c2CmsgNospeakingTime) {
    
    this.c2CmsgNospeakingTime = c2CmsgNospeakingTime;
    return this;
  }

   /**
   * 单聊消息禁言时间，单位为秒，非负整数，最大值为4294967295（十六进制 0xFFFFFFFF） 0表示取消该帐号的单聊消息禁言 4294967295表示该帐号被设置永久禁言 其它值表示该帐号具体的禁言时间
   * @return c2CmsgNospeakingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单聊消息禁言时间，单位为秒，非负整数，最大值为4294967295（十六进制 0xFFFFFFFF） 0表示取消该帐号的单聊消息禁言 4294967295表示该帐号被设置永久禁言 其它值表示该帐号具体的禁言时间")
  @JsonProperty(JSON_PROPERTY_C2_CMSG_NOSPEAKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getC2CmsgNospeakingTime() {
    return c2CmsgNospeakingTime;
  }


  @JsonProperty(JSON_PROPERTY_C2_CMSG_NOSPEAKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setC2CmsgNospeakingTime(Integer c2CmsgNospeakingTime) {
    this.c2CmsgNospeakingTime = c2CmsgNospeakingTime;
  }


  public SetNoSpeakingRequest groupmsgNospeakingTime(Integer groupmsgNospeakingTime) {
    
    this.groupmsgNospeakingTime = groupmsgNospeakingTime;
    return this;
  }

   /**
   * 群组消息禁言时间，单位为秒，非负整数，最大值为4294967295（十六进制 0xFFFFFFFF） 0表示取消该帐号的群组消息禁言  4294967295表示该帐号被设置永久禁言 其它值表示该帐号的具体禁言时间
   * @return groupmsgNospeakingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "群组消息禁言时间，单位为秒，非负整数，最大值为4294967295（十六进制 0xFFFFFFFF） 0表示取消该帐号的群组消息禁言  4294967295表示该帐号被设置永久禁言 其它值表示该帐号的具体禁言时间")
  @JsonProperty(JSON_PROPERTY_GROUPMSG_NOSPEAKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGroupmsgNospeakingTime() {
    return groupmsgNospeakingTime;
  }


  @JsonProperty(JSON_PROPERTY_GROUPMSG_NOSPEAKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupmsgNospeakingTime(Integer groupmsgNospeakingTime) {
    this.groupmsgNospeakingTime = groupmsgNospeakingTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetNoSpeakingRequest setNoSpeakingRequest = (SetNoSpeakingRequest) o;
    return Objects.equals(this.setAccount, setNoSpeakingRequest.setAccount) &&
        Objects.equals(this.c2CmsgNospeakingTime, setNoSpeakingRequest.c2CmsgNospeakingTime) &&
        Objects.equals(this.groupmsgNospeakingTime, setNoSpeakingRequest.groupmsgNospeakingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(setAccount, c2CmsgNospeakingTime, groupmsgNospeakingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetNoSpeakingRequest {\n");
    sb.append("    setAccount: ").append(toIndentedString(setAccount)).append("\n");
    sb.append("    c2CmsgNospeakingTime: ").append(toIndentedString(c2CmsgNospeakingTime)).append("\n");
    sb.append("    groupmsgNospeakingTime: ").append(toIndentedString(groupmsgNospeakingTime)).append("\n");
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

