# BasicOperationsApi

All URIs are relative to *https://urlmanager.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**urlManagerChangeUrlRewriteRequestPath**](BasicOperationsApi.md#urlManagerChangeUrlRewriteRequestPath) | **POST** /urlmanager/change_url_rewrite_request_path | Change Url Rewrite Request Path |
| [**urlManagerChangeUrlRewriteRequestPath2**](BasicOperationsApi.md#urlManagerChangeUrlRewriteRequestPath2) | **POST** /urlmanager.UrlManager/ChangeUrlRewriteRequestPath | Change Url Rewrite Request Path |
| [**urlManagerCreateUrlRewrite**](BasicOperationsApi.md#urlManagerCreateUrlRewrite) | **POST** /urlmanager/create_url_rewrite | Create Url Rewrite |
| [**urlManagerCreateUrlRewrite2**](BasicOperationsApi.md#urlManagerCreateUrlRewrite2) | **POST** /urlmanager.UrlManager/CreateUrlRewrite | Create Url Rewrite |
| [**urlManagerDeleteUrlRewrite**](BasicOperationsApi.md#urlManagerDeleteUrlRewrite) | **POST** /urlmanager/delete_url_rewrite | Delete Url Rewrite |
| [**urlManagerDeleteUrlRewrite2**](BasicOperationsApi.md#urlManagerDeleteUrlRewrite2) | **POST** /urlmanager.UrlManager/DeleteUrlRewrite | Delete Url Rewrite |
| [**urlManagerGetUrlRewrite**](BasicOperationsApi.md#urlManagerGetUrlRewrite) | **POST** /urlmanager/get_url_rewrite | Get Url Rewrite |
| [**urlManagerGetUrlRewrite2**](BasicOperationsApi.md#urlManagerGetUrlRewrite2) | **POST** /urlmanager.UrlManager/GetUrlRewrite | Get Url Rewrite |
| [**urlManagerListUrlRewrites**](BasicOperationsApi.md#urlManagerListUrlRewrites) | **POST** /urlmanager/list_url_rewrites | List Url Rewrites |
| [**urlManagerListUrlRewrites2**](BasicOperationsApi.md#urlManagerListUrlRewrites2) | **POST** /urlmanager.UrlManager/ListUrlRewrites | List Url Rewrites |
| [**urlManagerListUrlRewritesByTargetPaths**](BasicOperationsApi.md#urlManagerListUrlRewritesByTargetPaths) | **POST** /urlmanager/list_url_rewrites_by_target_paths | List Url Rewrites By Target Paths |
| [**urlManagerListUrlRewritesByTargetPaths2**](BasicOperationsApi.md#urlManagerListUrlRewritesByTargetPaths2) | **POST** /urlmanager.UrlManager/ListUrlRewritesByTargetPaths | List Url Rewrites By Target Paths |
| [**urlManagerResolveUrlRewrite**](BasicOperationsApi.md#urlManagerResolveUrlRewrite) | **POST** /urlmanager/resolve_url_rewrite | Resolve Url Rewrite |
| [**urlManagerResolveUrlRewrite2**](BasicOperationsApi.md#urlManagerResolveUrlRewrite2) | **POST** /urlmanager.UrlManager/ResolveUrlRewrite | Resolve Url Rewrite |


<a id="urlManagerChangeUrlRewriteRequestPath"></a>
# **urlManagerChangeUrlRewriteRequestPath**
> Object urlManagerChangeUrlRewriteRequestPath(body)

Change Url Rewrite Request Path

Modify the request path of a specific URL rewrite configuration.

### Example
```java
// Import classes:
import GeminiCommerce_Urlmanager.ApiClient;
import GeminiCommerce_Urlmanager.ApiException;
import GeminiCommerce_Urlmanager.Configuration;
import GeminiCommerce_Urlmanager.auth.*;
import GeminiCommerce_Urlmanager.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://urlmanager.api.gogemini.io");
    
    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    UrlmanagerChangeUrlRewriteRequestPathRequest body = new UrlmanagerChangeUrlRewriteRequestPathRequest(); // UrlmanagerChangeUrlRewriteRequestPathRequest | 
    try {
      Object result = apiInstance.urlManagerChangeUrlRewriteRequestPath(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#urlManagerChangeUrlRewriteRequestPath");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UrlmanagerChangeUrlRewriteRequestPathRequest**](UrlmanagerChangeUrlRewriteRequestPathRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="urlManagerChangeUrlRewriteRequestPath2"></a>
# **urlManagerChangeUrlRewriteRequestPath2**
> Object urlManagerChangeUrlRewriteRequestPath2(body)

Change Url Rewrite Request Path

Modify the request path of a specific URL rewrite configuration.

### Example
```java
// Import classes:
import GeminiCommerce_Urlmanager.ApiClient;
import GeminiCommerce_Urlmanager.ApiException;
import GeminiCommerce_Urlmanager.Configuration;
import GeminiCommerce_Urlmanager.auth.*;
import GeminiCommerce_Urlmanager.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://urlmanager.api.gogemini.io");
    
    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    UrlmanagerChangeUrlRewriteRequestPathRequest body = new UrlmanagerChangeUrlRewriteRequestPathRequest(); // UrlmanagerChangeUrlRewriteRequestPathRequest | 
    try {
      Object result = apiInstance.urlManagerChangeUrlRewriteRequestPath2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#urlManagerChangeUrlRewriteRequestPath2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UrlmanagerChangeUrlRewriteRequestPathRequest**](UrlmanagerChangeUrlRewriteRequestPathRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="urlManagerCreateUrlRewrite"></a>
# **urlManagerCreateUrlRewrite**
> UrlmanagerUrlRewrite urlManagerCreateUrlRewrite(body)

Create Url Rewrite

Create a new URL rewrite configuration with customizable rules.

### Example
```java
// Import classes:
import GeminiCommerce_Urlmanager.ApiClient;
import GeminiCommerce_Urlmanager.ApiException;
import GeminiCommerce_Urlmanager.Configuration;
import GeminiCommerce_Urlmanager.auth.*;
import GeminiCommerce_Urlmanager.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://urlmanager.api.gogemini.io");
    
    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    UrlmanagerCreateUrlRewriteRequest body = new UrlmanagerCreateUrlRewriteRequest(); // UrlmanagerCreateUrlRewriteRequest | 
    try {
      UrlmanagerUrlRewrite result = apiInstance.urlManagerCreateUrlRewrite(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#urlManagerCreateUrlRewrite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UrlmanagerCreateUrlRewriteRequest**](UrlmanagerCreateUrlRewriteRequest.md)|  | |

### Return type

[**UrlmanagerUrlRewrite**](UrlmanagerUrlRewrite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="urlManagerCreateUrlRewrite2"></a>
# **urlManagerCreateUrlRewrite2**
> UrlmanagerUrlRewrite urlManagerCreateUrlRewrite2(body)

Create Url Rewrite

Create a new URL rewrite configuration with customizable rules.

### Example
```java
// Import classes:
import GeminiCommerce_Urlmanager.ApiClient;
import GeminiCommerce_Urlmanager.ApiException;
import GeminiCommerce_Urlmanager.Configuration;
import GeminiCommerce_Urlmanager.auth.*;
import GeminiCommerce_Urlmanager.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://urlmanager.api.gogemini.io");
    
    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    UrlmanagerCreateUrlRewriteRequest body = new UrlmanagerCreateUrlRewriteRequest(); // UrlmanagerCreateUrlRewriteRequest | 
    try {
      UrlmanagerUrlRewrite result = apiInstance.urlManagerCreateUrlRewrite2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#urlManagerCreateUrlRewrite2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UrlmanagerCreateUrlRewriteRequest**](UrlmanagerCreateUrlRewriteRequest.md)|  | |

### Return type

[**UrlmanagerUrlRewrite**](UrlmanagerUrlRewrite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="urlManagerDeleteUrlRewrite"></a>
# **urlManagerDeleteUrlRewrite**
> Object urlManagerDeleteUrlRewrite(body)

Delete Url Rewrite

Delete an existing URL rewrite configuration.

### Example
```java
// Import classes:
import GeminiCommerce_Urlmanager.ApiClient;
import GeminiCommerce_Urlmanager.ApiException;
import GeminiCommerce_Urlmanager.Configuration;
import GeminiCommerce_Urlmanager.auth.*;
import GeminiCommerce_Urlmanager.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://urlmanager.api.gogemini.io");
    
    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    UrlmanagerDeleteUrlRewriteRequest body = new UrlmanagerDeleteUrlRewriteRequest(); // UrlmanagerDeleteUrlRewriteRequest | 
    try {
      Object result = apiInstance.urlManagerDeleteUrlRewrite(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#urlManagerDeleteUrlRewrite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UrlmanagerDeleteUrlRewriteRequest**](UrlmanagerDeleteUrlRewriteRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="urlManagerDeleteUrlRewrite2"></a>
# **urlManagerDeleteUrlRewrite2**
> Object urlManagerDeleteUrlRewrite2(body)

Delete Url Rewrite

Delete an existing URL rewrite configuration.

### Example
```java
// Import classes:
import GeminiCommerce_Urlmanager.ApiClient;
import GeminiCommerce_Urlmanager.ApiException;
import GeminiCommerce_Urlmanager.Configuration;
import GeminiCommerce_Urlmanager.auth.*;
import GeminiCommerce_Urlmanager.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://urlmanager.api.gogemini.io");
    
    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    UrlmanagerDeleteUrlRewriteRequest body = new UrlmanagerDeleteUrlRewriteRequest(); // UrlmanagerDeleteUrlRewriteRequest | 
    try {
      Object result = apiInstance.urlManagerDeleteUrlRewrite2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#urlManagerDeleteUrlRewrite2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UrlmanagerDeleteUrlRewriteRequest**](UrlmanagerDeleteUrlRewriteRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="urlManagerGetUrlRewrite"></a>
# **urlManagerGetUrlRewrite**
> UrlmanagerUrlRewrite urlManagerGetUrlRewrite(body)

Get Url Rewrite

Retrieve the details of a specific URL rewrite configuration.

### Example
```java
// Import classes:
import GeminiCommerce_Urlmanager.ApiClient;
import GeminiCommerce_Urlmanager.ApiException;
import GeminiCommerce_Urlmanager.Configuration;
import GeminiCommerce_Urlmanager.auth.*;
import GeminiCommerce_Urlmanager.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://urlmanager.api.gogemini.io");
    
    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    UrlmanagerGetUrlRewriteRequest body = new UrlmanagerGetUrlRewriteRequest(); // UrlmanagerGetUrlRewriteRequest | 
    try {
      UrlmanagerUrlRewrite result = apiInstance.urlManagerGetUrlRewrite(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#urlManagerGetUrlRewrite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UrlmanagerGetUrlRewriteRequest**](UrlmanagerGetUrlRewriteRequest.md)|  | |

### Return type

[**UrlmanagerUrlRewrite**](UrlmanagerUrlRewrite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="urlManagerGetUrlRewrite2"></a>
# **urlManagerGetUrlRewrite2**
> UrlmanagerUrlRewrite urlManagerGetUrlRewrite2(body)

Get Url Rewrite

Retrieve the details of a specific URL rewrite configuration.

### Example
```java
// Import classes:
import GeminiCommerce_Urlmanager.ApiClient;
import GeminiCommerce_Urlmanager.ApiException;
import GeminiCommerce_Urlmanager.Configuration;
import GeminiCommerce_Urlmanager.auth.*;
import GeminiCommerce_Urlmanager.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://urlmanager.api.gogemini.io");
    
    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    UrlmanagerGetUrlRewriteRequest body = new UrlmanagerGetUrlRewriteRequest(); // UrlmanagerGetUrlRewriteRequest | 
    try {
      UrlmanagerUrlRewrite result = apiInstance.urlManagerGetUrlRewrite2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#urlManagerGetUrlRewrite2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UrlmanagerGetUrlRewriteRequest**](UrlmanagerGetUrlRewriteRequest.md)|  | |

### Return type

[**UrlmanagerUrlRewrite**](UrlmanagerUrlRewrite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="urlManagerListUrlRewrites"></a>
# **urlManagerListUrlRewrites**
> UrlmanagerListUrlRewritesResponse urlManagerListUrlRewrites(body)

List Url Rewrites

Retrieve a list of all URL rewrite configurations in your application.

### Example
```java
// Import classes:
import GeminiCommerce_Urlmanager.ApiClient;
import GeminiCommerce_Urlmanager.ApiException;
import GeminiCommerce_Urlmanager.Configuration;
import GeminiCommerce_Urlmanager.auth.*;
import GeminiCommerce_Urlmanager.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://urlmanager.api.gogemini.io");
    
    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    UrlmanagerListUrlRewritesRequest body = new UrlmanagerListUrlRewritesRequest(); // UrlmanagerListUrlRewritesRequest | 
    try {
      UrlmanagerListUrlRewritesResponse result = apiInstance.urlManagerListUrlRewrites(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#urlManagerListUrlRewrites");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UrlmanagerListUrlRewritesRequest**](UrlmanagerListUrlRewritesRequest.md)|  | |

### Return type

[**UrlmanagerListUrlRewritesResponse**](UrlmanagerListUrlRewritesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="urlManagerListUrlRewrites2"></a>
# **urlManagerListUrlRewrites2**
> UrlmanagerListUrlRewritesResponse urlManagerListUrlRewrites2(body)

List Url Rewrites

Retrieve a list of all URL rewrite configurations in your application.

### Example
```java
// Import classes:
import GeminiCommerce_Urlmanager.ApiClient;
import GeminiCommerce_Urlmanager.ApiException;
import GeminiCommerce_Urlmanager.Configuration;
import GeminiCommerce_Urlmanager.auth.*;
import GeminiCommerce_Urlmanager.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://urlmanager.api.gogemini.io");
    
    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    UrlmanagerListUrlRewritesRequest body = new UrlmanagerListUrlRewritesRequest(); // UrlmanagerListUrlRewritesRequest | 
    try {
      UrlmanagerListUrlRewritesResponse result = apiInstance.urlManagerListUrlRewrites2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#urlManagerListUrlRewrites2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UrlmanagerListUrlRewritesRequest**](UrlmanagerListUrlRewritesRequest.md)|  | |

### Return type

[**UrlmanagerListUrlRewritesResponse**](UrlmanagerListUrlRewritesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="urlManagerListUrlRewritesByTargetPaths"></a>
# **urlManagerListUrlRewritesByTargetPaths**
> UrlmanagerListUrlRewritesByTargetPathsRequest urlManagerListUrlRewritesByTargetPaths(body)

List Url Rewrites By Target Paths

Retrieve URL rewrite configurations based on target paths.

### Example
```java
// Import classes:
import GeminiCommerce_Urlmanager.ApiClient;
import GeminiCommerce_Urlmanager.ApiException;
import GeminiCommerce_Urlmanager.Configuration;
import GeminiCommerce_Urlmanager.auth.*;
import GeminiCommerce_Urlmanager.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://urlmanager.api.gogemini.io");
    
    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    UrlmanagerListUrlRewritesByTargetPathsRequest body = new UrlmanagerListUrlRewritesByTargetPathsRequest(); // UrlmanagerListUrlRewritesByTargetPathsRequest | 
    try {
      UrlmanagerListUrlRewritesByTargetPathsRequest result = apiInstance.urlManagerListUrlRewritesByTargetPaths(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#urlManagerListUrlRewritesByTargetPaths");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UrlmanagerListUrlRewritesByTargetPathsRequest**](UrlmanagerListUrlRewritesByTargetPathsRequest.md)|  | |

### Return type

[**UrlmanagerListUrlRewritesByTargetPathsRequest**](UrlmanagerListUrlRewritesByTargetPathsRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="urlManagerListUrlRewritesByTargetPaths2"></a>
# **urlManagerListUrlRewritesByTargetPaths2**
> UrlmanagerListUrlRewritesByTargetPathsRequest urlManagerListUrlRewritesByTargetPaths2(body)

List Url Rewrites By Target Paths

Retrieve URL rewrite configurations based on target paths.

### Example
```java
// Import classes:
import GeminiCommerce_Urlmanager.ApiClient;
import GeminiCommerce_Urlmanager.ApiException;
import GeminiCommerce_Urlmanager.Configuration;
import GeminiCommerce_Urlmanager.auth.*;
import GeminiCommerce_Urlmanager.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://urlmanager.api.gogemini.io");
    
    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    UrlmanagerListUrlRewritesByTargetPathsRequest body = new UrlmanagerListUrlRewritesByTargetPathsRequest(); // UrlmanagerListUrlRewritesByTargetPathsRequest | 
    try {
      UrlmanagerListUrlRewritesByTargetPathsRequest result = apiInstance.urlManagerListUrlRewritesByTargetPaths2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#urlManagerListUrlRewritesByTargetPaths2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UrlmanagerListUrlRewritesByTargetPathsRequest**](UrlmanagerListUrlRewritesByTargetPathsRequest.md)|  | |

### Return type

[**UrlmanagerListUrlRewritesByTargetPathsRequest**](UrlmanagerListUrlRewritesByTargetPathsRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="urlManagerResolveUrlRewrite"></a>
# **urlManagerResolveUrlRewrite**
> UrlmanagerUrlRewrite urlManagerResolveUrlRewrite(body)

Resolve Url Rewrite

Resolve and retrieve the rewritten URL for a given input URL.

### Example
```java
// Import classes:
import GeminiCommerce_Urlmanager.ApiClient;
import GeminiCommerce_Urlmanager.ApiException;
import GeminiCommerce_Urlmanager.Configuration;
import GeminiCommerce_Urlmanager.auth.*;
import GeminiCommerce_Urlmanager.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://urlmanager.api.gogemini.io");
    
    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    UrlmanagerResolveUrlRewriteRequest body = new UrlmanagerResolveUrlRewriteRequest(); // UrlmanagerResolveUrlRewriteRequest | 
    try {
      UrlmanagerUrlRewrite result = apiInstance.urlManagerResolveUrlRewrite(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#urlManagerResolveUrlRewrite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UrlmanagerResolveUrlRewriteRequest**](UrlmanagerResolveUrlRewriteRequest.md)|  | |

### Return type

[**UrlmanagerUrlRewrite**](UrlmanagerUrlRewrite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="urlManagerResolveUrlRewrite2"></a>
# **urlManagerResolveUrlRewrite2**
> UrlmanagerUrlRewrite urlManagerResolveUrlRewrite2(body)

Resolve Url Rewrite

Resolve and retrieve the rewritten URL for a given input URL.

### Example
```java
// Import classes:
import GeminiCommerce_Urlmanager.ApiClient;
import GeminiCommerce_Urlmanager.ApiException;
import GeminiCommerce_Urlmanager.Configuration;
import GeminiCommerce_Urlmanager.auth.*;
import GeminiCommerce_Urlmanager.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://urlmanager.api.gogemini.io");
    
    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    UrlmanagerResolveUrlRewriteRequest body = new UrlmanagerResolveUrlRewriteRequest(); // UrlmanagerResolveUrlRewriteRequest | 
    try {
      UrlmanagerUrlRewrite result = apiInstance.urlManagerResolveUrlRewrite2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#urlManagerResolveUrlRewrite2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UrlmanagerResolveUrlRewriteRequest**](UrlmanagerResolveUrlRewriteRequest.md)|  | |

### Return type

[**UrlmanagerUrlRewrite**](UrlmanagerUrlRewrite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

