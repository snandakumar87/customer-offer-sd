package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductInitializationRetrieveOutputModelProductInitializationInstanceAnalysis
 */
public class BQProductInitializationRetrieveOutputModelProductInitializationInstanceAnalysis   {
  private Object productInitializationInstanceAnalysisRecord = null;

  private String productInitializationInstanceAnalysisReportType = null;

  private String productInitializationInstanceAnalysisParameters = null;

  private Object productInitializationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productInitializationInstanceAnalysisRecord
  **/

  public Object getProductInitializationInstanceAnalysisRecord() {
    return productInitializationInstanceAnalysisRecord;
  }

  public void setProductInitializationInstanceAnalysisRecord(Object productInitializationInstanceAnalysisRecord) {
    this.productInitializationInstanceAnalysisRecord = productInitializationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productInitializationInstanceAnalysisReportType
  **/

  public String getProductInitializationInstanceAnalysisReportType() {
    return productInitializationInstanceAnalysisReportType;
  }

  public void setProductInitializationInstanceAnalysisReportType(String productInitializationInstanceAnalysisReportType) {
    this.productInitializationInstanceAnalysisReportType = productInitializationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productInitializationInstanceAnalysisParameters
  **/

  public String getProductInitializationInstanceAnalysisParameters() {
    return productInitializationInstanceAnalysisParameters;
  }

  public void setProductInitializationInstanceAnalysisParameters(String productInitializationInstanceAnalysisParameters) {
    this.productInitializationInstanceAnalysisParameters = productInitializationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return productInitializationInstanceAnalysisReport
  **/

  public Object getProductInitializationInstanceAnalysisReport() {
    return productInitializationInstanceAnalysisReport;
  }

  public void setProductInitializationInstanceAnalysisReport(Object productInitializationInstanceAnalysisReport) {
    this.productInitializationInstanceAnalysisReport = productInitializationInstanceAnalysisReport;
  }


}

