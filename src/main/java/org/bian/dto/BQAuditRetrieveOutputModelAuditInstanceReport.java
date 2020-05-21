package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuditRetrieveOutputModelAuditInstanceReport
 */
public class BQAuditRetrieveOutputModelAuditInstanceReport   {
  private Object auditInstanceReportRecord = null;

  private String auditInstanceReportType = null;

  private String auditInstanceReportParameters = null;

  private Object auditInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return auditInstanceReportRecord
  **/

  public Object getAuditInstanceReportRecord() {
    return auditInstanceReportRecord;
  }

  public void setAuditInstanceReportRecord(Object auditInstanceReportRecord) {
    this.auditInstanceReportRecord = auditInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return auditInstanceReportType
  **/

  public String getAuditInstanceReportType() {
    return auditInstanceReportType;
  }

  public void setAuditInstanceReportType(String auditInstanceReportType) {
    this.auditInstanceReportType = auditInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return auditInstanceReportParameters
  **/

  public String getAuditInstanceReportParameters() {
    return auditInstanceReportParameters;
  }

  public void setAuditInstanceReportParameters(String auditInstanceReportParameters) {
    this.auditInstanceReportParameters = auditInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return auditInstanceReport
  **/

  public Object getAuditInstanceReport() {
    return auditInstanceReport;
  }

  public void setAuditInstanceReport(Object auditInstanceReport) {
    this.auditInstanceReport = auditInstanceReport;
  }


}

