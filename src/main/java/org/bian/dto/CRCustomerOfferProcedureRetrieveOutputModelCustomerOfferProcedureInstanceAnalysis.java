package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceAnalysis
 */
public class CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceAnalysis   {
  private String customerOfferProcedureInstanceAnalysisData = null;

  private String customerOfferProcedureInstanceAnalysisReportType = null;

  private Object customerOfferProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerOfferProcedureInstanceAnalysisData
  **/

  public String getCustomerOfferProcedureInstanceAnalysisData() {
    return customerOfferProcedureInstanceAnalysisData;
  }

  public void setCustomerOfferProcedureInstanceAnalysisData(String customerOfferProcedureInstanceAnalysisData) {
    this.customerOfferProcedureInstanceAnalysisData = customerOfferProcedureInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerOfferProcedureInstanceAnalysisReport
  **/

  public Object getCustomerOfferProcedureInstanceAnalysisReport() {
    return customerOfferProcedureInstanceAnalysisReport;
  }

  public void setCustomerOfferProcedureInstanceAnalysisReport(Object customerOfferProcedureInstanceAnalysisReport) {
    this.customerOfferProcedureInstanceAnalysisReport = customerOfferProcedureInstanceAnalysisReport;
  }


}

