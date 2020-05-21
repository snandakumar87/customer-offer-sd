package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductRetrieveInputModelProductInstanceAnalysis;
import org.bian.dto.BQProductRetrieveInputModelProductInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductRetrieveInputModel
 */
public class BQProductRetrieveInputModel   {
  private Object productRetrieveActionTaskRecord = null;

  private String productRetrieveActionRequest = null;

  private BQProductRetrieveInputModelProductInstanceReport productInstanceReport = null;

  private BQProductRetrieveInputModelProductInstanceAnalysis productInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productRetrieveActionTaskRecord
  **/

  public Object getProductRetrieveActionTaskRecord() {
    return productRetrieveActionTaskRecord;
  }

  public void setProductRetrieveActionTaskRecord(Object productRetrieveActionTaskRecord) {
    this.productRetrieveActionTaskRecord = productRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productRetrieveActionRequest
  **/

  public String getProductRetrieveActionRequest() {
    return productRetrieveActionRequest;
  }

  public void setProductRetrieveActionRequest(String productRetrieveActionRequest) {
    this.productRetrieveActionRequest = productRetrieveActionRequest;
  }


  /**
   * Get productInstanceReport
   * @return productInstanceReport
  **/

  public BQProductRetrieveInputModelProductInstanceReport getProductInstanceReport() {
    return productInstanceReport;
  }

  public void setProductInstanceReport(BQProductRetrieveInputModelProductInstanceReport productInstanceReport) {
    this.productInstanceReport = productInstanceReport;
  }


  /**
   * Get productInstanceAnalysis
   * @return productInstanceAnalysis
  **/

  public BQProductRetrieveInputModelProductInstanceAnalysis getProductInstanceAnalysis() {
    return productInstanceAnalysis;
  }

  public void setProductInstanceAnalysis(BQProductRetrieveInputModelProductInstanceAnalysis productInstanceAnalysis) {
    this.productInstanceAnalysis = productInstanceAnalysis;
  }


}

