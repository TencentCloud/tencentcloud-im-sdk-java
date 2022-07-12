

# GetCosSigResponseAllOfPreSigURLs


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resourceID** | **Integer** | 同批查询的资源 ID |  [optional] |
|**code** | **Integer** | 指定资源 ID 对应的查询结果 |  [optional] |
|**desc** | **String** | 指定资源 ID 对应的查询结果的描述 |  [optional] |
|**preSigURL** | **String** | 指定资源 ID 对应的最高权限的签名 URL，可以下载封禁的文件，有效期15分钟 |  [optional] |
|**status** | **Integer** | 指定资源 ID 对应的文件状态:0-文件正常，SDK 可访问 1-文件被封禁，SDK 访问无权限，可使用 PreSigURL 访问; 2-文件不存在，可能过期被删除； |  [optional] |



