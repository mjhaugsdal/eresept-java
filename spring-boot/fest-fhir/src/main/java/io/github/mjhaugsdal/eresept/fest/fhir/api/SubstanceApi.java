package io.github.mjhaugsdal.eresept.fest.fhir.api;

import io.github.mjhaugsdal.eresept.fest.fhir.ApiException;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiClient;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiResponse;
import io.github.mjhaugsdal.eresept.fest.fhir.Configuration;
import io.github.mjhaugsdal.eresept.fest.fhir.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.mjhaugsdal.eresept.fest.fhir.model.GetSubstance200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetSubstanceHistory200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetSubstanceIdHistory200Response;
import java.time.LocalDate;
import io.github.mjhaugsdal.eresept.fest.fhir.model.Substance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T11:23:23.733753200+02:00[Europe/Oslo]", comments = "Generator version: 7.12.0")
public class SubstanceApi {
  private ApiClient apiClient;

  public SubstanceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubstanceApi(ApiClient apiClient) {
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
   * List Substance resources
   * Get all substance resources. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param identifier Unique identifier for the substance (optional)
   * @param code The code of the substance or ingredient (optional)
   * @param tag Tags applied to this resource (optional)
   * @param status active | inactive | entered-in-error (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param substanceReference A component of the substance (optional)
   * @param expiry Format - date (as full-date in RFC3339). Expiry date of package or container of substance (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param category The category of the substance (optional)
   * @param quantity Amount of substance in the package (optional)
   * @param id Logical id of this artifact (optional)
   * @param containerIdentifier Identifier of the package/container (optional)
   * @param format Output formatting (optional)
   * @return GetSubstance200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetSubstance200Response getSubstance(String source, String identifier, String code, String tag, String status, String security, String substanceReference, LocalDate expiry, LocalDate lastUpdated, String category, Integer quantity, String id, String containerIdentifier, String format) throws ApiException {
    return getSubstanceWithHttpInfo(source, identifier, code, tag, status, security, substanceReference, expiry, lastUpdated, category, quantity, id, containerIdentifier, format).getData();
  }

  /**
   * List Substance resources
   * Get all substance resources. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param identifier Unique identifier for the substance (optional)
   * @param code The code of the substance or ingredient (optional)
   * @param tag Tags applied to this resource (optional)
   * @param status active | inactive | entered-in-error (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param substanceReference A component of the substance (optional)
   * @param expiry Format - date (as full-date in RFC3339). Expiry date of package or container of substance (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param category The category of the substance (optional)
   * @param quantity Amount of substance in the package (optional)
   * @param id Logical id of this artifact (optional)
   * @param containerIdentifier Identifier of the package/container (optional)
   * @param format Output formatting (optional)
   * @return ApiResponse&lt;GetSubstance200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSubstance200Response> getSubstanceWithHttpInfo(String source, String identifier, String code, String tag, String status, String security, String substanceReference, LocalDate expiry, LocalDate lastUpdated, String category, Integer quantity, String id, String containerIdentifier, String format) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_source", source)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_tag", tag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_security", security));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "substance-reference", substanceReference));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expiry", expiry));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_lastUpdated", lastUpdated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "category", category));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "container-identifier", containerIdentifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_format", format));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetSubstance200Response> localVarReturnType = new GenericType<GetSubstance200Response>() {};
    return apiClient.invokeAPI("SubstanceApi.getSubstance", "/Substance", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all Substance resources&#39; history
   * Get full version history of all Substance resources. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetSubstanceHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetSubstanceHistory200Response getSubstanceHistory(String count, String since) throws ApiException {
    return getSubstanceHistoryWithHttpInfo(count, since).getData();
  }

  /**
   * Get all Substance resources&#39; history
   * Get full version history of all Substance resources. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetSubstanceHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSubstanceHistory200Response> getSubstanceHistoryWithHttpInfo(String count, String since) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetSubstanceHistory200Response> localVarReturnType = new GenericType<GetSubstanceHistory200Response>() {};
    return apiClient.invokeAPI("SubstanceApi.getSubstanceHistory", "/Substance/_history", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Substance resource
   * Get a Substance resource by its ID
   * @param id id of resource (required)
   * @return Substance
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Substance getSubstanceId(String id) throws ApiException {
    return getSubstanceIdWithHttpInfo(id).getData();
  }

  /**
   * Get Substance resource
   * Get a Substance resource by its ID
   * @param id id of resource (required)
   * @return ApiResponse&lt;Substance&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Substance> getSubstanceIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSubstanceId");
    }

    // Path parameters
    String localVarPath = "/Substance/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<Substance> localVarReturnType = new GenericType<Substance>() {};
    return apiClient.invokeAPI("SubstanceApi.getSubstanceId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Substance resource&#39;s history
   * Get full version history of a Substance resource. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetSubstanceIdHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetSubstanceIdHistory200Response getSubstanceIdHistory(String id, String count, String since) throws ApiException {
    return getSubstanceIdHistoryWithHttpInfo(id, count, since).getData();
  }

  /**
   * Get Substance resource&#39;s history
   * Get full version history of a Substance resource. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetSubstanceIdHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSubstanceIdHistory200Response> getSubstanceIdHistoryWithHttpInfo(String id, String count, String since) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSubstanceIdHistory");
    }

    // Path parameters
    String localVarPath = "/Substance/{id}/_history"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetSubstanceIdHistory200Response> localVarReturnType = new GenericType<GetSubstanceIdHistory200Response>() {};
    return apiClient.invokeAPI("SubstanceApi.getSubstanceIdHistory", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Substance resource version
   * Get a specific version of a Substance resource by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return Substance
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Substance getSubstanceIdHistoryVid(String id, String vid) throws ApiException {
    return getSubstanceIdHistoryVidWithHttpInfo(id, vid).getData();
  }

  /**
   * Get Substance resource version
   * Get a specific version of a Substance resource by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return ApiResponse&lt;Substance&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Substance> getSubstanceIdHistoryVidWithHttpInfo(String id, String vid) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSubstanceIdHistoryVid");
    }
    if (vid == null) {
      throw new ApiException(400, "Missing the required parameter 'vid' when calling getSubstanceIdHistoryVid");
    }

    // Path parameters
    String localVarPath = "/Substance/{id}/_history/{vid}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{vid}", apiClient.escapeString(vid.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<Substance> localVarReturnType = new GenericType<Substance>() {};
    return apiClient.invokeAPI("SubstanceApi.getSubstanceIdHistoryVid", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
