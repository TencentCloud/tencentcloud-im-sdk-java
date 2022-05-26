

# BlackListCheckResponseAllOfBlackListCheckItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**toAccount** | **String** | 请求校验的用户的 UserID |  [optional] |
|**relation** | **String** | 校验成功时 To_Account 与 From_Account 之间的黑名单关系，详情可参见 校验黑名单（https://cloud.tencent.com/document/product/269/1501#.E6.A0.A1.E9.AA.8C.E9.BB.91.E5.90.8D.E5.8D.95） |  [optional] |
|**resultCode** | **Integer** | To_Account 的处理结果，0表示成功，非0表示失败，非0取值的详细描述请参见 错误码说明（https://cloud.tencent.com/document/product/269/3725#ErrorCode） |  [optional] |
|**resultInfo** | **String** | To_Account 的错误描述信息，成功时该字段为空 |  [optional] |



