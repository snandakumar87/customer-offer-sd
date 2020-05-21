package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralRetrieveOutputModelCollateralInstanceReport
 */
public class BQCollateralRetrieveOutputModelCollateralInstanceReport   {
  private Object collateralInstanceReportRecord = null;

  private String collateralInstanceReportType = null;

  private String collateralInstanceReportParameters = null;

  private Object collateralInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return collateralInstanceReportRecord
  **/

  public Object getCollateralInstanceReportRecord() {
    return collateralInstanceReportRecord;
  }

  public void setCollateralInstanceReportRecord(Object collateralInstanceReportRecord) {
    this.collateralInstanceReportRecord = collateralInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return collateralInstanceReportType
  **/

  public String getCollateralInstanceReportType() {
    return collateralInstanceReportType;
  }

  public void setCollateralInstanceReportType(String collateralInstanceReportType) {
    this.collateralInstanceReportType = collateralInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return collateralInstanceReportParameters
  **/

  public String getCollateralInstanceReportParameters() {
    return collateralInstanceReportParameters;
  }

  public void setCollateralInstanceReportParameters(String collateralInstanceReportParameters) {
    this.collateralInstanceReportParameters = collateralInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return collateralInstanceReport
  **/

  public Object getCollateralInstanceReport() {
    return collateralInstanceReport;
  }

  public void setCollateralInstanceReport(Object collateralInstanceReport) {
    this.collateralInstanceReport = collateralInstanceReport;
  }


}

