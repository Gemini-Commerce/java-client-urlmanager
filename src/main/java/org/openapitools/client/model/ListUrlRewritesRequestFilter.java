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
import org.openapitools.client.model.UrlRewriteRedirectType;

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
 * ListUrlRewritesRequestFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T16:28:34.214643109Z[Etc/UTC]")
public class ListUrlRewritesRequestFilter {
  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private String context;

  public static final String SERIALIZED_NAME_REQUEST_PATH = "requestPath";
  @SerializedName(SERIALIZED_NAME_REQUEST_PATH)
  private String requestPath;

  public static final String SERIALIZED_NAME_TARGET_PATH = "targetPath";
  @SerializedName(SERIALIZED_NAME_TARGET_PATH)
  private String targetPath;

  public static final String SERIALIZED_NAME_REDIRECT_TYPE = "redirectType";
  @SerializedName(SERIALIZED_NAME_REDIRECT_TYPE)
  private UrlRewriteRedirectType redirectType = UrlRewriteRedirectType.UNKNOWN;

  public ListUrlRewritesRequestFilter() {
  }

  public ListUrlRewritesRequestFilter context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }


  public ListUrlRewritesRequestFilter requestPath(String requestPath) {
    this.requestPath = requestPath;
    return this;
  }

   /**
   * Get requestPath
   * @return requestPath
  **/
  @javax.annotation.Nullable
  public String getRequestPath() {
    return requestPath;
  }

  public void setRequestPath(String requestPath) {
    this.requestPath = requestPath;
  }


  public ListUrlRewritesRequestFilter targetPath(String targetPath) {
    this.targetPath = targetPath;
    return this;
  }

   /**
   * Get targetPath
   * @return targetPath
  **/
  @javax.annotation.Nullable
  public String getTargetPath() {
    return targetPath;
  }

  public void setTargetPath(String targetPath) {
    this.targetPath = targetPath;
  }


  public ListUrlRewritesRequestFilter redirectType(UrlRewriteRedirectType redirectType) {
    this.redirectType = redirectType;
    return this;
  }

   /**
   * Get redirectType
   * @return redirectType
  **/
  @javax.annotation.Nullable
  public UrlRewriteRedirectType getRedirectType() {
    return redirectType;
  }

  public void setRedirectType(UrlRewriteRedirectType redirectType) {
    this.redirectType = redirectType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUrlRewritesRequestFilter listUrlRewritesRequestFilter = (ListUrlRewritesRequestFilter) o;
    return Objects.equals(this.context, listUrlRewritesRequestFilter.context) &&
        Objects.equals(this.requestPath, listUrlRewritesRequestFilter.requestPath) &&
        Objects.equals(this.targetPath, listUrlRewritesRequestFilter.targetPath) &&
        Objects.equals(this.redirectType, listUrlRewritesRequestFilter.redirectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, requestPath, targetPath, redirectType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUrlRewritesRequestFilter {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    requestPath: ").append(toIndentedString(requestPath)).append("\n");
    sb.append("    targetPath: ").append(toIndentedString(targetPath)).append("\n");
    sb.append("    redirectType: ").append(toIndentedString(redirectType)).append("\n");
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
    openapiFields.add("context");
    openapiFields.add("requestPath");
    openapiFields.add("targetPath");
    openapiFields.add("redirectType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListUrlRewritesRequestFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListUrlRewritesRequestFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListUrlRewritesRequestFilter is not found in the empty JSON string", ListUrlRewritesRequestFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListUrlRewritesRequestFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListUrlRewritesRequestFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("context") != null && !jsonObj.get("context").isJsonNull()) && !jsonObj.get("context").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `context` to be a primitive type in the JSON string but got `%s`", jsonObj.get("context").toString()));
      }
      if ((jsonObj.get("requestPath") != null && !jsonObj.get("requestPath").isJsonNull()) && !jsonObj.get("requestPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestPath").toString()));
      }
      if ((jsonObj.get("targetPath") != null && !jsonObj.get("targetPath").isJsonNull()) && !jsonObj.get("targetPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetPath").toString()));
      }
      // validate the optional field `redirectType`
      if (jsonObj.get("redirectType") != null && !jsonObj.get("redirectType").isJsonNull()) {
        UrlRewriteRedirectType.validateJsonElement(jsonObj.get("redirectType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListUrlRewritesRequestFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListUrlRewritesRequestFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListUrlRewritesRequestFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListUrlRewritesRequestFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<ListUrlRewritesRequestFilter>() {
           @Override
           public void write(JsonWriter out, ListUrlRewritesRequestFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListUrlRewritesRequestFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListUrlRewritesRequestFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListUrlRewritesRequestFilter
  * @throws IOException if the JSON string is invalid with respect to ListUrlRewritesRequestFilter
  */
  public static ListUrlRewritesRequestFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListUrlRewritesRequestFilter.class);
  }

 /**
  * Convert an instance of ListUrlRewritesRequestFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

