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
import com.tencentcloudapi.im.model.ImAddTagRequest;
import com.tencentcloudapi.im.model.ImGetAttrNameResponse;
import com.tencentcloudapi.im.model.ImGetAttrRequest;
import com.tencentcloudapi.im.model.ImGetAttrResponse;
import com.tencentcloudapi.im.model.ImGetTagRequest;
import com.tencentcloudapi.im.model.ImGetTagResponse;
import com.tencentcloudapi.im.model.ImPushRequest;
import com.tencentcloudapi.im.model.ImPushResponse;
import com.tencentcloudapi.im.model.ImRemoveAllTagRequest;
import com.tencentcloudapi.im.model.ImRemoveAttrRequest;
import com.tencentcloudapi.im.model.ImRemoveTagRequest;
import com.tencentcloudapi.im.model.ImSetAttrNameRequest;
import com.tencentcloudapi.im.model.ImSetAttrRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AllMemberPushApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AllMemberPushApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AllMemberPushApi(ApiClient apiClient) {
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
     * Build call for imAddTag
     * @param random  (required)
     * @param imAddTagRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imAddTagCall(Integer random, ImAddTagRequest imAddTagRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = imAddTagRequest;

        // create path and map variables
        String localVarPath = "/v4/all_member_push/im_add_tag";

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
    private okhttp3.Call imAddTagValidateBeforeCall(Integer random, ImAddTagRequest imAddTagRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling imAddTag(Async)");
        }
        

        okhttp3.Call localVarCall = imAddTagCall(random, imAddTagRequest, _callback);
        return localVarCall;

    }

    /**
     * 添加用户标签（https://cloud.tencent.com/document/product/269/45941）
     * 
     * @param random  (required)
     * @param imAddTagRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse imAddTag(Integer random, ImAddTagRequest imAddTagRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = imAddTagWithHttpInfo(random, imAddTagRequest);
        return localVarResp.getData();
    }

    /**
     * 添加用户标签（https://cloud.tencent.com/document/product/269/45941）
     * 
     * @param random  (required)
     * @param imAddTagRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> imAddTagWithHttpInfo(Integer random, ImAddTagRequest imAddTagRequest) throws ApiException {
        okhttp3.Call localVarCall = imAddTagValidateBeforeCall(random, imAddTagRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 添加用户标签（https://cloud.tencent.com/document/product/269/45941） (asynchronously)
     * 
     * @param random  (required)
     * @param imAddTagRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imAddTagAsync(Integer random, ImAddTagRequest imAddTagRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = imAddTagValidateBeforeCall(random, imAddTagRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for imGetAttr
     * @param random  (required)
     * @param imGetAttrRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imGetAttrCall(Integer random, ImGetAttrRequest imGetAttrRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = imGetAttrRequest;

        // create path and map variables
        String localVarPath = "/v4/all_member_push/im_get_attr";

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
    private okhttp3.Call imGetAttrValidateBeforeCall(Integer random, ImGetAttrRequest imGetAttrRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling imGetAttr(Async)");
        }
        

        okhttp3.Call localVarCall = imGetAttrCall(random, imGetAttrRequest, _callback);
        return localVarCall;

    }

    /**
     * 获取用户属性（https://cloud.tencent.com/document/product/269/45937）
     * 
     * @param random  (required)
     * @param imGetAttrRequest  (optional)
     * @return ImGetAttrResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ImGetAttrResponse imGetAttr(Integer random, ImGetAttrRequest imGetAttrRequest) throws ApiException {
        ApiResponse<ImGetAttrResponse> localVarResp = imGetAttrWithHttpInfo(random, imGetAttrRequest);
        return localVarResp.getData();
    }

    /**
     * 获取用户属性（https://cloud.tencent.com/document/product/269/45937）
     * 
     * @param random  (required)
     * @param imGetAttrRequest  (optional)
     * @return ApiResponse&lt;ImGetAttrResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImGetAttrResponse> imGetAttrWithHttpInfo(Integer random, ImGetAttrRequest imGetAttrRequest) throws ApiException {
        okhttp3.Call localVarCall = imGetAttrValidateBeforeCall(random, imGetAttrRequest, null);
        Type localVarReturnType = new TypeToken<ImGetAttrResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取用户属性（https://cloud.tencent.com/document/product/269/45937） (asynchronously)
     * 
     * @param random  (required)
     * @param imGetAttrRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imGetAttrAsync(Integer random, ImGetAttrRequest imGetAttrRequest, final ApiCallback<ImGetAttrResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = imGetAttrValidateBeforeCall(random, imGetAttrRequest, _callback);
        Type localVarReturnType = new TypeToken<ImGetAttrResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for imGetAttrName
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
    public okhttp3.Call imGetAttrNameCall(Integer random, Object body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v4/all_member_push/im_get_attr_name";

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
    private okhttp3.Call imGetAttrNameValidateBeforeCall(Integer random, Object body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling imGetAttrName(Async)");
        }
        

        okhttp3.Call localVarCall = imGetAttrNameCall(random, body, _callback);
        return localVarCall;

    }

    /**
     * 获取应用属性名称（https://cloud.tencent.com/document/product/269/45936）
     * 
     * @param random  (required)
     * @param body  (optional)
     * @return ImGetAttrNameResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ImGetAttrNameResponse imGetAttrName(Integer random, Object body) throws ApiException {
        ApiResponse<ImGetAttrNameResponse> localVarResp = imGetAttrNameWithHttpInfo(random, body);
        return localVarResp.getData();
    }

    /**
     * 获取应用属性名称（https://cloud.tencent.com/document/product/269/45936）
     * 
     * @param random  (required)
     * @param body  (optional)
     * @return ApiResponse&lt;ImGetAttrNameResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImGetAttrNameResponse> imGetAttrNameWithHttpInfo(Integer random, Object body) throws ApiException {
        okhttp3.Call localVarCall = imGetAttrNameValidateBeforeCall(random, body, null);
        Type localVarReturnType = new TypeToken<ImGetAttrNameResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取应用属性名称（https://cloud.tencent.com/document/product/269/45936） (asynchronously)
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
    public okhttp3.Call imGetAttrNameAsync(Integer random, Object body, final ApiCallback<ImGetAttrNameResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = imGetAttrNameValidateBeforeCall(random, body, _callback);
        Type localVarReturnType = new TypeToken<ImGetAttrNameResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for imGetTag
     * @param random  (required)
     * @param imGetTagRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imGetTagCall(Integer random, ImGetTagRequest imGetTagRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = imGetTagRequest;

        // create path and map variables
        String localVarPath = "/v4/all_member_push/im_get_tag";

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
    private okhttp3.Call imGetTagValidateBeforeCall(Integer random, ImGetTagRequest imGetTagRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling imGetTag(Async)");
        }
        

        okhttp3.Call localVarCall = imGetTagCall(random, imGetTagRequest, _callback);
        return localVarCall;

    }

    /**
     * 获取用户标签（https://cloud.tencent.com/document/product/269/45940）
     * 
     * @param random  (required)
     * @param imGetTagRequest  (optional)
     * @return ImGetTagResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ImGetTagResponse imGetTag(Integer random, ImGetTagRequest imGetTagRequest) throws ApiException {
        ApiResponse<ImGetTagResponse> localVarResp = imGetTagWithHttpInfo(random, imGetTagRequest);
        return localVarResp.getData();
    }

    /**
     * 获取用户标签（https://cloud.tencent.com/document/product/269/45940）
     * 
     * @param random  (required)
     * @param imGetTagRequest  (optional)
     * @return ApiResponse&lt;ImGetTagResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImGetTagResponse> imGetTagWithHttpInfo(Integer random, ImGetTagRequest imGetTagRequest) throws ApiException {
        okhttp3.Call localVarCall = imGetTagValidateBeforeCall(random, imGetTagRequest, null);
        Type localVarReturnType = new TypeToken<ImGetTagResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取用户标签（https://cloud.tencent.com/document/product/269/45940） (asynchronously)
     * 
     * @param random  (required)
     * @param imGetTagRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imGetTagAsync(Integer random, ImGetTagRequest imGetTagRequest, final ApiCallback<ImGetTagResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = imGetTagValidateBeforeCall(random, imGetTagRequest, _callback);
        Type localVarReturnType = new TypeToken<ImGetTagResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for imPush
     * @param random  (required)
     * @param imPushRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imPushCall(Integer random, ImPushRequest imPushRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = imPushRequest;

        // create path and map variables
        String localVarPath = "/v4/all_member_push/im_push";

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
    private okhttp3.Call imPushValidateBeforeCall(Integer random, ImPushRequest imPushRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling imPush(Async)");
        }
        

        okhttp3.Call localVarCall = imPushCall(random, imPushRequest, _callback);
        return localVarCall;

    }

    /**
     * 全员推送（https://cloud.tencent.com/document/product/269/45934）
     * 
     * @param random  (required)
     * @param imPushRequest  (optional)
     * @return ImPushResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ImPushResponse imPush(Integer random, ImPushRequest imPushRequest) throws ApiException {
        ApiResponse<ImPushResponse> localVarResp = imPushWithHttpInfo(random, imPushRequest);
        return localVarResp.getData();
    }

    /**
     * 全员推送（https://cloud.tencent.com/document/product/269/45934）
     * 
     * @param random  (required)
     * @param imPushRequest  (optional)
     * @return ApiResponse&lt;ImPushResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImPushResponse> imPushWithHttpInfo(Integer random, ImPushRequest imPushRequest) throws ApiException {
        okhttp3.Call localVarCall = imPushValidateBeforeCall(random, imPushRequest, null);
        Type localVarReturnType = new TypeToken<ImPushResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 全员推送（https://cloud.tencent.com/document/product/269/45934） (asynchronously)
     * 
     * @param random  (required)
     * @param imPushRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imPushAsync(Integer random, ImPushRequest imPushRequest, final ApiCallback<ImPushResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = imPushValidateBeforeCall(random, imPushRequest, _callback);
        Type localVarReturnType = new TypeToken<ImPushResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for imRemoveAllTags
     * @param random  (required)
     * @param imRemoveAllTagRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imRemoveAllTagsCall(Integer random, ImRemoveAllTagRequest imRemoveAllTagRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = imRemoveAllTagRequest;

        // create path and map variables
        String localVarPath = "/v4/all_member_push/im_remove_all_tags";

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
    private okhttp3.Call imRemoveAllTagsValidateBeforeCall(Integer random, ImRemoveAllTagRequest imRemoveAllTagRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling imRemoveAllTags(Async)");
        }
        

        okhttp3.Call localVarCall = imRemoveAllTagsCall(random, imRemoveAllTagRequest, _callback);
        return localVarCall;

    }

    /**
     * 删除用户所有标签（https://cloud.tencent.com/document/product/269/45943）
     * 
     * @param random  (required)
     * @param imRemoveAllTagRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse imRemoveAllTags(Integer random, ImRemoveAllTagRequest imRemoveAllTagRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = imRemoveAllTagsWithHttpInfo(random, imRemoveAllTagRequest);
        return localVarResp.getData();
    }

    /**
     * 删除用户所有标签（https://cloud.tencent.com/document/product/269/45943）
     * 
     * @param random  (required)
     * @param imRemoveAllTagRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> imRemoveAllTagsWithHttpInfo(Integer random, ImRemoveAllTagRequest imRemoveAllTagRequest) throws ApiException {
        okhttp3.Call localVarCall = imRemoveAllTagsValidateBeforeCall(random, imRemoveAllTagRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 删除用户所有标签（https://cloud.tencent.com/document/product/269/45943） (asynchronously)
     * 
     * @param random  (required)
     * @param imRemoveAllTagRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imRemoveAllTagsAsync(Integer random, ImRemoveAllTagRequest imRemoveAllTagRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = imRemoveAllTagsValidateBeforeCall(random, imRemoveAllTagRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for imRemoveAttr
     * @param random  (required)
     * @param imRemoveAttrRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imRemoveAttrCall(Integer random, ImRemoveAttrRequest imRemoveAttrRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = imRemoveAttrRequest;

        // create path and map variables
        String localVarPath = "/v4/all_member_push/im_remove_attr";

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
    private okhttp3.Call imRemoveAttrValidateBeforeCall(Integer random, ImRemoveAttrRequest imRemoveAttrRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling imRemoveAttr(Async)");
        }
        

        okhttp3.Call localVarCall = imRemoveAttrCall(random, imRemoveAttrRequest, _callback);
        return localVarCall;

    }

    /**
     * 删除用户属性（https://cloud.tencent.com/document/product/269/45939）
     * 
     * @param random  (required)
     * @param imRemoveAttrRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse imRemoveAttr(Integer random, ImRemoveAttrRequest imRemoveAttrRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = imRemoveAttrWithHttpInfo(random, imRemoveAttrRequest);
        return localVarResp.getData();
    }

    /**
     * 删除用户属性（https://cloud.tencent.com/document/product/269/45939）
     * 
     * @param random  (required)
     * @param imRemoveAttrRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> imRemoveAttrWithHttpInfo(Integer random, ImRemoveAttrRequest imRemoveAttrRequest) throws ApiException {
        okhttp3.Call localVarCall = imRemoveAttrValidateBeforeCall(random, imRemoveAttrRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 删除用户属性（https://cloud.tencent.com/document/product/269/45939） (asynchronously)
     * 
     * @param random  (required)
     * @param imRemoveAttrRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imRemoveAttrAsync(Integer random, ImRemoveAttrRequest imRemoveAttrRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = imRemoveAttrValidateBeforeCall(random, imRemoveAttrRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for imRemoveTag
     * @param random  (required)
     * @param imRemoveTagRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imRemoveTagCall(Integer random, ImRemoveTagRequest imRemoveTagRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = imRemoveTagRequest;

        // create path and map variables
        String localVarPath = "/v4/all_member_push/im_remove_tag";

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
    private okhttp3.Call imRemoveTagValidateBeforeCall(Integer random, ImRemoveTagRequest imRemoveTagRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling imRemoveTag(Async)");
        }
        

        okhttp3.Call localVarCall = imRemoveTagCall(random, imRemoveTagRequest, _callback);
        return localVarCall;

    }

    /**
     * 删除用户标签（https://cloud.tencent.com/document/product/269/45942）
     * 
     * @param random  (required)
     * @param imRemoveTagRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse imRemoveTag(Integer random, ImRemoveTagRequest imRemoveTagRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = imRemoveTagWithHttpInfo(random, imRemoveTagRequest);
        return localVarResp.getData();
    }

    /**
     * 删除用户标签（https://cloud.tencent.com/document/product/269/45942）
     * 
     * @param random  (required)
     * @param imRemoveTagRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> imRemoveTagWithHttpInfo(Integer random, ImRemoveTagRequest imRemoveTagRequest) throws ApiException {
        okhttp3.Call localVarCall = imRemoveTagValidateBeforeCall(random, imRemoveTagRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 删除用户标签（https://cloud.tencent.com/document/product/269/45942） (asynchronously)
     * 
     * @param random  (required)
     * @param imRemoveTagRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imRemoveTagAsync(Integer random, ImRemoveTagRequest imRemoveTagRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = imRemoveTagValidateBeforeCall(random, imRemoveTagRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for imSetAttr
     * @param random  (required)
     * @param imSetAttrRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imSetAttrCall(Integer random, ImSetAttrRequest imSetAttrRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = imSetAttrRequest;

        // create path and map variables
        String localVarPath = "/v4/all_member_push/im_set_attr";

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
    private okhttp3.Call imSetAttrValidateBeforeCall(Integer random, ImSetAttrRequest imSetAttrRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling imSetAttr(Async)");
        }
        

        okhttp3.Call localVarCall = imSetAttrCall(random, imSetAttrRequest, _callback);
        return localVarCall;

    }

    /**
     * 设置用户属性（https://cloud.tencent.com/document/product/269/45938）
     * 
     * @param random  (required)
     * @param imSetAttrRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse imSetAttr(Integer random, ImSetAttrRequest imSetAttrRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = imSetAttrWithHttpInfo(random, imSetAttrRequest);
        return localVarResp.getData();
    }

    /**
     * 设置用户属性（https://cloud.tencent.com/document/product/269/45938）
     * 
     * @param random  (required)
     * @param imSetAttrRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> imSetAttrWithHttpInfo(Integer random, ImSetAttrRequest imSetAttrRequest) throws ApiException {
        okhttp3.Call localVarCall = imSetAttrValidateBeforeCall(random, imSetAttrRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 设置用户属性（https://cloud.tencent.com/document/product/269/45938） (asynchronously)
     * 
     * @param random  (required)
     * @param imSetAttrRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imSetAttrAsync(Integer random, ImSetAttrRequest imSetAttrRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = imSetAttrValidateBeforeCall(random, imSetAttrRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for imSetAttrName
     * @param random  (required)
     * @param imSetAttrNameRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imSetAttrNameCall(Integer random, ImSetAttrNameRequest imSetAttrNameRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = imSetAttrNameRequest;

        // create path and map variables
        String localVarPath = "/v4/all_member_push/im_set_attr_name";

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
    private okhttp3.Call imSetAttrNameValidateBeforeCall(Integer random, ImSetAttrNameRequest imSetAttrNameRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'random' is set
        if (random == null) {
            throw new ApiException("Missing the required parameter 'random' when calling imSetAttrName(Async)");
        }
        

        okhttp3.Call localVarCall = imSetAttrNameCall(random, imSetAttrNameRequest, _callback);
        return localVarCall;

    }

    /**
     * 设置应用属性名称（https://cloud.tencent.com/document/product/269/45935）
     * 
     * @param random  (required)
     * @param imSetAttrNameRequest  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public CommonResponse imSetAttrName(Integer random, ImSetAttrNameRequest imSetAttrNameRequest) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = imSetAttrNameWithHttpInfo(random, imSetAttrNameRequest);
        return localVarResp.getData();
    }

    /**
     * 设置应用属性名称（https://cloud.tencent.com/document/product/269/45935）
     * 
     * @param random  (required)
     * @param imSetAttrNameRequest  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonResponse> imSetAttrNameWithHttpInfo(Integer random, ImSetAttrNameRequest imSetAttrNameRequest) throws ApiException {
        okhttp3.Call localVarCall = imSetAttrNameValidateBeforeCall(random, imSetAttrNameRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 设置应用属性名称（https://cloud.tencent.com/document/product/269/45935） (asynchronously)
     * 
     * @param random  (required)
     * @param imSetAttrNameRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 正常响应 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imSetAttrNameAsync(Integer random, ImSetAttrNameRequest imSetAttrNameRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = imSetAttrNameValidateBeforeCall(random, imSetAttrNameRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
