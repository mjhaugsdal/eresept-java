package io.github.mjhaugsdal.eresept.fest.fhir.api;

import io.github.mjhaugsdal.eresept.fest.fhir.ApiException;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiClient;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiResponse;
import io.github.mjhaugsdal.eresept.fest.fhir.Configuration;
import io.github.mjhaugsdal.eresept.fest.fhir.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.mjhaugsdal.eresept.fest.fhir.model.GetMedicinalproductingredient200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetMedicinalproductingredientHistory200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetMedicinalproductingredientIdHistory200Response;
import java.time.LocalDate;
import io.github.mjhaugsdal.eresept.fest.fhir.model.MedicinalProductIngredient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T11:23:23.733753200+02:00[Europe/Oslo]", comments = "Generator version: 7.12.0")
public class MedicinalProductIngredientApi {
  private ApiClient apiClient;

  public MedicinalProductIngredientApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MedicinalProductIngredientApi(ApiClient apiClient) {
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
   * List Ingredients
   * Get all ingredients. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param tag Tags applied to this resource (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return GetMedicinalproductingredient200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetMedicinalproductingredient200Response getMedicinalproductingredient(String source, String tag, String security, LocalDate lastUpdated, String id, String format) throws ApiException {
    return getMedicinalproductingredientWithHttpInfo(source, tag, security, lastUpdated, id, format).getData();
  }

  /**
   * List Ingredients
   * Get all ingredients. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param tag Tags applied to this resource (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return ApiResponse&lt;GetMedicinalproductingredient200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMedicinalproductingredient200Response> getMedicinalproductingredientWithHttpInfo(String source, String tag, String security, LocalDate lastUpdated, String id, String format) throws ApiException {
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
    GenericType<GetMedicinalproductingredient200Response> localVarReturnType = new GenericType<GetMedicinalproductingredient200Response>() {};
    return apiClient.invokeAPI("MedicinalProductIngredientApi.getMedicinalproductingredient", "/MedicinalProductIngredient", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all Medicinal Products Ingredients&#39; history
   * Get full version history of all ingredients. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetMedicinalproductingredientHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetMedicinalproductingredientHistory200Response getMedicinalproductingredientHistory(String count, String since) throws ApiException {
    return getMedicinalproductingredientHistoryWithHttpInfo(count, since).getData();
  }

  /**
   * Get all Medicinal Products Ingredients&#39; history
   * Get full version history of all ingredients. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetMedicinalproductingredientHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMedicinalproductingredientHistory200Response> getMedicinalproductingredientHistoryWithHttpInfo(String count, String since) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetMedicinalproductingredientHistory200Response> localVarReturnType = new GenericType<GetMedicinalproductingredientHistory200Response>() {};
    return apiClient.invokeAPI("MedicinalProductIngredientApi.getMedicinalproductingredientHistory", "/MedicinalProductIngredient/_history", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Ingredient
   * Get an ingredient by its ID
   * @param id id of resource (required)
   * @return MedicinalProductIngredient
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public MedicinalProductIngredient getMedicinalproductingredientId(String id) throws ApiException {
    return getMedicinalproductingredientIdWithHttpInfo(id).getData();
  }

  /**
   * Get Ingredient
   * Get an ingredient by its ID
   * @param id id of resource (required)
   * @return ApiResponse&lt;MedicinalProductIngredient&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MedicinalProductIngredient> getMedicinalproductingredientIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMedicinalproductingredientId");
    }

    // Path parameters
    String localVarPath = "/MedicinalProductIngredient/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<MedicinalProductIngredient> localVarReturnType = new GenericType<MedicinalProductIngredient>() {};
    return apiClient.invokeAPI("MedicinalProductIngredientApi.getMedicinalproductingredientId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Medicinal Product Ingredient history
   * Get full version history of an ingredient. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetMedicinalproductingredientIdHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetMedicinalproductingredientIdHistory200Response getMedicinalproductingredientIdHistory(String id, String count, String since) throws ApiException {
    return getMedicinalproductingredientIdHistoryWithHttpInfo(id, count, since).getData();
  }

  /**
   * Get Medicinal Product Ingredient history
   * Get full version history of an ingredient. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetMedicinalproductingredientIdHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMedicinalproductingredientIdHistory200Response> getMedicinalproductingredientIdHistoryWithHttpInfo(String id, String count, String since) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMedicinalproductingredientIdHistory");
    }

    // Path parameters
    String localVarPath = "/MedicinalProductIngredient/{id}/_history"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetMedicinalproductingredientIdHistory200Response> localVarReturnType = new GenericType<GetMedicinalproductingredientIdHistory200Response>() {};
    return apiClient.invokeAPI("MedicinalProductIngredientApi.getMedicinalproductingredientIdHistory", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
