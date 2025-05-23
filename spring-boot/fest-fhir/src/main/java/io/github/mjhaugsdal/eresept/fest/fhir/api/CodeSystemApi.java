package io.github.mjhaugsdal.eresept.fest.fhir.api;

import io.github.mjhaugsdal.eresept.fest.fhir.ApiException;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiClient;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiResponse;
import io.github.mjhaugsdal.eresept.fest.fhir.Configuration;
import io.github.mjhaugsdal.eresept.fest.fhir.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.mjhaugsdal.eresept.fest.fhir.model.CodeSystem;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetCodesystem200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetCodesystemHistory200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetCodesystemIdHistory200Response;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T11:23:23.733753200+02:00[Europe/Oslo]", comments = "Generator version: 7.12.0")
public class CodeSystemApi {
  private ApiClient apiClient;

  public CodeSystemApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CodeSystemApi(ApiClient apiClient) {
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
   * List Code Systems
   * Get all code systems. For improved performance, results are delivered in pages.
   * @param language A language in which a designation is provided (optional)
   * @param identifier Business identifier for this system (optional)
   * @param name The full system name (optional)
   * @param code A code defined in the code system (optional)
   * @param source Identifies where the resource comes from (optional)
   * @param system The system for any codes defined by this code system (same as &#39;url&#39;) (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param tag Tags applied to this resource (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return GetCodesystem200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetCodesystem200Response getCodesystem(String language, String identifier, String name, String code, String source, String system, LocalDate lastUpdated, String security, String tag, String id, String format) throws ApiException {
    return getCodesystemWithHttpInfo(language, identifier, name, code, source, system, lastUpdated, security, tag, id, format).getData();
  }

  /**
   * List Code Systems
   * Get all code systems. For improved performance, results are delivered in pages.
   * @param language A language in which a designation is provided (optional)
   * @param identifier Business identifier for this system (optional)
   * @param name The full system name (optional)
   * @param code A code defined in the code system (optional)
   * @param source Identifies where the resource comes from (optional)
   * @param system The system for any codes defined by this code system (same as &#39;url&#39;) (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param tag Tags applied to this resource (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return ApiResponse&lt;GetCodesystem200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetCodesystem200Response> getCodesystemWithHttpInfo(String language, String identifier, String name, String code, String source, String system, LocalDate lastUpdated, String security, String tag, String id, String format) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "language", language)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_source", source));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "system", system));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_lastUpdated", lastUpdated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_security", security));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_tag", tag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_format", format));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetCodesystem200Response> localVarReturnType = new GenericType<GetCodesystem200Response>() {};
    return apiClient.invokeAPI("CodeSystemApi.getCodesystem", "/CodeSystem", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all Code Systems&#39; history
   * Get full version history of all code systems. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetCodesystemHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetCodesystemHistory200Response getCodesystemHistory(String count, String since) throws ApiException {
    return getCodesystemHistoryWithHttpInfo(count, since).getData();
  }

  /**
   * Get all Code Systems&#39; history
   * Get full version history of all code systems. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetCodesystemHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetCodesystemHistory200Response> getCodesystemHistoryWithHttpInfo(String count, String since) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetCodesystemHistory200Response> localVarReturnType = new GenericType<GetCodesystemHistory200Response>() {};
    return apiClient.invokeAPI("CodeSystemApi.getCodesystemHistory", "/CodeSystem/_history", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Code System
   * Get a code system by its ID
   * @param id id of resource (required)
   * @return CodeSystem
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public CodeSystem getCodesystemId(String id) throws ApiException {
    return getCodesystemIdWithHttpInfo(id).getData();
  }

  /**
   * Get Code System
   * Get a code system by its ID
   * @param id id of resource (required)
   * @return ApiResponse&lt;CodeSystem&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CodeSystem> getCodesystemIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCodesystemId");
    }

    // Path parameters
    String localVarPath = "/CodeSystem/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<CodeSystem> localVarReturnType = new GenericType<CodeSystem>() {};
    return apiClient.invokeAPI("CodeSystemApi.getCodesystemId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Code System history
   * Get full version history of a Code System. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetCodesystemIdHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetCodesystemIdHistory200Response getCodesystemIdHistory(String id, String count, String since) throws ApiException {
    return getCodesystemIdHistoryWithHttpInfo(id, count, since).getData();
  }

  /**
   * Get Code System history
   * Get full version history of a Code System. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetCodesystemIdHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetCodesystemIdHistory200Response> getCodesystemIdHistoryWithHttpInfo(String id, String count, String since) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCodesystemIdHistory");
    }

    // Path parameters
    String localVarPath = "/CodeSystem/{id}/_history"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetCodesystemIdHistory200Response> localVarReturnType = new GenericType<GetCodesystemIdHistory200Response>() {};
    return apiClient.invokeAPI("CodeSystemApi.getCodesystemIdHistory", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Code System version
   * Get a specific version of a code system by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return CodeSystem
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public CodeSystem getCodesystemIdHistoryVid(String id, String vid) throws ApiException {
    return getCodesystemIdHistoryVidWithHttpInfo(id, vid).getData();
  }

  /**
   * Get Code System version
   * Get a specific version of a code system by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return ApiResponse&lt;CodeSystem&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CodeSystem> getCodesystemIdHistoryVidWithHttpInfo(String id, String vid) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCodesystemIdHistoryVid");
    }
    if (vid == null) {
      throw new ApiException(400, "Missing the required parameter 'vid' when calling getCodesystemIdHistoryVid");
    }

    // Path parameters
    String localVarPath = "/CodeSystem/{id}/_history/{vid}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{vid}", apiClient.escapeString(vid.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<CodeSystem> localVarReturnType = new GenericType<CodeSystem>() {};
    return apiClient.invokeAPI("CodeSystemApi.getCodesystemIdHistoryVid", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
