# RecentContactApi

All URIs are relative to *https://console.tim.qq.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRecentContact**](RecentContactApi.md#deleteRecentContact) | **POST** /v4/recentcontact/delete | 删除单个会话（https://cloud.tencent.com/document/product/269/62119） |
| [**getRecentContactList**](RecentContactApi.md#getRecentContactList) | **POST** /v4/recentcontact/get_list | 拉取会话列表（https://cloud.tencent.com/document/product/269/62118） |



## deleteRecentContact

> GetRecentContactListGroupDeleteResponse deleteRecentContact(random, getRecentContactListGroupDeleteRequest)

删除单个会话（https://cloud.tencent.com/document/product/269/62119）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.RecentContactApi;

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

        RecentContactApi apiInstance = new RecentContactApi(defaultClient);
        Integer random = 56; // Integer | 
        GetRecentContactListGroupDeleteRequest getRecentContactListGroupDeleteRequest = new GetRecentContactListGroupDeleteRequest(); // GetRecentContactListGroupDeleteRequest | 
        //TODO: Set the parameters

        try {
            GetRecentContactListGroupDeleteResponse result = apiInstance.deleteRecentContact(random, getRecentContactListGroupDeleteRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecentContactApi#deleteRecentContact");
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
| **getRecentContactListGroupDeleteRequest** | [**GetRecentContactListGroupDeleteRequest**](GetRecentContactListGroupDeleteRequest.md)|  | [optional] |

### Return type

[**GetRecentContactListGroupDeleteResponse**](GetRecentContactListGroupDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## getRecentContactList

> GetRecentContactListGroupGetResponse getRecentContactList(random, getRecentContactListGroupGetRequest)

拉取会话列表（https://cloud.tencent.com/document/product/269/62118）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.RecentContactApi;

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

        RecentContactApi apiInstance = new RecentContactApi(defaultClient);
        Integer random = 56; // Integer | 
        GetRecentContactListGroupGetRequest getRecentContactListGroupGetRequest = new GetRecentContactListGroupGetRequest(); // GetRecentContactListGroupGetRequest | 
        //TODO: Set the parameters

        try {
            GetRecentContactListGroupGetResponse result = apiInstance.getRecentContactList(random, getRecentContactListGroupGetRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecentContactApi#getRecentContactList");
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
| **getRecentContactListGroupGetRequest** | [**GetRecentContactListGroupGetRequest**](GetRecentContactListGroupGetRequest.md)|  | [optional] |

### Return type

[**GetRecentContactListGroupGetResponse**](GetRecentContactListGroupGetResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |

