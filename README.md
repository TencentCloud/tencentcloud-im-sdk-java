# tencentcloud-im-sdk-java

TIM SERVER REST API SDK

- API version: 1.0.0

TIM REST API



## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.tencentcloudapi.im</groupId>
  <artifactId>tencentcloud-im-sdk-java</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.tencentcloudapi.im:tencentcloud-im-sdk-java:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/tencentcloud-im-sdk-java-1.0.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.tencentcloudapi.im.*;
import com.tencentcloudapi.im.auth.*;
import com.tencentcloudapi.im.model.*;
import com.tencentcloudapi.im.api.AccountApi;

public class AccountApiExample {

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

## Documentation for API Endpoints

All URIs are relative to *https://console.tim.qq.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**accountCheck**](docs/AccountApi.md#accountCheck) | **POST** /v4/im_open_login_svc/account_check | 查询帐号 (https://cloud.tencent.com/document/product/269/38417)
*AccountApi* | [**accountDelete**](docs/AccountApi.md#accountDelete) | **POST** /v4/im_open_login_svc/account_delete | 删除帐号（https://cloud.tencent.com/document/product/269/36443）
*AccountApi* | [**accountImport**](docs/AccountApi.md#accountImport) | **POST** /v4/im_open_login_svc/account_import | 导入单个帐号（https://cloud.tencent.com/document/product/269/1608）
*AccountApi* | [**kick**](docs/AccountApi.md#kick) | **POST** /v4/im_open_login_svc/kick | 失效帐号登录状态（https://cloud.tencent.com/document/product/269/3853）
*AccountApi* | [**multiAccountImport**](docs/AccountApi.md#multiAccountImport) | **POST** /v4/im_open_login_svc/multiaccount_import | 导入多个帐号（https://cloud.tencent.com/document/product/269/4919）
*AccountApi* | [**queryOnlineStatus**](docs/AccountApi.md#queryOnlineStatus) | **POST** /v4/openim/query_online_status | 查询帐号在线状态（https://cloud.tencent.com/document/product/269/2566）
*AllMemberPushApi* | [**imAddTag**](docs/AllMemberPushApi.md#imAddTag) | **POST** /v4/all_member_push/im_add_tag | 添加用户标签（https://cloud.tencent.com/document/product/269/45941）
*AllMemberPushApi* | [**imGetAttr**](docs/AllMemberPushApi.md#imGetAttr) | **POST** /v4/all_member_push/im_get_attr | 获取用户属性（https://cloud.tencent.com/document/product/269/45937）
*AllMemberPushApi* | [**imGetAttrName**](docs/AllMemberPushApi.md#imGetAttrName) | **POST** /v4/all_member_push/im_get_attr_name | 获取应用属性名称（https://cloud.tencent.com/document/product/269/45936）
*AllMemberPushApi* | [**imGetTag**](docs/AllMemberPushApi.md#imGetTag) | **POST** /v4/all_member_push/im_get_tag | 获取用户标签（https://cloud.tencent.com/document/product/269/45940）
*AllMemberPushApi* | [**imPush**](docs/AllMemberPushApi.md#imPush) | **POST** /v4/all_member_push/im_push | 全员推送（https://cloud.tencent.com/document/product/269/45934）
*AllMemberPushApi* | [**imRemoveAllTags**](docs/AllMemberPushApi.md#imRemoveAllTags) | **POST** /v4/all_member_push/im_remove_all_tags | 删除用户所有标签（https://cloud.tencent.com/document/product/269/45943）
*AllMemberPushApi* | [**imRemoveAttr**](docs/AllMemberPushApi.md#imRemoveAttr) | **POST** /v4/all_member_push/im_remove_attr | 删除用户属性（https://cloud.tencent.com/document/product/269/45939）
*AllMemberPushApi* | [**imRemoveTag**](docs/AllMemberPushApi.md#imRemoveTag) | **POST** /v4/all_member_push/im_remove_tag | 删除用户标签（https://cloud.tencent.com/document/product/269/45942）
*AllMemberPushApi* | [**imSetAttr**](docs/AllMemberPushApi.md#imSetAttr) | **POST** /v4/all_member_push/im_set_attr | 设置用户属性（https://cloud.tencent.com/document/product/269/45938）
*AllMemberPushApi* | [**imSetAttrName**](docs/AllMemberPushApi.md#imSetAttrName) | **POST** /v4/all_member_push/im_set_attr_name | 设置应用属性名称（https://cloud.tencent.com/document/product/269/45935）
*GroupApi* | [**addGroupMember**](docs/GroupApi.md#addGroupMember) | **POST** /v4/group_open_http_svc/add_group_member | 增加群成员（https://cloud.tencent.com/document/product/269/1621）
*GroupApi* | [**changeGroupOwner**](docs/GroupApi.md#changeGroupOwner) | **POST** /v4/group_open_http_svc/change_group_owner | 转让群主（https://cloud.tencent.com/document/product/269/1633）
*GroupApi* | [**clearGroupAttr**](docs/GroupApi.md#clearGroupAttr) | **POST** /v4/group_open_http_svc/clear_group_attr | 清空群自定义属性（https://cloud.tencent.com/document/product/269/67009）
*GroupApi* | [**createGroup**](docs/GroupApi.md#createGroup) | **POST** /v4/group_open_http_svc/create_group | 创建群组（https://cloud.tencent.com/document/product/269/1615）
*GroupApi* | [**deleteGroupMember**](docs/GroupApi.md#deleteGroupMember) | **POST** /v4/group_open_http_svc/delete_group_member | 删除群成员（https://cloud.tencent.com/document/product/269/1622）
*GroupApi* | [**deleteGroupMsgBySender**](docs/GroupApi.md#deleteGroupMsgBySender) | **POST** /v4/group_open_http_svc/delete_group_msg_by_sender | 删除指定用户发送的消息（https://cloud.tencent.com/document/product/269/2359）
*GroupApi* | [**destroyGroup**](docs/GroupApi.md#destroyGroup) | **POST** /v4/group_open_http_svc/destroy_group | 解散群组(https://cloud.tencent.com/document/product/269/1624)
*GroupApi* | [**forbidSendMsg**](docs/GroupApi.md#forbidSendMsg) | **POST** /v4/group_open_http_svc/forbid_send_msg | 批量禁言和取消禁言(https://cloud.tencent.com/document/product/269/1627)
*GroupApi* | [**getAppidGroupList**](docs/GroupApi.md#getAppidGroupList) | **POST** /v4/group_open_http_svc/get_appid_group_list | 获取 App 中的所有群组（https://cloud.tencent.com/document/product/269/1614）
*GroupApi* | [**getGroupAttr**](docs/GroupApi.md#getGroupAttr) | **POST** /v4/group_open_http_svc/get_group_attr | 获取群自定义属性（https://cloud.tencent.com/document/product/269/67012）
*GroupApi* | [**getGroupInfo**](docs/GroupApi.md#getGroupInfo) | **POST** /v4/group_open_http_svc/get_group_info | 获取群详细资料（https://cloud.tencent.com/document/product/269/1616）
*GroupApi* | [**getGroupMemberInfo**](docs/GroupApi.md#getGroupMemberInfo) | **POST** /v4/group_open_http_svc/get_group_member_info | 获取群成员详细资料（https://cloud.tencent.com/document/product/269/1617）
*GroupApi* | [**getGroupShuttedUin**](docs/GroupApi.md#getGroupShuttedUin) | **POST** /v4/group_open_http_svc/get_group_shutted_uin | 获取被禁言群成员列表(https://cloud.tencent.com/document/product/269/2925)
*GroupApi* | [**getJoinedGroupList**](docs/GroupApi.md#getJoinedGroupList) | **POST** /v4/group_open_http_svc/get_joined_group_list | 获取用户所加入的群组(https://cloud.tencent.com/document/product/269/1625)
*GroupApi* | [**getOnlineMemberNum**](docs/GroupApi.md#getOnlineMemberNum) | **POST** /v4/group_open_http_svc/get_online_member_num | 获取直播群在线人数（https://cloud.tencent.com/document/product/269/49180）
*GroupApi* | [**getRoleInGroup**](docs/GroupApi.md#getRoleInGroup) | **POST** /v4/group_open_http_svc/get_role_in_group | 查询用户在群组中的身份(https://cloud.tencent.com/document/product/269/1626)
*GroupApi* | [**groupMsgGetSimple**](docs/GroupApi.md#groupMsgGetSimple) | **POST** /v4/group_open_http_svc/group_msg_get_simple | 拉取群历史消息（https://cloud.tencent.com/document/product/269/2738）
*GroupApi* | [**groupMsgRecall**](docs/GroupApi.md#groupMsgRecall) | **POST** /v4/group_open_http_svc/group_msg_recall | 撤回群消息（https://cloud.tencent.com/document/product/269/12341）
*GroupApi* | [**importGroup**](docs/GroupApi.md#importGroup) | **POST** /v4/group_open_http_svc/import_group | 导入群基础资料（https://cloud.tencent.com/document/product/269/1634）
*GroupApi* | [**importGroupMember**](docs/GroupApi.md#importGroupMember) | **POST** /v4/group_open_http_svc/import_group_member | 导入群成员（https://cloud.tencent.com/document/product/269/1636）
*GroupApi* | [**importGroupMsg**](docs/GroupApi.md#importGroupMsg) | **POST** /v4/group_open_http_svc/import_group_msg | 导入群消息（https://cloud.tencent.com/document/product/269/1635）
*GroupApi* | [**modifyGroupAttr**](docs/GroupApi.md#modifyGroupAttr) | **POST** /v4/group_open_http_svc/modify_group_attr | 修改群自定义属性（https://cloud.tencent.com/document/product/269/67010）
*GroupApi* | [**modifyGroupBaseInfo**](docs/GroupApi.md#modifyGroupBaseInfo) | **POST** /v4/group_open_http_svc/modify_group_base_info | 修改群基础资料（https://cloud.tencent.com/document/product/269/1620）
*GroupApi* | [**modifyGroupMemberInfo**](docs/GroupApi.md#modifyGroupMemberInfo) | **POST** /v4/group_open_http_svc/modify_group_member_info | 修改群成员资料(https://cloud.tencent.com/document/product/269/1623)
*GroupApi* | [**sendGroupMsg**](docs/GroupApi.md#sendGroupMsg) | **POST** /v4/group_open_http_svc/send_group_msg | 在群组中发送普通消息（https://cloud.tencent.com/document/product/269/1629）
*GroupApi* | [**sendGroupSystemNotification**](docs/GroupApi.md#sendGroupSystemNotification) | **POST** /v4/group_open_http_svc/send_group_system_notification | 在群组中发送系统通知（https://cloud.tencent.com/document/product/269/1630）
*GroupApi* | [**setGroupAttr**](docs/GroupApi.md#setGroupAttr) | **POST** /v4/group_open_http_svc/set_group_attr | 重置群自定义属性（https://cloud.tencent.com/document/product/269/67011）
*GroupApi* | [**setUnreadMsgNum**](docs/GroupApi.md#setUnreadMsgNum) | **POST** /v4/group_open_http_svc/set_unread_msg_num | 设置成员未读消息计数（https://cloud.tencent.com/document/product/269/1637）
*MuteApi* | [**getnospeaking**](docs/MuteApi.md#getnospeaking) | **POST** /v4/openconfigsvr/getnospeaking | 查询全局禁言（https://cloud.tencent.com/document/product/269/4229）
*MuteApi* | [**setnospeaking**](docs/MuteApi.md#setnospeaking) | **POST** /v4/openconfigsvr/setnospeaking | 设置全局禁言（https://cloud.tencent.com/document/product/269/4230）
*OperationApi* | [**getHistory**](docs/OperationApi.md#getHistory) | **POST** /v4/open_msg_svc/get_history | 下载最近消息记录（https://cloud.tencent.com/document/product/269/1650）
*OperationApi* | [**getIPList**](docs/OperationApi.md#getIPList) | **POST** /v4/ConfigSvc/GetIPList | 获取服务器 IP 地址（https://cloud.tencent.com/document/product/269/45438）
*OperationApi* | [**getappinfo**](docs/OperationApi.md#getappinfo) | **POST** /v4/openconfigsvr/getappinfo | 拉取运营数据（https://cloud.tencent.com/document/product/269/4193）
*PortraitApi* | [**portraitGet**](docs/PortraitApi.md#portraitGet) | **POST** /v4/profile/portrait_get | 拉取资料（https://cloud.tencent.com/document/product/269/1639）
*PortraitApi* | [**portraitSet**](docs/PortraitApi.md#portraitSet) | **POST** /v4/profile/portrait_set | 设置资料（https://cloud.tencent.com/document/product/269/1640）
*RecentContactApi* | [**deleteRecentContact**](docs/RecentContactApi.md#deleteRecentContact) | **POST** /v4/recentcontact/delete | 删除单个会话（https://cloud.tencent.com/document/product/269/62119）
*RecentContactApi* | [**getRecentContactList**](docs/RecentContactApi.md#getRecentContactList) | **POST** /v4/recentcontact/get_list | 拉取会话列表（https://cloud.tencent.com/document/product/269/62118）
*RelationshipsApi* | [**blackListAdd**](docs/RelationshipsApi.md#blackListAdd) | **POST** /v4/sns/black_list_add | 添加黑名单（https://cloud.tencent.com/document/product/269/3718）
*RelationshipsApi* | [**blackListCheck**](docs/RelationshipsApi.md#blackListCheck) | **POST** /v4/sns/black_list_check | 校验黑名单（https://cloud.tencent.com/document/product/269/3725）
*RelationshipsApi* | [**blackListDelete**](docs/RelationshipsApi.md#blackListDelete) | **POST** /v4/sns/black_list_delete | 删除黑名单（https://cloud.tencent.com/document/product/269/3719）
*RelationshipsApi* | [**blackListGet**](docs/RelationshipsApi.md#blackListGet) | **POST** /v4/sns/black_list_get | 拉取黑名单（https://cloud.tencent.com/document/product/269/3722）
*RelationshipsApi* | [**friendAdd**](docs/RelationshipsApi.md#friendAdd) | **POST** /v4/sns/friend_add | 添加好友（https://cloud.tencent.com/document/product/269/1643）
*RelationshipsApi* | [**friendCheck**](docs/RelationshipsApi.md#friendCheck) | **POST** /v4/sns/friend_check | 校验好友（https://cloud.tencent.com/document/product/269/1646）
*RelationshipsApi* | [**friendDelete**](docs/RelationshipsApi.md#friendDelete) | **POST** /v4/sns/friend_delete | 删除好友（https://cloud.tencent.com/document/product/269/1644）
*RelationshipsApi* | [**friendDeleteAll**](docs/RelationshipsApi.md#friendDeleteAll) | **POST** /v4/sns/friend_delete_all | 删除所有好友（https://cloud.tencent.com/document/product/269/1645）
*RelationshipsApi* | [**friendGet**](docs/RelationshipsApi.md#friendGet) | **POST** /v4/sns/friend_get | 拉取好友（https://cloud.tencent.com/document/product/269/1647）
*RelationshipsApi* | [**friendGetList**](docs/RelationshipsApi.md#friendGetList) | **POST** /v4/sns/friend_get_list | 拉取指定好友（https://cloud.tencent.com/document/product/269/8609）
*RelationshipsApi* | [**friendImport**](docs/RelationshipsApi.md#friendImport) | **POST** /v4/sns/friend_import | 导入好友（https://cloud.tencent.com/document/product/269/8301）
*RelationshipsApi* | [**friendUpdate**](docs/RelationshipsApi.md#friendUpdate) | **POST** /v4/sns/friend_update | 更新好友（https://cloud.tencent.com/document/product/269/12525）
*RelationshipsApi* | [**groupAdd**](docs/RelationshipsApi.md#groupAdd) | **POST** /v4/sns/group_add | 添加分组（https://cloud.tencent.com/document/product/269/10107）
*RelationshipsApi* | [**groupDelete**](docs/RelationshipsApi.md#groupDelete) | **POST** /v4/sns/group_delete | 删除分组（https://cloud.tencent.com/document/product/269/10108）
*RelationshipsApi* | [**groupGet**](docs/RelationshipsApi.md#groupGet) | **POST** /v4/sns/group_get | 拉取分组（https://cloud.tencent.com/document/product/269/54763）
*SingleChatApi* | [**adminGetroammsg**](docs/SingleChatApi.md#adminGetroammsg) | **POST** /v4/openim/admin_getroammsg | 查询单聊消息（https://cloud.tencent.com/document/product/269/42794）
*SingleChatApi* | [**adminMsgwithdraw**](docs/SingleChatApi.md#adminMsgwithdraw) | **POST** /v4/openim/admin_msgwithdraw | 撤回单聊消息（https://cloud.tencent.com/document/product/269/38980）
*SingleChatApi* | [**adminSetMsgRead**](docs/SingleChatApi.md#adminSetMsgRead) | **POST** /v4/openim/admin_set_msg_read | 设置单聊消息已读（https://cloud.tencent.com/document/product/269/50349）
*SingleChatApi* | [**batchsendmsg**](docs/SingleChatApi.md#batchsendmsg) | **POST** /v4/openim/batchsendmsg | 批量发单聊消息（https://cloud.tencent.com/document/product/269/1612）
*SingleChatApi* | [**getC2cUnreadMsgNum**](docs/SingleChatApi.md#getC2cUnreadMsgNum) | **POST** /v4/openim/get_c2c_unread_msg_num | 查询单聊未读消息计数（https://cloud.tencent.com/document/product/269/56043）
*SingleChatApi* | [**importmsg**](docs/SingleChatApi.md#importmsg) | **POST** /v4/openim/importmsg | 导入单聊消息（https://cloud.tencent.com/document/product/269/2568）
*SingleChatApi* | [**sendmsg**](docs/SingleChatApi.md#sendmsg) | **POST** /v4/openim/sendmsg | 单发单聊消息（https://cloud.tencent.com/document/product/269/2282）


## Documentation for Models

 - [AccountCheckRequest](docs/AccountCheckRequest.md)
 - [AccountCheckRequestCheckItemInner](docs/AccountCheckRequestCheckItemInner.md)
 - [AccountCheckResponse](docs/AccountCheckResponse.md)
 - [AccountCheckResponseAllOf](docs/AccountCheckResponseAllOf.md)
 - [AccountCheckResponseAllOfResultItem](docs/AccountCheckResponseAllOfResultItem.md)
 - [AccountDeleteRequest](docs/AccountDeleteRequest.md)
 - [AccountDeleteRequestDeleteItemInner](docs/AccountDeleteRequestDeleteItemInner.md)
 - [AccountDeleteResponse](docs/AccountDeleteResponse.md)
 - [AccountDeleteResponseAllOf](docs/AccountDeleteResponseAllOf.md)
 - [AccountDeleteResponseAllOfResultItem](docs/AccountDeleteResponseAllOfResultItem.md)
 - [AccountImportRequest](docs/AccountImportRequest.md)
 - [AddGroupMemberRequest](docs/AddGroupMemberRequest.md)
 - [AddGroupMemberRequestMemberListInner](docs/AddGroupMemberRequestMemberListInner.md)
 - [AddGroupMemberResponse](docs/AddGroupMemberResponse.md)
 - [AddGroupMemberResponseAllOf](docs/AddGroupMemberResponseAllOf.md)
 - [AddGroupMemberResponseAllOfMemberList](docs/AddGroupMemberResponseAllOfMemberList.md)
 - [BatchSendSingleChatMsgRequest](docs/BatchSendSingleChatMsgRequest.md)
 - [BatchSendSingleChatMsgResponse](docs/BatchSendSingleChatMsgResponse.md)
 - [BatchSendSingleChatMsgResponseAllOf](docs/BatchSendSingleChatMsgResponseAllOf.md)
 - [BatchSendSingleChatMsgResponseAllOfErrorList](docs/BatchSendSingleChatMsgResponseAllOfErrorList.md)
 - [BlackListAddRequest](docs/BlackListAddRequest.md)
 - [BlackListAddResponse](docs/BlackListAddResponse.md)
 - [BlackListAddResponseAllOf](docs/BlackListAddResponseAllOf.md)
 - [BlackListAddResponseAllOfResultItem](docs/BlackListAddResponseAllOfResultItem.md)
 - [BlackListCheckRequest](docs/BlackListCheckRequest.md)
 - [BlackListCheckResponse](docs/BlackListCheckResponse.md)
 - [BlackListCheckResponseAllOf](docs/BlackListCheckResponseAllOf.md)
 - [BlackListCheckResponseAllOfBlackListCheckItem](docs/BlackListCheckResponseAllOfBlackListCheckItem.md)
 - [BlackListDeleteRequest](docs/BlackListDeleteRequest.md)
 - [BlackListDeleteResponse](docs/BlackListDeleteResponse.md)
 - [BlackListDeleteResponseAllOf](docs/BlackListDeleteResponseAllOf.md)
 - [BlackListDeleteResponseAllOfResultItem](docs/BlackListDeleteResponseAllOfResultItem.md)
 - [BlackListGetRequest](docs/BlackListGetRequest.md)
 - [BlackListGetResponse](docs/BlackListGetResponse.md)
 - [BlackListGetResponseAllOf](docs/BlackListGetResponseAllOf.md)
 - [BlackListGetResponseAllOfBlackListItem](docs/BlackListGetResponseAllOfBlackListItem.md)
 - [ChangeGroupOwnerRequest](docs/ChangeGroupOwnerRequest.md)
 - [ClearGroupAttrRequest](docs/ClearGroupAttrRequest.md)
 - [CommonResponse](docs/CommonResponse.md)
 - [CreateGroupRequest](docs/CreateGroupRequest.md)
 - [CreateGroupRequestMemberListInner](docs/CreateGroupRequestMemberListInner.md)
 - [CreateGroupResponse](docs/CreateGroupResponse.md)
 - [DefinedData](docs/DefinedData.md)
 - [DeleteGroupMemberRequest](docs/DeleteGroupMemberRequest.md)
 - [DeleteGroupMsgBySenderRequest](docs/DeleteGroupMsgBySenderRequest.md)
 - [DestroyGroupRequest](docs/DestroyGroupRequest.md)
 - [ForbidCallbackControl](docs/ForbidCallbackControl.md)
 - [ForbidSendMsgRequest](docs/ForbidSendMsgRequest.md)
 - [FriendAddRequest](docs/FriendAddRequest.md)
 - [FriendAddRequestAddFriendItemInner](docs/FriendAddRequestAddFriendItemInner.md)
 - [FriendAddResponse](docs/FriendAddResponse.md)
 - [FriendAddResponseAllOf](docs/FriendAddResponseAllOf.md)
 - [FriendAddResponseAllOfResultItem](docs/FriendAddResponseAllOfResultItem.md)
 - [FriendCheckRequest](docs/FriendCheckRequest.md)
 - [FriendCheckResponse](docs/FriendCheckResponse.md)
 - [FriendCheckResponseAllOf](docs/FriendCheckResponseAllOf.md)
 - [FriendCheckResponseAllOfInfoItem](docs/FriendCheckResponseAllOfInfoItem.md)
 - [FriendDeleteAllRequest](docs/FriendDeleteAllRequest.md)
 - [FriendDeleteAllResponse](docs/FriendDeleteAllResponse.md)
 - [FriendDeleteRequest](docs/FriendDeleteRequest.md)
 - [FriendDeleteResponse](docs/FriendDeleteResponse.md)
 - [FriendDeleteResponseAllOf](docs/FriendDeleteResponseAllOf.md)
 - [FriendDeleteResponseAllOfResultItem](docs/FriendDeleteResponseAllOfResultItem.md)
 - [FriendGetListRequest](docs/FriendGetListRequest.md)
 - [FriendGetListResponse](docs/FriendGetListResponse.md)
 - [FriendGetListResponseAllOf](docs/FriendGetListResponseAllOf.md)
 - [FriendGetListResponseAllOfInfoItem](docs/FriendGetListResponseAllOfInfoItem.md)
 - [FriendGetListResponseAllOfSnsProfileItem](docs/FriendGetListResponseAllOfSnsProfileItem.md)
 - [FriendGetRequest](docs/FriendGetRequest.md)
 - [FriendGetResponse](docs/FriendGetResponse.md)
 - [FriendGetResponseAllOf](docs/FriendGetResponseAllOf.md)
 - [FriendGetResponseAllOfResultItem](docs/FriendGetResponseAllOfResultItem.md)
 - [FriendImportRequest](docs/FriendImportRequest.md)
 - [FriendImportRequestAddFriendItemInner](docs/FriendImportRequestAddFriendItemInner.md)
 - [FriendImportRequestAddFriendItemInnerCustomItemInner](docs/FriendImportRequestAddFriendItemInnerCustomItemInner.md)
 - [FriendImportResponse](docs/FriendImportResponse.md)
 - [FriendUpdateRequest](docs/FriendUpdateRequest.md)
 - [FriendUpdateRequestUpdateItemInner](docs/FriendUpdateRequestUpdateItemInner.md)
 - [FriendUpdateRequestUpdateItemInnerSnsItemInner](docs/FriendUpdateRequestUpdateItemInnerSnsItemInner.md)
 - [FriendUpdateResponse](docs/FriendUpdateResponse.md)
 - [FriendUpdateResponseAllOf](docs/FriendUpdateResponseAllOf.md)
 - [FriendUpdateResponseAllOfResultItem](docs/FriendUpdateResponseAllOfResultItem.md)
 - [GetAppInfoRequest](docs/GetAppInfoRequest.md)
 - [GetAppInfoResponse](docs/GetAppInfoResponse.md)
 - [GetAppInfoResponseAllOf](docs/GetAppInfoResponseAllOf.md)
 - [GetAppInfoResponseAllOfResult](docs/GetAppInfoResponseAllOfResult.md)
 - [GetAppidGroupListRequest](docs/GetAppidGroupListRequest.md)
 - [GetAppidGroupListResponse](docs/GetAppidGroupListResponse.md)
 - [GetAppidGroupListResponseAllOf](docs/GetAppidGroupListResponseAllOf.md)
 - [GetAppidGroupListResponseAllOfGroupIdList](docs/GetAppidGroupListResponseAllOfGroupIdList.md)
 - [GetC2cUnreadMsgNumRequest](docs/GetC2cUnreadMsgNumRequest.md)
 - [GetC2cUnreadMsgNumResponse](docs/GetC2cUnreadMsgNumResponse.md)
 - [GetC2cUnreadMsgNumResponseAllOf](docs/GetC2cUnreadMsgNumResponseAllOf.md)
 - [GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList](docs/GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.md)
 - [GetC2cUnreadMsgNumResponseAllOfErrorList](docs/GetC2cUnreadMsgNumResponseAllOfErrorList.md)
 - [GetGroupAttrRequest](docs/GetGroupAttrRequest.md)
 - [GetGroupAttrResponse](docs/GetGroupAttrResponse.md)
 - [GetGroupAttrResponseAllOf](docs/GetGroupAttrResponseAllOf.md)
 - [GetGroupAttrResponseAllOfGroupAttrAry](docs/GetGroupAttrResponseAllOfGroupAttrAry.md)
 - [GetGroupInfoRequest](docs/GetGroupInfoRequest.md)
 - [GetGroupInfoRequestResponseFilter](docs/GetGroupInfoRequestResponseFilter.md)
 - [GetGroupInfoResponse](docs/GetGroupInfoResponse.md)
 - [GetGroupInfoResponseAllOf](docs/GetGroupInfoResponseAllOf.md)
 - [GetGroupInfoResponseAllOfGroupInfo](docs/GetGroupInfoResponseAllOfGroupInfo.md)
 - [GetGroupMemberInfoRequest](docs/GetGroupMemberInfoRequest.md)
 - [GetGroupMemberInfoResponse](docs/GetGroupMemberInfoResponse.md)
 - [GetGroupMemberInfoResponseAllOf](docs/GetGroupMemberInfoResponseAllOf.md)
 - [GetGroupMemberInfoResponseAllOfAppMemberDefinedData](docs/GetGroupMemberInfoResponseAllOfAppMemberDefinedData.md)
 - [GetGroupMemberInfoResponseAllOfMemberList](docs/GetGroupMemberInfoResponseAllOfMemberList.md)
 - [GetGroupShuttedUinRequest](docs/GetGroupShuttedUinRequest.md)
 - [GetGroupShuttedUinResponse](docs/GetGroupShuttedUinResponse.md)
 - [GetGroupShuttedUinResponseAllOf](docs/GetGroupShuttedUinResponseAllOf.md)
 - [GetGroupShuttedUinResponseAllOfShuttedUinList](docs/GetGroupShuttedUinResponseAllOfShuttedUinList.md)
 - [GetIPListResponse](docs/GetIPListResponse.md)
 - [GetIPListResponseAllOf](docs/GetIPListResponseAllOf.md)
 - [GetJoinedGroupListRequest](docs/GetJoinedGroupListRequest.md)
 - [GetJoinedGroupListRequestResponseFilter](docs/GetJoinedGroupListRequestResponseFilter.md)
 - [GetJoinedGroupListResponse](docs/GetJoinedGroupListResponse.md)
 - [GetJoinedGroupListResponseAllOf](docs/GetJoinedGroupListResponseAllOf.md)
 - [GetJoinedGroupListResponseAllOfGroupIdList](docs/GetJoinedGroupListResponseAllOfGroupIdList.md)
 - [GetNoSpeakingRequest](docs/GetNoSpeakingRequest.md)
 - [GetNoSpeakingResponse](docs/GetNoSpeakingResponse.md)
 - [GetNoSpeakingResponseAllOf](docs/GetNoSpeakingResponseAllOf.md)
 - [GetOnlineMemberNumRequest](docs/GetOnlineMemberNumRequest.md)
 - [GetOnlineMemberNumResponse](docs/GetOnlineMemberNumResponse.md)
 - [GetOnlineMemberNumResponseAllOf](docs/GetOnlineMemberNumResponseAllOf.md)
 - [GetOperateMsgHistoryRequest](docs/GetOperateMsgHistoryRequest.md)
 - [GetOperateMsgHistoryResponse](docs/GetOperateMsgHistoryResponse.md)
 - [GetOperateMsgHistoryResponseAllOf](docs/GetOperateMsgHistoryResponseAllOf.md)
 - [GetOperateMsgHistoryResponseAllOfFile](docs/GetOperateMsgHistoryResponseAllOfFile.md)
 - [GetRecentContactListGroupDeleteRequest](docs/GetRecentContactListGroupDeleteRequest.md)
 - [GetRecentContactListGroupDeleteResponse](docs/GetRecentContactListGroupDeleteResponse.md)
 - [GetRecentContactListGroupGetRequest](docs/GetRecentContactListGroupGetRequest.md)
 - [GetRecentContactListGroupGetResponse](docs/GetRecentContactListGroupGetResponse.md)
 - [GetRecentContactListGroupGetResponseAllOf](docs/GetRecentContactListGroupGetResponseAllOf.md)
 - [GetRecentContactListGroupGetResponseAllOfSessionItem](docs/GetRecentContactListGroupGetResponseAllOfSessionItem.md)
 - [GetRoamMsgRequest](docs/GetRoamMsgRequest.md)
 - [GetRoamMsgResponse](docs/GetRoamMsgResponse.md)
 - [GetRoamMsgResponseAllOf](docs/GetRoamMsgResponseAllOf.md)
 - [GetRoamMsgResponseAllOfMsgList](docs/GetRoamMsgResponseAllOfMsgList.md)
 - [GetRoleInGroupRequest](docs/GetRoleInGroupRequest.md)
 - [GetRoleInGroupResponse](docs/GetRoleInGroupResponse.md)
 - [GetRoleInGroupResponseAllOf](docs/GetRoleInGroupResponseAllOf.md)
 - [GetRoleInGroupResponseAllOfUserIdList](docs/GetRoleInGroupResponseAllOfUserIdList.md)
 - [GroupAddRequest](docs/GroupAddRequest.md)
 - [GroupAddResponse](docs/GroupAddResponse.md)
 - [GroupAddResponseAllOf](docs/GroupAddResponseAllOf.md)
 - [GroupAddResponseAllOfResultItem](docs/GroupAddResponseAllOfResultItem.md)
 - [GroupDeleteRequest](docs/GroupDeleteRequest.md)
 - [GroupDeleteResponse](docs/GroupDeleteResponse.md)
 - [GroupDeleteResponseAllOf](docs/GroupDeleteResponseAllOf.md)
 - [GroupGetRequest](docs/GroupGetRequest.md)
 - [GroupGetResponse](docs/GroupGetResponse.md)
 - [GroupGetResponseAllOf](docs/GroupGetResponseAllOf.md)
 - [GroupGetResponseAllOfResultItem](docs/GroupGetResponseAllOfResultItem.md)
 - [GroupMsgGetSimpleRequest](docs/GroupMsgGetSimpleRequest.md)
 - [GroupMsgGetSimpleResponse](docs/GroupMsgGetSimpleResponse.md)
 - [GroupMsgGetSimpleResponseAllOf](docs/GroupMsgGetSimpleResponseAllOf.md)
 - [GroupMsgGetSimpleResponseAllOfRspMsgList](docs/GroupMsgGetSimpleResponseAllOfRspMsgList.md)
 - [GroupMsgRecallRequest](docs/GroupMsgRecallRequest.md)
 - [GroupMsgRecallRequestMsgSeqListInner](docs/GroupMsgRecallRequestMsgSeqListInner.md)
 - [GroupMsgRecallResponse](docs/GroupMsgRecallResponse.md)
 - [GroupMsgRecallResponseAllOf](docs/GroupMsgRecallResponseAllOf.md)
 - [GroupMsgRecallResponseAllOfRecallRetList](docs/GroupMsgRecallResponseAllOfRecallRetList.md)
 - [GroupType](docs/GroupType.md)
 - [ImAddTagRequest](docs/ImAddTagRequest.md)
 - [ImGetAttrNameResponse](docs/ImGetAttrNameResponse.md)
 - [ImGetAttrNameResponseAllOf](docs/ImGetAttrNameResponseAllOf.md)
 - [ImGetAttrRequest](docs/ImGetAttrRequest.md)
 - [ImGetAttrResponse](docs/ImGetAttrResponse.md)
 - [ImGetAttrResponseAllOf](docs/ImGetAttrResponseAllOf.md)
 - [ImGetAttrResponseAllOfUserAttrs](docs/ImGetAttrResponseAllOfUserAttrs.md)
 - [ImGetTagRequest](docs/ImGetTagRequest.md)
 - [ImGetTagResponse](docs/ImGetTagResponse.md)
 - [ImGetTagResponseAllOf](docs/ImGetTagResponseAllOf.md)
 - [ImGetTagResponseAllOfUserTags](docs/ImGetTagResponseAllOfUserTags.md)
 - [ImPushRequest](docs/ImPushRequest.md)
 - [ImPushRequestConditionInner](docs/ImPushRequestConditionInner.md)
 - [ImPushResponse](docs/ImPushResponse.md)
 - [ImPushResponseAllOf](docs/ImPushResponseAllOf.md)
 - [ImRemoveAllTagRequest](docs/ImRemoveAllTagRequest.md)
 - [ImRemoveAttrRequest](docs/ImRemoveAttrRequest.md)
 - [ImRemoveTagRequest](docs/ImRemoveTagRequest.md)
 - [ImSetAttrNameRequest](docs/ImSetAttrNameRequest.md)
 - [ImSetAttrRequest](docs/ImSetAttrRequest.md)
 - [ImageInfo](docs/ImageInfo.md)
 - [ImportGroupMemberRequest](docs/ImportGroupMemberRequest.md)
 - [ImportGroupMemberRequestMemberListInner](docs/ImportGroupMemberRequestMemberListInner.md)
 - [ImportGroupMemberResponse](docs/ImportGroupMemberResponse.md)
 - [ImportGroupMemberResponseAllOf](docs/ImportGroupMemberResponseAllOf.md)
 - [ImportGroupMemberResponseAllOfMemberList](docs/ImportGroupMemberResponseAllOfMemberList.md)
 - [ImportGroupMsgRequest](docs/ImportGroupMsgRequest.md)
 - [ImportGroupMsgResponse](docs/ImportGroupMsgResponse.md)
 - [ImportGroupMsgResponseAllOf](docs/ImportGroupMsgResponseAllOf.md)
 - [ImportGroupMsgResponseAllOfImportMsgResult](docs/ImportGroupMsgResponseAllOfImportMsgResult.md)
 - [ImportGroupRequest](docs/ImportGroupRequest.md)
 - [ImportGroupResponse](docs/ImportGroupResponse.md)
 - [ImportGroupResponseAllOf](docs/ImportGroupResponseAllOf.md)
 - [ImportMsgRequest](docs/ImportMsgRequest.md)
 - [KickRequest](docs/KickRequest.md)
 - [ModifyGroupAttrRequest](docs/ModifyGroupAttrRequest.md)
 - [ModifyGroupAttrRequestGroupAttrInner](docs/ModifyGroupAttrRequestGroupAttrInner.md)
 - [ModifyGroupBaseInfoRequest](docs/ModifyGroupBaseInfoRequest.md)
 - [ModifyGroupMemberInfoRequest](docs/ModifyGroupMemberInfoRequest.md)
 - [ModifyGroupMemberInfoRequestAppMemberDefinedDataInner](docs/ModifyGroupMemberInfoRequestAppMemberDefinedDataInner.md)
 - [MsgWithdrawRequest](docs/MsgWithdrawRequest.md)
 - [MultiAccountImportRequest](docs/MultiAccountImportRequest.md)
 - [MultiAccountImportResponse](docs/MultiAccountImportResponse.md)
 - [MultiAccountImportResponseAllOf](docs/MultiAccountImportResponseAllOf.md)
 - [OfflinePushInfo](docs/OfflinePushInfo.md)
 - [OfflinePushInfoAndroidInfo](docs/OfflinePushInfoAndroidInfo.md)
 - [OfflinePushInfoApnsInfo](docs/OfflinePushInfoApnsInfo.md)
 - [PortraitGetRequest](docs/PortraitGetRequest.md)
 - [PortraitGetResponse](docs/PortraitGetResponse.md)
 - [PortraitGetResponseAllOf](docs/PortraitGetResponseAllOf.md)
 - [PortraitGetResponseAllOfProfileItem](docs/PortraitGetResponseAllOfProfileItem.md)
 - [PortraitGetResponseAllOfUserProfileItem](docs/PortraitGetResponseAllOfUserProfileItem.md)
 - [PortraitSetRequest](docs/PortraitSetRequest.md)
 - [PortraitSetRequestProfileItemInner](docs/PortraitSetRequestProfileItemInner.md)
 - [PortraitSetResponse](docs/PortraitSetResponse.md)
 - [PortraitSetResponseAllOf](docs/PortraitSetResponseAllOf.md)
 - [QueryOnlineStatusRequest](docs/QueryOnlineStatusRequest.md)
 - [QueryOnlineStatusResponse](docs/QueryOnlineStatusResponse.md)
 - [QueryOnlineStatusResponseAllOf](docs/QueryOnlineStatusResponseAllOf.md)
 - [QueryOnlineStatusResponseAllOfDetail](docs/QueryOnlineStatusResponseAllOfDetail.md)
 - [QueryOnlineStatusResponseAllOfErrorList](docs/QueryOnlineStatusResponseAllOfErrorList.md)
 - [QueryOnlineStatusResponseAllOfQueryResult](docs/QueryOnlineStatusResponseAllOfQueryResult.md)
 - [SendGroupMsgRequest](docs/SendGroupMsgRequest.md)
 - [SendGroupMsgResponse](docs/SendGroupMsgResponse.md)
 - [SendGroupMsgResponseAllOf](docs/SendGroupMsgResponseAllOf.md)
 - [SendGroupSystemNotificationRequest](docs/SendGroupSystemNotificationRequest.md)
 - [SendMsgControl](docs/SendMsgControl.md)
 - [SendSingleChatMsgRequest](docs/SendSingleChatMsgRequest.md)
 - [SendSingleChatMsgResponse](docs/SendSingleChatMsgResponse.md)
 - [SendSingleChatMsgResponseAllOf](docs/SendSingleChatMsgResponseAllOf.md)
 - [SetGroupAttrRequest](docs/SetGroupAttrRequest.md)
 - [SetMsgReadRequest](docs/SetMsgReadRequest.md)
 - [SetNoSpeakingRequest](docs/SetNoSpeakingRequest.md)
 - [SetUnreadMsgNumRequest](docs/SetUnreadMsgNumRequest.md)
 - [TIMCustomElem](docs/TIMCustomElem.md)
 - [TIMCustomElemMsgContent](docs/TIMCustomElemMsgContent.md)
 - [TIMFaceElem](docs/TIMFaceElem.md)
 - [TIMFaceElemMsgContent](docs/TIMFaceElemMsgContent.md)
 - [TIMFileElem](docs/TIMFileElem.md)
 - [TIMFileElemMsgContent](docs/TIMFileElemMsgContent.md)
 - [TIMImageElem](docs/TIMImageElem.md)
 - [TIMImageElemMsgContent](docs/TIMImageElemMsgContent.md)
 - [TIMLocationElem](docs/TIMLocationElem.md)
 - [TIMLocationElemMsgContent](docs/TIMLocationElemMsgContent.md)
 - [TIMMsgElement](docs/TIMMsgElement.md)
 - [TIMSoundElem](docs/TIMSoundElem.md)
 - [TIMSoundElemMsgContent](docs/TIMSoundElemMsgContent.md)
 - [TIMTextElem](docs/TIMTextElem.md)
 - [TIMTextElemMsgContent](docs/TIMTextElemMsgContent.md)
 - [TIMVideoFileElem](docs/TIMVideoFileElem.md)
 - [TIMVideoFileElemMsgContent](docs/TIMVideoFileElemMsgContent.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Contact
 腾讯云IM REST API SDK 技术交流QQ群

 <img src="images/img_group_01.png" width="30%" height="30%" />