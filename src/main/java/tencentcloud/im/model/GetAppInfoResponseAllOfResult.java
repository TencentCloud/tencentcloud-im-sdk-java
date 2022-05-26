
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
 * GetAppInfoResponseAllOfResult
 */
@JsonPropertyOrder({
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_APP_NAME,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_APP_ID,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_COMPANY,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_ACTIVE_USER_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_REGIST_USER_NUM_ONE_DAY,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_REGIST_USER_NUM_TOTAL,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_LOGIN_TIMES,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_LOGIN_USER_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_UP_MSG_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_SEND_MSG_USER_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_AP_N_S_MSG_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_C2_C_UP_MSG_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_C2_C_DOWN_MSG_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_C2_C_SEND_MSG_USER_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_C2_C_A_P_N_S_MSG_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_MAX_ONLINE_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_DOWN_MSG_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_CHAIN_INCREASE,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_CHAIN_DECREASE,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_GROUP_UP_MSG_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_GROUP_DOWN_MSG_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_GROUP_SEND_MSG_USER_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_GROUP_A_P_N_S_MSG_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_GROUP_SEND_MSG_GROUP_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_GROUP_JOIN_GROUP_TIMES,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_GROUP_QUIT_GROUP_TIMES,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_GROUP_NEW_GROUP_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_GROUP_ALL_GROUP_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_GROUP_DESTROY_GROUP_NUM,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_CALL_BACK_REQ,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_CALL_BACK_RSP,
  GetAppInfoResponseAllOfResult.JSON_PROPERTY_DATE
})
@JsonTypeName("GetAppInfoResponse_allOf_Result")

public class GetAppInfoResponseAllOfResult {
  public static final String JSON_PROPERTY_APP_NAME = "AppName";
  private String appName;

  public static final String JSON_PROPERTY_APP_ID = "AppId";
  private String appId;

  public static final String JSON_PROPERTY_COMPANY = "Company";
  private String company;

  public static final String JSON_PROPERTY_ACTIVE_USER_NUM = "ActiveUserNum";
  private String activeUserNum;

  public static final String JSON_PROPERTY_REGIST_USER_NUM_ONE_DAY = "RegistUserNumOneDay";
  private String registUserNumOneDay;

  public static final String JSON_PROPERTY_REGIST_USER_NUM_TOTAL = "RegistUserNumTotal";
  private String registUserNumTotal;

  public static final String JSON_PROPERTY_LOGIN_TIMES = "LoginTimes";
  private String loginTimes;

  public static final String JSON_PROPERTY_LOGIN_USER_NUM = "LoginUserNum";
  private String loginUserNum;

  public static final String JSON_PROPERTY_UP_MSG_NUM = "UpMsgNum";
  private String upMsgNum;

  public static final String JSON_PROPERTY_SEND_MSG_USER_NUM = "SendMsgUserNum";
  private String sendMsgUserNum;

  public static final String JSON_PROPERTY_AP_N_S_MSG_NUM = "APNSMsgNum";
  private String apNSMsgNum;

  public static final String JSON_PROPERTY_C2_C_UP_MSG_NUM = "C2CUpMsgNum";
  private String c2CUpMsgNum;

  public static final String JSON_PROPERTY_C2_C_DOWN_MSG_NUM = "C2CDownMsgNum";
  private String c2CDownMsgNum;

  public static final String JSON_PROPERTY_C2_C_SEND_MSG_USER_NUM = "C2CSendMsgUserNum";
  private String c2CSendMsgUserNum;

  public static final String JSON_PROPERTY_C2_C_A_P_N_S_MSG_NUM = "C2CAPNSMsgNum";
  private String c2CAPNSMsgNum;

  public static final String JSON_PROPERTY_MAX_ONLINE_NUM = "MaxOnlineNum";
  private String maxOnlineNum;

  public static final String JSON_PROPERTY_DOWN_MSG_NUM = "DownMsgNum";
  private String downMsgNum;

  public static final String JSON_PROPERTY_CHAIN_INCREASE = "ChainIncrease";
  private String chainIncrease;

  public static final String JSON_PROPERTY_CHAIN_DECREASE = "ChainDecrease";
  private String chainDecrease;

  public static final String JSON_PROPERTY_GROUP_UP_MSG_NUM = "GroupUpMsgNum";
  private String groupUpMsgNum;

  public static final String JSON_PROPERTY_GROUP_DOWN_MSG_NUM = "GroupDownMsgNum";
  private String groupDownMsgNum;

  public static final String JSON_PROPERTY_GROUP_SEND_MSG_USER_NUM = "GroupSendMsgUserNum";
  private String groupSendMsgUserNum;

  public static final String JSON_PROPERTY_GROUP_A_P_N_S_MSG_NUM = "GroupAPNSMsgNum";
  private String groupAPNSMsgNum;

  public static final String JSON_PROPERTY_GROUP_SEND_MSG_GROUP_NUM = "GroupSendMsgGroupNum";
  private String groupSendMsgGroupNum;

  public static final String JSON_PROPERTY_GROUP_JOIN_GROUP_TIMES = "GroupJoinGroupTimes";
  private String groupJoinGroupTimes;

  public static final String JSON_PROPERTY_GROUP_QUIT_GROUP_TIMES = "GroupQuitGroupTimes";
  private String groupQuitGroupTimes;

  public static final String JSON_PROPERTY_GROUP_NEW_GROUP_NUM = "GroupNewGroupNum";
  private String groupNewGroupNum;

  public static final String JSON_PROPERTY_GROUP_ALL_GROUP_NUM = "GroupAllGroupNum";
  private String groupAllGroupNum;

  public static final String JSON_PROPERTY_GROUP_DESTROY_GROUP_NUM = "GroupDestroyGroupNum";
  private String groupDestroyGroupNum;

  public static final String JSON_PROPERTY_CALL_BACK_REQ = "CallBackReq";
  private String callBackReq;

  public static final String JSON_PROPERTY_CALL_BACK_RSP = "CallBackRsp";
  private String callBackRsp;

  public static final String JSON_PROPERTY_DATE = "Date";
  private String date;

  public GetAppInfoResponseAllOfResult() { 
  }

  public GetAppInfoResponseAllOfResult appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 应用名称
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "应用名称")
  @JsonProperty(JSON_PROPERTY_APP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppName() {
    return appName;
  }


  @JsonProperty(JSON_PROPERTY_APP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppName(String appName) {
    this.appName = appName;
  }


  public GetAppInfoResponseAllOfResult appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 应用 SDKAppID
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "应用 SDKAppID")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(String appId) {
    this.appId = appId;
  }


  public GetAppInfoResponseAllOfResult company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * 所属客户名称
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "所属客户名称")
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompany() {
    return company;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompany(String company) {
    this.company = company;
  }


  public GetAppInfoResponseAllOfResult activeUserNum(String activeUserNum) {
    
    this.activeUserNum = activeUserNum;
    return this;
  }

   /**
   * 活跃用户数
   * @return activeUserNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "活跃用户数")
  @JsonProperty(JSON_PROPERTY_ACTIVE_USER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActiveUserNum() {
    return activeUserNum;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_USER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveUserNum(String activeUserNum) {
    this.activeUserNum = activeUserNum;
  }


  public GetAppInfoResponseAllOfResult registUserNumOneDay(String registUserNumOneDay) {
    
    this.registUserNumOneDay = registUserNumOneDay;
    return this;
  }

   /**
   * 新增注册人数
   * @return registUserNumOneDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "新增注册人数")
  @JsonProperty(JSON_PROPERTY_REGIST_USER_NUM_ONE_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistUserNumOneDay() {
    return registUserNumOneDay;
  }


  @JsonProperty(JSON_PROPERTY_REGIST_USER_NUM_ONE_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistUserNumOneDay(String registUserNumOneDay) {
    this.registUserNumOneDay = registUserNumOneDay;
  }


  public GetAppInfoResponseAllOfResult registUserNumTotal(String registUserNumTotal) {
    
    this.registUserNumTotal = registUserNumTotal;
    return this;
  }

   /**
   * 累计注册人数
   * @return registUserNumTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "累计注册人数")
  @JsonProperty(JSON_PROPERTY_REGIST_USER_NUM_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistUserNumTotal() {
    return registUserNumTotal;
  }


  @JsonProperty(JSON_PROPERTY_REGIST_USER_NUM_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistUserNumTotal(String registUserNumTotal) {
    this.registUserNumTotal = registUserNumTotal;
  }


  public GetAppInfoResponseAllOfResult loginTimes(String loginTimes) {
    
    this.loginTimes = loginTimes;
    return this;
  }

   /**
   * 登录次数
   * @return loginTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "登录次数")
  @JsonProperty(JSON_PROPERTY_LOGIN_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLoginTimes() {
    return loginTimes;
  }


  @JsonProperty(JSON_PROPERTY_LOGIN_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoginTimes(String loginTimes) {
    this.loginTimes = loginTimes;
  }


  public GetAppInfoResponseAllOfResult loginUserNum(String loginUserNum) {
    
    this.loginUserNum = loginUserNum;
    return this;
  }

   /**
   * 登录人数
   * @return loginUserNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "登录人数")
  @JsonProperty(JSON_PROPERTY_LOGIN_USER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLoginUserNum() {
    return loginUserNum;
  }


  @JsonProperty(JSON_PROPERTY_LOGIN_USER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoginUserNum(String loginUserNum) {
    this.loginUserNum = loginUserNum;
  }


  public GetAppInfoResponseAllOfResult upMsgNum(String upMsgNum) {
    
    this.upMsgNum = upMsgNum;
    return this;
  }

   /**
   * 上行消息数
   * @return upMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上行消息数")
  @JsonProperty(JSON_PROPERTY_UP_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpMsgNum() {
    return upMsgNum;
  }


  @JsonProperty(JSON_PROPERTY_UP_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpMsgNum(String upMsgNum) {
    this.upMsgNum = upMsgNum;
  }


  public GetAppInfoResponseAllOfResult sendMsgUserNum(String sendMsgUserNum) {
    
    this.sendMsgUserNum = sendMsgUserNum;
    return this;
  }

   /**
   * 发消息人数
   * @return sendMsgUserNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发消息人数")
  @JsonProperty(JSON_PROPERTY_SEND_MSG_USER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSendMsgUserNum() {
    return sendMsgUserNum;
  }


  @JsonProperty(JSON_PROPERTY_SEND_MSG_USER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendMsgUserNum(String sendMsgUserNum) {
    this.sendMsgUserNum = sendMsgUserNum;
  }


  public GetAppInfoResponseAllOfResult apNSMsgNum(String apNSMsgNum) {
    
    this.apNSMsgNum = apNSMsgNum;
    return this;
  }

   /**
   * APNs 推送数
   * @return apNSMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APNs 推送数")
  @JsonProperty(JSON_PROPERTY_AP_N_S_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApNSMsgNum() {
    return apNSMsgNum;
  }


  @JsonProperty(JSON_PROPERTY_AP_N_S_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApNSMsgNum(String apNSMsgNum) {
    this.apNSMsgNum = apNSMsgNum;
  }


  public GetAppInfoResponseAllOfResult c2CUpMsgNum(String c2CUpMsgNum) {
    
    this.c2CUpMsgNum = c2CUpMsgNum;
    return this;
  }

   /**
   * 上行消息数（C2C）
   * @return c2CUpMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上行消息数（C2C）")
  @JsonProperty(JSON_PROPERTY_C2_C_UP_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getC2CUpMsgNum() {
    return c2CUpMsgNum;
  }


  @JsonProperty(JSON_PROPERTY_C2_C_UP_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setC2CUpMsgNum(String c2CUpMsgNum) {
    this.c2CUpMsgNum = c2CUpMsgNum;
  }


  public GetAppInfoResponseAllOfResult c2CDownMsgNum(String c2CDownMsgNum) {
    
    this.c2CDownMsgNum = c2CDownMsgNum;
    return this;
  }

   /**
   * 下行消息数（C2C）
   * @return c2CDownMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "下行消息数（C2C）")
  @JsonProperty(JSON_PROPERTY_C2_C_DOWN_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getC2CDownMsgNum() {
    return c2CDownMsgNum;
  }


  @JsonProperty(JSON_PROPERTY_C2_C_DOWN_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setC2CDownMsgNum(String c2CDownMsgNum) {
    this.c2CDownMsgNum = c2CDownMsgNum;
  }


  public GetAppInfoResponseAllOfResult c2CSendMsgUserNum(String c2CSendMsgUserNum) {
    
    this.c2CSendMsgUserNum = c2CSendMsgUserNum;
    return this;
  }

   /**
   * 发消息人数（C2C）
   * @return c2CSendMsgUserNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发消息人数（C2C）")
  @JsonProperty(JSON_PROPERTY_C2_C_SEND_MSG_USER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getC2CSendMsgUserNum() {
    return c2CSendMsgUserNum;
  }


  @JsonProperty(JSON_PROPERTY_C2_C_SEND_MSG_USER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setC2CSendMsgUserNum(String c2CSendMsgUserNum) {
    this.c2CSendMsgUserNum = c2CSendMsgUserNum;
  }


  public GetAppInfoResponseAllOfResult c2CAPNSMsgNum(String c2CAPNSMsgNum) {
    
    this.c2CAPNSMsgNum = c2CAPNSMsgNum;
    return this;
  }

   /**
   * APNs 推送数（C2C）
   * @return c2CAPNSMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APNs 推送数（C2C）")
  @JsonProperty(JSON_PROPERTY_C2_C_A_P_N_S_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getC2CAPNSMsgNum() {
    return c2CAPNSMsgNum;
  }


  @JsonProperty(JSON_PROPERTY_C2_C_A_P_N_S_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setC2CAPNSMsgNum(String c2CAPNSMsgNum) {
    this.c2CAPNSMsgNum = c2CAPNSMsgNum;
  }


  public GetAppInfoResponseAllOfResult maxOnlineNum(String maxOnlineNum) {
    
    this.maxOnlineNum = maxOnlineNum;
    return this;
  }

   /**
   * 最高在线人数
   * @return maxOnlineNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "最高在线人数")
  @JsonProperty(JSON_PROPERTY_MAX_ONLINE_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaxOnlineNum() {
    return maxOnlineNum;
  }


  @JsonProperty(JSON_PROPERTY_MAX_ONLINE_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxOnlineNum(String maxOnlineNum) {
    this.maxOnlineNum = maxOnlineNum;
  }


  public GetAppInfoResponseAllOfResult downMsgNum(String downMsgNum) {
    
    this.downMsgNum = downMsgNum;
    return this;
  }

   /**
   * 下行消息总数（C2C和群）
   * @return downMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "下行消息总数（C2C和群）")
  @JsonProperty(JSON_PROPERTY_DOWN_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDownMsgNum() {
    return downMsgNum;
  }


  @JsonProperty(JSON_PROPERTY_DOWN_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownMsgNum(String downMsgNum) {
    this.downMsgNum = downMsgNum;
  }


  public GetAppInfoResponseAllOfResult chainIncrease(String chainIncrease) {
    
    this.chainIncrease = chainIncrease;
    return this;
  }

   /**
   * 关系链对数增加量
   * @return chainIncrease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "关系链对数增加量")
  @JsonProperty(JSON_PROPERTY_CHAIN_INCREASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChainIncrease() {
    return chainIncrease;
  }


  @JsonProperty(JSON_PROPERTY_CHAIN_INCREASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChainIncrease(String chainIncrease) {
    this.chainIncrease = chainIncrease;
  }


  public GetAppInfoResponseAllOfResult chainDecrease(String chainDecrease) {
    
    this.chainDecrease = chainDecrease;
    return this;
  }

   /**
   * 关系链对数删除量
   * @return chainDecrease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "关系链对数删除量")
  @JsonProperty(JSON_PROPERTY_CHAIN_DECREASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChainDecrease() {
    return chainDecrease;
  }


  @JsonProperty(JSON_PROPERTY_CHAIN_DECREASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChainDecrease(String chainDecrease) {
    this.chainDecrease = chainDecrease;
  }


  public GetAppInfoResponseAllOfResult groupUpMsgNum(String groupUpMsgNum) {
    
    this.groupUpMsgNum = groupUpMsgNum;
    return this;
  }

   /**
   * 上行消息数（群）
   * @return groupUpMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上行消息数（群）")
  @JsonProperty(JSON_PROPERTY_GROUP_UP_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupUpMsgNum() {
    return groupUpMsgNum;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_UP_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupUpMsgNum(String groupUpMsgNum) {
    this.groupUpMsgNum = groupUpMsgNum;
  }


  public GetAppInfoResponseAllOfResult groupDownMsgNum(String groupDownMsgNum) {
    
    this.groupDownMsgNum = groupDownMsgNum;
    return this;
  }

   /**
   * 下行消息数（群）
   * @return groupDownMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "下行消息数（群）")
  @JsonProperty(JSON_PROPERTY_GROUP_DOWN_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupDownMsgNum() {
    return groupDownMsgNum;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_DOWN_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupDownMsgNum(String groupDownMsgNum) {
    this.groupDownMsgNum = groupDownMsgNum;
  }


  public GetAppInfoResponseAllOfResult groupSendMsgUserNum(String groupSendMsgUserNum) {
    
    this.groupSendMsgUserNum = groupSendMsgUserNum;
    return this;
  }

   /**
   * 发消息人数（群）
   * @return groupSendMsgUserNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发消息人数（群）")
  @JsonProperty(JSON_PROPERTY_GROUP_SEND_MSG_USER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupSendMsgUserNum() {
    return groupSendMsgUserNum;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_SEND_MSG_USER_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupSendMsgUserNum(String groupSendMsgUserNum) {
    this.groupSendMsgUserNum = groupSendMsgUserNum;
  }


  public GetAppInfoResponseAllOfResult groupAPNSMsgNum(String groupAPNSMsgNum) {
    
    this.groupAPNSMsgNum = groupAPNSMsgNum;
    return this;
  }

   /**
   * APNs 推送数（群）
   * @return groupAPNSMsgNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APNs 推送数（群）")
  @JsonProperty(JSON_PROPERTY_GROUP_A_P_N_S_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupAPNSMsgNum() {
    return groupAPNSMsgNum;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_A_P_N_S_MSG_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupAPNSMsgNum(String groupAPNSMsgNum) {
    this.groupAPNSMsgNum = groupAPNSMsgNum;
  }


  public GetAppInfoResponseAllOfResult groupSendMsgGroupNum(String groupSendMsgGroupNum) {
    
    this.groupSendMsgGroupNum = groupSendMsgGroupNum;
    return this;
  }

   /**
   * 发消息群组数
   * @return groupSendMsgGroupNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发消息群组数")
  @JsonProperty(JSON_PROPERTY_GROUP_SEND_MSG_GROUP_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupSendMsgGroupNum() {
    return groupSendMsgGroupNum;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_SEND_MSG_GROUP_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupSendMsgGroupNum(String groupSendMsgGroupNum) {
    this.groupSendMsgGroupNum = groupSendMsgGroupNum;
  }


  public GetAppInfoResponseAllOfResult groupJoinGroupTimes(String groupJoinGroupTimes) {
    
    this.groupJoinGroupTimes = groupJoinGroupTimes;
    return this;
  }

   /**
   * 入群总数
   * @return groupJoinGroupTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "入群总数")
  @JsonProperty(JSON_PROPERTY_GROUP_JOIN_GROUP_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupJoinGroupTimes() {
    return groupJoinGroupTimes;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_JOIN_GROUP_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupJoinGroupTimes(String groupJoinGroupTimes) {
    this.groupJoinGroupTimes = groupJoinGroupTimes;
  }


  public GetAppInfoResponseAllOfResult groupQuitGroupTimes(String groupQuitGroupTimes) {
    
    this.groupQuitGroupTimes = groupQuitGroupTimes;
    return this;
  }

   /**
   * 退群总数
   * @return groupQuitGroupTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "退群总数")
  @JsonProperty(JSON_PROPERTY_GROUP_QUIT_GROUP_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupQuitGroupTimes() {
    return groupQuitGroupTimes;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_QUIT_GROUP_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupQuitGroupTimes(String groupQuitGroupTimes) {
    this.groupQuitGroupTimes = groupQuitGroupTimes;
  }


  public GetAppInfoResponseAllOfResult groupNewGroupNum(String groupNewGroupNum) {
    
    this.groupNewGroupNum = groupNewGroupNum;
    return this;
  }

   /**
   * 新增群组数
   * @return groupNewGroupNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "新增群组数")
  @JsonProperty(JSON_PROPERTY_GROUP_NEW_GROUP_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupNewGroupNum() {
    return groupNewGroupNum;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_NEW_GROUP_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupNewGroupNum(String groupNewGroupNum) {
    this.groupNewGroupNum = groupNewGroupNum;
  }


  public GetAppInfoResponseAllOfResult groupAllGroupNum(String groupAllGroupNum) {
    
    this.groupAllGroupNum = groupAllGroupNum;
    return this;
  }

   /**
   * 累计群组数
   * @return groupAllGroupNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "累计群组数")
  @JsonProperty(JSON_PROPERTY_GROUP_ALL_GROUP_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupAllGroupNum() {
    return groupAllGroupNum;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ALL_GROUP_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupAllGroupNum(String groupAllGroupNum) {
    this.groupAllGroupNum = groupAllGroupNum;
  }


  public GetAppInfoResponseAllOfResult groupDestroyGroupNum(String groupDestroyGroupNum) {
    
    this.groupDestroyGroupNum = groupDestroyGroupNum;
    return this;
  }

   /**
   * 解散群个数
   * @return groupDestroyGroupNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "解散群个数")
  @JsonProperty(JSON_PROPERTY_GROUP_DESTROY_GROUP_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupDestroyGroupNum() {
    return groupDestroyGroupNum;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_DESTROY_GROUP_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupDestroyGroupNum(String groupDestroyGroupNum) {
    this.groupDestroyGroupNum = groupDestroyGroupNum;
  }


  public GetAppInfoResponseAllOfResult callBackReq(String callBackReq) {
    
    this.callBackReq = callBackReq;
    return this;
  }

   /**
   * 回调请求数
   * @return callBackReq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "回调请求数")
  @JsonProperty(JSON_PROPERTY_CALL_BACK_REQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallBackReq() {
    return callBackReq;
  }


  @JsonProperty(JSON_PROPERTY_CALL_BACK_REQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallBackReq(String callBackReq) {
    this.callBackReq = callBackReq;
  }


  public GetAppInfoResponseAllOfResult callBackRsp(String callBackRsp) {
    
    this.callBackRsp = callBackRsp;
    return this;
  }

   /**
   * 回调应答数
   * @return callBackRsp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "回调应答数")
  @JsonProperty(JSON_PROPERTY_CALL_BACK_RSP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallBackRsp() {
    return callBackRsp;
  }


  @JsonProperty(JSON_PROPERTY_CALL_BACK_RSP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallBackRsp(String callBackRsp) {
    this.callBackRsp = callBackRsp;
  }


  public GetAppInfoResponseAllOfResult date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 日期
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "日期")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAppInfoResponseAllOfResult getAppInfoResponseAllOfResult = (GetAppInfoResponseAllOfResult) o;
    return Objects.equals(this.appName, getAppInfoResponseAllOfResult.appName) &&
        Objects.equals(this.appId, getAppInfoResponseAllOfResult.appId) &&
        Objects.equals(this.company, getAppInfoResponseAllOfResult.company) &&
        Objects.equals(this.activeUserNum, getAppInfoResponseAllOfResult.activeUserNum) &&
        Objects.equals(this.registUserNumOneDay, getAppInfoResponseAllOfResult.registUserNumOneDay) &&
        Objects.equals(this.registUserNumTotal, getAppInfoResponseAllOfResult.registUserNumTotal) &&
        Objects.equals(this.loginTimes, getAppInfoResponseAllOfResult.loginTimes) &&
        Objects.equals(this.loginUserNum, getAppInfoResponseAllOfResult.loginUserNum) &&
        Objects.equals(this.upMsgNum, getAppInfoResponseAllOfResult.upMsgNum) &&
        Objects.equals(this.sendMsgUserNum, getAppInfoResponseAllOfResult.sendMsgUserNum) &&
        Objects.equals(this.apNSMsgNum, getAppInfoResponseAllOfResult.apNSMsgNum) &&
        Objects.equals(this.c2CUpMsgNum, getAppInfoResponseAllOfResult.c2CUpMsgNum) &&
        Objects.equals(this.c2CDownMsgNum, getAppInfoResponseAllOfResult.c2CDownMsgNum) &&
        Objects.equals(this.c2CSendMsgUserNum, getAppInfoResponseAllOfResult.c2CSendMsgUserNum) &&
        Objects.equals(this.c2CAPNSMsgNum, getAppInfoResponseAllOfResult.c2CAPNSMsgNum) &&
        Objects.equals(this.maxOnlineNum, getAppInfoResponseAllOfResult.maxOnlineNum) &&
        Objects.equals(this.downMsgNum, getAppInfoResponseAllOfResult.downMsgNum) &&
        Objects.equals(this.chainIncrease, getAppInfoResponseAllOfResult.chainIncrease) &&
        Objects.equals(this.chainDecrease, getAppInfoResponseAllOfResult.chainDecrease) &&
        Objects.equals(this.groupUpMsgNum, getAppInfoResponseAllOfResult.groupUpMsgNum) &&
        Objects.equals(this.groupDownMsgNum, getAppInfoResponseAllOfResult.groupDownMsgNum) &&
        Objects.equals(this.groupSendMsgUserNum, getAppInfoResponseAllOfResult.groupSendMsgUserNum) &&
        Objects.equals(this.groupAPNSMsgNum, getAppInfoResponseAllOfResult.groupAPNSMsgNum) &&
        Objects.equals(this.groupSendMsgGroupNum, getAppInfoResponseAllOfResult.groupSendMsgGroupNum) &&
        Objects.equals(this.groupJoinGroupTimes, getAppInfoResponseAllOfResult.groupJoinGroupTimes) &&
        Objects.equals(this.groupQuitGroupTimes, getAppInfoResponseAllOfResult.groupQuitGroupTimes) &&
        Objects.equals(this.groupNewGroupNum, getAppInfoResponseAllOfResult.groupNewGroupNum) &&
        Objects.equals(this.groupAllGroupNum, getAppInfoResponseAllOfResult.groupAllGroupNum) &&
        Objects.equals(this.groupDestroyGroupNum, getAppInfoResponseAllOfResult.groupDestroyGroupNum) &&
        Objects.equals(this.callBackReq, getAppInfoResponseAllOfResult.callBackReq) &&
        Objects.equals(this.callBackRsp, getAppInfoResponseAllOfResult.callBackRsp) &&
        Objects.equals(this.date, getAppInfoResponseAllOfResult.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, appId, company, activeUserNum, registUserNumOneDay, registUserNumTotal, loginTimes, loginUserNum, upMsgNum, sendMsgUserNum, apNSMsgNum, c2CUpMsgNum, c2CDownMsgNum, c2CSendMsgUserNum, c2CAPNSMsgNum, maxOnlineNum, downMsgNum, chainIncrease, chainDecrease, groupUpMsgNum, groupDownMsgNum, groupSendMsgUserNum, groupAPNSMsgNum, groupSendMsgGroupNum, groupJoinGroupTimes, groupQuitGroupTimes, groupNewGroupNum, groupAllGroupNum, groupDestroyGroupNum, callBackReq, callBackRsp, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAppInfoResponseAllOfResult {\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    activeUserNum: ").append(toIndentedString(activeUserNum)).append("\n");
    sb.append("    registUserNumOneDay: ").append(toIndentedString(registUserNumOneDay)).append("\n");
    sb.append("    registUserNumTotal: ").append(toIndentedString(registUserNumTotal)).append("\n");
    sb.append("    loginTimes: ").append(toIndentedString(loginTimes)).append("\n");
    sb.append("    loginUserNum: ").append(toIndentedString(loginUserNum)).append("\n");
    sb.append("    upMsgNum: ").append(toIndentedString(upMsgNum)).append("\n");
    sb.append("    sendMsgUserNum: ").append(toIndentedString(sendMsgUserNum)).append("\n");
    sb.append("    apNSMsgNum: ").append(toIndentedString(apNSMsgNum)).append("\n");
    sb.append("    c2CUpMsgNum: ").append(toIndentedString(c2CUpMsgNum)).append("\n");
    sb.append("    c2CDownMsgNum: ").append(toIndentedString(c2CDownMsgNum)).append("\n");
    sb.append("    c2CSendMsgUserNum: ").append(toIndentedString(c2CSendMsgUserNum)).append("\n");
    sb.append("    c2CAPNSMsgNum: ").append(toIndentedString(c2CAPNSMsgNum)).append("\n");
    sb.append("    maxOnlineNum: ").append(toIndentedString(maxOnlineNum)).append("\n");
    sb.append("    downMsgNum: ").append(toIndentedString(downMsgNum)).append("\n");
    sb.append("    chainIncrease: ").append(toIndentedString(chainIncrease)).append("\n");
    sb.append("    chainDecrease: ").append(toIndentedString(chainDecrease)).append("\n");
    sb.append("    groupUpMsgNum: ").append(toIndentedString(groupUpMsgNum)).append("\n");
    sb.append("    groupDownMsgNum: ").append(toIndentedString(groupDownMsgNum)).append("\n");
    sb.append("    groupSendMsgUserNum: ").append(toIndentedString(groupSendMsgUserNum)).append("\n");
    sb.append("    groupAPNSMsgNum: ").append(toIndentedString(groupAPNSMsgNum)).append("\n");
    sb.append("    groupSendMsgGroupNum: ").append(toIndentedString(groupSendMsgGroupNum)).append("\n");
    sb.append("    groupJoinGroupTimes: ").append(toIndentedString(groupJoinGroupTimes)).append("\n");
    sb.append("    groupQuitGroupTimes: ").append(toIndentedString(groupQuitGroupTimes)).append("\n");
    sb.append("    groupNewGroupNum: ").append(toIndentedString(groupNewGroupNum)).append("\n");
    sb.append("    groupAllGroupNum: ").append(toIndentedString(groupAllGroupNum)).append("\n");
    sb.append("    groupDestroyGroupNum: ").append(toIndentedString(groupDestroyGroupNum)).append("\n");
    sb.append("    callBackReq: ").append(toIndentedString(callBackReq)).append("\n");
    sb.append("    callBackRsp: ").append(toIndentedString(callBackRsp)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

