

# ModifyGroupBaseInfoRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupId** | **String** | 需要拉取成员信息的群组的 ID |  |
|**name** | **String** | 群名称，最长30字节 |  [optional] |
|**introduction** | **String** | 群简介，最长240字节 |  [optional] |
|**notification** | **String** | 群公告，最长300字节 |  [optional] |
|**faceUrl** | **String** | 群头像 URL，最长100字节 |  [optional] |
|**maxMemberNum** | **Integer** | 最大群成员数量；私有群、公开群和聊天室：该字段阈值请参考 群组系统（https://cloud.tencent.com/document/product/269/1502#.E7.BE.A4.E7.BB.84.E9.99.90.E5.88.B6.E5.B7.AE.E5.BC.82） 和 计费概述（https://cloud.tencent.com/document/product/269/40267#.E5.9F.BA.E7.A1.80.E6.9C.8D.E5.8A.A1.E8.AF.A6.E6.83.85） 中的群成员人数上限相关说明；音视频聊天室和在线成员广播大群：该字段为无效字段，无需填写 |  [optional] |
|**applyJoinOption** | **String** | 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群） |  [optional] |
|**appDefinedData** | [**List&lt;GetGroupMemberInfoResponseAllOfAppMemberDefinedData&gt;**](GetGroupMemberInfoResponseAllOfAppMemberDefinedData.md) | 默认情况是没有的。开通群组维度的自定义字段详情请参见 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5） |  [optional] |
|**shutUpAllMember** | **String** | 群内群成员禁言，只有群管理员和群主以及系统管理员可以发言 设置全员禁言（选填）:\&quot;On\&quot;开启，\&quot;Off\&quot;关闭 |  [optional] |



