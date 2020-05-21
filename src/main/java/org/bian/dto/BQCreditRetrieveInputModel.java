package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditRetrieveInputModelCreditInstanceAnalysis;
import org.bian.dto.BQCreditRetrieveInputModelCreditInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCreditRetrieveInputModel
 */
public class BQCreditRetrieveInputModel   {
  private Object creditRetrieveActionTaskRecord = null;

  private String creditRetrieveActionRequest = null;

  private BQCreditRetrieveInputModelCreditInstanceReport creditInstanceReport = null;

  private BQCreditRetrieveInputModelCreditInstanceAnalysis creditInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditRetrieveActionTaskRecord
  **/

  public Object getCreditRetrieveActionTaskRecord() {
    return creditRetrieveActionTaskRecord;
  }

  public void setCreditRetrieveActionTaskRecord(Object creditRetrieveActionTaskRecord) {
    this.creditRetrieveActionTaskRecord = creditRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return creditRetrieveActionRequest
  **/

  public String getCreditRetrieveActionRequest() {
    return creditRetrieveActionRequest;
  }

  public void setCreditRetrieveActionRequest(String creditRetrieveActionRequest) {
    this.creditRetrieveActionRequest = creditRetrieveActionRequest;
  }


  /**
   * Get creditInstanceReport
   * @return creditInstanceReport
  **/

  public BQCreditRetrieveInputModelCreditInstanceReport getCreditInstanceReport() {
    return creditInstanceReport;
  }

  public void setCreditInstanceReport(BQCreditRetrieveInputModelCreditInstanceReport creditInstanceReport) {
    this.creditInstanceReport = creditInstanceReport;
  }


  /**
   * Get creditInstanceAnalysis
   * @return creditInstanceAnalysis
  **/

  public BQCreditRetrieveInputModelCreditInstanceAnalysis getCreditInstanceAnalysis() {
    return creditInstanceAnalysis;
  }

  public void setCreditInstanceAnalysis(BQCreditRetrieveInputModelCreditInstanceAnalysis creditInstanceAnalysis) {
    this.creditInstanceAnalysis = creditInstanceAnalysis;
  }


}

