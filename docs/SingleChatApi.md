# SingleChatApi

All URIs are relative to *https://console.tim.qq.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adminGetroammsg**](SingleChatApi.md#adminGetroammsg) | **POST** /v4/openim/admin_getroammsg | 查询单聊消息（https://cloud.tencent.com/document/product/269/42794） |
| [**adminMsgwithdraw**](SingleChatApi.md#adminMsgwithdraw) | **POST** /v4/openim/admin_msgwithdraw | 撤回单聊消息（https://cloud.tencent.com/document/product/269/38980） |
| [**adminSetMsgRead**](SingleChatApi.md#adminSetMsgRead) | **POST** /v4/openim/admin_set_msg_read | 设置单聊消息已读（https://cloud.tencent.com/document/product/269/50349） |
| [**batchsendmsg**](SingleChatApi.md#batchsendmsg) | **POST** /v4/openim/batchsendmsg | 批量发单聊消息（https://cloud.tencent.com/document/product/269/1612） |
| [**getC2cUnreadMsgNum**](SingleChatApi.md#getC2cUnreadMsgNum) | **POST** /v4/openim/get_c2c_unread_msg_num | 查询单聊未读消息计数（https://cloud.tencent.com/document/product/269/56043） |
| [**importmsg**](SingleChatApi.md#importmsg) | **POST** /v4/openim/importmsg | 导入单聊消息（https://cloud.tencent.com/document/product/269/2568） |
| [**sendmsg**](SingleChatApi.md#sendmsg) | **POST** /v4/openim/sendmsg | 单发单聊消息（https://cloud.tencent.com/document/product/269/2282） |


<a name="adminGetroammsg"></a>
# **adminGetroammsg**
> GetRoamMsgResponse adminGetroammsg(random, getRoamMsgRequest)

查询单聊消息（https://cloud.tencent.com/document/product/269/42794）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.SingleChatApi;

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

    SingleChatApi apiInstance = new SingleChatApi(defaultClient);
    Integer random = 56; // Integer | 
    GetRoamMsgRequest getRoamMsgRequest = new GetRoamMsgRequest(); // GetRoamMsgRequest | 
    try {
      GetRoamMsgResponse result = apiInstance.adminGetroammsg(random, getRoamMsgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SingleChatApi#adminGetroammsg");
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
| **getRoamMsgRequest** | [**GetRoamMsgRequest**](GetRoamMsgRequest.md)|  | [optional] |

### Return type

[**GetRoamMsgResponse**](GetRoamMsgResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |

<a name="adminMsgwithdraw"></a>
# **adminMsgwithdraw**
> CommonResponse adminMsgwithdraw(random, msgWithdrawRequest)

撤回单聊消息（https://cloud.tencent.com/document/product/269/38980）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.SingleChatApi;

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

    SingleChatApi apiInstance = new SingleChatApi(defaultClient);
    Integer random = 56; // Integer | 
    MsgWithdrawRequest msgWithdrawRequest = new MsgWithdrawRequest(); // MsgWithdrawRequest | 
    try {
      CommonResponse result = apiInstance.adminMsgwithdraw(random, msgWithdrawRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SingleChatApi#adminMsgwithdraw");
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
| **msgWithdrawRequest** | [**MsgWithdrawRequest**](MsgWithdrawRequest.md)|  | [optional] |

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

<a name="adminSetMsgRead"></a>
# **adminSetMsgRead**
> CommonResponse adminSetMsgRead(random, setMsgReadRequest)

设置单聊消息已读（https://cloud.tencent.com/document/product/269/50349）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.SingleChatApi;

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

    SingleChatApi apiInstance = new SingleChatApi(defaultClient);
    Integer random = 56; // Integer | 
    SetMsgReadRequest setMsgReadRequest = new SetMsgReadRequest(); // SetMsgReadRequest | 
    try {
      CommonResponse result = apiInstance.adminSetMsgRead(random, setMsgReadRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SingleChatApi#adminSetMsgRead");
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
| **setMsgReadRequest** | [**SetMsgReadRequest**](SetMsgReadRequest.md)|  | [optional] |

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

<a name="batchsendmsg"></a>
# **batchsendmsg**
> BatchSendSingleChatMsgResponse batchsendmsg(random, batchSendSingleChatMsgRequest)

批量发单聊消息（https://cloud.tencent.com/document/product/269/1612）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.SingleChatApi;

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

    SingleChatApi apiInstance = new SingleChatApi(defaultClient);
    Integer random = 56; // Integer | 
    BatchSendSingleChatMsgRequest batchSendSingleChatMsgRequest = new BatchSendSingleChatMsgRequest(); // BatchSendSingleChatMsgRequest | 
    try {
      BatchSendSingleChatMsgResponse result = apiInstance.batchsendmsg(random, batchSendSingleChatMsgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SingleChatApi#batchsendmsg");
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
| **batchSendSingleChatMsgRequest** | [**BatchSendSingleChatMsgRequest**](BatchSendSingleChatMsgRequest.md)|  | [optional] |

### Return type

[**BatchSendSingleChatMsgResponse**](BatchSendSingleChatMsgResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |

<a name="getC2cUnreadMsgNum"></a>
# **getC2cUnreadMsgNum**
> GetC2cUnreadMsgNumResponse getC2cUnreadMsgNum(random, getC2cUnreadMsgNumRequest)

查询单聊未读消息计数（https://cloud.tencent.com/document/product/269/56043）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.SingleChatApi;

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

    SingleChatApi apiInstance = new SingleChatApi(defaultClient);
    Integer random = 56; // Integer | 
    GetC2cUnreadMsgNumRequest getC2cUnreadMsgNumRequest = new GetC2cUnreadMsgNumRequest(); // GetC2cUnreadMsgNumRequest | 
    try {
      GetC2cUnreadMsgNumResponse result = apiInstance.getC2cUnreadMsgNum(random, getC2cUnreadMsgNumRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SingleChatApi#getC2cUnreadMsgNum");
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
| **getC2cUnreadMsgNumRequest** | [**GetC2cUnreadMsgNumRequest**](GetC2cUnreadMsgNumRequest.md)|  | [optional] |

### Return type

[**GetC2cUnreadMsgNumResponse**](GetC2cUnreadMsgNumResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |

<a name="importmsg"></a>
# **importmsg**
> CommonResponse importmsg(random, importMsgRequest)

导入单聊消息（https://cloud.tencent.com/document/product/269/2568）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.SingleChatApi;

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

    SingleChatApi apiInstance = new SingleChatApi(defaultClient);
    Integer random = 56; // Integer | 
    ImportMsgRequest importMsgRequest = new ImportMsgRequest(); // ImportMsgRequest | 
    try {
      CommonResponse result = apiInstance.importmsg(random, importMsgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SingleChatApi#importmsg");
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
| **importMsgRequest** | [**ImportMsgRequest**](ImportMsgRequest.md)|  | [optional] |

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

<a name="sendmsg"></a>
# **sendmsg**
> SendSingleChatMsgResponse sendmsg(random, sendSingleChatMsgRequest)

单发单聊消息（https://cloud.tencent.com/document/product/269/2282）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.SingleChatApi;

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

    SingleChatApi apiInstance = new SingleChatApi(defaultClient);
    Integer random = 56; // Integer | 
    SendSingleChatMsgRequest sendSingleChatMsgRequest = new SendSingleChatMsgRequest(); // SendSingleChatMsgRequest | 
    try {
      SendSingleChatMsgResponse result = apiInstance.sendmsg(random, sendSingleChatMsgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SingleChatApi#sendmsg");
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
| **sendSingleChatMsgRequest** | [**SendSingleChatMsgRequest**](SendSingleChatMsgRequest.md)|  | [optional] |

### Return type

[**SendSingleChatMsgResponse**](SendSingleChatMsgResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |

