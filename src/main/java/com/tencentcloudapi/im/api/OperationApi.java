package com.tencentcloudapi.im.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.model.*;
import com.tencentcloudapi.im.Pair;

import com.tencentcloudapi.im.model.GetAppInfoRequest;
import com.tencentcloudapi.im.model.GetAppInfoResponse;
import com.tencentcloudapi.im.model.GetIPListResponse;
import com.tencentcloudapi.im.model.GetOperateMsgHistoryRequest;
import com.tencentcloudapi.im.model.GetOperateMsgHistoryResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperationApi {
  private ApiClient apiClient;

  public OperationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OperationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 下载最近消息记录（https://cloud.tencent.com/document/product/269/1650）
   * 
   * @param random  (required)
   * @param getOperateMsgHistoryRequest  (optional)
   * @return GetOperateMsgHistoryResponse
   * @throws ApiException if fails to make API call
   */
  public GetOperateMsgHistoryResponse getHistory(Integer random, GetOperateMsgHistoryRequest getOperateMsgHistoryRequest) throws ApiException {
    Object localVarPostBody = getOperateMsgHistoryRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling getHistory");
    }
    
    // create path and map variables
    String localVarPath = "/v4/open_msg_svc/get_history";

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

    TypeReference<GetOperateMsgHistoryResponse> localVarReturnType = new TypeReference<GetOperateMsgHistoryResponse>() {};
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
   * 获取服务器 IP 地址（https://cloud.tencent.com/document/product/269/45438）
   * 
   * @param random  (required)
   * @param body  (optional)
   * @return GetIPListResponse
   * @throws ApiException if fails to make API call
   */
  public GetIPListResponse getIPList(Integer random, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling getIPList");
    }
    
    // create path and map variables
    String localVarPath = "/v4/ConfigSvc/GetIPList";

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

    TypeReference<GetIPListResponse> localVarReturnType = new TypeReference<GetIPListResponse>() {};
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
   * 拉取运营数据（https://cloud.tencent.com/document/product/269/4193）
   * 
   * @param random  (required)
   * @param getAppInfoRequest  (optional)
   * @return GetAppInfoResponse
   * @throws ApiException if fails to make API call
   */
  public GetAppInfoResponse getappinfo(Integer random, GetAppInfoRequest getAppInfoRequest) throws ApiException {
    Object localVarPostBody = getAppInfoRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling getappinfo");
    }
    
    // create path and map variables
    String localVarPath = "/v4/openconfigsvr/getappinfo";

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

    TypeReference<GetAppInfoResponse> localVarReturnType = new TypeReference<GetAppInfoResponse>() {};
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
