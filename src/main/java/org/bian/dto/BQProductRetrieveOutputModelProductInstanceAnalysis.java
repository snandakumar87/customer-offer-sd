package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductRetrieveOutputModelProductInstanceAnalysis
 */
public class BQProductRetrieveOutputModelProductInstanceAnalysis   {
  private Object productInstanceAnalysisRecord = null;

  private String productInstanceAnalysisReportType = null;

  private String productInstanceAnalysisParameters = null;

  private Object productInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productInstanceAnalysisRecord
  **/

  public Object getProductInstanceAnalysisRecord() {
    return productInstanceAnalysisRecord;
  }

  public void setProductInstanceAnalysisRecord(Object productInstanceAnalysisRecord) {
    this.productInstanceAnalysisRecord = productInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productInstanceAnalysisReportType
  **/

  public String getProductInstanceAnalysisReportType() {
    return productInstanceAnalysisReportType;
  }

  public void setProductInstanceAnalysisReportType(String productInstanceAnalysisReportType) {
    this.productInstanceAnalysisReportType = productInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productInstanceAnalysisParameters
  **/

  public String getProductInstanceAnalysisParameters() {
    return productInstanceAnalysisParameters;
  }

  public void setProductInstanceAnalysisParameters(String productInstanceAnalysisParameters) {
    this.productInstanceAnalysisParameters = productInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productInstanceAnalysisReport
  **/

  public Object getProductInstanceAnalysisReport() {
    return productInstanceAnalysisReport;
  }

  public void setProductInstanceAnalysisReport(Object productInstanceAnalysisReport) {
    this.productInstanceAnalysisReport = productInstanceAnalysisReport;
  }


}

