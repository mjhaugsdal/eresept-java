package io.github.mjhaugsdal.eresept.fest.fhir.api;

import io.github.mjhaugsdal.eresept.fest.fhir.ApiException;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiClient;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiResponse;
import io.github.mjhaugsdal.eresept.fest.fhir.Configuration;
import io.github.mjhaugsdal.eresept.fest.fhir.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.mjhaugsdal.eresept.fest.fhir.model.GetMedicinalproductpharmaceutical200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetMedicinalproductpharmaceuticalHistory200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetMedicinalproductpharmaceuticalIdHistory200Response;
import java.time.LocalDate;
import io.github.mjhaugsdal.eresept.fest.fhir.model.MedicinalProductPharmaceutical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T11:23:23.733753200+02:00[Europe/Oslo]", comments = "Generator version: 7.12.0")
public class MedicinalProductPharmaceuticalApi {
  private ApiClient apiClient;

  public MedicinalProductPharmaceuticalApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MedicinalProductPharmaceuticalApi(ApiClient apiClient) {
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
   * List Medicinal Product Pharmaceutical
   * Get all administrable products. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param identifier An identifier for the pharmaceutical medicinal product (optional)
   * @param tag Tags applied to this resource (optional)
   * @param route Coded expression for the route (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return GetMedicinalproductpharmaceutical200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetMedicinalproductpharmaceutical200Response getMedicinalproductpharmaceutical(String source, String identifier, String tag, String route, String security, LocalDate lastUpdated, String id, String format) throws ApiException {
    return getMedicinalproductpharmaceuticalWithHttpInfo(source, identifier, tag, route, security, lastUpdated, id, format).getData();
  }

  /**
   * List Medicinal Product Pharmaceutical
   * Get all administrable products. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param identifier An identifier for the pharmaceutical medicinal product (optional)
   * @param tag Tags applied to this resource (optional)
   * @param route Coded expression for the route (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return ApiResponse&lt;GetMedicinalproductpharmaceutical200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMedicinalproductpharmaceutical200Response> getMedicinalproductpharmaceuticalWithHttpInfo(String source, String identifier, String tag, String route, String security, LocalDate lastUpdated, String id, String format) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_source", source)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_tag", tag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "route", route));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_security", security));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_lastUpdated", lastUpdated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_format", format));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetMedicinalproductpharmaceutical200Response> localVarReturnType = new GenericType<GetMedicinalproductpharmaceutical200Response>() {};
    return apiClient.invokeAPI("MedicinalProductPharmaceuticalApi.getMedicinalproductpharmaceutical", "/MedicinalProductPharmaceutical", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all Medicinal Products Pharmaceuticals&#39; history
   * Get full version history of all Administrable Products. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetMedicinalproductpharmaceuticalHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetMedicinalproductpharmaceuticalHistory200Response getMedicinalproductpharmaceuticalHistory(String count, String since) throws ApiException {
    return getMedicinalproductpharmaceuticalHistoryWithHttpInfo(count, since).getData();
  }

  /**
   * Get all Medicinal Products Pharmaceuticals&#39; history
   * Get full version history of all Administrable Products. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetMedicinalproductpharmaceuticalHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMedicinalproductpharmaceuticalHistory200Response> getMedicinalproductpharmaceuticalHistoryWithHttpInfo(String count, String since) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetMedicinalproductpharmaceuticalHistory200Response> localVarReturnType = new GenericType<GetMedicinalproductpharmaceuticalHistory200Response>() {};
    return apiClient.invokeAPI("MedicinalProductPharmaceuticalApi.getMedicinalproductpharmaceuticalHistory", "/MedicinalProductPharmaceutical/_history", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Medicinal Product Pharmaceutical
   * Get an Administrable Product by its ID
   * @param id id of resource (required)
   * @return MedicinalProductPharmaceutical
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public MedicinalProductPharmaceutical getMedicinalproductpharmaceuticalId(String id) throws ApiException {
    return getMedicinalproductpharmaceuticalIdWithHttpInfo(id).getData();
  }

  /**
   * Get Medicinal Product Pharmaceutical
   * Get an Administrable Product by its ID
   * @param id id of resource (required)
   * @return ApiResponse&lt;MedicinalProductPharmaceutical&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MedicinalProductPharmaceutical> getMedicinalproductpharmaceuticalIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMedicinalproductpharmaceuticalId");
    }

    // Path parameters
    String localVarPath = "/MedicinalProductPharmaceutical/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<MedicinalProductPharmaceutical> localVarReturnType = new GenericType<MedicinalProductPharmaceutical>() {};
    return apiClient.invokeAPI("MedicinalProductPharmaceuticalApi.getMedicinalproductpharmaceuticalId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Medicinal Product Pharmaceutical history
   * Get full version history of an Administrable Product. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetMedicinalproductpharmaceuticalIdHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetMedicinalproductpharmaceuticalIdHistory200Response getMedicinalproductpharmaceuticalIdHistory(String id, String count, String since) throws ApiException {
    return getMedicinalproductpharmaceuticalIdHistoryWithHttpInfo(id, count, since).getData();
  }

  /**
   * Get Medicinal Product Pharmaceutical history
   * Get full version history of an Administrable Product. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetMedicinalproductpharmaceuticalIdHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMedicinalproductpharmaceuticalIdHistory200Response> getMedicinalproductpharmaceuticalIdHistoryWithHttpInfo(String id, String count, String since) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMedicinalproductpharmaceuticalIdHistory");
    }

    // Path parameters
    String localVarPath = "/MedicinalProductPharmaceutical/{id}/_history"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetMedicinalproductpharmaceuticalIdHistory200Response> localVarReturnType = new GenericType<GetMedicinalproductpharmaceuticalIdHistory200Response>() {};
    return apiClient.invokeAPI("MedicinalProductPharmaceuticalApi.getMedicinalproductpharmaceuticalIdHistory", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Medicinal Product Pharmaceutical version
   * Get a specific version of an administrable product by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return MedicinalProductPharmaceutical
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public MedicinalProductPharmaceutical getMedicinalproductpharmaceuticalIdHistoryVid(String id, String vid) throws ApiException {
    return getMedicinalproductpharmaceuticalIdHistoryVidWithHttpInfo(id, vid).getData();
  }

  /**
   * Get Medicinal Product Pharmaceutical version
   * Get a specific version of an administrable product by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return ApiResponse&lt;MedicinalProductPharmaceutical&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MedicinalProductPharmaceutical> getMedicinalproductpharmaceuticalIdHistoryVidWithHttpInfo(String id, String vid) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMedicinalproductpharmaceuticalIdHistoryVid");
    }
    if (vid == null) {
      throw new ApiException(400, "Missing the required parameter 'vid' when calling getMedicinalproductpharmaceuticalIdHistoryVid");
    }

    // Path parameters
    String localVarPath = "/MedicinalProductPharmaceutical/{id}/_history/{vid}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{vid}", apiClient.escapeString(vid.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<MedicinalProductPharmaceutical> localVarReturnType = new GenericType<MedicinalProductPharmaceutical>() {};
    return apiClient.invokeAPI("MedicinalProductPharmaceuticalApi.getMedicinalproductpharmaceuticalIdHistoryVid", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
