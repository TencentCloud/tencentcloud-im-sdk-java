

# GroupMsgRecallResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionStatus** | **String** | 请求处理的结果，OK 表示处理成功，FAIL 表示失败 |  [optional] |
|**errorInfo** | **String** | 错误信息 |  [optional] |
|**errorCode** | **Integer** | 错误码，0表示成功，非0表示失败 |  |
|**recallRetList** | [**List&lt;GroupMsgRecallResponseAllOfRecallRetList&gt;**](GroupMsgRecallResponseAllOfRecallRetList.md) | 消息撤回请求的详细结果 |  [optional] |
|**msgSeq** | **Integer** | 单个被撤回消息的 seq |  [optional] |
|**retCode** | **Integer** | 单个消息的被撤回结果：0表示成功；其它表示失败，参考下文错误码说明 |  [optional] |



