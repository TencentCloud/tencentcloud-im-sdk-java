

# GetRecentContactListGroupGetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromAccount** | **String** | 填 UserID，请求拉取该用户的会话列表 |  |
|**timeStamp** | **Integer** | 普通会话的起始时间，第一页填 0 |  |
|**startIndex** | **Integer** | 普通会话的起始位置，第一页填 0 |  |
|**topTimeStamp** | **Integer** | 置顶会话的起始时间，第一页填 0 |  |
|**topStartIndex** | **Integer** | 置顶会话的起始位置，第一页填 0 |  |
|**assistFlags** | **Integer** | 会话辅助标志位： bit 0 - 是否支持置顶会话 bit 1 - 是否返回空会话 bit 2 - 是否支持置顶会话分页 |  |



