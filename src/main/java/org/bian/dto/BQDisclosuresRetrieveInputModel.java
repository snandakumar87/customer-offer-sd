package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDisclosuresRetrieveInputModelDisclosuresInstanceAnalysis;
import org.bian.dto.BQDisclosuresRetrieveInputModelDisclosuresInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDisclosuresRetrieveInputModel
 */
public class BQDisclosuresRetrieveInputModel   {
  private Object disclosuresRetrieveActionTaskRecord = null;

  private String disclosuresRetrieveActionRequest = null;

  private BQDisclosuresRetrieveInputModelDisclosuresInstanceReport disclosuresInstanceReport = null;

  private BQDisclosuresRetrieveInputModelDisclosuresInstanceAnalysis disclosuresInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return disclosuresRetrieveActionTaskRecord
  **/

  public Object getDisclosuresRetrieveActionTaskRecord() {
    return disclosuresRetrieveActionTaskRecord;
  }

  public void setDisclosuresRetrieveActionTaskRecord(Object disclosuresRetrieveActionTaskRecord) {
    this.disclosuresRetrieveActionTaskRecord = disclosuresRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return disclosuresRetrieveActionRequest
  **/

  public String getDisclosuresRetrieveActionRequest() {
    return disclosuresRetrieveActionRequest;
  }

  public void setDisclosuresRetrieveActionRequest(String disclosuresRetrieveActionRequest) {
    this.disclosuresRetrieveActionRequest = disclosuresRetrieveActionRequest;
  }


  /**
   * Get disclosuresInstanceReport
   * @return disclosuresInstanceReport
  **/

  public BQDisclosuresRetrieveInputModelDisclosuresInstanceReport getDisclosuresInstanceReport() {
    return disclosuresInstanceReport;
  }

  public void setDisclosuresInstanceReport(BQDisclosuresRetrieveInputModelDisclosuresInstanceReport disclosuresInstanceReport) {
    this.disclosuresInstanceReport = disclosuresInstanceReport;
  }


  /**
   * Get disclosuresInstanceAnalysis
   * @return disclosuresInstanceAnalysis
  **/

  public BQDisclosuresRetrieveInputModelDisclosuresInstanceAnalysis getDisclosuresInstanceAnalysis() {
    return disclosuresInstanceAnalysis;
  }

  public void setDisclosuresInstanceAnalysis(BQDisclosuresRetrieveInputModelDisclosuresInstanceAnalysis disclosuresInstanceAnalysis) {
    this.disclosuresInstanceAnalysis = disclosuresInstanceAnalysis;
  }


}

