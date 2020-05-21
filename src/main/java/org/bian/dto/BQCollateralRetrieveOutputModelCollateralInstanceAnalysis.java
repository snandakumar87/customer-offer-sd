package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralRetrieveOutputModelCollateralInstanceAnalysis
 */
public class BQCollateralRetrieveOutputModelCollateralInstanceAnalysis   {
  private Object collateralInstanceAnalysisRecord = null;

  private String collateralInstanceAnalysisReportType = null;

  private String collateralInstanceAnalysisParameters = null;

  private Object collateralInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return collateralInstanceAnalysisRecord
  **/

  public Object getCollateralInstanceAnalysisRecord() {
    return collateralInstanceAnalysisRecord;
  }

  public void setCollateralInstanceAnalysisRecord(Object collateralInstanceAnalysisRecord) {
    this.collateralInstanceAnalysisRecord = collateralInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return collateralInstanceAnalysisReportType
  **/

  public String getCollateralInstanceAnalysisReportType() {
    return collateralInstanceAnalysisReportType;
  }

  public void setCollateralInstanceAnalysisReportType(String collateralInstanceAnalysisReportType) {
    this.collateralInstanceAnalysisReportType = collateralInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return collateralInstanceAnalysisParameters
  **/

  public String getCollateralInstanceAnalysisParameters() {
    return collateralInstanceAnalysisParameters;
  }

  public void setCollateralInstanceAnalysisParameters(String collateralInstanceAnalysisParameters) {
    this.collateralInstanceAnalysisParameters = collateralInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return collateralInstanceAnalysisReport
  **/

  public Object getCollateralInstanceAnalysisReport() {
    return collateralInstanceAnalysisReport;
  }

  public void setCollateralInstanceAnalysisReport(Object collateralInstanceAnalysisReport) {
    this.collateralInstanceAnalysisReport = collateralInstanceAnalysisReport;
  }


}

