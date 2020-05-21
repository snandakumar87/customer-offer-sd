package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAgreementRetrieveOutputModelAgreementInstanceReport
 */
public class BQAgreementRetrieveOutputModelAgreementInstanceReport   {
  private Object agreementInstanceReportRecord = null;

  private String agreementInstanceReportType = null;

  private String agreementInstanceReportParameters = null;

  private Object agreementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return agreementInstanceReportRecord
  **/

  public Object getAgreementInstanceReportRecord() {
    return agreementInstanceReportRecord;
  }

  public void setAgreementInstanceReportRecord(Object agreementInstanceReportRecord) {
    this.agreementInstanceReportRecord = agreementInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return agreementInstanceReportType
  **/

  public String getAgreementInstanceReportType() {
    return agreementInstanceReportType;
  }

  public void setAgreementInstanceReportType(String agreementInstanceReportType) {
    this.agreementInstanceReportType = agreementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return agreementInstanceReportParameters
  **/

  public String getAgreementInstanceReportParameters() {
    return agreementInstanceReportParameters;
  }

  public void setAgreementInstanceReportParameters(String agreementInstanceReportParameters) {
    this.agreementInstanceReportParameters = agreementInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return agreementInstanceReport
  **/

  public Object getAgreementInstanceReport() {
    return agreementInstanceReport;
  }

  public void setAgreementInstanceReport(Object agreementInstanceReport) {
    this.agreementInstanceReport = agreementInstanceReport;
  }


}

