package com.tencentcloudapi.im.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.model.*;
import com.tencentcloudapi.im.Pair;

import com.tencentcloudapi.im.model.BlackListAddRequest;
import com.tencentcloudapi.im.model.BlackListAddResponse;
import com.tencentcloudapi.im.model.BlackListCheckRequest;
import com.tencentcloudapi.im.model.BlackListCheckResponse;
import com.tencentcloudapi.im.model.BlackListDeleteRequest;
import com.tencentcloudapi.im.model.BlackListDeleteResponse;
import com.tencentcloudapi.im.model.BlackListGetRequest;
import com.tencentcloudapi.im.model.BlackListGetResponse;
import com.tencentcloudapi.im.model.FriendAddRequest;
import com.tencentcloudapi.im.model.FriendAddResponse;
import com.tencentcloudapi.im.model.FriendCheckRequest;
import com.tencentcloudapi.im.model.FriendCheckResponse;
import com.tencentcloudapi.im.model.FriendDeleteAllRequest;
import com.tencentcloudapi.im.model.FriendDeleteAllResponse;
import com.tencentcloudapi.im.model.FriendDeleteRequest;
import com.tencentcloudapi.im.model.FriendDeleteResponse;
import com.tencentcloudapi.im.model.FriendGetListRequest;
import com.tencentcloudapi.im.model.FriendGetListResponse;
import com.tencentcloudapi.im.model.FriendGetRequest;
import com.tencentcloudapi.im.model.FriendGetResponse;
import com.tencentcloudapi.im.model.FriendImportRequest;
import com.tencentcloudapi.im.model.FriendImportResponse;
import com.tencentcloudapi.im.model.FriendUpdateRequest;
import com.tencentcloudapi.im.model.FriendUpdateResponse;
import com.tencentcloudapi.im.model.GroupAddRequest;
import com.tencentcloudapi.im.model.GroupAddResponse;
import com.tencentcloudapi.im.model.GroupDeleteRequest;
import com.tencentcloudapi.im.model.GroupDeleteResponse;
import com.tencentcloudapi.im.model.GroupGetRequest;
import com.tencentcloudapi.im.model.GroupGetResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelationshipsApi {
  private ApiClient apiClient;

  public RelationshipsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RelationshipsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 添加黑名单（https://cloud.tencent.com/document/product/269/3718）
   * 
   * @param random  (required)
   * @param blackListAddRequest  (optional)
   * @return BlackListAddResponse
   * @throws ApiException if fails to make API call
   */
  public BlackListAddResponse blackListAdd(Integer random, BlackListAddRequest blackListAddRequest) throws ApiException {
    Object localVarPostBody = blackListAddRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling blackListAdd");
    }
    
    // create path and map variables
    String localVarPath = "/v4/sns/black_list_add";

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

    TypeReference<BlackListAddResponse> localVarReturnType = new TypeReference<BlackListAddResponse>() {};
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
   * 校验黑名单（https://cloud.tencent.com/document/product/269/3725）
   * 
   * @param random  (required)
   * @param blackListCheckRequest  (optional)
   * @return BlackListCheckResponse
   * @throws ApiException if fails to make API call
   */
  public BlackListCheckResponse blackListCheck(Integer random, BlackListCheckRequest blackListCheckRequest) throws ApiException {
    Object localVarPostBody = blackListCheckRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling blackListCheck");
    }
    
    // create path and map variables
    String localVarPath = "/v4/sns/black_list_check";

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

    TypeReference<BlackListCheckResponse> localVarReturnType = new TypeReference<BlackListCheckResponse>() {};
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
   * 删除黑名单（https://cloud.tencent.com/document/product/269/3719）
   * 
   * @param random  (required)
   * @param blackListDeleteRequest  (optional)
   * @return BlackListDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public BlackListDeleteResponse blackListDelete(Integer random, BlackListDeleteRequest blackListDeleteRequest) throws ApiException {
    Object localVarPostBody = blackListDeleteRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling blackListDelete");
    }
    
    // create path and map variables
    String localVarPath = "/v4/sns/black_list_delete";

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

    TypeReference<BlackListDeleteResponse> localVarReturnType = new TypeReference<BlackListDeleteResponse>() {};
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
   * 拉取黑名单（https://cloud.tencent.com/document/product/269/3722）
   * 
   * @param random  (required)
   * @param blackListGetRequest  (optional)
   * @return BlackListGetResponse
   * @throws ApiException if fails to make API call
   */
  public BlackListGetResponse blackListGet(Integer random, BlackListGetRequest blackListGetRequest) throws ApiException {
    Object localVarPostBody = blackListGetRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling blackListGet");
    }
    
    // create path and map variables
    String localVarPath = "/v4/sns/black_list_get";

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

    TypeReference<BlackListGetResponse> localVarReturnType = new TypeReference<BlackListGetResponse>() {};
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
   * 添加好友（https://cloud.tencent.com/document/product/269/1643）
   * 
   * @param random  (required)
   * @param friendAddRequest  (optional)
   * @return FriendAddResponse
   * @throws ApiException if fails to make API call
   */
  public FriendAddResponse friendAdd(Integer random, FriendAddRequest friendAddRequest) throws ApiException {
    Object localVarPostBody = friendAddRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling friendAdd");
    }
    
    // create path and map variables
    String localVarPath = "/v4/sns/friend_add";

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

    TypeReference<FriendAddResponse> localVarReturnType = new TypeReference<FriendAddResponse>() {};
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
   * 校验好友（https://cloud.tencent.com/document/product/269/1646）
   * 
   * @param random  (required)
   * @param friendCheckRequest  (optional)
   * @return FriendCheckResponse
   * @throws ApiException if fails to make API call
   */
  public FriendCheckResponse friendCheck(Integer random, FriendCheckRequest friendCheckRequest) throws ApiException {
    Object localVarPostBody = friendCheckRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling friendCheck");
    }
    
    // create path and map variables
    String localVarPath = "/v4/sns/friend_check";

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

    TypeReference<FriendCheckResponse> localVarReturnType = new TypeReference<FriendCheckResponse>() {};
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
   * 删除好友（https://cloud.tencent.com/document/product/269/1644）
   * 
   * @param random  (required)
   * @param friendDeleteRequest  (optional)
   * @return FriendDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public FriendDeleteResponse friendDelete(Integer random, FriendDeleteRequest friendDeleteRequest) throws ApiException {
    Object localVarPostBody = friendDeleteRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling friendDelete");
    }
    
    // create path and map variables
    String localVarPath = "/v4/sns/friend_delete";

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

    TypeReference<FriendDeleteResponse> localVarReturnType = new TypeReference<FriendDeleteResponse>() {};
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
   * 删除所有好友（https://cloud.tencent.com/document/product/269/1645）
   * 
   * @param random  (required)
   * @param friendDeleteAllRequest  (optional)
   * @return FriendDeleteAllResponse
   * @throws ApiException if fails to make API call
   */
  public FriendDeleteAllResponse friendDeleteAll(Integer random, FriendDeleteAllRequest friendDeleteAllRequest) throws ApiException {
    Object localVarPostBody = friendDeleteAllRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling friendDeleteAll");
    }
    
    // create path and map variables
    String localVarPath = "/v4/sns/friend_delete_all";

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

    TypeReference<FriendDeleteAllResponse> localVarReturnType = new TypeReference<FriendDeleteAllResponse>() {};
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
   * 拉取好友（https://cloud.tencent.com/document/product/269/1647）
   * 
   * @param random  (required)
   * @param friendGetRequest  (optional)
   * @return FriendGetResponse
   * @throws ApiException if fails to make API call
   */
  public FriendGetResponse friendGet(Integer random, FriendGetRequest friendGetRequest) throws ApiException {
    Object localVarPostBody = friendGetRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling friendGet");
    }
    
    // create path and map variables
    String localVarPath = "/v4/sns/friend_get";

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

    TypeReference<FriendGetResponse> localVarReturnType = new TypeReference<FriendGetResponse>() {};
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
   * 拉取指定好友（https://cloud.tencent.com/document/product/269/8609）
   * 
   * @param random  (required)
   * @param friendGetListRequest  (optional)
   * @return FriendGetListResponse
   * @throws ApiException if fails to make API call
   */
  public FriendGetListResponse friendGetList(Integer random, FriendGetListRequest friendGetListRequest) throws ApiException {
    Object localVarPostBody = friendGetListRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling friendGetList");
    }
    
    // create path and map variables
    String localVarPath = "/v4/sns/friend_get_list";

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

    TypeReference<FriendGetListResponse> localVarReturnType = new TypeReference<FriendGetListResponse>() {};
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
   * 导入好友（https://cloud.tencent.com/document/product/269/8301）
   * 
   * @param random  (required)
   * @param friendImportRequest  (optional)
   * @return FriendImportResponse
   * @throws ApiException if fails to make API call
   */
  public FriendImportResponse friendImport(Integer random, FriendImportRequest friendImportRequest) throws ApiException {
    Object localVarPostBody = friendImportRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling friendImport");
    }
    
    // create path and map variables
    String localVarPath = "/v4/sns/friend_import";

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

    TypeReference<FriendImportResponse> localVarReturnType = new TypeReference<FriendImportResponse>() {};
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
   * 更新好友（https://cloud.tencent.com/document/product/269/12525）
   * 
   * @param random  (required)
   * @param friendUpdateRequest  (optional)
   * @return FriendUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public FriendUpdateResponse friendUpdate(Integer random, FriendUpdateRequest friendUpdateRequest) throws ApiException {
    Object localVarPostBody = friendUpdateRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling friendUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/v4/sns/friend_update";

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

    TypeReference<FriendUpdateResponse> localVarReturnType = new TypeReference<FriendUpdateResponse>() {};
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
   * 添加分组（https://cloud.tencent.com/document/product/269/10107）
   * 
   * @param random  (required)
   * @param groupAddRequest  (optional)
   * @return GroupAddResponse
   * @throws ApiException if fails to make API call
   */
  public GroupAddResponse groupAdd(Integer random, GroupAddRequest groupAddRequest) throws ApiException {
    Object localVarPostBody = groupAddRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling groupAdd");
    }
    
    // create path and map variables
    String localVarPath = "/v4/sns/group_add";

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

    TypeReference<GroupAddResponse> localVarReturnType = new TypeReference<GroupAddResponse>() {};
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
   * 删除分组（https://cloud.tencent.com/document/product/269/10108）
   * 
   * @param random  (required)
   * @param groupDeleteRequest  (optional)
   * @return GroupDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public GroupDeleteResponse groupDelete(Integer random, GroupDeleteRequest groupDeleteRequest) throws ApiException {
    Object localVarPostBody = groupDeleteRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling groupDelete");
    }
    
    // create path and map variables
    String localVarPath = "/v4/sns/group_delete";

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

    TypeReference<GroupDeleteResponse> localVarReturnType = new TypeReference<GroupDeleteResponse>() {};
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
   * 拉取分组（https://cloud.tencent.com/document/product/269/54763）
   * 
   * @param random  (required)
   * @param groupGetRequest  (optional)
   * @return GroupGetResponse
   * @throws ApiException if fails to make API call
   */
  public GroupGetResponse groupGet(Integer random, GroupGetRequest groupGetRequest) throws ApiException {
    Object localVarPostBody = groupGetRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling groupGet");
    }
    
    // create path and map variables
    String localVarPath = "/v4/sns/group_get";

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

    TypeReference<GroupGetResponse> localVarReturnType = new TypeReference<GroupGetResponse>() {};
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
