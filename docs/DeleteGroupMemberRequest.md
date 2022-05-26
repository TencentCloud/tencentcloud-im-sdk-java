

# DeleteGroupMemberRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupId** | **String** | 操作的群 ID |  |
|**silence** | [**SilenceEnum**](#SilenceEnum) | 是否静默删人。0表示非静默删人，1表示静默删人。静默即删除成员时不通知群里所有成员，只通知被删除群成员。不填写该字段时默认为0 |  [optional] |
|**reason** | **String** | 踢出用户原因 |  [optional] |
|**memberToDelAccount** | **List&lt;String&gt;** | 待删除的群成员 |  |



## Enum: SilenceEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



