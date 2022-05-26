

# ImportGroupMsgResponseAllOfImportMsgResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**result** | **Integer** | 单条消息导入结果 0表示单条消息成功 10004表示单条消息发送时间无效 80001表示单条消息包含脏字，拒绝存储此消息 80002表示为消息内容过长，目前支持8000字节的消息，请调整消息长度 |  [optional] |
|**msgTime** | **Integer** | 消息的时间戳 |  [optional] |
|**msgSeq** | **Integer** | 消息序列号，唯一标示一条消息 |  [optional] |



