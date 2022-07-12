# OperationApi

All URIs are relative to *https://console.tim.qq.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**allowBannedObject**](OperationApi.md#allowBannedObject) | **POST** /v4/im_cos_msg/allow_banned_object | 聊天文件解封（https://cloud.tencent.com/document/product/269/74776） |
| [**forbidIllegalObject**](OperationApi.md#forbidIllegalObject) | **POST** /v4/im_cos_msg/forbid_illegal_object | 聊天文件封禁（https://cloud.tencent.com/document/product/269/74775） |
| [**getCosSig**](OperationApi.md#getCosSig) | **POST** /v4/im_cos_msg/get_cos_sig | 聊天文件签名（https://cloud.tencent.com/document/product/269/74777） |
| [**getHistory**](OperationApi.md#getHistory) | **POST** /v4/open_msg_svc/get_history | 下载最近消息记录（https://cloud.tencent.com/document/product/269/1650） |
| [**getIPList**](OperationApi.md#getIPList) | **POST** /v4/ConfigSvc/GetIPList | 获取服务器 IP 地址（https://cloud.tencent.com/document/product/269/45438） |
| [**getappinfo**](OperationApi.md#getappinfo) | **POST** /v4/openconfigsvr/getappinfo | 拉取运营数据（https://cloud.tencent.com/document/product/269/4193） |


<a name="allowBannedObject"></a>
# **allowBannedObject**
> CommonResponse allowBannedObject(random, allowBannedObjectRequest)

聊天文件解封（https://cloud.tencent.com/document/product/269/74776）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.model.*;
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
    AllowBannedObjectRequest allowBannedObjectRequest = new AllowBannedObjectRequest(); // AllowBannedObjectRequest | 
    try {
      CommonResponse result = apiInstance.allowBannedObject(random, allowBannedObjectRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationApi#allowBannedObject");
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
| **allowBannedObjectRequest** | [**AllowBannedObjectRequest**](AllowBannedObjectRequest.md)|  | [optional] |

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

<a name="forbidIllegalObject"></a>
# **forbidIllegalObject**
> CommonResponse forbidIllegalObject(random, forbidIllegalObjectRequest)

聊天文件封禁（https://cloud.tencent.com/document/product/269/74775）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.model.*;
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
    ForbidIllegalObjectRequest forbidIllegalObjectRequest = new ForbidIllegalObjectRequest(); // ForbidIllegalObjectRequest | 
    try {
      CommonResponse result = apiInstance.forbidIllegalObject(random, forbidIllegalObjectRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationApi#forbidIllegalObject");
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
| **forbidIllegalObjectRequest** | [**ForbidIllegalObjectRequest**](ForbidIllegalObjectRequest.md)|  | [optional] |

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

<a name="getCosSig"></a>
# **getCosSig**
> GetCosSigResponse getCosSig(random, getCosSigRequest)

聊天文件签名（https://cloud.tencent.com/document/product/269/74777）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.model.*;
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
    GetCosSigRequest getCosSigRequest = new GetCosSigRequest(); // GetCosSigRequest | 
    try {
      GetCosSigResponse result = apiInstance.getCosSig(random, getCosSigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationApi#getCosSig");
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
| **getCosSigRequest** | [**GetCosSigRequest**](GetCosSigRequest.md)|  | [optional] |

### Return type

[**GetCosSigResponse**](GetCosSigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |

<a name="getHistory"></a>
# **getHistory**
> GetOperateMsgHistoryResponse getHistory(random, getOperateMsgHistoryRequest)

下载最近消息记录（https://cloud.tencent.com/document/product/269/1650）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.model.*;
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

<a name="getIPList"></a>
# **getIPList**
> GetIPListResponse getIPList(random, body)

获取服务器 IP 地址（https://cloud.tencent.com/document/product/269/45438）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.model.*;
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

<a name="getappinfo"></a>
# **getappinfo**
> GetAppInfoResponse getappinfo(random, getAppInfoRequest)

拉取运营数据（https://cloud.tencent.com/document/product/269/4193）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.model.*;
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

