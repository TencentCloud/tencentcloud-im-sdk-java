

# OfflinePushInfoApnsInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**badgeMode** | **Integer** | 这个字段缺省或者为0表示需要计数，为1表示本条消息不需要计数，即右上角图标数字不增加。 |  [optional] |
|**title** | **String** | 该字段用于标识 APNs 推送的标题，若填写则会覆盖最上层 Title。 |  [optional] |
|**subTitle** | **String** | 该字段用于标识 APNs 推送的子标题。 |  [optional] |
|**image** | **String** | 该字段用于标识 APNs 携带的图片地址，当客户端拿到该字段时，可以通过下载图片资源的方式将图片展示在弹窗上。 |  [optional] |
|**mutableContent** | **Integer** | 为1表示开启 iOS 10 的推送扩展，默认为0。 |  [optional] |



