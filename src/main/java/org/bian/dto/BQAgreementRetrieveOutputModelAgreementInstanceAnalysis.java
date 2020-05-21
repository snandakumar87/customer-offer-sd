package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAgreementRetrieveOutputModelAgreementInstanceAnalysis
 */
public class BQAgreementRetrieveOutputModelAgreementInstanceAnalysis   {
  private Object agreementInstanceAnalysisRecord = null;

  private String agreementInstanceAnalysisReportType = null;

  private String agreementInstanceAnalysisParameters = null;

  private Object agreementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return agreementInstanceAnalysisRecord
  **/

  public Object getAgreementInstanceAnalysisRecord() {
    return agreementInstanceAnalysisRecord;
  }

  public void setAgreementInstanceAnalysisRecord(Object agreementInstanceAnalysisRecord) {
    this.agreementInstanceAnalysisRecord = agreementInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return agreementInstanceAnalysisReportType
  **/

  public String getAgreementInstanceAnalysisReportType() {
    return agreementInstanceAnalysisReportType;
  }

  public void setAgreementInstanceAnalysisReportType(String agreementInstanceAnalysisReportType) {
    this.agreementInstanceAnalysisReportType = agreementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return agreementInstanceAnalysisParameters
  **/

  public String getAgreementInstanceAnalysisParameters() {
    return agreementInstanceAnalysisParameters;
  }

  public void setAgreementInstanceAnalysisParameters(String agreementInstanceAnalysisParameters) {
    this.agreementInstanceAnalysisParameters = agreementInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return agreementInstanceAnalysisReport
  **/

  public Object getAgreementInstanceAnalysisReport() {
    return agreementInstanceAnalysisReport;
  }

  public void setAgreementInstanceAnalysisReport(Object agreementInstanceAnalysisReport) {
    this.agreementInstanceAnalysisReport = agreementInstanceAnalysisReport;
  }


}

