package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureControlOutputModel
 */
public class CRCustomerOfferProcedureControlOutputModel   {
  private String customerOfferProcedureControlActionTaskReference = null;

  private Object customerOfferProcedureControlActionTaskRecord = null;

  private String customerOfferProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Offer Procedure instance control processing service call 
   * @return customerOfferProcedureControlActionTaskReference
  **/

  public String getCustomerOfferProcedureControlActionTaskReference() {
    return customerOfferProcedureControlActionTaskReference;
  }

  public void setCustomerOfferProcedureControlActionTaskReference(String customerOfferProcedureControlActionTaskReference) {
    this.customerOfferProcedureControlActionTaskReference = customerOfferProcedureControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerOfferProcedureControlActionTaskRecord
  **/

  public Object getCustomerOfferProcedureControlActionTaskRecord() {
    return customerOfferProcedureControlActionTaskRecord;
  }

  public void setCustomerOfferProcedureControlActionTaskRecord(Object customerOfferProcedureControlActionTaskRecord) {
    this.customerOfferProcedureControlActionTaskRecord = customerOfferProcedureControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerOfferProcedureControlActionResponse
  **/

  public String getCustomerOfferProcedureControlActionResponse() {
    return customerOfferProcedureControlActionResponse;
  }

  public void setCustomerOfferProcedureControlActionResponse(String customerOfferProcedureControlActionResponse) {
    this.customerOfferProcedureControlActionResponse = customerOfferProcedureControlActionResponse;
  }


}

