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


import com.tencentcloudapi.im.model.AllowBannedObjectRequest;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.ForbidIllegalObjectRequest;
import com.tencentcloudapi.im.model.GetAppInfoRequest;
import com.tencentcloudapi.im.model.GetAppInfoResponse;
import com.tencentcloudapi.im.model.GetCosSigRequest;
import com.tencentcloudapi.im.model.GetCosSigResponse;
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
     * Build call for allowBannedObject
     * @param random  (required)
     * @param allowBannedObjectRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call allowBannedObjectCall(Integer random, AllowBannedObjectRequest allowBannedObjectRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = allowBannedObjectRequest;

        // create path and map variables
        String localVarPath = "/v4/im_cos_msg/allow_banned_object";

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
    private okhttp3.Call allowBannedObjectValidateBeforeCall(Integer random, AllowBannedObjectRequest allowBannedObjectRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling allowBannedObject(Async)");
        }
        

        okhttp3.Call localVarCall = allowBannedObjectCall(random, allowBannedObjectRequest, _callback);
        return localVarCall;

    }

    /**
     * 聊天文件解封（https://cloud.tencent.com/document/product/269/74776）
     * 
     * @param random  (required)
     * @param allowBannedObjectRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse allowBannedObject(Integer random, AllowBannedObjectRequest allowBannedObjectRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = allowBannedObjectWithHttpInfo(random, allowBannedObjectRequest);
        return localVarResp.getData();
    }

    /**
     * 聊天文件解封（https://cloud.tencent.com/document/product/269/74776）
     * 
     * @param random  (required)
     * @param allowBannedObjectRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> allowBannedObjectWithHttpInfo(Integer random, AllowBannedObjectRequest allowBannedObjectRequest) throws ApiException {
        okhttp3.Call localVarCall = allowBannedObjectValidateBeforeCall(random, allowBannedObjectRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 聊天文件解封（https://cloud.tencent.com/document/product/269/74776） (asynchronously)
     * 
     * @param random  (required)
     * @param allowBannedObjectRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call allowBannedObjectAsync(Integer random, AllowBannedObjectRequest allowBannedObjectRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = allowBannedObjectValidateBeforeCall(random, allowBannedObjectRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for forbidIllegalObject
     * @param random  (required)
     * @param forbidIllegalObjectRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call forbidIllegalObjectCall(Integer random, ForbidIllegalObjectRequest forbidIllegalObjectRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = forbidIllegalObjectRequest;

        // create path and map variables
        String localVarPath = "/v4/im_cos_msg/forbid_illegal_object";

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
    private okhttp3.Call forbidIllegalObjectValidateBeforeCall(Integer random, ForbidIllegalObjectRequest forbidIllegalObjectRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling forbidIllegalObject(Async)");
        }
        

        okhttp3.Call localVarCall = forbidIllegalObjectCall(random, forbidIllegalObjectRequest, _callback);
        return localVarCall;

    }

    /**
     * 聊天文件封禁（https://cloud.tencent.com/document/product/269/74775）
     * 
     * @param random  (required)
     * @param forbidIllegalObjectRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse forbidIllegalObject(Integer random, ForbidIllegalObjectRequest forbidIllegalObjectRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = forbidIllegalObjectWithHttpInfo(random, forbidIllegalObjectRequest);
        return localVarResp.getData();
    }

    /**
     * 聊天文件封禁（https://cloud.tencent.com/document/product/269/74775）
     * 
     * @param random  (required)
     * @param forbidIllegalObjectRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> forbidIllegalObjectWithHttpInfo(Integer random, ForbidIllegalObjectRequest forbidIllegalObjectRequest) throws ApiException {
        okhttp3.Call localVarCall = forbidIllegalObjectValidateBeforeCall(random, forbidIllegalObjectRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 聊天文件封禁（https://cloud.tencent.com/document/product/269/74775） (asynchronously)
     * 
     * @param random  (required)
     * @param forbidIllegalObjectRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call forbidIllegalObjectAsync(Integer random, ForbidIllegalObjectRequest forbidIllegalObjectRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = forbidIllegalObjectValidateBeforeCall(random, forbidIllegalObjectRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCosSig
     * @param random  (required)
     * @param getCosSigRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCosSigCall(Integer random, GetCosSigRequest getCosSigRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getCosSigRequest;

        // create path and map variables
        String localVarPath = "/v4/im_cos_msg/get_cos_sig";

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
    private okhttp3.Call getCosSigValidateBeforeCall(Integer random, GetCosSigRequest getCosSigRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling getCosSig(Async)");
        }
        

        okhttp3.Call localVarCall = getCosSigCall(random, getCosSigRequest, _callback);
        return localVarCall;

    }

    /**
     * 聊天文件签名（https://cloud.tencent.com/document/product/269/74777）
     * 
     * @param random  (required)
     * @param getCosSigRequest  (optional)
     * @return GetCosSigResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetCosSigResponse getCosSig(Integer random, GetCosSigRequest getCosSigRequest) throws ApiException {
        ApiResponse<GetCosSigResponse> localVarResp = getCosSigWithHttpInfo(random, getCosSigRequest);
        return localVarResp.getData();
    }

    /**
     * 聊天文件签名（https://cloud.tencent.com/document/product/269/74777）
     * 
     * @param random  (required)
     * @param getCosSigRequest  (optional)
     * @return ApiResponse&lt;GetCosSigResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetCosSigResponse> getCosSigWithHttpInfo(Integer random, GetCosSigRequest getCosSigRequest) throws ApiException {
        okhttp3.Call localVarCall = getCosSigValidateBeforeCall(random, getCosSigRequest, null);
        Type localVarReturnType = new TypeToken<GetCosSigResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 聊天文件签名（https://cloud.tencent.com/document/product/269/74777） (asynchronously)
     * 
     * @param random  (required)
     * @param getCosSigRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCosSigAsync(Integer random, GetCosSigRequest getCosSigRequest, final ApiCallback<GetCosSigResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCosSigValidateBeforeCall(random, getCosSigRequest, _callback);
        Type localVarReturnType = new TypeToken<GetCosSigResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
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
