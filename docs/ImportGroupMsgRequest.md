

# ImportGroupMsgRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupId** | **String** | 要导入消息的群 ID |  |
|**recentContactFlag** | **Integer** | 会话更新识别，为1的时候标识触发会话更新，默认不触发（avchatroom 群不支持）。 |  [optional] |
|**msgList** | [**List&lt;ImportGroupMsgRequestMsgListInner&gt;**](ImportGroupMsgRequestMsgListInner.md) | 导入的消息列表 |  |



