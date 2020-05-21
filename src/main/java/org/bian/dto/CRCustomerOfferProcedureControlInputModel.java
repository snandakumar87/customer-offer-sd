package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerOfferProcedureControlInputModelCustomerOfferProcedureControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureControlInputModel
 */
public class CRCustomerOfferProcedureControlInputModel   {
  private String customerOfferServicingSessionReference = null;

  private String customerOfferProcedureInstanceReference = null;

  private Object customerOfferProcedureControlActionTaskRecord = null;

  private CRCustomerOfferProcedureControlInputModelCustomerOfferProcedureControlActionRequest customerOfferProcedureControlActionRequest = null;


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
   * Get customerOfferProcedureControlActionRequest
   * @return customerOfferProcedureControlActionRequest
  **/

  public CRCustomerOfferProcedureControlInputModelCustomerOfferProcedureControlActionRequest getCustomerOfferProcedureControlActionRequest() {
    return customerOfferProcedureControlActionRequest;
  }

  public void setCustomerOfferProcedureControlActionRequest(CRCustomerOfferProcedureControlInputModelCustomerOfferProcedureControlActionRequest customerOfferProcedureControlActionRequest) {
    this.customerOfferProcedureControlActionRequest = customerOfferProcedureControlActionRequest;
  }


}

