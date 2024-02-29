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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.UrlmanagerUrlRewrite;

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
 * UrlmanagerListUrlRewritesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T16:28:34.214643109Z[Etc/UTC]")
public class UrlmanagerListUrlRewritesResponse {
  public static final String SERIALIZED_NAME_URL_REWRITES = "urlRewrites";
  @SerializedName(SERIALIZED_NAME_URL_REWRITES)
  private List<UrlmanagerUrlRewrite> urlRewrites;

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public UrlmanagerListUrlRewritesResponse() {
  }

  public UrlmanagerListUrlRewritesResponse urlRewrites(List<UrlmanagerUrlRewrite> urlRewrites) {
    this.urlRewrites = urlRewrites;
    return this;
  }

  public UrlmanagerListUrlRewritesResponse addUrlRewritesItem(UrlmanagerUrlRewrite urlRewritesItem) {
    if (this.urlRewrites == null) {
      this.urlRewrites = new ArrayList<>();
    }
    this.urlRewrites.add(urlRewritesItem);
    return this;
  }

   /**
   * Get urlRewrites
   * @return urlRewrites
  **/
  @javax.annotation.Nullable
  public List<UrlmanagerUrlRewrite> getUrlRewrites() {
    return urlRewrites;
  }

  public void setUrlRewrites(List<UrlmanagerUrlRewrite> urlRewrites) {
    this.urlRewrites = urlRewrites;
  }


  public UrlmanagerListUrlRewritesResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * A token that can be sent as &#x60;page_token&#x60; to retrieve the next page. If this field is omitted, there are no subsequent pages.
   * @return nextPageToken
  **/
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlmanagerListUrlRewritesResponse urlmanagerListUrlRewritesResponse = (UrlmanagerListUrlRewritesResponse) o;
    return Objects.equals(this.urlRewrites, urlmanagerListUrlRewritesResponse.urlRewrites) &&
        Objects.equals(this.nextPageToken, urlmanagerListUrlRewritesResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlRewrites, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlmanagerListUrlRewritesResponse {\n");
    sb.append("    urlRewrites: ").append(toIndentedString(urlRewrites)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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
    openapiFields.add("urlRewrites");
    openapiFields.add("nextPageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UrlmanagerListUrlRewritesResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlmanagerListUrlRewritesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlmanagerListUrlRewritesResponse is not found in the empty JSON string", UrlmanagerListUrlRewritesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UrlmanagerListUrlRewritesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlmanagerListUrlRewritesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("urlRewrites") != null && !jsonObj.get("urlRewrites").isJsonNull()) {
        JsonArray jsonArrayurlRewrites = jsonObj.getAsJsonArray("urlRewrites");
        if (jsonArrayurlRewrites != null) {
          // ensure the json data is an array
          if (!jsonObj.get("urlRewrites").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `urlRewrites` to be an array in the JSON string but got `%s`", jsonObj.get("urlRewrites").toString()));
          }

          // validate the optional field `urlRewrites` (array)
          for (int i = 0; i < jsonArrayurlRewrites.size(); i++) {
            UrlmanagerUrlRewrite.validateJsonElement(jsonArrayurlRewrites.get(i));
          };
        }
      }
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlmanagerListUrlRewritesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlmanagerListUrlRewritesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlmanagerListUrlRewritesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlmanagerListUrlRewritesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlmanagerListUrlRewritesResponse>() {
           @Override
           public void write(JsonWriter out, UrlmanagerListUrlRewritesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlmanagerListUrlRewritesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlmanagerListUrlRewritesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlmanagerListUrlRewritesResponse
  * @throws IOException if the JSON string is invalid with respect to UrlmanagerListUrlRewritesResponse
  */
  public static UrlmanagerListUrlRewritesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlmanagerListUrlRewritesResponse.class);
  }

 /**
  * Convert an instance of UrlmanagerListUrlRewritesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

