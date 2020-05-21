package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis
 */
public class BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis   {
  private Object disclosuresInstanceAnalysisRecord = null;

  private String disclosuresInstanceAnalysisReportType = null;

  private String disclosuresInstanceAnalysisParameters = null;

  private Object disclosuresInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return disclosuresInstanceAnalysisRecord
  **/

  public Object getDisclosuresInstanceAnalysisRecord() {
    return disclosuresInstanceAnalysisRecord;
  }

  public void setDisclosuresInstanceAnalysisRecord(Object disclosuresInstanceAnalysisRecord) {
    this.disclosuresInstanceAnalysisRecord = disclosuresInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return disclosuresInstanceAnalysisReportType
  **/

  public String getDisclosuresInstanceAnalysisReportType() {
    return disclosuresInstanceAnalysisReportType;
  }

  public void setDisclosuresInstanceAnalysisReportType(String disclosuresInstanceAnalysisReportType) {
    this.disclosuresInstanceAnalysisReportType = disclosuresInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return disclosuresInstanceAnalysisParameters
  **/

  public String getDisclosuresInstanceAnalysisParameters() {
    return disclosuresInstanceAnalysisParameters;
  }

  public void setDisclosuresInstanceAnalysisParameters(String disclosuresInstanceAnalysisParameters) {
    this.disclosuresInstanceAnalysisParameters = disclosuresInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return disclosuresInstanceAnalysisReport
  **/

  public Object getDisclosuresInstanceAnalysisReport() {
    return disclosuresInstanceAnalysisReport;
  }

  public void setDisclosuresInstanceAnalysisReport(Object disclosuresInstanceAnalysisReport) {
    this.disclosuresInstanceAnalysisReport = disclosuresInstanceAnalysisReport;
  }


}

