package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuditRetrieveInputModelAuditInstanceAnalysis;
import org.bian.dto.BQAuditRetrieveInputModelAuditInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAuditRetrieveInputModel
 */
public class BQAuditRetrieveInputModel   {
  private Object auditRetrieveActionTaskRecord = null;

  private String auditRetrieveActionRequest = null;

  private BQAuditRetrieveInputModelAuditInstanceReport auditInstanceReport = null;

  private BQAuditRetrieveInputModelAuditInstanceAnalysis auditInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return auditRetrieveActionTaskRecord
  **/

  public Object getAuditRetrieveActionTaskRecord() {
    return auditRetrieveActionTaskRecord;
  }

  public void setAuditRetrieveActionTaskRecord(Object auditRetrieveActionTaskRecord) {
    this.auditRetrieveActionTaskRecord = auditRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return auditRetrieveActionRequest
  **/

  public String getAuditRetrieveActionRequest() {
    return auditRetrieveActionRequest;
  }

  public void setAuditRetrieveActionRequest(String auditRetrieveActionRequest) {
    this.auditRetrieveActionRequest = auditRetrieveActionRequest;
  }


  /**
   * Get auditInstanceReport
   * @return auditInstanceReport
  **/

  public BQAuditRetrieveInputModelAuditInstanceReport getAuditInstanceReport() {
    return auditInstanceReport;
  }

  public void setAuditInstanceReport(BQAuditRetrieveInputModelAuditInstanceReport auditInstanceReport) {
    this.auditInstanceReport = auditInstanceReport;
  }


  /**
   * Get auditInstanceAnalysis
   * @return auditInstanceAnalysis
  **/

  public BQAuditRetrieveInputModelAuditInstanceAnalysis getAuditInstanceAnalysis() {
    return auditInstanceAnalysis;
  }

  public void setAuditInstanceAnalysis(BQAuditRetrieveInputModelAuditInstanceAnalysis auditInstanceAnalysis) {
    this.auditInstanceAnalysis = auditInstanceAnalysis;
  }


}

