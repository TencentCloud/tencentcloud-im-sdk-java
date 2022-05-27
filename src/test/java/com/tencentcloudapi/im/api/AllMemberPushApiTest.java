

package com.tencentcloudapi.im.api;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.ImAddTagRequest;
import com.tencentcloudapi.im.model.ImGetAttrNameResponse;
import com.tencentcloudapi.im.model.ImGetAttrRequest;
import com.tencentcloudapi.im.model.ImGetAttrResponse;
import com.tencentcloudapi.im.model.ImGetTagRequest;
import com.tencentcloudapi.im.model.ImGetTagResponse;
import com.tencentcloudapi.im.model.ImPushRequest;
import com.tencentcloudapi.im.model.ImPushResponse;
import com.tencentcloudapi.im.model.ImRemoveAllTagRequest;
import com.tencentcloudapi.im.model.ImRemoveAttrRequest;
import com.tencentcloudapi.im.model.ImRemoveTagRequest;
import com.tencentcloudapi.im.model.ImSetAttrNameRequest;
import com.tencentcloudapi.im.model.ImSetAttrRequest;
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
 * API tests for AllMemberPushApi
 */
@Ignore
public class AllMemberPushApiTest {

    private final AllMemberPushApi api = new AllMemberPushApi();

    /**
     * 添加用户标签（https://cloud.tencent.com/document/product/269/45941）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imAddTagTest() throws ApiException {
        Integer random = null;
        ImAddTagRequest imAddTagRequest = null;
        CommonResponse response = api.imAddTag(random, imAddTagRequest);

        // TODO: test validations
    }
    /**
     * 获取用户属性（https://cloud.tencent.com/document/product/269/45937）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imGetAttrTest() throws ApiException {
        Integer random = null;
        ImGetAttrRequest imGetAttrRequest = null;
        ImGetAttrResponse response = api.imGetAttr(random, imGetAttrRequest);

        // TODO: test validations
    }
    /**
     * 获取应用属性名称（https://cloud.tencent.com/document/product/269/45936）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imGetAttrNameTest() throws ApiException {
        Integer random = null;
        Object body = null;
        ImGetAttrNameResponse response = api.imGetAttrName(random, body);

        // TODO: test validations
    }
    /**
     * 获取用户标签（https://cloud.tencent.com/document/product/269/45940）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imGetTagTest() throws ApiException {
        Integer random = null;
        ImGetTagRequest imGetTagRequest = null;
        ImGetTagResponse response = api.imGetTag(random, imGetTagRequest);

        // TODO: test validations
    }
    /**
     * 全员推送（https://cloud.tencent.com/document/product/269/45934）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imPushTest() throws ApiException {
        Integer random = null;
        ImPushRequest imPushRequest = null;
        ImPushResponse response = api.imPush(random, imPushRequest);

        // TODO: test validations
    }
    /**
     * 删除用户所有标签（https://cloud.tencent.com/document/product/269/45943）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imRemoveAllTagsTest() throws ApiException {
        Integer random = null;
        ImRemoveAllTagRequest imRemoveAllTagRequest = null;
        CommonResponse response = api.imRemoveAllTags(random, imRemoveAllTagRequest);

        // TODO: test validations
    }
    /**
     * 删除用户属性（https://cloud.tencent.com/document/product/269/45939）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imRemoveAttrTest() throws ApiException {
        Integer random = null;
        ImRemoveAttrRequest imRemoveAttrRequest = null;
        CommonResponse response = api.imRemoveAttr(random, imRemoveAttrRequest);

        // TODO: test validations
    }
    /**
     * 删除用户标签（https://cloud.tencent.com/document/product/269/45942）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imRemoveTagTest() throws ApiException {
        Integer random = null;
        ImRemoveTagRequest imRemoveTagRequest = null;
        CommonResponse response = api.imRemoveTag(random, imRemoveTagRequest);

        // TODO: test validations
    }
    /**
     * 设置用户属性（https://cloud.tencent.com/document/product/269/45938）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imSetAttrTest() throws ApiException {
        Integer random = null;
        ImSetAttrRequest imSetAttrRequest = null;
        CommonResponse response = api.imSetAttr(random, imSetAttrRequest);

        // TODO: test validations
    }
    /**
     * 设置应用属性名称（https://cloud.tencent.com/document/product/269/45935）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imSetAttrNameTest() throws ApiException {
        Integer random = null;
        ImSetAttrNameRequest imSetAttrNameRequest = null;
        CommonResponse response = api.imSetAttrName(random, imSetAttrNameRequest);

        // TODO: test validations
    }
}
