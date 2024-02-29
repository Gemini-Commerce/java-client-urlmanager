# openapi-java-client

Url Manager Service
- API version: 1.0.0
  - Build date: 2024-02-29T16:28:34.214643109Z[Etc/UTC]

The URL Manager service provides a set of APIs for managing URL rewrites within your application. URL rewriting is a technique used to modify the appearance or structure of URLs while maintaining the functionality and accessibility of the underlying resources.

The URL Manager service offers various operations to create, retrieve, update, and delete URL rewrite configurations. These configurations allow you to define rules that map incoming URLs to different paths or destinations based on specific criteria. By using URL rewriting, you can enhance the user experience, improve SEO (Search Engine Optimization), and manage complex URL structures effectively.

To get started with the URL Manager service, you need to integrate the provided Proto API into your application. The API supports various programming languages and frameworks, making it easy to incorporate URL rewriting functionality into your existing codebase.

Once integrated, you can utilize the different API methods to create, manage, and query URL rewrite configurations based on your application's requirements.

Refer to the API documentation for detailed information on the request and response formats, authentication requirements, and example usage of each API method.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.1.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://urlmanager.api.gogemini.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BasicOperationsApi* | [**urlManagerChangeUrlRewriteRequestPath**](docs/BasicOperationsApi.md#urlManagerChangeUrlRewriteRequestPath) | **POST** /urlmanager/change_url_rewrite_request_path | Change Url Rewrite Request Path
*BasicOperationsApi* | [**urlManagerChangeUrlRewriteRequestPath2**](docs/BasicOperationsApi.md#urlManagerChangeUrlRewriteRequestPath2) | **POST** /urlmanager.UrlManager/ChangeUrlRewriteRequestPath | Change Url Rewrite Request Path
*BasicOperationsApi* | [**urlManagerCreateUrlRewrite**](docs/BasicOperationsApi.md#urlManagerCreateUrlRewrite) | **POST** /urlmanager/create_url_rewrite | Create Url Rewrite
*BasicOperationsApi* | [**urlManagerCreateUrlRewrite2**](docs/BasicOperationsApi.md#urlManagerCreateUrlRewrite2) | **POST** /urlmanager.UrlManager/CreateUrlRewrite | Create Url Rewrite
*BasicOperationsApi* | [**urlManagerDeleteUrlRewrite**](docs/BasicOperationsApi.md#urlManagerDeleteUrlRewrite) | **POST** /urlmanager/delete_url_rewrite | Delete Url Rewrite
*BasicOperationsApi* | [**urlManagerDeleteUrlRewrite2**](docs/BasicOperationsApi.md#urlManagerDeleteUrlRewrite2) | **POST** /urlmanager.UrlManager/DeleteUrlRewrite | Delete Url Rewrite
*BasicOperationsApi* | [**urlManagerGetUrlRewrite**](docs/BasicOperationsApi.md#urlManagerGetUrlRewrite) | **POST** /urlmanager/get_url_rewrite | Get Url Rewrite
*BasicOperationsApi* | [**urlManagerGetUrlRewrite2**](docs/BasicOperationsApi.md#urlManagerGetUrlRewrite2) | **POST** /urlmanager.UrlManager/GetUrlRewrite | Get Url Rewrite
*BasicOperationsApi* | [**urlManagerListUrlRewrites**](docs/BasicOperationsApi.md#urlManagerListUrlRewrites) | **POST** /urlmanager/list_url_rewrites | List Url Rewrites
*BasicOperationsApi* | [**urlManagerListUrlRewrites2**](docs/BasicOperationsApi.md#urlManagerListUrlRewrites2) | **POST** /urlmanager.UrlManager/ListUrlRewrites | List Url Rewrites
*BasicOperationsApi* | [**urlManagerListUrlRewritesByTargetPaths**](docs/BasicOperationsApi.md#urlManagerListUrlRewritesByTargetPaths) | **POST** /urlmanager/list_url_rewrites_by_target_paths | List Url Rewrites By Target Paths
*BasicOperationsApi* | [**urlManagerListUrlRewritesByTargetPaths2**](docs/BasicOperationsApi.md#urlManagerListUrlRewritesByTargetPaths2) | **POST** /urlmanager.UrlManager/ListUrlRewritesByTargetPaths | List Url Rewrites By Target Paths
*BasicOperationsApi* | [**urlManagerResolveUrlRewrite**](docs/BasicOperationsApi.md#urlManagerResolveUrlRewrite) | **POST** /urlmanager/resolve_url_rewrite | Resolve Url Rewrite
*BasicOperationsApi* | [**urlManagerResolveUrlRewrite2**](docs/BasicOperationsApi.md#urlManagerResolveUrlRewrite2) | **POST** /urlmanager.UrlManager/ResolveUrlRewrite | Resolve Url Rewrite


## Documentation for Models

 - [GetUrlRewriteRequestCompoundIdentifier](docs/GetUrlRewriteRequestCompoundIdentifier.md)
 - [ListUrlRewritesRequestFilter](docs/ListUrlRewritesRequestFilter.md)
 - [ProtobufAny](docs/ProtobufAny.md)
 - [RpcStatus](docs/RpcStatus.md)
 - [UrlRewriteLinkRel](docs/UrlRewriteLinkRel.md)
 - [UrlRewriteRedirectType](docs/UrlRewriteRedirectType.md)
 - [UrlmanagerChangeUrlRewriteRequestPathRequest](docs/UrlmanagerChangeUrlRewriteRequestPathRequest.md)
 - [UrlmanagerCreateUrlRewriteRequest](docs/UrlmanagerCreateUrlRewriteRequest.md)
 - [UrlmanagerDeleteUrlRewriteRequest](docs/UrlmanagerDeleteUrlRewriteRequest.md)
 - [UrlmanagerGetUrlRewriteRequest](docs/UrlmanagerGetUrlRewriteRequest.md)
 - [UrlmanagerListUrlRewritesByTargetPathsRequest](docs/UrlmanagerListUrlRewritesByTargetPathsRequest.md)
 - [UrlmanagerListUrlRewritesByTargetPathsResponse](docs/UrlmanagerListUrlRewritesByTargetPathsResponse.md)
 - [UrlmanagerListUrlRewritesRequest](docs/UrlmanagerListUrlRewritesRequest.md)
 - [UrlmanagerListUrlRewritesResponse](docs/UrlmanagerListUrlRewritesResponse.md)
 - [UrlmanagerResolveUrlRewriteRequest](docs/UrlmanagerResolveUrlRewriteRequest.md)
 - [UrlmanagerUrlRewrite](docs/UrlmanagerUrlRewrite.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@gemini-commerce.com

