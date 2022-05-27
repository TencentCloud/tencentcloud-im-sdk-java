# AccountApi

All URIs are relative to *https://console.tim.qq.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountCheck**](AccountApi.md#accountCheck) | **POST** /v4/im_open_login_svc/account_check | 查询帐号 (https://cloud.tencent.com/document/product/269/38417) |
| [**accountDelete**](AccountApi.md#accountDelete) | **POST** /v4/im_open_login_svc/account_delete | 删除帐号（https://cloud.tencent.com/document/product/269/36443） |
| [**accountImport**](AccountApi.md#accountImport) | **POST** /v4/im_open_login_svc/account_import | 导入单个帐号（https://cloud.tencent.com/document/product/269/1608） |
| [**kick**](AccountApi.md#kick) | **POST** /v4/im_open_login_svc/kick | 失效帐号登录状态（https://cloud.tencent.com/document/product/269/3853） |
| [**multiAccountImport**](AccountApi.md#multiAccountImport) | **POST** /v4/im_open_login_svc/multiaccount_import | 导入多个帐号（https://cloud.tencent.com/document/product/269/4919） |
| [**queryOnlineStatus**](AccountApi.md#queryOnlineStatus) | **POST** /v4/openim/query_online_status | 查询帐号在线状态（https://cloud.tencent.com/document/product/269/2566） |



## accountCheck

> AccountCheckResponse accountCheck(random, accountCheckRequest)

查询帐号 (https://cloud.tencent.com/document/product/269/38417)

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AccountApi;

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

        AccountApi apiInstance = new AccountApi(defaultClient);
        Integer random = 56; // Integer | 
        AccountCheckRequest accountCheckRequest = new AccountCheckRequest(); // AccountCheckRequest | 
        //TODO: Set the parameters

        try {
            AccountCheckResponse result = apiInstance.accountCheck(random, accountCheckRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountCheck");
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
| **accountCheckRequest** | [**AccountCheckRequest**](AccountCheckRequest.md)|  | [optional] |

### Return type

[**AccountCheckResponse**](AccountCheckResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## accountDelete

> AccountDeleteResponse accountDelete(random, accountDeleteRequest)

删除帐号（https://cloud.tencent.com/document/product/269/36443）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AccountApi;

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

        AccountApi apiInstance = new AccountApi(defaultClient);
        Integer random = 56; // Integer | 
        AccountDeleteRequest accountDeleteRequest = new AccountDeleteRequest(); // AccountDeleteRequest | 
        //TODO: Set the parameters

        try {
            AccountDeleteResponse result = apiInstance.accountDelete(random, accountDeleteRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountDelete");
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
| **accountDeleteRequest** | [**AccountDeleteRequest**](AccountDeleteRequest.md)|  | [optional] |

### Return type

[**AccountDeleteResponse**](AccountDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## accountImport

> CommonResponse accountImport(random, accountImportRequest)

导入单个帐号（https://cloud.tencent.com/document/product/269/1608）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AccountApi;

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

        AccountApi apiInstance = new AccountApi(defaultClient);
        Integer random = 56; // Integer | 
        AccountImportRequest accountImportRequest = new AccountImportRequest(); // AccountImportRequest | 
        //TODO: Set the parameters

        try {
            CommonResponse result = apiInstance.accountImport(random, accountImportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountImport");
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
| **accountImportRequest** | [**AccountImportRequest**](AccountImportRequest.md)|  | [optional] |

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


## kick

> CommonResponse kick(random, kickRequest)

失效帐号登录状态（https://cloud.tencent.com/document/product/269/3853）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AccountApi;

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

        AccountApi apiInstance = new AccountApi(defaultClient);
        Integer random = 56; // Integer | 
        KickRequest kickRequest = new KickRequest(); // KickRequest | 
        //TODO: Set the parameters

        try {
            CommonResponse result = apiInstance.kick(random, kickRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#kick");
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
| **kickRequest** | [**KickRequest**](KickRequest.md)|  | [optional] |

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


## multiAccountImport

> MultiAccountImportResponse multiAccountImport(random, multiAccountImportRequest)

导入多个帐号（https://cloud.tencent.com/document/product/269/4919）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AccountApi;

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

        AccountApi apiInstance = new AccountApi(defaultClient);
        Integer random = 56; // Integer | 
        MultiAccountImportRequest multiAccountImportRequest = new MultiAccountImportRequest(); // MultiAccountImportRequest | 
        //TODO: Set the parameters

        try {
            MultiAccountImportResponse result = apiInstance.multiAccountImport(random, multiAccountImportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#multiAccountImport");
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
| **multiAccountImportRequest** | [**MultiAccountImportRequest**](MultiAccountImportRequest.md)|  | [optional] |

### Return type

[**MultiAccountImportResponse**](MultiAccountImportResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## queryOnlineStatus

> QueryOnlineStatusResponse queryOnlineStatus(random, queryOnlineStatusRequest)

查询帐号在线状态（https://cloud.tencent.com/document/product/269/2566）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AccountApi;

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

        AccountApi apiInstance = new AccountApi(defaultClient);
        Integer random = 56; // Integer | 
        QueryOnlineStatusRequest queryOnlineStatusRequest = new QueryOnlineStatusRequest(); // QueryOnlineStatusRequest | 
        //TODO: Set the parameters

        try {
            QueryOnlineStatusResponse result = apiInstance.queryOnlineStatus(random, queryOnlineStatusRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#queryOnlineStatus");
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
| **queryOnlineStatusRequest** | [**QueryOnlineStatusRequest**](QueryOnlineStatusRequest.md)|  | [optional] |

### Return type

[**QueryOnlineStatusResponse**](QueryOnlineStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |

