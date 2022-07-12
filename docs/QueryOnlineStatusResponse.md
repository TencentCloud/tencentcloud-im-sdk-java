

# QueryOnlineStatusResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionStatus** | **String** | 请求处理的结果，OK 表示处理成功，FAIL 表示失败 |  [optional] |
|**errorInfo** | **String** | 错误信息 |  [optional] |
|**errorCode** | **Integer** | 错误码，0表示成功，非0表示失败 |  |
|**queryResult** | [**List&lt;QueryOnlineStatusResponseAllOfQueryResult&gt;**](QueryOnlineStatusResponseAllOfQueryResult.md) | 返回的用户在线状态结构化信息 |  [optional] |
|**errorList** | [**List&lt;QueryOnlineStatusResponseAllOfErrorList&gt;**](QueryOnlineStatusResponseAllOfErrorList.md) | 状态查询失败的帐号列表，在此列表中的目标帐号，状态查询失败或目标帐号不存在。若状态全部查询成功，则 ErrorList 为空 |  [optional] |



