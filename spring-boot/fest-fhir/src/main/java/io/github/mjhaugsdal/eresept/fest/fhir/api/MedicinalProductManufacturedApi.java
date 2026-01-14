package io.github.mjhaugsdal.eresept.fest.fhir.api;

import io.github.mjhaugsdal.eresept.fest.fhir.ApiException;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiClient;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiResponse;
import io.github.mjhaugsdal.eresept.fest.fhir.Configuration;
import io.github.mjhaugsdal.eresept.fest.fhir.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.mjhaugsdal.eresept.fest.fhir.model.GetMedicinalproductmanufactured200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetMedicinalproductmanufacturedHistory200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetMedicinalproductmanufacturedIdHistory200Response;
import java.time.LocalDate;
import io.github.mjhaugsdal.eresept.fest.fhir.model.MedicinalProductManufactured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T11:23:23.733753200+02:00[Europe/Oslo]", comments = "Generator version: 7.12.0")
public class MedicinalProductManufacturedApi {
  private ApiClient apiClient;

  public MedicinalProductManufacturedApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MedicinalProductManufacturedApi(ApiClient apiClient) {
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
   * List Medicinal Product Manufactured
   * Get all manufactured items. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param tag Tags applied to this resource (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return GetMedicinalproductmanufactured200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetMedicinalproductmanufactured200Response getMedicinalproductmanufactured(String source, String tag, String security, LocalDate lastUpdated, String id, String format) throws ApiException {
    return getMedicinalproductmanufacturedWithHttpInfo(source, tag, security, lastUpdated, id, format).getData();
  }

  /**
   * List Medicinal Product Manufactured
   * Get all manufactured items. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param tag Tags applied to this resource (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return ApiResponse&lt;GetMedicinalproductmanufactured200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMedicinalproductmanufactured200Response> getMedicinalproductmanufacturedWithHttpInfo(String source, String tag, String security, LocalDate lastUpdated, String id, String format) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_source", source)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_tag", tag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_security", security));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_lastUpdated", lastUpdated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_format", format));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetMedicinalproductmanufactured200Response> localVarReturnType = new GenericType<GetMedicinalproductmanufactured200Response>() {};
    return apiClient.invokeAPI("MedicinalProductManufacturedApi.getMedicinalproductmanufactured", "/MedicinalProductManufactured", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all Medicinal Product Manufactureds&#39; history
   * Get full version history of all manufactured items. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetMedicinalproductmanufacturedHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetMedicinalproductmanufacturedHistory200Response getMedicinalproductmanufacturedHistory(String count, String since) throws ApiException {
    return getMedicinalproductmanufacturedHistoryWithHttpInfo(count, since).getData();
  }

  /**
   * Get all Medicinal Product Manufactureds&#39; history
   * Get full version history of all manufactured items. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetMedicinalproductmanufacturedHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMedicinalproductmanufacturedHistory200Response> getMedicinalproductmanufacturedHistoryWithHttpInfo(String count, String since) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetMedicinalproductmanufacturedHistory200Response> localVarReturnType = new GenericType<GetMedicinalproductmanufacturedHistory200Response>() {};
    return apiClient.invokeAPI("MedicinalProductManufacturedApi.getMedicinalproductmanufacturedHistory", "/MedicinalProductManufactured/_history", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Medicinal Product Manufactured
   * Get a manufactured item by its ID
   * @param id id of resource (required)
   * @return MedicinalProductManufactured
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public MedicinalProductManufactured getMedicinalproductmanufacturedId(String id) throws ApiException {
    return getMedicinalproductmanufacturedIdWithHttpInfo(id).getData();
  }

  /**
   * Get Medicinal Product Manufactured
   * Get a manufactured item by its ID
   * @param id id of resource (required)
   * @return ApiResponse&lt;MedicinalProductManufactured&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MedicinalProductManufactured> getMedicinalproductmanufacturedIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMedicinalproductmanufacturedId");
    }

    // Path parameters
    String localVarPath = "/MedicinalProductManufactured/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<MedicinalProductManufactured> localVarReturnType = new GenericType<MedicinalProductManufactured>() {};
    return apiClient.invokeAPI("MedicinalProductManufacturedApi.getMedicinalproductmanufacturedId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Medicinal Product Manufacuted history
   * Get full version history of a manufactured item. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetMedicinalproductmanufacturedIdHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetMedicinalproductmanufacturedIdHistory200Response getMedicinalproductmanufacturedIdHistory(String id, String count, String since) throws ApiException {
    return getMedicinalproductmanufacturedIdHistoryWithHttpInfo(id, count, since).getData();
  }

  /**
   * Get Medicinal Product Manufacuted history
   * Get full version history of a manufactured item. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetMedicinalproductmanufacturedIdHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMedicinalproductmanufacturedIdHistory200Response> getMedicinalproductmanufacturedIdHistoryWithHttpInfo(String id, String count, String since) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMedicinalproductmanufacturedIdHistory");
    }

    // Path parameters
    String localVarPath = "/MedicinalProductManufactured/{id}/_history"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetMedicinalproductmanufacturedIdHistory200Response> localVarReturnType = new GenericType<GetMedicinalproductmanufacturedIdHistory200Response>() {};
    return apiClient.invokeAPI("MedicinalProductManufacturedApi.getMedicinalproductmanufacturedIdHistory", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Medicinal Product Manufactured version
   * Get a specific version of a manufactured item by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return MedicinalProductManufactured
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public MedicinalProductManufactured getMedicinalproductmanufacturedIdHistoryVid(String id, String vid) throws ApiException {
    return getMedicinalproductmanufacturedIdHistoryVidWithHttpInfo(id, vid).getData();
  }

  /**
   * Get Medicinal Product Manufactured version
   * Get a specific version of a manufactured item by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return ApiResponse&lt;MedicinalProductManufactured&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MedicinalProductManufactured> getMedicinalproductmanufacturedIdHistoryVidWithHttpInfo(String id, String vid) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMedicinalproductmanufacturedIdHistoryVid");
    }
    if (vid == null) {
      throw new ApiException(400, "Missing the required parameter 'vid' when calling getMedicinalproductmanufacturedIdHistoryVid");
    }

    // Path parameters
    String localVarPath = "/MedicinalProductManufactured/{id}/_history/{vid}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{vid}", apiClient.escapeString(vid.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<MedicinalProductManufactured> localVarReturnType = new GenericType<MedicinalProductManufactured>() {};
    return apiClient.invokeAPI("MedicinalProductManufacturedApi.getMedicinalproductmanufacturedIdHistoryVid", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
