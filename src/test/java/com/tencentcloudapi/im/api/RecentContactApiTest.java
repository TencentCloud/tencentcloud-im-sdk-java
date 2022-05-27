

package com.tencentcloudapi.im.api;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.model.GetRecentContactListGroupDeleteRequest;
import com.tencentcloudapi.im.model.GetRecentContactListGroupDeleteResponse;
import com.tencentcloudapi.im.model.GetRecentContactListGroupGetRequest;
import com.tencentcloudapi.im.model.GetRecentContactListGroupGetResponse;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecentContactApi
 */
@Ignore
public class RecentContactApiTest {

    private final RecentContactApi api = new RecentContactApi();

    /**
     * 删除单个会话（https://cloud.tencent.com/document/product/269/62119）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRecentContactTest() throws ApiException {
        Integer random = null;
        GetRecentContactListGroupDeleteRequest getRecentContactListGroupDeleteRequest = null;
        GetRecentContactListGroupDeleteResponse response = api.deleteRecentContact(random, getRecentContactListGroupDeleteRequest);

        // TODO: test validations
    }
    /**
     * 拉取会话列表（https://cloud.tencent.com/document/product/269/62118）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRecentContactListTest() throws ApiException {
        Integer random = null;
        GetRecentContactListGroupGetRequest getRecentContactListGroupGetRequest = null;
        GetRecentContactListGroupGetResponse response = api.getRecentContactList(random, getRecentContactListGroupGetRequest);

        // TODO: test validations
    }
}
