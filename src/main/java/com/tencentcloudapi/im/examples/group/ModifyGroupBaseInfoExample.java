package com.tencentcloudapi.im.examples.group;

import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.api.GroupApi;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.ModifyGroupBaseInfoRequest;

/**
 * 修改群基础资料（https://cloud.tencent.com/document/product/269/1620）
 */
public class ModifyGroupBaseInfoExample {

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
