package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuditUpdateInputModelAuditInstanceRecord;
import org.bian.dto.BQAuditUpdateInputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAuditUpdateOutputModel
 */
public class BQAuditUpdateOutputModel   {
  private BQAuditUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQAuditUpdateInputModelAuditInstanceRecord auditInstanceRecord = null;

  private String auditUpdateActionTaskReference = null;

  private Object auditUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return auditUpdateActionTaskReference
  **/

  public String getAuditUpdateActionTaskReference() {
    return auditUpdateActionTaskReference;
  }

  public void setAuditUpdateActionTaskReference(String auditUpdateActionTaskReference) {
    this.auditUpdateActionTaskReference = auditUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

