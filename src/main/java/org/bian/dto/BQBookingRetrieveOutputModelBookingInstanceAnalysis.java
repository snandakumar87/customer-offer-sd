package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBookingRetrieveOutputModelBookingInstanceAnalysis
 */
public class BQBookingRetrieveOutputModelBookingInstanceAnalysis   {
  private Object bookingInstanceAnalysisRecord = null;

  private String bookingInstanceAnalysisReportType = null;

  private String bookingInstanceAnalysisParameters = null;

  private Object bookingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return bookingInstanceAnalysisRecord
  **/

  public Object getBookingInstanceAnalysisRecord() {
    return bookingInstanceAnalysisRecord;
  }

  public void setBookingInstanceAnalysisRecord(Object bookingInstanceAnalysisRecord) {
    this.bookingInstanceAnalysisRecord = bookingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return bookingInstanceAnalysisReportType
  **/

  public String getBookingInstanceAnalysisReportType() {
    return bookingInstanceAnalysisReportType;
  }

  public void setBookingInstanceAnalysisReportType(String bookingInstanceAnalysisReportType) {
    this.bookingInstanceAnalysisReportType = bookingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return bookingInstanceAnalysisParameters
  **/

  public String getBookingInstanceAnalysisParameters() {
    return bookingInstanceAnalysisParameters;
  }

  public void setBookingInstanceAnalysisParameters(String bookingInstanceAnalysisParameters) {
    this.bookingInstanceAnalysisParameters = bookingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return bookingInstanceAnalysisReport
  **/

  public Object getBookingInstanceAnalysisReport() {
    return bookingInstanceAnalysisReport;
  }

  public void setBookingInstanceAnalysisReport(Object bookingInstanceAnalysisReport) {
    this.bookingInstanceAnalysisReport = bookingInstanceAnalysisReport;
  }


}

