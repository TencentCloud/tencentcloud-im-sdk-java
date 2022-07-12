

# GroupMsgGetSimpleResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionStatus** | **String** | 请求处理的结果，OK 表示处理成功，FAIL 表示失败 |  [optional] |
|**errorInfo** | **String** | 错误信息 |  [optional] |
|**errorCode** | **Integer** | 错误码，0表示成功，非0表示失败 |  |
|**groupId** | **String** | 请求中的群组 ID |  [optional] |
|**isFinished** | **Integer** | 是否返回了请求区间的全部消息 当成功返回了请求区间的全部消息时，值为1;当消息长度太长或者区间太大（超过20）导致无法返回全部消息时，值为0;当消息长度太长或者区间太大（超过20）且所有消息都过期时，值为2 |  [optional] |
|**rspMsgList** | [**List&lt;GroupMsgGetSimpleResponseAllOfRspMsgList&gt;**](GroupMsgGetSimpleResponseAllOfRspMsgList.md) | 返回的消息列表 |  [optional] |



