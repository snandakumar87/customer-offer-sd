package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBookingRetrieveInputModelBookingInstanceAnalysis
 */
public class BQBookingRetrieveInputModelBookingInstanceAnalysis   {
  private String bookingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return bookingInstanceAnalysisReference
  **/

  public String getBookingInstanceAnalysisReference() {
    return bookingInstanceAnalysisReference;
  }

  public void setBookingInstanceAnalysisReference(String bookingInstanceAnalysisReference) {
    this.bookingInstanceAnalysisReference = bookingInstanceAnalysisReference;
  }


}

