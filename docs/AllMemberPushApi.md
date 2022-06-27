# AllMemberPushApi

All URIs are relative to *https://console.tim.qq.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**imAddTag**](AllMemberPushApi.md#imAddTag) | **POST** /v4/all_member_push/im_add_tag | 添加用户标签（https://cloud.tencent.com/document/product/269/45941） |
| [**imGetAttr**](AllMemberPushApi.md#imGetAttr) | **POST** /v4/all_member_push/im_get_attr | 获取用户属性（https://cloud.tencent.com/document/product/269/45937） |
| [**imGetAttrName**](AllMemberPushApi.md#imGetAttrName) | **POST** /v4/all_member_push/im_get_attr_name | 获取应用属性名称（https://cloud.tencent.com/document/product/269/45936） |
| [**imGetTag**](AllMemberPushApi.md#imGetTag) | **POST** /v4/all_member_push/im_get_tag | 获取用户标签（https://cloud.tencent.com/document/product/269/45940） |
| [**imPush**](AllMemberPushApi.md#imPush) | **POST** /v4/all_member_push/im_push | 全员推送（https://cloud.tencent.com/document/product/269/45934） |
| [**imRemoveAllTags**](AllMemberPushApi.md#imRemoveAllTags) | **POST** /v4/all_member_push/im_remove_all_tags | 删除用户所有标签（https://cloud.tencent.com/document/product/269/45943） |
| [**imRemoveAttr**](AllMemberPushApi.md#imRemoveAttr) | **POST** /v4/all_member_push/im_remove_attr | 删除用户属性（https://cloud.tencent.com/document/product/269/45939） |
| [**imRemoveTag**](AllMemberPushApi.md#imRemoveTag) | **POST** /v4/all_member_push/im_remove_tag | 删除用户标签（https://cloud.tencent.com/document/product/269/45942） |
| [**imSetAttr**](AllMemberPushApi.md#imSetAttr) | **POST** /v4/all_member_push/im_set_attr | 设置用户属性（https://cloud.tencent.com/document/product/269/45938） |
| [**imSetAttrName**](AllMemberPushApi.md#imSetAttrName) | **POST** /v4/all_member_push/im_set_attr_name | 设置应用属性名称（https://cloud.tencent.com/document/product/269/45935） |


<a name="imAddTag"></a>
# **imAddTag**
> CommonResponse imAddTag(random, imAddTagRequest)

添加用户标签（https://cloud.tencent.com/document/product/269/45941）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AllMemberPushApi;

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

    AllMemberPushApi apiInstance = new AllMemberPushApi(defaultClient);
    Integer random = 56; // Integer | 
    ImAddTagRequest imAddTagRequest = new ImAddTagRequest(); // ImAddTagRequest | 
    try {
      CommonResponse result = apiInstance.imAddTag(random, imAddTagRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AllMemberPushApi#imAddTag");
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
| **imAddTagRequest** | [**ImAddTagRequest**](ImAddTagRequest.md)|  | [optional] |

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

<a name="imGetAttr"></a>
# **imGetAttr**
> ImGetAttrResponse imGetAttr(random, imGetAttrRequest)

获取用户属性（https://cloud.tencent.com/document/product/269/45937）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AllMemberPushApi;

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

    AllMemberPushApi apiInstance = new AllMemberPushApi(defaultClient);
    Integer random = 56; // Integer | 
    ImGetAttrRequest imGetAttrRequest = new ImGetAttrRequest(); // ImGetAttrRequest | 
    try {
      ImGetAttrResponse result = apiInstance.imGetAttr(random, imGetAttrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AllMemberPushApi#imGetAttr");
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
| **imGetAttrRequest** | [**ImGetAttrRequest**](ImGetAttrRequest.md)|  | [optional] |

### Return type

[**ImGetAttrResponse**](ImGetAttrResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |

<a name="imGetAttrName"></a>
# **imGetAttrName**
> ImGetAttrNameResponse imGetAttrName(random, body)

获取应用属性名称（https://cloud.tencent.com/document/product/269/45936）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AllMemberPushApi;

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

    AllMemberPushApi apiInstance = new AllMemberPushApi(defaultClient);
    Integer random = 56; // Integer | 
    Object body = null; // Object | 
    try {
      ImGetAttrNameResponse result = apiInstance.imGetAttrName(random, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AllMemberPushApi#imGetAttrName");
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

[**ImGetAttrNameResponse**](ImGetAttrNameResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |

<a name="imGetTag"></a>
# **imGetTag**
> ImGetTagResponse imGetTag(random, imGetTagRequest)

获取用户标签（https://cloud.tencent.com/document/product/269/45940）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AllMemberPushApi;

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

    AllMemberPushApi apiInstance = new AllMemberPushApi(defaultClient);
    Integer random = 56; // Integer | 
    ImGetTagRequest imGetTagRequest = new ImGetTagRequest(); // ImGetTagRequest | 
    try {
      ImGetTagResponse result = apiInstance.imGetTag(random, imGetTagRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AllMemberPushApi#imGetTag");
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
| **imGetTagRequest** | [**ImGetTagRequest**](ImGetTagRequest.md)|  | [optional] |

### Return type

[**ImGetTagResponse**](ImGetTagResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |

<a name="imPush"></a>
# **imPush**
> ImPushResponse imPush(random, imPushRequest)

全员推送（https://cloud.tencent.com/document/product/269/45934）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AllMemberPushApi;

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

    AllMemberPushApi apiInstance = new AllMemberPushApi(defaultClient);
    Integer random = 56; // Integer | 
    ImPushRequest imPushRequest = new ImPushRequest(); // ImPushRequest | 
    try {
      ImPushResponse result = apiInstance.imPush(random, imPushRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AllMemberPushApi#imPush");
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
| **imPushRequest** | [**ImPushRequest**](ImPushRequest.md)|  | [optional] |

### Return type

[**ImPushResponse**](ImPushResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |

<a name="imRemoveAllTags"></a>
# **imRemoveAllTags**
> CommonResponse imRemoveAllTags(random, imRemoveAllTagRequest)

删除用户所有标签（https://cloud.tencent.com/document/product/269/45943）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AllMemberPushApi;

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

    AllMemberPushApi apiInstance = new AllMemberPushApi(defaultClient);
    Integer random = 56; // Integer | 
    ImRemoveAllTagRequest imRemoveAllTagRequest = new ImRemoveAllTagRequest(); // ImRemoveAllTagRequest | 
    try {
      CommonResponse result = apiInstance.imRemoveAllTags(random, imRemoveAllTagRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AllMemberPushApi#imRemoveAllTags");
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
| **imRemoveAllTagRequest** | [**ImRemoveAllTagRequest**](ImRemoveAllTagRequest.md)|  | [optional] |

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

<a name="imRemoveAttr"></a>
# **imRemoveAttr**
> CommonResponse imRemoveAttr(random, imRemoveAttrRequest)

删除用户属性（https://cloud.tencent.com/document/product/269/45939）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AllMemberPushApi;

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

    AllMemberPushApi apiInstance = new AllMemberPushApi(defaultClient);
    Integer random = 56; // Integer | 
    ImRemoveAttrRequest imRemoveAttrRequest = new ImRemoveAttrRequest(); // ImRemoveAttrRequest | 
    try {
      CommonResponse result = apiInstance.imRemoveAttr(random, imRemoveAttrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AllMemberPushApi#imRemoveAttr");
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
| **imRemoveAttrRequest** | [**ImRemoveAttrRequest**](ImRemoveAttrRequest.md)|  | [optional] |

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

<a name="imRemoveTag"></a>
# **imRemoveTag**
> CommonResponse imRemoveTag(random, imRemoveTagRequest)

删除用户标签（https://cloud.tencent.com/document/product/269/45942）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AllMemberPushApi;

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

    AllMemberPushApi apiInstance = new AllMemberPushApi(defaultClient);
    Integer random = 56; // Integer | 
    ImRemoveTagRequest imRemoveTagRequest = new ImRemoveTagRequest(); // ImRemoveTagRequest | 
    try {
      CommonResponse result = apiInstance.imRemoveTag(random, imRemoveTagRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AllMemberPushApi#imRemoveTag");
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
| **imRemoveTagRequest** | [**ImRemoveTagRequest**](ImRemoveTagRequest.md)|  | [optional] |

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

<a name="imSetAttr"></a>
# **imSetAttr**
> CommonResponse imSetAttr(random, imSetAttrRequest)

设置用户属性（https://cloud.tencent.com/document/product/269/45938）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AllMemberPushApi;

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

    AllMemberPushApi apiInstance = new AllMemberPushApi(defaultClient);
    Integer random = 56; // Integer | 
    ImSetAttrRequest imSetAttrRequest = new ImSetAttrRequest(); // ImSetAttrRequest | 
    try {
      CommonResponse result = apiInstance.imSetAttr(random, imSetAttrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AllMemberPushApi#imSetAttr");
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
| **imSetAttrRequest** | [**ImSetAttrRequest**](ImSetAttrRequest.md)|  | [optional] |

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

<a name="imSetAttrName"></a>
# **imSetAttrName**
> CommonResponse imSetAttrName(random, imSetAttrNameRequest)

设置应用属性名称（https://cloud.tencent.com/document/product/269/45935）

### Example
```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.AllMemberPushApi;

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

    AllMemberPushApi apiInstance = new AllMemberPushApi(defaultClient);
    Integer random = 56; // Integer | 
    ImSetAttrNameRequest imSetAttrNameRequest = new ImSetAttrNameRequest(); // ImSetAttrNameRequest | 
    try {
      CommonResponse result = apiInstance.imSetAttrName(random, imSetAttrNameRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AllMemberPushApi#imSetAttrName");
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
| **imSetAttrNameRequest** | [**ImSetAttrNameRequest**](ImSetAttrNameRequest.md)|  | [optional] |

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

