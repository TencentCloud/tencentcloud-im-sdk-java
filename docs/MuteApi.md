# MuteApi

All URIs are relative to *https://console.tim.qq.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getnospeaking**](MuteApi.md#getnospeaking) | **POST** /v4/openconfigsvr/getnospeaking | 查询全局禁言（https://cloud.tencent.com/document/product/269/4229） |
| [**setnospeaking**](MuteApi.md#setnospeaking) | **POST** /v4/openconfigsvr/setnospeaking | 设置全局禁言（https://cloud.tencent.com/document/product/269/4230） |



## getnospeaking

> GetNoSpeakingResponse getnospeaking(random, getNoSpeakingRequest)

查询全局禁言（https://cloud.tencent.com/document/product/269/4229）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.MuteApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://console.tim.qq.com");
        // 此处替换成您的sdkappid
        // 应用 SDKAppID，可在即时通信 IM 控制台（https://console.cloud.tencent.com/im） 的应用卡片中获取。
        defaultClient.setSdkappid(123456789);
        // 此处替换成您的identifier;用户名，调用 REST API时必须为App管理员帐号
        // 参考:https://cloud.tencent.com/document/product/269/31999#app-.E7.AE.A1.E7.90.86.E5.91.98
        defaultClient.setIdentifier("identifier");
        // 此处替换成您的key 参考：https://cloud.tencent.com/document/product/269/32688#getkey
        defaultClient.setKey("key");

        MuteApi apiInstance = new MuteApi(defaultClient);
        Integer random = 56; // Integer | 
        GetNoSpeakingRequest getNoSpeakingRequest = new GetNoSpeakingRequest(); // GetNoSpeakingRequest | 
        //TODO: Set the parameters

        try {
            GetNoSpeakingResponse result = apiInstance.getnospeaking(random, getNoSpeakingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MuteApi#getnospeaking");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **random** | **Integer**|  | |
| **getNoSpeakingRequest** | [**GetNoSpeakingRequest**](GetNoSpeakingRequest.md)|  | [optional] |

### Return type

[**GetNoSpeakingResponse**](GetNoSpeakingResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## setnospeaking

> CommonResponse setnospeaking(random, setNoSpeakingRequest)

设置全局禁言（https://cloud.tencent.com/document/product/269/4230）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.MuteApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://console.tim.qq.com");
        // 此处替换成您的sdkappid
        // 应用 SDKAppID，可在即时通信 IM 控制台（https://console.cloud.tencent.com/im） 的应用卡片中获取。
        defaultClient.setSdkappid(123456789);
        // 此处替换成您的identifier;用户名，调用 REST API时必须为App管理员帐号
        // 参考:https://cloud.tencent.com/document/product/269/31999#app-.E7.AE.A1.E7.90.86.E5.91.98
        defaultClient.setIdentifier("identifier");
        // 此处替换成您的key 参考：https://cloud.tencent.com/document/product/269/32688#getkey
        defaultClient.setKey("key");

        MuteApi apiInstance = new MuteApi(defaultClient);
        Integer random = 56; // Integer | 
        SetNoSpeakingRequest setNoSpeakingRequest = new SetNoSpeakingRequest(); // SetNoSpeakingRequest | 
        //TODO: Set the parameters

        try {
            CommonResponse result = apiInstance.setnospeaking(random, setNoSpeakingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MuteApi#setnospeaking");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **random** | **Integer**|  | |
| **setNoSpeakingRequest** | [**SetNoSpeakingRequest**](SetNoSpeakingRequest.md)|  | [optional] |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |

