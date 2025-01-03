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
import org.openapitools.client.model.ListUrlRewritesRequestFilter;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.Urlmanager.JSON;

/**
 * UrlmanagerListUrlRewritesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T16:45:09.045546625Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UrlmanagerListUrlRewritesRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private ListUrlRewritesRequestFilter filter;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize;

  public static final String SERIALIZED_NAME_PAGE_TOKEN = "pageToken";
  @SerializedName(SERIALIZED_NAME_PAGE_TOKEN)
  private String pageToken;

  public UrlmanagerListUrlRewritesRequest() {
  }

  public UrlmanagerListUrlRewritesRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Required.
   * @return tenantId
   */
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public UrlmanagerListUrlRewritesRequest filter(ListUrlRewritesRequestFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   */
  @javax.annotation.Nullable
  public ListUrlRewritesRequestFilter getFilter() {
    return filter;
  }

  public void setFilter(ListUrlRewritesRequestFilter filter) {
    this.filter = filter;
  }


  public UrlmanagerListUrlRewritesRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The maximum number of url rewrites to return. The service may return fewer than this value. If unspecified, at most 10 url rewrites will be returned. The maximum value is 200; values above 200 will be coerced to 200.
   * @return pageSize
   */
  @javax.annotation.Nullable
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public UrlmanagerListUrlRewritesRequest pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * A page token, received from a previous &#x60;ListUrlRewrites&#x60; call. Provide this to retrieve the subsequent page.   When paginating, all other parameters provided to &#x60;ListUrlRewrites&#x60; must match the call that provided the page token.
   * @return pageToken
   */
  @javax.annotation.Nullable
  public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the UrlmanagerListUrlRewritesRequest instance itself
   */
  public UrlmanagerListUrlRewritesRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlmanagerListUrlRewritesRequest urlmanagerListUrlRewritesRequest = (UrlmanagerListUrlRewritesRequest) o;
    return Objects.equals(this.tenantId, urlmanagerListUrlRewritesRequest.tenantId) &&
        Objects.equals(this.filter, urlmanagerListUrlRewritesRequest.filter) &&
        Objects.equals(this.pageSize, urlmanagerListUrlRewritesRequest.pageSize) &&
        Objects.equals(this.pageToken, urlmanagerListUrlRewritesRequest.pageToken)&&
        Objects.equals(this.additionalProperties, urlmanagerListUrlRewritesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, filter, pageSize, pageToken, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlmanagerListUrlRewritesRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("filter");
    openapiFields.add("pageSize");
    openapiFields.add("pageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UrlmanagerListUrlRewritesRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlmanagerListUrlRewritesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlmanagerListUrlRewritesRequest is not found in the empty JSON string", UrlmanagerListUrlRewritesRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      // validate the optional field `filter`
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) {
        ListUrlRewritesRequestFilter.validateJsonElement(jsonObj.get("filter"));
      }
      if ((jsonObj.get("pageToken") != null && !jsonObj.get("pageToken").isJsonNull()) && !jsonObj.get("pageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlmanagerListUrlRewritesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlmanagerListUrlRewritesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlmanagerListUrlRewritesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlmanagerListUrlRewritesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlmanagerListUrlRewritesRequest>() {
           @Override
           public void write(JsonWriter out, UrlmanagerListUrlRewritesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlmanagerListUrlRewritesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UrlmanagerListUrlRewritesRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UrlmanagerListUrlRewritesRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UrlmanagerListUrlRewritesRequest
   * @throws IOException if the JSON string is invalid with respect to UrlmanagerListUrlRewritesRequest
   */
  public static UrlmanagerListUrlRewritesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlmanagerListUrlRewritesRequest.class);
  }

  /**
   * Convert an instance of UrlmanagerListUrlRewritesRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

