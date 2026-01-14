package io.github.mjhaugsdal.eresept.fest.fhir.api;

import io.github.mjhaugsdal.eresept.fest.fhir.ApiException;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiClient;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiResponse;
import io.github.mjhaugsdal.eresept.fest.fhir.Configuration;
import io.github.mjhaugsdal.eresept.fest.fhir.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.mjhaugsdal.eresept.fest.fhir.model.GetNutritionProduct200Response;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T11:23:23.733753200+02:00[Europe/Oslo]", comments = "Generator version: 7.12.0")
public class NutritionProductApi {
  private ApiClient apiClient;

  public NutritionProductApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NutritionProductApi(ApiClient apiClient) {
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
   * List Nutrition Product
   * Get all nutrition products. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param patient Identifies the focus of this resource (optional)
   * @param identifier Business identifier (optional)
   * @param tag Tags applied to this resource (optional)
   * @param author Who created (optional)
   * @param created Format - date (as full-date in RFC3339). When created (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param subject Identifies the focus of this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return GetNutritionProduct200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetNutritionProduct200Response getNutritionProduct(String source, String patient, String identifier, String tag, String author, LocalDate created, String security, String subject, LocalDate lastUpdated, String id, String format) throws ApiException {
    return getNutritionProductWithHttpInfo(source, patient, identifier, tag, author, created, security, subject, lastUpdated, id, format).getData();
  }

  /**
   * List Nutrition Product
   * Get all nutrition products. For improved performance, results are delivered in pages.
   * @param source Identifies where the resource comes from (optional)
   * @param patient Identifies the focus of this resource (optional)
   * @param identifier Business identifier (optional)
   * @param tag Tags applied to this resource (optional)
   * @param author Who created (optional)
   * @param created Format - date (as full-date in RFC3339). When created (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param subject Identifies the focus of this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return ApiResponse&lt;GetNutritionProduct200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetNutritionProduct200Response> getNutritionProductWithHttpInfo(String source, String patient, String identifier, String tag, String author, LocalDate created, String security, String subject, LocalDate lastUpdated, String id, String format) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_source", source)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "patient", patient));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
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
    GenericType<GetNutritionProduct200Response> localVarReturnType = new GenericType<GetNutritionProduct200Response>() {};
    return apiClient.invokeAPI("NutritionProductApi.getNutritionProduct", "/NutritionProduct", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
