

# CreateGroupRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ownerAccount** | **String** | 群主 ID（需是 已导入(https://cloud.tencent.com/document/product/269/1608))的帐号）。填写后自动添加到群成员中；如果不填，群没有群主 |  [optional] |
|**type** | **GroupType** |  |  |
|**groupId** | **String** | 为了使得群组 ID 更加简单，便于记忆传播，腾讯云支持 App 在通过 REST API 创建群组时 自定义群组 ID(https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E7.BE.A4.E7.BB.84-id) |  [optional] |
|**name** | **String** | 群名称，最长30字节，使用 UTF-8 编码，1个汉字占3个字节 |  |
|**introduction** | **String** | 群简介，最长240字节，使用 UTF-8 编码，1个汉字占3个字节 |  [optional] |
|**notification** | **String** | 群公告，最长300字节，使用 UTF-8 编码，1个汉字占3个字节 |  [optional] |
|**faceUrl** | **String** | 群头像 URL，最长100字节 |  [optional] |
|**maxMemberCount** | **Integer** | 最大群成员数量，缺省时的默认值：付费套餐包上限，例如体验版是20，如果升级套餐包，需按照修改群基础资料修改这个字段 |  [optional] |
|**applyJoinOption** | [**ApplyJoinOptionEnum**](#ApplyJoinOptionEnum) | 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群），不填默认为 NeedPermission（需要验证） 仅当创建支持申请加群的 群组(https://cloud.tencent.com/document/product/269/1502#.E5.8A.A0.E7.BE.A4.E6.96.B9.E5.BC.8F.E5.B7.AE.E5.BC.82) 时，该字段有效 |  [optional] |
|**appDefinedData** | [**List&lt;DefinedData&gt;**](DefinedData.md) |  |  [optional] |
|**memberList** | [**List&lt;CreateGroupRequestMemberListInner&gt;**](CreateGroupRequestMemberListInner.md) | 群组维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台(https://console.cloud.tencent.com/im) 进行配置，详情请参阅 自定义字段(https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5) |  [optional] |



## Enum: ApplyJoinOptionEnum

| Name | Value |
|---- | -----|
| FREEACCESS | &quot;FreeAccess&quot; |
| NEEDPERMISSION | &quot;NeedPermission&quot; |
| DISABLEAPPLY | &quot;DisableApply&quot; |



