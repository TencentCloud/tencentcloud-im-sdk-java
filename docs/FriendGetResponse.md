

# FriendGetResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionStatus** | **String** | 请求处理的结果，OK 表示处理成功，FAIL 表示失败 |  [optional] |
|**errorInfo** | **String** | 错误信息 |  |
|**errorCode** | **Integer** | 错误码，0表示成功，非0表示失败 |  |
|**resultItem** | [**List&lt;FriendGetResponseAllOfResultItem&gt;**](FriendGetResponseAllOfResultItem.md) |  |  [optional] |
|**failAccount** | **List&lt;String&gt;** | 返回处理失败的用户列表，仅当存在失败用户时才返回该字段 |  [optional] |
|**errorDisplay** | **Integer** | 详细的客户端展示信息 |  [optional] |



