package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditRetrieveOutputModelCreditInstanceAnalysis
 */
public class BQCreditRetrieveOutputModelCreditInstanceAnalysis   {
  private Object creditInstanceAnalysisRecord = null;

  private String creditInstanceAnalysisReportType = null;

  private String creditInstanceAnalysisParameters = null;

  private Object creditInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return creditInstanceAnalysisRecord
  **/

  public Object getCreditInstanceAnalysisRecord() {
    return creditInstanceAnalysisRecord;
  }

  public void setCreditInstanceAnalysisRecord(Object creditInstanceAnalysisRecord) {
    this.creditInstanceAnalysisRecord = creditInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return creditInstanceAnalysisReportType
  **/

  public String getCreditInstanceAnalysisReportType() {
    return creditInstanceAnalysisReportType;
  }

  public void setCreditInstanceAnalysisReportType(String creditInstanceAnalysisReportType) {
    this.creditInstanceAnalysisReportType = creditInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return creditInstanceAnalysisParameters
  **/

  public String getCreditInstanceAnalysisParameters() {
    return creditInstanceAnalysisParameters;
  }

  public void setCreditInstanceAnalysisParameters(String creditInstanceAnalysisParameters) {
    this.creditInstanceAnalysisParameters = creditInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return creditInstanceAnalysisReport
  **/

  public Object getCreditInstanceAnalysisReport() {
    return creditInstanceAnalysisReport;
  }

  public void setCreditInstanceAnalysisReport(Object creditInstanceAnalysisReport) {
    this.creditInstanceAnalysisReport = creditInstanceAnalysisReport;
  }


}

