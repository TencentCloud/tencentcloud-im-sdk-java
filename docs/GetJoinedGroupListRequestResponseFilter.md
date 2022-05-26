

# GetJoinedGroupListRequestResponseFilter

分别包含 GroupBaseInfoFilter 和 SelfInfoFilter 两个过滤器； GroupBaseInfoFilter 表示需要拉取哪些基础信息字段，详情请参阅 群组系统；SelfInfoFilter 表示需要拉取用户在每个群组中的哪些个人资料，详情请参阅 群组系统 。

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupBaseInfoFilter** | **List&lt;String&gt;** | 需要拉取哪些基础信息字段，详情请参阅 群组系统（https://cloud.tencent.com/document/product/269/1502#GroupBaseInfoFilter） |  [optional] |
|**selfInfoFilter** | **List&lt;String&gt;** | 需要拉取用户在每个群组中的哪些个人资料，详情请参阅 群组系统 （https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter）。 |  [optional] |



