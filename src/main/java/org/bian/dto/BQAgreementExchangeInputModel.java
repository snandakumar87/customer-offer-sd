package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQAgreementExchangeInputModel
 */
public class BQAgreementExchangeInputModel   {
  private String customerOfferProcedureInstanceReference = null;

  private String agreementInstanceReference = null;

  private Object agreementExchangeActionTaskRecord = null;

  private CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest agreementExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return agreementExchangeActionTaskRecord
  **/

  public Object getAgreementExchangeActionTaskRecord() {
    return agreementExchangeActionTaskRecord;
  }

  public void setAgreementExchangeActionTaskRecord(Object agreementExchangeActionTaskRecord) {
    this.agreementExchangeActionTaskRecord = agreementExchangeActionTaskRecord;
  }


  /**
   * Get agreementExchangeActionRequest
   * @return agreementExchangeActionRequest
  **/

  public CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest getAgreementExchangeActionRequest() {
    return agreementExchangeActionRequest;
  }

  public void setAgreementExchangeActionRequest(CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest agreementExchangeActionRequest) {
    this.agreementExchangeActionRequest = agreementExchangeActionRequest;
  }


}

