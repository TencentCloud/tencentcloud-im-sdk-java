

# GroupMsgGetSimpleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupId** | **String** | 要拉取历史消息的群组 ID |  |
|**reqMsgNumber** | **Integer** | 拉取的历史消息的条数，目前一次请求最多返回20条历史消息，所以这里最好小于等于20 |  |
|**reqMsgSeq** | **Integer** | 拉取消息的最大 seq |  [optional] |
|**withRecalledMsg** | **Integer** | 是否带撤回的消息，填1表明需要拉取撤回后的消息；默认不拉取撤回后的消息 |  [optional] |



