

package com.tencentcloudapi.im.api;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.model.BlackListAddRequest;
import com.tencentcloudapi.im.model.BlackListAddResponse;
import com.tencentcloudapi.im.model.BlackListCheckRequest;
import com.tencentcloudapi.im.model.BlackListCheckResponse;
import com.tencentcloudapi.im.model.BlackListDeleteRequest;
import com.tencentcloudapi.im.model.BlackListDeleteResponse;
import com.tencentcloudapi.im.model.BlackListGetRequest;
import com.tencentcloudapi.im.model.BlackListGetResponse;
import com.tencentcloudapi.im.model.FriendAddRequest;
import com.tencentcloudapi.im.model.FriendAddResponse;
import com.tencentcloudapi.im.model.FriendCheckRequest;
import com.tencentcloudapi.im.model.FriendCheckResponse;
import com.tencentcloudapi.im.model.FriendDeleteAllRequest;
import com.tencentcloudapi.im.model.FriendDeleteAllResponse;
import com.tencentcloudapi.im.model.FriendDeleteRequest;
import com.tencentcloudapi.im.model.FriendDeleteResponse;
import com.tencentcloudapi.im.model.FriendGetListRequest;
import com.tencentcloudapi.im.model.FriendGetListResponse;
import com.tencentcloudapi.im.model.FriendGetRequest;
import com.tencentcloudapi.im.model.FriendGetResponse;
import com.tencentcloudapi.im.model.FriendImportRequest;
import com.tencentcloudapi.im.model.FriendImportResponse;
import com.tencentcloudapi.im.model.FriendUpdateRequest;
import com.tencentcloudapi.im.model.FriendUpdateResponse;
import com.tencentcloudapi.im.model.GroupAddRequest;
import com.tencentcloudapi.im.model.GroupAddResponse;
import com.tencentcloudapi.im.model.GroupDeleteRequest;
import com.tencentcloudapi.im.model.GroupDeleteResponse;
import com.tencentcloudapi.im.model.GroupGetRequest;
import com.tencentcloudapi.im.model.GroupGetResponse;
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
 * API tests for RelationshipsApi
 */
@Ignore
public class RelationshipsApiTest {

    private final RelationshipsApi api = new RelationshipsApi();

    /**
     * 添加黑名单（https://cloud.tencent.com/document/product/269/3718）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blackListAddTest() throws ApiException {
        Integer random = null;
        BlackListAddRequest blackListAddRequest = null;
        BlackListAddResponse response = api.blackListAdd(random, blackListAddRequest);

        // TODO: test validations
    }
    /**
     * 校验黑名单（https://cloud.tencent.com/document/product/269/3725）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blackListCheckTest() throws ApiException {
        Integer random = null;
        BlackListCheckRequest blackListCheckRequest = null;
        BlackListCheckResponse response = api.blackListCheck(random, blackListCheckRequest);

        // TODO: test validations
    }
    /**
     * 删除黑名单（https://cloud.tencent.com/document/product/269/3719）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blackListDeleteTest() throws ApiException {
        Integer random = null;
        BlackListDeleteRequest blackListDeleteRequest = null;
        BlackListDeleteResponse response = api.blackListDelete(random, blackListDeleteRequest);

        // TODO: test validations
    }
    /**
     * 拉取黑名单（https://cloud.tencent.com/document/product/269/3722）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blackListGetTest() throws ApiException {
        Integer random = null;
        BlackListGetRequest blackListGetRequest = null;
        BlackListGetResponse response = api.blackListGet(random, blackListGetRequest);

        // TODO: test validations
    }
    /**
     * 添加好友（https://cloud.tencent.com/document/product/269/1643）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void friendAddTest() throws ApiException {
        Integer random = null;
        FriendAddRequest friendAddRequest = null;
        FriendAddResponse response = api.friendAdd(random, friendAddRequest);

        // TODO: test validations
    }
    /**
     * 校验好友（https://cloud.tencent.com/document/product/269/1646）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void friendCheckTest() throws ApiException {
        Integer random = null;
        FriendCheckRequest friendCheckRequest = null;
        FriendCheckResponse response = api.friendCheck(random, friendCheckRequest);

        // TODO: test validations
    }
    /**
     * 删除好友（https://cloud.tencent.com/document/product/269/1644）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void friendDeleteTest() throws ApiException {
        Integer random = null;
        FriendDeleteRequest friendDeleteRequest = null;
        FriendDeleteResponse response = api.friendDelete(random, friendDeleteRequest);

        // TODO: test validations
    }
    /**
     * 删除所有好友（https://cloud.tencent.com/document/product/269/1645）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void friendDeleteAllTest() throws ApiException {
        Integer random = null;
        FriendDeleteAllRequest friendDeleteAllRequest = null;
        FriendDeleteAllResponse response = api.friendDeleteAll(random, friendDeleteAllRequest);

        // TODO: test validations
    }
    /**
     * 拉取好友（https://cloud.tencent.com/document/product/269/1647）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void friendGetTest() throws ApiException {
        Integer random = null;
        FriendGetRequest friendGetRequest = null;
        FriendGetResponse response = api.friendGet(random, friendGetRequest);

        // TODO: test validations
    }
    /**
     * 拉取指定好友（https://cloud.tencent.com/document/product/269/8609）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void friendGetListTest() throws ApiException {
        Integer random = null;
        FriendGetListRequest friendGetListRequest = null;
        FriendGetListResponse response = api.friendGetList(random, friendGetListRequest);

        // TODO: test validations
    }
    /**
     * 导入好友（https://cloud.tencent.com/document/product/269/8301）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void friendImportTest() throws ApiException {
        Integer random = null;
        FriendImportRequest friendImportRequest = null;
        FriendImportResponse response = api.friendImport(random, friendImportRequest);

        // TODO: test validations
    }
    /**
     * 更新好友（https://cloud.tencent.com/document/product/269/12525）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void friendUpdateTest() throws ApiException {
        Integer random = null;
        FriendUpdateRequest friendUpdateRequest = null;
        FriendUpdateResponse response = api.friendUpdate(random, friendUpdateRequest);

        // TODO: test validations
    }
    /**
     * 添加分组（https://cloud.tencent.com/document/product/269/10107）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupAddTest() throws ApiException {
        Integer random = null;
        GroupAddRequest groupAddRequest = null;
        GroupAddResponse response = api.groupAdd(random, groupAddRequest);

        // TODO: test validations
    }
    /**
     * 删除分组（https://cloud.tencent.com/document/product/269/10108）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupDeleteTest() throws ApiException {
        Integer random = null;
        GroupDeleteRequest groupDeleteRequest = null;
        GroupDeleteResponse response = api.groupDelete(random, groupDeleteRequest);

        // TODO: test validations
    }
    /**
     * 拉取分组（https://cloud.tencent.com/document/product/269/54763）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupGetTest() throws ApiException {
        Integer random = null;
        GroupGetRequest groupGetRequest = null;
        GroupGetResponse response = api.groupGet(random, groupGetRequest);

        // TODO: test validations
    }
}
