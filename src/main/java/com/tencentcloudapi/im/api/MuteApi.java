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


import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.GetNoSpeakingRequest;
import com.tencentcloudapi.im.model.GetNoSpeakingResponse;
import com.tencentcloudapi.im.model.SetNoSpeakingRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MuteApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MuteApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MuteApi(ApiClient apiClient) {
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
     * Build call for getnospeaking
     * @param random  (required)
     * @param getNoSpeakingRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getnospeakingCall(Integer random, GetNoSpeakingRequest getNoSpeakingRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getNoSpeakingRequest;

        // create path and map variables
        String localVarPath = "/v4/openconfigsvr/getnospeaking";

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
    private okhttp3.Call getnospeakingValidateBeforeCall(Integer random, GetNoSpeakingRequest getNoSpeakingRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling getnospeaking(Async)");
        }
        

        okhttp3.Call localVarCall = getnospeakingCall(random, getNoSpeakingRequest, _callback);
        return localVarCall;

    }

    /**
     * 查询全局禁言（https://cloud.tencent.com/document/product/269/4229）
     * 
     * @param random  (required)
     * @param getNoSpeakingRequest  (optional)
     * @return GetNoSpeakingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetNoSpeakingResponse getnospeaking(Integer random, GetNoSpeakingRequest getNoSpeakingRequest) throws ApiException {
        ApiResponse<GetNoSpeakingResponse> localVarResp = getnospeakingWithHttpInfo(random, getNoSpeakingRequest);
        return localVarResp.getData();
    }

    /**
     * 查询全局禁言（https://cloud.tencent.com/document/product/269/4229）
     * 
     * @param random  (required)
     * @param getNoSpeakingRequest  (optional)
     * @return ApiResponse&lt;GetNoSpeakingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetNoSpeakingResponse> getnospeakingWithHttpInfo(Integer random, GetNoSpeakingRequest getNoSpeakingRequest) throws ApiException {
        okhttp3.Call localVarCall = getnospeakingValidateBeforeCall(random, getNoSpeakingRequest, null);
        Type localVarReturnType = new TypeToken<GetNoSpeakingResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 查询全局禁言（https://cloud.tencent.com/document/product/269/4229） (asynchronously)
     * 
     * @param random  (required)
     * @param getNoSpeakingRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getnospeakingAsync(Integer random, GetNoSpeakingRequest getNoSpeakingRequest, final ApiCallback<GetNoSpeakingResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getnospeakingValidateBeforeCall(random, getNoSpeakingRequest, _callback);
        Type localVarReturnType = new TypeToken<GetNoSpeakingResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setnospeaking
     * @param random  (required)
     * @param setNoSpeakingRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setnospeakingCall(Integer random, SetNoSpeakingRequest setNoSpeakingRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = setNoSpeakingRequest;

        // create path and map variables
        String localVarPath = "/v4/openconfigsvr/setnospeaking";

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
    private okhttp3.Call setnospeakingValidateBeforeCall(Integer random, SetNoSpeakingRequest setNoSpeakingRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling setnospeaking(Async)");
        }
        

        okhttp3.Call localVarCall = setnospeakingCall(random, setNoSpeakingRequest, _callback);
        return localVarCall;

    }

    /**
     * 设置全局禁言（https://cloud.tencent.com/document/product/269/4230）
     * 
     * @param random  (required)
     * @param setNoSpeakingRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse setnospeaking(Integer random, SetNoSpeakingRequest setNoSpeakingRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = setnospeakingWithHttpInfo(random, setNoSpeakingRequest);
        return localVarResp.getData();
    }

    /**
     * 设置全局禁言（https://cloud.tencent.com/document/product/269/4230）
     * 
     * @param random  (required)
     * @param setNoSpeakingRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> setnospeakingWithHttpInfo(Integer random, SetNoSpeakingRequest setNoSpeakingRequest) throws ApiException {
        okhttp3.Call localVarCall = setnospeakingValidateBeforeCall(random, setNoSpeakingRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 设置全局禁言（https://cloud.tencent.com/document/product/269/4230） (asynchronously)
     * 
     * @param random  (required)
     * @param setNoSpeakingRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setnospeakingAsync(Integer random, SetNoSpeakingRequest setNoSpeakingRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = setnospeakingValidateBeforeCall(random, setNoSpeakingRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
