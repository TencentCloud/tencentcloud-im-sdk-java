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


import com.tencentcloudapi.im.model.BatchSendSingleChatMsgRequest;
import com.tencentcloudapi.im.model.BatchSendSingleChatMsgResponse;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumRequest;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponse;
import com.tencentcloudapi.im.model.GetRoamMsgRequest;
import com.tencentcloudapi.im.model.GetRoamMsgResponse;
import com.tencentcloudapi.im.model.ImportMsgRequest;
import com.tencentcloudapi.im.model.ModifyC2cMsgRequest;
import com.tencentcloudapi.im.model.MsgWithdrawRequest;
import com.tencentcloudapi.im.model.SendSingleChatMsgRequest;
import com.tencentcloudapi.im.model.SendSingleChatMsgResponse;
import com.tencentcloudapi.im.model.SetMsgReadRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SingleChatApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SingleChatApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SingleChatApi(ApiClient apiClient) {
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
     * Build call for adminGetroammsg
     * @param random  (required)
     * @param getRoamMsgRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call adminGetroammsgCall(Integer random, GetRoamMsgRequest getRoamMsgRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getRoamMsgRequest;

        // create path and map variables
        String localVarPath = "/v4/openim/admin_getroammsg";

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
    private okhttp3.Call adminGetroammsgValidateBeforeCall(Integer random, GetRoamMsgRequest getRoamMsgRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling adminGetroammsg(Async)");
        }
        

        okhttp3.Call localVarCall = adminGetroammsgCall(random, getRoamMsgRequest, _callback);
        return localVarCall;

    }

    /**
     * 查询单聊消息（https://cloud.tencent.com/document/product/269/42794）
     * 
     * @param random  (required)
     * @param getRoamMsgRequest  (optional)
     * @return GetRoamMsgResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetRoamMsgResponse adminGetroammsg(Integer random, GetRoamMsgRequest getRoamMsgRequest) throws ApiException {
        ApiResponse<GetRoamMsgResponse> localVarResp = adminGetroammsgWithHttpInfo(random, getRoamMsgRequest);
        return localVarResp.getData();
    }

    /**
     * 查询单聊消息（https://cloud.tencent.com/document/product/269/42794）
     * 
     * @param random  (required)
     * @param getRoamMsgRequest  (optional)
     * @return ApiResponse&lt;GetRoamMsgResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetRoamMsgResponse> adminGetroammsgWithHttpInfo(Integer random, GetRoamMsgRequest getRoamMsgRequest) throws ApiException {
        okhttp3.Call localVarCall = adminGetroammsgValidateBeforeCall(random, getRoamMsgRequest, null);
        Type localVarReturnType = new TypeToken<GetRoamMsgResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 查询单聊消息（https://cloud.tencent.com/document/product/269/42794） (asynchronously)
     * 
     * @param random  (required)
     * @param getRoamMsgRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call adminGetroammsgAsync(Integer random, GetRoamMsgRequest getRoamMsgRequest, final ApiCallback<GetRoamMsgResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = adminGetroammsgValidateBeforeCall(random, getRoamMsgRequest, _callback);
        Type localVarReturnType = new TypeToken<GetRoamMsgResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for adminMsgwithdraw
     * @param random  (required)
     * @param msgWithdrawRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call adminMsgwithdrawCall(Integer random, MsgWithdrawRequest msgWithdrawRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = msgWithdrawRequest;

        // create path and map variables
        String localVarPath = "/v4/openim/admin_msgwithdraw";

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
    private okhttp3.Call adminMsgwithdrawValidateBeforeCall(Integer random, MsgWithdrawRequest msgWithdrawRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling adminMsgwithdraw(Async)");
        }
        

        okhttp3.Call localVarCall = adminMsgwithdrawCall(random, msgWithdrawRequest, _callback);
        return localVarCall;

    }

    /**
     * 撤回单聊消息（https://cloud.tencent.com/document/product/269/38980）
     * 
     * @param random  (required)
     * @param msgWithdrawRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse adminMsgwithdraw(Integer random, MsgWithdrawRequest msgWithdrawRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = adminMsgwithdrawWithHttpInfo(random, msgWithdrawRequest);
        return localVarResp.getData();
    }

    /**
     * 撤回单聊消息（https://cloud.tencent.com/document/product/269/38980）
     * 
     * @param random  (required)
     * @param msgWithdrawRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> adminMsgwithdrawWithHttpInfo(Integer random, MsgWithdrawRequest msgWithdrawRequest) throws ApiException {
        okhttp3.Call localVarCall = adminMsgwithdrawValidateBeforeCall(random, msgWithdrawRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 撤回单聊消息（https://cloud.tencent.com/document/product/269/38980） (asynchronously)
     * 
     * @param random  (required)
     * @param msgWithdrawRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call adminMsgwithdrawAsync(Integer random, MsgWithdrawRequest msgWithdrawRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = adminMsgwithdrawValidateBeforeCall(random, msgWithdrawRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for adminSetMsgRead
     * @param random  (required)
     * @param setMsgReadRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call adminSetMsgReadCall(Integer random, SetMsgReadRequest setMsgReadRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = setMsgReadRequest;

        // create path and map variables
        String localVarPath = "/v4/openim/admin_set_msg_read";

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
    private okhttp3.Call adminSetMsgReadValidateBeforeCall(Integer random, SetMsgReadRequest setMsgReadRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling adminSetMsgRead(Async)");
        }
        

        okhttp3.Call localVarCall = adminSetMsgReadCall(random, setMsgReadRequest, _callback);
        return localVarCall;

    }

    /**
     * 设置单聊消息已读（https://cloud.tencent.com/document/product/269/50349）
     * 
     * @param random  (required)
     * @param setMsgReadRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse adminSetMsgRead(Integer random, SetMsgReadRequest setMsgReadRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = adminSetMsgReadWithHttpInfo(random, setMsgReadRequest);
        return localVarResp.getData();
    }

    /**
     * 设置单聊消息已读（https://cloud.tencent.com/document/product/269/50349）
     * 
     * @param random  (required)
     * @param setMsgReadRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> adminSetMsgReadWithHttpInfo(Integer random, SetMsgReadRequest setMsgReadRequest) throws ApiException {
        okhttp3.Call localVarCall = adminSetMsgReadValidateBeforeCall(random, setMsgReadRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 设置单聊消息已读（https://cloud.tencent.com/document/product/269/50349） (asynchronously)
     * 
     * @param random  (required)
     * @param setMsgReadRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call adminSetMsgReadAsync(Integer random, SetMsgReadRequest setMsgReadRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = adminSetMsgReadValidateBeforeCall(random, setMsgReadRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for batchsendmsg
     * @param random  (required)
     * @param batchSendSingleChatMsgRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchsendmsgCall(Integer random, BatchSendSingleChatMsgRequest batchSendSingleChatMsgRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = batchSendSingleChatMsgRequest;

        // create path and map variables
        String localVarPath = "/v4/openim/batchsendmsg";

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
    private okhttp3.Call batchsendmsgValidateBeforeCall(Integer random, BatchSendSingleChatMsgRequest batchSendSingleChatMsgRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling batchsendmsg(Async)");
        }
        

        okhttp3.Call localVarCall = batchsendmsgCall(random, batchSendSingleChatMsgRequest, _callback);
        return localVarCall;

    }

    /**
     * 批量发单聊消息（https://cloud.tencent.com/document/product/269/1612）
     * 
     * @param random  (required)
     * @param batchSendSingleChatMsgRequest  (optional)
     * @return BatchSendSingleChatMsgResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public BatchSendSingleChatMsgResponse batchsendmsg(Integer random, BatchSendSingleChatMsgRequest batchSendSingleChatMsgRequest) throws ApiException {
        ApiResponse<BatchSendSingleChatMsgResponse> localVarResp = batchsendmsgWithHttpInfo(random, batchSendSingleChatMsgRequest);
        return localVarResp.getData();
    }

    /**
     * 批量发单聊消息（https://cloud.tencent.com/document/product/269/1612）
     * 
     * @param random  (required)
     * @param batchSendSingleChatMsgRequest  (optional)
     * @return ApiResponse&lt;BatchSendSingleChatMsgResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BatchSendSingleChatMsgResponse> batchsendmsgWithHttpInfo(Integer random, BatchSendSingleChatMsgRequest batchSendSingleChatMsgRequest) throws ApiException {
        okhttp3.Call localVarCall = batchsendmsgValidateBeforeCall(random, batchSendSingleChatMsgRequest, null);
        Type localVarReturnType = new TypeToken<BatchSendSingleChatMsgResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 批量发单聊消息（https://cloud.tencent.com/document/product/269/1612） (asynchronously)
     * 
     * @param random  (required)
     * @param batchSendSingleChatMsgRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchsendmsgAsync(Integer random, BatchSendSingleChatMsgRequest batchSendSingleChatMsgRequest, final ApiCallback<BatchSendSingleChatMsgResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchsendmsgValidateBeforeCall(random, batchSendSingleChatMsgRequest, _callback);
        Type localVarReturnType = new TypeToken<BatchSendSingleChatMsgResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getC2cUnreadMsgNum
     * @param random  (required)
     * @param getC2cUnreadMsgNumRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getC2cUnreadMsgNumCall(Integer random, GetC2cUnreadMsgNumRequest getC2cUnreadMsgNumRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getC2cUnreadMsgNumRequest;

        // create path and map variables
        String localVarPath = "/v4/openim/get_c2c_unread_msg_num";

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
    private okhttp3.Call getC2cUnreadMsgNumValidateBeforeCall(Integer random, GetC2cUnreadMsgNumRequest getC2cUnreadMsgNumRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling getC2cUnreadMsgNum(Async)");
        }
        

        okhttp3.Call localVarCall = getC2cUnreadMsgNumCall(random, getC2cUnreadMsgNumRequest, _callback);
        return localVarCall;

    }

    /**
     * 查询单聊未读消息计数（https://cloud.tencent.com/document/product/269/56043）
     * 
     * @param random  (required)
     * @param getC2cUnreadMsgNumRequest  (optional)
     * @return GetC2cUnreadMsgNumResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetC2cUnreadMsgNumResponse getC2cUnreadMsgNum(Integer random, GetC2cUnreadMsgNumRequest getC2cUnreadMsgNumRequest) throws ApiException {
        ApiResponse<GetC2cUnreadMsgNumResponse> localVarResp = getC2cUnreadMsgNumWithHttpInfo(random, getC2cUnreadMsgNumRequest);
        return localVarResp.getData();
    }

    /**
     * 查询单聊未读消息计数（https://cloud.tencent.com/document/product/269/56043）
     * 
     * @param random  (required)
     * @param getC2cUnreadMsgNumRequest  (optional)
     * @return ApiResponse&lt;GetC2cUnreadMsgNumResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetC2cUnreadMsgNumResponse> getC2cUnreadMsgNumWithHttpInfo(Integer random, GetC2cUnreadMsgNumRequest getC2cUnreadMsgNumRequest) throws ApiException {
        okhttp3.Call localVarCall = getC2cUnreadMsgNumValidateBeforeCall(random, getC2cUnreadMsgNumRequest, null);
        Type localVarReturnType = new TypeToken<GetC2cUnreadMsgNumResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 查询单聊未读消息计数（https://cloud.tencent.com/document/product/269/56043） (asynchronously)
     * 
     * @param random  (required)
     * @param getC2cUnreadMsgNumRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getC2cUnreadMsgNumAsync(Integer random, GetC2cUnreadMsgNumRequest getC2cUnreadMsgNumRequest, final ApiCallback<GetC2cUnreadMsgNumResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getC2cUnreadMsgNumValidateBeforeCall(random, getC2cUnreadMsgNumRequest, _callback);
        Type localVarReturnType = new TypeToken<GetC2cUnreadMsgNumResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for importmsg
     * @param random  (required)
     * @param importMsgRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importmsgCall(Integer random, ImportMsgRequest importMsgRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = importMsgRequest;

        // create path and map variables
        String localVarPath = "/v4/openim/importmsg";

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
    private okhttp3.Call importmsgValidateBeforeCall(Integer random, ImportMsgRequest importMsgRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling importmsg(Async)");
        }
        

        okhttp3.Call localVarCall = importmsgCall(random, importMsgRequest, _callback);
        return localVarCall;

    }

    /**
     * 导入单聊消息（https://cloud.tencent.com/document/product/269/2568）
     * 
     * @param random  (required)
     * @param importMsgRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse importmsg(Integer random, ImportMsgRequest importMsgRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = importmsgWithHttpInfo(random, importMsgRequest);
        return localVarResp.getData();
    }

    /**
     * 导入单聊消息（https://cloud.tencent.com/document/product/269/2568）
     * 
     * @param random  (required)
     * @param importMsgRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> importmsgWithHttpInfo(Integer random, ImportMsgRequest importMsgRequest) throws ApiException {
        okhttp3.Call localVarCall = importmsgValidateBeforeCall(random, importMsgRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 导入单聊消息（https://cloud.tencent.com/document/product/269/2568） (asynchronously)
     * 
     * @param random  (required)
     * @param importMsgRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importmsgAsync(Integer random, ImportMsgRequest importMsgRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = importmsgValidateBeforeCall(random, importMsgRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modifyC2cMsg
     * @param random  (required)
     * @param modifyC2cMsgRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyC2cMsgCall(Integer random, ModifyC2cMsgRequest modifyC2cMsgRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = modifyC2cMsgRequest;

        // create path and map variables
        String localVarPath = "/v4/openim/modify_c2c_msg";

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
    private okhttp3.Call modifyC2cMsgValidateBeforeCall(Integer random, ModifyC2cMsgRequest modifyC2cMsgRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling modifyC2cMsg(Async)");
        }
        

        okhttp3.Call localVarCall = modifyC2cMsgCall(random, modifyC2cMsgRequest, _callback);
        return localVarCall;

    }

    /**
     * 修改单聊历史消息（https://cloud.tencent.com/document/product/269/74740）
     * 
     * @param random  (required)
     * @param modifyC2cMsgRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse modifyC2cMsg(Integer random, ModifyC2cMsgRequest modifyC2cMsgRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = modifyC2cMsgWithHttpInfo(random, modifyC2cMsgRequest);
        return localVarResp.getData();
    }

    /**
     * 修改单聊历史消息（https://cloud.tencent.com/document/product/269/74740）
     * 
     * @param random  (required)
     * @param modifyC2cMsgRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> modifyC2cMsgWithHttpInfo(Integer random, ModifyC2cMsgRequest modifyC2cMsgRequest) throws ApiException {
        okhttp3.Call localVarCall = modifyC2cMsgValidateBeforeCall(random, modifyC2cMsgRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 修改单聊历史消息（https://cloud.tencent.com/document/product/269/74740） (asynchronously)
     * 
     * @param random  (required)
     * @param modifyC2cMsgRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyC2cMsgAsync(Integer random, ModifyC2cMsgRequest modifyC2cMsgRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyC2cMsgValidateBeforeCall(random, modifyC2cMsgRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendmsg
     * @param random  (required)
     * @param sendSingleChatMsgRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendmsgCall(Integer random, SendSingleChatMsgRequest sendSingleChatMsgRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = sendSingleChatMsgRequest;

        // create path and map variables
        String localVarPath = "/v4/openim/sendmsg";

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
    private okhttp3.Call sendmsgValidateBeforeCall(Integer random, SendSingleChatMsgRequest sendSingleChatMsgRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling sendmsg(Async)");
        }
        

        okhttp3.Call localVarCall = sendmsgCall(random, sendSingleChatMsgRequest, _callback);
        return localVarCall;

    }

    /**
     * 单发单聊消息（https://cloud.tencent.com/document/product/269/2282）
     * 
     * @param random  (required)
     * @param sendSingleChatMsgRequest  (optional)
     * @return SendSingleChatMsgResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public SendSingleChatMsgResponse sendmsg(Integer random, SendSingleChatMsgRequest sendSingleChatMsgRequest) throws ApiException {
        ApiResponse<SendSingleChatMsgResponse> localVarResp = sendmsgWithHttpInfo(random, sendSingleChatMsgRequest);
        return localVarResp.getData();
    }

    /**
     * 单发单聊消息（https://cloud.tencent.com/document/product/269/2282）
     * 
     * @param random  (required)
     * @param sendSingleChatMsgRequest  (optional)
     * @return ApiResponse&lt;SendSingleChatMsgResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SendSingleChatMsgResponse> sendmsgWithHttpInfo(Integer random, SendSingleChatMsgRequest sendSingleChatMsgRequest) throws ApiException {
        okhttp3.Call localVarCall = sendmsgValidateBeforeCall(random, sendSingleChatMsgRequest, null);
        Type localVarReturnType = new TypeToken<SendSingleChatMsgResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 单发单聊消息（https://cloud.tencent.com/document/product/269/2282） (asynchronously)
     * 
     * @param random  (required)
     * @param sendSingleChatMsgRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendmsgAsync(Integer random, SendSingleChatMsgRequest sendSingleChatMsgRequest, final ApiCallback<SendSingleChatMsgResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendmsgValidateBeforeCall(random, sendSingleChatMsgRequest, _callback);
        Type localVarReturnType = new TypeToken<SendSingleChatMsgResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
