package tencentcloud.im.examples.group;

import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.api.GroupApi;
import tencentcloud.im.model.GroupMsgGetSimpleRequest;
import tencentcloud.im.model.GroupMsgGetSimpleResponse;

/**
 * 拉取群历史消息（https://cloud.tencent.com/document/product/269/2738）
 */
public class GroupMsgGetSimpleExample {

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
