

# GetGroupInfoRequestResponseFilter

包含三个过滤器：GroupBaseInfoFilter，MemberInfoFilter，AppDefinedDataFilter_Group，分别是基础信息字段过滤器，成员信息字段过滤器，群组维度的自定义字段过滤器

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupBaseInfoFilter** | **List&lt;String&gt;** | 基础信息字段过滤器，指定需要获取的基础信息字段，基础信息字段详情请参阅 群基础资料（https://cloud.tencent.com/document/product/269/1502#GroupBaseInfoFilter） |  [optional] |
|**memberInfoFilter** | **List&lt;String&gt;** | 成员信息字段过滤器，指定需要获取的成员信息字段，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter） |  [optional] |
|**appDefinedDataFilterGroup** | **List&lt;String&gt;** | 该字段用来群组维度的自定义字段过滤器，指定需要获取的群组维度的自定义字段，详情请参阅 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5） |  [optional] |
|**appDefinedDataFilterGroupMember** | **List&lt;String&gt;** | 该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段，详情请参阅 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5） |  [optional] |



