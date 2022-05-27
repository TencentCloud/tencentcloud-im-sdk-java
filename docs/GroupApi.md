# GroupApi

All URIs are relative to *https://console.tim.qq.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGroupMember**](GroupApi.md#addGroupMember) | **POST** /v4/group_open_http_svc/add_group_member | 增加群成员（https://cloud.tencent.com/document/product/269/1621） |
| [**changeGroupOwner**](GroupApi.md#changeGroupOwner) | **POST** /v4/group_open_http_svc/change_group_owner | 转让群主（https://cloud.tencent.com/document/product/269/1633） |
| [**clearGroupAttr**](GroupApi.md#clearGroupAttr) | **POST** /v4/group_open_http_svc/clear_group_attr | 清空群自定义属性（https://cloud.tencent.com/document/product/269/67009） |
| [**createGroup**](GroupApi.md#createGroup) | **POST** /v4/group_open_http_svc/create_group | 创建群组（https://cloud.tencent.com/document/product/269/1615） |
| [**deleteGroupMember**](GroupApi.md#deleteGroupMember) | **POST** /v4/group_open_http_svc/delete_group_member | 删除群成员（https://cloud.tencent.com/document/product/269/1622） |
| [**deleteGroupMsgBySender**](GroupApi.md#deleteGroupMsgBySender) | **POST** /v4/group_open_http_svc/delete_group_msg_by_sender | 删除指定用户发送的消息（https://cloud.tencent.com/document/product/269/2359） |
| [**destroyGroup**](GroupApi.md#destroyGroup) | **POST** /v4/group_open_http_svc/destroy_group | 解散群组(https://cloud.tencent.com/document/product/269/1624) |
| [**forbidSendMsg**](GroupApi.md#forbidSendMsg) | **POST** /v4/group_open_http_svc/forbid_send_msg | 批量禁言和取消禁言(https://cloud.tencent.com/document/product/269/1627) |
| [**getAppidGroupList**](GroupApi.md#getAppidGroupList) | **POST** /v4/group_open_http_svc/get_appid_group_list | 获取 App 中的所有群组（https://cloud.tencent.com/document/product/269/1614） |
| [**getGroupAttr**](GroupApi.md#getGroupAttr) | **POST** /v4/group_open_http_svc/get_group_attr | 获取群自定义属性（https://cloud.tencent.com/document/product/269/67012） |
| [**getGroupInfo**](GroupApi.md#getGroupInfo) | **POST** /v4/group_open_http_svc/get_group_info | 获取群详细资料（https://cloud.tencent.com/document/product/269/1616） |
| [**getGroupMemberInfo**](GroupApi.md#getGroupMemberInfo) | **POST** /v4/group_open_http_svc/get_group_member_info | 获取群成员详细资料（https://cloud.tencent.com/document/product/269/1617） |
| [**getGroupShuttedUin**](GroupApi.md#getGroupShuttedUin) | **POST** /v4/group_open_http_svc/get_group_shutted_uin | 获取被禁言群成员列表(https://cloud.tencent.com/document/product/269/2925) |
| [**getJoinedGroupList**](GroupApi.md#getJoinedGroupList) | **POST** /v4/group_open_http_svc/get_joined_group_list | 获取用户所加入的群组(https://cloud.tencent.com/document/product/269/1625) |
| [**getOnlineMemberNum**](GroupApi.md#getOnlineMemberNum) | **POST** /v4/group_open_http_svc/get_online_member_num | 获取直播群在线人数（https://cloud.tencent.com/document/product/269/49180） |
| [**getRoleInGroup**](GroupApi.md#getRoleInGroup) | **POST** /v4/group_open_http_svc/get_role_in_group | 查询用户在群组中的身份(https://cloud.tencent.com/document/product/269/1626) |
| [**groupMsgGetSimple**](GroupApi.md#groupMsgGetSimple) | **POST** /v4/group_open_http_svc/group_msg_get_simple | 拉取群历史消息（https://cloud.tencent.com/document/product/269/2738） |
| [**groupMsgRecall**](GroupApi.md#groupMsgRecall) | **POST** /v4/group_open_http_svc/group_msg_recall | 撤回群消息（https://cloud.tencent.com/document/product/269/12341） |
| [**importGroup**](GroupApi.md#importGroup) | **POST** /v4/group_open_http_svc/import_group | 导入群基础资料（https://cloud.tencent.com/document/product/269/1634） |
| [**importGroupMember**](GroupApi.md#importGroupMember) | **POST** /v4/group_open_http_svc/import_group_member | 导入群成员（https://cloud.tencent.com/document/product/269/1636） |
| [**importGroupMsg**](GroupApi.md#importGroupMsg) | **POST** /v4/group_open_http_svc/import_group_msg | 导入群消息（https://cloud.tencent.com/document/product/269/1635） |
| [**modifyGroupAttr**](GroupApi.md#modifyGroupAttr) | **POST** /v4/group_open_http_svc/modify_group_attr | 修改群自定义属性（https://cloud.tencent.com/document/product/269/67010） |
| [**modifyGroupBaseInfo**](GroupApi.md#modifyGroupBaseInfo) | **POST** /v4/group_open_http_svc/modify_group_base_info | 修改群基础资料（https://cloud.tencent.com/document/product/269/1620） |
| [**modifyGroupMemberInfo**](GroupApi.md#modifyGroupMemberInfo) | **POST** /v4/group_open_http_svc/modify_group_member_info | 修改群成员资料(https://cloud.tencent.com/document/product/269/1623) |
| [**sendGroupMsg**](GroupApi.md#sendGroupMsg) | **POST** /v4/group_open_http_svc/send_group_msg | 在群组中发送普通消息（https://cloud.tencent.com/document/product/269/1629） |
| [**sendGroupSystemNotification**](GroupApi.md#sendGroupSystemNotification) | **POST** /v4/group_open_http_svc/send_group_system_notification | 在群组中发送系统通知（https://cloud.tencent.com/document/product/269/1630） |
| [**setGroupAttr**](GroupApi.md#setGroupAttr) | **POST** /v4/group_open_http_svc/set_group_attr | 重置群自定义属性（https://cloud.tencent.com/document/product/269/67011） |
| [**setUnreadMsgNum**](GroupApi.md#setUnreadMsgNum) | **POST** /v4/group_open_http_svc/set_unread_msg_num | 设置成员未读消息计数（https://cloud.tencent.com/document/product/269/1637） |



## addGroupMember

> AddGroupMemberResponse addGroupMember(random, addGroupMemberRequest)

增加群成员（https://cloud.tencent.com/document/product/269/1621）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        AddGroupMemberRequest addGroupMemberRequest = new AddGroupMemberRequest(); // AddGroupMemberRequest | 
        //TODO: Set the parameters

        try {
            AddGroupMemberResponse result = apiInstance.addGroupMember(random, addGroupMemberRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#addGroupMember");
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
| **addGroupMemberRequest** | [**AddGroupMemberRequest**](AddGroupMemberRequest.md)|  | [optional] |

### Return type

[**AddGroupMemberResponse**](AddGroupMemberResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## changeGroupOwner

> CommonResponse changeGroupOwner(random, changeGroupOwnerRequest)

转让群主（https://cloud.tencent.com/document/product/269/1633）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        ChangeGroupOwnerRequest changeGroupOwnerRequest = new ChangeGroupOwnerRequest(); // ChangeGroupOwnerRequest | 
        //TODO: Set the parameters

        try {
            CommonResponse result = apiInstance.changeGroupOwner(random, changeGroupOwnerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#changeGroupOwner");
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
| **changeGroupOwnerRequest** | [**ChangeGroupOwnerRequest**](ChangeGroupOwnerRequest.md)|  | [optional] |

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


## clearGroupAttr

> CommonResponse clearGroupAttr(random, clearGroupAttrRequest)

清空群自定义属性（https://cloud.tencent.com/document/product/269/67009）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        ClearGroupAttrRequest clearGroupAttrRequest = new ClearGroupAttrRequest(); // ClearGroupAttrRequest | 
        //TODO: Set the parameters

        try {
            CommonResponse result = apiInstance.clearGroupAttr(random, clearGroupAttrRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#clearGroupAttr");
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
| **clearGroupAttrRequest** | [**ClearGroupAttrRequest**](ClearGroupAttrRequest.md)|  | [optional] |

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


## createGroup

> CreateGroupResponse createGroup(random, createGroupRequest)

创建群组（https://cloud.tencent.com/document/product/269/1615）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        CreateGroupRequest createGroupRequest = new CreateGroupRequest(); // CreateGroupRequest | 
        //TODO: Set the parameters

        try {
            CreateGroupResponse result = apiInstance.createGroup(random, createGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#createGroup");
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
| **createGroupRequest** | [**CreateGroupRequest**](CreateGroupRequest.md)|  | [optional] |

### Return type

[**CreateGroupResponse**](CreateGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## deleteGroupMember

> CommonResponse deleteGroupMember(random, deleteGroupMemberRequest)

删除群成员（https://cloud.tencent.com/document/product/269/1622）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        DeleteGroupMemberRequest deleteGroupMemberRequest = new DeleteGroupMemberRequest(); // DeleteGroupMemberRequest | 
        //TODO: Set the parameters

        try {
            CommonResponse result = apiInstance.deleteGroupMember(random, deleteGroupMemberRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#deleteGroupMember");
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
| **deleteGroupMemberRequest** | [**DeleteGroupMemberRequest**](DeleteGroupMemberRequest.md)|  | [optional] |

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


## deleteGroupMsgBySender

> CommonResponse deleteGroupMsgBySender(random, deleteGroupMsgBySenderRequest)

删除指定用户发送的消息（https://cloud.tencent.com/document/product/269/2359）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderRequest = new DeleteGroupMsgBySenderRequest(); // DeleteGroupMsgBySenderRequest | 
        //TODO: Set the parameters

        try {
            CommonResponse result = apiInstance.deleteGroupMsgBySender(random, deleteGroupMsgBySenderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#deleteGroupMsgBySender");
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
| **deleteGroupMsgBySenderRequest** | [**DeleteGroupMsgBySenderRequest**](DeleteGroupMsgBySenderRequest.md)|  | [optional] |

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


## destroyGroup

> CommonResponse destroyGroup(random, destroyGroupRequest)

解散群组(https://cloud.tencent.com/document/product/269/1624)

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        DestroyGroupRequest destroyGroupRequest = new DestroyGroupRequest(); // DestroyGroupRequest | 
        //TODO: Set the parameters

        try {
            CommonResponse result = apiInstance.destroyGroup(random, destroyGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#destroyGroup");
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
| **destroyGroupRequest** | [**DestroyGroupRequest**](DestroyGroupRequest.md)|  | [optional] |

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


## forbidSendMsg

> CommonResponse forbidSendMsg(random, forbidSendMsgRequest)

批量禁言和取消禁言(https://cloud.tencent.com/document/product/269/1627)

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        ForbidSendMsgRequest forbidSendMsgRequest = new ForbidSendMsgRequest(); // ForbidSendMsgRequest | 
        //TODO: Set the parameters

        try {
            CommonResponse result = apiInstance.forbidSendMsg(random, forbidSendMsgRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#forbidSendMsg");
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
| **forbidSendMsgRequest** | [**ForbidSendMsgRequest**](ForbidSendMsgRequest.md)|  | [optional] |

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


## getAppidGroupList

> GetAppidGroupListResponse getAppidGroupList(random, getAppidGroupListRequest)

获取 App 中的所有群组（https://cloud.tencent.com/document/product/269/1614）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        GetAppidGroupListRequest getAppidGroupListRequest = new GetAppidGroupListRequest(); // GetAppidGroupListRequest | 
        //TODO: Set the parameters

        try {
            GetAppidGroupListResponse result = apiInstance.getAppidGroupList(random, getAppidGroupListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#getAppidGroupList");
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
| **getAppidGroupListRequest** | [**GetAppidGroupListRequest**](GetAppidGroupListRequest.md)|  | [optional] |

### Return type

[**GetAppidGroupListResponse**](GetAppidGroupListResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## getGroupAttr

> GetGroupAttrResponse getGroupAttr(random, getGroupAttrRequest)

获取群自定义属性（https://cloud.tencent.com/document/product/269/67012）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        GetGroupAttrRequest getGroupAttrRequest = new GetGroupAttrRequest(); // GetGroupAttrRequest | 
        //TODO: Set the parameters

        try {
            GetGroupAttrResponse result = apiInstance.getGroupAttr(random, getGroupAttrRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#getGroupAttr");
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
| **getGroupAttrRequest** | [**GetGroupAttrRequest**](GetGroupAttrRequest.md)|  | [optional] |

### Return type

[**GetGroupAttrResponse**](GetGroupAttrResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## getGroupInfo

> GetGroupInfoResponse getGroupInfo(random, getGroupInfoRequest)

获取群详细资料（https://cloud.tencent.com/document/product/269/1616）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        GetGroupInfoRequest getGroupInfoRequest = new GetGroupInfoRequest(); // GetGroupInfoRequest | 
        //TODO: Set the parameters

        try {
            GetGroupInfoResponse result = apiInstance.getGroupInfo(random, getGroupInfoRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#getGroupInfo");
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
| **getGroupInfoRequest** | [**GetGroupInfoRequest**](GetGroupInfoRequest.md)|  | [optional] |

### Return type

[**GetGroupInfoResponse**](GetGroupInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## getGroupMemberInfo

> GetGroupMemberInfoResponse getGroupMemberInfo(random, getGroupMemberInfoRequest)

获取群成员详细资料（https://cloud.tencent.com/document/product/269/1617）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        GetGroupMemberInfoRequest getGroupMemberInfoRequest = new GetGroupMemberInfoRequest(); // GetGroupMemberInfoRequest | 
        //TODO: Set the parameters

        try {
            GetGroupMemberInfoResponse result = apiInstance.getGroupMemberInfo(random, getGroupMemberInfoRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#getGroupMemberInfo");
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
| **getGroupMemberInfoRequest** | [**GetGroupMemberInfoRequest**](GetGroupMemberInfoRequest.md)|  | [optional] |

### Return type

[**GetGroupMemberInfoResponse**](GetGroupMemberInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## getGroupShuttedUin

> GetGroupShuttedUinResponse getGroupShuttedUin(random, getGroupShuttedUinRequest)

获取被禁言群成员列表(https://cloud.tencent.com/document/product/269/2925)

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        GetGroupShuttedUinRequest getGroupShuttedUinRequest = new GetGroupShuttedUinRequest(); // GetGroupShuttedUinRequest | 
        //TODO: Set the parameters

        try {
            GetGroupShuttedUinResponse result = apiInstance.getGroupShuttedUin(random, getGroupShuttedUinRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#getGroupShuttedUin");
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
| **getGroupShuttedUinRequest** | [**GetGroupShuttedUinRequest**](GetGroupShuttedUinRequest.md)|  | [optional] |

### Return type

[**GetGroupShuttedUinResponse**](GetGroupShuttedUinResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## getJoinedGroupList

> GetJoinedGroupListResponse getJoinedGroupList(random, getJoinedGroupListRequest)

获取用户所加入的群组(https://cloud.tencent.com/document/product/269/1625)

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        GetJoinedGroupListRequest getJoinedGroupListRequest = new GetJoinedGroupListRequest(); // GetJoinedGroupListRequest | 
        //TODO: Set the parameters

        try {
            GetJoinedGroupListResponse result = apiInstance.getJoinedGroupList(random, getJoinedGroupListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#getJoinedGroupList");
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
| **getJoinedGroupListRequest** | [**GetJoinedGroupListRequest**](GetJoinedGroupListRequest.md)|  | [optional] |

### Return type

[**GetJoinedGroupListResponse**](GetJoinedGroupListResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## getOnlineMemberNum

> GetOnlineMemberNumResponse getOnlineMemberNum(random, getOnlineMemberNumRequest)

获取直播群在线人数（https://cloud.tencent.com/document/product/269/49180）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        GetOnlineMemberNumRequest getOnlineMemberNumRequest = new GetOnlineMemberNumRequest(); // GetOnlineMemberNumRequest | 
        //TODO: Set the parameters

        try {
            GetOnlineMemberNumResponse result = apiInstance.getOnlineMemberNum(random, getOnlineMemberNumRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#getOnlineMemberNum");
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
| **getOnlineMemberNumRequest** | [**GetOnlineMemberNumRequest**](GetOnlineMemberNumRequest.md)|  | [optional] |

### Return type

[**GetOnlineMemberNumResponse**](GetOnlineMemberNumResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## getRoleInGroup

> GetRoleInGroupResponse getRoleInGroup(random, getRoleInGroupRequest)

查询用户在群组中的身份(https://cloud.tencent.com/document/product/269/1626)

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        GetRoleInGroupRequest getRoleInGroupRequest = new GetRoleInGroupRequest(); // GetRoleInGroupRequest | 
        //TODO: Set the parameters

        try {
            GetRoleInGroupResponse result = apiInstance.getRoleInGroup(random, getRoleInGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#getRoleInGroup");
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
| **getRoleInGroupRequest** | [**GetRoleInGroupRequest**](GetRoleInGroupRequest.md)|  | [optional] |

### Return type

[**GetRoleInGroupResponse**](GetRoleInGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## groupMsgGetSimple

> GroupMsgGetSimpleResponse groupMsgGetSimple(random, groupMsgGetSimpleRequest)

拉取群历史消息（https://cloud.tencent.com/document/product/269/2738）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        GroupMsgGetSimpleRequest groupMsgGetSimpleRequest = new GroupMsgGetSimpleRequest(); // GroupMsgGetSimpleRequest | 
        //TODO: Set the parameters

        try {
            GroupMsgGetSimpleResponse result = apiInstance.groupMsgGetSimple(random, groupMsgGetSimpleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#groupMsgGetSimple");
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
| **groupMsgGetSimpleRequest** | [**GroupMsgGetSimpleRequest**](GroupMsgGetSimpleRequest.md)|  | [optional] |

### Return type

[**GroupMsgGetSimpleResponse**](GroupMsgGetSimpleResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## groupMsgRecall

> GroupMsgRecallResponse groupMsgRecall(random, groupMsgRecallRequest)

撤回群消息（https://cloud.tencent.com/document/product/269/12341）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        GroupMsgRecallRequest groupMsgRecallRequest = new GroupMsgRecallRequest(); // GroupMsgRecallRequest | 
        //TODO: Set the parameters

        try {
            GroupMsgRecallResponse result = apiInstance.groupMsgRecall(random, groupMsgRecallRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#groupMsgRecall");
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
| **groupMsgRecallRequest** | [**GroupMsgRecallRequest**](GroupMsgRecallRequest.md)|  | [optional] |

### Return type

[**GroupMsgRecallResponse**](GroupMsgRecallResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## importGroup

> ImportGroupResponse importGroup(random, importGroupRequest)

导入群基础资料（https://cloud.tencent.com/document/product/269/1634）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        ImportGroupRequest importGroupRequest = new ImportGroupRequest(); // ImportGroupRequest | 
        //TODO: Set the parameters

        try {
            ImportGroupResponse result = apiInstance.importGroup(random, importGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#importGroup");
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
| **importGroupRequest** | [**ImportGroupRequest**](ImportGroupRequest.md)|  | [optional] |

### Return type

[**ImportGroupResponse**](ImportGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## importGroupMember

> ImportGroupMemberResponse importGroupMember(random, importGroupMemberRequest)

导入群成员（https://cloud.tencent.com/document/product/269/1636）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        ImportGroupMemberRequest importGroupMemberRequest = new ImportGroupMemberRequest(); // ImportGroupMemberRequest | 
        //TODO: Set the parameters

        try {
            ImportGroupMemberResponse result = apiInstance.importGroupMember(random, importGroupMemberRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#importGroupMember");
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
| **importGroupMemberRequest** | [**ImportGroupMemberRequest**](ImportGroupMemberRequest.md)|  | [optional] |

### Return type

[**ImportGroupMemberResponse**](ImportGroupMemberResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## importGroupMsg

> ImportGroupMsgResponse importGroupMsg(random, importGroupMsgRequest)

导入群消息（https://cloud.tencent.com/document/product/269/1635）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        ImportGroupMsgRequest importGroupMsgRequest = new ImportGroupMsgRequest(); // ImportGroupMsgRequest | 
        //TODO: Set the parameters

        try {
            ImportGroupMsgResponse result = apiInstance.importGroupMsg(random, importGroupMsgRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#importGroupMsg");
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
| **importGroupMsgRequest** | [**ImportGroupMsgRequest**](ImportGroupMsgRequest.md)|  | [optional] |

### Return type

[**ImportGroupMsgResponse**](ImportGroupMsgResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## modifyGroupAttr

> CommonResponse modifyGroupAttr(random, modifyGroupAttrRequest)

修改群自定义属性（https://cloud.tencent.com/document/product/269/67010）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        ModifyGroupAttrRequest modifyGroupAttrRequest = new ModifyGroupAttrRequest(); // ModifyGroupAttrRequest | 
        //TODO: Set the parameters

        try {
            CommonResponse result = apiInstance.modifyGroupAttr(random, modifyGroupAttrRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#modifyGroupAttr");
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
| **modifyGroupAttrRequest** | [**ModifyGroupAttrRequest**](ModifyGroupAttrRequest.md)|  | [optional] |

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


## modifyGroupBaseInfo

> CommonResponse modifyGroupBaseInfo(random, modifyGroupBaseInfoRequest)

修改群基础资料（https://cloud.tencent.com/document/product/269/1620）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        ModifyGroupBaseInfoRequest modifyGroupBaseInfoRequest = new ModifyGroupBaseInfoRequest(); // ModifyGroupBaseInfoRequest | 
        //TODO: Set the parameters

        try {
            CommonResponse result = apiInstance.modifyGroupBaseInfo(random, modifyGroupBaseInfoRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#modifyGroupBaseInfo");
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
| **modifyGroupBaseInfoRequest** | [**ModifyGroupBaseInfoRequest**](ModifyGroupBaseInfoRequest.md)|  | [optional] |

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


## modifyGroupMemberInfo

> CommonResponse modifyGroupMemberInfo(random, modifyGroupMemberInfoRequest)

修改群成员资料(https://cloud.tencent.com/document/product/269/1623)

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        ModifyGroupMemberInfoRequest modifyGroupMemberInfoRequest = new ModifyGroupMemberInfoRequest(); // ModifyGroupMemberInfoRequest | 
        //TODO: Set the parameters

        try {
            CommonResponse result = apiInstance.modifyGroupMemberInfo(random, modifyGroupMemberInfoRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#modifyGroupMemberInfo");
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
| **modifyGroupMemberInfoRequest** | [**ModifyGroupMemberInfoRequest**](ModifyGroupMemberInfoRequest.md)|  | [optional] |

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


## sendGroupMsg

> SendGroupMsgResponse sendGroupMsg(random, sendGroupMsgRequest)

在群组中发送普通消息（https://cloud.tencent.com/document/product/269/1629）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        SendGroupMsgRequest sendGroupMsgRequest = new SendGroupMsgRequest(); // SendGroupMsgRequest | 
        //TODO: Set the parameters

        try {
            SendGroupMsgResponse result = apiInstance.sendGroupMsg(random, sendGroupMsgRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#sendGroupMsg");
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
| **sendGroupMsgRequest** | [**SendGroupMsgRequest**](SendGroupMsgRequest.md)|  | [optional] |

### Return type

[**SendGroupMsgResponse**](SendGroupMsgResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 正常响应 |  -  |


## sendGroupSystemNotification

> CommonResponse sendGroupSystemNotification(random, sendGroupSystemNotificationRequest)

在群组中发送系统通知（https://cloud.tencent.com/document/product/269/1630）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        SendGroupSystemNotificationRequest sendGroupSystemNotificationRequest = new SendGroupSystemNotificationRequest(); // SendGroupSystemNotificationRequest | 
        //TODO: Set the parameters

        try {
            CommonResponse result = apiInstance.sendGroupSystemNotification(random, sendGroupSystemNotificationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#sendGroupSystemNotification");
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
| **sendGroupSystemNotificationRequest** | [**SendGroupSystemNotificationRequest**](SendGroupSystemNotificationRequest.md)|  | [optional] |

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


## setGroupAttr

> CommonResponse setGroupAttr(random, setGroupAttrRequest)

重置群自定义属性（https://cloud.tencent.com/document/product/269/67011）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        SetGroupAttrRequest setGroupAttrRequest = new SetGroupAttrRequest(); // SetGroupAttrRequest | 
        //TODO: Set the parameters

        try {
            CommonResponse result = apiInstance.setGroupAttr(random, setGroupAttrRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#setGroupAttr");
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
| **setGroupAttrRequest** | [**SetGroupAttrRequest**](SetGroupAttrRequest.md)|  | [optional] |

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


## setUnreadMsgNum

> CommonResponse setUnreadMsgNum(random, setUnreadMsgNumRequest)

设置成员未读消息计数（https://cloud.tencent.com/document/product/269/1637）

### Example

```java
// Import classes:
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.models.*;
import com.tencentcloudapi.im.api.GroupApi;

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

        GroupApi apiInstance = new GroupApi(defaultClient);
        Integer random = 56; // Integer | 
        SetUnreadMsgNumRequest setUnreadMsgNumRequest = new SetUnreadMsgNumRequest(); // SetUnreadMsgNumRequest | 
        //TODO: Set the parameters

        try {
            CommonResponse result = apiInstance.setUnreadMsgNum(random, setUnreadMsgNumRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#setUnreadMsgNum");
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
| **setUnreadMsgNumRequest** | [**SetUnreadMsgNumRequest**](SetUnreadMsgNumRequest.md)|  | [optional] |

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

