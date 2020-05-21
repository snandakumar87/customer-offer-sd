package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuditRetrieveOutputModelAuditInstanceAnalysis
 */
public class BQAuditRetrieveOutputModelAuditInstanceAnalysis   {
  private Object auditInstanceAnalysisRecord = null;

  private String auditInstanceAnalysisReportType = null;

  private String auditInstanceAnalysisParameters = null;

  private Object auditInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return auditInstanceAnalysisRecord
  **/

  public Object getAuditInstanceAnalysisRecord() {
    return auditInstanceAnalysisRecord;
  }

  public void setAuditInstanceAnalysisRecord(Object auditInstanceAnalysisRecord) {
    this.auditInstanceAnalysisRecord = auditInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return auditInstanceAnalysisReportType
  **/

  public String getAuditInstanceAnalysisReportType() {
    return auditInstanceAnalysisReportType;
  }

  public void setAuditInstanceAnalysisReportType(String auditInstanceAnalysisReportType) {
    this.auditInstanceAnalysisReportType = auditInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return auditInstanceAnalysisParameters
  **/

  public String getAuditInstanceAnalysisParameters() {
    return auditInstanceAnalysisParameters;
  }

  public void setAuditInstanceAnalysisParameters(String auditInstanceAnalysisParameters) {
    this.auditInstanceAnalysisParameters = auditInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return auditInstanceAnalysisReport
  **/

  public Object getAuditInstanceAnalysisReport() {
    return auditInstanceAnalysisReport;
  }

  public void setAuditInstanceAnalysisReport(Object auditInstanceAnalysisReport) {
    this.auditInstanceAnalysisReport = auditInstanceAnalysisReport;
  }


}

