

# FriendGetResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionStatus** | **String** | 请求处理的结果，OK 表示处理成功，FAIL 表示失败 |  [optional] |
|**errorInfo** | **String** | 错误信息 |  [optional] |
|**errorCode** | **Integer** | 错误码，0表示成功，非0表示失败 |  |
|**userDataItem** | [**List&lt;FriendGetResponseAllOfUserDataItem&gt;**](FriendGetResponseAllOfUserDataItem.md) |  |  [optional] |
|**standardSequence** | **Integer** | 标配好友数据的 Sequence，客户端可以保存该 Sequence，下次请求时通过请求的 StandardSequence 字段返回给后台 |  [optional] |
|**customSequence** | **Integer** | 自定义好友数据的 Sequence，客户端可以保存该 Sequence，下次请求时通过请求的 CustomSequence 字段返回给后台 |  [optional] |
|**friendNum** | **Integer** | 好友总数 |  [optional] |
|**completeFlag** | **Integer** | 分页的结束标识，非0值表示已完成全量拉取 |  [optional] |
|**nextStartIndex** | **Integer** | 分页接口下一页的起始位置 |  [optional] |
|**errorDisplay** | **String** | 详细的客户端展示信息 |  [optional] |



