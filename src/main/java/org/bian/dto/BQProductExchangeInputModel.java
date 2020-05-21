package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQProductExchangeInputModel
 */
public class BQProductExchangeInputModel   {
  private String customerOfferProcedureInstanceReference = null;

  private String productInstanceReference = null;

  private Object productExchangeActionTaskRecord = null;

  private CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest productExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return productExchangeActionTaskRecord
  **/

  public Object getProductExchangeActionTaskRecord() {
    return productExchangeActionTaskRecord;
  }

  public void setProductExchangeActionTaskRecord(Object productExchangeActionTaskRecord) {
    this.productExchangeActionTaskRecord = productExchangeActionTaskRecord;
  }


  /**
   * Get productExchangeActionRequest
   * @return productExchangeActionRequest
  **/

  public CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest getProductExchangeActionRequest() {
    return productExchangeActionRequest;
  }

  public void setProductExchangeActionRequest(CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest productExchangeActionRequest) {
    this.productExchangeActionRequest = productExchangeActionRequest;
  }


}

