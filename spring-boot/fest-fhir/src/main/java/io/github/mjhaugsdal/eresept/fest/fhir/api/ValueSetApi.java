package io.github.mjhaugsdal.eresept.fest.fhir.api;

import io.github.mjhaugsdal.eresept.fest.fhir.ApiException;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiClient;
import io.github.mjhaugsdal.eresept.fest.fhir.ApiResponse;
import io.github.mjhaugsdal.eresept.fest.fhir.Configuration;
import io.github.mjhaugsdal.eresept.fest.fhir.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.mjhaugsdal.eresept.fest.fhir.model.GetValueset200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetValuesetHistory200Response;
import io.github.mjhaugsdal.eresept.fest.fhir.model.GetValuesetIdHistory200Response;
import java.time.LocalDate;
import io.github.mjhaugsdal.eresept.fest.fhir.model.ValueSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T11:23:23.733753200+02:00[Europe/Oslo]", comments = "Generator version: 7.12.0")
public class ValueSetApi {
  private ApiClient apiClient;

  public ValueSetApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ValueSetApi(ApiClient apiClient) {
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
   * List Value Sets
   * Get all value sets. For improved performance, results are delivered in pages.
   * @param title Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): The human-friendly name of the capability statement  * [CodeSystem](codesystem.html): The human-friendly name of the code system  * [ConceptMap](conceptmap.html): The human-friendly name of the concept map  * [ImplementationGuide](implementationguide.html): The human-friendly name of the implementation guide  * [MessageDefinition](messagedefinition.html): The human-friendly name of the message definition  * [OperationDefinition](operationdefinition.html): The human-friendly name of the operation definition  * [StructureDefinition](structuredefinition.html): The human-friendly name of the structure definition  * [StructureMap](structuremap.html): The human-friendly name of the structure map  * [TerminologyCapabilities](terminologycapabilities.html): The human-friendly name of the terminology capabilities  * [ValueSet](valueset.html): The human-friendly name of the value set (optional)
   * @param contextTypeQuantity Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): A use context type and quantity- or range-based value assigned to the capability statement  * [CodeSystem](codesystem.html): A use context type and quantity- or range-based value assigned to the code system  * [CompartmentDefinition](compartmentdefinition.html): A use context type and quantity- or range-based value assigned to the compartment definition  * [ConceptMap](conceptmap.html): A use context type and quantity- or range-based value assigned to the concept map  * [GraphDefinition](graphdefinition.html): A use context type and quantity- or range-based value assigned to the graph definition  * [ImplementationGuide](implementationguide.html): A use context type and quantity- or range-based value assigned to the implementation guide  * [MessageDefinition](messagedefinition.html): A use context type and quantity- or range-based value assigned to the message definition  * [NamingSystem](namingsystem.html): A use context type and quantity- or range-based value assigned to the naming system  * [OperationDefinition](operationdefinition.html): A use context type and quantity- or range-based value assigned to the operation definition  * [SearchParameter](searchparameter.html): A use context type and quantity- or range-based value assigned to the search parameter  * [StructureDefinition](structuredefinition.html): A use context type and quantity- or range-based value assigned to the structure definition  * [StructureMap](structuremap.html): A use context type and quantity- or range-based value assigned to the structure map  * [TerminologyCapabilities](terminologycapabilities.html): A use context type and quantity- or range-based value assigned to the terminology capabilities  * [ValueSet](valueset.html): A use context type and quantity- or range-based value assigned to the value set (optional)
   * @param date Format - date (as full-date in RFC3339). Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): The capability statement publication date  * [CodeSystem](codesystem.html): The code system publication date  * [CompartmentDefinition](compartmentdefinition.html): The compartment definition publication date  * [ConceptMap](conceptmap.html): The concept map publication date  * [GraphDefinition](graphdefinition.html): The graph definition publication date  * [ImplementationGuide](implementationguide.html): The implementation guide publication date  * [MessageDefinition](messagedefinition.html): The message definition publication date  * [NamingSystem](namingsystem.html): The naming system publication date  * [OperationDefinition](operationdefinition.html): The operation definition publication date  * [SearchParameter](searchparameter.html): The search parameter publication date  * [StructureDefinition](structuredefinition.html): The structure definition publication date  * [StructureMap](structuremap.html): The structure map publication date  * [TerminologyCapabilities](terminologycapabilities.html): The terminology capabilities publication date  * [ValueSet](valueset.html): The value set publication date (optional)
   * @param source Identifies where the resource comes from (optional)
   * @param context Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): A use context assigned to the capability statement  * [CodeSystem](codesystem.html): A use context assigned to the code system  * [CompartmentDefinition](compartmentdefinition.html): A use context assigned to the compartment definition  * [ConceptMap](conceptmap.html): A use context assigned to the concept map  * [GraphDefinition](graphdefinition.html): A use context assigned to the graph definition  * [ImplementationGuide](implementationguide.html): A use context assigned to the implementation guide  * [MessageDefinition](messagedefinition.html): A use context assigned to the message definition  * [NamingSystem](namingsystem.html): A use context assigned to the naming system  * [OperationDefinition](operationdefinition.html): A use context assigned to the operation definition  * [SearchParameter](searchparameter.html): A use context assigned to the search parameter  * [StructureDefinition](structuredefinition.html): A use context assigned to the structure definition  * [StructureMap](structuremap.html): A use context assigned to the structure map  * [TerminologyCapabilities](terminologycapabilities.html): A use context assigned to the terminology capabilities  * [ValueSet](valueset.html): A use context assigned to the value set (optional)
   * @param description Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): The description of the capability statement  * [CodeSystem](codesystem.html): The description of the code system  * [CompartmentDefinition](compartmentdefinition.html): The description of the compartment definition  * [ConceptMap](conceptmap.html): The description of the concept map  * [GraphDefinition](graphdefinition.html): The description of the graph definition  * [ImplementationGuide](implementationguide.html): The description of the implementation guide  * [MessageDefinition](messagedefinition.html): The description of the message definition  * [NamingSystem](namingsystem.html): The description of the naming system  * [OperationDefinition](operationdefinition.html): The description of the operation definition  * [SearchParameter](searchparameter.html): The description of the search parameter  * [StructureDefinition](structuredefinition.html): The description of the structure definition  * [StructureMap](structuremap.html): The description of the structure map  * [TerminologyCapabilities](terminologycapabilities.html): The description of the terminology capabilities  * [ValueSet](valueset.html): The description of the value set (optional)
   * @param code This special parameter searches for codes in the value set. See additional notes on the ValueSet resource (optional)
   * @param identifier Multiple Resources:     * [CodeSystem](codesystem.html): External identifier for the code system  * [ConceptMap](conceptmap.html): External identifier for the concept map  * [MessageDefinition](messagedefinition.html): External identifier for the message definition  * [StructureDefinition](structuredefinition.html): External identifier for the structure definition  * [StructureMap](structuremap.html): External identifier for the structure map  * [ValueSet](valueset.html): External identifier for the value set (optional)
   * @param tag Tags applied to this resource (optional)
   * @param reference A code system included or excluded in the value set or an imported value set (optional)
   * @param jurisdiction Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): Intended jurisdiction for the capability statement  * [CodeSystem](codesystem.html): Intended jurisdiction for the code system  * [ConceptMap](conceptmap.html): Intended jurisdiction for the concept map  * [GraphDefinition](graphdefinition.html): Intended jurisdiction for the graph definition  * [ImplementationGuide](implementationguide.html): Intended jurisdiction for the implementation guide  * [MessageDefinition](messagedefinition.html): Intended jurisdiction for the message definition  * [NamingSystem](namingsystem.html): Intended jurisdiction for the naming system  * [OperationDefinition](operationdefinition.html): Intended jurisdiction for the operation definition  * [SearchParameter](searchparameter.html): Intended jurisdiction for the search parameter  * [StructureDefinition](structuredefinition.html): Intended jurisdiction for the structure definition  * [StructureMap](structuremap.html): Intended jurisdiction for the structure map  * [TerminologyCapabilities](terminologycapabilities.html): Intended jurisdiction for the terminology capabilities  * [ValueSet](valueset.html): Intended jurisdiction for the value set (optional)
   * @param contextQuantity Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): A quantity- or range-valued use context assigned to the capability statement  * [CodeSystem](codesystem.html): A quantity- or range-valued use context assigned to the code system  * [CompartmentDefinition](compartmentdefinition.html): A quantity- or range-valued use context assigned to the compartment definition  * [ConceptMap](conceptmap.html): A quantity- or range-valued use context assigned to the concept map  * [GraphDefinition](graphdefinition.html): A quantity- or range-valued use context assigned to the graph definition  * [ImplementationGuide](implementationguide.html): A quantity- or range-valued use context assigned to the implementation guide  * [MessageDefinition](messagedefinition.html): A quantity- or range-valued use context assigned to the message definition  * [NamingSystem](namingsystem.html): A quantity- or range-valued use context assigned to the naming system  * [OperationDefinition](operationdefinition.html): A quantity- or range-valued use context assigned to the operation definition  * [SearchParameter](searchparameter.html): A quantity- or range-valued use context assigned to the search parameter  * [StructureDefinition](structuredefinition.html): A quantity- or range-valued use context assigned to the structure definition  * [StructureMap](structuremap.html): A quantity- or range-valued use context assigned to the structure map  * [TerminologyCapabilities](terminologycapabilities.html): A quantity- or range-valued use context assigned to the terminology capabilities  * [ValueSet](valueset.html): A quantity- or range-valued use context assigned to the value set (optional)
   * @param contextTypeValue Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): A use context type and value assigned to the capability statement  * [CodeSystem](codesystem.html): A use context type and value assigned to the code system  * [CompartmentDefinition](compartmentdefinition.html): A use context type and value assigned to the compartment definition  * [ConceptMap](conceptmap.html): A use context type and value assigned to the concept map  * [GraphDefinition](graphdefinition.html): A use context type and value assigned to the graph definition  * [ImplementationGuide](implementationguide.html): A use context type and value assigned to the implementation guide  * [MessageDefinition](messagedefinition.html): A use context type and value assigned to the message definition  * [NamingSystem](namingsystem.html): A use context type and value assigned to the naming system  * [OperationDefinition](operationdefinition.html): A use context type and value assigned to the operation definition  * [SearchParameter](searchparameter.html): A use context type and value assigned to the search parameter  * [StructureDefinition](structuredefinition.html): A use context type and value assigned to the structure definition  * [StructureMap](structuremap.html): A use context type and value assigned to the structure map  * [TerminologyCapabilities](terminologycapabilities.html): A use context type and value assigned to the terminology capabilities  * [ValueSet](valueset.html): A use context type and value assigned to the value set (optional)
   * @param status Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): The current status of the capability statement  * [CodeSystem](codesystem.html): The current status of the code system  * [CompartmentDefinition](compartmentdefinition.html): The current status of the compartment definition  * [ConceptMap](conceptmap.html): The current status of the concept map  * [GraphDefinition](graphdefinition.html): The current status of the graph definition  * [ImplementationGuide](implementationguide.html): The current status of the implementation guide  * [MessageDefinition](messagedefinition.html): The current status of the message definition  * [NamingSystem](namingsystem.html): The current status of the naming system  * [OperationDefinition](operationdefinition.html): The current status of the operation definition  * [SearchParameter](searchparameter.html): The current status of the search parameter  * [StructureDefinition](structuredefinition.html): The current status of the structure definition  * [StructureMap](structuremap.html): The current status of the structure map  * [TerminologyCapabilities](terminologycapabilities.html): The current status of the terminology capabilities  * [ValueSet](valueset.html): The current status of the value set (optional)
   * @param name Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): Computationally friendly name of the capability statement  * [CodeSystem](codesystem.html): Computationally friendly name of the code system  * [CompartmentDefinition](compartmentdefinition.html): Computationally friendly name of the compartment definition  * [ConceptMap](conceptmap.html): Computationally friendly name of the concept map  * [GraphDefinition](graphdefinition.html): Computationally friendly name of the graph definition  * [ImplementationGuide](implementationguide.html): Computationally friendly name of the implementation guide  * [MessageDefinition](messagedefinition.html): Computationally friendly name of the message definition  * [NamingSystem](namingsystem.html): Computationally friendly name of the naming system  * [OperationDefinition](operationdefinition.html): Computationally friendly name of the operation definition  * [SearchParameter](searchparameter.html): Computationally friendly name of the search parameter  * [StructureDefinition](structuredefinition.html): Computationally friendly name of the structure definition  * [StructureMap](structuremap.html): Computationally friendly name of the structure map  * [TerminologyCapabilities](terminologycapabilities.html): Computationally friendly name of the terminology capabilities  * [ValueSet](valueset.html): Computationally friendly name of the value set (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param contextType Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): A type of use context assigned to the capability statement  * [CodeSystem](codesystem.html): A type of use context assigned to the code system  * [CompartmentDefinition](compartmentdefinition.html): A type of use context assigned to the compartment definition  * [ConceptMap](conceptmap.html): A type of use context assigned to the concept map  * [GraphDefinition](graphdefinition.html): A type of use context assigned to the graph definition  * [ImplementationGuide](implementationguide.html): A type of use context assigned to the implementation guide  * [MessageDefinition](messagedefinition.html): A type of use context assigned to the message definition  * [NamingSystem](namingsystem.html): A type of use context assigned to the naming system  * [OperationDefinition](operationdefinition.html): A type of use context assigned to the operation definition  * [SearchParameter](searchparameter.html): A type of use context assigned to the search parameter  * [StructureDefinition](structuredefinition.html): A type of use context assigned to the structure definition  * [StructureMap](structuremap.html): A type of use context assigned to the structure map  * [TerminologyCapabilities](terminologycapabilities.html): A type of use context assigned to the terminology capabilities  * [ValueSet](valueset.html): A type of use context assigned to the value set (optional)
   * @param url Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): The uri that identifies the capability statement  * [CodeSystem](codesystem.html): The uri that identifies the code system  * [CompartmentDefinition](compartmentdefinition.html): The uri that identifies the compartment definition  * [ConceptMap](conceptmap.html): The uri that identifies the concept map  * [GraphDefinition](graphdefinition.html): The uri that identifies the graph definition  * [ImplementationGuide](implementationguide.html): The uri that identifies the implementation guide  * [MessageDefinition](messagedefinition.html): The uri that identifies the message definition  * [OperationDefinition](operationdefinition.html): The uri that identifies the operation definition  * [SearchParameter](searchparameter.html): The uri that identifies the search parameter  * [StructureDefinition](structuredefinition.html): The uri that identifies the structure definition  * [StructureMap](structuremap.html): The uri that identifies the structure map  * [TerminologyCapabilities](terminologycapabilities.html): The uri that identifies the terminology capabilities  * [ValueSet](valueset.html): The uri that identifies the value set (optional)
   * @param publisher Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): Name of the publisher of the capability statement  * [CodeSystem](codesystem.html): Name of the publisher of the code system  * [CompartmentDefinition](compartmentdefinition.html): Name of the publisher of the compartment definition  * [ConceptMap](conceptmap.html): Name of the publisher of the concept map  * [GraphDefinition](graphdefinition.html): Name of the publisher of the graph definition  * [ImplementationGuide](implementationguide.html): Name of the publisher of the implementation guide  * [MessageDefinition](messagedefinition.html): Name of the publisher of the message definition  * [NamingSystem](namingsystem.html): Name of the publisher of the naming system  * [OperationDefinition](operationdefinition.html): Name of the publisher of the operation definition  * [SearchParameter](searchparameter.html): Name of the publisher of the search parameter  * [StructureDefinition](structuredefinition.html): Name of the publisher of the structure definition  * [StructureMap](structuremap.html): Name of the publisher of the structure map  * [TerminologyCapabilities](terminologycapabilities.html): Name of the publisher of the terminology capabilities  * [ValueSet](valueset.html): Name of the publisher of the value set (optional)
   * @param expansion Identifies the value set expansion (business identifier) (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return GetValueset200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetValueset200Response getValueset(String title, String contextTypeQuantity, LocalDate date, String source, String context, String description, String code, String identifier, String tag, String reference, String jurisdiction, String contextQuantity, String contextTypeValue, String status, String name, String security, LocalDate lastUpdated, String contextType, String url, String publisher, String expansion, String id, String format) throws ApiException {
    return getValuesetWithHttpInfo(title, contextTypeQuantity, date, source, context, description, code, identifier, tag, reference, jurisdiction, contextQuantity, contextTypeValue, status, name, security, lastUpdated, contextType, url, publisher, expansion, id, format).getData();
  }

  /**
   * List Value Sets
   * Get all value sets. For improved performance, results are delivered in pages.
   * @param title Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): The human-friendly name of the capability statement  * [CodeSystem](codesystem.html): The human-friendly name of the code system  * [ConceptMap](conceptmap.html): The human-friendly name of the concept map  * [ImplementationGuide](implementationguide.html): The human-friendly name of the implementation guide  * [MessageDefinition](messagedefinition.html): The human-friendly name of the message definition  * [OperationDefinition](operationdefinition.html): The human-friendly name of the operation definition  * [StructureDefinition](structuredefinition.html): The human-friendly name of the structure definition  * [StructureMap](structuremap.html): The human-friendly name of the structure map  * [TerminologyCapabilities](terminologycapabilities.html): The human-friendly name of the terminology capabilities  * [ValueSet](valueset.html): The human-friendly name of the value set (optional)
   * @param contextTypeQuantity Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): A use context type and quantity- or range-based value assigned to the capability statement  * [CodeSystem](codesystem.html): A use context type and quantity- or range-based value assigned to the code system  * [CompartmentDefinition](compartmentdefinition.html): A use context type and quantity- or range-based value assigned to the compartment definition  * [ConceptMap](conceptmap.html): A use context type and quantity- or range-based value assigned to the concept map  * [GraphDefinition](graphdefinition.html): A use context type and quantity- or range-based value assigned to the graph definition  * [ImplementationGuide](implementationguide.html): A use context type and quantity- or range-based value assigned to the implementation guide  * [MessageDefinition](messagedefinition.html): A use context type and quantity- or range-based value assigned to the message definition  * [NamingSystem](namingsystem.html): A use context type and quantity- or range-based value assigned to the naming system  * [OperationDefinition](operationdefinition.html): A use context type and quantity- or range-based value assigned to the operation definition  * [SearchParameter](searchparameter.html): A use context type and quantity- or range-based value assigned to the search parameter  * [StructureDefinition](structuredefinition.html): A use context type and quantity- or range-based value assigned to the structure definition  * [StructureMap](structuremap.html): A use context type and quantity- or range-based value assigned to the structure map  * [TerminologyCapabilities](terminologycapabilities.html): A use context type and quantity- or range-based value assigned to the terminology capabilities  * [ValueSet](valueset.html): A use context type and quantity- or range-based value assigned to the value set (optional)
   * @param date Format - date (as full-date in RFC3339). Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): The capability statement publication date  * [CodeSystem](codesystem.html): The code system publication date  * [CompartmentDefinition](compartmentdefinition.html): The compartment definition publication date  * [ConceptMap](conceptmap.html): The concept map publication date  * [GraphDefinition](graphdefinition.html): The graph definition publication date  * [ImplementationGuide](implementationguide.html): The implementation guide publication date  * [MessageDefinition](messagedefinition.html): The message definition publication date  * [NamingSystem](namingsystem.html): The naming system publication date  * [OperationDefinition](operationdefinition.html): The operation definition publication date  * [SearchParameter](searchparameter.html): The search parameter publication date  * [StructureDefinition](structuredefinition.html): The structure definition publication date  * [StructureMap](structuremap.html): The structure map publication date  * [TerminologyCapabilities](terminologycapabilities.html): The terminology capabilities publication date  * [ValueSet](valueset.html): The value set publication date (optional)
   * @param source Identifies where the resource comes from (optional)
   * @param context Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): A use context assigned to the capability statement  * [CodeSystem](codesystem.html): A use context assigned to the code system  * [CompartmentDefinition](compartmentdefinition.html): A use context assigned to the compartment definition  * [ConceptMap](conceptmap.html): A use context assigned to the concept map  * [GraphDefinition](graphdefinition.html): A use context assigned to the graph definition  * [ImplementationGuide](implementationguide.html): A use context assigned to the implementation guide  * [MessageDefinition](messagedefinition.html): A use context assigned to the message definition  * [NamingSystem](namingsystem.html): A use context assigned to the naming system  * [OperationDefinition](operationdefinition.html): A use context assigned to the operation definition  * [SearchParameter](searchparameter.html): A use context assigned to the search parameter  * [StructureDefinition](structuredefinition.html): A use context assigned to the structure definition  * [StructureMap](structuremap.html): A use context assigned to the structure map  * [TerminologyCapabilities](terminologycapabilities.html): A use context assigned to the terminology capabilities  * [ValueSet](valueset.html): A use context assigned to the value set (optional)
   * @param description Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): The description of the capability statement  * [CodeSystem](codesystem.html): The description of the code system  * [CompartmentDefinition](compartmentdefinition.html): The description of the compartment definition  * [ConceptMap](conceptmap.html): The description of the concept map  * [GraphDefinition](graphdefinition.html): The description of the graph definition  * [ImplementationGuide](implementationguide.html): The description of the implementation guide  * [MessageDefinition](messagedefinition.html): The description of the message definition  * [NamingSystem](namingsystem.html): The description of the naming system  * [OperationDefinition](operationdefinition.html): The description of the operation definition  * [SearchParameter](searchparameter.html): The description of the search parameter  * [StructureDefinition](structuredefinition.html): The description of the structure definition  * [StructureMap](structuremap.html): The description of the structure map  * [TerminologyCapabilities](terminologycapabilities.html): The description of the terminology capabilities  * [ValueSet](valueset.html): The description of the value set (optional)
   * @param code This special parameter searches for codes in the value set. See additional notes on the ValueSet resource (optional)
   * @param identifier Multiple Resources:     * [CodeSystem](codesystem.html): External identifier for the code system  * [ConceptMap](conceptmap.html): External identifier for the concept map  * [MessageDefinition](messagedefinition.html): External identifier for the message definition  * [StructureDefinition](structuredefinition.html): External identifier for the structure definition  * [StructureMap](structuremap.html): External identifier for the structure map  * [ValueSet](valueset.html): External identifier for the value set (optional)
   * @param tag Tags applied to this resource (optional)
   * @param reference A code system included or excluded in the value set or an imported value set (optional)
   * @param jurisdiction Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): Intended jurisdiction for the capability statement  * [CodeSystem](codesystem.html): Intended jurisdiction for the code system  * [ConceptMap](conceptmap.html): Intended jurisdiction for the concept map  * [GraphDefinition](graphdefinition.html): Intended jurisdiction for the graph definition  * [ImplementationGuide](implementationguide.html): Intended jurisdiction for the implementation guide  * [MessageDefinition](messagedefinition.html): Intended jurisdiction for the message definition  * [NamingSystem](namingsystem.html): Intended jurisdiction for the naming system  * [OperationDefinition](operationdefinition.html): Intended jurisdiction for the operation definition  * [SearchParameter](searchparameter.html): Intended jurisdiction for the search parameter  * [StructureDefinition](structuredefinition.html): Intended jurisdiction for the structure definition  * [StructureMap](structuremap.html): Intended jurisdiction for the structure map  * [TerminologyCapabilities](terminologycapabilities.html): Intended jurisdiction for the terminology capabilities  * [ValueSet](valueset.html): Intended jurisdiction for the value set (optional)
   * @param contextQuantity Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): A quantity- or range-valued use context assigned to the capability statement  * [CodeSystem](codesystem.html): A quantity- or range-valued use context assigned to the code system  * [CompartmentDefinition](compartmentdefinition.html): A quantity- or range-valued use context assigned to the compartment definition  * [ConceptMap](conceptmap.html): A quantity- or range-valued use context assigned to the concept map  * [GraphDefinition](graphdefinition.html): A quantity- or range-valued use context assigned to the graph definition  * [ImplementationGuide](implementationguide.html): A quantity- or range-valued use context assigned to the implementation guide  * [MessageDefinition](messagedefinition.html): A quantity- or range-valued use context assigned to the message definition  * [NamingSystem](namingsystem.html): A quantity- or range-valued use context assigned to the naming system  * [OperationDefinition](operationdefinition.html): A quantity- or range-valued use context assigned to the operation definition  * [SearchParameter](searchparameter.html): A quantity- or range-valued use context assigned to the search parameter  * [StructureDefinition](structuredefinition.html): A quantity- or range-valued use context assigned to the structure definition  * [StructureMap](structuremap.html): A quantity- or range-valued use context assigned to the structure map  * [TerminologyCapabilities](terminologycapabilities.html): A quantity- or range-valued use context assigned to the terminology capabilities  * [ValueSet](valueset.html): A quantity- or range-valued use context assigned to the value set (optional)
   * @param contextTypeValue Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): A use context type and value assigned to the capability statement  * [CodeSystem](codesystem.html): A use context type and value assigned to the code system  * [CompartmentDefinition](compartmentdefinition.html): A use context type and value assigned to the compartment definition  * [ConceptMap](conceptmap.html): A use context type and value assigned to the concept map  * [GraphDefinition](graphdefinition.html): A use context type and value assigned to the graph definition  * [ImplementationGuide](implementationguide.html): A use context type and value assigned to the implementation guide  * [MessageDefinition](messagedefinition.html): A use context type and value assigned to the message definition  * [NamingSystem](namingsystem.html): A use context type and value assigned to the naming system  * [OperationDefinition](operationdefinition.html): A use context type and value assigned to the operation definition  * [SearchParameter](searchparameter.html): A use context type and value assigned to the search parameter  * [StructureDefinition](structuredefinition.html): A use context type and value assigned to the structure definition  * [StructureMap](structuremap.html): A use context type and value assigned to the structure map  * [TerminologyCapabilities](terminologycapabilities.html): A use context type and value assigned to the terminology capabilities  * [ValueSet](valueset.html): A use context type and value assigned to the value set (optional)
   * @param status Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): The current status of the capability statement  * [CodeSystem](codesystem.html): The current status of the code system  * [CompartmentDefinition](compartmentdefinition.html): The current status of the compartment definition  * [ConceptMap](conceptmap.html): The current status of the concept map  * [GraphDefinition](graphdefinition.html): The current status of the graph definition  * [ImplementationGuide](implementationguide.html): The current status of the implementation guide  * [MessageDefinition](messagedefinition.html): The current status of the message definition  * [NamingSystem](namingsystem.html): The current status of the naming system  * [OperationDefinition](operationdefinition.html): The current status of the operation definition  * [SearchParameter](searchparameter.html): The current status of the search parameter  * [StructureDefinition](structuredefinition.html): The current status of the structure definition  * [StructureMap](structuremap.html): The current status of the structure map  * [TerminologyCapabilities](terminologycapabilities.html): The current status of the terminology capabilities  * [ValueSet](valueset.html): The current status of the value set (optional)
   * @param name Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): Computationally friendly name of the capability statement  * [CodeSystem](codesystem.html): Computationally friendly name of the code system  * [CompartmentDefinition](compartmentdefinition.html): Computationally friendly name of the compartment definition  * [ConceptMap](conceptmap.html): Computationally friendly name of the concept map  * [GraphDefinition](graphdefinition.html): Computationally friendly name of the graph definition  * [ImplementationGuide](implementationguide.html): Computationally friendly name of the implementation guide  * [MessageDefinition](messagedefinition.html): Computationally friendly name of the message definition  * [NamingSystem](namingsystem.html): Computationally friendly name of the naming system  * [OperationDefinition](operationdefinition.html): Computationally friendly name of the operation definition  * [SearchParameter](searchparameter.html): Computationally friendly name of the search parameter  * [StructureDefinition](structuredefinition.html): Computationally friendly name of the structure definition  * [StructureMap](structuremap.html): Computationally friendly name of the structure map  * [TerminologyCapabilities](terminologycapabilities.html): Computationally friendly name of the terminology capabilities  * [ValueSet](valueset.html): Computationally friendly name of the value set (optional)
   * @param security Security Labels applied to this resource (optional)
   * @param lastUpdated Format - date (as full-date in RFC3339). When the resource version last changed (optional)
   * @param contextType Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): A type of use context assigned to the capability statement  * [CodeSystem](codesystem.html): A type of use context assigned to the code system  * [CompartmentDefinition](compartmentdefinition.html): A type of use context assigned to the compartment definition  * [ConceptMap](conceptmap.html): A type of use context assigned to the concept map  * [GraphDefinition](graphdefinition.html): A type of use context assigned to the graph definition  * [ImplementationGuide](implementationguide.html): A type of use context assigned to the implementation guide  * [MessageDefinition](messagedefinition.html): A type of use context assigned to the message definition  * [NamingSystem](namingsystem.html): A type of use context assigned to the naming system  * [OperationDefinition](operationdefinition.html): A type of use context assigned to the operation definition  * [SearchParameter](searchparameter.html): A type of use context assigned to the search parameter  * [StructureDefinition](structuredefinition.html): A type of use context assigned to the structure definition  * [StructureMap](structuremap.html): A type of use context assigned to the structure map  * [TerminologyCapabilities](terminologycapabilities.html): A type of use context assigned to the terminology capabilities  * [ValueSet](valueset.html): A type of use context assigned to the value set (optional)
   * @param url Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): The uri that identifies the capability statement  * [CodeSystem](codesystem.html): The uri that identifies the code system  * [CompartmentDefinition](compartmentdefinition.html): The uri that identifies the compartment definition  * [ConceptMap](conceptmap.html): The uri that identifies the concept map  * [GraphDefinition](graphdefinition.html): The uri that identifies the graph definition  * [ImplementationGuide](implementationguide.html): The uri that identifies the implementation guide  * [MessageDefinition](messagedefinition.html): The uri that identifies the message definition  * [OperationDefinition](operationdefinition.html): The uri that identifies the operation definition  * [SearchParameter](searchparameter.html): The uri that identifies the search parameter  * [StructureDefinition](structuredefinition.html): The uri that identifies the structure definition  * [StructureMap](structuremap.html): The uri that identifies the structure map  * [TerminologyCapabilities](terminologycapabilities.html): The uri that identifies the terminology capabilities  * [ValueSet](valueset.html): The uri that identifies the value set (optional)
   * @param publisher Multiple Resources:     * [CapabilityStatement](capabilitystatement.html): Name of the publisher of the capability statement  * [CodeSystem](codesystem.html): Name of the publisher of the code system  * [CompartmentDefinition](compartmentdefinition.html): Name of the publisher of the compartment definition  * [ConceptMap](conceptmap.html): Name of the publisher of the concept map  * [GraphDefinition](graphdefinition.html): Name of the publisher of the graph definition  * [ImplementationGuide](implementationguide.html): Name of the publisher of the implementation guide  * [MessageDefinition](messagedefinition.html): Name of the publisher of the message definition  * [NamingSystem](namingsystem.html): Name of the publisher of the naming system  * [OperationDefinition](operationdefinition.html): Name of the publisher of the operation definition  * [SearchParameter](searchparameter.html): Name of the publisher of the search parameter  * [StructureDefinition](structuredefinition.html): Name of the publisher of the structure definition  * [StructureMap](structuremap.html): Name of the publisher of the structure map  * [TerminologyCapabilities](terminologycapabilities.html): Name of the publisher of the terminology capabilities  * [ValueSet](valueset.html): Name of the publisher of the value set (optional)
   * @param expansion Identifies the value set expansion (business identifier) (optional)
   * @param id Logical id of this artifact (optional)
   * @param format Output formatting (optional)
   * @return ApiResponse&lt;GetValueset200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetValueset200Response> getValuesetWithHttpInfo(String title, String contextTypeQuantity, LocalDate date, String source, String context, String description, String code, String identifier, String tag, String reference, String jurisdiction, String contextQuantity, String contextTypeValue, String status, String name, String security, LocalDate lastUpdated, String contextType, String url, String publisher, String expansion, String id, String format) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "title", title)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "context-type-quantity", contextTypeQuantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_source", source));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "context", context));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_tag", tag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reference", reference));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jurisdiction", jurisdiction));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "context-quantity", contextQuantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "context-type-value", contextTypeValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_security", security));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_lastUpdated", lastUpdated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "context-type", contextType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "publisher", publisher));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expansion", expansion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_format", format));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetValueset200Response> localVarReturnType = new GenericType<GetValueset200Response>() {};
    return apiClient.invokeAPI("ValueSetApi.getValueset", "/ValueSet", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all Value Sets&#39; history
   * Get full version history of all value sets. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetValuesetHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetValuesetHistory200Response getValuesetHistory(String count, String since) throws ApiException {
    return getValuesetHistoryWithHttpInfo(count, since).getData();
  }

  /**
   * Get all Value Sets&#39; history
   * Get full version history of all value sets. Only applicable in the Delta API
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetValuesetHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetValuesetHistory200Response> getValuesetHistoryWithHttpInfo(String count, String since) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetValuesetHistory200Response> localVarReturnType = new GenericType<GetValuesetHistory200Response>() {};
    return apiClient.invokeAPI("ValueSetApi.getValuesetHistory", "/ValueSet/_history", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Value Set
   * Get a value set by its ID
   * @param id id of resource (required)
   * @return ValueSet
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ValueSet getValuesetId(String id) throws ApiException {
    return getValuesetIdWithHttpInfo(id).getData();
  }

  /**
   * Get Value Set
   * Get a value set by its ID
   * @param id id of resource (required)
   * @return ApiResponse&lt;ValueSet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ValueSet> getValuesetIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getValuesetId");
    }

    // Path parameters
    String localVarPath = "/ValueSet/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<ValueSet> localVarReturnType = new GenericType<ValueSet>() {};
    return apiClient.invokeAPI("ValueSetApi.getValuesetId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Value Set history
   * Get full version history of a value set. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return GetValuesetIdHistory200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetValuesetIdHistory200Response getValuesetIdHistory(String id, String count, String since) throws ApiException {
    return getValuesetIdHistoryWithHttpInfo(id, count, since).getData();
  }

  /**
   * Get Value Set history
   * Get full version history of a value set. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param count number to return (optional)
   * @param since how far back (optional)
   * @return ApiResponse&lt;GetValuesetIdHistory200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetValuesetIdHistory200Response> getValuesetIdHistoryWithHttpInfo(String id, String count, String since) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getValuesetIdHistory");
    }

    // Path parameters
    String localVarPath = "/ValueSet/{id}/_history"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "_count", count)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_since", since));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<GetValuesetIdHistory200Response> localVarReturnType = new GenericType<GetValuesetIdHistory200Response>() {};
    return apiClient.invokeAPI("ValueSetApi.getValuesetIdHistory", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Value Set version
   * Get a specific version of a value set by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return ValueSet
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ValueSet getValuesetIdHistoryVid(String id, String vid) throws ApiException {
    return getValuesetIdHistoryVidWithHttpInfo(id, vid).getData();
  }

  /**
   * Get Value Set version
   * Get a specific version of a value set by its version ID. Only applicable in the Delta API
   * @param id id of resource (required)
   * @param vid version id of resource (required)
   * @return ApiResponse&lt;ValueSet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ValueSet> getValuesetIdHistoryVidWithHttpInfo(String id, String vid) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getValuesetIdHistoryVid");
    }
    if (vid == null) {
      throw new ApiException(400, "Missing the required parameter 'vid' when calling getValuesetIdHistoryVid");
    }

    // Path parameters
    String localVarPath = "/ValueSet/{id}/_history/{vid}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{vid}", apiClient.escapeString(vid.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"apiKeyQuery", "apiKeyHeader"};
    GenericType<ValueSet> localVarReturnType = new GenericType<ValueSet>() {};
    return apiClient.invokeAPI("ValueSetApi.getValuesetIdHistoryVid", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
