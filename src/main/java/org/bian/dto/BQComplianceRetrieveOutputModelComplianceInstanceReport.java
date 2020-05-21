package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQComplianceRetrieveOutputModelComplianceInstanceReport
 */
public class BQComplianceRetrieveOutputModelComplianceInstanceReport   {
  private Object complianceInstanceReportRecord = null;

  private String complianceInstanceReportType = null;

  private String complianceInstanceReportParameters = null;

  private Object complianceInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return complianceInstanceReportRecord
  **/

  public Object getComplianceInstanceReportRecord() {
    return complianceInstanceReportRecord;
  }

  public void setComplianceInstanceReportRecord(Object complianceInstanceReportRecord) {
    this.complianceInstanceReportRecord = complianceInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return complianceInstanceReportType
  **/

  public String getComplianceInstanceReportType() {
    return complianceInstanceReportType;
  }

  public void setComplianceInstanceReportType(String complianceInstanceReportType) {
    this.complianceInstanceReportType = complianceInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return complianceInstanceReportParameters
  **/

  public String getComplianceInstanceReportParameters() {
    return complianceInstanceReportParameters;
  }

  public void setComplianceInstanceReportParameters(String complianceInstanceReportParameters) {
    this.complianceInstanceReportParameters = complianceInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return complianceInstanceReport
  **/

  public Object getComplianceInstanceReport() {
    return complianceInstanceReport;
  }

  public void setComplianceInstanceReport(Object complianceInstanceReport) {
    this.complianceInstanceReport = complianceInstanceReport;
  }


}

