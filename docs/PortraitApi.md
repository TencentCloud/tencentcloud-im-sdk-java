# PortraitApi

All URIs are relative to *https://console.tim.qq.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**portraitGet**](PortraitApi.md#portraitGet) | **POST** /v4/profile/portrait_get | 拉取资料（https://cloud.tencent.com/document/product/269/1639） |
| [**portraitSet**](PortraitApi.md#portraitSet) | **POST** /v4/profile/portrait_set | 设置资料（https://cloud.tencent.com/document/product/269/1640） |



## portraitGet

> PortraitGetResponse portraitGet(random, portraitGetRequest)

拉取资料（https://cloud.tencent.com/document/product/269/1639）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.PortraitApi;

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

        PortraitApi apiInstance = new PortraitApi(defaultClient);
        Integer random = 56; // Integer | 
        PortraitGetRequest portraitGetRequest = new PortraitGetRequest(); // PortraitGetRequest | 
        //TODO: Set the parameters

        try {
            PortraitGetResponse result = apiInstance.portraitGet(random, portraitGetRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortraitApi#portraitGet");
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
| **portraitGetRequest** | [**PortraitGetRequest**](PortraitGetRequest.md)|  | [optional] |

### Return type

[**PortraitGetResponse**](PortraitGetResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## portraitSet

> PortraitSetResponse portraitSet(random, portraitSetRequest)

设置资料（https://cloud.tencent.com/document/product/269/1640）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.PortraitApi;

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

        PortraitApi apiInstance = new PortraitApi(defaultClient);
        Integer random = 56; // Integer | 
        PortraitSetRequest portraitSetRequest = new PortraitSetRequest(); // PortraitSetRequest | 
        //TODO: Set the parameters

        try {
            PortraitSetResponse result = apiInstance.portraitSet(random, portraitSetRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortraitApi#portraitSet");
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
| **portraitSetRequest** | [**PortraitSetRequest**](PortraitSetRequest.md)|  | [optional] |

### Return type

[**PortraitSetResponse**](PortraitSetResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |

