

# ImportGroupRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ownerAccount** | **String** | 群主 ID，自动添加到群成员中。如果不填，群没有群主 |  [optional] |
|**type** | **String** | 群组类型，包括 Public（陌生人社交群），Private（同新版本中的Work，好友工作群）， ChatRoom（同新版本中的Meeting，会议群）、Community（社群） |  |
|**groupId** | **String** | 为了使得群组 ID 更加简单，便于记忆传播，腾讯云支持 App 在通过 REST API 创建群组时自定义群组 ID。详细请参阅 群组系统（https://cloud.tencent.com/document/product/269/1502） |  [optional] |
|**name** | **String** | 群名称，最长30字节 |  |
|**introduction** | **String** | 群简介，最长240字节 |  [optional] |
|**notification** | **String** | 群公告，最长300字节 |  [optional] |
|**faceUrl** | **String** | 群头像 URL，最长100字节 |  [optional] |
|**maxMemberCount** | **Integer** | 最大群成员数量，最大为6000，不填默认为2000个 |  [optional] |
|**applyJoinOption** | [**ApplyJoinOptionEnum**](#ApplyJoinOptionEnum) | 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群），不填默认为NeedPermission（需要验证） |  [optional] |
|**appDefinedData** | [**List&lt;DefinedData&gt;**](DefinedData.md) | 群组维度的自定义字段，默认情况是没有的，需要开通，详细请参阅 群组系统(https://cloud.tencent.com/document/product/269/1502) |  [optional] |
|**createTime** | **Integer** | 群组的创建时间 |  [optional] |



## Enum: ApplyJoinOptionEnum

| Name | Value |
|---- | -----|
| FREEACCESS | &quot;FreeAccess&quot; |
| NEEDPERMISSION | &quot;NeedPermission&quot; |
| DISABLEAPPLY | &quot;DisableApply&quot; |



