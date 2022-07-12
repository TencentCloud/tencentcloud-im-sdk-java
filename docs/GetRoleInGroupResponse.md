

# GetRoleInGroupResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionStatus** | **String** | 请求处理的结果，OK 表示处理成功，FAIL 表示失败 |  [optional] |
|**errorInfo** | **String** | 错误信息 |  [optional] |
|**errorCode** | **Integer** | 错误码，0表示成功，非0表示失败 |  |
|**userIdList** | [**List&lt;GetRoleInGroupResponseAllOfUserIdList&gt;**](GetRoleInGroupResponseAllOfUserIdList.md) | 拉取到的成员角色，包括：Owner(群主)，Admin(群管理员)，Member(普通群成员），NotMember(非群成员) |  [optional] |



