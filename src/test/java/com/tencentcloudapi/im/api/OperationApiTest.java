/*
 * TIM SERVER REST API SDK
 * TIM REST API
 */


package com.tencentcloudapi.im.api;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.model.AllowBannedObjectRequest;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.ForbidIllegalObjectRequest;
import com.tencentcloudapi.im.model.GetAppInfoRequest;
import com.tencentcloudapi.im.model.GetAppInfoResponse;
import com.tencentcloudapi.im.model.GetCosSigRequest;
import com.tencentcloudapi.im.model.GetCosSigResponse;
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
     * 聊天文件解封（https://cloud.tencent.com/document/product/269/74776）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void allowBannedObjectTest() throws ApiException {
        Integer random = null;
        AllowBannedObjectRequest allowBannedObjectRequest = null;
        CommonResponse response = api.allowBannedObject(random, allowBannedObjectRequest);
        // TODO: test validations
    }

    /**
     * 聊天文件封禁（https://cloud.tencent.com/document/product/269/74775）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void forbidIllegalObjectTest() throws ApiException {
        Integer random = null;
        ForbidIllegalObjectRequest forbidIllegalObjectRequest = null;
        CommonResponse response = api.forbidIllegalObject(random, forbidIllegalObjectRequest);
        // TODO: test validations
    }

    /**
     * 聊天文件签名（https://cloud.tencent.com/document/product/269/74777）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCosSigTest() throws ApiException {
        Integer random = null;
        GetCosSigRequest getCosSigRequest = null;
        GetCosSigResponse response = api.getCosSig(random, getCosSigRequest);
        // TODO: test validations
    }

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
