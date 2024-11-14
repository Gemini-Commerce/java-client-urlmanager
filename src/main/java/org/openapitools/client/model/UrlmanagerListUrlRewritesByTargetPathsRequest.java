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
import org.openapitools.client.model.UrlRewriteLinkRel;

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
 * UrlmanagerListUrlRewritesByTargetPathsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T11:52:59.759578872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UrlmanagerListUrlRewritesByTargetPathsRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_TARGET_PATHS = "targetPaths";
  @SerializedName(SERIALIZED_NAME_TARGET_PATHS)
  private List<String> targetPaths = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private String context;

  public static final String SERIALIZED_NAME_LINK_REL = "linkRel";
  @SerializedName(SERIALIZED_NAME_LINK_REL)
  private UrlRewriteLinkRel linkRel = UrlRewriteLinkRel.UNKNOWN;

  public UrlmanagerListUrlRewritesByTargetPathsRequest() {
  }

  public UrlmanagerListUrlRewritesByTargetPathsRequest tenantId(String tenantId) {
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


  public UrlmanagerListUrlRewritesByTargetPathsRequest targetPaths(List<String> targetPaths) {
    this.targetPaths = targetPaths;
    return this;
  }

  public UrlmanagerListUrlRewritesByTargetPathsRequest addTargetPathsItem(String targetPathsItem) {
    if (this.targetPaths == null) {
      this.targetPaths = new ArrayList<>();
    }
    this.targetPaths.add(targetPathsItem);
    return this;
  }

  /**
   * Required.
   * @return targetPaths
   */
  @javax.annotation.Nullable
  public List<String> getTargetPaths() {
    return targetPaths;
  }

  public void setTargetPaths(List<String> targetPaths) {
    this.targetPaths = targetPaths;
  }


  public UrlmanagerListUrlRewritesByTargetPathsRequest context(String context) {
    this.context = context;
    return this;
  }

  /**
   * Optional.
   * @return context
   */
  @javax.annotation.Nullable
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }


  public UrlmanagerListUrlRewritesByTargetPathsRequest linkRel(UrlRewriteLinkRel linkRel) {
    this.linkRel = linkRel;
    return this;
  }

  /**
   * Get linkRel
   * @return linkRel
   */
  @javax.annotation.Nullable
  public UrlRewriteLinkRel getLinkRel() {
    return linkRel;
  }

  public void setLinkRel(UrlRewriteLinkRel linkRel) {
    this.linkRel = linkRel;
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
   * @return the UrlmanagerListUrlRewritesByTargetPathsRequest instance itself
   */
  public UrlmanagerListUrlRewritesByTargetPathsRequest putAdditionalProperty(String key, Object value) {
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
    UrlmanagerListUrlRewritesByTargetPathsRequest urlmanagerListUrlRewritesByTargetPathsRequest = (UrlmanagerListUrlRewritesByTargetPathsRequest) o;
    return Objects.equals(this.tenantId, urlmanagerListUrlRewritesByTargetPathsRequest.tenantId) &&
        Objects.equals(this.targetPaths, urlmanagerListUrlRewritesByTargetPathsRequest.targetPaths) &&
        Objects.equals(this.context, urlmanagerListUrlRewritesByTargetPathsRequest.context) &&
        Objects.equals(this.linkRel, urlmanagerListUrlRewritesByTargetPathsRequest.linkRel)&&
        Objects.equals(this.additionalProperties, urlmanagerListUrlRewritesByTargetPathsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, targetPaths, context, linkRel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlmanagerListUrlRewritesByTargetPathsRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    targetPaths: ").append(toIndentedString(targetPaths)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    linkRel: ").append(toIndentedString(linkRel)).append("\n");
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
    openapiFields.add("targetPaths");
    openapiFields.add("context");
    openapiFields.add("linkRel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UrlmanagerListUrlRewritesByTargetPathsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlmanagerListUrlRewritesByTargetPathsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlmanagerListUrlRewritesByTargetPathsRequest is not found in the empty JSON string", UrlmanagerListUrlRewritesByTargetPathsRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("targetPaths") != null && !jsonObj.get("targetPaths").isJsonNull() && !jsonObj.get("targetPaths").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetPaths` to be an array in the JSON string but got `%s`", jsonObj.get("targetPaths").toString()));
      }
      if ((jsonObj.get("context") != null && !jsonObj.get("context").isJsonNull()) && !jsonObj.get("context").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `context` to be a primitive type in the JSON string but got `%s`", jsonObj.get("context").toString()));
      }
      // validate the optional field `linkRel`
      if (jsonObj.get("linkRel") != null && !jsonObj.get("linkRel").isJsonNull()) {
        UrlRewriteLinkRel.validateJsonElement(jsonObj.get("linkRel"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlmanagerListUrlRewritesByTargetPathsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlmanagerListUrlRewritesByTargetPathsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlmanagerListUrlRewritesByTargetPathsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlmanagerListUrlRewritesByTargetPathsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlmanagerListUrlRewritesByTargetPathsRequest>() {
           @Override
           public void write(JsonWriter out, UrlmanagerListUrlRewritesByTargetPathsRequest value) throws IOException {
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
           public UrlmanagerListUrlRewritesByTargetPathsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UrlmanagerListUrlRewritesByTargetPathsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of UrlmanagerListUrlRewritesByTargetPathsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UrlmanagerListUrlRewritesByTargetPathsRequest
   * @throws IOException if the JSON string is invalid with respect to UrlmanagerListUrlRewritesByTargetPathsRequest
   */
  public static UrlmanagerListUrlRewritesByTargetPathsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlmanagerListUrlRewritesByTargetPathsRequest.class);
  }

  /**
   * Convert an instance of UrlmanagerListUrlRewritesByTargetPathsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

