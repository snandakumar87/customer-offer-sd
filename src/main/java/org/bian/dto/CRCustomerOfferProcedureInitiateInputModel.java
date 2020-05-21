package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerOfferProcedureInitiateInputModelAgreementInstanceRecord;
import org.bian.dto.CRCustomerOfferProcedureInitiateInputModelAuditInstanceRecord;
import org.bian.dto.CRCustomerOfferProcedureInitiateInputModelBookingInstanceRecord;
import org.bian.dto.CRCustomerOfferProcedureInitiateInputModelComplianceInstanceRecord;
import org.bian.dto.CRCustomerOfferProcedureInitiateInputModelCorrespondenceandDocumentsInstanceRecord;
import org.bian.dto.CRCustomerOfferProcedureInitiateInputModelCreditInstanceRecord;
import org.bian.dto.CRCustomerOfferProcedureInitiateInputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.CRCustomerOfferProcedureInitiateInputModelProductInitializationInstanceRecord;
import org.bian.dto.CRCustomerOfferProcedureInitiateInputModelProductInstanceRecord;
import org.bian.dto.CRCustomerOfferProcedureInitiateInputModelUnderwritingInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureInitiateInputModel
 */
public class CRCustomerOfferProcedureInitiateInputModel   {
  private String customerOfferServicingSessionReference = null;

  private Object customerOfferProcedureInitiateActionRecord = null;

  private String customerOfferProcedureInstanceStatus = null;

  private CRCustomerOfferProcedureInitiateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelProductInstanceRecord productInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelCreditInstanceRecord creditInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelUnderwritingInstanceRecord underwritingInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelComplianceInstanceRecord complianceInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelAuditInstanceRecord auditInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelBookingInstanceRecord bookingInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelCorrespondenceandDocumentsInstanceRecord correspondenceandDocumentsInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelAgreementInstanceRecord agreementInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelProductInitializationInstanceRecord productInitializationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerOfferServicingSessionReference
  **/

  public String getCustomerOfferServicingSessionReference() {
    return customerOfferServicingSessionReference;
  }

  public void setCustomerOfferServicingSessionReference(String customerOfferServicingSessionReference) {
    this.customerOfferServicingSessionReference = customerOfferServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerOfferProcedureInitiateActionRecord
  **/

  public Object getCustomerOfferProcedureInitiateActionRecord() {
    return customerOfferProcedureInitiateActionRecord;
  }

  public void setCustomerOfferProcedureInitiateActionRecord(Object customerOfferProcedureInitiateActionRecord) {
    this.customerOfferProcedureInitiateActionRecord = customerOfferProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Offer Procedure instance (e.g. initialised, pending, active) 
   * @return customerOfferProcedureInstanceStatus
  **/

  public String getCustomerOfferProcedureInstanceStatus() {
    return customerOfferProcedureInstanceStatus;
  }

  public void setCustomerOfferProcedureInstanceStatus(String customerOfferProcedureInstanceStatus) {
    this.customerOfferProcedureInstanceStatus = customerOfferProcedureInstanceStatus;
  }


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CRCustomerOfferProcedureInitiateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * Get productInstanceRecord
   * @return productInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelProductInstanceRecord getProductInstanceRecord() {
    return productInstanceRecord;
  }

  public void setProductInstanceRecord(CRCustomerOfferProcedureInitiateInputModelProductInstanceRecord productInstanceRecord) {
    this.productInstanceRecord = productInstanceRecord;
  }


  /**
   * Get creditInstanceRecord
   * @return creditInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelCreditInstanceRecord getCreditInstanceRecord() {
    return creditInstanceRecord;
  }

  public void setCreditInstanceRecord(CRCustomerOfferProcedureInitiateInputModelCreditInstanceRecord creditInstanceRecord) {
    this.creditInstanceRecord = creditInstanceRecord;
  }


  /**
   * Get underwritingInstanceRecord
   * @return underwritingInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelUnderwritingInstanceRecord getUnderwritingInstanceRecord() {
    return underwritingInstanceRecord;
  }

  public void setUnderwritingInstanceRecord(CRCustomerOfferProcedureInitiateInputModelUnderwritingInstanceRecord underwritingInstanceRecord) {
    this.underwritingInstanceRecord = underwritingInstanceRecord;
  }


  /**
   * Get complianceInstanceRecord
   * @return complianceInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelComplianceInstanceRecord getComplianceInstanceRecord() {
    return complianceInstanceRecord;
  }

  public void setComplianceInstanceRecord(CRCustomerOfferProcedureInitiateInputModelComplianceInstanceRecord complianceInstanceRecord) {
    this.complianceInstanceRecord = complianceInstanceRecord;
  }


  /**
   * Get auditInstanceRecord
   * @return auditInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelAuditInstanceRecord getAuditInstanceRecord() {
    return auditInstanceRecord;
  }

  public void setAuditInstanceRecord(CRCustomerOfferProcedureInitiateInputModelAuditInstanceRecord auditInstanceRecord) {
    this.auditInstanceRecord = auditInstanceRecord;
  }


  /**
   * Get bookingInstanceRecord
   * @return bookingInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelBookingInstanceRecord getBookingInstanceRecord() {
    return bookingInstanceRecord;
  }

  public void setBookingInstanceRecord(CRCustomerOfferProcedureInitiateInputModelBookingInstanceRecord bookingInstanceRecord) {
    this.bookingInstanceRecord = bookingInstanceRecord;
  }


  /**
   * Get correspondenceandDocumentsInstanceRecord
   * @return correspondenceandDocumentsInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelCorrespondenceandDocumentsInstanceRecord getCorrespondenceandDocumentsInstanceRecord() {
    return correspondenceandDocumentsInstanceRecord;
  }

  public void setCorrespondenceandDocumentsInstanceRecord(CRCustomerOfferProcedureInitiateInputModelCorrespondenceandDocumentsInstanceRecord correspondenceandDocumentsInstanceRecord) {
    this.correspondenceandDocumentsInstanceRecord = correspondenceandDocumentsInstanceRecord;
  }


  /**
   * Get agreementInstanceRecord
   * @return agreementInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelAgreementInstanceRecord getAgreementInstanceRecord() {
    return agreementInstanceRecord;
  }

  public void setAgreementInstanceRecord(CRCustomerOfferProcedureInitiateInputModelAgreementInstanceRecord agreementInstanceRecord) {
    this.agreementInstanceRecord = agreementInstanceRecord;
  }


  /**
   * Get productInitializationInstanceRecord
   * @return productInitializationInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelProductInitializationInstanceRecord getProductInitializationInstanceRecord() {
    return productInitializationInstanceRecord;
  }

  public void setProductInitializationInstanceRecord(CRCustomerOfferProcedureInitiateInputModelProductInitializationInstanceRecord productInitializationInstanceRecord) {
    this.productInitializationInstanceRecord = productInitializationInstanceRecord;
  }


}

