

# GetRoamMsgRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromAccount** | **String** | 会话其中一方的 UserID，若已指定发送消息方帐号，则为消息发送方 |  |
|**toAccount** | **String** | 会话其中一方的 UserID |  |
|**maxCnt** | **Integer** | 请求的消息条数 |  |
|**minTime** | **Integer** | 请求的消息时间范围的最小值 |  |
|**maxTime** | **Integer** | 请求的消息时间范围的最大值 |  |
|**lastMsgKey** | **String** | 上一次拉取到的最后一条消息的 MsgKey，续拉时需要填该字段,填写方法见示例（https://cloud.tencent.com/document/product/269/42794） |  [optional] |



