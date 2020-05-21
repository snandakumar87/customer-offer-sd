package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductInitializationRetrieveOutputModelProductInitializationInstanceReport
 */
public class BQProductInitializationRetrieveOutputModelProductInitializationInstanceReport   {
  private Object productInitializationInstanceReportRecord = null;

  private String productInitializationInstanceReportType = null;

  private String productInitializationInstanceReportParameters = null;

  private Object productInitializationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productInitializationInstanceReportRecord
  **/

  public Object getProductInitializationInstanceReportRecord() {
    return productInitializationInstanceReportRecord;
  }

  public void setProductInitializationInstanceReportRecord(Object productInitializationInstanceReportRecord) {
    this.productInitializationInstanceReportRecord = productInitializationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productInitializationInstanceReportType
  **/

  public String getProductInitializationInstanceReportType() {
    return productInitializationInstanceReportType;
  }

  public void setProductInitializationInstanceReportType(String productInitializationInstanceReportType) {
    this.productInitializationInstanceReportType = productInitializationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productInitializationInstanceReportParameters
  **/

  public String getProductInitializationInstanceReportParameters() {
    return productInitializationInstanceReportParameters;
  }

  public void setProductInitializationInstanceReportParameters(String productInitializationInstanceReportParameters) {
    this.productInitializationInstanceReportParameters = productInitializationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productInitializationInstanceReport
  **/

  public Object getProductInitializationInstanceReport() {
    return productInitializationInstanceReport;
  }

  public void setProductInitializationInstanceReport(Object productInitializationInstanceReport) {
    this.productInitializationInstanceReport = productInitializationInstanceReport;
  }


}

