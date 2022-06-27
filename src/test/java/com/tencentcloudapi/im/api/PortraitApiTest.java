/*
 * TIM SERVER REST API SDK
 * TIM REST API
 */


package com.tencentcloudapi.im.api;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.model.PortraitGetRequest;
import com.tencentcloudapi.im.model.PortraitGetResponse;
import com.tencentcloudapi.im.model.PortraitSetRequest;
import com.tencentcloudapi.im.model.PortraitSetResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PortraitApi
 */
@Disabled
public class PortraitApiTest {

    private final PortraitApi api = new PortraitApi();

    /**
     * 拉取资料（https://cloud.tencent.com/document/product/269/1639）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portraitGetTest() throws ApiException {
        Integer random = null;
        PortraitGetRequest portraitGetRequest = null;
        PortraitGetResponse response = api.portraitGet(random, portraitGetRequest);
        // TODO: test validations
    }

    /**
     * 设置资料（https://cloud.tencent.com/document/product/269/1640）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portraitSetTest() throws ApiException {
        Integer random = null;
        PortraitSetRequest portraitSetRequest = null;
        PortraitSetResponse response = api.portraitSet(random, portraitSetRequest);
        // TODO: test validations
    }

}
