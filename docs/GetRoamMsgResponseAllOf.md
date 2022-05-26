

# GetRoamMsgResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**complete** | [**CompleteEnum**](#CompleteEnum) | 是否全部拉取，0表示未全部拉取，需要续拉，1表示已全部拉取 |  [optional] |
|**msgCnt** | **Integer** | 本次拉取到的消息条数 |  [optional] |
|**lastMsgTime** | **Integer** | 本次拉取到的消息里的最后一条消息的时间 |  [optional] |
|**lastMsgKey** | **String** | 本次拉取到的消息里的最后一条消息的标识 |  [optional] |
|**msgList** | [**List&lt;GetRoamMsgResponseAllOfMsgList&gt;**](GetRoamMsgResponseAllOfMsgList.md) | 返回的消息列表 |  [optional] |



## Enum: CompleteEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



