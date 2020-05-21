package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductRetrieveOutputModelProductInstanceReport
 */
public class BQProductRetrieveOutputModelProductInstanceReport   {
  private Object productInstanceReportRecord = null;

  private String productInstanceReportType = null;

  private String productInstanceReportParameters = null;

  private Object productInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productInstanceReportRecord
  **/

  public Object getProductInstanceReportRecord() {
    return productInstanceReportRecord;
  }

  public void setProductInstanceReportRecord(Object productInstanceReportRecord) {
    this.productInstanceReportRecord = productInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productInstanceReportType
  **/

  public String getProductInstanceReportType() {
    return productInstanceReportType;
  }

  public void setProductInstanceReportType(String productInstanceReportType) {
    this.productInstanceReportType = productInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productInstanceReportParameters
  **/

  public String getProductInstanceReportParameters() {
    return productInstanceReportParameters;
  }

  public void setProductInstanceReportParameters(String productInstanceReportParameters) {
    this.productInstanceReportParameters = productInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productInstanceReport
  **/

  public Object getProductInstanceReport() {
    return productInstanceReport;
  }

  public void setProductInstanceReport(Object productInstanceReport) {
    this.productInstanceReport = productInstanceReport;
  }


}

