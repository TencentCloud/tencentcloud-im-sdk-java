

# GetC2cUnreadMsgNumResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionStatus** | **String** | 请求处理的结果，OK 表示处理成功，FAIL 表示失败 |  [optional] |
|**errorInfo** | **String** | 错误信息 |  [optional] |
|**errorCode** | **Integer** | 错误码，0表示成功，非0表示失败 |  |
|**allC2CUnreadMsgNum** | **Integer** | 单聊消息总未读数 |  [optional] |
|**c2CUnreadMsgNumList** | [**List&lt;GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList&gt;**](GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.md) | 单聊会话List |  [optional] |
|**errorList** | [**List&lt;GetC2cUnreadMsgNumResponseAllOfErrorList&gt;**](GetC2cUnreadMsgNumResponseAllOfErrorList.md) |  |  [optional] |



