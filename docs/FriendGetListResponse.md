

# FriendGetListResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionStatus** | **String** | 请求处理的结果，OK 表示处理成功，FAIL 表示失败 |  [optional] |
|**errorInfo** | **String** | 错误信息 |  [optional] |
|**errorCode** | **Integer** | 错误码，0表示成功，非0表示失败 |  |
|**infoItem** | [**List&lt;FriendGetListResponseAllOfInfoItem&gt;**](FriendGetListResponseAllOfInfoItem.md) | 好友对象数组，每一个好友对象都包含一个 To_Account 字段和一个 SnsProfileItem 数组 |  [optional] |
|**failAccount** | **List&lt;String&gt;** | 返回处理失败的 UserID 列表，仅当存在失败用户时才返回该字段 |  [optional] |
|**errorDisplay** | **String** | 详细的客户端展示信息 |  [optional] |



