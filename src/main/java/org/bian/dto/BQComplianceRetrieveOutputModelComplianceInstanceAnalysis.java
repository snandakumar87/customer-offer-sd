package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQComplianceRetrieveOutputModelComplianceInstanceAnalysis
 */
public class BQComplianceRetrieveOutputModelComplianceInstanceAnalysis   {
  private Object complianceInstanceAnalysisRecord = null;

  private String complianceInstanceAnalysisReportType = null;

  private String complianceInstanceAnalysisParameters = null;

  private Object complianceInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return complianceInstanceAnalysisRecord
  **/

  public Object getComplianceInstanceAnalysisRecord() {
    return complianceInstanceAnalysisRecord;
  }

  public void setComplianceInstanceAnalysisRecord(Object complianceInstanceAnalysisRecord) {
    this.complianceInstanceAnalysisRecord = complianceInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return complianceInstanceAnalysisReportType
  **/

  public String getComplianceInstanceAnalysisReportType() {
    return complianceInstanceAnalysisReportType;
  }

  public void setComplianceInstanceAnalysisReportType(String complianceInstanceAnalysisReportType) {
    this.complianceInstanceAnalysisReportType = complianceInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return complianceInstanceAnalysisParameters
  **/

  public String getComplianceInstanceAnalysisParameters() {
    return complianceInstanceAnalysisParameters;
  }

  public void setComplianceInstanceAnalysisParameters(String complianceInstanceAnalysisParameters) {
    this.complianceInstanceAnalysisParameters = complianceInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return complianceInstanceAnalysisReport
  **/

  public Object getComplianceInstanceAnalysisReport() {
    return complianceInstanceAnalysisReport;
  }

  public void setComplianceInstanceAnalysisReport(Object complianceInstanceAnalysisReport) {
    this.complianceInstanceAnalysisReport = complianceInstanceAnalysisReport;
  }


}

