package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBookingUpdateInputModelBookingInstanceRecord;
import org.bian.dto.BQBookingUpdateInputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBookingUpdateOutputModel
 */
public class BQBookingUpdateOutputModel   {
  private BQBookingUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQBookingUpdateInputModelBookingInstanceRecord bookingInstanceRecord = null;

  private String bookingUpdateActionTaskReference = null;

  private Object bookingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return bookingUpdateActionTaskReference
  **/

  public String getBookingUpdateActionTaskReference() {
    return bookingUpdateActionTaskReference;
  }

  public void setBookingUpdateActionTaskReference(String bookingUpdateActionTaskReference) {
    this.bookingUpdateActionTaskReference = bookingUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

