/*
 * TIM SERVER REST API SDK
 * TIM REST API
 */


package com.tencentcloudapi.im.api;

import com.tencentcloudapi.im.ApiCallback;
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.ApiResponse;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.Pair;
import com.tencentcloudapi.im.ProgressRequestBody;
import com.tencentcloudapi.im.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class GroupApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GroupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GroupApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for addGroupMember
     * @param random  (required)
     * @param addGroupMemberRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addGroupMemberCall(Integer random, AddGroupMemberRequest addGroupMemberRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = addGroupMemberRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/add_group_member";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addGroupMemberValidateBeforeCall(Integer random, AddGroupMemberRequest addGroupMemberRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling addGroupMember(Async)");
        }
        

        okhttp3.Call localVarCall = addGroupMemberCall(random, addGroupMemberRequest, _callback);
        return localVarCall;

    }

    /**
     * 增加群成员（https://cloud.tencent.com/document/product/269/1621）
     * 
     * @param random  (required)
     * @param addGroupMemberRequest  (optional)
     * @return AddGroupMemberResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public AddGroupMemberResponse addGroupMember(Integer random, AddGroupMemberRequest addGroupMemberRequest) throws ApiException {
        ApiResponse<AddGroupMemberResponse> localVarResp = addGroupMemberWithHttpInfo(random, addGroupMemberRequest);
        return localVarResp.getData();
    }

    /**
     * 增加群成员（https://cloud.tencent.com/document/product/269/1621）
     * 
     * @param random  (required)
     * @param addGroupMemberRequest  (optional)
     * @return ApiResponse&lt;AddGroupMemberResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AddGroupMemberResponse> addGroupMemberWithHttpInfo(Integer random, AddGroupMemberRequest addGroupMemberRequest) throws ApiException {
        okhttp3.Call localVarCall = addGroupMemberValidateBeforeCall(random, addGroupMemberRequest, null);
        Type localVarReturnType = new TypeToken<AddGroupMemberResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 增加群成员（https://cloud.tencent.com/document/product/269/1621） (asynchronously)
     * 
     * @param random  (required)
     * @param addGroupMemberRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addGroupMemberAsync(Integer random, AddGroupMemberRequest addGroupMemberRequest, final ApiCallback<AddGroupMemberResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = addGroupMemberValidateBeforeCall(random, addGroupMemberRequest, _callback);
        Type localVarReturnType = new TypeToken<AddGroupMemberResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for changeGroupOwner
     * @param random  (required)
     * @param changeGroupOwnerRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call changeGroupOwnerCall(Integer random, ChangeGroupOwnerRequest changeGroupOwnerRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = changeGroupOwnerRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/change_group_owner";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call changeGroupOwnerValidateBeforeCall(Integer random, ChangeGroupOwnerRequest changeGroupOwnerRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling changeGroupOwner(Async)");
        }
        

        okhttp3.Call localVarCall = changeGroupOwnerCall(random, changeGroupOwnerRequest, _callback);
        return localVarCall;

    }

    /**
     * 转让群主（https://cloud.tencent.com/document/product/269/1633）
     * 
     * @param random  (required)
     * @param changeGroupOwnerRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse changeGroupOwner(Integer random, ChangeGroupOwnerRequest changeGroupOwnerRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = changeGroupOwnerWithHttpInfo(random, changeGroupOwnerRequest);
        return localVarResp.getData();
    }

    /**
     * 转让群主（https://cloud.tencent.com/document/product/269/1633）
     * 
     * @param random  (required)
     * @param changeGroupOwnerRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> changeGroupOwnerWithHttpInfo(Integer random, ChangeGroupOwnerRequest changeGroupOwnerRequest) throws ApiException {
        okhttp3.Call localVarCall = changeGroupOwnerValidateBeforeCall(random, changeGroupOwnerRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 转让群主（https://cloud.tencent.com/document/product/269/1633） (asynchronously)
     * 
     * @param random  (required)
     * @param changeGroupOwnerRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call changeGroupOwnerAsync(Integer random, ChangeGroupOwnerRequest changeGroupOwnerRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = changeGroupOwnerValidateBeforeCall(random, changeGroupOwnerRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for clearGroupAttr
     * @param random  (required)
     * @param clearGroupAttrRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clearGroupAttrCall(Integer random, ClearGroupAttrRequest clearGroupAttrRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = clearGroupAttrRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/clear_group_attr";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call clearGroupAttrValidateBeforeCall(Integer random, ClearGroupAttrRequest clearGroupAttrRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling clearGroupAttr(Async)");
        }
        

        okhttp3.Call localVarCall = clearGroupAttrCall(random, clearGroupAttrRequest, _callback);
        return localVarCall;

    }

    /**
     * 清空群自定义属性（https://cloud.tencent.com/document/product/269/67009）
     * 
     * @param random  (required)
     * @param clearGroupAttrRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse clearGroupAttr(Integer random, ClearGroupAttrRequest clearGroupAttrRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = clearGroupAttrWithHttpInfo(random, clearGroupAttrRequest);
        return localVarResp.getData();
    }

    /**
     * 清空群自定义属性（https://cloud.tencent.com/document/product/269/67009）
     * 
     * @param random  (required)
     * @param clearGroupAttrRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> clearGroupAttrWithHttpInfo(Integer random, ClearGroupAttrRequest clearGroupAttrRequest) throws ApiException {
        okhttp3.Call localVarCall = clearGroupAttrValidateBeforeCall(random, clearGroupAttrRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 清空群自定义属性（https://cloud.tencent.com/document/product/269/67009） (asynchronously)
     * 
     * @param random  (required)
     * @param clearGroupAttrRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clearGroupAttrAsync(Integer random, ClearGroupAttrRequest clearGroupAttrRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = clearGroupAttrValidateBeforeCall(random, clearGroupAttrRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createGroup
     * @param random  (required)
     * @param createGroupRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createGroupCall(Integer random, CreateGroupRequest createGroupRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createGroupRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/create_group";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createGroupValidateBeforeCall(Integer random, CreateGroupRequest createGroupRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling createGroup(Async)");
        }
        

        okhttp3.Call localVarCall = createGroupCall(random, createGroupRequest, _callback);
        return localVarCall;

    }

    /**
     * 创建群组（https://cloud.tencent.com/document/product/269/1615）
     * 
     * @param random  (required)
     * @param createGroupRequest  (optional)
     * @return CreateGroupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CreateGroupResponse createGroup(Integer random, CreateGroupRequest createGroupRequest) throws ApiException {
        ApiResponse<CreateGroupResponse> localVarResp = createGroupWithHttpInfo(random, createGroupRequest);
        return localVarResp.getData();
    }

    /**
     * 创建群组（https://cloud.tencent.com/document/product/269/1615）
     * 
     * @param random  (required)
     * @param createGroupRequest  (optional)
     * @return ApiResponse&lt;CreateGroupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateGroupResponse> createGroupWithHttpInfo(Integer random, CreateGroupRequest createGroupRequest) throws ApiException {
        okhttp3.Call localVarCall = createGroupValidateBeforeCall(random, createGroupRequest, null);
        Type localVarReturnType = new TypeToken<CreateGroupResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 创建群组（https://cloud.tencent.com/document/product/269/1615） (asynchronously)
     * 
     * @param random  (required)
     * @param createGroupRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createGroupAsync(Integer random, CreateGroupRequest createGroupRequest, final ApiCallback<CreateGroupResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createGroupValidateBeforeCall(random, createGroupRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateGroupResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteGroupMember
     * @param random  (required)
     * @param deleteGroupMemberRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteGroupMemberCall(Integer random, DeleteGroupMemberRequest deleteGroupMemberRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = deleteGroupMemberRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/delete_group_member";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteGroupMemberValidateBeforeCall(Integer random, DeleteGroupMemberRequest deleteGroupMemberRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling deleteGroupMember(Async)");
        }
        

        okhttp3.Call localVarCall = deleteGroupMemberCall(random, deleteGroupMemberRequest, _callback);
        return localVarCall;

    }

    /**
     * 删除群成员（https://cloud.tencent.com/document/product/269/1622）
     * 
     * @param random  (required)
     * @param deleteGroupMemberRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse deleteGroupMember(Integer random, DeleteGroupMemberRequest deleteGroupMemberRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = deleteGroupMemberWithHttpInfo(random, deleteGroupMemberRequest);
        return localVarResp.getData();
    }

    /**
     * 删除群成员（https://cloud.tencent.com/document/product/269/1622）
     * 
     * @param random  (required)
     * @param deleteGroupMemberRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> deleteGroupMemberWithHttpInfo(Integer random, DeleteGroupMemberRequest deleteGroupMemberRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteGroupMemberValidateBeforeCall(random, deleteGroupMemberRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 删除群成员（https://cloud.tencent.com/document/product/269/1622） (asynchronously)
     * 
     * @param random  (required)
     * @param deleteGroupMemberRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteGroupMemberAsync(Integer random, DeleteGroupMemberRequest deleteGroupMemberRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteGroupMemberValidateBeforeCall(random, deleteGroupMemberRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteGroupMsgBySender
     * @param random  (required)
     * @param deleteGroupMsgBySenderRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteGroupMsgBySenderCall(Integer random, DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = deleteGroupMsgBySenderRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/delete_group_msg_by_sender";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteGroupMsgBySenderValidateBeforeCall(Integer random, DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling deleteGroupMsgBySender(Async)");
        }
        

        okhttp3.Call localVarCall = deleteGroupMsgBySenderCall(random, deleteGroupMsgBySenderRequest, _callback);
        return localVarCall;

    }

    /**
     * 删除指定用户发送的消息（https://cloud.tencent.com/document/product/269/2359）
     * 
     * @param random  (required)
     * @param deleteGroupMsgBySenderRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse deleteGroupMsgBySender(Integer random, DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = deleteGroupMsgBySenderWithHttpInfo(random, deleteGroupMsgBySenderRequest);
        return localVarResp.getData();
    }

    /**
     * 删除指定用户发送的消息（https://cloud.tencent.com/document/product/269/2359）
     * 
     * @param random  (required)
     * @param deleteGroupMsgBySenderRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> deleteGroupMsgBySenderWithHttpInfo(Integer random, DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteGroupMsgBySenderValidateBeforeCall(random, deleteGroupMsgBySenderRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 删除指定用户发送的消息（https://cloud.tencent.com/document/product/269/2359） (asynchronously)
     * 
     * @param random  (required)
     * @param deleteGroupMsgBySenderRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteGroupMsgBySenderAsync(Integer random, DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteGroupMsgBySenderValidateBeforeCall(random, deleteGroupMsgBySenderRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for destroyGroup
     * @param random  (required)
     * @param destroyGroupRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call destroyGroupCall(Integer random, DestroyGroupRequest destroyGroupRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = destroyGroupRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/destroy_group";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call destroyGroupValidateBeforeCall(Integer random, DestroyGroupRequest destroyGroupRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling destroyGroup(Async)");
        }
        

        okhttp3.Call localVarCall = destroyGroupCall(random, destroyGroupRequest, _callback);
        return localVarCall;

    }

    /**
     * 解散群组(https://cloud.tencent.com/document/product/269/1624)
     * 
     * @param random  (required)
     * @param destroyGroupRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse destroyGroup(Integer random, DestroyGroupRequest destroyGroupRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = destroyGroupWithHttpInfo(random, destroyGroupRequest);
        return localVarResp.getData();
    }

    /**
     * 解散群组(https://cloud.tencent.com/document/product/269/1624)
     * 
     * @param random  (required)
     * @param destroyGroupRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> destroyGroupWithHttpInfo(Integer random, DestroyGroupRequest destroyGroupRequest) throws ApiException {
        okhttp3.Call localVarCall = destroyGroupValidateBeforeCall(random, destroyGroupRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 解散群组(https://cloud.tencent.com/document/product/269/1624) (asynchronously)
     * 
     * @param random  (required)
     * @param destroyGroupRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call destroyGroupAsync(Integer random, DestroyGroupRequest destroyGroupRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = destroyGroupValidateBeforeCall(random, destroyGroupRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for forbidSendMsg
     * @param random  (required)
     * @param forbidSendMsgRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call forbidSendMsgCall(Integer random, ForbidSendMsgRequest forbidSendMsgRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = forbidSendMsgRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/forbid_send_msg";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call forbidSendMsgValidateBeforeCall(Integer random, ForbidSendMsgRequest forbidSendMsgRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling forbidSendMsg(Async)");
        }
        

        okhttp3.Call localVarCall = forbidSendMsgCall(random, forbidSendMsgRequest, _callback);
        return localVarCall;

    }

    /**
     * 批量禁言和取消禁言(https://cloud.tencent.com/document/product/269/1627)
     * 
     * @param random  (required)
     * @param forbidSendMsgRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse forbidSendMsg(Integer random, ForbidSendMsgRequest forbidSendMsgRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = forbidSendMsgWithHttpInfo(random, forbidSendMsgRequest);
        return localVarResp.getData();
    }

    /**
     * 批量禁言和取消禁言(https://cloud.tencent.com/document/product/269/1627)
     * 
     * @param random  (required)
     * @param forbidSendMsgRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> forbidSendMsgWithHttpInfo(Integer random, ForbidSendMsgRequest forbidSendMsgRequest) throws ApiException {
        okhttp3.Call localVarCall = forbidSendMsgValidateBeforeCall(random, forbidSendMsgRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 批量禁言和取消禁言(https://cloud.tencent.com/document/product/269/1627) (asynchronously)
     * 
     * @param random  (required)
     * @param forbidSendMsgRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call forbidSendMsgAsync(Integer random, ForbidSendMsgRequest forbidSendMsgRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = forbidSendMsgValidateBeforeCall(random, forbidSendMsgRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAppidGroupList
     * @param random  (required)
     * @param getAppidGroupListRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAppidGroupListCall(Integer random, GetAppidGroupListRequest getAppidGroupListRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getAppidGroupListRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/get_appid_group_list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAppidGroupListValidateBeforeCall(Integer random, GetAppidGroupListRequest getAppidGroupListRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling getAppidGroupList(Async)");
        }
        

        okhttp3.Call localVarCall = getAppidGroupListCall(random, getAppidGroupListRequest, _callback);
        return localVarCall;

    }

    /**
     * 获取 App 中的所有群组（https://cloud.tencent.com/document/product/269/1614）
     * 
     * @param random  (required)
     * @param getAppidGroupListRequest  (optional)
     * @return GetAppidGroupListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetAppidGroupListResponse getAppidGroupList(Integer random, GetAppidGroupListRequest getAppidGroupListRequest) throws ApiException {
        ApiResponse<GetAppidGroupListResponse> localVarResp = getAppidGroupListWithHttpInfo(random, getAppidGroupListRequest);
        return localVarResp.getData();
    }

    /**
     * 获取 App 中的所有群组（https://cloud.tencent.com/document/product/269/1614）
     * 
     * @param random  (required)
     * @param getAppidGroupListRequest  (optional)
     * @return ApiResponse&lt;GetAppidGroupListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetAppidGroupListResponse> getAppidGroupListWithHttpInfo(Integer random, GetAppidGroupListRequest getAppidGroupListRequest) throws ApiException {
        okhttp3.Call localVarCall = getAppidGroupListValidateBeforeCall(random, getAppidGroupListRequest, null);
        Type localVarReturnType = new TypeToken<GetAppidGroupListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取 App 中的所有群组（https://cloud.tencent.com/document/product/269/1614） (asynchronously)
     * 
     * @param random  (required)
     * @param getAppidGroupListRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAppidGroupListAsync(Integer random, GetAppidGroupListRequest getAppidGroupListRequest, final ApiCallback<GetAppidGroupListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAppidGroupListValidateBeforeCall(random, getAppidGroupListRequest, _callback);
        Type localVarReturnType = new TypeToken<GetAppidGroupListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getGroupAttr
     * @param random  (required)
     * @param getGroupAttrRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGroupAttrCall(Integer random, GetGroupAttrRequest getGroupAttrRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getGroupAttrRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/get_group_attr";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGroupAttrValidateBeforeCall(Integer random, GetGroupAttrRequest getGroupAttrRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling getGroupAttr(Async)");
        }
        

        okhttp3.Call localVarCall = getGroupAttrCall(random, getGroupAttrRequest, _callback);
        return localVarCall;

    }

    /**
     * 获取群自定义属性（https://cloud.tencent.com/document/product/269/67012）
     * 
     * @param random  (required)
     * @param getGroupAttrRequest  (optional)
     * @return GetGroupAttrResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetGroupAttrResponse getGroupAttr(Integer random, GetGroupAttrRequest getGroupAttrRequest) throws ApiException {
        ApiResponse<GetGroupAttrResponse> localVarResp = getGroupAttrWithHttpInfo(random, getGroupAttrRequest);
        return localVarResp.getData();
    }

    /**
     * 获取群自定义属性（https://cloud.tencent.com/document/product/269/67012）
     * 
     * @param random  (required)
     * @param getGroupAttrRequest  (optional)
     * @return ApiResponse&lt;GetGroupAttrResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetGroupAttrResponse> getGroupAttrWithHttpInfo(Integer random, GetGroupAttrRequest getGroupAttrRequest) throws ApiException {
        okhttp3.Call localVarCall = getGroupAttrValidateBeforeCall(random, getGroupAttrRequest, null);
        Type localVarReturnType = new TypeToken<GetGroupAttrResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取群自定义属性（https://cloud.tencent.com/document/product/269/67012） (asynchronously)
     * 
     * @param random  (required)
     * @param getGroupAttrRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGroupAttrAsync(Integer random, GetGroupAttrRequest getGroupAttrRequest, final ApiCallback<GetGroupAttrResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGroupAttrValidateBeforeCall(random, getGroupAttrRequest, _callback);
        Type localVarReturnType = new TypeToken<GetGroupAttrResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getGroupInfo
     * @param random  (required)
     * @param getGroupInfoRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGroupInfoCall(Integer random, GetGroupInfoRequest getGroupInfoRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getGroupInfoRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/get_group_info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGroupInfoValidateBeforeCall(Integer random, GetGroupInfoRequest getGroupInfoRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling getGroupInfo(Async)");
        }
        

        okhttp3.Call localVarCall = getGroupInfoCall(random, getGroupInfoRequest, _callback);
        return localVarCall;

    }

    /**
     * 获取群详细资料（https://cloud.tencent.com/document/product/269/1616）
     * 
     * @param random  (required)
     * @param getGroupInfoRequest  (optional)
     * @return GetGroupInfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetGroupInfoResponse getGroupInfo(Integer random, GetGroupInfoRequest getGroupInfoRequest) throws ApiException {
        ApiResponse<GetGroupInfoResponse> localVarResp = getGroupInfoWithHttpInfo(random, getGroupInfoRequest);
        return localVarResp.getData();
    }

    /**
     * 获取群详细资料（https://cloud.tencent.com/document/product/269/1616）
     * 
     * @param random  (required)
     * @param getGroupInfoRequest  (optional)
     * @return ApiResponse&lt;GetGroupInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetGroupInfoResponse> getGroupInfoWithHttpInfo(Integer random, GetGroupInfoRequest getGroupInfoRequest) throws ApiException {
        okhttp3.Call localVarCall = getGroupInfoValidateBeforeCall(random, getGroupInfoRequest, null);
        Type localVarReturnType = new TypeToken<GetGroupInfoResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取群详细资料（https://cloud.tencent.com/document/product/269/1616） (asynchronously)
     * 
     * @param random  (required)
     * @param getGroupInfoRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGroupInfoAsync(Integer random, GetGroupInfoRequest getGroupInfoRequest, final ApiCallback<GetGroupInfoResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGroupInfoValidateBeforeCall(random, getGroupInfoRequest, _callback);
        Type localVarReturnType = new TypeToken<GetGroupInfoResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getGroupMemberInfo
     * @param random  (required)
     * @param getGroupMemberInfoRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGroupMemberInfoCall(Integer random, GetGroupMemberInfoRequest getGroupMemberInfoRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getGroupMemberInfoRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/get_group_member_info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGroupMemberInfoValidateBeforeCall(Integer random, GetGroupMemberInfoRequest getGroupMemberInfoRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling getGroupMemberInfo(Async)");
        }
        

        okhttp3.Call localVarCall = getGroupMemberInfoCall(random, getGroupMemberInfoRequest, _callback);
        return localVarCall;

    }

    /**
     * 获取群成员详细资料（https://cloud.tencent.com/document/product/269/1617）
     * 
     * @param random  (required)
     * @param getGroupMemberInfoRequest  (optional)
     * @return GetGroupMemberInfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetGroupMemberInfoResponse getGroupMemberInfo(Integer random, GetGroupMemberInfoRequest getGroupMemberInfoRequest) throws ApiException {
        ApiResponse<GetGroupMemberInfoResponse> localVarResp = getGroupMemberInfoWithHttpInfo(random, getGroupMemberInfoRequest);
        return localVarResp.getData();
    }

    /**
     * 获取群成员详细资料（https://cloud.tencent.com/document/product/269/1617）
     * 
     * @param random  (required)
     * @param getGroupMemberInfoRequest  (optional)
     * @return ApiResponse&lt;GetGroupMemberInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetGroupMemberInfoResponse> getGroupMemberInfoWithHttpInfo(Integer random, GetGroupMemberInfoRequest getGroupMemberInfoRequest) throws ApiException {
        okhttp3.Call localVarCall = getGroupMemberInfoValidateBeforeCall(random, getGroupMemberInfoRequest, null);
        Type localVarReturnType = new TypeToken<GetGroupMemberInfoResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取群成员详细资料（https://cloud.tencent.com/document/product/269/1617） (asynchronously)
     * 
     * @param random  (required)
     * @param getGroupMemberInfoRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGroupMemberInfoAsync(Integer random, GetGroupMemberInfoRequest getGroupMemberInfoRequest, final ApiCallback<GetGroupMemberInfoResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGroupMemberInfoValidateBeforeCall(random, getGroupMemberInfoRequest, _callback);
        Type localVarReturnType = new TypeToken<GetGroupMemberInfoResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getGroupShuttedUin
     * @param random  (required)
     * @param getGroupShuttedUinRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGroupShuttedUinCall(Integer random, GetGroupShuttedUinRequest getGroupShuttedUinRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getGroupShuttedUinRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/get_group_shutted_uin";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGroupShuttedUinValidateBeforeCall(Integer random, GetGroupShuttedUinRequest getGroupShuttedUinRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling getGroupShuttedUin(Async)");
        }
        

        okhttp3.Call localVarCall = getGroupShuttedUinCall(random, getGroupShuttedUinRequest, _callback);
        return localVarCall;

    }

    /**
     * 获取被禁言群成员列表(https://cloud.tencent.com/document/product/269/2925)
     * 
     * @param random  (required)
     * @param getGroupShuttedUinRequest  (optional)
     * @return GetGroupShuttedUinResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetGroupShuttedUinResponse getGroupShuttedUin(Integer random, GetGroupShuttedUinRequest getGroupShuttedUinRequest) throws ApiException {
        ApiResponse<GetGroupShuttedUinResponse> localVarResp = getGroupShuttedUinWithHttpInfo(random, getGroupShuttedUinRequest);
        return localVarResp.getData();
    }

    /**
     * 获取被禁言群成员列表(https://cloud.tencent.com/document/product/269/2925)
     * 
     * @param random  (required)
     * @param getGroupShuttedUinRequest  (optional)
     * @return ApiResponse&lt;GetGroupShuttedUinResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetGroupShuttedUinResponse> getGroupShuttedUinWithHttpInfo(Integer random, GetGroupShuttedUinRequest getGroupShuttedUinRequest) throws ApiException {
        okhttp3.Call localVarCall = getGroupShuttedUinValidateBeforeCall(random, getGroupShuttedUinRequest, null);
        Type localVarReturnType = new TypeToken<GetGroupShuttedUinResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取被禁言群成员列表(https://cloud.tencent.com/document/product/269/2925) (asynchronously)
     * 
     * @param random  (required)
     * @param getGroupShuttedUinRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGroupShuttedUinAsync(Integer random, GetGroupShuttedUinRequest getGroupShuttedUinRequest, final ApiCallback<GetGroupShuttedUinResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGroupShuttedUinValidateBeforeCall(random, getGroupShuttedUinRequest, _callback);
        Type localVarReturnType = new TypeToken<GetGroupShuttedUinResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getJoinedGroupList
     * @param random  (required)
     * @param getJoinedGroupListRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getJoinedGroupListCall(Integer random, GetJoinedGroupListRequest getJoinedGroupListRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getJoinedGroupListRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/get_joined_group_list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getJoinedGroupListValidateBeforeCall(Integer random, GetJoinedGroupListRequest getJoinedGroupListRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling getJoinedGroupList(Async)");
        }
        

        okhttp3.Call localVarCall = getJoinedGroupListCall(random, getJoinedGroupListRequest, _callback);
        return localVarCall;

    }

    /**
     * 获取用户所加入的群组(https://cloud.tencent.com/document/product/269/1625)
     * 
     * @param random  (required)
     * @param getJoinedGroupListRequest  (optional)
     * @return GetJoinedGroupListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetJoinedGroupListResponse getJoinedGroupList(Integer random, GetJoinedGroupListRequest getJoinedGroupListRequest) throws ApiException {
        ApiResponse<GetJoinedGroupListResponse> localVarResp = getJoinedGroupListWithHttpInfo(random, getJoinedGroupListRequest);
        return localVarResp.getData();
    }

    /**
     * 获取用户所加入的群组(https://cloud.tencent.com/document/product/269/1625)
     * 
     * @param random  (required)
     * @param getJoinedGroupListRequest  (optional)
     * @return ApiResponse&lt;GetJoinedGroupListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetJoinedGroupListResponse> getJoinedGroupListWithHttpInfo(Integer random, GetJoinedGroupListRequest getJoinedGroupListRequest) throws ApiException {
        okhttp3.Call localVarCall = getJoinedGroupListValidateBeforeCall(random, getJoinedGroupListRequest, null);
        Type localVarReturnType = new TypeToken<GetJoinedGroupListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取用户所加入的群组(https://cloud.tencent.com/document/product/269/1625) (asynchronously)
     * 
     * @param random  (required)
     * @param getJoinedGroupListRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getJoinedGroupListAsync(Integer random, GetJoinedGroupListRequest getJoinedGroupListRequest, final ApiCallback<GetJoinedGroupListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getJoinedGroupListValidateBeforeCall(random, getJoinedGroupListRequest, _callback);
        Type localVarReturnType = new TypeToken<GetJoinedGroupListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getOnlineMemberNum
     * @param random  (required)
     * @param getOnlineMemberNumRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOnlineMemberNumCall(Integer random, GetOnlineMemberNumRequest getOnlineMemberNumRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getOnlineMemberNumRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/get_online_member_num";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getOnlineMemberNumValidateBeforeCall(Integer random, GetOnlineMemberNumRequest getOnlineMemberNumRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling getOnlineMemberNum(Async)");
        }
        

        okhttp3.Call localVarCall = getOnlineMemberNumCall(random, getOnlineMemberNumRequest, _callback);
        return localVarCall;

    }

    /**
     * 获取直播群在线人数（https://cloud.tencent.com/document/product/269/49180）
     * 
     * @param random  (required)
     * @param getOnlineMemberNumRequest  (optional)
     * @return GetOnlineMemberNumResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetOnlineMemberNumResponse getOnlineMemberNum(Integer random, GetOnlineMemberNumRequest getOnlineMemberNumRequest) throws ApiException {
        ApiResponse<GetOnlineMemberNumResponse> localVarResp = getOnlineMemberNumWithHttpInfo(random, getOnlineMemberNumRequest);
        return localVarResp.getData();
    }

    /**
     * 获取直播群在线人数（https://cloud.tencent.com/document/product/269/49180）
     * 
     * @param random  (required)
     * @param getOnlineMemberNumRequest  (optional)
     * @return ApiResponse&lt;GetOnlineMemberNumResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetOnlineMemberNumResponse> getOnlineMemberNumWithHttpInfo(Integer random, GetOnlineMemberNumRequest getOnlineMemberNumRequest) throws ApiException {
        okhttp3.Call localVarCall = getOnlineMemberNumValidateBeforeCall(random, getOnlineMemberNumRequest, null);
        Type localVarReturnType = new TypeToken<GetOnlineMemberNumResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取直播群在线人数（https://cloud.tencent.com/document/product/269/49180） (asynchronously)
     * 
     * @param random  (required)
     * @param getOnlineMemberNumRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOnlineMemberNumAsync(Integer random, GetOnlineMemberNumRequest getOnlineMemberNumRequest, final ApiCallback<GetOnlineMemberNumResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOnlineMemberNumValidateBeforeCall(random, getOnlineMemberNumRequest, _callback);
        Type localVarReturnType = new TypeToken<GetOnlineMemberNumResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRoleInGroup
     * @param random  (required)
     * @param getRoleInGroupRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRoleInGroupCall(Integer random, GetRoleInGroupRequest getRoleInGroupRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getRoleInGroupRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/get_role_in_group";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getRoleInGroupValidateBeforeCall(Integer random, GetRoleInGroupRequest getRoleInGroupRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling getRoleInGroup(Async)");
        }
        

        okhttp3.Call localVarCall = getRoleInGroupCall(random, getRoleInGroupRequest, _callback);
        return localVarCall;

    }

    /**
     * 查询用户在群组中的身份(https://cloud.tencent.com/document/product/269/1626)
     * 
     * @param random  (required)
     * @param getRoleInGroupRequest  (optional)
     * @return GetRoleInGroupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetRoleInGroupResponse getRoleInGroup(Integer random, GetRoleInGroupRequest getRoleInGroupRequest) throws ApiException {
        ApiResponse<GetRoleInGroupResponse> localVarResp = getRoleInGroupWithHttpInfo(random, getRoleInGroupRequest);
        return localVarResp.getData();
    }

    /**
     * 查询用户在群组中的身份(https://cloud.tencent.com/document/product/269/1626)
     * 
     * @param random  (required)
     * @param getRoleInGroupRequest  (optional)
     * @return ApiResponse&lt;GetRoleInGroupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetRoleInGroupResponse> getRoleInGroupWithHttpInfo(Integer random, GetRoleInGroupRequest getRoleInGroupRequest) throws ApiException {
        okhttp3.Call localVarCall = getRoleInGroupValidateBeforeCall(random, getRoleInGroupRequest, null);
        Type localVarReturnType = new TypeToken<GetRoleInGroupResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 查询用户在群组中的身份(https://cloud.tencent.com/document/product/269/1626) (asynchronously)
     * 
     * @param random  (required)
     * @param getRoleInGroupRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRoleInGroupAsync(Integer random, GetRoleInGroupRequest getRoleInGroupRequest, final ApiCallback<GetRoleInGroupResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRoleInGroupValidateBeforeCall(random, getRoleInGroupRequest, _callback);
        Type localVarReturnType = new TypeToken<GetRoleInGroupResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for groupMsgGetSimple
     * @param random  (required)
     * @param groupMsgGetSimpleRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call groupMsgGetSimpleCall(Integer random, GroupMsgGetSimpleRequest groupMsgGetSimpleRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = groupMsgGetSimpleRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/group_msg_get_simple";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call groupMsgGetSimpleValidateBeforeCall(Integer random, GroupMsgGetSimpleRequest groupMsgGetSimpleRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling groupMsgGetSimple(Async)");
        }
        

        okhttp3.Call localVarCall = groupMsgGetSimpleCall(random, groupMsgGetSimpleRequest, _callback);
        return localVarCall;

    }

    /**
     * 拉取群历史消息（https://cloud.tencent.com/document/product/269/2738）
     * 
     * @param random  (required)
     * @param groupMsgGetSimpleRequest  (optional)
     * @return GroupMsgGetSimpleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GroupMsgGetSimpleResponse groupMsgGetSimple(Integer random, GroupMsgGetSimpleRequest groupMsgGetSimpleRequest) throws ApiException {
        ApiResponse<GroupMsgGetSimpleResponse> localVarResp = groupMsgGetSimpleWithHttpInfo(random, groupMsgGetSimpleRequest);
        return localVarResp.getData();
    }

    /**
     * 拉取群历史消息（https://cloud.tencent.com/document/product/269/2738）
     * 
     * @param random  (required)
     * @param groupMsgGetSimpleRequest  (optional)
     * @return ApiResponse&lt;GroupMsgGetSimpleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GroupMsgGetSimpleResponse> groupMsgGetSimpleWithHttpInfo(Integer random, GroupMsgGetSimpleRequest groupMsgGetSimpleRequest) throws ApiException {
        okhttp3.Call localVarCall = groupMsgGetSimpleValidateBeforeCall(random, groupMsgGetSimpleRequest, null);
        Type localVarReturnType = new TypeToken<GroupMsgGetSimpleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 拉取群历史消息（https://cloud.tencent.com/document/product/269/2738） (asynchronously)
     * 
     * @param random  (required)
     * @param groupMsgGetSimpleRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call groupMsgGetSimpleAsync(Integer random, GroupMsgGetSimpleRequest groupMsgGetSimpleRequest, final ApiCallback<GroupMsgGetSimpleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = groupMsgGetSimpleValidateBeforeCall(random, groupMsgGetSimpleRequest, _callback);
        Type localVarReturnType = new TypeToken<GroupMsgGetSimpleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for groupMsgRecall
     * @param random  (required)
     * @param groupMsgRecallRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call groupMsgRecallCall(Integer random, GroupMsgRecallRequest groupMsgRecallRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = groupMsgRecallRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/group_msg_recall";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call groupMsgRecallValidateBeforeCall(Integer random, GroupMsgRecallRequest groupMsgRecallRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling groupMsgRecall(Async)");
        }
        

        okhttp3.Call localVarCall = groupMsgRecallCall(random, groupMsgRecallRequest, _callback);
        return localVarCall;

    }

    /**
     * 撤回群消息（https://cloud.tencent.com/document/product/269/12341）
     * 
     * @param random  (required)
     * @param groupMsgRecallRequest  (optional)
     * @return GroupMsgRecallResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GroupMsgRecallResponse groupMsgRecall(Integer random, GroupMsgRecallRequest groupMsgRecallRequest) throws ApiException {
        ApiResponse<GroupMsgRecallResponse> localVarResp = groupMsgRecallWithHttpInfo(random, groupMsgRecallRequest);
        return localVarResp.getData();
    }

    /**
     * 撤回群消息（https://cloud.tencent.com/document/product/269/12341）
     * 
     * @param random  (required)
     * @param groupMsgRecallRequest  (optional)
     * @return ApiResponse&lt;GroupMsgRecallResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GroupMsgRecallResponse> groupMsgRecallWithHttpInfo(Integer random, GroupMsgRecallRequest groupMsgRecallRequest) throws ApiException {
        okhttp3.Call localVarCall = groupMsgRecallValidateBeforeCall(random, groupMsgRecallRequest, null);
        Type localVarReturnType = new TypeToken<GroupMsgRecallResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 撤回群消息（https://cloud.tencent.com/document/product/269/12341） (asynchronously)
     * 
     * @param random  (required)
     * @param groupMsgRecallRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call groupMsgRecallAsync(Integer random, GroupMsgRecallRequest groupMsgRecallRequest, final ApiCallback<GroupMsgRecallResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = groupMsgRecallValidateBeforeCall(random, groupMsgRecallRequest, _callback);
        Type localVarReturnType = new TypeToken<GroupMsgRecallResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for importGroup
     * @param random  (required)
     * @param importGroupRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importGroupCall(Integer random, ImportGroupRequest importGroupRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = importGroupRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/import_group";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call importGroupValidateBeforeCall(Integer random, ImportGroupRequest importGroupRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling importGroup(Async)");
        }
        

        okhttp3.Call localVarCall = importGroupCall(random, importGroupRequest, _callback);
        return localVarCall;

    }

    /**
     * 导入群基础资料（https://cloud.tencent.com/document/product/269/1634）
     * 
     * @param random  (required)
     * @param importGroupRequest  (optional)
     * @return ImportGroupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ImportGroupResponse importGroup(Integer random, ImportGroupRequest importGroupRequest) throws ApiException {
        ApiResponse<ImportGroupResponse> localVarResp = importGroupWithHttpInfo(random, importGroupRequest);
        return localVarResp.getData();
    }

    /**
     * 导入群基础资料（https://cloud.tencent.com/document/product/269/1634）
     * 
     * @param random  (required)
     * @param importGroupRequest  (optional)
     * @return ApiResponse&lt;ImportGroupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImportGroupResponse> importGroupWithHttpInfo(Integer random, ImportGroupRequest importGroupRequest) throws ApiException {
        okhttp3.Call localVarCall = importGroupValidateBeforeCall(random, importGroupRequest, null);
        Type localVarReturnType = new TypeToken<ImportGroupResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 导入群基础资料（https://cloud.tencent.com/document/product/269/1634） (asynchronously)
     * 
     * @param random  (required)
     * @param importGroupRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importGroupAsync(Integer random, ImportGroupRequest importGroupRequest, final ApiCallback<ImportGroupResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = importGroupValidateBeforeCall(random, importGroupRequest, _callback);
        Type localVarReturnType = new TypeToken<ImportGroupResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for importGroupMember
     * @param random  (required)
     * @param importGroupMemberRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importGroupMemberCall(Integer random, ImportGroupMemberRequest importGroupMemberRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = importGroupMemberRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/import_group_member";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call importGroupMemberValidateBeforeCall(Integer random, ImportGroupMemberRequest importGroupMemberRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling importGroupMember(Async)");
        }
        

        okhttp3.Call localVarCall = importGroupMemberCall(random, importGroupMemberRequest, _callback);
        return localVarCall;

    }

    /**
     * 导入群成员（https://cloud.tencent.com/document/product/269/1636）
     * 
     * @param random  (required)
     * @param importGroupMemberRequest  (optional)
     * @return ImportGroupMemberResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ImportGroupMemberResponse importGroupMember(Integer random, ImportGroupMemberRequest importGroupMemberRequest) throws ApiException {
        ApiResponse<ImportGroupMemberResponse> localVarResp = importGroupMemberWithHttpInfo(random, importGroupMemberRequest);
        return localVarResp.getData();
    }

    /**
     * 导入群成员（https://cloud.tencent.com/document/product/269/1636）
     * 
     * @param random  (required)
     * @param importGroupMemberRequest  (optional)
     * @return ApiResponse&lt;ImportGroupMemberResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImportGroupMemberResponse> importGroupMemberWithHttpInfo(Integer random, ImportGroupMemberRequest importGroupMemberRequest) throws ApiException {
        okhttp3.Call localVarCall = importGroupMemberValidateBeforeCall(random, importGroupMemberRequest, null);
        Type localVarReturnType = new TypeToken<ImportGroupMemberResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 导入群成员（https://cloud.tencent.com/document/product/269/1636） (asynchronously)
     * 
     * @param random  (required)
     * @param importGroupMemberRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importGroupMemberAsync(Integer random, ImportGroupMemberRequest importGroupMemberRequest, final ApiCallback<ImportGroupMemberResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = importGroupMemberValidateBeforeCall(random, importGroupMemberRequest, _callback);
        Type localVarReturnType = new TypeToken<ImportGroupMemberResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for importGroupMsg
     * @param random  (required)
     * @param importGroupMsgRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importGroupMsgCall(Integer random, ImportGroupMsgRequest importGroupMsgRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = importGroupMsgRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/import_group_msg";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call importGroupMsgValidateBeforeCall(Integer random, ImportGroupMsgRequest importGroupMsgRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling importGroupMsg(Async)");
        }
        

        okhttp3.Call localVarCall = importGroupMsgCall(random, importGroupMsgRequest, _callback);
        return localVarCall;

    }

    /**
     * 导入群消息（https://cloud.tencent.com/document/product/269/1635）
     * 
     * @param random  (required)
     * @param importGroupMsgRequest  (optional)
     * @return ImportGroupMsgResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ImportGroupMsgResponse importGroupMsg(Integer random, ImportGroupMsgRequest importGroupMsgRequest) throws ApiException {
        ApiResponse<ImportGroupMsgResponse> localVarResp = importGroupMsgWithHttpInfo(random, importGroupMsgRequest);
        return localVarResp.getData();
    }

    /**
     * 导入群消息（https://cloud.tencent.com/document/product/269/1635）
     * 
     * @param random  (required)
     * @param importGroupMsgRequest  (optional)
     * @return ApiResponse&lt;ImportGroupMsgResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImportGroupMsgResponse> importGroupMsgWithHttpInfo(Integer random, ImportGroupMsgRequest importGroupMsgRequest) throws ApiException {
        okhttp3.Call localVarCall = importGroupMsgValidateBeforeCall(random, importGroupMsgRequest, null);
        Type localVarReturnType = new TypeToken<ImportGroupMsgResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 导入群消息（https://cloud.tencent.com/document/product/269/1635） (asynchronously)
     * 
     * @param random  (required)
     * @param importGroupMsgRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importGroupMsgAsync(Integer random, ImportGroupMsgRequest importGroupMsgRequest, final ApiCallback<ImportGroupMsgResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = importGroupMsgValidateBeforeCall(random, importGroupMsgRequest, _callback);
        Type localVarReturnType = new TypeToken<ImportGroupMsgResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modifyGroupAttr
     * @param random  (required)
     * @param modifyGroupAttrRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyGroupAttrCall(Integer random, ModifyGroupAttrRequest modifyGroupAttrRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = modifyGroupAttrRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/modify_group_attr";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call modifyGroupAttrValidateBeforeCall(Integer random, ModifyGroupAttrRequest modifyGroupAttrRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling modifyGroupAttr(Async)");
        }
        

        okhttp3.Call localVarCall = modifyGroupAttrCall(random, modifyGroupAttrRequest, _callback);
        return localVarCall;

    }

    /**
     * 修改群自定义属性（https://cloud.tencent.com/document/product/269/67010）
     * 
     * @param random  (required)
     * @param modifyGroupAttrRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse modifyGroupAttr(Integer random, ModifyGroupAttrRequest modifyGroupAttrRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = modifyGroupAttrWithHttpInfo(random, modifyGroupAttrRequest);
        return localVarResp.getData();
    }

    /**
     * 修改群自定义属性（https://cloud.tencent.com/document/product/269/67010）
     * 
     * @param random  (required)
     * @param modifyGroupAttrRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> modifyGroupAttrWithHttpInfo(Integer random, ModifyGroupAttrRequest modifyGroupAttrRequest) throws ApiException {
        okhttp3.Call localVarCall = modifyGroupAttrValidateBeforeCall(random, modifyGroupAttrRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 修改群自定义属性（https://cloud.tencent.com/document/product/269/67010） (asynchronously)
     * 
     * @param random  (required)
     * @param modifyGroupAttrRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyGroupAttrAsync(Integer random, ModifyGroupAttrRequest modifyGroupAttrRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyGroupAttrValidateBeforeCall(random, modifyGroupAttrRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modifyGroupBaseInfo
     * @param random  (required)
     * @param modifyGroupBaseInfoRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyGroupBaseInfoCall(Integer random, ModifyGroupBaseInfoRequest modifyGroupBaseInfoRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = modifyGroupBaseInfoRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/modify_group_base_info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call modifyGroupBaseInfoValidateBeforeCall(Integer random, ModifyGroupBaseInfoRequest modifyGroupBaseInfoRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling modifyGroupBaseInfo(Async)");
        }
        

        okhttp3.Call localVarCall = modifyGroupBaseInfoCall(random, modifyGroupBaseInfoRequest, _callback);
        return localVarCall;

    }

    /**
     * 修改群基础资料（https://cloud.tencent.com/document/product/269/1620）
     * 
     * @param random  (required)
     * @param modifyGroupBaseInfoRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse modifyGroupBaseInfo(Integer random, ModifyGroupBaseInfoRequest modifyGroupBaseInfoRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = modifyGroupBaseInfoWithHttpInfo(random, modifyGroupBaseInfoRequest);
        return localVarResp.getData();
    }

    /**
     * 修改群基础资料（https://cloud.tencent.com/document/product/269/1620）
     * 
     * @param random  (required)
     * @param modifyGroupBaseInfoRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> modifyGroupBaseInfoWithHttpInfo(Integer random, ModifyGroupBaseInfoRequest modifyGroupBaseInfoRequest) throws ApiException {
        okhttp3.Call localVarCall = modifyGroupBaseInfoValidateBeforeCall(random, modifyGroupBaseInfoRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 修改群基础资料（https://cloud.tencent.com/document/product/269/1620） (asynchronously)
     * 
     * @param random  (required)
     * @param modifyGroupBaseInfoRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyGroupBaseInfoAsync(Integer random, ModifyGroupBaseInfoRequest modifyGroupBaseInfoRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyGroupBaseInfoValidateBeforeCall(random, modifyGroupBaseInfoRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modifyGroupMemberInfo
     * @param random  (required)
     * @param modifyGroupMemberInfoRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyGroupMemberInfoCall(Integer random, ModifyGroupMemberInfoRequest modifyGroupMemberInfoRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = modifyGroupMemberInfoRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/modify_group_member_info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call modifyGroupMemberInfoValidateBeforeCall(Integer random, ModifyGroupMemberInfoRequest modifyGroupMemberInfoRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling modifyGroupMemberInfo(Async)");
        }
        

        okhttp3.Call localVarCall = modifyGroupMemberInfoCall(random, modifyGroupMemberInfoRequest, _callback);
        return localVarCall;

    }

    /**
     * 修改群成员资料(https://cloud.tencent.com/document/product/269/1623)
     * 
     * @param random  (required)
     * @param modifyGroupMemberInfoRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse modifyGroupMemberInfo(Integer random, ModifyGroupMemberInfoRequest modifyGroupMemberInfoRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = modifyGroupMemberInfoWithHttpInfo(random, modifyGroupMemberInfoRequest);
        return localVarResp.getData();
    }

    /**
     * 修改群成员资料(https://cloud.tencent.com/document/product/269/1623)
     * 
     * @param random  (required)
     * @param modifyGroupMemberInfoRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> modifyGroupMemberInfoWithHttpInfo(Integer random, ModifyGroupMemberInfoRequest modifyGroupMemberInfoRequest) throws ApiException {
        okhttp3.Call localVarCall = modifyGroupMemberInfoValidateBeforeCall(random, modifyGroupMemberInfoRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 修改群成员资料(https://cloud.tencent.com/document/product/269/1623) (asynchronously)
     * 
     * @param random  (required)
     * @param modifyGroupMemberInfoRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyGroupMemberInfoAsync(Integer random, ModifyGroupMemberInfoRequest modifyGroupMemberInfoRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyGroupMemberInfoValidateBeforeCall(random, modifyGroupMemberInfoRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modifyGroupMsg
     * @param random  (required)
     * @param modifyGroupMsgRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyGroupMsgCall(Integer random, ModifyGroupMsgRequest modifyGroupMsgRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = modifyGroupMsgRequest;

        // create path and map variables
        String localVarPath = "/v4/openim/modify_group_msg";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call modifyGroupMsgValidateBeforeCall(Integer random, ModifyGroupMsgRequest modifyGroupMsgRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling modifyGroupMsg(Async)");
        }
        

        okhttp3.Call localVarCall = modifyGroupMsgCall(random, modifyGroupMsgRequest, _callback);
        return localVarCall;

    }

    /**
     * 修改群聊历史消息（https://cloud.tencent.com/document/product/269/74741）
     * 
     * @param random  (required)
     * @param modifyGroupMsgRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse modifyGroupMsg(Integer random, ModifyGroupMsgRequest modifyGroupMsgRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = modifyGroupMsgWithHttpInfo(random, modifyGroupMsgRequest);
        return localVarResp.getData();
    }

    /**
     * 修改群聊历史消息（https://cloud.tencent.com/document/product/269/74741）
     * 
     * @param random  (required)
     * @param modifyGroupMsgRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> modifyGroupMsgWithHttpInfo(Integer random, ModifyGroupMsgRequest modifyGroupMsgRequest) throws ApiException {
        okhttp3.Call localVarCall = modifyGroupMsgValidateBeforeCall(random, modifyGroupMsgRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 修改群聊历史消息（https://cloud.tencent.com/document/product/269/74741） (asynchronously)
     * 
     * @param random  (required)
     * @param modifyGroupMsgRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyGroupMsgAsync(Integer random, ModifyGroupMsgRequest modifyGroupMsgRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyGroupMsgValidateBeforeCall(random, modifyGroupMsgRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendGroupMsg
     * @param random  (required)
     * @param sendGroupMsgRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendGroupMsgCall(Integer random, SendGroupMsgRequest sendGroupMsgRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = sendGroupMsgRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/send_group_msg";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendGroupMsgValidateBeforeCall(Integer random, SendGroupMsgRequest sendGroupMsgRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling sendGroupMsg(Async)");
        }
        

        okhttp3.Call localVarCall = sendGroupMsgCall(random, sendGroupMsgRequest, _callback);
        return localVarCall;

    }

    /**
     * 在群组中发送普通消息（https://cloud.tencent.com/document/product/269/1629）
     * 
     * @param random  (required)
     * @param sendGroupMsgRequest  (optional)
     * @return SendGroupMsgResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public SendGroupMsgResponse sendGroupMsg(Integer random, SendGroupMsgRequest sendGroupMsgRequest) throws ApiException {
        ApiResponse<SendGroupMsgResponse> localVarResp = sendGroupMsgWithHttpInfo(random, sendGroupMsgRequest);
        return localVarResp.getData();
    }

    /**
     * 在群组中发送普通消息（https://cloud.tencent.com/document/product/269/1629）
     * 
     * @param random  (required)
     * @param sendGroupMsgRequest  (optional)
     * @return ApiResponse&lt;SendGroupMsgResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SendGroupMsgResponse> sendGroupMsgWithHttpInfo(Integer random, SendGroupMsgRequest sendGroupMsgRequest) throws ApiException {
        okhttp3.Call localVarCall = sendGroupMsgValidateBeforeCall(random, sendGroupMsgRequest, null);
        Type localVarReturnType = new TypeToken<SendGroupMsgResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 在群组中发送普通消息（https://cloud.tencent.com/document/product/269/1629） (asynchronously)
     * 
     * @param random  (required)
     * @param sendGroupMsgRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendGroupMsgAsync(Integer random, SendGroupMsgRequest sendGroupMsgRequest, final ApiCallback<SendGroupMsgResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendGroupMsgValidateBeforeCall(random, sendGroupMsgRequest, _callback);
        Type localVarReturnType = new TypeToken<SendGroupMsgResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendGroupSystemNotification
     * @param random  (required)
     * @param sendGroupSystemNotificationRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendGroupSystemNotificationCall(Integer random, SendGroupSystemNotificationRequest sendGroupSystemNotificationRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = sendGroupSystemNotificationRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/send_group_system_notification";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendGroupSystemNotificationValidateBeforeCall(Integer random, SendGroupSystemNotificationRequest sendGroupSystemNotificationRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling sendGroupSystemNotification(Async)");
        }
        

        okhttp3.Call localVarCall = sendGroupSystemNotificationCall(random, sendGroupSystemNotificationRequest, _callback);
        return localVarCall;

    }

    /**
     * 在群组中发送系统通知（https://cloud.tencent.com/document/product/269/1630）
     * 
     * @param random  (required)
     * @param sendGroupSystemNotificationRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse sendGroupSystemNotification(Integer random, SendGroupSystemNotificationRequest sendGroupSystemNotificationRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = sendGroupSystemNotificationWithHttpInfo(random, sendGroupSystemNotificationRequest);
        return localVarResp.getData();
    }

    /**
     * 在群组中发送系统通知（https://cloud.tencent.com/document/product/269/1630）
     * 
     * @param random  (required)
     * @param sendGroupSystemNotificationRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> sendGroupSystemNotificationWithHttpInfo(Integer random, SendGroupSystemNotificationRequest sendGroupSystemNotificationRequest) throws ApiException {
        okhttp3.Call localVarCall = sendGroupSystemNotificationValidateBeforeCall(random, sendGroupSystemNotificationRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 在群组中发送系统通知（https://cloud.tencent.com/document/product/269/1630） (asynchronously)
     * 
     * @param random  (required)
     * @param sendGroupSystemNotificationRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendGroupSystemNotificationAsync(Integer random, SendGroupSystemNotificationRequest sendGroupSystemNotificationRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendGroupSystemNotificationValidateBeforeCall(random, sendGroupSystemNotificationRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setGroupAttr
     * @param random  (required)
     * @param setGroupAttrRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setGroupAttrCall(Integer random, SetGroupAttrRequest setGroupAttrRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = setGroupAttrRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/set_group_attr";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setGroupAttrValidateBeforeCall(Integer random, SetGroupAttrRequest setGroupAttrRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling setGroupAttr(Async)");
        }
        

        okhttp3.Call localVarCall = setGroupAttrCall(random, setGroupAttrRequest, _callback);
        return localVarCall;

    }

    /**
     * 重置群自定义属性（https://cloud.tencent.com/document/product/269/67011）
     * 
     * @param random  (required)
     * @param setGroupAttrRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse setGroupAttr(Integer random, SetGroupAttrRequest setGroupAttrRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = setGroupAttrWithHttpInfo(random, setGroupAttrRequest);
        return localVarResp.getData();
    }

    /**
     * 重置群自定义属性（https://cloud.tencent.com/document/product/269/67011）
     * 
     * @param random  (required)
     * @param setGroupAttrRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> setGroupAttrWithHttpInfo(Integer random, SetGroupAttrRequest setGroupAttrRequest) throws ApiException {
        okhttp3.Call localVarCall = setGroupAttrValidateBeforeCall(random, setGroupAttrRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 重置群自定义属性（https://cloud.tencent.com/document/product/269/67011） (asynchronously)
     * 
     * @param random  (required)
     * @param setGroupAttrRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setGroupAttrAsync(Integer random, SetGroupAttrRequest setGroupAttrRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = setGroupAttrValidateBeforeCall(random, setGroupAttrRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setUnreadMsgNum
     * @param random  (required)
     * @param setUnreadMsgNumRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setUnreadMsgNumCall(Integer random, SetUnreadMsgNumRequest setUnreadMsgNumRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = setUnreadMsgNumRequest;

        // create path and map variables
        String localVarPath = "/v4/group_open_http_svc/set_unread_msg_num";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        localVarQueryParams = localVarApiClient.buildLocalQueryParams(random);
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setUnreadMsgNumValidateBeforeCall(Integer random, SetUnreadMsgNumRequest setUnreadMsgNumRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling setUnreadMsgNum(Async)");
        }
        

        okhttp3.Call localVarCall = setUnreadMsgNumCall(random, setUnreadMsgNumRequest, _callback);
        return localVarCall;

    }

    /**
     * 设置成员未读消息计数（https://cloud.tencent.com/document/product/269/1637）
     * 
     * @param random  (required)
     * @param setUnreadMsgNumRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse setUnreadMsgNum(Integer random, SetUnreadMsgNumRequest setUnreadMsgNumRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = setUnreadMsgNumWithHttpInfo(random, setUnreadMsgNumRequest);
        return localVarResp.getData();
    }

    /**
     * 设置成员未读消息计数（https://cloud.tencent.com/document/product/269/1637）
     * 
     * @param random  (required)
     * @param setUnreadMsgNumRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> setUnreadMsgNumWithHttpInfo(Integer random, SetUnreadMsgNumRequest setUnreadMsgNumRequest) throws ApiException {
        okhttp3.Call localVarCall = setUnreadMsgNumValidateBeforeCall(random, setUnreadMsgNumRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 设置成员未读消息计数（https://cloud.tencent.com/document/product/269/1637） (asynchronously)
     * 
     * @param random  (required)
     * @param setUnreadMsgNumRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setUnreadMsgNumAsync(Integer random, SetUnreadMsgNumRequest setUnreadMsgNumRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = setUnreadMsgNumValidateBeforeCall(random, setUnreadMsgNumRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
