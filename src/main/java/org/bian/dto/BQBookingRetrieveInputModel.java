package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBookingRetrieveInputModelBookingInstanceAnalysis;
import org.bian.dto.BQBookingRetrieveInputModelBookingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBookingRetrieveInputModel
 */
public class BQBookingRetrieveInputModel   {
  private Object bookingRetrieveActionTaskRecord = null;

  private String bookingRetrieveActionRequest = null;

  private BQBookingRetrieveInputModelBookingInstanceReport bookingInstanceReport = null;

  private BQBookingRetrieveInputModelBookingInstanceAnalysis bookingInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return bookingRetrieveActionRequest
  **/

  public String getBookingRetrieveActionRequest() {
    return bookingRetrieveActionRequest;
  }

  public void setBookingRetrieveActionRequest(String bookingRetrieveActionRequest) {
    this.bookingRetrieveActionRequest = bookingRetrieveActionRequest;
  }


  /**
   * Get bookingInstanceReport
   * @return bookingInstanceReport
  **/

  public BQBookingRetrieveInputModelBookingInstanceReport getBookingInstanceReport() {
    return bookingInstanceReport;
  }

  public void setBookingInstanceReport(BQBookingRetrieveInputModelBookingInstanceReport bookingInstanceReport) {
    this.bookingInstanceReport = bookingInstanceReport;
  }


  /**
   * Get bookingInstanceAnalysis
   * @return bookingInstanceAnalysis
  **/

  public BQBookingRetrieveInputModelBookingInstanceAnalysis getBookingInstanceAnalysis() {
    return bookingInstanceAnalysis;
  }

  public void setBookingInstanceAnalysis(BQBookingRetrieveInputModelBookingInstanceAnalysis bookingInstanceAnalysis) {
    this.bookingInstanceAnalysis = bookingInstanceAnalysis;
  }


}

