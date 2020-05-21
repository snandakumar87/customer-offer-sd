package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureExchangeInputModel
 */
public class CRCustomerOfferProcedureExchangeInputModel   {
  private String customerOfferServicingSessionReference = null;

  private String customerOfferProcedureInstanceReference = null;

  private Object customerOfferProcedureExchangeActionTaskRecord = null;

  private CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest customerOfferProcedureExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Offer Procedure instance 
   * @return customerOfferProcedureInstanceReference
  **/

  public String getCustomerOfferProcedureInstanceReference() {
    return customerOfferProcedureInstanceReference;
  }

  public void setCustomerOfferProcedureInstanceReference(String customerOfferProcedureInstanceReference) {
    this.customerOfferProcedureInstanceReference = customerOfferProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerOfferProcedureExchangeActionTaskRecord
  **/

  public Object getCustomerOfferProcedureExchangeActionTaskRecord() {
    return customerOfferProcedureExchangeActionTaskRecord;
  }

  public void setCustomerOfferProcedureExchangeActionTaskRecord(Object customerOfferProcedureExchangeActionTaskRecord) {
    this.customerOfferProcedureExchangeActionTaskRecord = customerOfferProcedureExchangeActionTaskRecord;
  }


  /**
   * Get customerOfferProcedureExchangeActionRequest
   * @return customerOfferProcedureExchangeActionRequest
  **/

  public CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest getCustomerOfferProcedureExchangeActionRequest() {
    return customerOfferProcedureExchangeActionRequest;
  }

  public void setCustomerOfferProcedureExchangeActionRequest(CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest customerOfferProcedureExchangeActionRequest) {
    this.customerOfferProcedureExchangeActionRequest = customerOfferProcedureExchangeActionRequest;
  }


}

