/*
 * TIM SERVER REST API SDK
 * TIM REST API
 */


package com.tencentcloudapi.im.api;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.model.AddGroupMemberRequest;
import com.tencentcloudapi.im.model.AddGroupMemberResponse;
import com.tencentcloudapi.im.model.ChangeGroupOwnerRequest;
import com.tencentcloudapi.im.model.ClearGroupAttrRequest;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.CreateGroupRequest;
import com.tencentcloudapi.im.model.CreateGroupResponse;
import com.tencentcloudapi.im.model.DeleteGroupMemberRequest;
import com.tencentcloudapi.im.model.DeleteGroupMsgBySenderRequest;
import com.tencentcloudapi.im.model.DestroyGroupRequest;
import com.tencentcloudapi.im.model.ForbidSendMsgRequest;
import com.tencentcloudapi.im.model.GetAppidGroupListRequest;
import com.tencentcloudapi.im.model.GetAppidGroupListResponse;
import com.tencentcloudapi.im.model.GetGroupAttrRequest;
import com.tencentcloudapi.im.model.GetGroupAttrResponse;
import com.tencentcloudapi.im.model.GetGroupInfoRequest;
import com.tencentcloudapi.im.model.GetGroupInfoResponse;
import com.tencentcloudapi.im.model.GetGroupMemberInfoRequest;
import com.tencentcloudapi.im.model.GetGroupMemberInfoResponse;
import com.tencentcloudapi.im.model.GetGroupShuttedUinRequest;
import com.tencentcloudapi.im.model.GetGroupShuttedUinResponse;
import com.tencentcloudapi.im.model.GetJoinedGroupListRequest;
import com.tencentcloudapi.im.model.GetJoinedGroupListResponse;
import com.tencentcloudapi.im.model.GetOnlineMemberNumRequest;
import com.tencentcloudapi.im.model.GetOnlineMemberNumResponse;
import com.tencentcloudapi.im.model.GetRoleInGroupRequest;
import com.tencentcloudapi.im.model.GetRoleInGroupResponse;
import com.tencentcloudapi.im.model.GroupMsgGetSimpleRequest;
import com.tencentcloudapi.im.model.GroupMsgGetSimpleResponse;
import com.tencentcloudapi.im.model.GroupMsgRecallRequest;
import com.tencentcloudapi.im.model.GroupMsgRecallResponse;
import com.tencentcloudapi.im.model.ImportGroupMemberRequest;
import com.tencentcloudapi.im.model.ImportGroupMemberResponse;
import com.tencentcloudapi.im.model.ImportGroupMsgRequest;
import com.tencentcloudapi.im.model.ImportGroupMsgResponse;
import com.tencentcloudapi.im.model.ImportGroupRequest;
import com.tencentcloudapi.im.model.ImportGroupResponse;
import com.tencentcloudapi.im.model.ModifyGroupAttrRequest;
import com.tencentcloudapi.im.model.ModifyGroupBaseInfoRequest;
import com.tencentcloudapi.im.model.ModifyGroupMemberInfoRequest;
import com.tencentcloudapi.im.model.ModifyGroupMsgRequest;
import com.tencentcloudapi.im.model.SendGroupMsgRequest;
import com.tencentcloudapi.im.model.SendGroupMsgResponse;
import com.tencentcloudapi.im.model.SendGroupSystemNotificationRequest;
import com.tencentcloudapi.im.model.SetGroupAttrRequest;
import com.tencentcloudapi.im.model.SetUnreadMsgNumRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupApi
 */
@Disabled
public class GroupApiTest {

    private final GroupApi api = new GroupApi();

    /**
     * 增加群成员（https://cloud.tencent.com/document/product/269/1621）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addGroupMemberTest() throws ApiException {
        Integer random = null;
        AddGroupMemberRequest addGroupMemberRequest = null;
        AddGroupMemberResponse response = api.addGroupMember(random, addGroupMemberRequest);
        // TODO: test validations
    }

    /**
     * 转让群主（https://cloud.tencent.com/document/product/269/1633）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changeGroupOwnerTest() throws ApiException {
        Integer random = null;
        ChangeGroupOwnerRequest changeGroupOwnerRequest = null;
        CommonResponse response = api.changeGroupOwner(random, changeGroupOwnerRequest);
        // TODO: test validations
    }

    /**
     * 清空群自定义属性（https://cloud.tencent.com/document/product/269/67009）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clearGroupAttrTest() throws ApiException {
        Integer random = null;
        ClearGroupAttrRequest clearGroupAttrRequest = null;
        CommonResponse response = api.clearGroupAttr(random, clearGroupAttrRequest);
        // TODO: test validations
    }

    /**
     * 创建群组（https://cloud.tencent.com/document/product/269/1615）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createGroupTest() throws ApiException {
        Integer random = null;
        CreateGroupRequest createGroupRequest = null;
        CreateGroupResponse response = api.createGroup(random, createGroupRequest);
        // TODO: test validations
    }

    /**
     * 删除群成员（https://cloud.tencent.com/document/product/269/1622）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteGroupMemberTest() throws ApiException {
        Integer random = null;
        DeleteGroupMemberRequest deleteGroupMemberRequest = null;
        CommonResponse response = api.deleteGroupMember(random, deleteGroupMemberRequest);
        // TODO: test validations
    }

    /**
     * 删除指定用户发送的消息（https://cloud.tencent.com/document/product/269/2359）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteGroupMsgBySenderTest() throws ApiException {
        Integer random = null;
        DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderRequest = null;
        CommonResponse response = api.deleteGroupMsgBySender(random, deleteGroupMsgBySenderRequest);
        // TODO: test validations
    }

    /**
     * 解散群组(https://cloud.tencent.com/document/product/269/1624)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void destroyGroupTest() throws ApiException {
        Integer random = null;
        DestroyGroupRequest destroyGroupRequest = null;
        CommonResponse response = api.destroyGroup(random, destroyGroupRequest);
        // TODO: test validations
    }

    /**
     * 批量禁言和取消禁言(https://cloud.tencent.com/document/product/269/1627)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void forbidSendMsgTest() throws ApiException {
        Integer random = null;
        ForbidSendMsgRequest forbidSendMsgRequest = null;
        CommonResponse response = api.forbidSendMsg(random, forbidSendMsgRequest);
        // TODO: test validations
    }

    /**
     * 获取 App 中的所有群组（https://cloud.tencent.com/document/product/269/1614）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAppidGroupListTest() throws ApiException {
        Integer random = null;
        GetAppidGroupListRequest getAppidGroupListRequest = null;
        GetAppidGroupListResponse response = api.getAppidGroupList(random, getAppidGroupListRequest);
        // TODO: test validations
    }

    /**
     * 获取群自定义属性（https://cloud.tencent.com/document/product/269/67012）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupAttrTest() throws ApiException {
        Integer random = null;
        GetGroupAttrRequest getGroupAttrRequest = null;
        GetGroupAttrResponse response = api.getGroupAttr(random, getGroupAttrRequest);
        // TODO: test validations
    }

    /**
     * 获取群详细资料（https://cloud.tencent.com/document/product/269/1616）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupInfoTest() throws ApiException {
        Integer random = null;
        GetGroupInfoRequest getGroupInfoRequest = null;
        GetGroupInfoResponse response = api.getGroupInfo(random, getGroupInfoRequest);
        // TODO: test validations
    }

    /**
     * 获取群成员详细资料（https://cloud.tencent.com/document/product/269/1617）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupMemberInfoTest() throws ApiException {
        Integer random = null;
        GetGroupMemberInfoRequest getGroupMemberInfoRequest = null;
        GetGroupMemberInfoResponse response = api.getGroupMemberInfo(random, getGroupMemberInfoRequest);
        // TODO: test validations
    }

    /**
     * 获取被禁言群成员列表(https://cloud.tencent.com/document/product/269/2925)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupShuttedUinTest() throws ApiException {
        Integer random = null;
        GetGroupShuttedUinRequest getGroupShuttedUinRequest = null;
        GetGroupShuttedUinResponse response = api.getGroupShuttedUin(random, getGroupShuttedUinRequest);
        // TODO: test validations
    }

    /**
     * 获取用户所加入的群组(https://cloud.tencent.com/document/product/269/1625)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getJoinedGroupListTest() throws ApiException {
        Integer random = null;
        GetJoinedGroupListRequest getJoinedGroupListRequest = null;
        GetJoinedGroupListResponse response = api.getJoinedGroupList(random, getJoinedGroupListRequest);
        // TODO: test validations
    }

    /**
     * 获取直播群在线人数（https://cloud.tencent.com/document/product/269/49180）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOnlineMemberNumTest() throws ApiException {
        Integer random = null;
        GetOnlineMemberNumRequest getOnlineMemberNumRequest = null;
        GetOnlineMemberNumResponse response = api.getOnlineMemberNum(random, getOnlineMemberNumRequest);
        // TODO: test validations
    }

    /**
     * 查询用户在群组中的身份(https://cloud.tencent.com/document/product/269/1626)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRoleInGroupTest() throws ApiException {
        Integer random = null;
        GetRoleInGroupRequest getRoleInGroupRequest = null;
        GetRoleInGroupResponse response = api.getRoleInGroup(random, getRoleInGroupRequest);
        // TODO: test validations
    }

    /**
     * 拉取群历史消息（https://cloud.tencent.com/document/product/269/2738）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void groupMsgGetSimpleTest() throws ApiException {
        Integer random = null;
        GroupMsgGetSimpleRequest groupMsgGetSimpleRequest = null;
        GroupMsgGetSimpleResponse response = api.groupMsgGetSimple(random, groupMsgGetSimpleRequest);
        // TODO: test validations
    }

    /**
     * 撤回群消息（https://cloud.tencent.com/document/product/269/12341）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void groupMsgRecallTest() throws ApiException {
        Integer random = null;
        GroupMsgRecallRequest groupMsgRecallRequest = null;
        GroupMsgRecallResponse response = api.groupMsgRecall(random, groupMsgRecallRequest);
        // TODO: test validations
    }

    /**
     * 导入群基础资料（https://cloud.tencent.com/document/product/269/1634）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importGroupTest() throws ApiException {
        Integer random = null;
        ImportGroupRequest importGroupRequest = null;
        ImportGroupResponse response = api.importGroup(random, importGroupRequest);
        // TODO: test validations
    }

    /**
     * 导入群成员（https://cloud.tencent.com/document/product/269/1636）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importGroupMemberTest() throws ApiException {
        Integer random = null;
        ImportGroupMemberRequest importGroupMemberRequest = null;
        ImportGroupMemberResponse response = api.importGroupMember(random, importGroupMemberRequest);
        // TODO: test validations
    }

    /**
     * 导入群消息（https://cloud.tencent.com/document/product/269/1635）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importGroupMsgTest() throws ApiException {
        Integer random = null;
        ImportGroupMsgRequest importGroupMsgRequest = null;
        ImportGroupMsgResponse response = api.importGroupMsg(random, importGroupMsgRequest);
        // TODO: test validations
    }

    /**
     * 修改群自定义属性（https://cloud.tencent.com/document/product/269/67010）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyGroupAttrTest() throws ApiException {
        Integer random = null;
        ModifyGroupAttrRequest modifyGroupAttrRequest = null;
        CommonResponse response = api.modifyGroupAttr(random, modifyGroupAttrRequest);
        // TODO: test validations
    }

    /**
     * 修改群基础资料（https://cloud.tencent.com/document/product/269/1620）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyGroupBaseInfoTest() throws ApiException {
        Integer random = null;
        ModifyGroupBaseInfoRequest modifyGroupBaseInfoRequest = null;
        CommonResponse response = api.modifyGroupBaseInfo(random, modifyGroupBaseInfoRequest);
        // TODO: test validations
    }

    /**
     * 修改群成员资料(https://cloud.tencent.com/document/product/269/1623)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyGroupMemberInfoTest() throws ApiException {
        Integer random = null;
        ModifyGroupMemberInfoRequest modifyGroupMemberInfoRequest = null;
        CommonResponse response = api.modifyGroupMemberInfo(random, modifyGroupMemberInfoRequest);
        // TODO: test validations
    }

    /**
     * 修改群聊历史消息（https://cloud.tencent.com/document/product/269/74741）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyGroupMsgTest() throws ApiException {
        Integer random = null;
        ModifyGroupMsgRequest modifyGroupMsgRequest = null;
        CommonResponse response = api.modifyGroupMsg(random, modifyGroupMsgRequest);
        // TODO: test validations
    }

    /**
     * 在群组中发送普通消息（https://cloud.tencent.com/document/product/269/1629）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendGroupMsgTest() throws ApiException {
        Integer random = null;
        SendGroupMsgRequest sendGroupMsgRequest = null;
        SendGroupMsgResponse response = api.sendGroupMsg(random, sendGroupMsgRequest);
        // TODO: test validations
    }

    /**
     * 在群组中发送系统通知（https://cloud.tencent.com/document/product/269/1630）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendGroupSystemNotificationTest() throws ApiException {
        Integer random = null;
        SendGroupSystemNotificationRequest sendGroupSystemNotificationRequest = null;
        CommonResponse response = api.sendGroupSystemNotification(random, sendGroupSystemNotificationRequest);
        // TODO: test validations
    }

    /**
     * 重置群自定义属性（https://cloud.tencent.com/document/product/269/67011）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setGroupAttrTest() throws ApiException {
        Integer random = null;
        SetGroupAttrRequest setGroupAttrRequest = null;
        CommonResponse response = api.setGroupAttr(random, setGroupAttrRequest);
        // TODO: test validations
    }

    /**
     * 设置成员未读消息计数（https://cloud.tencent.com/document/product/269/1637）
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setUnreadMsgNumTest() throws ApiException {
        Integer random = null;
        SetUnreadMsgNumRequest setUnreadMsgNumRequest = null;
        CommonResponse response = api.setUnreadMsgNum(random, setUnreadMsgNumRequest);
        // TODO: test validations
    }

}
