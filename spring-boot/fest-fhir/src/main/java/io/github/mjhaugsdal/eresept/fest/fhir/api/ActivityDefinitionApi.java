package io.github.mjhaugsdal.eresept.fest.fhir.api;

import io.github.mjhaugsdal.eresept.fest.fhir.ApiException;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiClient;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiResponse;
import io.github.mjhaugsdal.eresept.fest.fhir.Configuration;
import io.github.mjhaugsdal.eresept.fest.fhir.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.mjhaugsdal.eresept.fest.fhir.model.ActivityDefinition;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T11:23:23.733753200+02:00[Europe/Oslo]", comments = "Generator version: 7.12.0")
public class ActivityDefinitionApi {
  private ApiClient apiClient;

  public ActivityDefinitionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ActivityDefinitionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * List Activity Definition
   * Get all ActivityDefinitions
   * @param source Identifies where the resource comes from (optional)
   * @param nameLanguage Language code for this name (optional)
   * @param identifier Business identifier for this product. Could be an MPID (optional)
   * @param tag Tags applied to this resource (optional)
   * @param name The full product name (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @param count Page size. Max 1000 ressources per page. (optional)
   * @param ct Token for a given page. Token for the next page is provided as part of the response object. (optional)
   * @return ActivityDefinition
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ActivityDefinition getActivitydefinition(String source, String nameLanguage, String identifier, String tag, String name, String security, LocalDate lastUpdated, String id, String format, Integer count, String ct) throws ApiException {
    return getActivitydefinitionWithHttpInfo(source, nameLanguage, identifier, tag, name, security, lastUpdated, id, format, count, ct).getData();
  }

  /**
   * List Activity Definition
   * Get all ActivityDefinitions
   * @param source Identifies where the resource comes from (optional)
   * @param nameLanguage Language code for this name (optional)
   * @param identifier Business identifier for this product. Could be an MPID (optional)
   * @param tag Tags applied to this resource (optional)
   * @param name The full product name (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @param count Page size. Max 1000 ressources per page. (optional)
   * @param ct Token for a given page. Token for the next page is provided as part of the response object. (optional)
   * @return ApiResponse&lt;ActivityDefinition&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ActivityDefinition> getActivitydefinitionWithHttpInfo(String source, String nameLanguage, String identifier, String tag, String name, String security, LocalDate lastUpdated, String id, String format, Integer count, String ct) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_source", source)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name-language", nameLanguage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_tag", tag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_security", security));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_lastUpdated", lastUpdated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ct", ct));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<ActivityDefinition> localVarReturnType = new GenericType<ActivityDefinition>() {};
    return apiClient.invokeAPI("ActivityDefinitionApi.getActivitydefinition", "/ActivityDefinition", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Activity Definition
   * Get a ActivityDefinition by its ID
   * @param id id of resource (required)
   * @return ActivityDefinition
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ActivityDefinition getActivitydefinitionId(String id) throws ApiException {
    return getActivitydefinitionIdWithHttpInfo(id).getData();
  }

  /**
   * Get Activity Definition
   * Get a ActivityDefinition by its ID
   * @param id id of resource (required)
   * @return ApiResponse&lt;ActivityDefinition&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ActivityDefinition> getActivitydefinitionIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getActivitydefinitionId");
    }

    // Path parameters
    String localVarPath = "/ActivityDefinition/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<ActivityDefinition> localVarReturnType = new GenericType<ActivityDefinition>() {};
    return apiClient.invokeAPI("ActivityDefinitionApi.getActivitydefinitionId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
