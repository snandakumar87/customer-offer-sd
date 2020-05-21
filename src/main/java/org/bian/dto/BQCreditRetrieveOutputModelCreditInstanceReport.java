package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditRetrieveOutputModelCreditInstanceReport
 */
public class BQCreditRetrieveOutputModelCreditInstanceReport   {
  private Object creditInstanceReportRecord = null;

  private String creditInstanceReportType = null;

  private String creditInstanceReportParameters = null;

  private Object creditInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return creditInstanceReportRecord
  **/

  public Object getCreditInstanceReportRecord() {
    return creditInstanceReportRecord;
  }

  public void setCreditInstanceReportRecord(Object creditInstanceReportRecord) {
    this.creditInstanceReportRecord = creditInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return creditInstanceReportType
  **/

  public String getCreditInstanceReportType() {
    return creditInstanceReportType;
  }

  public void setCreditInstanceReportType(String creditInstanceReportType) {
    this.creditInstanceReportType = creditInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return creditInstanceReportParameters
  **/

  public String getCreditInstanceReportParameters() {
    return creditInstanceReportParameters;
  }

  public void setCreditInstanceReportParameters(String creditInstanceReportParameters) {
    this.creditInstanceReportParameters = creditInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return creditInstanceReport
  **/

  public Object getCreditInstanceReport() {
    return creditInstanceReport;
  }

  public void setCreditInstanceReport(Object creditInstanceReport) {
    this.creditInstanceReport = creditInstanceReport;
  }


}

