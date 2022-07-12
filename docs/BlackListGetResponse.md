

# BlackListGetResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionStatus** | **String** | 请求处理的结果，OK 表示处理成功，FAIL 表示失败 |  [optional] |
|**errorInfo** | **String** | 错误信息 |  [optional] |
|**errorCode** | **Integer** | 错误码，0表示成功，非0表示失败 |  |
|**blackListItem** | [**List&lt;BlackListGetResponseAllOfBlackListItem&gt;**](BlackListGetResponseAllOfBlackListItem.md) | 黑名单对象数组，每一个黑名单对象都包括了 To_Account 和 AddBlackTimeStamp |  [optional] |
|**startIndex** | **Integer** | 下页拉取的起始位置，0表示已拉完 |  [optional] |
|**curruentSequence** | **Integer** | 黑名单最新的 Seq |  [optional] |
|**errorDisplay** | **String** | 详细的客户端展示信息 |  [optional] |



