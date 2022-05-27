package com.tencentcloudapi.im.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.model.*;
import com.tencentcloudapi.im.Pair;

import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.GetNoSpeakingRequest;
import com.tencentcloudapi.im.model.GetNoSpeakingResponse;
import com.tencentcloudapi.im.model.SetNoSpeakingRequest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MuteApi {
  private ApiClient apiClient;

  public MuteApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MuteApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 查询全局禁言（https://cloud.tencent.com/document/product/269/4229）
   * 
   * @param random  (required)
   * @param getNoSpeakingRequest  (optional)
   * @return GetNoSpeakingResponse
   * @throws ApiException if fails to make API call
   */
  public GetNoSpeakingResponse getnospeaking(Integer random, GetNoSpeakingRequest getNoSpeakingRequest) throws ApiException {
    Object localVarPostBody = getNoSpeakingRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling getnospeaking");
    }
    
    // create path and map variables
    String localVarPath = "/v4/openconfigsvr/getnospeaking";

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

    TypeReference<GetNoSpeakingResponse> localVarReturnType = new TypeReference<GetNoSpeakingResponse>() {};
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
   * 设置全局禁言（https://cloud.tencent.com/document/product/269/4230）
   * 
   * @param random  (required)
   * @param setNoSpeakingRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse setnospeaking(Integer random, SetNoSpeakingRequest setNoSpeakingRequest) throws ApiException {
    Object localVarPostBody = setNoSpeakingRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling setnospeaking");
    }
    
    // create path and map variables
    String localVarPath = "/v4/openconfigsvr/setnospeaking";

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

    TypeReference<CommonResponse> localVarReturnType = new TypeReference<CommonResponse>() {};
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
