

# GetRoamMsgResponseAllOfMsgList


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromAccount** | **Integer** | 消息发送方 UserID |  [optional] |
|**toAccount** | **Integer** | 消息接收方 UserID |  [optional] |
|**msgRandom** | **Integer** | 消息随机数（32位无符号整数），后台用于同一秒内的消息去重。请确保该字段填的是随机 |  [optional] |
|**msgTimeStamp** | **Integer** | 消息时间戳，UNIX 时间戳（单位：秒 |  [optional] |
|**msgFlagBits** | **Integer** | 该条消息的属性，0表示正常消息，8表示被撤回的消息 |  [optional] |
|**msgKey** | **String** | 标识该条消息，可用于 REST API（https://cloud.tencent.com/document/product/269/38980） 撤回单聊消息 |  [optional] |
|**msgBody** | [**List&lt;TIMMsgElement&gt;**](TIMMsgElement.md) | 消息内容 |  [optional] |
|**cloudCustomData** | **String** | 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到） |  [optional] |



