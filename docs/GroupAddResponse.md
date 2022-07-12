

# GroupAddResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionStatus** | **String** | 请求处理的结果，OK 表示处理成功，FAIL 表示失败 |  [optional] |
|**errorInfo** | **String** | 错误信息 |  [optional] |
|**errorCode** | **Integer** | 错误码，0表示成功，非0表示失败 |  |
|**resultItem** | [**List&lt;GroupAddResponseAllOfResultItem&gt;**](GroupAddResponseAllOfResultItem.md) | 好友加入新增分组的结果对象数组 |  [optional] |
|**failAccount** | **List&lt;String&gt;** | 返回处理失败的用户列表，仅当存在失败用户时才返回该字段 |  [optional] |
|**currentSequence** | **Integer** | 返回最新的分组 Sequence |  [optional] |
|**errorDisplay** | **String** | 详细的客户端展示信息 |  [optional] |



