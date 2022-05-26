

# ImportGroupMsgRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupId** | **String** | 要导入消息的群 ID |  |
|**recentContactFlag** | **Integer** | 会话更新识别，为1的时候标识触发会话更新，默认不触发（avchatroom 群不支持）。 |  [optional] |
|**msgList** | **String** | 导入的消息列表 |  |
|**fromAccount** | **String** | 指定消息发送者 |  |
|**sendTime** | **Integer** | 消息发送时间 |  |
|**random** | **Integer** | 32位无符号整数；如果5分钟内两条消息的随机值相同，后一条消息将被当做重复消息而丢弃 |  [optional] |
|**msgBody** | [**List&lt;TIMMsgElement&gt;**](TIMMsgElement.md) |  |  |



