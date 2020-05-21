package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAgreementRetrieveInputModelAgreementInstanceAnalysis;
import org.bian.dto.BQAgreementRetrieveInputModelAgreementInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAgreementRetrieveInputModel
 */
public class BQAgreementRetrieveInputModel   {
  private Object agreementRetrieveActionTaskRecord = null;

  private String agreementRetrieveActionRequest = null;

  private BQAgreementRetrieveInputModelAgreementInstanceReport agreementInstanceReport = null;

  private BQAgreementRetrieveInputModelAgreementInstanceAnalysis agreementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return agreementRetrieveActionTaskRecord
  **/

  public Object getAgreementRetrieveActionTaskRecord() {
    return agreementRetrieveActionTaskRecord;
  }

  public void setAgreementRetrieveActionTaskRecord(Object agreementRetrieveActionTaskRecord) {
    this.agreementRetrieveActionTaskRecord = agreementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return agreementRetrieveActionRequest
  **/

  public String getAgreementRetrieveActionRequest() {
    return agreementRetrieveActionRequest;
  }

  public void setAgreementRetrieveActionRequest(String agreementRetrieveActionRequest) {
    this.agreementRetrieveActionRequest = agreementRetrieveActionRequest;
  }


  /**
   * Get agreementInstanceReport
   * @return agreementInstanceReport
  **/

  public BQAgreementRetrieveInputModelAgreementInstanceReport getAgreementInstanceReport() {
    return agreementInstanceReport;
  }

  public void setAgreementInstanceReport(BQAgreementRetrieveInputModelAgreementInstanceReport agreementInstanceReport) {
    this.agreementInstanceReport = agreementInstanceReport;
  }


  /**
   * Get agreementInstanceAnalysis
   * @return agreementInstanceAnalysis
  **/

  public BQAgreementRetrieveInputModelAgreementInstanceAnalysis getAgreementInstanceAnalysis() {
    return agreementInstanceAnalysis;
  }

  public void setAgreementInstanceAnalysis(BQAgreementRetrieveInputModelAgreementInstanceAnalysis agreementInstanceAnalysis) {
    this.agreementInstanceAnalysis = agreementInstanceAnalysis;
  }


}

