package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuditRetrieveOutputModelAuditInstanceAnalysis;
import org.bian.dto.BQAuditRetrieveOutputModelAuditInstanceReport;
import org.bian.dto.BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.BQAuditUpdateInputModelAuditInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAuditRetrieveOutputModel
 */
public class BQAuditRetrieveOutputModel   {
  private BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQAuditUpdateInputModelAuditInstanceRecord auditInstanceRecord = null;

  private String auditRetrieveActionTaskReference = null;

  private Object auditRetrieveActionTaskRecord = null;

  private String auditRetrieveActionResponse = null;

  private BQAuditRetrieveOutputModelAuditInstanceReport auditInstanceReport = null;

  private BQAuditRetrieveOutputModelAuditInstanceAnalysis auditInstanceAnalysis = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * Get auditInstanceRecord
   * @return auditInstanceRecord
  **/

  public BQAuditUpdateInputModelAuditInstanceRecord getAuditInstanceRecord() {
    return auditInstanceRecord;
  }

  public void setAuditInstanceRecord(BQAuditUpdateInputModelAuditInstanceRecord auditInstanceRecord) {
    this.auditInstanceRecord = auditInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Audit instance retrieve service call 
   * @return auditRetrieveActionTaskReference
  **/

  public String getAuditRetrieveActionTaskReference() {
    return auditRetrieveActionTaskReference;
  }

  public void setAuditRetrieveActionTaskReference(String auditRetrieveActionTaskReference) {
    this.auditRetrieveActionTaskReference = auditRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return auditRetrieveActionResponse
  **/

  public String getAuditRetrieveActionResponse() {
    return auditRetrieveActionResponse;
  }

  public void setAuditRetrieveActionResponse(String auditRetrieveActionResponse) {
    this.auditRetrieveActionResponse = auditRetrieveActionResponse;
  }


  /**
   * Get auditInstanceReport
   * @return auditInstanceReport
  **/

  public BQAuditRetrieveOutputModelAuditInstanceReport getAuditInstanceReport() {
    return auditInstanceReport;
  }

  public void setAuditInstanceReport(BQAuditRetrieveOutputModelAuditInstanceReport auditInstanceReport) {
    this.auditInstanceReport = auditInstanceReport;
  }


  /**
   * Get auditInstanceAnalysis
   * @return auditInstanceAnalysis
  **/

  public BQAuditRetrieveOutputModelAuditInstanceAnalysis getAuditInstanceAnalysis() {
    return auditInstanceAnalysis;
  }

  public void setAuditInstanceAnalysis(BQAuditRetrieveOutputModelAuditInstanceAnalysis auditInstanceAnalysis) {
    this.auditInstanceAnalysis = auditInstanceAnalysis;
  }


}

