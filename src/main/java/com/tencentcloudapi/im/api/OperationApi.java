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


import com.tencentcloudapi.im.model.GetAppInfoRequest;
import com.tencentcloudapi.im.model.GetAppInfoResponse;
import com.tencentcloudapi.im.model.GetIPListResponse;
import com.tencentcloudapi.im.model.GetOperateMsgHistoryRequest;
import com.tencentcloudapi.im.model.GetOperateMsgHistoryResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OperationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OperationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OperationApi(ApiClient apiClient) {
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
     * Build call for getHistory
     * @param random  (required)
     * @param getOperateMsgHistoryRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHistoryCall(Integer random, GetOperateMsgHistoryRequest getOperateMsgHistoryRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getOperateMsgHistoryRequest;

        // create path and map variables
        String localVarPath = "/v4/open_msg_svc/get_history";

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
    private okhttp3.Call getHistoryValidateBeforeCall(Integer random, GetOperateMsgHistoryRequest getOperateMsgHistoryRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling getHistory(Async)");
        }
        

        okhttp3.Call localVarCall = getHistoryCall(random, getOperateMsgHistoryRequest, _callback);
        return localVarCall;

    }

    /**
     * 下载最近消息记录（https://cloud.tencent.com/document/product/269/1650）
     * 
     * @param random  (required)
     * @param getOperateMsgHistoryRequest  (optional)
     * @return GetOperateMsgHistoryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetOperateMsgHistoryResponse getHistory(Integer random, GetOperateMsgHistoryRequest getOperateMsgHistoryRequest) throws ApiException {
        ApiResponse<GetOperateMsgHistoryResponse> localVarResp = getHistoryWithHttpInfo(random, getOperateMsgHistoryRequest);
        return localVarResp.getData();
    }

    /**
     * 下载最近消息记录（https://cloud.tencent.com/document/product/269/1650）
     * 
     * @param random  (required)
     * @param getOperateMsgHistoryRequest  (optional)
     * @return ApiResponse&lt;GetOperateMsgHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetOperateMsgHistoryResponse> getHistoryWithHttpInfo(Integer random, GetOperateMsgHistoryRequest getOperateMsgHistoryRequest) throws ApiException {
        okhttp3.Call localVarCall = getHistoryValidateBeforeCall(random, getOperateMsgHistoryRequest, null);
        Type localVarReturnType = new TypeToken<GetOperateMsgHistoryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 下载最近消息记录（https://cloud.tencent.com/document/product/269/1650） (asynchronously)
     * 
     * @param random  (required)
     * @param getOperateMsgHistoryRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHistoryAsync(Integer random, GetOperateMsgHistoryRequest getOperateMsgHistoryRequest, final ApiCallback<GetOperateMsgHistoryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHistoryValidateBeforeCall(random, getOperateMsgHistoryRequest, _callback);
        Type localVarReturnType = new TypeToken<GetOperateMsgHistoryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getIPList
     * @param random  (required)
     * @param body  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIPListCall(Integer random, Object body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v4/ConfigSvc/GetIPList";

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
    private okhttp3.Call getIPListValidateBeforeCall(Integer random, Object body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling getIPList(Async)");
        }
        

        okhttp3.Call localVarCall = getIPListCall(random, body, _callback);
        return localVarCall;

    }

    /**
     * 获取服务器 IP 地址（https://cloud.tencent.com/document/product/269/45438）
     * 
     * @param random  (required)
     * @param body  (optional)
     * @return GetIPListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetIPListResponse getIPList(Integer random, Object body) throws ApiException {
        ApiResponse<GetIPListResponse> localVarResp = getIPListWithHttpInfo(random, body);
        return localVarResp.getData();
    }

    /**
     * 获取服务器 IP 地址（https://cloud.tencent.com/document/product/269/45438）
     * 
     * @param random  (required)
     * @param body  (optional)
     * @return ApiResponse&lt;GetIPListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetIPListResponse> getIPListWithHttpInfo(Integer random, Object body) throws ApiException {
        okhttp3.Call localVarCall = getIPListValidateBeforeCall(random, body, null);
        Type localVarReturnType = new TypeToken<GetIPListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取服务器 IP 地址（https://cloud.tencent.com/document/product/269/45438） (asynchronously)
     * 
     * @param random  (required)
     * @param body  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIPListAsync(Integer random, Object body, final ApiCallback<GetIPListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIPListValidateBeforeCall(random, body, _callback);
        Type localVarReturnType = new TypeToken<GetIPListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getappinfo
     * @param random  (required)
     * @param getAppInfoRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getappinfoCall(Integer random, GetAppInfoRequest getAppInfoRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getAppInfoRequest;

        // create path and map variables
        String localVarPath = "/v4/openconfigsvr/getappinfo";

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
    private okhttp3.Call getappinfoValidateBeforeCall(Integer random, GetAppInfoRequest getAppInfoRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling getappinfo(Async)");
        }
        

        okhttp3.Call localVarCall = getappinfoCall(random, getAppInfoRequest, _callback);
        return localVarCall;

    }

    /**
     * 拉取运营数据（https://cloud.tencent.com/document/product/269/4193）
     * 
     * @param random  (required)
     * @param getAppInfoRequest  (optional)
     * @return GetAppInfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetAppInfoResponse getappinfo(Integer random, GetAppInfoRequest getAppInfoRequest) throws ApiException {
        ApiResponse<GetAppInfoResponse> localVarResp = getappinfoWithHttpInfo(random, getAppInfoRequest);
        return localVarResp.getData();
    }

    /**
     * 拉取运营数据（https://cloud.tencent.com/document/product/269/4193）
     * 
     * @param random  (required)
     * @param getAppInfoRequest  (optional)
     * @return ApiResponse&lt;GetAppInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetAppInfoResponse> getappinfoWithHttpInfo(Integer random, GetAppInfoRequest getAppInfoRequest) throws ApiException {
        okhttp3.Call localVarCall = getappinfoValidateBeforeCall(random, getAppInfoRequest, null);
        Type localVarReturnType = new TypeToken<GetAppInfoResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 拉取运营数据（https://cloud.tencent.com/document/product/269/4193） (asynchronously)
     * 
     * @param random  (required)
     * @param getAppInfoRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getappinfoAsync(Integer random, GetAppInfoRequest getAppInfoRequest, final ApiCallback<GetAppInfoResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getappinfoValidateBeforeCall(random, getAppInfoRequest, _callback);
        Type localVarReturnType = new TypeToken<GetAppInfoResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
