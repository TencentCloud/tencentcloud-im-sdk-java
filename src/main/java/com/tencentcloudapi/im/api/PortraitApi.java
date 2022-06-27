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


import com.tencentcloudapi.im.model.PortraitGetRequest;
import com.tencentcloudapi.im.model.PortraitGetResponse;
import com.tencentcloudapi.im.model.PortraitSetRequest;
import com.tencentcloudapi.im.model.PortraitSetResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PortraitApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PortraitApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PortraitApi(ApiClient apiClient) {
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
     * Build call for portraitGet
     * @param random  (required)
     * @param portraitGetRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call portraitGetCall(Integer random, PortraitGetRequest portraitGetRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = portraitGetRequest;

        // create path and map variables
        String localVarPath = "/v4/profile/portrait_get";

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
    private okhttp3.Call portraitGetValidateBeforeCall(Integer random, PortraitGetRequest portraitGetRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling portraitGet(Async)");
        }
        

        okhttp3.Call localVarCall = portraitGetCall(random, portraitGetRequest, _callback);
        return localVarCall;

    }

    /**
     * 拉取资料（https://cloud.tencent.com/document/product/269/1639）
     * 
     * @param random  (required)
     * @param portraitGetRequest  (optional)
     * @return PortraitGetResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public PortraitGetResponse portraitGet(Integer random, PortraitGetRequest portraitGetRequest) throws ApiException {
        ApiResponse<PortraitGetResponse> localVarResp = portraitGetWithHttpInfo(random, portraitGetRequest);
        return localVarResp.getData();
    }

    /**
     * 拉取资料（https://cloud.tencent.com/document/product/269/1639）
     * 
     * @param random  (required)
     * @param portraitGetRequest  (optional)
     * @return ApiResponse&lt;PortraitGetResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PortraitGetResponse> portraitGetWithHttpInfo(Integer random, PortraitGetRequest portraitGetRequest) throws ApiException {
        okhttp3.Call localVarCall = portraitGetValidateBeforeCall(random, portraitGetRequest, null);
        Type localVarReturnType = new TypeToken<PortraitGetResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 拉取资料（https://cloud.tencent.com/document/product/269/1639） (asynchronously)
     * 
     * @param random  (required)
     * @param portraitGetRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call portraitGetAsync(Integer random, PortraitGetRequest portraitGetRequest, final ApiCallback<PortraitGetResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = portraitGetValidateBeforeCall(random, portraitGetRequest, _callback);
        Type localVarReturnType = new TypeToken<PortraitGetResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for portraitSet
     * @param random  (required)
     * @param portraitSetRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call portraitSetCall(Integer random, PortraitSetRequest portraitSetRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = portraitSetRequest;

        // create path and map variables
        String localVarPath = "/v4/profile/portrait_set";

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
    private okhttp3.Call portraitSetValidateBeforeCall(Integer random, PortraitSetRequest portraitSetRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling portraitSet(Async)");
        }
        

        okhttp3.Call localVarCall = portraitSetCall(random, portraitSetRequest, _callback);
        return localVarCall;

    }

    /**
     * 设置资料（https://cloud.tencent.com/document/product/269/1640）
     * 
     * @param random  (required)
     * @param portraitSetRequest  (optional)
     * @return PortraitSetResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public PortraitSetResponse portraitSet(Integer random, PortraitSetRequest portraitSetRequest) throws ApiException {
        ApiResponse<PortraitSetResponse> localVarResp = portraitSetWithHttpInfo(random, portraitSetRequest);
        return localVarResp.getData();
    }

    /**
     * 设置资料（https://cloud.tencent.com/document/product/269/1640）
     * 
     * @param random  (required)
     * @param portraitSetRequest  (optional)
     * @return ApiResponse&lt;PortraitSetResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PortraitSetResponse> portraitSetWithHttpInfo(Integer random, PortraitSetRequest portraitSetRequest) throws ApiException {
        okhttp3.Call localVarCall = portraitSetValidateBeforeCall(random, portraitSetRequest, null);
        Type localVarReturnType = new TypeToken<PortraitSetResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 设置资料（https://cloud.tencent.com/document/product/269/1640） (asynchronously)
     * 
     * @param random  (required)
     * @param portraitSetRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call portraitSetAsync(Integer random, PortraitSetRequest portraitSetRequest, final ApiCallback<PortraitSetResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = portraitSetValidateBeforeCall(random, portraitSetRequest, _callback);
        Type localVarReturnType = new TypeToken<PortraitSetResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
