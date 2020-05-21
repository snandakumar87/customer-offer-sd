package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBookingRetrieveOutputModelBookingInstanceReport
 */
public class BQBookingRetrieveOutputModelBookingInstanceReport   {
  private Object bookingInstanceReportRecord = null;

  private String bookingInstanceReportType = null;

  private String bookingInstanceReportParameters = null;

  private Object bookingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return bookingInstanceReportRecord
  **/

  public Object getBookingInstanceReportRecord() {
    return bookingInstanceReportRecord;
  }

  public void setBookingInstanceReportRecord(Object bookingInstanceReportRecord) {
    this.bookingInstanceReportRecord = bookingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return bookingInstanceReportType
  **/

  public String getBookingInstanceReportType() {
    return bookingInstanceReportType;
  }

  public void setBookingInstanceReportType(String bookingInstanceReportType) {
    this.bookingInstanceReportType = bookingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return bookingInstanceReportParameters
  **/

  public String getBookingInstanceReportParameters() {
    return bookingInstanceReportParameters;
  }

  public void setBookingInstanceReportParameters(String bookingInstanceReportParameters) {
    this.bookingInstanceReportParameters = bookingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return bookingInstanceReport
  **/

  public Object getBookingInstanceReport() {
    return bookingInstanceReport;
  }

  public void setBookingInstanceReport(Object bookingInstanceReport) {
    this.bookingInstanceReport = bookingInstanceReport;
  }


}

