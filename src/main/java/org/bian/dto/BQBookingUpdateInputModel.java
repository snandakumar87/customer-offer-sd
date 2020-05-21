package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBookingUpdateInputModelBookingInstanceRecord;
import org.bian.dto.BQBookingUpdateInputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBookingUpdateInputModel
 */
public class BQBookingUpdateInputModel   {
  private BQBookingUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private String customerOfferProcedureInstanceReference = null;

  private String bookingInstanceReference = null;

  private BQBookingUpdateInputModelBookingInstanceRecord bookingInstanceRecord = null;

  private Object bookingUpdateActionTaskRecord = null;

  private String bookingUpdateActionRequest = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQBookingUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQBookingUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Booking instance 
   * @return bookingInstanceReference
  **/

  public String getBookingInstanceReference() {
    return bookingInstanceReference;
  }

  public void setBookingInstanceReference(String bookingInstanceReference) {
    this.bookingInstanceReference = bookingInstanceReference;
  }


  /**
   * Get bookingInstanceRecord
   * @return bookingInstanceRecord
  **/

  public BQBookingUpdateInputModelBookingInstanceRecord getBookingInstanceRecord() {
    return bookingInstanceRecord;
  }

  public void setBookingInstanceRecord(BQBookingUpdateInputModelBookingInstanceRecord bookingInstanceRecord) {
    this.bookingInstanceRecord = bookingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return bookingUpdateActionTaskRecord
  **/

  public Object getBookingUpdateActionTaskRecord() {
    return bookingUpdateActionTaskRecord;
  }

  public void setBookingUpdateActionTaskRecord(Object bookingUpdateActionTaskRecord) {
    this.bookingUpdateActionTaskRecord = bookingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return bookingUpdateActionRequest
  **/

  public String getBookingUpdateActionRequest() {
    return bookingUpdateActionRequest;
  }

  public void setBookingUpdateActionRequest(String bookingUpdateActionRequest) {
    this.bookingUpdateActionRequest = bookingUpdateActionRequest;
  }


}

