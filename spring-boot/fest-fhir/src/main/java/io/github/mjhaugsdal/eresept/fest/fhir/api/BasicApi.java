package io.github.mjhaugsdal.eresept.fest.fhir.api;

import io.github.mjhaugsdal.eresept.fest.fhir.ApiException;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiClient;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiResponse;
import io.github.mjhaugsdal.eresept.fest.fhir.Configuration;
import io.github.mjhaugsdal.eresept.fest.fhir.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.mjhaugsdal.eresept.fest.fhir.model.Basic;
import io.github.mjhaugsdal.eresept.fest.fhir.model.BasicList;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetBasicHistory200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetBasicIdHistory200Response;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T11:23:23.733753200+02:00[Europe/Oslo]", comments = "Generator version: 7.12.0")
public class BasicApi {
  private ApiClient apiClient;

  public BasicApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BasicApi(ApiClient apiClient) {
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
   * List Basic
   * Get all Basic resources of every type. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param patient Identifies the focus of this resource (optional)
   * @param identifier Business identifier (optional)
   * @param code Kind of Resource (optional)
   * @param tag Tags applied to this resource (optional)
   * @param author Who created (optional)
   * @param created Format - date (as full-date in RFC3339). When created (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param subject Identifies the focus of this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return BasicList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public BasicList getBasic(String source, String patient, String identifier, String code, String tag, String author, LocalDate created, String security, String subject, LocalDate lastUpdated, String id, String format) throws ApiException {
    return getBasicWithHttpInfo(source, patient, identifier, code, tag, author, created, security, subject, lastUpdated, id, format).getData();
  }

  /**
   * List Basic
   * Get all Basic resources of every type. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param patient Identifies the focus of this resource (optional)
   * @param identifier Business identifier (optional)
   * @param code Kind of Resource (optional)
   * @param tag Tags applied to this resource (optional)
   * @param author Who created (optional)
   * @param created Format - date (as full-date in RFC3339). When created (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param subject Identifies the focus of this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return ApiResponse&lt;BasicList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BasicList> getBasicWithHttpInfo(String source, String patient, String identifier, String code, String tag, String author, LocalDate created, String security, String subject, LocalDate lastUpdated, String id, String format) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_source", source)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "patient", patient));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_tag", tag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "author", author));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created", created));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_security", security));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subject", subject));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_lastUpdated", lastUpdated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_format", format));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<BasicList> localVarReturnType = new GenericType<BasicList>() {};
    return apiClient.invokeAPI("BasicApi.getBasic", "/Basic", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all Basic resources&#39; history
   * Get full version history of all Basic resources. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetBasicHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetBasicHistory200Response getBasicHistory(String count, String since) throws ApiException {
    return getBasicHistoryWithHttpInfo(count, since).getData();
  }

  /**
   * Get all Basic resources&#39; history
   * Get full version history of all Basic resources. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetBasicHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetBasicHistory200Response> getBasicHistoryWithHttpInfo(String count, String since) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetBasicHistory200Response> localVarReturnType = new GenericType<GetBasicHistory200Response>() {};
    return apiClient.invokeAPI("BasicApi.getBasicHistory", "/Basic/_history", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Basic
   * Get a basic resource by ID
   * @param id id of resource (required)
   * @return Basic
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Basic getBasicId(String id) throws ApiException {
    return getBasicIdWithHttpInfo(id).getData();
  }

  /**
   * Get Basic
   * Get a basic resource by ID
   * @param id id of resource (required)
   * @return ApiResponse&lt;Basic&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Basic> getBasicIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getBasicId");
    }

    // Path parameters
    String localVarPath = "/Basic/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<Basic> localVarReturnType = new GenericType<Basic>() {};
    return apiClient.invokeAPI("BasicApi.getBasicId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Basic history
   * Get full version history of a Basic resource. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetBasicIdHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetBasicIdHistory200Response getBasicIdHistory(String id, String count, String since) throws ApiException {
    return getBasicIdHistoryWithHttpInfo(id, count, since).getData();
  }

  /**
   * Get Basic history
   * Get full version history of a Basic resource. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetBasicIdHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetBasicIdHistory200Response> getBasicIdHistoryWithHttpInfo(String id, String count, String since) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getBasicIdHistory");
    }

    // Path parameters
    String localVarPath = "/Basic/{id}/_history"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetBasicIdHistory200Response> localVarReturnType = new GenericType<GetBasicIdHistory200Response>() {};
    return apiClient.invokeAPI("BasicApi.getBasicIdHistory", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Basic version
   * Get a specific version of a Basic resource by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return Basic
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Basic getBasicIdHistoryVid(String id, String vid) throws ApiException {
    return getBasicIdHistoryVidWithHttpInfo(id, vid).getData();
  }

  /**
   * Get Basic version
   * Get a specific version of a Basic resource by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return ApiResponse&lt;Basic&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Basic> getBasicIdHistoryVidWithHttpInfo(String id, String vid) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getBasicIdHistoryVid");
    }
    if (vid == null) {
      throw new ApiException(400, "Missing the required parameter 'vid' when calling getBasicIdHistoryVid");
    }

    // Path parameters
    String localVarPath = "/Basic/{id}/_history/{vid}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{vid}", apiClient.escapeString(vid.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<Basic> localVarReturnType = new GenericType<Basic>() {};
    return apiClient.invokeAPI("BasicApi.getBasicIdHistoryVid", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
