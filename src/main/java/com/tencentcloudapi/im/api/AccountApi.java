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


import com.tencentcloudapi.im.model.AccountCheckRequest;
import com.tencentcloudapi.im.model.AccountCheckResponse;
import com.tencentcloudapi.im.model.AccountDeleteRequest;
import com.tencentcloudapi.im.model.AccountDeleteResponse;
import com.tencentcloudapi.im.model.AccountImportRequest;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.KickRequest;
import com.tencentcloudapi.im.model.MultiAccountImportRequest;
import com.tencentcloudapi.im.model.MultiAccountImportResponse;
import com.tencentcloudapi.im.model.QueryOnlineStatusRequest;
import com.tencentcloudapi.im.model.QueryOnlineStatusResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AccountApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountApi(ApiClient apiClient) {
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
     * Build call for accountCheck
     * @param random  (required)
     * @param accountCheckRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountCheckCall(Integer random, AccountCheckRequest accountCheckRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = accountCheckRequest;

        // create path and map variables
        String localVarPath = "/v4/im_open_login_svc/account_check";

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
    private okhttp3.Call accountCheckValidateBeforeCall(Integer random, AccountCheckRequest accountCheckRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling accountCheck(Async)");
        }
        

        okhttp3.Call localVarCall = accountCheckCall(random, accountCheckRequest, _callback);
        return localVarCall;

    }

    /**
     * 查询帐号 (https://cloud.tencent.com/document/product/269/38417)
     * 
     * @param random  (required)
     * @param accountCheckRequest  (optional)
     * @return AccountCheckResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public AccountCheckResponse accountCheck(Integer random, AccountCheckRequest accountCheckRequest) throws ApiException {
        ApiResponse<AccountCheckResponse> localVarResp = accountCheckWithHttpInfo(random, accountCheckRequest);
        return localVarResp.getData();
    }

    /**
     * 查询帐号 (https://cloud.tencent.com/document/product/269/38417)
     * 
     * @param random  (required)
     * @param accountCheckRequest  (optional)
     * @return ApiResponse&lt;AccountCheckResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccountCheckResponse> accountCheckWithHttpInfo(Integer random, AccountCheckRequest accountCheckRequest) throws ApiException {
        okhttp3.Call localVarCall = accountCheckValidateBeforeCall(random, accountCheckRequest, null);
        Type localVarReturnType = new TypeToken<AccountCheckResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 查询帐号 (https://cloud.tencent.com/document/product/269/38417) (asynchronously)
     * 
     * @param random  (required)
     * @param accountCheckRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountCheckAsync(Integer random, AccountCheckRequest accountCheckRequest, final ApiCallback<AccountCheckResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = accountCheckValidateBeforeCall(random, accountCheckRequest, _callback);
        Type localVarReturnType = new TypeToken<AccountCheckResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for accountDelete
     * @param random  (required)
     * @param accountDeleteRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountDeleteCall(Integer random, AccountDeleteRequest accountDeleteRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = accountDeleteRequest;

        // create path and map variables
        String localVarPath = "/v4/im_open_login_svc/account_delete";

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
    private okhttp3.Call accountDeleteValidateBeforeCall(Integer random, AccountDeleteRequest accountDeleteRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling accountDelete(Async)");
        }
        

        okhttp3.Call localVarCall = accountDeleteCall(random, accountDeleteRequest, _callback);
        return localVarCall;

    }

    /**
     * 删除帐号（https://cloud.tencent.com/document/product/269/36443）
     * 
     * @param random  (required)
     * @param accountDeleteRequest  (optional)
     * @return AccountDeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public AccountDeleteResponse accountDelete(Integer random, AccountDeleteRequest accountDeleteRequest) throws ApiException {
        ApiResponse<AccountDeleteResponse> localVarResp = accountDeleteWithHttpInfo(random, accountDeleteRequest);
        return localVarResp.getData();
    }

    /**
     * 删除帐号（https://cloud.tencent.com/document/product/269/36443）
     * 
     * @param random  (required)
     * @param accountDeleteRequest  (optional)
     * @return ApiResponse&lt;AccountDeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccountDeleteResponse> accountDeleteWithHttpInfo(Integer random, AccountDeleteRequest accountDeleteRequest) throws ApiException {
        okhttp3.Call localVarCall = accountDeleteValidateBeforeCall(random, accountDeleteRequest, null);
        Type localVarReturnType = new TypeToken<AccountDeleteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 删除帐号（https://cloud.tencent.com/document/product/269/36443） (asynchronously)
     * 
     * @param random  (required)
     * @param accountDeleteRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountDeleteAsync(Integer random, AccountDeleteRequest accountDeleteRequest, final ApiCallback<AccountDeleteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = accountDeleteValidateBeforeCall(random, accountDeleteRequest, _callback);
        Type localVarReturnType = new TypeToken<AccountDeleteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for accountImport
     * @param random  (required)
     * @param accountImportRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountImportCall(Integer random, AccountImportRequest accountImportRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = accountImportRequest;

        // create path and map variables
        String localVarPath = "/v4/im_open_login_svc/account_import";

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
    private okhttp3.Call accountImportValidateBeforeCall(Integer random, AccountImportRequest accountImportRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling accountImport(Async)");
        }
        

        okhttp3.Call localVarCall = accountImportCall(random, accountImportRequest, _callback);
        return localVarCall;

    }

    /**
     * 导入单个帐号（https://cloud.tencent.com/document/product/269/1608）
     * 
     * @param random  (required)
     * @param accountImportRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse accountImport(Integer random, AccountImportRequest accountImportRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = accountImportWithHttpInfo(random, accountImportRequest);
        return localVarResp.getData();
    }

    /**
     * 导入单个帐号（https://cloud.tencent.com/document/product/269/1608）
     * 
     * @param random  (required)
     * @param accountImportRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> accountImportWithHttpInfo(Integer random, AccountImportRequest accountImportRequest) throws ApiException {
        okhttp3.Call localVarCall = accountImportValidateBeforeCall(random, accountImportRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 导入单个帐号（https://cloud.tencent.com/document/product/269/1608） (asynchronously)
     * 
     * @param random  (required)
     * @param accountImportRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountImportAsync(Integer random, AccountImportRequest accountImportRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = accountImportValidateBeforeCall(random, accountImportRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for kick
     * @param random  (required)
     * @param kickRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call kickCall(Integer random, KickRequest kickRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = kickRequest;

        // create path and map variables
        String localVarPath = "/v4/im_open_login_svc/kick";

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
    private okhttp3.Call kickValidateBeforeCall(Integer random, KickRequest kickRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling kick(Async)");
        }
        

        okhttp3.Call localVarCall = kickCall(random, kickRequest, _callback);
        return localVarCall;

    }

    /**
     * 失效帐号登录状态（https://cloud.tencent.com/document/product/269/3853）
     * 
     * @param random  (required)
     * @param kickRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse kick(Integer random, KickRequest kickRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = kickWithHttpInfo(random, kickRequest);
        return localVarResp.getData();
    }

    /**
     * 失效帐号登录状态（https://cloud.tencent.com/document/product/269/3853）
     * 
     * @param random  (required)
     * @param kickRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> kickWithHttpInfo(Integer random, KickRequest kickRequest) throws ApiException {
        okhttp3.Call localVarCall = kickValidateBeforeCall(random, kickRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 失效帐号登录状态（https://cloud.tencent.com/document/product/269/3853） (asynchronously)
     * 
     * @param random  (required)
     * @param kickRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call kickAsync(Integer random, KickRequest kickRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = kickValidateBeforeCall(random, kickRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for multiAccountImport
     * @param random  (required)
     * @param multiAccountImportRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call multiAccountImportCall(Integer random, MultiAccountImportRequest multiAccountImportRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = multiAccountImportRequest;

        // create path and map variables
        String localVarPath = "/v4/im_open_login_svc/multiaccount_import";

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
    private okhttp3.Call multiAccountImportValidateBeforeCall(Integer random, MultiAccountImportRequest multiAccountImportRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling multiAccountImport(Async)");
        }
        

        okhttp3.Call localVarCall = multiAccountImportCall(random, multiAccountImportRequest, _callback);
        return localVarCall;

    }

    /**
     * 导入多个帐号（https://cloud.tencent.com/document/product/269/4919）
     * 
     * @param random  (required)
     * @param multiAccountImportRequest  (optional)
     * @return MultiAccountImportResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public MultiAccountImportResponse multiAccountImport(Integer random, MultiAccountImportRequest multiAccountImportRequest) throws ApiException {
        ApiResponse<MultiAccountImportResponse> localVarResp = multiAccountImportWithHttpInfo(random, multiAccountImportRequest);
        return localVarResp.getData();
    }

    /**
     * 导入多个帐号（https://cloud.tencent.com/document/product/269/4919）
     * 
     * @param random  (required)
     * @param multiAccountImportRequest  (optional)
     * @return ApiResponse&lt;MultiAccountImportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MultiAccountImportResponse> multiAccountImportWithHttpInfo(Integer random, MultiAccountImportRequest multiAccountImportRequest) throws ApiException {
        okhttp3.Call localVarCall = multiAccountImportValidateBeforeCall(random, multiAccountImportRequest, null);
        Type localVarReturnType = new TypeToken<MultiAccountImportResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 导入多个帐号（https://cloud.tencent.com/document/product/269/4919） (asynchronously)
     * 
     * @param random  (required)
     * @param multiAccountImportRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call multiAccountImportAsync(Integer random, MultiAccountImportRequest multiAccountImportRequest, final ApiCallback<MultiAccountImportResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = multiAccountImportValidateBeforeCall(random, multiAccountImportRequest, _callback);
        Type localVarReturnType = new TypeToken<MultiAccountImportResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for queryOnlineStatus
     * @param random  (required)
     * @param queryOnlineStatusRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryOnlineStatusCall(Integer random, QueryOnlineStatusRequest queryOnlineStatusRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = queryOnlineStatusRequest;

        // create path and map variables
        String localVarPath = "/v4/openim/query_online_status";

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
    private okhttp3.Call queryOnlineStatusValidateBeforeCall(Integer random, QueryOnlineStatusRequest queryOnlineStatusRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling queryOnlineStatus(Async)");
        }
        

        okhttp3.Call localVarCall = queryOnlineStatusCall(random, queryOnlineStatusRequest, _callback);
        return localVarCall;

    }

    /**
     * 查询帐号在线状态（https://cloud.tencent.com/document/product/269/2566）
     * 
     * @param random  (required)
     * @param queryOnlineStatusRequest  (optional)
     * @return QueryOnlineStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public QueryOnlineStatusResponse queryOnlineStatus(Integer random, QueryOnlineStatusRequest queryOnlineStatusRequest) throws ApiException {
        ApiResponse<QueryOnlineStatusResponse> localVarResp = queryOnlineStatusWithHttpInfo(random, queryOnlineStatusRequest);
        return localVarResp.getData();
    }

    /**
     * 查询帐号在线状态（https://cloud.tencent.com/document/product/269/2566）
     * 
     * @param random  (required)
     * @param queryOnlineStatusRequest  (optional)
     * @return ApiResponse&lt;QueryOnlineStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QueryOnlineStatusResponse> queryOnlineStatusWithHttpInfo(Integer random, QueryOnlineStatusRequest queryOnlineStatusRequest) throws ApiException {
        okhttp3.Call localVarCall = queryOnlineStatusValidateBeforeCall(random, queryOnlineStatusRequest, null);
        Type localVarReturnType = new TypeToken<QueryOnlineStatusResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 查询帐号在线状态（https://cloud.tencent.com/document/product/269/2566） (asynchronously)
     * 
     * @param random  (required)
     * @param queryOnlineStatusRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryOnlineStatusAsync(Integer random, QueryOnlineStatusRequest queryOnlineStatusRequest, final ApiCallback<QueryOnlineStatusResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryOnlineStatusValidateBeforeCall(random, queryOnlineStatusRequest, _callback);
        Type localVarReturnType = new TypeToken<QueryOnlineStatusResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
