

# FriendImportRequestAddFriendItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toAccount** | **String** | 好友的 UserID | 
**remark** | **String** | From_Account 对 To_Account 的好友备注，详情可参见 标配好友字段(https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5) |  [optional]
**remarkTime** | **Integer** | From_Account 对 To_Account 的好友备注时间 |  [optional]
**groupName** | **List&lt;String&gt;** | From_Account 对 To_Account 的分组信息，详情可参见 标配好友字段(https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5) |  [optional]
**addSource** | **String** | 加好友来源字段，详情可参见 标配好友字段（https://cloud.tencent.com/document/product/269/1501#.E6.A0.87.E9.85.8D.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5） | 
**addWording** | **String** | From_Account 和 To_Account 形成好友关系时的附言信息，详情可参见 标配好友字段（标配好友字段） |  [optional]
**addTime** | **Integer** | From_Account 和 To_Account 形成好友关系的时间 |  [optional]
**customItem** | [**List&lt;FriendImportRequestCustomItem&gt;**](FriendImportRequestCustomItem.md) | From_Account 对 To_Account 的自定义好友数据，每一个成员都包含一个 Tag 字段和一个 Value 字段，详情可参见 自定义好友字段（https://cloud.tencent.com/document/product/269/1501#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.A5.BD.E5.8F.8B.E5.AD.97.E6.AE.B5） |  [optional]



