/*
 * Url Manager Service
 * The URL Manager service provides a set of APIs for managing URL rewrites within your application. URL rewriting is a technique used to modify the appearance or structure of URLs while maintaining the functionality and accessibility of the underlying resources.  The URL Manager service offers various operations to create, retrieve, update, and delete URL rewrite configurations. These configurations allow you to define rules that map incoming URLs to different paths or destinations based on specific criteria. By using URL rewriting, you can enhance the user experience, improve SEO (Search Engine Optimization), and manage complex URL structures effectively.  To get started with the URL Manager service, you need to integrate the provided Proto API into your application. The API supports various programming languages and frameworks, making it easy to incorporate URL rewriting functionality into your existing codebase.  Once integrated, you can utilize the different API methods to create, manage, and query URL rewrite configurations based on your application's requirements.  Refer to the API documentation for detailed information on the request and response formats, authentication requirements, and example usage of each API method.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_Urlmanager.JSON;

/**
 * UrlmanagerResolveUrlRewriteRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T16:28:34.214643109Z[Etc/UTC]")
public class UrlmanagerResolveUrlRewriteRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private String context;

  public static final String SERIALIZED_NAME_REQUEST_PATH = "requestPath";
  @SerializedName(SERIALIZED_NAME_REQUEST_PATH)
  private String requestPath;

  public UrlmanagerResolveUrlRewriteRequest() {
  }

  public UrlmanagerResolveUrlRewriteRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Required.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public UrlmanagerResolveUrlRewriteRequest context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Required.
   * @return context
  **/
  @javax.annotation.Nullable
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }


  public UrlmanagerResolveUrlRewriteRequest requestPath(String requestPath) {
    this.requestPath = requestPath;
    return this;
  }

   /**
   * Required.
   * @return requestPath
  **/
  @javax.annotation.Nullable
  public String getRequestPath() {
    return requestPath;
  }

  public void setRequestPath(String requestPath) {
    this.requestPath = requestPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlmanagerResolveUrlRewriteRequest urlmanagerResolveUrlRewriteRequest = (UrlmanagerResolveUrlRewriteRequest) o;
    return Objects.equals(this.tenantId, urlmanagerResolveUrlRewriteRequest.tenantId) &&
        Objects.equals(this.context, urlmanagerResolveUrlRewriteRequest.context) &&
        Objects.equals(this.requestPath, urlmanagerResolveUrlRewriteRequest.requestPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, context, requestPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlmanagerResolveUrlRewriteRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    requestPath: ").append(toIndentedString(requestPath)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("tenantId");
    openapiFields.add("context");
    openapiFields.add("requestPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UrlmanagerResolveUrlRewriteRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlmanagerResolveUrlRewriteRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlmanagerResolveUrlRewriteRequest is not found in the empty JSON string", UrlmanagerResolveUrlRewriteRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UrlmanagerResolveUrlRewriteRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlmanagerResolveUrlRewriteRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("context") != null && !jsonObj.get("context").isJsonNull()) && !jsonObj.get("context").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `context` to be a primitive type in the JSON string but got `%s`", jsonObj.get("context").toString()));
      }
      if ((jsonObj.get("requestPath") != null && !jsonObj.get("requestPath").isJsonNull()) && !jsonObj.get("requestPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestPath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlmanagerResolveUrlRewriteRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlmanagerResolveUrlRewriteRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlmanagerResolveUrlRewriteRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlmanagerResolveUrlRewriteRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlmanagerResolveUrlRewriteRequest>() {
           @Override
           public void write(JsonWriter out, UrlmanagerResolveUrlRewriteRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlmanagerResolveUrlRewriteRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlmanagerResolveUrlRewriteRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlmanagerResolveUrlRewriteRequest
  * @throws IOException if the JSON string is invalid with respect to UrlmanagerResolveUrlRewriteRequest
  */
  public static UrlmanagerResolveUrlRewriteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlmanagerResolveUrlRewriteRequest.class);
  }

 /**
  * Convert an instance of UrlmanagerResolveUrlRewriteRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

