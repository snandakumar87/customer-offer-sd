package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQCollateralExchangeInputModel
 */
public class BQCollateralExchangeInputModel   {
  private String customerOfferProcedureInstanceReference = null;

  private String collateralInstanceReference = null;

  private Object collateralExchangeActionTaskRecord = null;

  private CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest collateralExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Collateral instance 
   * @return collateralInstanceReference
  **/

  public String getCollateralInstanceReference() {
    return collateralInstanceReference;
  }

  public void setCollateralInstanceReference(String collateralInstanceReference) {
    this.collateralInstanceReference = collateralInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return collateralExchangeActionTaskRecord
  **/

  public Object getCollateralExchangeActionTaskRecord() {
    return collateralExchangeActionTaskRecord;
  }

  public void setCollateralExchangeActionTaskRecord(Object collateralExchangeActionTaskRecord) {
    this.collateralExchangeActionTaskRecord = collateralExchangeActionTaskRecord;
  }


  /**
   * Get collateralExchangeActionRequest
   * @return collateralExchangeActionRequest
  **/

  public CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest getCollateralExchangeActionRequest() {
    return collateralExchangeActionRequest;
  }

  public void setCollateralExchangeActionRequest(CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest collateralExchangeActionRequest) {
    this.collateralExchangeActionRequest = collateralExchangeActionRequest;
  }


}

