

# GroupMsgGetSimpleResponseAllOfRspMsgList


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromAccount** | **String** | 消息的发送者 |  [optional] |
|**isPlaceMsg** | **Integer** | 是否是空洞消息，当消息被删除或者消息过期后，MsgBody 为空，该字段为1，撤回的消息，该字段为2 |  [optional] |
|**msgPriority** | **Integer** | 消息的优先级，用于消息去重，有客户端发消息时填写，如果没有填，服务端会自动生成，1表示 High 优先级消息，2表示 Normal 优先级消息，3表示 Low 优先级消息，4表示 Lowest 优先级消息 |  [optional] |
|**msgRandom** | **Integer** | 消息随机值，用于对消息去重，有客户端发消息时填写，如果没有填，服务端会自动生成 |  [optional] |
|**msgSeq** | **Integer** | 消息 seq，用于标识唯一消息，值越小发送的越早 |  [optional] |
|**msgTimeStamp** | **Integer** | 消息被发送的时间戳，server 的时间 |  [optional] |
|**msgBody** | [**List&lt;TIMMsgElement&gt;**](TIMMsgElement.md) |  |  [optional] |
|**isSystemMsg** | **Integer** | 字段为1时表示系统消息 |  [optional] |



