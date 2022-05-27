# OperationApi

All URIs are relative to *https://console.tim.qq.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getHistory**](OperationApi.md#getHistory) | **POST** /v4/open_msg_svc/get_history | 下载最近消息记录（https://cloud.tencent.com/document/product/269/1650） |
| [**getIPList**](OperationApi.md#getIPList) | **POST** /v4/ConfigSvc/GetIPList | 获取服务器 IP 地址（https://cloud.tencent.com/document/product/269/45438） |
| [**getappinfo**](OperationApi.md#getappinfo) | **POST** /v4/openconfigsvr/getappinfo | 拉取运营数据（https://cloud.tencent.com/document/product/269/4193） |



## getHistory

> GetOperateMsgHistoryResponse getHistory(random, getOperateMsgHistoryRequest)

下载最近消息记录（https://cloud.tencent.com/document/product/269/1650）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.OperationApi;

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

        OperationApi apiInstance = new OperationApi(defaultClient);
        Integer random = 56; // Integer | 
        GetOperateMsgHistoryRequest getOperateMsgHistoryRequest = new GetOperateMsgHistoryRequest(); // GetOperateMsgHistoryRequest | 
        //TODO: Set the parameters

        try {
            GetOperateMsgHistoryResponse result = apiInstance.getHistory(random, getOperateMsgHistoryRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationApi#getHistory");
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
| **getOperateMsgHistoryRequest** | [**GetOperateMsgHistoryRequest**](GetOperateMsgHistoryRequest.md)|  | [optional] |

### Return type

[**GetOperateMsgHistoryResponse**](GetOperateMsgHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## getIPList

> GetIPListResponse getIPList(random, body)

获取服务器 IP 地址（https://cloud.tencent.com/document/product/269/45438）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.OperationApi;

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

        OperationApi apiInstance = new OperationApi(defaultClient);
        Integer random = 56; // Integer | 
        Object body = null; // Object | 
        //TODO: Set the parameters

        try {
            GetIPListResponse result = apiInstance.getIPList(random, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationApi#getIPList");
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
| **body** | **Object**|  | [optional] |

### Return type

[**GetIPListResponse**](GetIPListResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## getappinfo

> GetAppInfoResponse getappinfo(random, getAppInfoRequest)

拉取运营数据（https://cloud.tencent.com/document/product/269/4193）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.OperationApi;

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

        OperationApi apiInstance = new OperationApi(defaultClient);
        Integer random = 56; // Integer | 
        GetAppInfoRequest getAppInfoRequest = new GetAppInfoRequest(); // GetAppInfoRequest | 
        //TODO: Set the parameters

        try {
            GetAppInfoResponse result = apiInstance.getappinfo(random, getAppInfoRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationApi#getappinfo");
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
| **getAppInfoRequest** | [**GetAppInfoRequest**](GetAppInfoRequest.md)|  | [optional] |

### Return type

[**GetAppInfoResponse**](GetAppInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |

