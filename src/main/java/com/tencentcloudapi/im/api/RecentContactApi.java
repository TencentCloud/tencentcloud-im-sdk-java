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


import com.tencentcloudapi.im.model.GetRecentContactListGroupDeleteRequest;
import com.tencentcloudapi.im.model.GetRecentContactListGroupDeleteResponse;
import com.tencentcloudapi.im.model.GetRecentContactListGroupGetRequest;
import com.tencentcloudapi.im.model.GetRecentContactListGroupGetResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class RecentContactApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RecentContactApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RecentContactApi(ApiClient apiClient) {
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
     * Build call for deleteRecentContact
     * @param random  (required)
     * @param getRecentContactListGroupDeleteRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteRecentContactCall(Integer random, GetRecentContactListGroupDeleteRequest getRecentContactListGroupDeleteRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getRecentContactListGroupDeleteRequest;

        // create path and map variables
        String localVarPath = "/v4/recentcontact/delete";

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
    private okhttp3.Call deleteRecentContactValidateBeforeCall(Integer random, GetRecentContactListGroupDeleteRequest getRecentContactListGroupDeleteRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling deleteRecentContact(Async)");
        }
        

        okhttp3.Call localVarCall = deleteRecentContactCall(random, getRecentContactListGroupDeleteRequest, _callback);
        return localVarCall;

    }

    /**
     * 删除单个会话（https://cloud.tencent.com/document/product/269/62119）
     * 
     * @param random  (required)
     * @param getRecentContactListGroupDeleteRequest  (optional)
     * @return GetRecentContactListGroupDeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetRecentContactListGroupDeleteResponse deleteRecentContact(Integer random, GetRecentContactListGroupDeleteRequest getRecentContactListGroupDeleteRequest) throws ApiException {
        ApiResponse<GetRecentContactListGroupDeleteResponse> localVarResp = deleteRecentContactWithHttpInfo(random, getRecentContactListGroupDeleteRequest);
        return localVarResp.getData();
    }

    /**
     * 删除单个会话（https://cloud.tencent.com/document/product/269/62119）
     * 
     * @param random  (required)
     * @param getRecentContactListGroupDeleteRequest  (optional)
     * @return ApiResponse&lt;GetRecentContactListGroupDeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetRecentContactListGroupDeleteResponse> deleteRecentContactWithHttpInfo(Integer random, GetRecentContactListGroupDeleteRequest getRecentContactListGroupDeleteRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteRecentContactValidateBeforeCall(random, getRecentContactListGroupDeleteRequest, null);
        Type localVarReturnType = new TypeToken<GetRecentContactListGroupDeleteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 删除单个会话（https://cloud.tencent.com/document/product/269/62119） (asynchronously)
     * 
     * @param random  (required)
     * @param getRecentContactListGroupDeleteRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteRecentContactAsync(Integer random, GetRecentContactListGroupDeleteRequest getRecentContactListGroupDeleteRequest, final ApiCallback<GetRecentContactListGroupDeleteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteRecentContactValidateBeforeCall(random, getRecentContactListGroupDeleteRequest, _callback);
        Type localVarReturnType = new TypeToken<GetRecentContactListGroupDeleteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRecentContactList
     * @param random  (required)
     * @param getRecentContactListGroupGetRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRecentContactListCall(Integer random, GetRecentContactListGroupGetRequest getRecentContactListGroupGetRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getRecentContactListGroupGetRequest;

        // create path and map variables
        String localVarPath = "/v4/recentcontact/get_list";

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
    private okhttp3.Call getRecentContactListValidateBeforeCall(Integer random, GetRecentContactListGroupGetRequest getRecentContactListGroupGetRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling getRecentContactList(Async)");
        }
        

        okhttp3.Call localVarCall = getRecentContactListCall(random, getRecentContactListGroupGetRequest, _callback);
        return localVarCall;

    }

    /**
     * 拉取会话列表（https://cloud.tencent.com/document/product/269/62118）
     * 
     * @param random  (required)
     * @param getRecentContactListGroupGetRequest  (optional)
     * @return GetRecentContactListGroupGetResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public GetRecentContactListGroupGetResponse getRecentContactList(Integer random, GetRecentContactListGroupGetRequest getRecentContactListGroupGetRequest) throws ApiException {
        ApiResponse<GetRecentContactListGroupGetResponse> localVarResp = getRecentContactListWithHttpInfo(random, getRecentContactListGroupGetRequest);
        return localVarResp.getData();
    }

    /**
     * 拉取会话列表（https://cloud.tencent.com/document/product/269/62118）
     * 
     * @param random  (required)
     * @param getRecentContactListGroupGetRequest  (optional)
     * @return ApiResponse&lt;GetRecentContactListGroupGetResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetRecentContactListGroupGetResponse> getRecentContactListWithHttpInfo(Integer random, GetRecentContactListGroupGetRequest getRecentContactListGroupGetRequest) throws ApiException {
        okhttp3.Call localVarCall = getRecentContactListValidateBeforeCall(random, getRecentContactListGroupGetRequest, null);
        Type localVarReturnType = new TypeToken<GetRecentContactListGroupGetResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 拉取会话列表（https://cloud.tencent.com/document/product/269/62118） (asynchronously)
     * 
     * @param random  (required)
     * @param getRecentContactListGroupGetRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRecentContactListAsync(Integer random, GetRecentContactListGroupGetRequest getRecentContactListGroupGetRequest, final ApiCallback<GetRecentContactListGroupGetResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRecentContactListValidateBeforeCall(random, getRecentContactListGroupGetRequest, _callback);
        Type localVarReturnType = new TypeToken<GetRecentContactListGroupGetResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
