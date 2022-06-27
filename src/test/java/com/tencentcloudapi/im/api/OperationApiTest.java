/*
 * TIM SERVER REST API SDK
 * TIM REST API
 */


package com.tencentcloudapi.im.api;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.model.GetAppInfoRequest;
import com.tencentcloudapi.im.model.GetAppInfoResponse;
import com.tencentcloudapi.im.model.GetIPListResponse;
import com.tencentcloudapi.im.model.GetOperateMsgHistoryRequest;
import com.tencentcloudapi.im.model.GetOperateMsgHistoryResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OperationApi
 */
@Disabled
public class OperationApiTest {

    private final OperationApi api = new OperationApi();

    /**
     * 下载最近消息记录（https://cloud.tencent.com/document/product/269/1650）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHistoryTest() throws ApiException {
        Integer random = null;
        GetOperateMsgHistoryRequest getOperateMsgHistoryRequest = null;
        GetOperateMsgHistoryResponse response = api.getHistory(random, getOperateMsgHistoryRequest);
        // TODO: test validations
    }

    /**
     * 获取服务器 IP 地址（https://cloud.tencent.com/document/product/269/45438）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getIPListTest() throws ApiException {
        Integer random = null;
        Object body = null;
        GetIPListResponse response = api.getIPList(random, body);
        // TODO: test validations
    }

    /**
     * 拉取运营数据（https://cloud.tencent.com/document/product/269/4193）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getappinfoTest() throws ApiException {
        Integer random = null;
        GetAppInfoRequest getAppInfoRequest = null;
        GetAppInfoResponse response = api.getappinfo(random, getAppInfoRequest);
        // TODO: test validations
    }

}
