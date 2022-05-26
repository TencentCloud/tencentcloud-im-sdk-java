

# AddGroupMemberRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupId** | **String** | 操作的群 ID |  |
|**silence** | [**SilenceEnum**](#SilenceEnum) | 是否静默加人。0：非静默加人；1：静默加人。不填该字段默认为0 |  [optional] |
|**memberList** | [**List&lt;AddGroupMemberRequestMemberListInner&gt;**](AddGroupMemberRequestMemberListInner.md) | 待添加的群成员数组 |  |



## Enum: SilenceEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



