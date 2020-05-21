package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBookingRetrieveInputModelBookingInstanceReport
 */
public class BQBookingRetrieveInputModelBookingInstanceReport   {
  private String bookingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return bookingInstanceReportReference
  **/

  public String getBookingInstanceReportReference() {
    return bookingInstanceReportReference;
  }

  public void setBookingInstanceReportReference(String bookingInstanceReportReference) {
    this.bookingInstanceReportReference = bookingInstanceReportReference;
  }


}

