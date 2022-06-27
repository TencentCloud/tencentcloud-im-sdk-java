/*
 * TIM SERVER REST API SDK
 * TIM REST API
 */


package com.tencentcloudapi.im.api;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.model.BatchSendSingleChatMsgRequest;
import com.tencentcloudapi.im.model.BatchSendSingleChatMsgResponse;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumRequest;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponse;
import com.tencentcloudapi.im.model.GetRoamMsgRequest;
import com.tencentcloudapi.im.model.GetRoamMsgResponse;
import com.tencentcloudapi.im.model.ImportMsgRequest;
import com.tencentcloudapi.im.model.MsgWithdrawRequest;
import com.tencentcloudapi.im.model.SendSingleChatMsgRequest;
import com.tencentcloudapi.im.model.SendSingleChatMsgResponse;
import com.tencentcloudapi.im.model.SetMsgReadRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SingleChatApi
 */
@Disabled
public class SingleChatApiTest {

    private final SingleChatApi api = new SingleChatApi();

    /**
     * 查询单聊消息（https://cloud.tencent.com/document/product/269/42794）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminGetroammsgTest() throws ApiException {
        Integer random = null;
        GetRoamMsgRequest getRoamMsgRequest = null;
        GetRoamMsgResponse response = api.adminGetroammsg(random, getRoamMsgRequest);
        // TODO: test validations
    }

    /**
     * 撤回单聊消息（https://cloud.tencent.com/document/product/269/38980）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminMsgwithdrawTest() throws ApiException {
        Integer random = null;
        MsgWithdrawRequest msgWithdrawRequest = null;
        CommonResponse response = api.adminMsgwithdraw(random, msgWithdrawRequest);
        // TODO: test validations
    }

    /**
     * 设置单聊消息已读（https://cloud.tencent.com/document/product/269/50349）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminSetMsgReadTest() throws ApiException {
        Integer random = null;
        SetMsgReadRequest setMsgReadRequest = null;
        CommonResponse response = api.adminSetMsgRead(random, setMsgReadRequest);
        // TODO: test validations
    }

    /**
     * 批量发单聊消息（https://cloud.tencent.com/document/product/269/1612）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void batchsendmsgTest() throws ApiException {
        Integer random = null;
        BatchSendSingleChatMsgRequest batchSendSingleChatMsgRequest = null;
        BatchSendSingleChatMsgResponse response = api.batchsendmsg(random, batchSendSingleChatMsgRequest);
        // TODO: test validations
    }

    /**
     * 查询单聊未读消息计数（https://cloud.tencent.com/document/product/269/56043）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getC2cUnreadMsgNumTest() throws ApiException {
        Integer random = null;
        GetC2cUnreadMsgNumRequest getC2cUnreadMsgNumRequest = null;
        GetC2cUnreadMsgNumResponse response = api.getC2cUnreadMsgNum(random, getC2cUnreadMsgNumRequest);
        // TODO: test validations
    }

    /**
     * 导入单聊消息（https://cloud.tencent.com/document/product/269/2568）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importmsgTest() throws ApiException {
        Integer random = null;
        ImportMsgRequest importMsgRequest = null;
        CommonResponse response = api.importmsg(random, importMsgRequest);
        // TODO: test validations
    }

    /**
     * 单发单聊消息（https://cloud.tencent.com/document/product/269/2282）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendmsgTest() throws ApiException {
        Integer random = null;
        SendSingleChatMsgRequest sendSingleChatMsgRequest = null;
        SendSingleChatMsgResponse response = api.sendmsg(random, sendSingleChatMsgRequest);
        // TODO: test validations
    }

}
