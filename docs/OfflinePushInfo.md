

# OfflinePushInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pushFlag** | [**PushFlagEnum**](#PushFlagEnum) | 0表示推送，1表示不离线推送。 |  [optional] |
|**title** | **String** | 离线推送标题。该字段为 iOS 和 Android 共用。 |  [optional] |
|**desc** | **String** | 离线推送内容。该字段会覆盖上面各种消息元素 TIMMsgElement 的离线推送展示文本。若发送的消息只有一个 TIMCustomElem 自定义消息元素，该 Desc 字段会覆盖 TIMCustomElem 中的 Desc 字段。如果两个 Desc 字段都不填，将收不到该自定义消息的离线推送。 |  [optional] |
|**ext** | **String** | 离线推送透传内容。由于国内各 Android 手机厂商的推送平台要求各不一样，请保证此字段为 JSON 格式，否则可能会导致收不到某些厂商的离线推送。 |  [optional] |
|**androidInfo** | [**OfflinePushInfoAndroidInfo**](OfflinePushInfoAndroidInfo.md) |  |  [optional] |
|**apnsInfo** | [**OfflinePushInfoApnsInfo**](OfflinePushInfoApnsInfo.md) |  |  [optional] |



## Enum: PushFlagEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



