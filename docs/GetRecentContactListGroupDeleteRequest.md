

# GetRecentContactListGroupDeleteRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromAccount** | **String** | 请求删除该 UserID 的会话 |  |
|**type** | [**TypeEnum**](#TypeEnum) | 会话类型：1 表示 C2C 会话；2 表示 G2C 会话 |  |
|**toAccount** | **String** | C2C 会话才赋值，C2C 会话方的 UserID |  [optional] |
|**toGroupid** | **String** | G2C 会话才赋值，G2C 会话的群 ID |  [optional] |
|**clearRamble** | [**ClearRambleEnum**](#ClearRambleEnum) | 是否清理漫游消息：1 表示清理漫游消息；0 表示不清理漫游消息 |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



## Enum: ClearRambleEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



