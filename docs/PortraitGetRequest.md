

# PortraitGetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**toAccount** | **List&lt;String&gt;** | 需要拉取这些 UserID 的资料；注意：每次拉取的用户数不得超过100，避免因回包数据量太大以致回包失败 |  |
|**tagList** | **List&lt;String&gt;** | 指定要拉取的资料字段的 Tag，支持的字段有：1. 标配资料字段，详情可参见 标配资料字段（https://cloud.tencent.com/document/product/269/1500#.E6.A0.87.E9.85.8D.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5） 2. 自定义资料字段，详情可参见 自定义资料字段（https://cloud.tencent.com/document/product/269/1500#.E8.87.AA.E5.AE.9A.E4.B9.89.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5） |  |



