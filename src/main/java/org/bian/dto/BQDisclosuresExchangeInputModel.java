package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQDisclosuresExchangeInputModel
 */
public class BQDisclosuresExchangeInputModel   {
  private String customerOfferProcedureInstanceReference = null;

  private String disclosuresInstanceReference = null;

  private Object disclosuresExchangeActionTaskRecord = null;

  private CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest disclosuresExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Disclosures instance 
   * @return disclosuresInstanceReference
  **/

  public String getDisclosuresInstanceReference() {
    return disclosuresInstanceReference;
  }

  public void setDisclosuresInstanceReference(String disclosuresInstanceReference) {
    this.disclosuresInstanceReference = disclosuresInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return disclosuresExchangeActionTaskRecord
  **/

  public Object getDisclosuresExchangeActionTaskRecord() {
    return disclosuresExchangeActionTaskRecord;
  }

  public void setDisclosuresExchangeActionTaskRecord(Object disclosuresExchangeActionTaskRecord) {
    this.disclosuresExchangeActionTaskRecord = disclosuresExchangeActionTaskRecord;
  }


  /**
   * Get disclosuresExchangeActionRequest
   * @return disclosuresExchangeActionRequest
  **/

  public CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest getDisclosuresExchangeActionRequest() {
    return disclosuresExchangeActionRequest;
  }

  public void setDisclosuresExchangeActionRequest(CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest disclosuresExchangeActionRequest) {
    this.disclosuresExchangeActionRequest = disclosuresExchangeActionRequest;
  }


}

