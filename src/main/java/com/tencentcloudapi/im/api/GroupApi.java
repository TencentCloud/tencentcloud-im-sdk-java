package com.tencentcloudapi.im.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.model.*;
import com.tencentcloudapi.im.Pair;

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
import com.tencentcloudapi.im.model.SendGroupMsgRequest;
import com.tencentcloudapi.im.model.SendGroupMsgResponse;
import com.tencentcloudapi.im.model.SendGroupSystemNotificationRequest;
import com.tencentcloudapi.im.model.SetGroupAttrRequest;
import com.tencentcloudapi.im.model.SetUnreadMsgNumRequest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupApi {
  private ApiClient apiClient;

  public GroupApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GroupApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 增加群成员（https://cloud.tencent.com/document/product/269/1621）
   * 
   * @param random  (required)
   * @param addGroupMemberRequest  (optional)
   * @return AddGroupMemberResponse
   * @throws ApiException if fails to make API call
   */
  public AddGroupMemberResponse addGroupMember(Integer random, AddGroupMemberRequest addGroupMemberRequest) throws ApiException {
    Object localVarPostBody = addGroupMemberRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling addGroupMember");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/add_group_member";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AddGroupMemberResponse> localVarReturnType = new TypeReference<AddGroupMemberResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 转让群主（https://cloud.tencent.com/document/product/269/1633）
   * 
   * @param random  (required)
   * @param changeGroupOwnerRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse changeGroupOwner(Integer random, ChangeGroupOwnerRequest changeGroupOwnerRequest) throws ApiException {
    Object localVarPostBody = changeGroupOwnerRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling changeGroupOwner");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/change_group_owner";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CommonResponse> localVarReturnType = new TypeReference<CommonResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 清空群自定义属性（https://cloud.tencent.com/document/product/269/67009）
   * 
   * @param random  (required)
   * @param clearGroupAttrRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse clearGroupAttr(Integer random, ClearGroupAttrRequest clearGroupAttrRequest) throws ApiException {
    Object localVarPostBody = clearGroupAttrRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling clearGroupAttr");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/clear_group_attr";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CommonResponse> localVarReturnType = new TypeReference<CommonResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 创建群组（https://cloud.tencent.com/document/product/269/1615）
   * 
   * @param random  (required)
   * @param createGroupRequest  (optional)
   * @return CreateGroupResponse
   * @throws ApiException if fails to make API call
   */
  public CreateGroupResponse createGroup(Integer random, CreateGroupRequest createGroupRequest) throws ApiException {
    Object localVarPostBody = createGroupRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling createGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/create_group";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CreateGroupResponse> localVarReturnType = new TypeReference<CreateGroupResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 删除群成员（https://cloud.tencent.com/document/product/269/1622）
   * 
   * @param random  (required)
   * @param deleteGroupMemberRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse deleteGroupMember(Integer random, DeleteGroupMemberRequest deleteGroupMemberRequest) throws ApiException {
    Object localVarPostBody = deleteGroupMemberRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling deleteGroupMember");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/delete_group_member";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CommonResponse> localVarReturnType = new TypeReference<CommonResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 删除指定用户发送的消息（https://cloud.tencent.com/document/product/269/2359）
   * 
   * @param random  (required)
   * @param deleteGroupMsgBySenderRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse deleteGroupMsgBySender(Integer random, DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderRequest) throws ApiException {
    Object localVarPostBody = deleteGroupMsgBySenderRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling deleteGroupMsgBySender");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/delete_group_msg_by_sender";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CommonResponse> localVarReturnType = new TypeReference<CommonResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 解散群组(https://cloud.tencent.com/document/product/269/1624)
   * 
   * @param random  (required)
   * @param destroyGroupRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse destroyGroup(Integer random, DestroyGroupRequest destroyGroupRequest) throws ApiException {
    Object localVarPostBody = destroyGroupRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling destroyGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/destroy_group";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CommonResponse> localVarReturnType = new TypeReference<CommonResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 批量禁言和取消禁言(https://cloud.tencent.com/document/product/269/1627)
   * 
   * @param random  (required)
   * @param forbidSendMsgRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse forbidSendMsg(Integer random, ForbidSendMsgRequest forbidSendMsgRequest) throws ApiException {
    Object localVarPostBody = forbidSendMsgRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling forbidSendMsg");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/forbid_send_msg";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CommonResponse> localVarReturnType = new TypeReference<CommonResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 获取 App 中的所有群组（https://cloud.tencent.com/document/product/269/1614）
   * 
   * @param random  (required)
   * @param getAppidGroupListRequest  (optional)
   * @return GetAppidGroupListResponse
   * @throws ApiException if fails to make API call
   */
  public GetAppidGroupListResponse getAppidGroupList(Integer random, GetAppidGroupListRequest getAppidGroupListRequest) throws ApiException {
    Object localVarPostBody = getAppidGroupListRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling getAppidGroupList");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/get_appid_group_list";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetAppidGroupListResponse> localVarReturnType = new TypeReference<GetAppidGroupListResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 获取群自定义属性（https://cloud.tencent.com/document/product/269/67012）
   * 
   * @param random  (required)
   * @param getGroupAttrRequest  (optional)
   * @return GetGroupAttrResponse
   * @throws ApiException if fails to make API call
   */
  public GetGroupAttrResponse getGroupAttr(Integer random, GetGroupAttrRequest getGroupAttrRequest) throws ApiException {
    Object localVarPostBody = getGroupAttrRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling getGroupAttr");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/get_group_attr";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetGroupAttrResponse> localVarReturnType = new TypeReference<GetGroupAttrResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 获取群详细资料（https://cloud.tencent.com/document/product/269/1616）
   * 
   * @param random  (required)
   * @param getGroupInfoRequest  (optional)
   * @return GetGroupInfoResponse
   * @throws ApiException if fails to make API call
   */
  public GetGroupInfoResponse getGroupInfo(Integer random, GetGroupInfoRequest getGroupInfoRequest) throws ApiException {
    Object localVarPostBody = getGroupInfoRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling getGroupInfo");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/get_group_info";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetGroupInfoResponse> localVarReturnType = new TypeReference<GetGroupInfoResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 获取群成员详细资料（https://cloud.tencent.com/document/product/269/1617）
   * 
   * @param random  (required)
   * @param getGroupMemberInfoRequest  (optional)
   * @return GetGroupMemberInfoResponse
   * @throws ApiException if fails to make API call
   */
  public GetGroupMemberInfoResponse getGroupMemberInfo(Integer random, GetGroupMemberInfoRequest getGroupMemberInfoRequest) throws ApiException {
    Object localVarPostBody = getGroupMemberInfoRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling getGroupMemberInfo");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/get_group_member_info";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetGroupMemberInfoResponse> localVarReturnType = new TypeReference<GetGroupMemberInfoResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 获取被禁言群成员列表(https://cloud.tencent.com/document/product/269/2925)
   * 
   * @param random  (required)
   * @param getGroupShuttedUinRequest  (optional)
   * @return GetGroupShuttedUinResponse
   * @throws ApiException if fails to make API call
   */
  public GetGroupShuttedUinResponse getGroupShuttedUin(Integer random, GetGroupShuttedUinRequest getGroupShuttedUinRequest) throws ApiException {
    Object localVarPostBody = getGroupShuttedUinRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling getGroupShuttedUin");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/get_group_shutted_uin";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetGroupShuttedUinResponse> localVarReturnType = new TypeReference<GetGroupShuttedUinResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 获取用户所加入的群组(https://cloud.tencent.com/document/product/269/1625)
   * 
   * @param random  (required)
   * @param getJoinedGroupListRequest  (optional)
   * @return GetJoinedGroupListResponse
   * @throws ApiException if fails to make API call
   */
  public GetJoinedGroupListResponse getJoinedGroupList(Integer random, GetJoinedGroupListRequest getJoinedGroupListRequest) throws ApiException {
    Object localVarPostBody = getJoinedGroupListRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling getJoinedGroupList");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/get_joined_group_list";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetJoinedGroupListResponse> localVarReturnType = new TypeReference<GetJoinedGroupListResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 获取直播群在线人数（https://cloud.tencent.com/document/product/269/49180）
   * 
   * @param random  (required)
   * @param getOnlineMemberNumRequest  (optional)
   * @return GetOnlineMemberNumResponse
   * @throws ApiException if fails to make API call
   */
  public GetOnlineMemberNumResponse getOnlineMemberNum(Integer random, GetOnlineMemberNumRequest getOnlineMemberNumRequest) throws ApiException {
    Object localVarPostBody = getOnlineMemberNumRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling getOnlineMemberNum");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/get_online_member_num";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetOnlineMemberNumResponse> localVarReturnType = new TypeReference<GetOnlineMemberNumResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 查询用户在群组中的身份(https://cloud.tencent.com/document/product/269/1626)
   * 
   * @param random  (required)
   * @param getRoleInGroupRequest  (optional)
   * @return GetRoleInGroupResponse
   * @throws ApiException if fails to make API call
   */
  public GetRoleInGroupResponse getRoleInGroup(Integer random, GetRoleInGroupRequest getRoleInGroupRequest) throws ApiException {
    Object localVarPostBody = getRoleInGroupRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling getRoleInGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/get_role_in_group";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetRoleInGroupResponse> localVarReturnType = new TypeReference<GetRoleInGroupResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 拉取群历史消息（https://cloud.tencent.com/document/product/269/2738）
   * 
   * @param random  (required)
   * @param groupMsgGetSimpleRequest  (optional)
   * @return GroupMsgGetSimpleResponse
   * @throws ApiException if fails to make API call
   */
  public GroupMsgGetSimpleResponse groupMsgGetSimple(Integer random, GroupMsgGetSimpleRequest groupMsgGetSimpleRequest) throws ApiException {
    Object localVarPostBody = groupMsgGetSimpleRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling groupMsgGetSimple");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/group_msg_get_simple";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GroupMsgGetSimpleResponse> localVarReturnType = new TypeReference<GroupMsgGetSimpleResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 撤回群消息（https://cloud.tencent.com/document/product/269/12341）
   * 
   * @param random  (required)
   * @param groupMsgRecallRequest  (optional)
   * @return GroupMsgRecallResponse
   * @throws ApiException if fails to make API call
   */
  public GroupMsgRecallResponse groupMsgRecall(Integer random, GroupMsgRecallRequest groupMsgRecallRequest) throws ApiException {
    Object localVarPostBody = groupMsgRecallRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling groupMsgRecall");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/group_msg_recall";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GroupMsgRecallResponse> localVarReturnType = new TypeReference<GroupMsgRecallResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 导入群基础资料（https://cloud.tencent.com/document/product/269/1634）
   * 
   * @param random  (required)
   * @param importGroupRequest  (optional)
   * @return ImportGroupResponse
   * @throws ApiException if fails to make API call
   */
  public ImportGroupResponse importGroup(Integer random, ImportGroupRequest importGroupRequest) throws ApiException {
    Object localVarPostBody = importGroupRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling importGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/import_group";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ImportGroupResponse> localVarReturnType = new TypeReference<ImportGroupResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 导入群成员（https://cloud.tencent.com/document/product/269/1636）
   * 
   * @param random  (required)
   * @param importGroupMemberRequest  (optional)
   * @return ImportGroupMemberResponse
   * @throws ApiException if fails to make API call
   */
  public ImportGroupMemberResponse importGroupMember(Integer random, ImportGroupMemberRequest importGroupMemberRequest) throws ApiException {
    Object localVarPostBody = importGroupMemberRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling importGroupMember");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/import_group_member";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ImportGroupMemberResponse> localVarReturnType = new TypeReference<ImportGroupMemberResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 导入群消息（https://cloud.tencent.com/document/product/269/1635）
   * 
   * @param random  (required)
   * @param importGroupMsgRequest  (optional)
   * @return ImportGroupMsgResponse
   * @throws ApiException if fails to make API call
   */
  public ImportGroupMsgResponse importGroupMsg(Integer random, ImportGroupMsgRequest importGroupMsgRequest) throws ApiException {
    Object localVarPostBody = importGroupMsgRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling importGroupMsg");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/import_group_msg";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ImportGroupMsgResponse> localVarReturnType = new TypeReference<ImportGroupMsgResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 修改群自定义属性（https://cloud.tencent.com/document/product/269/67010）
   * 
   * @param random  (required)
   * @param modifyGroupAttrRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse modifyGroupAttr(Integer random, ModifyGroupAttrRequest modifyGroupAttrRequest) throws ApiException {
    Object localVarPostBody = modifyGroupAttrRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling modifyGroupAttr");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/modify_group_attr";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CommonResponse> localVarReturnType = new TypeReference<CommonResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 修改群基础资料（https://cloud.tencent.com/document/product/269/1620）
   * 
   * @param random  (required)
   * @param modifyGroupBaseInfoRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse modifyGroupBaseInfo(Integer random, ModifyGroupBaseInfoRequest modifyGroupBaseInfoRequest) throws ApiException {
    Object localVarPostBody = modifyGroupBaseInfoRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling modifyGroupBaseInfo");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/modify_group_base_info";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CommonResponse> localVarReturnType = new TypeReference<CommonResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 修改群成员资料(https://cloud.tencent.com/document/product/269/1623)
   * 
   * @param random  (required)
   * @param modifyGroupMemberInfoRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse modifyGroupMemberInfo(Integer random, ModifyGroupMemberInfoRequest modifyGroupMemberInfoRequest) throws ApiException {
    Object localVarPostBody = modifyGroupMemberInfoRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling modifyGroupMemberInfo");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/modify_group_member_info";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CommonResponse> localVarReturnType = new TypeReference<CommonResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 在群组中发送普通消息（https://cloud.tencent.com/document/product/269/1629）
   * 
   * @param random  (required)
   * @param sendGroupMsgRequest  (optional)
   * @return SendGroupMsgResponse
   * @throws ApiException if fails to make API call
   */
  public SendGroupMsgResponse sendGroupMsg(Integer random, SendGroupMsgRequest sendGroupMsgRequest) throws ApiException {
    Object localVarPostBody = sendGroupMsgRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling sendGroupMsg");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/send_group_msg";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<SendGroupMsgResponse> localVarReturnType = new TypeReference<SendGroupMsgResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 在群组中发送系统通知（https://cloud.tencent.com/document/product/269/1630）
   * 
   * @param random  (required)
   * @param sendGroupSystemNotificationRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse sendGroupSystemNotification(Integer random, SendGroupSystemNotificationRequest sendGroupSystemNotificationRequest) throws ApiException {
    Object localVarPostBody = sendGroupSystemNotificationRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling sendGroupSystemNotification");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/send_group_system_notification";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CommonResponse> localVarReturnType = new TypeReference<CommonResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 重置群自定义属性（https://cloud.tencent.com/document/product/269/67011）
   * 
   * @param random  (required)
   * @param setGroupAttrRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse setGroupAttr(Integer random, SetGroupAttrRequest setGroupAttrRequest) throws ApiException {
    Object localVarPostBody = setGroupAttrRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling setGroupAttr");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/set_group_attr";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CommonResponse> localVarReturnType = new TypeReference<CommonResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 设置成员未读消息计数（https://cloud.tencent.com/document/product/269/1637）
   * 
   * @param random  (required)
   * @param setUnreadMsgNumRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse setUnreadMsgNum(Integer random, SetUnreadMsgNumRequest setUnreadMsgNumRequest) throws ApiException {
    Object localVarPostBody = setUnreadMsgNumRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling setUnreadMsgNum");
    }
    
    // create path and map variables
    String localVarPath = "/v4/group_open_http_svc/set_unread_msg_num";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CommonResponse> localVarReturnType = new TypeReference<CommonResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
}
