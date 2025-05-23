package io.github.mjhaugsdal.eresept.fest.fhir.api;

import io.github.mjhaugsdal.eresept.fest.fhir.ApiException;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiClient;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiResponse;
import io.github.mjhaugsdal.eresept.fest.fhir.Configuration;
import io.github.mjhaugsdal.eresept.fest.fhir.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.mjhaugsdal.eresept.fest.fhir.model.GetMedicinalproduct200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetMedicinalproductHistory200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetMedicinalproductIdHistory200Response;
import java.time.LocalDate;
import io.github.mjhaugsdal.eresept.fest.fhir.model.MedicinalProduct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T11:23:23.733753200+02:00[Europe/Oslo]", comments = "Generator version: 7.12.0")
public class MedicinalProductApi {
  private ApiClient apiClient;

  public MedicinalProductApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MedicinalProductApi(ApiClient apiClient) {
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
   * List MedicinalProduct
   * Get all medicinal products. For improved performance, results are delivered in pages.
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
   * @return GetMedicinalproduct200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetMedicinalproduct200Response getMedicinalproduct(String source, String nameLanguage, String identifier, String tag, String name, String security, LocalDate lastUpdated, String id, String format, Integer count, String ct) throws ApiException {
    return getMedicinalproductWithHttpInfo(source, nameLanguage, identifier, tag, name, security, lastUpdated, id, format, count, ct).getData();
  }

  /**
   * List MedicinalProduct
   * Get all medicinal products. For improved performance, results are delivered in pages.
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
   * @return ApiResponse&lt;GetMedicinalproduct200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMedicinalproduct200Response> getMedicinalproductWithHttpInfo(String source, String nameLanguage, String identifier, String tag, String name, String security, LocalDate lastUpdated, String id, String format, Integer count, String ct) throws ApiException {
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
    GenericType<GetMedicinalproduct200Response> localVarReturnType = new GenericType<GetMedicinalproduct200Response>() {};
    return apiClient.invokeAPI("MedicinalProductApi.getMedicinalproduct", "/MedicinalProduct", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all Medicinal Products&#39; history
   * Get full version history of all Medicinal Products. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetMedicinalproductHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetMedicinalproductHistory200Response getMedicinalproductHistory(String count, String since) throws ApiException {
    return getMedicinalproductHistoryWithHttpInfo(count, since).getData();
  }

  /**
   * Get all Medicinal Products&#39; history
   * Get full version history of all Medicinal Products. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetMedicinalproductHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMedicinalproductHistory200Response> getMedicinalproductHistoryWithHttpInfo(String count, String since) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetMedicinalproductHistory200Response> localVarReturnType = new GenericType<GetMedicinalproductHistory200Response>() {};
    return apiClient.invokeAPI("MedicinalProductApi.getMedicinalproductHistory", "/MedicinalProduct/_history", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Medicinal Product
   * Get a Medicinal Product by its ID
   * @param id id of resource (required)
   * @return MedicinalProduct
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public MedicinalProduct getMedicinalproductId(String id) throws ApiException {
    return getMedicinalproductIdWithHttpInfo(id).getData();
  }

  /**
   * Get Medicinal Product
   * Get a Medicinal Product by its ID
   * @param id id of resource (required)
   * @return ApiResponse&lt;MedicinalProduct&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MedicinalProduct> getMedicinalproductIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMedicinalproductId");
    }

    // Path parameters
    String localVarPath = "/MedicinalProduct/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<MedicinalProduct> localVarReturnType = new GenericType<MedicinalProduct>() {};
    return apiClient.invokeAPI("MedicinalProductApi.getMedicinalproductId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Medicinal Product history
   * Get full version history of a Medicinal Product. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetMedicinalproductIdHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetMedicinalproductIdHistory200Response getMedicinalproductIdHistory(String id, String count, String since) throws ApiException {
    return getMedicinalproductIdHistoryWithHttpInfo(id, count, since).getData();
  }

  /**
   * Get Medicinal Product history
   * Get full version history of a Medicinal Product. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetMedicinalproductIdHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMedicinalproductIdHistory200Response> getMedicinalproductIdHistoryWithHttpInfo(String id, String count, String since) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMedicinalproductIdHistory");
    }

    // Path parameters
    String localVarPath = "/MedicinalProduct/{id}/_history"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetMedicinalproductIdHistory200Response> localVarReturnType = new GenericType<GetMedicinalproductIdHistory200Response>() {};
    return apiClient.invokeAPI("MedicinalProductApi.getMedicinalproductIdHistory", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Medicinal Product version
   * Get a specific version of a Medicinal product by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return MedicinalProduct
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public MedicinalProduct getMedicinalproductIdHistoryVid(String id, String vid) throws ApiException {
    return getMedicinalproductIdHistoryVidWithHttpInfo(id, vid).getData();
  }

  /**
   * Get Medicinal Product version
   * Get a specific version of a Medicinal product by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return ApiResponse&lt;MedicinalProduct&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MedicinalProduct> getMedicinalproductIdHistoryVidWithHttpInfo(String id, String vid) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMedicinalproductIdHistoryVid");
    }
    if (vid == null) {
      throw new ApiException(400, "Missing the required parameter 'vid' when calling getMedicinalproductIdHistoryVid");
    }

    // Path parameters
    String localVarPath = "/MedicinalProduct/{id}/_history/{vid}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{vid}", apiClient.escapeString(vid.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<MedicinalProduct> localVarReturnType = new GenericType<MedicinalProduct>() {};
    return apiClient.invokeAPI("MedicinalProductApi.getMedicinalproductIdHistoryVid", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
