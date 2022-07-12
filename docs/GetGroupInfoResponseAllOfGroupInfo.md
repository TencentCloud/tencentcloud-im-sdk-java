

# GetGroupInfoResponseAllOfGroupInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupId** | **String** | 群组的唯一标识 只读。群组 ID，App 内保证唯一，其格式前缀为 @TGS#。另外，App 亦可自定义群组 ID |  [optional] |
|**errorCode** | **Integer** | 针对该群组的返回结果 |  [optional] |
|**errorInfo** | **String** | 针对该群组的返回结果 |  [optional] |
|**type** | **String** | 群组类型 只读。默认支持以下群组类型：好友工作群（Work）、陌生人社交群（Public）、临时会议群（Meeting）、直播群（AVChatRoom）、社群（Community），详情请参阅 群组类型介绍（https://cloud.tencent.com/document/product/269/1502#GroupType） 旧版本 SDK 中还包含 Private、ChatRoom 以及 BChatRoom 类型，不建议使用 |  [optional] |
|**name** | **String** | 群组名称 可读可写。最长30字节，不可调整 |  [optional] |
|**appid** | **Integer** | 即时通信应用的 SDKAppID |  [optional] |
|**shutUpAllMember** | **String** | 群全员禁言状态 |  [optional] |
|**introduction** | **String** | 群组简介，可读可写。最长240字节，不可调整 |  [optional] |
|**notification** | **String** | 群组公告，可读可写。最长300字节，不可调整 |  [optional] |
|**faceUrl** | **String** | 群组头像 URL，可读可写。最长100字节，不可调整 |  [optional] |
|**ownerAccount** | **String** | 群主 ID 只读 |  [optional] |
|**createTime** | **Integer** | 群组的创建时间 只读 |  [optional] |
|**infoSeq** | **Integer** | 群资料的每次变都会增加该值 只读 |  [optional] |
|**lastInfoTime** | **Integer** | 群组最后一次信息变更时间 只读 |  [optional] |
|**lastMsgTime** | **Integer** | 群组内最后发消息的时间 只读 |  [optional] |
|**nextMsgSeq** | **Integer** | 群内下一条消息的 Seq 只读  群组内每一条消息都有一条唯一的消息 Seq，且该 Seq 是按照发消息顺序而连续的。从1开始，群内每增加一条消息，NextMsgSeq 就会增加1（默认情况下系统消息比如进退群等通知也属于消息，会导致 NextMsgSeq 加1） |  [optional] |
|**memberNum** | **Integer** | 当前成员数量 只读 |  [optional] |
|**maxMemberNum** | **Integer** | 最大成员数量 缺省时的默认值：付费套餐包上限，例如体验版是20，如果升级套餐包，需按照修改群基础资料修改这个字段到对应数值 |  [optional] |
|**applyJoinOption** | **String** | 申请加群选项 申请加群选项包括如下几种：DisableApply 表示禁止任何人申请加入 NeedPermission 表示需要群主或管理员审批 FreeAccess 表示允许无需审批自由加入群组 |  [optional] |
|**appDefinedData** | [**List&lt;GetGroupInfoResponseAllOfAppDefinedData&gt;**](GetGroupInfoResponseAllOfAppDefinedData.md) | 默认情况是没有的。开通群组维度的自定义字段详情请参见 自定义字段（https://cloud.tencent.com/document/product/269/1502#.E8.87.AA.E5.AE.9A.E4.B9.89.E5.AD.97.E6.AE.B5） |  [optional] |
|**memberList** | [**List&lt;GetGroupInfoResponseAllOfMemberList&gt;**](GetGroupInfoResponseAllOfMemberList.md) | 获取到的群成员列表，其中包含了全部或者指定的群成员信息，成员信息字段详情请参阅 群成员资料（https://cloud.tencent.com/document/product/269/1502#SelfInfoFilter） |  [optional] |
|**appMemberDefinedData** | [**List&lt;GetGroupInfoResponseAllOfAppDefinedData&gt;**](GetGroupInfoResponseAllOfAppDefinedData.md) | 返回的群成员自定义字段信息 |  [optional] |



