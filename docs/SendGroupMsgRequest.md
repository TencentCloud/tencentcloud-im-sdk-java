

# SendGroupMsgRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupId** | **String** | 向哪个群组发送消息 |  |
|**random** | **Integer** | 无符号32位整数。如果5分钟内两条消息的随机值相同，后一条消息将被当做重复消息而丢弃 |  |
|**msgPriority** | **String** | 消息的优先级 |  [optional] |
|**msgBody** | [**List&lt;TIMMsgElement&gt;**](TIMMsgElement.md) | 消息体，详细可参阅 消息格式描述(https://cloud.tencent.com/document/product/269/2720) |  |
|**fromAccount** | **String** | 消息来源帐号，选填。如果不填写该字段，则默认消息的发送者为调用该接口时使用的 App 管理员帐号。除此之外，App 亦可通过该字段“伪造”消息的发送者，从而实现一些特殊的功能需求。需要注意的是，如果指定该字段，必须要确保字段中的帐号是存在的 |  [optional] |
|**offlinePushInfo** | [**OfflinePushInfo**](OfflinePushInfo.md) |  |  [optional] |
|**forbidCallbackControl** | **List&lt;ForbidCallbackControl&gt;** | 消息回调禁止开关，只对单条消息有效，ForbidBeforeSendMsgCallback 表示禁止发消息前回调，ForbidAfterSendMsgCallback 表示禁止发消息后回调 |  [optional] |
|**onlineOnlyFlag** | [**OnlineOnlyFlagEnum**](#OnlineOnlyFlagEnum) | 1表示消息仅发送在线成员，默认0表示发送所有成员，AVChatRoom(直播群)不支持该参数 |  [optional] |
|**sendMsgControl** | **List&lt;SendMsgControl&gt;** | 消息发送权限，NoLastMsg 只对单条消息有效，表示不更新最近联系人会话；NoUnread 不计未读，只对单条消息有效。（如果该消息 OnlineOnlyFlag 设置为1，则不允许使用该字段。） |  [optional] |
|**cloudCustomData** | **String** | 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到） |  [optional] |



## Enum: OnlineOnlyFlagEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



