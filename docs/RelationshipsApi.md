# RelationshipsApi

All URIs are relative to *https://console.tim.qq.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**blackListAdd**](RelationshipsApi.md#blackListAdd) | **POST** /v4/sns/black_list_add | 添加黑名单（https://cloud.tencent.com/document/product/269/3718） |
| [**blackListCheck**](RelationshipsApi.md#blackListCheck) | **POST** /v4/sns/black_list_check | 校验黑名单（https://cloud.tencent.com/document/product/269/3725） |
| [**blackListDelete**](RelationshipsApi.md#blackListDelete) | **POST** /v4/sns/black_list_delete | 删除黑名单（https://cloud.tencent.com/document/product/269/3719） |
| [**blackListGet**](RelationshipsApi.md#blackListGet) | **POST** /v4/sns/black_list_get | 拉取黑名单（https://cloud.tencent.com/document/product/269/3722） |
| [**friendAdd**](RelationshipsApi.md#friendAdd) | **POST** /v4/sns/friend_add | 添加好友（https://cloud.tencent.com/document/product/269/1643） |
| [**friendCheck**](RelationshipsApi.md#friendCheck) | **POST** /v4/sns/friend_check | 校验好友（https://cloud.tencent.com/document/product/269/1646） |
| [**friendDelete**](RelationshipsApi.md#friendDelete) | **POST** /v4/sns/friend_delete | 删除好友（https://cloud.tencent.com/document/product/269/1644） |
| [**friendDeleteAll**](RelationshipsApi.md#friendDeleteAll) | **POST** /v4/sns/friend_delete_all | 删除所有好友（https://cloud.tencent.com/document/product/269/1645） |
| [**friendGet**](RelationshipsApi.md#friendGet) | **POST** /v4/sns/friend_get | 拉取好友（https://cloud.tencent.com/document/product/269/1647） |
| [**friendGetList**](RelationshipsApi.md#friendGetList) | **POST** /v4/sns/friend_get_list | 拉取指定好友（https://cloud.tencent.com/document/product/269/8609） |
| [**friendImport**](RelationshipsApi.md#friendImport) | **POST** /v4/sns/friend_import | 导入好友（https://cloud.tencent.com/document/product/269/8301） |
| [**friendUpdate**](RelationshipsApi.md#friendUpdate) | **POST** /v4/sns/friend_update | 更新好友（https://cloud.tencent.com/document/product/269/12525） |
| [**groupAdd**](RelationshipsApi.md#groupAdd) | **POST** /v4/sns/group_add | 添加分组（https://cloud.tencent.com/document/product/269/10107） |
| [**groupDelete**](RelationshipsApi.md#groupDelete) | **POST** /v4/sns/group_delete | 删除分组（https://cloud.tencent.com/document/product/269/10108） |
| [**groupGet**](RelationshipsApi.md#groupGet) | **POST** /v4/sns/group_get | 拉取分组（https://cloud.tencent.com/document/product/269/54763） |



## blackListAdd

> BlackListAddResponse blackListAdd(random, blackListAddRequest)

添加黑名单（https://cloud.tencent.com/document/product/269/3718）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        Integer random = 56; // Integer | 
        BlackListAddRequest blackListAddRequest = new BlackListAddRequest(); // BlackListAddRequest | 
        //TODO: Set the parameters

        try {
            BlackListAddResponse result = apiInstance.blackListAdd(random, blackListAddRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#blackListAdd");
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
| **blackListAddRequest** | [**BlackListAddRequest**](BlackListAddRequest.md)|  | [optional] |

### Return type

[**BlackListAddResponse**](BlackListAddResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## blackListCheck

> BlackListCheckResponse blackListCheck(random, blackListCheckRequest)

校验黑名单（https://cloud.tencent.com/document/product/269/3725）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        Integer random = 56; // Integer | 
        BlackListCheckRequest blackListCheckRequest = new BlackListCheckRequest(); // BlackListCheckRequest | 
        //TODO: Set the parameters

        try {
            BlackListCheckResponse result = apiInstance.blackListCheck(random, blackListCheckRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#blackListCheck");
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
| **blackListCheckRequest** | [**BlackListCheckRequest**](BlackListCheckRequest.md)|  | [optional] |

### Return type

[**BlackListCheckResponse**](BlackListCheckResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## blackListDelete

> BlackListDeleteResponse blackListDelete(random, blackListDeleteRequest)

删除黑名单（https://cloud.tencent.com/document/product/269/3719）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        Integer random = 56; // Integer | 
        BlackListDeleteRequest blackListDeleteRequest = new BlackListDeleteRequest(); // BlackListDeleteRequest | 
        //TODO: Set the parameters

        try {
            BlackListDeleteResponse result = apiInstance.blackListDelete(random, blackListDeleteRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#blackListDelete");
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
| **blackListDeleteRequest** | [**BlackListDeleteRequest**](BlackListDeleteRequest.md)|  | [optional] |

### Return type

[**BlackListDeleteResponse**](BlackListDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## blackListGet

> BlackListGetResponse blackListGet(random, blackListGetRequest)

拉取黑名单（https://cloud.tencent.com/document/product/269/3722）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        Integer random = 56; // Integer | 
        BlackListGetRequest blackListGetRequest = new BlackListGetRequest(); // BlackListGetRequest | 
        //TODO: Set the parameters

        try {
            BlackListGetResponse result = apiInstance.blackListGet(random, blackListGetRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#blackListGet");
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
| **blackListGetRequest** | [**BlackListGetRequest**](BlackListGetRequest.md)|  | [optional] |

### Return type

[**BlackListGetResponse**](BlackListGetResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## friendAdd

> FriendAddResponse friendAdd(random, friendAddRequest)

添加好友（https://cloud.tencent.com/document/product/269/1643）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        Integer random = 56; // Integer | 
        FriendAddRequest friendAddRequest = new FriendAddRequest(); // FriendAddRequest | 
        //TODO: Set the parameters

        try {
            FriendAddResponse result = apiInstance.friendAdd(random, friendAddRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#friendAdd");
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
| **friendAddRequest** | [**FriendAddRequest**](FriendAddRequest.md)|  | [optional] |

### Return type

[**FriendAddResponse**](FriendAddResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## friendCheck

> FriendCheckResponse friendCheck(random, friendCheckRequest)

校验好友（https://cloud.tencent.com/document/product/269/1646）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        Integer random = 56; // Integer | 
        FriendCheckRequest friendCheckRequest = new FriendCheckRequest(); // FriendCheckRequest | 
        //TODO: Set the parameters

        try {
            FriendCheckResponse result = apiInstance.friendCheck(random, friendCheckRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#friendCheck");
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
| **friendCheckRequest** | [**FriendCheckRequest**](FriendCheckRequest.md)|  | [optional] |

### Return type

[**FriendCheckResponse**](FriendCheckResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## friendDelete

> FriendDeleteResponse friendDelete(random, friendDeleteRequest)

删除好友（https://cloud.tencent.com/document/product/269/1644）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        Integer random = 56; // Integer | 
        FriendDeleteRequest friendDeleteRequest = new FriendDeleteRequest(); // FriendDeleteRequest | 
        //TODO: Set the parameters

        try {
            FriendDeleteResponse result = apiInstance.friendDelete(random, friendDeleteRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#friendDelete");
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
| **friendDeleteRequest** | [**FriendDeleteRequest**](FriendDeleteRequest.md)|  | [optional] |

### Return type

[**FriendDeleteResponse**](FriendDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## friendDeleteAll

> FriendDeleteAllResponse friendDeleteAll(random, friendDeleteAllRequest)

删除所有好友（https://cloud.tencent.com/document/product/269/1645）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        Integer random = 56; // Integer | 
        FriendDeleteAllRequest friendDeleteAllRequest = new FriendDeleteAllRequest(); // FriendDeleteAllRequest | 
        //TODO: Set the parameters

        try {
            FriendDeleteAllResponse result = apiInstance.friendDeleteAll(random, friendDeleteAllRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#friendDeleteAll");
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
| **friendDeleteAllRequest** | [**FriendDeleteAllRequest**](FriendDeleteAllRequest.md)|  | [optional] |

### Return type

[**FriendDeleteAllResponse**](FriendDeleteAllResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## friendGet

> FriendGetResponse friendGet(random, friendGetRequest)

拉取好友（https://cloud.tencent.com/document/product/269/1647）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        Integer random = 56; // Integer | 
        FriendGetRequest friendGetRequest = new FriendGetRequest(); // FriendGetRequest | 
        //TODO: Set the parameters

        try {
            FriendGetResponse result = apiInstance.friendGet(random, friendGetRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#friendGet");
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
| **friendGetRequest** | [**FriendGetRequest**](FriendGetRequest.md)|  | [optional] |

### Return type

[**FriendGetResponse**](FriendGetResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## friendGetList

> FriendGetListResponse friendGetList(random, friendGetListRequest)

拉取指定好友（https://cloud.tencent.com/document/product/269/8609）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        Integer random = 56; // Integer | 
        FriendGetListRequest friendGetListRequest = new FriendGetListRequest(); // FriendGetListRequest | 
        //TODO: Set the parameters

        try {
            FriendGetListResponse result = apiInstance.friendGetList(random, friendGetListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#friendGetList");
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
| **friendGetListRequest** | [**FriendGetListRequest**](FriendGetListRequest.md)|  | [optional] |

### Return type

[**FriendGetListResponse**](FriendGetListResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## friendImport

> FriendImportResponse friendImport(random, friendImportRequest)

导入好友（https://cloud.tencent.com/document/product/269/8301）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        Integer random = 56; // Integer | 
        FriendImportRequest friendImportRequest = new FriendImportRequest(); // FriendImportRequest | 
        //TODO: Set the parameters

        try {
            FriendImportResponse result = apiInstance.friendImport(random, friendImportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#friendImport");
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
| **friendImportRequest** | [**FriendImportRequest**](FriendImportRequest.md)|  | [optional] |

### Return type

[**FriendImportResponse**](FriendImportResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## friendUpdate

> FriendUpdateResponse friendUpdate(random, friendUpdateRequest)

更新好友（https://cloud.tencent.com/document/product/269/12525）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        Integer random = 56; // Integer | 
        FriendUpdateRequest friendUpdateRequest = new FriendUpdateRequest(); // FriendUpdateRequest | 
        //TODO: Set the parameters

        try {
            FriendUpdateResponse result = apiInstance.friendUpdate(random, friendUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#friendUpdate");
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
| **friendUpdateRequest** | [**FriendUpdateRequest**](FriendUpdateRequest.md)|  | [optional] |

### Return type

[**FriendUpdateResponse**](FriendUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## groupAdd

> GroupAddResponse groupAdd(random, groupAddRequest)

添加分组（https://cloud.tencent.com/document/product/269/10107）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        Integer random = 56; // Integer | 
        GroupAddRequest groupAddRequest = new GroupAddRequest(); // GroupAddRequest | 
        //TODO: Set the parameters

        try {
            GroupAddResponse result = apiInstance.groupAdd(random, groupAddRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#groupAdd");
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
| **groupAddRequest** | [**GroupAddRequest**](GroupAddRequest.md)|  | [optional] |

### Return type

[**GroupAddResponse**](GroupAddResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## groupDelete

> GroupDeleteResponse groupDelete(random, groupDeleteRequest)

删除分组（https://cloud.tencent.com/document/product/269/10108）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        Integer random = 56; // Integer | 
        GroupDeleteRequest groupDeleteRequest = new GroupDeleteRequest(); // GroupDeleteRequest | 
        //TODO: Set the parameters

        try {
            GroupDeleteResponse result = apiInstance.groupDelete(random, groupDeleteRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#groupDelete");
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
| **groupDeleteRequest** | [**GroupDeleteRequest**](GroupDeleteRequest.md)|  | [optional] |

### Return type

[**GroupDeleteResponse**](GroupDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## groupGet

> GroupGetResponse groupGet(random, groupGetRequest)

拉取分组（https://cloud.tencent.com/document/product/269/54763）

### Example

```java
// Import classes:
import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.models.*;
import tencentcloud.im.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        Integer random = 56; // Integer | 
        GroupGetRequest groupGetRequest = new GroupGetRequest(); // GroupGetRequest | 
        //TODO: Set the parameters

        try {
            GroupGetResponse result = apiInstance.groupGet(random, groupGetRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#groupGet");
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
| **groupGetRequest** | [**GroupGetRequest**](GroupGetRequest.md)|  | [optional] |

### Return type

[**GroupGetResponse**](GroupGetResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |

