package tencentcloud.im.examples.relationships;

import tencentcloud.im.ApiClient;
import tencentcloud.im.ApiException;
import tencentcloud.im.Configuration;
import tencentcloud.im.api.RelationshipsApi;
import tencentcloud.im.model.BlackListDeleteRequest;
import tencentcloud.im.model.BlackListDeleteResponse;

/**
 * 删除黑名单（https://cloud.tencent.com/document/product/269/3719）
 */
public class BlackListDeleteExample {

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
