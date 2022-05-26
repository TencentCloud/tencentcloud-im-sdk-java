

# FriendAddRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromAccount** | **String** | 需要为该 UserID 添加好友 |  |
|**addFriendItem** | [**List&lt;FriendAddRequestAddFriendItemInner&gt;**](FriendAddRequestAddFriendItemInner.md) | 好友结构体对象 |  |
|**addType** | **String** | 加好友方式（默认双向加好友方式）：Add_Type_Single 表示单向加好友 Add_Type_Both 表示双向加好友 |  [optional] |
|**forceAddFlags** | [**ForceAddFlagsEnum**](#ForceAddFlagsEnum) | 管理员强制加好友标记：1表示强制加好友，0表示常规加好友方式 |  [optional] |



## Enum: ForceAddFlagsEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



