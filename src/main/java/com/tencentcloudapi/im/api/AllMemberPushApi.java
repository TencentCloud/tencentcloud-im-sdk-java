package com.tencentcloudapi.im.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.model.*;
import com.tencentcloudapi.im.Pair;

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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllMemberPushApi {
  private ApiClient apiClient;

  public AllMemberPushApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AllMemberPushApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 添加用户标签（https://cloud.tencent.com/document/product/269/45941）
   * 
   * @param random  (required)
   * @param imAddTagRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse imAddTag(Integer random, ImAddTagRequest imAddTagRequest) throws ApiException {
    Object localVarPostBody = imAddTagRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling imAddTag");
    }
    
    // create path and map variables
    String localVarPath = "/v4/all_member_push/im_add_tag";

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
   * 获取用户属性（https://cloud.tencent.com/document/product/269/45937）
   * 
   * @param random  (required)
   * @param imGetAttrRequest  (optional)
   * @return ImGetAttrResponse
   * @throws ApiException if fails to make API call
   */
  public ImGetAttrResponse imGetAttr(Integer random, ImGetAttrRequest imGetAttrRequest) throws ApiException {
    Object localVarPostBody = imGetAttrRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling imGetAttr");
    }
    
    // create path and map variables
    String localVarPath = "/v4/all_member_push/im_get_attr";

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

    TypeReference<ImGetAttrResponse> localVarReturnType = new TypeReference<ImGetAttrResponse>() {};
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
   * 获取应用属性名称（https://cloud.tencent.com/document/product/269/45936）
   * 
   * @param random  (required)
   * @param body  (optional)
   * @return ImGetAttrNameResponse
   * @throws ApiException if fails to make API call
   */
  public ImGetAttrNameResponse imGetAttrName(Integer random, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling imGetAttrName");
    }
    
    // create path and map variables
    String localVarPath = "/v4/all_member_push/im_get_attr_name";

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

    TypeReference<ImGetAttrNameResponse> localVarReturnType = new TypeReference<ImGetAttrNameResponse>() {};
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
   * 获取用户标签（https://cloud.tencent.com/document/product/269/45940）
   * 
   * @param random  (required)
   * @param imGetTagRequest  (optional)
   * @return ImGetTagResponse
   * @throws ApiException if fails to make API call
   */
  public ImGetTagResponse imGetTag(Integer random, ImGetTagRequest imGetTagRequest) throws ApiException {
    Object localVarPostBody = imGetTagRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling imGetTag");
    }
    
    // create path and map variables
    String localVarPath = "/v4/all_member_push/im_get_tag";

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

    TypeReference<ImGetTagResponse> localVarReturnType = new TypeReference<ImGetTagResponse>() {};
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
   * 全员推送（https://cloud.tencent.com/document/product/269/45934）
   * 
   * @param random  (required)
   * @param imPushRequest  (optional)
   * @return ImPushResponse
   * @throws ApiException if fails to make API call
   */
  public ImPushResponse imPush(Integer random, ImPushRequest imPushRequest) throws ApiException {
    Object localVarPostBody = imPushRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling imPush");
    }
    
    // create path and map variables
    String localVarPath = "/v4/all_member_push/im_push";

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

    TypeReference<ImPushResponse> localVarReturnType = new TypeReference<ImPushResponse>() {};
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
   * 删除用户所有标签（https://cloud.tencent.com/document/product/269/45943）
   * 
   * @param random  (required)
   * @param imRemoveAllTagRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse imRemoveAllTags(Integer random, ImRemoveAllTagRequest imRemoveAllTagRequest) throws ApiException {
    Object localVarPostBody = imRemoveAllTagRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling imRemoveAllTags");
    }
    
    // create path and map variables
    String localVarPath = "/v4/all_member_push/im_remove_all_tags";

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
   * 删除用户属性（https://cloud.tencent.com/document/product/269/45939）
   * 
   * @param random  (required)
   * @param imRemoveAttrRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse imRemoveAttr(Integer random, ImRemoveAttrRequest imRemoveAttrRequest) throws ApiException {
    Object localVarPostBody = imRemoveAttrRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling imRemoveAttr");
    }
    
    // create path and map variables
    String localVarPath = "/v4/all_member_push/im_remove_attr";

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
   * 删除用户标签（https://cloud.tencent.com/document/product/269/45942）
   * 
   * @param random  (required)
   * @param imRemoveTagRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse imRemoveTag(Integer random, ImRemoveTagRequest imRemoveTagRequest) throws ApiException {
    Object localVarPostBody = imRemoveTagRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling imRemoveTag");
    }
    
    // create path and map variables
    String localVarPath = "/v4/all_member_push/im_remove_tag";

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
   * 设置用户属性（https://cloud.tencent.com/document/product/269/45938）
   * 
   * @param random  (required)
   * @param imSetAttrRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse imSetAttr(Integer random, ImSetAttrRequest imSetAttrRequest) throws ApiException {
    Object localVarPostBody = imSetAttrRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling imSetAttr");
    }
    
    // create path and map variables
    String localVarPath = "/v4/all_member_push/im_set_attr";

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
   * 设置应用属性名称（https://cloud.tencent.com/document/product/269/45935）
   * 
   * @param random  (required)
   * @param imSetAttrNameRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse imSetAttrName(Integer random, ImSetAttrNameRequest imSetAttrNameRequest) throws ApiException {
    Object localVarPostBody = imSetAttrNameRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling imSetAttrName");
    }
    
    // create path and map variables
    String localVarPath = "/v4/all_member_push/im_set_attr_name";

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
