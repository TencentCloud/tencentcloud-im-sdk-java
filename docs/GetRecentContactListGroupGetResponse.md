

# GetRecentContactListGroupGetResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionStatus** | **String** | 请求处理的结果，OK 表示处理成功，FAIL 表示失败 |  [optional] |
|**errorInfo** | **String** | 错误信息 |  [optional] |
|**errorCode** | **Integer** | 错误码，0表示成功，非0表示失败 |  |
|**sessionItem** | [**List&lt;GetRecentContactListGroupGetResponseAllOfSessionItem&gt;**](GetRecentContactListGroupGetResponseAllOfSessionItem.md) | 会话对象数组 |  [optional] |
|**completeFlag** | **Integer** | 结束标识：1 表示已返回全量会话，0 表示还有会话没拉完 |  [optional] |
|**timeStamp** | **Integer** | 普通会话下一页拉取的起始时间，分页拉取时通过请求包的 TimeStamp 字段带给移动通信后台 |  [optional] |
|**startIndex** | **Integer** | 普通会话下一页拉取的起始位置，分页拉取时通过请求包的 StartIndex 字段带给移动通信后台 |  [optional] |
|**topTimeStamp** | **Integer** | 置顶会话下一页拉取的起始时间，分页拉取时通过请求包的 TopTimeStamp 字段带给移动通信后台 |  [optional] |
|**topStartIndex** | **Integer** | 置顶会话下一页拉取的起始位置，分页拉取时通过请求包的 TopStartIndex 字段带给移动通信后台 |  [optional] |
|**errorDisplay** | **String** | 详细的客户端展示信息 |  [optional] |



