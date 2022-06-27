/*
 * TIM SERVER REST API SDK
 * TIM REST API
 */


package com.tencentcloudapi.im.api;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.model.AccountCheckRequest;
import com.tencentcloudapi.im.model.AccountCheckResponse;
import com.tencentcloudapi.im.model.AccountDeleteRequest;
import com.tencentcloudapi.im.model.AccountDeleteResponse;
import com.tencentcloudapi.im.model.AccountImportRequest;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.KickRequest;
import com.tencentcloudapi.im.model.MultiAccountImportRequest;
import com.tencentcloudapi.im.model.MultiAccountImportResponse;
import com.tencentcloudapi.im.model.QueryOnlineStatusRequest;
import com.tencentcloudapi.im.model.QueryOnlineStatusResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
@Disabled
public class AccountApiTest {

    private final AccountApi api = new AccountApi();

    /**
     * 查询帐号 (https://cloud.tencent.com/document/product/269/38417)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accountCheckTest() throws ApiException {
        Integer random = null;
        AccountCheckRequest accountCheckRequest = null;
        AccountCheckResponse response = api.accountCheck(random, accountCheckRequest);
        // TODO: test validations
    }

    /**
     * 删除帐号（https://cloud.tencent.com/document/product/269/36443）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accountDeleteTest() throws ApiException {
        Integer random = null;
        AccountDeleteRequest accountDeleteRequest = null;
        AccountDeleteResponse response = api.accountDelete(random, accountDeleteRequest);
        // TODO: test validations
    }

    /**
     * 导入单个帐号（https://cloud.tencent.com/document/product/269/1608）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accountImportTest() throws ApiException {
        Integer random = null;
        AccountImportRequest accountImportRequest = null;
        CommonResponse response = api.accountImport(random, accountImportRequest);
        // TODO: test validations
    }

    /**
     * 失效帐号登录状态（https://cloud.tencent.com/document/product/269/3853）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void kickTest() throws ApiException {
        Integer random = null;
        KickRequest kickRequest = null;
        CommonResponse response = api.kick(random, kickRequest);
        // TODO: test validations
    }

    /**
     * 导入多个帐号（https://cloud.tencent.com/document/product/269/4919）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void multiAccountImportTest() throws ApiException {
        Integer random = null;
        MultiAccountImportRequest multiAccountImportRequest = null;
        MultiAccountImportResponse response = api.multiAccountImport(random, multiAccountImportRequest);
        // TODO: test validations
    }

    /**
     * 查询帐号在线状态（https://cloud.tencent.com/document/product/269/2566）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryOnlineStatusTest() throws ApiException {
        Integer random = null;
        QueryOnlineStatusRequest queryOnlineStatusRequest = null;
        QueryOnlineStatusResponse response = api.queryOnlineStatus(random, queryOnlineStatusRequest);
        // TODO: test validations
    }

}
