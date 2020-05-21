package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAgreementUpdateInputModelAgreementInstanceRecord;
import org.bian.dto.BQAgreementUpdateInputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAgreementUpdateInputModel
 */
public class BQAgreementUpdateInputModel   {
  private BQAgreementUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private String customerOfferProcedureInstanceReference = null;

  private String agreementInstanceReference = null;

  private BQAgreementUpdateInputModelAgreementInstanceRecord agreementInstanceRecord = null;

  private Object agreementUpdateActionTaskRecord = null;

  private String agreementUpdateActionRequest = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQAgreementUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQAgreementUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Agreement instance 
   * @return agreementInstanceReference
  **/

  public String getAgreementInstanceReference() {
    return agreementInstanceReference;
  }

  public void setAgreementInstanceReference(String agreementInstanceReference) {
    this.agreementInstanceReference = agreementInstanceReference;
  }


  /**
   * Get agreementInstanceRecord
   * @return agreementInstanceRecord
  **/

  public BQAgreementUpdateInputModelAgreementInstanceRecord getAgreementInstanceRecord() {
    return agreementInstanceRecord;
  }

  public void setAgreementInstanceRecord(BQAgreementUpdateInputModelAgreementInstanceRecord agreementInstanceRecord) {
    this.agreementInstanceRecord = agreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return agreementUpdateActionTaskRecord
  **/

  public Object getAgreementUpdateActionTaskRecord() {
    return agreementUpdateActionTaskRecord;
  }

  public void setAgreementUpdateActionTaskRecord(Object agreementUpdateActionTaskRecord) {
    this.agreementUpdateActionTaskRecord = agreementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return agreementUpdateActionRequest
  **/

  public String getAgreementUpdateActionRequest() {
    return agreementUpdateActionRequest;
  }

  public void setAgreementUpdateActionRequest(String agreementUpdateActionRequest) {
    this.agreementUpdateActionRequest = agreementUpdateActionRequest;
  }


}

