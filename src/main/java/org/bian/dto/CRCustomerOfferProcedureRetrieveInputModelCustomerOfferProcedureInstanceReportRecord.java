package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceReportRecord
 */
public class CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceReportRecord   {
  private String customerOfferProcedureInstanceReportReference = null;

  private String customerOfferProcedureInstanceReportType = null;

  private String customerOfferProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerOfferProcedureInstanceReportReference
  **/

  public String getCustomerOfferProcedureInstanceReportReference() {
    return customerOfferProcedureInstanceReportReference;
  }

  public void setCustomerOfferProcedureInstanceReportReference(String customerOfferProcedureInstanceReportReference) {
    this.customerOfferProcedureInstanceReportReference = customerOfferProcedureInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerOfferProcedureInstanceReportType
  **/

  public String getCustomerOfferProcedureInstanceReportType() {
    return customerOfferProcedureInstanceReportType;
  }

  public void setCustomerOfferProcedureInstanceReportType(String customerOfferProcedureInstanceReportType) {
    this.customerOfferProcedureInstanceReportType = customerOfferProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerOfferProcedureInstanceReportParameters
  **/

  public String getCustomerOfferProcedureInstanceReportParameters() {
    return customerOfferProcedureInstanceReportParameters;
  }

  public void setCustomerOfferProcedureInstanceReportParameters(String customerOfferProcedureInstanceReportParameters) {
    this.customerOfferProcedureInstanceReportParameters = customerOfferProcedureInstanceReportParameters;
  }


}

