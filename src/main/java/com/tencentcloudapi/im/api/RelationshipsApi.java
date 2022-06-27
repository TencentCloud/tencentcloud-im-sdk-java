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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class RelationshipsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RelationshipsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RelationshipsApi(ApiClient apiClient) {
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
     * Build call for blackListAdd
     * @param random  (required)
     * @param blackListAddRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call blackListAddCall(Integer random, BlackListAddRequest blackListAddRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = blackListAddRequest;

        // create path and map variables
        String localVarPath = "/v4/sns/black_list_add";

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
    private okhttp3.Call blackListAddValidateBeforeCall(Integer random, BlackListAddRequest blackListAddRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling blackListAdd(Async)");
        }
        

        okhttp3.Call localVarCall = blackListAddCall(random, blackListAddRequest, _callback);
        return localVarCall;

    }

    /**
     * 添加黑名单（https://cloud.tencent.com/document/product/269/3718）
     * 
     * @param random  (required)
     * @param blackListAddRequest  (optional)
     * @return BlackListAddResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public BlackListAddResponse blackListAdd(Integer random, BlackListAddRequest blackListAddRequest) throws ApiException {
        ApiResponse<BlackListAddResponse> localVarResp = blackListAddWithHttpInfo(random, blackListAddRequest);
        return localVarResp.getData();
    }

    /**
     * 添加黑名单（https://cloud.tencent.com/document/product/269/3718）
     * 
     * @param random  (required)
     * @param blackListAddRequest  (optional)
     * @return ApiResponse&lt;BlackListAddResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BlackListAddResponse> blackListAddWithHttpInfo(Integer random, BlackListAddRequest blackListAddRequest) throws ApiException {
        okhttp3.Call localVarCall = blackListAddValidateBeforeCall(random, blackListAddRequest, null);
        Type localVarReturnType = new TypeToken<BlackListAddResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 添加黑名单（https://cloud.tencent.com/document/product/269/3718） (asynchronously)
     * 
     * @param random  (required)
     * @param blackListAddRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call blackListAddAsync(Integer random, BlackListAddRequest blackListAddRequest, final ApiCallback<BlackListAddResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = blackListAddValidateBeforeCall(random, blackListAddRequest, _callback);
        Type localVarReturnType = new TypeToken<BlackListAddResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for blackListCheck
     * @param random  (required)
     * @param blackListCheckRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call blackListCheckCall(Integer random, BlackListCheckRequest blackListCheckRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = blackListCheckRequest;

        // create path and map variables
        String localVarPath = "/v4/sns/black_list_check";

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
    private okhttp3.Call blackListCheckValidateBeforeCall(Integer random, BlackListCheckRequest blackListCheckRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling blackListCheck(Async)");
        }
        

        okhttp3.Call localVarCall = blackListCheckCall(random, blackListCheckRequest, _callback);
        return localVarCall;

    }

    /**
     * 校验黑名单（https://cloud.tencent.com/document/product/269/3725）
     * 
     * @param random  (required)
     * @param blackListCheckRequest  (optional)
     * @return BlackListCheckResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public BlackListCheckResponse blackListCheck(Integer random, BlackListCheckRequest blackListCheckRequest) throws ApiException {
        ApiResponse<BlackListCheckResponse> localVarResp = blackListCheckWithHttpInfo(random, blackListCheckRequest);
        return localVarResp.getData();
    }

    /**
     * 校验黑名单（https://cloud.tencent.com/document/product/269/3725）
     * 
     * @param random  (required)
     * @param blackListCheckRequest  (optional)
     * @return ApiResponse&lt;BlackListCheckResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BlackListCheckResponse> blackListCheckWithHttpInfo(Integer random, BlackListCheckRequest blackListCheckRequest) throws ApiException {
        okhttp3.Call localVarCall = blackListCheckValidateBeforeCall(random, blackListCheckRequest, null);
        Type localVarReturnType = new TypeToken<BlackListCheckResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 校验黑名单（https://cloud.tencent.com/document/product/269/3725） (asynchronously)
     * 
     * @param random  (required)
     * @param blackListCheckRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call blackListCheckAsync(Integer random, BlackListCheckRequest blackListCheckRequest, final ApiCallback<BlackListCheckResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = blackListCheckValidateBeforeCall(random, blackListCheckRequest, _callback);
        Type localVarReturnType = new TypeToken<BlackListCheckResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for blackListDelete
     * @param random  (required)
     * @param blackListDeleteRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call blackListDeleteCall(Integer random, BlackListDeleteRequest blackListDeleteRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = blackListDeleteRequest;

        // create path and map variables
        String localVarPath = "/v4/sns/black_list_delete";

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
    private okhttp3.Call blackListDeleteValidateBeforeCall(Integer random, BlackListDeleteRequest blackListDeleteRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling blackListDelete(Async)");
        }
        

        okhttp3.Call localVarCall = blackListDeleteCall(random, blackListDeleteRequest, _callback);
        return localVarCall;

    }

    /**
     * 删除黑名单（https://cloud.tencent.com/document/product/269/3719）
     * 
     * @param random  (required)
     * @param blackListDeleteRequest  (optional)
     * @return BlackListDeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public BlackListDeleteResponse blackListDelete(Integer random, BlackListDeleteRequest blackListDeleteRequest) throws ApiException {
        ApiResponse<BlackListDeleteResponse> localVarResp = blackListDeleteWithHttpInfo(random, blackListDeleteRequest);
        return localVarResp.getData();
    }

    /**
     * 删除黑名单（https://cloud.tencent.com/document/product/269/3719）
     * 
     * @param random  (required)
     * @param blackListDeleteRequest  (optional)
     * @return ApiResponse&lt;BlackListDeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BlackListDeleteResponse> blackListDeleteWithHttpInfo(Integer random, BlackListDeleteRequest blackListDeleteRequest) throws ApiException {
        okhttp3.Call localVarCall = blackListDeleteValidateBeforeCall(random, blackListDeleteRequest, null);
        Type localVarReturnType = new TypeToken<BlackListDeleteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 删除黑名单（https://cloud.tencent.com/document/product/269/3719） (asynchronously)
     * 
     * @param random  (required)
     * @param blackListDeleteRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call blackListDeleteAsync(Integer random, BlackListDeleteRequest blackListDeleteRequest, final ApiCallback<BlackListDeleteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = blackListDeleteValidateBeforeCall(random, blackListDeleteRequest, _callback);
        Type localVarReturnType = new TypeToken<BlackListDeleteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for blackListGet
     * @param random  (required)
     * @param blackListGetRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call blackListGetCall(Integer random, BlackListGetRequest blackListGetRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = blackListGetRequest;

        // create path and map variables
        String localVarPath = "/v4/sns/black_list_get";

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
    private okhttp3.Call blackListGetValidateBeforeCall(Integer random, BlackListGetRequest blackListGetRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling blackListGet(Async)");
        }
        

        okhttp3.Call localVarCall = blackListGetCall(random, blackListGetRequest, _callback);
        return localVarCall;

    }

    /**
     * 拉取黑名单（https://cloud.tencent.com/document/product/269/3722）
     * 
     * @param random  (required)
     * @param blackListGetRequest  (optional)
     * @return BlackListGetResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public BlackListGetResponse blackListGet(Integer random, BlackListGetRequest blackListGetRequest) throws ApiException {
        ApiResponse<BlackListGetResponse> localVarResp = blackListGetWithHttpInfo(random, blackListGetRequest);
        return localVarResp.getData();
    }

    /**
     * 拉取黑名单（https://cloud.tencent.com/document/product/269/3722）
     * 
     * @param random  (required)
     * @param blackListGetRequest  (optional)
     * @return ApiResponse&lt;BlackListGetResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BlackListGetResponse> blackListGetWithHttpInfo(Integer random, BlackListGetRequest blackListGetRequest) throws ApiException {
        okhttp3.Call localVarCall = blackListGetValidateBeforeCall(random, blackListGetRequest, null);
        Type localVarReturnType = new TypeToken<BlackListGetResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 拉取黑名单（https://cloud.tencent.com/document/product/269/3722） (asynchronously)
     * 
     * @param random  (required)
     * @param blackListGetRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call blackListGetAsync(Integer random, BlackListGetRequest blackListGetRequest, final ApiCallback<BlackListGetResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = blackListGetValidateBeforeCall(random, blackListGetRequest, _callback);
        Type localVarReturnType = new TypeToken<BlackListGetResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for friendAdd
     * @param random  (required)
     * @param friendAddRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendAddCall(Integer random, FriendAddRequest friendAddRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = friendAddRequest;

        // create path and map variables
        String localVarPath = "/v4/sns/friend_add";

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
    private okhttp3.Call friendAddValidateBeforeCall(Integer random, FriendAddRequest friendAddRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling friendAdd(Async)");
        }
        

        okhttp3.Call localVarCall = friendAddCall(random, friendAddRequest, _callback);
        return localVarCall;

    }

    /**
     * 添加好友（https://cloud.tencent.com/document/product/269/1643）
     * 
     * @param random  (required)
     * @param friendAddRequest  (optional)
     * @return FriendAddResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public FriendAddResponse friendAdd(Integer random, FriendAddRequest friendAddRequest) throws ApiException {
        ApiResponse<FriendAddResponse> localVarResp = friendAddWithHttpInfo(random, friendAddRequest);
        return localVarResp.getData();
    }

    /**
     * 添加好友（https://cloud.tencent.com/document/product/269/1643）
     * 
     * @param random  (required)
     * @param friendAddRequest  (optional)
     * @return ApiResponse&lt;FriendAddResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FriendAddResponse> friendAddWithHttpInfo(Integer random, FriendAddRequest friendAddRequest) throws ApiException {
        okhttp3.Call localVarCall = friendAddValidateBeforeCall(random, friendAddRequest, null);
        Type localVarReturnType = new TypeToken<FriendAddResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 添加好友（https://cloud.tencent.com/document/product/269/1643） (asynchronously)
     * 
     * @param random  (required)
     * @param friendAddRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendAddAsync(Integer random, FriendAddRequest friendAddRequest, final ApiCallback<FriendAddResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = friendAddValidateBeforeCall(random, friendAddRequest, _callback);
        Type localVarReturnType = new TypeToken<FriendAddResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for friendCheck
     * @param random  (required)
     * @param friendCheckRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendCheckCall(Integer random, FriendCheckRequest friendCheckRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = friendCheckRequest;

        // create path and map variables
        String localVarPath = "/v4/sns/friend_check";

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
    private okhttp3.Call friendCheckValidateBeforeCall(Integer random, FriendCheckRequest friendCheckRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling friendCheck(Async)");
        }
        

        okhttp3.Call localVarCall = friendCheckCall(random, friendCheckRequest, _callback);
        return localVarCall;

    }

    /**
     * 校验好友（https://cloud.tencent.com/document/product/269/1646）
     * 
     * @param random  (required)
     * @param friendCheckRequest  (optional)
     * @return FriendCheckResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public FriendCheckResponse friendCheck(Integer random, FriendCheckRequest friendCheckRequest) throws ApiException {
        ApiResponse<FriendCheckResponse> localVarResp = friendCheckWithHttpInfo(random, friendCheckRequest);
        return localVarResp.getData();
    }

    /**
     * 校验好友（https://cloud.tencent.com/document/product/269/1646）
     * 
     * @param random  (required)
     * @param friendCheckRequest  (optional)
     * @return ApiResponse&lt;FriendCheckResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FriendCheckResponse> friendCheckWithHttpInfo(Integer random, FriendCheckRequest friendCheckRequest) throws ApiException {
        okhttp3.Call localVarCall = friendCheckValidateBeforeCall(random, friendCheckRequest, null);
        Type localVarReturnType = new TypeToken<FriendCheckResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 校验好友（https://cloud.tencent.com/document/product/269/1646） (asynchronously)
     * 
     * @param random  (required)
     * @param friendCheckRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendCheckAsync(Integer random, FriendCheckRequest friendCheckRequest, final ApiCallback<FriendCheckResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = friendCheckValidateBeforeCall(random, friendCheckRequest, _callback);
        Type localVarReturnType = new TypeToken<FriendCheckResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for friendDelete
     * @param random  (required)
     * @param friendDeleteRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendDeleteCall(Integer random, FriendDeleteRequest friendDeleteRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = friendDeleteRequest;

        // create path and map variables
        String localVarPath = "/v4/sns/friend_delete";

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
    private okhttp3.Call friendDeleteValidateBeforeCall(Integer random, FriendDeleteRequest friendDeleteRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling friendDelete(Async)");
        }
        

        okhttp3.Call localVarCall = friendDeleteCall(random, friendDeleteRequest, _callback);
        return localVarCall;

    }

    /**
     * 删除好友（https://cloud.tencent.com/document/product/269/1644）
     * 
     * @param random  (required)
     * @param friendDeleteRequest  (optional)
     * @return FriendDeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public FriendDeleteResponse friendDelete(Integer random, FriendDeleteRequest friendDeleteRequest) throws ApiException {
        ApiResponse<FriendDeleteResponse> localVarResp = friendDeleteWithHttpInfo(random, friendDeleteRequest);
        return localVarResp.getData();
    }

    /**
     * 删除好友（https://cloud.tencent.com/document/product/269/1644）
     * 
     * @param random  (required)
     * @param friendDeleteRequest  (optional)
     * @return ApiResponse&lt;FriendDeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FriendDeleteResponse> friendDeleteWithHttpInfo(Integer random, FriendDeleteRequest friendDeleteRequest) throws ApiException {
        okhttp3.Call localVarCall = friendDeleteValidateBeforeCall(random, friendDeleteRequest, null);
        Type localVarReturnType = new TypeToken<FriendDeleteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 删除好友（https://cloud.tencent.com/document/product/269/1644） (asynchronously)
     * 
     * @param random  (required)
     * @param friendDeleteRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendDeleteAsync(Integer random, FriendDeleteRequest friendDeleteRequest, final ApiCallback<FriendDeleteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = friendDeleteValidateBeforeCall(random, friendDeleteRequest, _callback);
        Type localVarReturnType = new TypeToken<FriendDeleteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for friendDeleteAll
     * @param random  (required)
     * @param friendDeleteAllRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendDeleteAllCall(Integer random, FriendDeleteAllRequest friendDeleteAllRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = friendDeleteAllRequest;

        // create path and map variables
        String localVarPath = "/v4/sns/friend_delete_all";

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
    private okhttp3.Call friendDeleteAllValidateBeforeCall(Integer random, FriendDeleteAllRequest friendDeleteAllRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling friendDeleteAll(Async)");
        }
        

        okhttp3.Call localVarCall = friendDeleteAllCall(random, friendDeleteAllRequest, _callback);
        return localVarCall;

    }

    /**
     * 删除所有好友（https://cloud.tencent.com/document/product/269/1645）
     * 
     * @param random  (required)
     * @param friendDeleteAllRequest  (optional)
     * @return FriendDeleteAllResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public FriendDeleteAllResponse friendDeleteAll(Integer random, FriendDeleteAllRequest friendDeleteAllRequest) throws ApiException {
        ApiResponse<FriendDeleteAllResponse> localVarResp = friendDeleteAllWithHttpInfo(random, friendDeleteAllRequest);
        return localVarResp.getData();
    }

    /**
     * 删除所有好友（https://cloud.tencent.com/document/product/269/1645）
     * 
     * @param random  (required)
     * @param friendDeleteAllRequest  (optional)
     * @return ApiResponse&lt;FriendDeleteAllResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FriendDeleteAllResponse> friendDeleteAllWithHttpInfo(Integer random, FriendDeleteAllRequest friendDeleteAllRequest) throws ApiException {
        okhttp3.Call localVarCall = friendDeleteAllValidateBeforeCall(random, friendDeleteAllRequest, null);
        Type localVarReturnType = new TypeToken<FriendDeleteAllResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 删除所有好友（https://cloud.tencent.com/document/product/269/1645） (asynchronously)
     * 
     * @param random  (required)
     * @param friendDeleteAllRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendDeleteAllAsync(Integer random, FriendDeleteAllRequest friendDeleteAllRequest, final ApiCallback<FriendDeleteAllResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = friendDeleteAllValidateBeforeCall(random, friendDeleteAllRequest, _callback);
        Type localVarReturnType = new TypeToken<FriendDeleteAllResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for friendGet
     * @param random  (required)
     * @param friendGetRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendGetCall(Integer random, FriendGetRequest friendGetRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = friendGetRequest;

        // create path and map variables
        String localVarPath = "/v4/sns/friend_get";

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
    private okhttp3.Call friendGetValidateBeforeCall(Integer random, FriendGetRequest friendGetRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling friendGet(Async)");
        }
        

        okhttp3.Call localVarCall = friendGetCall(random, friendGetRequest, _callback);
        return localVarCall;

    }

    /**
     * 拉取好友（https://cloud.tencent.com/document/product/269/1647）
     * 
     * @param random  (required)
     * @param friendGetRequest  (optional)
     * @return FriendGetResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public FriendGetResponse friendGet(Integer random, FriendGetRequest friendGetRequest) throws ApiException {
        ApiResponse<FriendGetResponse> localVarResp = friendGetWithHttpInfo(random, friendGetRequest);
        return localVarResp.getData();
    }

    /**
     * 拉取好友（https://cloud.tencent.com/document/product/269/1647）
     * 
     * @param random  (required)
     * @param friendGetRequest  (optional)
     * @return ApiResponse&lt;FriendGetResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FriendGetResponse> friendGetWithHttpInfo(Integer random, FriendGetRequest friendGetRequest) throws ApiException {
        okhttp3.Call localVarCall = friendGetValidateBeforeCall(random, friendGetRequest, null);
        Type localVarReturnType = new TypeToken<FriendGetResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 拉取好友（https://cloud.tencent.com/document/product/269/1647） (asynchronously)
     * 
     * @param random  (required)
     * @param friendGetRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendGetAsync(Integer random, FriendGetRequest friendGetRequest, final ApiCallback<FriendGetResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = friendGetValidateBeforeCall(random, friendGetRequest, _callback);
        Type localVarReturnType = new TypeToken<FriendGetResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for friendGetList
     * @param random  (required)
     * @param friendGetListRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendGetListCall(Integer random, FriendGetListRequest friendGetListRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = friendGetListRequest;

        // create path and map variables
        String localVarPath = "/v4/sns/friend_get_list";

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
    private okhttp3.Call friendGetListValidateBeforeCall(Integer random, FriendGetListRequest friendGetListRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling friendGetList(Async)");
        }
        

        okhttp3.Call localVarCall = friendGetListCall(random, friendGetListRequest, _callback);
        return localVarCall;

    }

    /**
     * 拉取指定好友（https://cloud.tencent.com/document/product/269/8609）
     * 
     * @param random  (required)
     * @param friendGetListRequest  (optional)
     * @return FriendGetListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public FriendGetListResponse friendGetList(Integer random, FriendGetListRequest friendGetListRequest) throws ApiException {
        ApiResponse<FriendGetListResponse> localVarResp = friendGetListWithHttpInfo(random, friendGetListRequest);
        return localVarResp.getData();
    }

    /**
     * 拉取指定好友（https://cloud.tencent.com/document/product/269/8609）
     * 
     * @param random  (required)
     * @param friendGetListRequest  (optional)
     * @return ApiResponse&lt;FriendGetListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FriendGetListResponse> friendGetListWithHttpInfo(Integer random, FriendGetListRequest friendGetListRequest) throws ApiException {
        okhttp3.Call localVarCall = friendGetListValidateBeforeCall(random, friendGetListRequest, null);
        Type localVarReturnType = new TypeToken<FriendGetListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 拉取指定好友（https://cloud.tencent.com/document/product/269/8609） (asynchronously)
     * 
     * @param random  (required)
     * @param friendGetListRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendGetListAsync(Integer random, FriendGetListRequest friendGetListRequest, final ApiCallback<FriendGetListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = friendGetListValidateBeforeCall(random, friendGetListRequest, _callback);
        Type localVarReturnType = new TypeToken<FriendGetListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for friendImport
     * @param random  (required)
     * @param friendImportRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendImportCall(Integer random, FriendImportRequest friendImportRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = friendImportRequest;

        // create path and map variables
        String localVarPath = "/v4/sns/friend_import";

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
    private okhttp3.Call friendImportValidateBeforeCall(Integer random, FriendImportRequest friendImportRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling friendImport(Async)");
        }
        

        okhttp3.Call localVarCall = friendImportCall(random, friendImportRequest, _callback);
        return localVarCall;

    }

    /**
     * 导入好友（https://cloud.tencent.com/document/product/269/8301）
     * 
     * @param random  (required)
     * @param friendImportRequest  (optional)
     * @return FriendImportResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public FriendImportResponse friendImport(Integer random, FriendImportRequest friendImportRequest) throws ApiException {
        ApiResponse<FriendImportResponse> localVarResp = friendImportWithHttpInfo(random, friendImportRequest);
        return localVarResp.getData();
    }

    /**
     * 导入好友（https://cloud.tencent.com/document/product/269/8301）
     * 
     * @param random  (required)
     * @param friendImportRequest  (optional)
     * @return ApiResponse&lt;FriendImportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FriendImportResponse> friendImportWithHttpInfo(Integer random, FriendImportRequest friendImportRequest) throws ApiException {
        okhttp3.Call localVarCall = friendImportValidateBeforeCall(random, friendImportRequest, null);
        Type localVarReturnType = new TypeToken<FriendImportResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 导入好友（https://cloud.tencent.com/document/product/269/8301） (asynchronously)
     * 
     * @param random  (required)
     * @param friendImportRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendImportAsync(Integer random, FriendImportRequest friendImportRequest, final ApiCallback<FriendImportResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = friendImportValidateBeforeCall(random, friendImportRequest, _callback);
        Type localVarReturnType = new TypeToken<FriendImportResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for friendUpdate
     * @param random  (required)
     * @param friendUpdateRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendUpdateCall(Integer random, FriendUpdateRequest friendUpdateRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = friendUpdateRequest;

        // create path and map variables
        String localVarPath = "/v4/sns/friend_update";

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
    private okhttp3.Call friendUpdateValidateBeforeCall(Integer random, FriendUpdateRequest friendUpdateRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling friendUpdate(Async)");
        }
        

        okhttp3.Call localVarCall = friendUpdateCall(random, friendUpdateRequest, _callback);
        return localVarCall;

    }

    /**
     * 更新好友（https://cloud.tencent.com/document/product/269/12525）
     * 
     * @param random  (required)
     * @param friendUpdateRequest  (optional)
     * @return FriendUpdateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public FriendUpdateResponse friendUpdate(Integer random, FriendUpdateRequest friendUpdateRequest) throws ApiException {
        ApiResponse<FriendUpdateResponse> localVarResp = friendUpdateWithHttpInfo(random, friendUpdateRequest);
        return localVarResp.getData();
    }

    /**
     * 更新好友（https://cloud.tencent.com/document/product/269/12525）
     * 
     * @param random  (required)
     * @param friendUpdateRequest  (optional)
     * @return ApiResponse&lt;FriendUpdateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FriendUpdateResponse> friendUpdateWithHttpInfo(Integer random, FriendUpdateRequest friendUpdateRequest) throws ApiException {
        okhttp3.Call localVarCall = friendUpdateValidateBeforeCall(random, friendUpdateRequest, null);
        Type localVarReturnType = new TypeToken<FriendUpdateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 更新好友（https://cloud.tencent.com/document/product/269/12525） (asynchronously)
     * 
     * @param random  (required)
     * @param friendUpdateRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendUpdateAsync(Integer random, FriendUpdateRequest friendUpdateRequest, final ApiCallback<FriendUpdateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = friendUpdateValidateBeforeCall(random, friendUpdateRequest, _callback);
        Type localVarReturnType = new TypeToken<FriendUpdateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for groupAdd
     * @param random  (required)
     * @param groupAddRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call groupAddCall(Integer random, GroupAddRequest groupAddRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = groupAddRequest;

        // create path and map variables
        String localVarPath = "/v4/sns/group_add";

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
    private okhttp3.Call groupAddValidateBeforeCall(Integer random, GroupAddRequest groupAddRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling groupAdd(Async)");
        }
        

        okhttp3.Call localVarCall = groupAddCall(random, groupAddRequest, _callback);
        return localVarCall;

    }

    /**
     * 添加分组（https://cloud.tencent.com/document/product/269/10107）
     * 
     * @param random  (required)
     * @param groupAddRequest  (optional)
     * @return GroupAddResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GroupAddResponse groupAdd(Integer random, GroupAddRequest groupAddRequest) throws ApiException {
        ApiResponse<GroupAddResponse> localVarResp = groupAddWithHttpInfo(random, groupAddRequest);
        return localVarResp.getData();
    }

    /**
     * 添加分组（https://cloud.tencent.com/document/product/269/10107）
     * 
     * @param random  (required)
     * @param groupAddRequest  (optional)
     * @return ApiResponse&lt;GroupAddResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GroupAddResponse> groupAddWithHttpInfo(Integer random, GroupAddRequest groupAddRequest) throws ApiException {
        okhttp3.Call localVarCall = groupAddValidateBeforeCall(random, groupAddRequest, null);
        Type localVarReturnType = new TypeToken<GroupAddResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 添加分组（https://cloud.tencent.com/document/product/269/10107） (asynchronously)
     * 
     * @param random  (required)
     * @param groupAddRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call groupAddAsync(Integer random, GroupAddRequest groupAddRequest, final ApiCallback<GroupAddResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = groupAddValidateBeforeCall(random, groupAddRequest, _callback);
        Type localVarReturnType = new TypeToken<GroupAddResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for groupDelete
     * @param random  (required)
     * @param groupDeleteRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call groupDeleteCall(Integer random, GroupDeleteRequest groupDeleteRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = groupDeleteRequest;

        // create path and map variables
        String localVarPath = "/v4/sns/group_delete";

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
    private okhttp3.Call groupDeleteValidateBeforeCall(Integer random, GroupDeleteRequest groupDeleteRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling groupDelete(Async)");
        }
        

        okhttp3.Call localVarCall = groupDeleteCall(random, groupDeleteRequest, _callback);
        return localVarCall;

    }

    /**
     * 删除分组（https://cloud.tencent.com/document/product/269/10108）
     * 
     * @param random  (required)
     * @param groupDeleteRequest  (optional)
     * @return GroupDeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GroupDeleteResponse groupDelete(Integer random, GroupDeleteRequest groupDeleteRequest) throws ApiException {
        ApiResponse<GroupDeleteResponse> localVarResp = groupDeleteWithHttpInfo(random, groupDeleteRequest);
        return localVarResp.getData();
    }

    /**
     * 删除分组（https://cloud.tencent.com/document/product/269/10108）
     * 
     * @param random  (required)
     * @param groupDeleteRequest  (optional)
     * @return ApiResponse&lt;GroupDeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GroupDeleteResponse> groupDeleteWithHttpInfo(Integer random, GroupDeleteRequest groupDeleteRequest) throws ApiException {
        okhttp3.Call localVarCall = groupDeleteValidateBeforeCall(random, groupDeleteRequest, null);
        Type localVarReturnType = new TypeToken<GroupDeleteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 删除分组（https://cloud.tencent.com/document/product/269/10108） (asynchronously)
     * 
     * @param random  (required)
     * @param groupDeleteRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call groupDeleteAsync(Integer random, GroupDeleteRequest groupDeleteRequest, final ApiCallback<GroupDeleteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = groupDeleteValidateBeforeCall(random, groupDeleteRequest, _callback);
        Type localVarReturnType = new TypeToken<GroupDeleteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for groupGet
     * @param random  (required)
     * @param groupGetRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call groupGetCall(Integer random, GroupGetRequest groupGetRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = groupGetRequest;

        // create path and map variables
        String localVarPath = "/v4/sns/group_get";

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
    private okhttp3.Call groupGetValidateBeforeCall(Integer random, GroupGetRequest groupGetRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling groupGet(Async)");
        }
        

        okhttp3.Call localVarCall = groupGetCall(random, groupGetRequest, _callback);
        return localVarCall;

    }

    /**
     * 拉取分组（https://cloud.tencent.com/document/product/269/54763）
     * 
     * @param random  (required)
     * @param groupGetRequest  (optional)
     * @return GroupGetResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GroupGetResponse groupGet(Integer random, GroupGetRequest groupGetRequest) throws ApiException {
        ApiResponse<GroupGetResponse> localVarResp = groupGetWithHttpInfo(random, groupGetRequest);
        return localVarResp.getData();
    }

    /**
     * 拉取分组（https://cloud.tencent.com/document/product/269/54763）
     * 
     * @param random  (required)
     * @param groupGetRequest  (optional)
     * @return ApiResponse&lt;GroupGetResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GroupGetResponse> groupGetWithHttpInfo(Integer random, GroupGetRequest groupGetRequest) throws ApiException {
        okhttp3.Call localVarCall = groupGetValidateBeforeCall(random, groupGetRequest, null);
        Type localVarReturnType = new TypeToken<GroupGetResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 拉取分组（https://cloud.tencent.com/document/product/269/54763） (asynchronously)
     * 
     * @param random  (required)
     * @param groupGetRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call groupGetAsync(Integer random, GroupGetRequest groupGetRequest, final ApiCallback<GroupGetResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = groupGetValidateBeforeCall(random, groupGetRequest, _callback);
        Type localVarReturnType = new TypeToken<GroupGetResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
