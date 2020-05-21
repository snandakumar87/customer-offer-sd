package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuditUpdateInputModelAuditInstanceRecord;
import org.bian.dto.BQAuditUpdateInputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAuditUpdateInputModel
 */
public class BQAuditUpdateInputModel   {
  private BQAuditUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private String customerOfferProcedureInstanceReference = null;

  private String auditInstanceReference = null;

  private BQAuditUpdateInputModelAuditInstanceRecord auditInstanceRecord = null;

  private Object auditUpdateActionTaskRecord = null;

  private String auditUpdateActionRequest = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQAuditUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQAuditUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Offer Procedure instance 
   * @return customerOfferProcedureInstanceReference
  **/

  public String getCustomerOfferProcedureInstanceReference() {
    return customerOfferProcedureInstanceReference;
  }

  public void setCustomerOfferProcedureInstanceReference(String customerOfferProcedureInstanceReference) {
    this.customerOfferProcedureInstanceReference = customerOfferProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Audit instance 
   * @return auditInstanceReference
  **/

  public String getAuditInstanceReference() {
    return auditInstanceReference;
  }

  public void setAuditInstanceReference(String auditInstanceReference) {
    this.auditInstanceReference = auditInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return auditUpdateActionTaskRecord
  **/

  public Object getAuditUpdateActionTaskRecord() {
    return auditUpdateActionTaskRecord;
  }

  public void setAuditUpdateActionTaskRecord(Object auditUpdateActionTaskRecord) {
    this.auditUpdateActionTaskRecord = auditUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return auditUpdateActionRequest
  **/

  public String getAuditUpdateActionRequest() {
    return auditUpdateActionRequest;
  }

  public void setAuditUpdateActionRequest(String auditUpdateActionRequest) {
    this.auditUpdateActionRequest = auditUpdateActionRequest;
  }


}

