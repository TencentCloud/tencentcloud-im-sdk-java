

# GetGroupMemberInfoResponseAllOfMemberList


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**memberAccount** | **String** | 群成员 ID 只读 |  [optional] |
|**role** | **String** | 群内身份 群内身份，包括 Owner 群主、Admin 群管理员以及 Member 群成员 |  [optional] |
|**joinTime** | **Integer** | 入群时间 只读 |  [optional] |
|**msgSeq** | **Integer** | 该成员当前已读消息 Seq 只读 |  [optional] |
|**msgFlag** | **String** | 消息接收选项 消息接收选项，包括如下几种：AcceptAndNotify 表示接收并提示；AcceptNotNotify 表示接收不提示（不会触发 APNs 远程推送）；Discard 表示屏蔽群消息（不会向客户端推送消息） |  [optional] |
|**lastSendMsgTime** | **Integer** | 最后发送消息的时间 支持三个普通群，不支持直播群 |  [optional] |
|**nameCard** | **String** | 群名片 可读可写。最长50字节，不可调整 |  [optional] |



