package com.tencentcloudapi.im.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.model.*;
import com.tencentcloudapi.im.Pair;

import com.tencentcloudapi.im.model.GetRecentContactListGroupDeleteRequest;
import com.tencentcloudapi.im.model.GetRecentContactListGroupDeleteResponse;
import com.tencentcloudapi.im.model.GetRecentContactListGroupGetRequest;
import com.tencentcloudapi.im.model.GetRecentContactListGroupGetResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecentContactApi {
  private ApiClient apiClient;

  public RecentContactApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RecentContactApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 删除单个会话（https://cloud.tencent.com/document/product/269/62119）
   * 
   * @param random  (required)
   * @param getRecentContactListGroupDeleteRequest  (optional)
   * @return GetRecentContactListGroupDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public GetRecentContactListGroupDeleteResponse deleteRecentContact(Integer random, GetRecentContactListGroupDeleteRequest getRecentContactListGroupDeleteRequest) throws ApiException {
    Object localVarPostBody = getRecentContactListGroupDeleteRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling deleteRecentContact");
    }
    
    // create path and map variables
    String localVarPath = "/v4/recentcontact/delete";

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

    TypeReference<GetRecentContactListGroupDeleteResponse> localVarReturnType = new TypeReference<GetRecentContactListGroupDeleteResponse>() {};
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
   * 拉取会话列表（https://cloud.tencent.com/document/product/269/62118）
   * 
   * @param random  (required)
   * @param getRecentContactListGroupGetRequest  (optional)
   * @return GetRecentContactListGroupGetResponse
   * @throws ApiException if fails to make API call
   */
  public GetRecentContactListGroupGetResponse getRecentContactList(Integer random, GetRecentContactListGroupGetRequest getRecentContactListGroupGetRequest) throws ApiException {
    Object localVarPostBody = getRecentContactListGroupGetRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling getRecentContactList");
    }
    
    // create path and map variables
    String localVarPath = "/v4/recentcontact/get_list";

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

    TypeReference<GetRecentContactListGroupGetResponse> localVarReturnType = new TypeReference<GetRecentContactListGroupGetResponse>() {};
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
