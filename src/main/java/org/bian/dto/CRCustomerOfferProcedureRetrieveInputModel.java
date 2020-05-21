package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceAnalysis;
import org.bian.dto.CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureRetrieveInputModel
 */
public class CRCustomerOfferProcedureRetrieveInputModel   {
  private Object customerOfferProcedureRetrieveActionTaskRecord = null;

  private String customerOfferProcedureRetrieveActionRequest = null;

  private CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceReportRecord customerOfferProcedureInstanceReportRecord = null;

  private CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceAnalysis customerOfferProcedureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerOfferProcedureRetrieveActionTaskRecord
  **/

  public Object getCustomerOfferProcedureRetrieveActionTaskRecord() {
    return customerOfferProcedureRetrieveActionTaskRecord;
  }

  public void setCustomerOfferProcedureRetrieveActionTaskRecord(Object customerOfferProcedureRetrieveActionTaskRecord) {
    this.customerOfferProcedureRetrieveActionTaskRecord = customerOfferProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerOfferProcedureRetrieveActionRequest
  **/

  public String getCustomerOfferProcedureRetrieveActionRequest() {
    return customerOfferProcedureRetrieveActionRequest;
  }

  public void setCustomerOfferProcedureRetrieveActionRequest(String customerOfferProcedureRetrieveActionRequest) {
    this.customerOfferProcedureRetrieveActionRequest = customerOfferProcedureRetrieveActionRequest;
  }


  /**
   * Get customerOfferProcedureInstanceReportRecord
   * @return customerOfferProcedureInstanceReportRecord
  **/

  public CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceReportRecord getCustomerOfferProcedureInstanceReportRecord() {
    return customerOfferProcedureInstanceReportRecord;
  }

  public void setCustomerOfferProcedureInstanceReportRecord(CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceReportRecord customerOfferProcedureInstanceReportRecord) {
    this.customerOfferProcedureInstanceReportRecord = customerOfferProcedureInstanceReportRecord;
  }


  /**
   * Get customerOfferProcedureInstanceAnalysis
   * @return customerOfferProcedureInstanceAnalysis
  **/

  public CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceAnalysis getCustomerOfferProcedureInstanceAnalysis() {
    return customerOfferProcedureInstanceAnalysis;
  }

  public void setCustomerOfferProcedureInstanceAnalysis(CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceAnalysis customerOfferProcedureInstanceAnalysis) {
    this.customerOfferProcedureInstanceAnalysis = customerOfferProcedureInstanceAnalysis;
  }


}

