package com.tencentcloudapi.im.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.model.*;
import com.tencentcloudapi.im.Pair;

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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountApi {
  private ApiClient apiClient;

  public AccountApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 查询帐号 (https://cloud.tencent.com/document/product/269/38417)
   * 
   * @param random  (required)
   * @param accountCheckRequest  (optional)
   * @return AccountCheckResponse
   * @throws ApiException if fails to make API call
   */
  public AccountCheckResponse accountCheck(Integer random, AccountCheckRequest accountCheckRequest) throws ApiException {
    Object localVarPostBody = accountCheckRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling accountCheck");
    }
    
    // create path and map variables
    String localVarPath = "/v4/im_open_login_svc/account_check";

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

    TypeReference<AccountCheckResponse> localVarReturnType = new TypeReference<AccountCheckResponse>() {};
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
   * 删除帐号（https://cloud.tencent.com/document/product/269/36443）
   * 
   * @param random  (required)
   * @param accountDeleteRequest  (optional)
   * @return AccountDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public AccountDeleteResponse accountDelete(Integer random, AccountDeleteRequest accountDeleteRequest) throws ApiException {
    Object localVarPostBody = accountDeleteRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling accountDelete");
    }
    
    // create path and map variables
    String localVarPath = "/v4/im_open_login_svc/account_delete";

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

    TypeReference<AccountDeleteResponse> localVarReturnType = new TypeReference<AccountDeleteResponse>() {};
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
   * 导入单个帐号（https://cloud.tencent.com/document/product/269/1608）
   * 
   * @param random  (required)
   * @param accountImportRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse accountImport(Integer random, AccountImportRequest accountImportRequest) throws ApiException {
    Object localVarPostBody = accountImportRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling accountImport");
    }
    
    // create path and map variables
    String localVarPath = "/v4/im_open_login_svc/account_import";

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
  /**
   * 失效帐号登录状态（https://cloud.tencent.com/document/product/269/3853）
   * 
   * @param random  (required)
   * @param kickRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse kick(Integer random, KickRequest kickRequest) throws ApiException {
    Object localVarPostBody = kickRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling kick");
    }
    
    // create path and map variables
    String localVarPath = "/v4/im_open_login_svc/kick";

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
  /**
   * 导入多个帐号（https://cloud.tencent.com/document/product/269/4919）
   * 
   * @param random  (required)
   * @param multiAccountImportRequest  (optional)
   * @return MultiAccountImportResponse
   * @throws ApiException if fails to make API call
   */
  public MultiAccountImportResponse multiAccountImport(Integer random, MultiAccountImportRequest multiAccountImportRequest) throws ApiException {
    Object localVarPostBody = multiAccountImportRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling multiAccountImport");
    }
    
    // create path and map variables
    String localVarPath = "/v4/im_open_login_svc/multiaccount_import";

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

    TypeReference<MultiAccountImportResponse> localVarReturnType = new TypeReference<MultiAccountImportResponse>() {};
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
   * 查询帐号在线状态（https://cloud.tencent.com/document/product/269/2566）
   * 
   * @param random  (required)
   * @param queryOnlineStatusRequest  (optional)
   * @return QueryOnlineStatusResponse
   * @throws ApiException if fails to make API call
   */
  public QueryOnlineStatusResponse queryOnlineStatus(Integer random, QueryOnlineStatusRequest queryOnlineStatusRequest) throws ApiException {
    Object localVarPostBody = queryOnlineStatusRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling queryOnlineStatus");
    }
    
    // create path and map variables
    String localVarPath = "/v4/openim/query_online_status";

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

    TypeReference<QueryOnlineStatusResponse> localVarReturnType = new TypeReference<QueryOnlineStatusResponse>() {};
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
