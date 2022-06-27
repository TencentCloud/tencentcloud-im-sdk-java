/*
 * TIM SERVER REST API SDK
 * TIM REST API
 */


package com.tencentcloudapi.im.api;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.GetNoSpeakingRequest;
import com.tencentcloudapi.im.model.GetNoSpeakingResponse;
import com.tencentcloudapi.im.model.SetNoSpeakingRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MuteApi
 */
@Disabled
public class MuteApiTest {

    private final MuteApi api = new MuteApi();

    /**
     * 查询全局禁言（https://cloud.tencent.com/document/product/269/4229）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getnospeakingTest() throws ApiException {
        Integer random = null;
        GetNoSpeakingRequest getNoSpeakingRequest = null;
        GetNoSpeakingResponse response = api.getnospeaking(random, getNoSpeakingRequest);
        // TODO: test validations
    }

    /**
     * 设置全局禁言（https://cloud.tencent.com/document/product/269/4230）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setnospeakingTest() throws ApiException {
        Integer random = null;
        SetNoSpeakingRequest setNoSpeakingRequest = null;
        CommonResponse response = api.setnospeaking(random, setNoSpeakingRequest);
        // TODO: test validations
    }

}
