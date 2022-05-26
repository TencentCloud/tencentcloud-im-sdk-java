
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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetNoSpeakingResponseAllOf
 */
@JsonPropertyOrder({
  GetNoSpeakingResponseAllOf.JSON_PROPERTY_C2_CMSG_NOSPEAKING_TIME,
  GetNoSpeakingResponseAllOf.JSON_PROPERTY_GROUPMSG_NOSPEAKING_TIME
})
@JsonTypeName("GetNoSpeakingResponse_allOf")

public class GetNoSpeakingResponseAllOf {
  public static final String JSON_PROPERTY_C2_CMSG_NOSPEAKING_TIME = "C2CmsgNospeakingTime";
  private BigDecimal c2CmsgNospeakingTime;

  public static final String JSON_PROPERTY_GROUPMSG_NOSPEAKING_TIME = "GroupmsgNospeakingTime";
  private BigDecimal groupmsgNospeakingTime;

  public GetNoSpeakingResponseAllOf() { 
  }

  public GetNoSpeakingResponseAllOf c2CmsgNospeakingTime(BigDecimal c2CmsgNospeakingTime) {
    
    this.c2CmsgNospeakingTime = c2CmsgNospeakingTime;
    return this;
  }

   /**
   * 单聊消息禁言时长，单位为秒，非负整数。等于 0 代表没有被设置禁言；等于最大值4294967295（十六进制 0xFFFFFFFF）代表被设置永久禁言；其它代表该帐号禁言时长，如果等于3600表示该帐号被禁言一小时
   * @return c2CmsgNospeakingTime
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "单聊消息禁言时长，单位为秒，非负整数。等于 0 代表没有被设置禁言；等于最大值4294967295（十六进制 0xFFFFFFFF）代表被设置永久禁言；其它代表该帐号禁言时长，如果等于3600表示该帐号被禁言一小时")
  @JsonProperty(JSON_PROPERTY_C2_CMSG_NOSPEAKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getC2CmsgNospeakingTime() {
    return c2CmsgNospeakingTime;
  }


  @JsonProperty(JSON_PROPERTY_C2_CMSG_NOSPEAKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setC2CmsgNospeakingTime(BigDecimal c2CmsgNospeakingTime) {
    this.c2CmsgNospeakingTime = c2CmsgNospeakingTime;
  }


  public GetNoSpeakingResponseAllOf groupmsgNospeakingTime(BigDecimal groupmsgNospeakingTime) {
    
    this.groupmsgNospeakingTime = groupmsgNospeakingTime;
    return this;
  }

   /**
   * 群组消息禁言时长，单位为秒，非负整数。等于0代表没有被设置禁言；等于最大值4294967295（十六进制 0xFFFFFFFF）代表被设置永久禁言；其它代表该帐号禁言时长，如果等于3600表示该帐号被禁言一小时
   * @return groupmsgNospeakingTime
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "群组消息禁言时长，单位为秒，非负整数。等于0代表没有被设置禁言；等于最大值4294967295（十六进制 0xFFFFFFFF）代表被设置永久禁言；其它代表该帐号禁言时长，如果等于3600表示该帐号被禁言一小时")
  @JsonProperty(JSON_PROPERTY_GROUPMSG_NOSPEAKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGroupmsgNospeakingTime() {
    return groupmsgNospeakingTime;
  }


  @JsonProperty(JSON_PROPERTY_GROUPMSG_NOSPEAKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupmsgNospeakingTime(BigDecimal groupmsgNospeakingTime) {
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
    GetNoSpeakingResponseAllOf getNoSpeakingResponseAllOf = (GetNoSpeakingResponseAllOf) o;
    return Objects.equals(this.c2CmsgNospeakingTime, getNoSpeakingResponseAllOf.c2CmsgNospeakingTime) &&
        Objects.equals(this.groupmsgNospeakingTime, getNoSpeakingResponseAllOf.groupmsgNospeakingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c2CmsgNospeakingTime, groupmsgNospeakingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNoSpeakingResponseAllOf {\n");
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

