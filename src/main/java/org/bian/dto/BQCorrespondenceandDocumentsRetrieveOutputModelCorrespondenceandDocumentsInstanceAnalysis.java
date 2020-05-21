package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceAnalysis
 */
public class BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceAnalysis   {
  private Object correspondenceandDocumentsInstanceAnalysisRecord = null;

  private String correspondenceandDocumentsInstanceAnalysisReportType = null;

  private String correspondenceandDocumentsInstanceAnalysisParameters = null;

  private Object correspondenceandDocumentsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return correspondenceandDocumentsInstanceAnalysisRecord
  **/

  public Object getCorrespondenceandDocumentsInstanceAnalysisRecord() {
    return correspondenceandDocumentsInstanceAnalysisRecord;
  }

  public void setCorrespondenceandDocumentsInstanceAnalysisRecord(Object correspondenceandDocumentsInstanceAnalysisRecord) {
    this.correspondenceandDocumentsInstanceAnalysisRecord = correspondenceandDocumentsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return correspondenceandDocumentsInstanceAnalysisReportType
  **/

  public String getCorrespondenceandDocumentsInstanceAnalysisReportType() {
    return correspondenceandDocumentsInstanceAnalysisReportType;
  }

  public void setCorrespondenceandDocumentsInstanceAnalysisReportType(String correspondenceandDocumentsInstanceAnalysisReportType) {
    this.correspondenceandDocumentsInstanceAnalysisReportType = correspondenceandDocumentsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return correspondenceandDocumentsInstanceAnalysisParameters
  **/

  public String getCorrespondenceandDocumentsInstanceAnalysisParameters() {
    return correspondenceandDocumentsInstanceAnalysisParameters;
  }

  public void setCorrespondenceandDocumentsInstanceAnalysisParameters(String correspondenceandDocumentsInstanceAnalysisParameters) {
    this.correspondenceandDocumentsInstanceAnalysisParameters = correspondenceandDocumentsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return correspondenceandDocumentsInstanceAnalysisReport
  **/

  public Object getCorrespondenceandDocumentsInstanceAnalysisReport() {
    return correspondenceandDocumentsInstanceAnalysisReport;
  }

  public void setCorrespondenceandDocumentsInstanceAnalysisReport(Object correspondenceandDocumentsInstanceAnalysisReport) {
    this.correspondenceandDocumentsInstanceAnalysisReport = correspondenceandDocumentsInstanceAnalysisReport;
  }


}

