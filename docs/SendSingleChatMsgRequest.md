

# SendSingleChatMsgRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**syncOtherMachine** | [**SyncOtherMachineEnum**](#SyncOtherMachineEnum) | 1：把消息同步到 From_Account 在线终端和漫游上；2：消息不同步至 From_Account；若不填写默认情况下会将消息存 From_Account 漫游 |  [optional] |
|**fromAccount** | **String** | 消息发送方 UserID（用于指定发送消息方帐号） |  [optional] |
|**toAccount** | **String** | 消息接收方 UserID |  |
|**msgLifeTime** | **Integer** | 消息离线保存时长（单位：秒），最长为7天（604800秒） 若设置该字段为0，则消息只发在线用户，不保存离线 若设置该字段超过7天（604800秒），仍只保存7天 若不设置该字段，则默认保存7天 |  [optional] |
|**msgSeq** | **Integer** | 消息序列号（32位无符号整数），后台会根据该字段去重及进行同秒内消息的排序，详细规则请看本接口的功能说明。若不填该字段，则由后台填入随机数 |  [optional] |
|**msgRandom** | **Integer** | 消息随机数（32位无符号整数），后台用于同一秒内的消息去重。请确保该字段填的是随机 |  |
|**msgTimeStamp** | **Integer** | 消息时间戳，UNIX 时间戳（单位：秒） |  [optional] |
|**forbidCallbackControl** | **List&lt;String&gt;** | 消息回调禁止开关，只对本条消息有效，ForbidBeforeSendMsgCallback 表示禁止发消息前回调，ForbidAfterSendMsgCallback 表示禁止发消息后回调 |  [optional] |
|**sendMsgControl** | **List&lt;String&gt;** | 消息发送控制选项，是一个 String 数组，只对本条消息有效。\&quot;NoUnread\&quot;表示该条消息不计入未读数。\&quot;NoLastMsg\&quot;表示该条消息不更新会话列表。\&quot;WithMuteNotifications\&quot;表示该条消息的接收方对发送方设置的免打扰选项生效（默认不生效）。 |  [optional] |
|**msgBody** | [**List&lt;TIMMsgElement&gt;**](TIMMsgElement.md) |  |  |
|**cloudCustomData** | **String** |  |  [optional] |
|**offlinePushInfo** | [**OfflinePushInfo**](OfflinePushInfo.md) |  |  [optional] |



## Enum: SyncOtherMachineEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



