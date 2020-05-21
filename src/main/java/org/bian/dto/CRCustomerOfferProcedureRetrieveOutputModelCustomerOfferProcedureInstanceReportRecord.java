package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceReportRecord
 */
public class CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceReportRecord   {
  private String customerOfferProcedureInstanceReportData = null;

  private String customerOfferProcedureInstanceReportType = null;

  private Object customerOfferProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerOfferProcedureInstanceReportData
  **/

  public String getCustomerOfferProcedureInstanceReportData() {
    return customerOfferProcedureInstanceReportData;
  }

  public void setCustomerOfferProcedureInstanceReportData(String customerOfferProcedureInstanceReportData) {
    this.customerOfferProcedureInstanceReportData = customerOfferProcedureInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerOfferProcedureInstanceReport
  **/

  public Object getCustomerOfferProcedureInstanceReport() {
    return customerOfferProcedureInstanceReport;
  }

  public void setCustomerOfferProcedureInstanceReport(Object customerOfferProcedureInstanceReport) {
    this.customerOfferProcedureInstanceReport = customerOfferProcedureInstanceReport;
  }


}

