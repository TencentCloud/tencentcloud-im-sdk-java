

# GetJoinedGroupListRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**memberAccount** | **String** | 需要查询的用户帐号 |  |
|**withHugeGroups** | [**WithHugeGroupsEnum**](#WithHugeGroupsEnum) | 是否获取用户加入的 AVChatRoom(直播群)，0表示不获取，1表示获取。默认为0 |  [optional] |
|**withNoActiveGroups** | [**WithNoActiveGroupsEnum**](#WithNoActiveGroupsEnum) | 是否获取用户已加入但未激活的 Private（即新版本中 Work，好友工作群) 群信息，0表示不获取，1表示获取。默认为0 |  [optional] |
|**limit** | **Integer** | 单次拉取的群组数量，如果不填代表所有群组 |  [optional] |
|**offset** | **Integer** | 从第多少个群组开始拉取 |  [optional] |
|**groupType** | **String** | 拉取哪种群组类型，例如 Public(陌生人社交群)，Private（即新版本Work，好友工作群)，ChatRoom （即新版本Meeting，会议群），AVChatRoom(直播群)，Community（社群），不填为拉取所有 |  [optional] |
|**responseFilter** | [**GetJoinedGroupListRequestResponseFilter**](GetJoinedGroupListRequestResponseFilter.md) |  |  [optional] |



## Enum: WithHugeGroupsEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: WithNoActiveGroupsEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



