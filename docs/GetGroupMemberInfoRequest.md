

# GetGroupMemberInfoRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupId** | **String** | 需要拉取成员信息的群组的 ID |  |
|**memberInfoFilter** | **List&lt;String&gt;** | 需要获取哪些信息， 如果没有该字段则为群成员全部资料，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter） |  [optional] |
|**memberRoleFilter** | **List&lt;String&gt;** | 拉取指定身份的群成员资料。如没有填写该字段，默认为所有身份成员资料，成员身份可以为：“Owner”，“Admin”，“Member” |  [optional] |
|**appDefinedDataFilterGroupMember** | **List&lt;String&gt;** | 默认情况是没有的。该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段，群成员维度的自定义字段详情请参阅 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5） |  [optional] |
|**limit** | **Integer** | 一次最多获取多少个成员的资料，不得超过6000。如果不填，则获取群内全部成员的信息 |  [optional] |
|**offset** | **Integer** | 从第几个成员开始获取，如果不填则默认为0，表示从第一个成员开始获取 |  [optional] |
|**next** | **String** | 上一次拉取到的成员位置，社群必填，社群不支持 Offset 参数，使用 Next 参数，首次调用填写\&quot;\&quot;，续拉使用返回中的 Next 值 |  [optional] |



