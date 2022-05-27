package com.tencentcloudapi.im.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.model.*;
import com.tencentcloudapi.im.Pair;

import com.tencentcloudapi.im.model.PortraitGetRequest;
import com.tencentcloudapi.im.model.PortraitGetResponse;
import com.tencentcloudapi.im.model.PortraitSetRequest;
import com.tencentcloudapi.im.model.PortraitSetResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PortraitApi {
  private ApiClient apiClient;

  public PortraitApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PortraitApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 拉取资料（https://cloud.tencent.com/document/product/269/1639）
   * 
   * @param random  (required)
   * @param portraitGetRequest  (optional)
   * @return PortraitGetResponse
   * @throws ApiException if fails to make API call
   */
  public PortraitGetResponse portraitGet(Integer random, PortraitGetRequest portraitGetRequest) throws ApiException {
    Object localVarPostBody = portraitGetRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling portraitGet");
    }
    
    // create path and map variables
    String localVarPath = "/v4/profile/portrait_get";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<PortraitGetResponse> localVarReturnType = new TypeReference<PortraitGetResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 设置资料（https://cloud.tencent.com/document/product/269/1640）
   * 
   * @param random  (required)
   * @param portraitSetRequest  (optional)
   * @return PortraitSetResponse
   * @throws ApiException if fails to make API call
   */
  public PortraitSetResponse portraitSet(Integer random, PortraitSetRequest portraitSetRequest) throws ApiException {
    Object localVarPostBody = portraitSetRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling portraitSet");
    }
    
    // create path and map variables
    String localVarPath = "/v4/profile/portrait_set";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams = apiClient.buildLocalQueryParams(random);

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<PortraitSetResponse> localVarReturnType = new TypeReference<PortraitSetResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
}
