package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditUpdateInputModelCreditInstanceRecord;
import org.bian.dto.BQCreditUpdateInputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCreditUpdateInputModel
 */
public class BQCreditUpdateInputModel   {
  private BQCreditUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private String customerOfferProcedureInstanceReference = null;

  private String creditInstanceReference = null;

  private BQCreditUpdateInputModelCreditInstanceRecord creditInstanceRecord = null;

  private Object creditUpdateActionTaskRecord = null;

  private String creditUpdateActionRequest = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQCreditUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQCreditUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Credit instance 
   * @return creditInstanceReference
  **/

  public String getCreditInstanceReference() {
    return creditInstanceReference;
  }

  public void setCreditInstanceReference(String creditInstanceReference) {
    this.creditInstanceReference = creditInstanceReference;
  }


  /**
   * Get creditInstanceRecord
   * @return creditInstanceRecord
  **/

  public BQCreditUpdateInputModelCreditInstanceRecord getCreditInstanceRecord() {
    return creditInstanceRecord;
  }

  public void setCreditInstanceRecord(BQCreditUpdateInputModelCreditInstanceRecord creditInstanceRecord) {
    this.creditInstanceRecord = creditInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return creditUpdateActionTaskRecord
  **/

  public Object getCreditUpdateActionTaskRecord() {
    return creditUpdateActionTaskRecord;
  }

  public void setCreditUpdateActionTaskRecord(Object creditUpdateActionTaskRecord) {
    this.creditUpdateActionTaskRecord = creditUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return creditUpdateActionRequest
  **/

  public String getCreditUpdateActionRequest() {
    return creditUpdateActionRequest;
  }

  public void setCreditUpdateActionRequest(String creditUpdateActionRequest) {
    this.creditUpdateActionRequest = creditUpdateActionRequest;
  }


}

