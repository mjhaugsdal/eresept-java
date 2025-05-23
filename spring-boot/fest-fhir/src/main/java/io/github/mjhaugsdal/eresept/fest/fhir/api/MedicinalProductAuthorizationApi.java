package io.github.mjhaugsdal.eresept.fest.fhir.api;

import io.github.mjhaugsdal.eresept.fest.fhir.ApiException;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiClient;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiResponse;
import io.github.mjhaugsdal.eresept.fest.fhir.Configuration;
import io.github.mjhaugsdal.eresept.fest.fhir.Pair;

import jakarta.ws.rs.core.GenericType;

import java.time.LocalDate;
import io.github.mjhaugsdal.eresept.fest.fhir.model.MedicinalProductAuthorization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T11:23:23.733753200+02:00[Europe/Oslo]", comments = "Generator version: 7.12.0")
public class MedicinalProductAuthorizationApi {
  private ApiClient apiClient;

  public MedicinalProductAuthorizationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MedicinalProductAuthorizationApi(ApiClient apiClient) {
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
   * List Medicinal Product Authorization
   * Get all MedicinalProductAuthorizations
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
   * @return MedicinalProductAuthorization
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public MedicinalProductAuthorization getMedicinalProductAuthorization(String source, String nameLanguage, String identifier, String tag, String name, String security, LocalDate lastUpdated, String id, String format, Integer count, String ct) throws ApiException {
    return getMedicinalProductAuthorizationWithHttpInfo(source, nameLanguage, identifier, tag, name, security, lastUpdated, id, format, count, ct).getData();
  }

  /**
   * List Medicinal Product Authorization
   * Get all MedicinalProductAuthorizations
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
   * @return ApiResponse&lt;MedicinalProductAuthorization&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MedicinalProductAuthorization> getMedicinalProductAuthorizationWithHttpInfo(String source, String nameLanguage, String identifier, String tag, String name, String security, LocalDate lastUpdated, String id, String format, Integer count, String ct) throws ApiException {
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
    GenericType<MedicinalProductAuthorization> localVarReturnType = new GenericType<MedicinalProductAuthorization>() {};
    return apiClient.invokeAPI("MedicinalProductAuthorizationApi.getMedicinalProductAuthorization", "/MedicinalProductAuthorization", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Medicinal Product Authorization
   * Get a MedicinalProductAuthorization by its ID
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
   * @return MedicinalProductAuthorization
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public MedicinalProductAuthorization getMedicinalProductAuthorizationId(String source, String nameLanguage, String identifier, String tag, String name, String security, LocalDate lastUpdated, String id, String format, Integer count, String ct) throws ApiException {
    return getMedicinalProductAuthorizationIdWithHttpInfo(source, nameLanguage, identifier, tag, name, security, lastUpdated, id, format, count, ct).getData();
  }

  /**
   * Get Medicinal Product Authorization
   * Get a MedicinalProductAuthorization by its ID
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
   * @return ApiResponse&lt;MedicinalProductAuthorization&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MedicinalProductAuthorization> getMedicinalProductAuthorizationIdWithHttpInfo(String source, String nameLanguage, String identifier, String tag, String name, String security, LocalDate lastUpdated, String id, String format, Integer count, String ct) throws ApiException {
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
    GenericType<MedicinalProductAuthorization> localVarReturnType = new GenericType<MedicinalProductAuthorization>() {};
    return apiClient.invokeAPI("MedicinalProductAuthorizationApi.getMedicinalProductAuthorizationId", "/MedicinalProductAuthorization/{id}", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
