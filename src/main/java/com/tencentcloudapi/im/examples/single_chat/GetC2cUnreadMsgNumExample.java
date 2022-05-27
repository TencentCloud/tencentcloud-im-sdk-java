package com.tencentcloudapi.im.examples.single_chat;

import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.api.SingleChatApi;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumRequest;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponse;

/**
 * 查询单聊未读消息计数（https://cloud.tencent.com/document/product/269/56043）
 */
public class GetC2cUnreadMsgNumExample {

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
        //TODO: Set the parameters

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
