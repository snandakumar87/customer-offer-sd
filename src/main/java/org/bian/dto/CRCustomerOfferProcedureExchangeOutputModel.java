package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureExchangeOutputModel
 */
public class CRCustomerOfferProcedureExchangeOutputModel   {
  private String customerOfferProcedureExchangeActionTaskReference = null;

  private Object customerOfferProcedureExchangeActionTaskRecord = null;

  private String customerOfferProcedureExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Offer Procedure instance exchange service call 
   * @return customerOfferProcedureExchangeActionTaskReference
  **/

  public String getCustomerOfferProcedureExchangeActionTaskReference() {
    return customerOfferProcedureExchangeActionTaskReference;
  }

  public void setCustomerOfferProcedureExchangeActionTaskReference(String customerOfferProcedureExchangeActionTaskReference) {
    this.customerOfferProcedureExchangeActionTaskReference = customerOfferProcedureExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerOfferProcedureExchangeActionResponse
  **/

  public String getCustomerOfferProcedureExchangeActionResponse() {
    return customerOfferProcedureExchangeActionResponse;
  }

  public void setCustomerOfferProcedureExchangeActionResponse(String customerOfferProcedureExchangeActionResponse) {
    this.customerOfferProcedureExchangeActionResponse = customerOfferProcedureExchangeActionResponse;
  }


}

