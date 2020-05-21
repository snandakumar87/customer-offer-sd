package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBookingRetrieveOutputModelBookingInstanceAnalysis;
import org.bian.dto.BQBookingRetrieveOutputModelBookingInstanceRecord;
import org.bian.dto.BQBookingRetrieveOutputModelBookingInstanceReport;
import org.bian.dto.BQBookingRetrieveOutputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBookingRetrieveOutputModel
 */
public class BQBookingRetrieveOutputModel   {
  private BQBookingRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQBookingRetrieveOutputModelBookingInstanceRecord bookingInstanceRecord = null;

  private String bookingRetrieveActionTaskReference = null;

  private Object bookingRetrieveActionTaskRecord = null;

  private String bookingRetrieveActionResponse = null;

  private BQBookingRetrieveOutputModelBookingInstanceReport bookingInstanceReport = null;

  private BQBookingRetrieveOutputModelBookingInstanceAnalysis bookingInstanceAnalysis = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQBookingRetrieveOutputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQBookingRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * Get bookingInstanceRecord
   * @return bookingInstanceRecord
  **/

  public BQBookingRetrieveOutputModelBookingInstanceRecord getBookingInstanceRecord() {
    return bookingInstanceRecord;
  }

  public void setBookingInstanceRecord(BQBookingRetrieveOutputModelBookingInstanceRecord bookingInstanceRecord) {
    this.bookingInstanceRecord = bookingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Booking instance retrieve service call 
   * @return bookingRetrieveActionTaskReference
  **/

  public String getBookingRetrieveActionTaskReference() {
    return bookingRetrieveActionTaskReference;
  }

  public void setBookingRetrieveActionTaskReference(String bookingRetrieveActionTaskReference) {
    this.bookingRetrieveActionTaskReference = bookingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return bookingRetrieveActionTaskRecord
  **/

  public Object getBookingRetrieveActionTaskRecord() {
    return bookingRetrieveActionTaskRecord;
  }

  public void setBookingRetrieveActionTaskRecord(Object bookingRetrieveActionTaskRecord) {
    this.bookingRetrieveActionTaskRecord = bookingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return bookingRetrieveActionResponse
  **/

  public String getBookingRetrieveActionResponse() {
    return bookingRetrieveActionResponse;
  }

  public void setBookingRetrieveActionResponse(String bookingRetrieveActionResponse) {
    this.bookingRetrieveActionResponse = bookingRetrieveActionResponse;
  }


  /**
   * Get bookingInstanceReport
   * @return bookingInstanceReport
  **/

  public BQBookingRetrieveOutputModelBookingInstanceReport getBookingInstanceReport() {
    return bookingInstanceReport;
  }

  public void setBookingInstanceReport(BQBookingRetrieveOutputModelBookingInstanceReport bookingInstanceReport) {
    this.bookingInstanceReport = bookingInstanceReport;
  }


  /**
   * Get bookingInstanceAnalysis
   * @return bookingInstanceAnalysis
  **/

  public BQBookingRetrieveOutputModelBookingInstanceAnalysis getBookingInstanceAnalysis() {
    return bookingInstanceAnalysis;
  }

  public void setBookingInstanceAnalysis(BQBookingRetrieveOutputModelBookingInstanceAnalysis bookingInstanceAnalysis) {
    this.bookingInstanceAnalysis = bookingInstanceAnalysis;
  }


}

