package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceAnalysis
 */
public class CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceAnalysis   {
  private String customerOfferProcedureInstanceAnalysisReference = null;

  private String customerOfferProcedureInstanceAnalysisReportType = null;

  private String customerOfferProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerOfferProcedureInstanceAnalysisReference
  **/

  public String getCustomerOfferProcedureInstanceAnalysisReference() {
    return customerOfferProcedureInstanceAnalysisReference;
  }

  public void setCustomerOfferProcedureInstanceAnalysisReference(String customerOfferProcedureInstanceAnalysisReference) {
    this.customerOfferProcedureInstanceAnalysisReference = customerOfferProcedureInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerOfferProcedureInstanceAnalysisReportType
  **/

  public String getCustomerOfferProcedureInstanceAnalysisReportType() {
    return customerOfferProcedureInstanceAnalysisReportType;
  }

  public void setCustomerOfferProcedureInstanceAnalysisReportType(String customerOfferProcedureInstanceAnalysisReportType) {
    this.customerOfferProcedureInstanceAnalysisReportType = customerOfferProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerOfferProcedureInstanceAnalysisParameters
  **/

  public String getCustomerOfferProcedureInstanceAnalysisParameters() {
    return customerOfferProcedureInstanceAnalysisParameters;
  }

  public void setCustomerOfferProcedureInstanceAnalysisParameters(String customerOfferProcedureInstanceAnalysisParameters) {
    this.customerOfferProcedureInstanceAnalysisParameters = customerOfferProcedureInstanceAnalysisParameters;
  }


}

