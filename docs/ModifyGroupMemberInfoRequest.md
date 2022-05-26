

# ModifyGroupMemberInfoRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupId** | **String** | 操作的群 ID |  |
|**memberAccount** | **String** | 要操作的群成员 |  |
|**role** | **String** | 成员身份，Admin/Member 分别为设置/取消管理员 |  [optional] |
|**msgFlag** | **String** | 消息屏蔽类型 |  [optional] |
|**nameCard** | **String** | 群名片（最大不超过50个字节） |  [optional] |
|**appMemberDefinedData** | [**List&lt;ModifyGroupMemberInfoRequestAppMemberDefinedDataInner&gt;**](ModifyGroupMemberInfoRequestAppMemberDefinedDataInner.md) | 群成员维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台（https://console.cloud.tencent.com/im） 进行配置，详情请参阅 群组系统（https://cloud.tencent.com/document/product/269/1502） |  [optional] |
|**shutUpTime** | **Integer** | 需禁言时间，单位为秒，0表示取消禁言 |  [optional] |



