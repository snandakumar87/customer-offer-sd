package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUnderwritingRetrieveInputModelUnderwritingInstanceAnalysis;
import org.bian.dto.BQUnderwritingRetrieveInputModelUnderwritingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQUnderwritingRetrieveInputModel
 */
public class BQUnderwritingRetrieveInputModel   {
  private Object underwritingRetrieveActionTaskRecord = null;

  private String underwritingRetrieveActionRequest = null;

  private BQUnderwritingRetrieveInputModelUnderwritingInstanceReport underwritingInstanceReport = null;

  private BQUnderwritingRetrieveInputModelUnderwritingInstanceAnalysis underwritingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return underwritingRetrieveActionTaskRecord
  **/

  public Object getUnderwritingRetrieveActionTaskRecord() {
    return underwritingRetrieveActionTaskRecord;
  }

  public void setUnderwritingRetrieveActionTaskRecord(Object underwritingRetrieveActionTaskRecord) {
    this.underwritingRetrieveActionTaskRecord = underwritingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return underwritingRetrieveActionRequest
  **/

  public String getUnderwritingRetrieveActionRequest() {
    return underwritingRetrieveActionRequest;
  }

  public void setUnderwritingRetrieveActionRequest(String underwritingRetrieveActionRequest) {
    this.underwritingRetrieveActionRequest = underwritingRetrieveActionRequest;
  }


  /**
   * Get underwritingInstanceReport
   * @return underwritingInstanceReport
  **/

  public BQUnderwritingRetrieveInputModelUnderwritingInstanceReport getUnderwritingInstanceReport() {
    return underwritingInstanceReport;
  }

  public void setUnderwritingInstanceReport(BQUnderwritingRetrieveInputModelUnderwritingInstanceReport underwritingInstanceReport) {
    this.underwritingInstanceReport = underwritingInstanceReport;
  }


  /**
   * Get underwritingInstanceAnalysis
   * @return underwritingInstanceAnalysis
  **/

  public BQUnderwritingRetrieveInputModelUnderwritingInstanceAnalysis getUnderwritingInstanceAnalysis() {
    return underwritingInstanceAnalysis;
  }

  public void setUnderwritingInstanceAnalysis(BQUnderwritingRetrieveInputModelUnderwritingInstanceAnalysis underwritingInstanceAnalysis) {
    this.underwritingInstanceAnalysis = underwritingInstanceAnalysis;
  }


}

