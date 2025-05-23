package io.github.mjhaugsdal.eresept.fest.fhir.api;

import io.github.mjhaugsdal.eresept.fest.fhir.ApiException;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiClient;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiResponse;
import io.github.mjhaugsdal.eresept.fest.fhir.Configuration;
import io.github.mjhaugsdal.eresept.fest.fhir.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.mjhaugsdal.eresept.fest.fhir.model.GetSubstancespecification200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetSubstancespecificationHistory200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetSubstancespecificationIdHistory200Response;
import java.time.LocalDate;
import io.github.mjhaugsdal.eresept.fest.fhir.model.SubstanceSpecification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T11:23:23.733753200+02:00[Europe/Oslo]", comments = "Generator version: 7.12.0")
public class SubstanceSpecificationApi {
  private ApiClient apiClient;

  public SubstanceSpecificationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubstanceSpecificationApi(ApiClient apiClient) {
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
   * List Substance Specification
   * Get all substance specifications. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param code The specific code (optional)
   * @param tag Tags applied to this resource (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return GetSubstancespecification200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetSubstancespecification200Response getSubstancespecification(String source, String code, String tag, String security, LocalDate lastUpdated, String id, String format) throws ApiException {
    return getSubstancespecificationWithHttpInfo(source, code, tag, security, lastUpdated, id, format).getData();
  }

  /**
   * List Substance Specification
   * Get all substance specifications. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param code The specific code (optional)
   * @param tag Tags applied to this resource (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return ApiResponse&lt;GetSubstancespecification200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSubstancespecification200Response> getSubstancespecificationWithHttpInfo(String source, String code, String tag, String security, LocalDate lastUpdated, String id, String format) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_source", source)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_tag", tag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_security", security));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_lastUpdated", lastUpdated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_format", format));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetSubstancespecification200Response> localVarReturnType = new GenericType<GetSubstancespecification200Response>() {};
    return apiClient.invokeAPI("SubstanceSpecificationApi.getSubstancespecification", "/SubstanceSpecification", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all Substance Specifications&#39; history
   * Get full version history of all Substance Specifications. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetSubstancespecificationHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetSubstancespecificationHistory200Response getSubstancespecificationHistory(String count, String since) throws ApiException {
    return getSubstancespecificationHistoryWithHttpInfo(count, since).getData();
  }

  /**
   * Get all Substance Specifications&#39; history
   * Get full version history of all Substance Specifications. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetSubstancespecificationHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSubstancespecificationHistory200Response> getSubstancespecificationHistoryWithHttpInfo(String count, String since) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetSubstancespecificationHistory200Response> localVarReturnType = new GenericType<GetSubstancespecificationHistory200Response>() {};
    return apiClient.invokeAPI("SubstanceSpecificationApi.getSubstancespecificationHistory", "/SubstanceSpecification/_history", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Substance Specification
   * Get a Substance Specification by its ID
   * @param id id of resource (required)
   * @return SubstanceSpecification
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public SubstanceSpecification getSubstancespecificationId(String id) throws ApiException {
    return getSubstancespecificationIdWithHttpInfo(id).getData();
  }

  /**
   * Get Substance Specification
   * Get a Substance Specification by its ID
   * @param id id of resource (required)
   * @return ApiResponse&lt;SubstanceSpecification&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubstanceSpecification> getSubstancespecificationIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSubstancespecificationId");
    }

    // Path parameters
    String localVarPath = "/SubstanceSpecification/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<SubstanceSpecification> localVarReturnType = new GenericType<SubstanceSpecification>() {};
    return apiClient.invokeAPI("SubstanceSpecificationApi.getSubstancespecificationId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Substance Specification history
   * Get full version history of a Substance Specification. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetSubstancespecificationIdHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetSubstancespecificationIdHistory200Response getSubstancespecificationIdHistory(String id, String count, String since) throws ApiException {
    return getSubstancespecificationIdHistoryWithHttpInfo(id, count, since).getData();
  }

  /**
   * Get Substance Specification history
   * Get full version history of a Substance Specification. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetSubstancespecificationIdHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSubstancespecificationIdHistory200Response> getSubstancespecificationIdHistoryWithHttpInfo(String id, String count, String since) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSubstancespecificationIdHistory");
    }

    // Path parameters
    String localVarPath = "/SubstanceSpecification/{id}/_history"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetSubstancespecificationIdHistory200Response> localVarReturnType = new GenericType<GetSubstancespecificationIdHistory200Response>() {};
    return apiClient.invokeAPI("SubstanceSpecificationApi.getSubstancespecificationIdHistory", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
