

# QueryOnlineStatusRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**toAccount** | **List&lt;String&gt;** | 需要查询这些 UserID 的登录状态，一次最多查询500个 UserID 的状态 |  |
|**isNeedDetail** | [**IsNeedDetailEnum**](#IsNeedDetailEnum) | 是否需要返回详细的登录平台信息。0表示不需要，1表示需要 |  [optional] |



## Enum: IsNeedDetailEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



