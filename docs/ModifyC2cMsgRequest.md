

# ModifyC2cMsgRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromAccount** | **String** | 消息发送方 UserID |  |
|**toAccount** | **String** | 消息接收方 UserID |  |
|**msgKey** | **String** | 待修改消息的唯一标识。获取消息 MsgKey 的方法请参见本接口的接口说明 |  |
|**msgBody** | [**List&lt;TIMMsgElement&gt;**](TIMMsgElement.md) |  |  [optional] |
|**cloudCustomData** | **String** | 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到） |  [optional] |



