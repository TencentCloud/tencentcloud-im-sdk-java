/*
 * TIM SERVER REST API SDK
 * TIM REST API
 */


package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.tencentcloudapi.im.JSON;

/**
 * GetAppInfoResponseAllOfResult
 */

public class GetAppInfoResponseAllOfResult {
  public static final String SERIALIZED_NAME_APP_NAME = "AppName";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_APP_ID = "AppId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_COMPANY = "Company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_ACTIVE_USER_NUM = "ActiveUserNum";
  @SerializedName(SERIALIZED_NAME_ACTIVE_USER_NUM)
  private String activeUserNum;

  public static final String SERIALIZED_NAME_REGIST_USER_NUM_ONE_DAY = "RegistUserNumOneDay";
  @SerializedName(SERIALIZED_NAME_REGIST_USER_NUM_ONE_DAY)
  private String registUserNumOneDay;

  public static final String SERIALIZED_NAME_REGIST_USER_NUM_TOTAL = "RegistUserNumTotal";
  @SerializedName(SERIALIZED_NAME_REGIST_USER_NUM_TOTAL)
  private String registUserNumTotal;

  public static final String SERIALIZED_NAME_LOGIN_TIMES = "LoginTimes";
  @SerializedName(SERIALIZED_NAME_LOGIN_TIMES)
  private String loginTimes;

  public static final String SERIALIZED_NAME_LOGIN_USER_NUM = "LoginUserNum";
  @SerializedName(SERIALIZED_NAME_LOGIN_USER_NUM)
  private String loginUserNum;

  public static final String SERIALIZED_NAME_UP_MSG_NUM = "UpMsgNum";
  @SerializedName(SERIALIZED_NAME_UP_MSG_NUM)
  private String upMsgNum;

  public static final String SERIALIZED_NAME_SEND_MSG_USER_NUM = "SendMsgUserNum";
  @SerializedName(SERIALIZED_NAME_SEND_MSG_USER_NUM)
  private String sendMsgUserNum;

  public static final String SERIALIZED_NAME_AP_N_S_MSG_NUM = "APNSMsgNum";
  @SerializedName(SERIALIZED_NAME_AP_N_S_MSG_NUM)
  private String apNSMsgNum;

  public static final String SERIALIZED_NAME_C2_C_UP_MSG_NUM = "C2CUpMsgNum";
  @SerializedName(SERIALIZED_NAME_C2_C_UP_MSG_NUM)
  private String c2CUpMsgNum;

  public static final String SERIALIZED_NAME_C2_C_DOWN_MSG_NUM = "C2CDownMsgNum";
  @SerializedName(SERIALIZED_NAME_C2_C_DOWN_MSG_NUM)
  private String c2CDownMsgNum;

  public static final String SERIALIZED_NAME_C2_C_SEND_MSG_USER_NUM = "C2CSendMsgUserNum";
  @SerializedName(SERIALIZED_NAME_C2_C_SEND_MSG_USER_NUM)
  private String c2CSendMsgUserNum;

  public static final String SERIALIZED_NAME_C2_C_A_P_N_S_MSG_NUM = "C2CAPNSMsgNum";
  @SerializedName(SERIALIZED_NAME_C2_C_A_P_N_S_MSG_NUM)
  private String c2CAPNSMsgNum;

  public static final String SERIALIZED_NAME_MAX_ONLINE_NUM = "MaxOnlineNum";
  @SerializedName(SERIALIZED_NAME_MAX_ONLINE_NUM)
  private String maxOnlineNum;

  public static final String SERIALIZED_NAME_DOWN_MSG_NUM = "DownMsgNum";
  @SerializedName(SERIALIZED_NAME_DOWN_MSG_NUM)
  private String downMsgNum;

  public static final String SERIALIZED_NAME_CHAIN_INCREASE = "ChainIncrease";
  @SerializedName(SERIALIZED_NAME_CHAIN_INCREASE)
  private String chainIncrease;

  public static final String SERIALIZED_NAME_CHAIN_DECREASE = "ChainDecrease";
  @SerializedName(SERIALIZED_NAME_CHAIN_DECREASE)
  private String chainDecrease;

  public static final String SERIALIZED_NAME_GROUP_UP_MSG_NUM = "GroupUpMsgNum";
  @SerializedName(SERIALIZED_NAME_GROUP_UP_MSG_NUM)
  private String groupUpMsgNum;

  public static final String SERIALIZED_NAME_GROUP_DOWN_MSG_NUM = "GroupDownMsgNum";
  @SerializedName(SERIALIZED_NAME_GROUP_DOWN_MSG_NUM)
  private String groupDownMsgNum;

  public static final String SERIALIZED_NAME_GROUP_SEND_MSG_USER_NUM = "GroupSendMsgUserNum";
  @SerializedName(SERIALIZED_NAME_GROUP_SEND_MSG_USER_NUM)
  private String groupSendMsgUserNum;

  public static final String SERIALIZED_NAME_GROUP_A_P_N_S_MSG_NUM = "GroupAPNSMsgNum";
  @SerializedName(SERIALIZED_NAME_GROUP_A_P_N_S_MSG_NUM)
  private String groupAPNSMsgNum;

  public static final String SERIALIZED_NAME_GROUP_SEND_MSG_GROUP_NUM = "GroupSendMsgGroupNum";
  @SerializedName(SERIALIZED_NAME_GROUP_SEND_MSG_GROUP_NUM)
  private String groupSendMsgGroupNum;

  public static final String SERIALIZED_NAME_GROUP_JOIN_GROUP_TIMES = "GroupJoinGroupTimes";
  @SerializedName(SERIALIZED_NAME_GROUP_JOIN_GROUP_TIMES)
  private String groupJoinGroupTimes;

  public static final String SERIALIZED_NAME_GROUP_QUIT_GROUP_TIMES = "GroupQuitGroupTimes";
  @SerializedName(SERIALIZED_NAME_GROUP_QUIT_GROUP_TIMES)
  private String groupQuitGroupTimes;

  public static final String SERIALIZED_NAME_GROUP_NEW_GROUP_NUM = "GroupNewGroupNum";
  @SerializedName(SERIALIZED_NAME_GROUP_NEW_GROUP_NUM)
  private String groupNewGroupNum;

  public static final String SERIALIZED_NAME_GROUP_ALL_GROUP_NUM = "GroupAllGroupNum";
  @SerializedName(SERIALIZED_NAME_GROUP_ALL_GROUP_NUM)
  private String groupAllGroupNum;

  public static final String SERIALIZED_NAME_GROUP_DESTROY_GROUP_NUM = "GroupDestroyGroupNum";
  @SerializedName(SERIALIZED_NAME_GROUP_DESTROY_GROUP_NUM)
  private String groupDestroyGroupNum;

  public static final String SERIALIZED_NAME_CALL_BACK_REQ = "CallBackReq";
  @SerializedName(SERIALIZED_NAME_CALL_BACK_REQ)
  private String callBackReq;

  public static final String SERIALIZED_NAME_CALL_BACK_RSP = "CallBackRsp";
  @SerializedName(SERIALIZED_NAME_CALL_BACK_RSP)
  private String callBackRsp;

  public static final String SERIALIZED_NAME_DATE = "Date";
  @SerializedName(SERIALIZED_NAME_DATE)
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

  public String getAppName() {
    return appName;
  }


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

  public String getAppId() {
    return appId;
  }


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

  public String getCompany() {
    return company;
  }


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

  public String getActiveUserNum() {
    return activeUserNum;
  }


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

  public String getRegistUserNumOneDay() {
    return registUserNumOneDay;
  }


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

  public String getRegistUserNumTotal() {
    return registUserNumTotal;
  }


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

  public String getLoginTimes() {
    return loginTimes;
  }


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

  public String getLoginUserNum() {
    return loginUserNum;
  }


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

  public String getUpMsgNum() {
    return upMsgNum;
  }


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

  public String getSendMsgUserNum() {
    return sendMsgUserNum;
  }


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

  public String getApNSMsgNum() {
    return apNSMsgNum;
  }


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

  public String getC2CUpMsgNum() {
    return c2CUpMsgNum;
  }


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

  public String getC2CDownMsgNum() {
    return c2CDownMsgNum;
  }


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

  public String getC2CSendMsgUserNum() {
    return c2CSendMsgUserNum;
  }


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

  public String getC2CAPNSMsgNum() {
    return c2CAPNSMsgNum;
  }


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

  public String getMaxOnlineNum() {
    return maxOnlineNum;
  }


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

  public String getDownMsgNum() {
    return downMsgNum;
  }


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

  public String getChainIncrease() {
    return chainIncrease;
  }


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

  public String getChainDecrease() {
    return chainDecrease;
  }


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

  public String getGroupUpMsgNum() {
    return groupUpMsgNum;
  }


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

  public String getGroupDownMsgNum() {
    return groupDownMsgNum;
  }


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

  public String getGroupSendMsgUserNum() {
    return groupSendMsgUserNum;
  }


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

  public String getGroupAPNSMsgNum() {
    return groupAPNSMsgNum;
  }


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

  public String getGroupSendMsgGroupNum() {
    return groupSendMsgGroupNum;
  }


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

  public String getGroupJoinGroupTimes() {
    return groupJoinGroupTimes;
  }


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

  public String getGroupQuitGroupTimes() {
    return groupQuitGroupTimes;
  }


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

  public String getGroupNewGroupNum() {
    return groupNewGroupNum;
  }


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

  public String getGroupAllGroupNum() {
    return groupAllGroupNum;
  }


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

  public String getGroupDestroyGroupNum() {
    return groupDestroyGroupNum;
  }


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

  public String getCallBackReq() {
    return callBackReq;
  }


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

  public String getCallBackRsp() {
    return callBackRsp;
  }


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

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public GetAppInfoResponseAllOfResult putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
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
        Objects.equals(this.date, getAppInfoResponseAllOfResult.date)&&
        Objects.equals(this.additionalProperties, getAppInfoResponseAllOfResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, appId, company, activeUserNum, registUserNumOneDay, registUserNumTotal, loginTimes, loginUserNum, upMsgNum, sendMsgUserNum, apNSMsgNum, c2CUpMsgNum, c2CDownMsgNum, c2CSendMsgUserNum, c2CAPNSMsgNum, maxOnlineNum, downMsgNum, chainIncrease, chainDecrease, groupUpMsgNum, groupDownMsgNum, groupSendMsgUserNum, groupAPNSMsgNum, groupSendMsgGroupNum, groupJoinGroupTimes, groupQuitGroupTimes, groupNewGroupNum, groupAllGroupNum, groupDestroyGroupNum, callBackReq, callBackRsp, date, additionalProperties);
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
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("AppName");
    openapiFields.add("AppId");
    openapiFields.add("Company");
    openapiFields.add("ActiveUserNum");
    openapiFields.add("RegistUserNumOneDay");
    openapiFields.add("RegistUserNumTotal");
    openapiFields.add("LoginTimes");
    openapiFields.add("LoginUserNum");
    openapiFields.add("UpMsgNum");
    openapiFields.add("SendMsgUserNum");
    openapiFields.add("APNSMsgNum");
    openapiFields.add("C2CUpMsgNum");
    openapiFields.add("C2CDownMsgNum");
    openapiFields.add("C2CSendMsgUserNum");
    openapiFields.add("C2CAPNSMsgNum");
    openapiFields.add("MaxOnlineNum");
    openapiFields.add("DownMsgNum");
    openapiFields.add("ChainIncrease");
    openapiFields.add("ChainDecrease");
    openapiFields.add("GroupUpMsgNum");
    openapiFields.add("GroupDownMsgNum");
    openapiFields.add("GroupSendMsgUserNum");
    openapiFields.add("GroupAPNSMsgNum");
    openapiFields.add("GroupSendMsgGroupNum");
    openapiFields.add("GroupJoinGroupTimes");
    openapiFields.add("GroupQuitGroupTimes");
    openapiFields.add("GroupNewGroupNum");
    openapiFields.add("GroupAllGroupNum");
    openapiFields.add("GroupDestroyGroupNum");
    openapiFields.add("CallBackReq");
    openapiFields.add("CallBackRsp");
    openapiFields.add("Date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetAppInfoResponseAllOfResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetAppInfoResponseAllOfResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAppInfoResponseAllOfResult is not found in the empty JSON string", GetAppInfoResponseAllOfResult.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("AppName") != null && !jsonObj.get("AppName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AppName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AppName").toString()));
      }
      if (jsonObj.get("AppId") != null && !jsonObj.get("AppId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AppId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AppId").toString()));
      }
      if (jsonObj.get("Company") != null && !jsonObj.get("Company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Company").toString()));
      }
      if (jsonObj.get("ActiveUserNum") != null && !jsonObj.get("ActiveUserNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ActiveUserNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ActiveUserNum").toString()));
      }
      if (jsonObj.get("RegistUserNumOneDay") != null && !jsonObj.get("RegistUserNumOneDay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RegistUserNumOneDay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RegistUserNumOneDay").toString()));
      }
      if (jsonObj.get("RegistUserNumTotal") != null && !jsonObj.get("RegistUserNumTotal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RegistUserNumTotal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RegistUserNumTotal").toString()));
      }
      if (jsonObj.get("LoginTimes") != null && !jsonObj.get("LoginTimes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LoginTimes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LoginTimes").toString()));
      }
      if (jsonObj.get("LoginUserNum") != null && !jsonObj.get("LoginUserNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LoginUserNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LoginUserNum").toString()));
      }
      if (jsonObj.get("UpMsgNum") != null && !jsonObj.get("UpMsgNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UpMsgNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UpMsgNum").toString()));
      }
      if (jsonObj.get("SendMsgUserNum") != null && !jsonObj.get("SendMsgUserNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SendMsgUserNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SendMsgUserNum").toString()));
      }
      if (jsonObj.get("APNSMsgNum") != null && !jsonObj.get("APNSMsgNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `APNSMsgNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("APNSMsgNum").toString()));
      }
      if (jsonObj.get("C2CUpMsgNum") != null && !jsonObj.get("C2CUpMsgNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `C2CUpMsgNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("C2CUpMsgNum").toString()));
      }
      if (jsonObj.get("C2CDownMsgNum") != null && !jsonObj.get("C2CDownMsgNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `C2CDownMsgNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("C2CDownMsgNum").toString()));
      }
      if (jsonObj.get("C2CSendMsgUserNum") != null && !jsonObj.get("C2CSendMsgUserNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `C2CSendMsgUserNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("C2CSendMsgUserNum").toString()));
      }
      if (jsonObj.get("C2CAPNSMsgNum") != null && !jsonObj.get("C2CAPNSMsgNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `C2CAPNSMsgNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("C2CAPNSMsgNum").toString()));
      }
      if (jsonObj.get("MaxOnlineNum") != null && !jsonObj.get("MaxOnlineNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MaxOnlineNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MaxOnlineNum").toString()));
      }
      if (jsonObj.get("DownMsgNum") != null && !jsonObj.get("DownMsgNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DownMsgNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DownMsgNum").toString()));
      }
      if (jsonObj.get("ChainIncrease") != null && !jsonObj.get("ChainIncrease").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChainIncrease` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChainIncrease").toString()));
      }
      if (jsonObj.get("ChainDecrease") != null && !jsonObj.get("ChainDecrease").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChainDecrease` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChainDecrease").toString()));
      }
      if (jsonObj.get("GroupUpMsgNum") != null && !jsonObj.get("GroupUpMsgNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupUpMsgNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupUpMsgNum").toString()));
      }
      if (jsonObj.get("GroupDownMsgNum") != null && !jsonObj.get("GroupDownMsgNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupDownMsgNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupDownMsgNum").toString()));
      }
      if (jsonObj.get("GroupSendMsgUserNum") != null && !jsonObj.get("GroupSendMsgUserNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupSendMsgUserNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupSendMsgUserNum").toString()));
      }
      if (jsonObj.get("GroupAPNSMsgNum") != null && !jsonObj.get("GroupAPNSMsgNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupAPNSMsgNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupAPNSMsgNum").toString()));
      }
      if (jsonObj.get("GroupSendMsgGroupNum") != null && !jsonObj.get("GroupSendMsgGroupNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupSendMsgGroupNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupSendMsgGroupNum").toString()));
      }
      if (jsonObj.get("GroupJoinGroupTimes") != null && !jsonObj.get("GroupJoinGroupTimes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupJoinGroupTimes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupJoinGroupTimes").toString()));
      }
      if (jsonObj.get("GroupQuitGroupTimes") != null && !jsonObj.get("GroupQuitGroupTimes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupQuitGroupTimes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupQuitGroupTimes").toString()));
      }
      if (jsonObj.get("GroupNewGroupNum") != null && !jsonObj.get("GroupNewGroupNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupNewGroupNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupNewGroupNum").toString()));
      }
      if (jsonObj.get("GroupAllGroupNum") != null && !jsonObj.get("GroupAllGroupNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupAllGroupNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupAllGroupNum").toString()));
      }
      if (jsonObj.get("GroupDestroyGroupNum") != null && !jsonObj.get("GroupDestroyGroupNum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupDestroyGroupNum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupDestroyGroupNum").toString()));
      }
      if (jsonObj.get("CallBackReq") != null && !jsonObj.get("CallBackReq").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CallBackReq` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CallBackReq").toString()));
      }
      if (jsonObj.get("CallBackRsp") != null && !jsonObj.get("CallBackRsp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CallBackRsp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CallBackRsp").toString()));
      }
      if (jsonObj.get("Date") != null && !jsonObj.get("Date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAppInfoResponseAllOfResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAppInfoResponseAllOfResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAppInfoResponseAllOfResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAppInfoResponseAllOfResult.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAppInfoResponseAllOfResult>() {
           @Override
           public void write(JsonWriter out, GetAppInfoResponseAllOfResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAppInfoResponseAllOfResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetAppInfoResponseAllOfResult instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), Object.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAppInfoResponseAllOfResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAppInfoResponseAllOfResult
  * @throws IOException if the JSON string is invalid with respect to GetAppInfoResponseAllOfResult
  */
  public static GetAppInfoResponseAllOfResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAppInfoResponseAllOfResult.class);
  }

 /**
  * Convert an instance of GetAppInfoResponseAllOfResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

