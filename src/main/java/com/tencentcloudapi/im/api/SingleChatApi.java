package com.tencentcloudapi.im.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.tencentcloudapi.im.ApiException;
import com.tencentcloudapi.im.ApiClient;
import com.tencentcloudapi.im.Configuration;
import com.tencentcloudapi.im.model.*;
import com.tencentcloudapi.im.Pair;

import com.tencentcloudapi.im.model.BatchSendSingleChatMsgRequest;
import com.tencentcloudapi.im.model.BatchSendSingleChatMsgResponse;
import com.tencentcloudapi.im.model.CommonResponse;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumRequest;
import com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponse;
import com.tencentcloudapi.im.model.GetRoamMsgRequest;
import com.tencentcloudapi.im.model.GetRoamMsgResponse;
import com.tencentcloudapi.im.model.ImportMsgRequest;
import com.tencentcloudapi.im.model.MsgWithdrawRequest;
import com.tencentcloudapi.im.model.SendSingleChatMsgRequest;
import com.tencentcloudapi.im.model.SendSingleChatMsgResponse;
import com.tencentcloudapi.im.model.SetMsgReadRequest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleChatApi {
  private ApiClient apiClient;

  public SingleChatApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SingleChatApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 查询单聊消息（https://cloud.tencent.com/document/product/269/42794）
   * 
   * @param random  (required)
   * @param getRoamMsgRequest  (optional)
   * @return GetRoamMsgResponse
   * @throws ApiException if fails to make API call
   */
  public GetRoamMsgResponse adminGetroammsg(Integer random, GetRoamMsgRequest getRoamMsgRequest) throws ApiException {
    Object localVarPostBody = getRoamMsgRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling adminGetroammsg");
    }
    
    // create path and map variables
    String localVarPath = "/v4/openim/admin_getroammsg";

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

    TypeReference<GetRoamMsgResponse> localVarReturnType = new TypeReference<GetRoamMsgResponse>() {};
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
   * 撤回单聊消息（https://cloud.tencent.com/document/product/269/38980）
   * 
   * @param random  (required)
   * @param msgWithdrawRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse adminMsgwithdraw(Integer random, MsgWithdrawRequest msgWithdrawRequest) throws ApiException {
    Object localVarPostBody = msgWithdrawRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling adminMsgwithdraw");
    }
    
    // create path and map variables
    String localVarPath = "/v4/openim/admin_msgwithdraw";

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
   * 设置单聊消息已读（https://cloud.tencent.com/document/product/269/50349）
   * 
   * @param random  (required)
   * @param setMsgReadRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse adminSetMsgRead(Integer random, SetMsgReadRequest setMsgReadRequest) throws ApiException {
    Object localVarPostBody = setMsgReadRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling adminSetMsgRead");
    }
    
    // create path and map variables
    String localVarPath = "/v4/openim/admin_set_msg_read";

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
   * 批量发单聊消息（https://cloud.tencent.com/document/product/269/1612）
   * 
   * @param random  (required)
   * @param batchSendSingleChatMsgRequest  (optional)
   * @return BatchSendSingleChatMsgResponse
   * @throws ApiException if fails to make API call
   */
  public BatchSendSingleChatMsgResponse batchsendmsg(Integer random, BatchSendSingleChatMsgRequest batchSendSingleChatMsgRequest) throws ApiException {
    Object localVarPostBody = batchSendSingleChatMsgRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling batchsendmsg");
    }
    
    // create path and map variables
    String localVarPath = "/v4/openim/batchsendmsg";

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

    TypeReference<BatchSendSingleChatMsgResponse> localVarReturnType = new TypeReference<BatchSendSingleChatMsgResponse>() {};
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
   * 查询单聊未读消息计数（https://cloud.tencent.com/document/product/269/56043）
   * 
   * @param random  (required)
   * @param getC2cUnreadMsgNumRequest  (optional)
   * @return GetC2cUnreadMsgNumResponse
   * @throws ApiException if fails to make API call
   */
  public GetC2cUnreadMsgNumResponse getC2cUnreadMsgNum(Integer random, GetC2cUnreadMsgNumRequest getC2cUnreadMsgNumRequest) throws ApiException {
    Object localVarPostBody = getC2cUnreadMsgNumRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling getC2cUnreadMsgNum");
    }
    
    // create path and map variables
    String localVarPath = "/v4/openim/get_c2c_unread_msg_num";

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

    TypeReference<GetC2cUnreadMsgNumResponse> localVarReturnType = new TypeReference<GetC2cUnreadMsgNumResponse>() {};
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
   * 导入单聊消息（https://cloud.tencent.com/document/product/269/2568）
   * 
   * @param random  (required)
   * @param importMsgRequest  (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse importmsg(Integer random, ImportMsgRequest importMsgRequest) throws ApiException {
    Object localVarPostBody = importMsgRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling importmsg");
    }
    
    // create path and map variables
    String localVarPath = "/v4/openim/importmsg";

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
   * 单发单聊消息（https://cloud.tencent.com/document/product/269/2282）
   * 
   * @param random  (required)
   * @param sendSingleChatMsgRequest  (optional)
   * @return SendSingleChatMsgResponse
   * @throws ApiException if fails to make API call
   */
  public SendSingleChatMsgResponse sendmsg(Integer random, SendSingleChatMsgRequest sendSingleChatMsgRequest) throws ApiException {
    Object localVarPostBody = sendSingleChatMsgRequest;
    
    // verify the required parameter 'random' is set
    if (random == null) {
      throw new ApiException(400, "Missing the required parameter 'random' when calling sendmsg");
    }
    
    // create path and map variables
    String localVarPath = "/v4/openim/sendmsg";

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

    TypeReference<SendSingleChatMsgResponse> localVarReturnType = new TypeReference<SendSingleChatMsgResponse>() {};
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
