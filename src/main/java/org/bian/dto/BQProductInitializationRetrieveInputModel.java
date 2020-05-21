package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductInitializationRetrieveInputModelProductInitializationInstanceAnalysis;
import org.bian.dto.BQProductInitializationRetrieveInputModelProductInitializationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductInitializationRetrieveInputModel
 */
public class BQProductInitializationRetrieveInputModel   {
  private Object productInitializationRetrieveActionTaskRecord = null;

  private String productInitializationRetrieveActionRequest = null;

  private BQProductInitializationRetrieveInputModelProductInitializationInstanceReport productInitializationInstanceReport = null;

  private BQProductInitializationRetrieveInputModelProductInitializationInstanceAnalysis productInitializationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productInitializationRetrieveActionTaskRecord
  **/

  public Object getProductInitializationRetrieveActionTaskRecord() {
    return productInitializationRetrieveActionTaskRecord;
  }

  public void setProductInitializationRetrieveActionTaskRecord(Object productInitializationRetrieveActionTaskRecord) {
    this.productInitializationRetrieveActionTaskRecord = productInitializationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productInitializationRetrieveActionRequest
  **/

  public String getProductInitializationRetrieveActionRequest() {
    return productInitializationRetrieveActionRequest;
  }

  public void setProductInitializationRetrieveActionRequest(String productInitializationRetrieveActionRequest) {
    this.productInitializationRetrieveActionRequest = productInitializationRetrieveActionRequest;
  }


  /**
   * Get productInitializationInstanceReport
   * @return productInitializationInstanceReport
  **/

  public BQProductInitializationRetrieveInputModelProductInitializationInstanceReport getProductInitializationInstanceReport() {
    return productInitializationInstanceReport;
  }

  public void setProductInitializationInstanceReport(BQProductInitializationRetrieveInputModelProductInitializationInstanceReport productInitializationInstanceReport) {
    this.productInitializationInstanceReport = productInitializationInstanceReport;
  }


  /**
   * Get productInitializationInstanceAnalysis
   * @return productInitializationInstanceAnalysis
  **/

  public BQProductInitializationRetrieveInputModelProductInitializationInstanceAnalysis getProductInitializationInstanceAnalysis() {
    return productInitializationInstanceAnalysis;
  }

  public void setProductInitializationInstanceAnalysis(BQProductInitializationRetrieveInputModelProductInitializationInstanceAnalysis productInitializationInstanceAnalysis) {
    this.productInitializationInstanceAnalysis = productInitializationInstanceAnalysis;
  }


}

