

# GetGroupMemberInfoResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionStatus** | **String** | 请求处理的结果，OK 表示处理成功，FAIL 表示失败 |  [optional] |
|**errorInfo** | **String** | 错误信息 |  |
|**errorCode** | **Integer** | 错误码，0表示成功，非0表示失败 |  |
|**memberNum** | **Integer** | 本群组的群成员总数 |  [optional] |
|**memberList** | [**List&lt;GetGroupMemberInfoResponseAllOfMemberList&gt;**](GetGroupMemberInfoResponseAllOfMemberList.md) | 获取到的群成员列表，其中包含了全部或者指定的群成员信息，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter） |  [optional] |
|**appMemberDefinedData** | [**List&lt;GetGroupMemberInfoResponseAllOfAppMemberDefinedData&gt;**](GetGroupMemberInfoResponseAllOfAppMemberDefinedData.md) | 返回的群成员自定义字段信息 |  [optional] |
|**next** | **String** | 下一次请求应该传的 Next 值，仅查询 Community（社群）时会返回该字段 |  [optional] |



