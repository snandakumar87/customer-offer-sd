package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUnderwritingRetrieveOutputModelUnderwritingInstanceAnalysis
 */
public class BQUnderwritingRetrieveOutputModelUnderwritingInstanceAnalysis   {
  private Object underwritingInstanceAnalysisRecord = null;

  private String underwritingInstanceAnalysisReportType = null;

  private String underwritingInstanceAnalysisParameters = null;

  private Object underwritingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return underwritingInstanceAnalysisRecord
  **/

  public Object getUnderwritingInstanceAnalysisRecord() {
    return underwritingInstanceAnalysisRecord;
  }

  public void setUnderwritingInstanceAnalysisRecord(Object underwritingInstanceAnalysisRecord) {
    this.underwritingInstanceAnalysisRecord = underwritingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return underwritingInstanceAnalysisReportType
  **/

  public String getUnderwritingInstanceAnalysisReportType() {
    return underwritingInstanceAnalysisReportType;
  }

  public void setUnderwritingInstanceAnalysisReportType(String underwritingInstanceAnalysisReportType) {
    this.underwritingInstanceAnalysisReportType = underwritingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return underwritingInstanceAnalysisParameters
  **/

  public String getUnderwritingInstanceAnalysisParameters() {
    return underwritingInstanceAnalysisParameters;
  }

  public void setUnderwritingInstanceAnalysisParameters(String underwritingInstanceAnalysisParameters) {
    this.underwritingInstanceAnalysisParameters = underwritingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return underwritingInstanceAnalysisReport
  **/

  public Object getUnderwritingInstanceAnalysisReport() {
    return underwritingInstanceAnalysisReport;
  }

  public void setUnderwritingInstanceAnalysisReport(Object underwritingInstanceAnalysisReport) {
    this.underwritingInstanceAnalysisReport = underwritingInstanceAnalysisReport;
  }


}

