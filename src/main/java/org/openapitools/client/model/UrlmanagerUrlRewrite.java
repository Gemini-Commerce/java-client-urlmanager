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
import org.openapitools.client.model.UrlRewriteLinkRel;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.Urlmanager.JSON;

/**
 * UrlmanagerUrlRewrite
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-15T15:33:58.567406864Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UrlmanagerUrlRewrite {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

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

  public static final String SERIALIZED_NAME_LINK_REL = "linkRel";
  @SerializedName(SERIALIZED_NAME_LINK_REL)
  private UrlRewriteLinkRel linkRel = UrlRewriteLinkRel.UNKNOWN;

  public UrlmanagerUrlRewrite() {
  }

  public UrlmanagerUrlRewrite tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public UrlmanagerUrlRewrite id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public UrlmanagerUrlRewrite context(String context) {
    this.context = context;
    return this;
  }

  /**
   * Context field is part of the key. it&#39;s up to whoever is using the url manager to define it. e.g. locale or market or a concatenation of the two if needed.
   * @return context
   */
  @javax.annotation.Nullable
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }


  public UrlmanagerUrlRewrite requestPath(String requestPath) {
    this.requestPath = requestPath;
    return this;
  }

  /**
   * Get requestPath
   * @return requestPath
   */
  @javax.annotation.Nullable
  public String getRequestPath() {
    return requestPath;
  }

  public void setRequestPath(String requestPath) {
    this.requestPath = requestPath;
  }


  public UrlmanagerUrlRewrite targetPath(String targetPath) {
    this.targetPath = targetPath;
    return this;
  }

  /**
   * Get targetPath
   * @return targetPath
   */
  @javax.annotation.Nullable
  public String getTargetPath() {
    return targetPath;
  }

  public void setTargetPath(String targetPath) {
    this.targetPath = targetPath;
  }


  public UrlmanagerUrlRewrite redirectType(UrlRewriteRedirectType redirectType) {
    this.redirectType = redirectType;
    return this;
  }

  /**
   * Get redirectType
   * @return redirectType
   */
  @javax.annotation.Nullable
  public UrlRewriteRedirectType getRedirectType() {
    return redirectType;
  }

  public void setRedirectType(UrlRewriteRedirectType redirectType) {
    this.redirectType = redirectType;
  }


  public UrlmanagerUrlRewrite linkRel(UrlRewriteLinkRel linkRel) {
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
   * @return the UrlmanagerUrlRewrite instance itself
   */
  public UrlmanagerUrlRewrite putAdditionalProperty(String key, Object value) {
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
    UrlmanagerUrlRewrite urlmanagerUrlRewrite = (UrlmanagerUrlRewrite) o;
    return Objects.equals(this.tenantId, urlmanagerUrlRewrite.tenantId) &&
        Objects.equals(this.id, urlmanagerUrlRewrite.id) &&
        Objects.equals(this.context, urlmanagerUrlRewrite.context) &&
        Objects.equals(this.requestPath, urlmanagerUrlRewrite.requestPath) &&
        Objects.equals(this.targetPath, urlmanagerUrlRewrite.targetPath) &&
        Objects.equals(this.redirectType, urlmanagerUrlRewrite.redirectType) &&
        Objects.equals(this.linkRel, urlmanagerUrlRewrite.linkRel)&&
        Objects.equals(this.additionalProperties, urlmanagerUrlRewrite.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, id, context, requestPath, targetPath, redirectType, linkRel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlmanagerUrlRewrite {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    requestPath: ").append(toIndentedString(requestPath)).append("\n");
    sb.append("    targetPath: ").append(toIndentedString(targetPath)).append("\n");
    sb.append("    redirectType: ").append(toIndentedString(redirectType)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("context");
    openapiFields.add("requestPath");
    openapiFields.add("targetPath");
    openapiFields.add("redirectType");
    openapiFields.add("linkRel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UrlmanagerUrlRewrite
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlmanagerUrlRewrite.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlmanagerUrlRewrite is not found in the empty JSON string", UrlmanagerUrlRewrite.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
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
      // validate the optional field `linkRel`
      if (jsonObj.get("linkRel") != null && !jsonObj.get("linkRel").isJsonNull()) {
        UrlRewriteLinkRel.validateJsonElement(jsonObj.get("linkRel"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlmanagerUrlRewrite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlmanagerUrlRewrite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlmanagerUrlRewrite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlmanagerUrlRewrite.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlmanagerUrlRewrite>() {
           @Override
           public void write(JsonWriter out, UrlmanagerUrlRewrite value) throws IOException {
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
           public UrlmanagerUrlRewrite read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UrlmanagerUrlRewrite instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of UrlmanagerUrlRewrite given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UrlmanagerUrlRewrite
   * @throws IOException if the JSON string is invalid with respect to UrlmanagerUrlRewrite
   */
  public static UrlmanagerUrlRewrite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlmanagerUrlRewrite.class);
  }

  /**
   * Convert an instance of UrlmanagerUrlRewrite to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

