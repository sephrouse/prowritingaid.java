/*
 * ProWritingAid API V2
 * Official ProWritingAid API Version 2
 *
 * OpenAPI spec version: v2
 * Contact: hello@prowritingaid.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.AsyncResponseContextualThesaurusResponse;
import io.swagger.client.model.ContextualThesaurusRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContextualThesaurusApi {
    private ApiClient apiClient;

    public ContextualThesaurusApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContextualThesaurusApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for get
     * @param taskId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCall(String taskId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/async/contextualthesaurus/result/{taskId}"
            .replaceAll("\\{" + "taskId" + "\\}", apiClient.escapeString(taskId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "licenseCode" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getValidateBeforeCall(String taskId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException("Missing the required parameter 'taskId' when calling get(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getCall(taskId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Tries to get the result of a request using the task id of the request
     * Tries to get the result of a request using the task id of the request
     * @param taskId  (required)
     * @return AsyncResponseContextualThesaurusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsyncResponseContextualThesaurusResponse get(String taskId) throws ApiException {
        ApiResponse<AsyncResponseContextualThesaurusResponse> resp = getWithHttpInfo(taskId);
        return resp.getData();
    }

    /**
     * Tries to get the result of a request using the task id of the request
     * Tries to get the result of a request using the task id of the request
     * @param taskId  (required)
     * @return ApiResponse&lt;AsyncResponseContextualThesaurusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AsyncResponseContextualThesaurusResponse> getWithHttpInfo(String taskId) throws ApiException {
        com.squareup.okhttp.Call call = getValidateBeforeCall(taskId, null, null);
        Type localVarReturnType = new TypeToken<AsyncResponseContextualThesaurusResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Tries to get the result of a request using the task id of the request (asynchronously)
     * Tries to get the result of a request using the task id of the request
     * @param taskId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAsync(String taskId, final ApiCallback<AsyncResponseContextualThesaurusResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getValidateBeforeCall(taskId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsyncResponseContextualThesaurusResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for post
     * @param requestp  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postCall(ContextualThesaurusRequest requestp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestp;
        
        // create path and map variables
        String localVarPath = "/api/async/contextualthesaurus";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "licenseCode" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postValidateBeforeCall(ContextualThesaurusRequest requestp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'requestp' is set
        if (requestp == null) {
            throw new ApiException("Missing the required parameter 'requestp' when calling post(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postCall(requestp, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Analyses text and returns contextual thesaurus entries
     * Analyses text and returns contextual thesaurus entries
     * @param requestp  (required)
     * @return AsyncResponseContextualThesaurusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsyncResponseContextualThesaurusResponse post(ContextualThesaurusRequest requestp) throws ApiException {
        ApiResponse<AsyncResponseContextualThesaurusResponse> resp = postWithHttpInfo(requestp);
        return resp.getData();
    }

    /**
     * Analyses text and returns contextual thesaurus entries
     * Analyses text and returns contextual thesaurus entries
     * @param requestp  (required)
     * @return ApiResponse&lt;AsyncResponseContextualThesaurusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AsyncResponseContextualThesaurusResponse> postWithHttpInfo(ContextualThesaurusRequest requestp) throws ApiException {
        com.squareup.okhttp.Call call = postValidateBeforeCall(requestp, null, null);
        Type localVarReturnType = new TypeToken<AsyncResponseContextualThesaurusResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Analyses text and returns contextual thesaurus entries (asynchronously)
     * Analyses text and returns contextual thesaurus entries
     * @param requestp  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAsync(ContextualThesaurusRequest requestp, final ApiCallback<AsyncResponseContextualThesaurusResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postValidateBeforeCall(requestp, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsyncResponseContextualThesaurusResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
