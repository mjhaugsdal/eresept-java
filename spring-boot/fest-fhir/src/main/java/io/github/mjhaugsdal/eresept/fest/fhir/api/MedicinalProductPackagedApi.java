package io.github.mjhaugsdal.eresept.fest.fhir.api;

import io.github.mjhaugsdal.eresept.fest.fhir.ApiException;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiClient;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiResponse;
import io.github.mjhaugsdal.eresept.fest.fhir.Configuration;
import io.github.mjhaugsdal.eresept.fest.fhir.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.mjhaugsdal.eresept.fest.fhir.model.GetMedicinalproductpackaged200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetMedicinalproductpackagedHistory200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetMedicinalproductpackagedIdHistory200Response;
import java.time.LocalDate;
import io.github.mjhaugsdal.eresept.fest.fhir.model.MedicinalProductPackaged;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T11:23:23.733753200+02:00[Europe/Oslo]", comments = "Generator version: 7.12.0")
public class MedicinalProductPackagedApi {
  private ApiClient apiClient;

  public MedicinalProductPackagedApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MedicinalProductPackagedApi(ApiClient apiClient) {
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
   * List packaged products
   * Get all packaged products. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param identifier Unique identifier. Can be used to search for packaged product by their Varenummer (optional)
   * @param tag Tags applied to this resource (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param subject The product with this is a pack for (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @param packageItemLevelOne Search by productcode at top package level (optional)
   * @param packageItemLevelTwo Search by productcode at second package level (optional)
   * @param packageItemLevelThree Search by productcode at third package level (optional)
   * @return GetMedicinalproductpackaged200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetMedicinalproductpackaged200Response getMedicinalproductpackaged(String source, String identifier, String tag, String security, String subject, LocalDate lastUpdated, String id, String format, String packageItemLevelOne, String packageItemLevelTwo, String packageItemLevelThree) throws ApiException {
    return getMedicinalproductpackagedWithHttpInfo(source, identifier, tag, security, subject, lastUpdated, id, format, packageItemLevelOne, packageItemLevelTwo, packageItemLevelThree).getData();
  }

  /**
   * List packaged products
   * Get all packaged products. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param identifier Unique identifier. Can be used to search for packaged product by their Varenummer (optional)
   * @param tag Tags applied to this resource (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param subject The product with this is a pack for (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @param packageItemLevelOne Search by productcode at top package level (optional)
   * @param packageItemLevelTwo Search by productcode at second package level (optional)
   * @param packageItemLevelThree Search by productcode at third package level (optional)
   * @return ApiResponse&lt;GetMedicinalproductpackaged200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMedicinalproductpackaged200Response> getMedicinalproductpackagedWithHttpInfo(String source, String identifier, String tag, String security, String subject, LocalDate lastUpdated, String id, String format, String packageItemLevelOne, String packageItemLevelTwo, String packageItemLevelThree) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_source", source)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_tag", tag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_security", security));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subject", subject));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_lastUpdated", lastUpdated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "package-item-level-one", packageItemLevelOne));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "package-item-level-two", packageItemLevelTwo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "package-item-level-three", packageItemLevelThree));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetMedicinalproductpackaged200Response> localVarReturnType = new GenericType<GetMedicinalproductpackaged200Response>() {};
    return apiClient.invokeAPI("MedicinalProductPackagedApi.getMedicinalproductpackaged", "/MedicinalProductPackaged", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all packaged products&#39; history
   * Get full version history of all Packaged Products. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetMedicinalproductpackagedHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetMedicinalproductpackagedHistory200Response getMedicinalproductpackagedHistory(String count, String since) throws ApiException {
    return getMedicinalproductpackagedHistoryWithHttpInfo(count, since).getData();
  }

  /**
   * Get all packaged products&#39; history
   * Get full version history of all Packaged Products. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetMedicinalproductpackagedHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMedicinalproductpackagedHistory200Response> getMedicinalproductpackagedHistoryWithHttpInfo(String count, String since) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetMedicinalproductpackagedHistory200Response> localVarReturnType = new GenericType<GetMedicinalproductpackagedHistory200Response>() {};
    return apiClient.invokeAPI("MedicinalProductPackagedApi.getMedicinalproductpackagedHistory", "/MedicinalProductPackaged/_history", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get packaged product
   * Get a packaged product by its ID
   * @param id id of resource (required)
   * @return MedicinalProductPackaged
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public MedicinalProductPackaged getMedicinalproductpackagedId(String id) throws ApiException {
    return getMedicinalproductpackagedIdWithHttpInfo(id).getData();
  }

  /**
   * Get packaged product
   * Get a packaged product by its ID
   * @param id id of resource (required)
   * @return ApiResponse&lt;MedicinalProductPackaged&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MedicinalProductPackaged> getMedicinalproductpackagedIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMedicinalproductpackagedId");
    }

    // Path parameters
    String localVarPath = "/MedicinalProductPackaged/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<MedicinalProductPackaged> localVarReturnType = new GenericType<MedicinalProductPackaged>() {};
    return apiClient.invokeAPI("MedicinalProductPackagedApi.getMedicinalproductpackagedId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Packaged Product history
   * Get full version history of a Packaged Product. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetMedicinalproductpackagedIdHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetMedicinalproductpackagedIdHistory200Response getMedicinalproductpackagedIdHistory(String id, String count, String since) throws ApiException {
    return getMedicinalproductpackagedIdHistoryWithHttpInfo(id, count, since).getData();
  }

  /**
   * Get Packaged Product history
   * Get full version history of a Packaged Product. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetMedicinalproductpackagedIdHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMedicinalproductpackagedIdHistory200Response> getMedicinalproductpackagedIdHistoryWithHttpInfo(String id, String count, String since) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMedicinalproductpackagedIdHistory");
    }

    // Path parameters
    String localVarPath = "/MedicinalProductPackaged/{id}/_history"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetMedicinalproductpackagedIdHistory200Response> localVarReturnType = new GenericType<GetMedicinalproductpackagedIdHistory200Response>() {};
    return apiClient.invokeAPI("MedicinalProductPackagedApi.getMedicinalproductpackagedIdHistory", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Packaged Product version
   * Get a specific version of a packaged product by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return MedicinalProductPackaged
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public MedicinalProductPackaged getMedicinalproductpackagedIdHistoryVid(String id, String vid) throws ApiException {
    return getMedicinalproductpackagedIdHistoryVidWithHttpInfo(id, vid).getData();
  }

  /**
   * Get Packaged Product version
   * Get a specific version of a packaged product by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return ApiResponse&lt;MedicinalProductPackaged&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MedicinalProductPackaged> getMedicinalproductpackagedIdHistoryVidWithHttpInfo(String id, String vid) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMedicinalproductpackagedIdHistoryVid");
    }
    if (vid == null) {
      throw new ApiException(400, "Missing the required parameter 'vid' when calling getMedicinalproductpackagedIdHistoryVid");
    }

    // Path parameters
    String localVarPath = "/MedicinalProductPackaged/{id}/_history/{vid}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{vid}", apiClient.escapeString(vid.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<MedicinalProductPackaged> localVarReturnType = new GenericType<MedicinalProductPackaged>() {};
    return apiClient.invokeAPI("MedicinalProductPackagedApi.getMedicinalproductpackagedIdHistoryVid", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
