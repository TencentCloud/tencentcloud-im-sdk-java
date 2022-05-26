

# FriendGetListRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromAccount** | **String** | 指定要拉取好友数据的用户的 UserID |  |
|**toAccount** | **List&lt;String&gt;** | 好友的 UserID 列表 建议每次请求的好友数不超过100，避免因数据量太大导致回包失败 |  |
|**tagList** | **List&lt;String&gt;** | 指定要拉取的资料字段及好友字段：标配资料字段（https://cloud.tencent.com/document/product/269/1500#.E6.A0.87.E9.85.8D.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5）、自定义资料字段（https://cloud.tencent.com/document/product/269/1500#.E8.87.AA.E5.AE.9A.E4.B9.89.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5）、标配好友字段（https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5）、自定义好友字段（https://cloud.tencent.com/document/product/269/1501#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5） |  |



