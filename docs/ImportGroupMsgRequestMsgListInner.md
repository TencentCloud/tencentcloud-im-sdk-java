

# ImportGroupMsgRequestMsgListInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromAccount** | **String** | 指定消息发送者 |  [optional] |
|**sendTime** | **Integer** | 消息发送时间 |  [optional] |
|**random** | **Integer** | 32位无符号整数；如果5分钟内两条消息的随机值相同，后一条消息将被当做重复消息而丢弃 |  [optional] |
|**msgBody** | [**List&lt;TIMMsgElement&gt;**](TIMMsgElement.md) |  |  [optional] |



