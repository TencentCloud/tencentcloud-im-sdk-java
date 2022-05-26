

# SendSingleChatMsgResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionStatus** | **String** | 请求处理的结果，OK 表示处理成功，FAIL 表示失败 |  [optional] |
|**errorInfo** | **String** | 错误信息 |  |
|**errorCode** | **Integer** | 错误码，0表示成功，非0表示失败 |  |
|**msgTime** | **Integer** | 消息时间戳，UNIX 时间戳 |  [optional] |
|**msgKey** | **String** | 消息唯一标识，用于撤回。长度不超过50个字符 |  [optional] |



